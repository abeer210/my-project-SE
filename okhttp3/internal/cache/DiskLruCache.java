package okhttp3.internal.cache;

import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.Flushable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.NoSuchElementException;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import okhttp3.internal.Util;
import okhttp3.internal.io.FileSystem;
import okhttp3.internal.platform.Platform;
import vigqyno.C0201;

public final class DiskLruCache implements Closeable, Flushable {
    public static final /* synthetic */ boolean $assertionsDisabled = false;
    public static final long ANY_SEQUENCE_NUMBER = 0;
    private static final String CLEAN = null;
    private static final String DIRTY = null;
    public static final String JOURNAL_FILE = null;
    public static final String JOURNAL_FILE_BACKUP = null;
    public static final String JOURNAL_FILE_TEMP = null;
    public static final Pattern LEGAL_KEY_PATTERN = Pattern.compile(C0201.m82(25224));
    public static final String MAGIC = null;
    private static final String READ = null;
    private static final String REMOVE = null;
    public static final String VERSION_1 = null;
    private final int appVersion;
    private final Runnable cleanupRunnable = new Runnable() {
        /* class okhttp3.internal.cache.DiskLruCache.AnonymousClass1 */

        public void run() {
            synchronized (DiskLruCache.this) {
                if (!(!DiskLruCache.this.initialized) && !DiskLruCache.this.closed) {
                    try {
                        DiskLruCache.this.trimToSize();
                    } catch (IOException unused) {
                        DiskLruCache.this.mostRecentTrimFailed = true;
                    }
                    try {
                        if (DiskLruCache.this.journalRebuildRequired()) {
                            DiskLruCache.this.rebuildJournal();
                            DiskLruCache.this.redundantOpCount = 0;
                        }
                    } catch (IOException unused2) {
                        DiskLruCache.this.mostRecentRebuildFailed = true;
                        DiskLruCache.this.journalWriter = jy2.c(jy2.b());
                    }
                }
            }
        }
    };
    public boolean closed;
    public final File directory;
    private final Executor executor;
    public final FileSystem fileSystem;
    public boolean hasJournalErrors;
    public boolean initialized;
    private final File journalFile;
    private final File journalFileBackup;
    private final File journalFileTmp;
    public by2 journalWriter;
    public final LinkedHashMap<String, Entry> lruEntries = new LinkedHashMap<>(0, 0.75f, true);
    private long maxSize;
    public boolean mostRecentRebuildFailed;
    public boolean mostRecentTrimFailed;
    private long nextSequenceNumber = 0;
    public int redundantOpCount;
    private long size = 0;
    public final int valueCount;

    public final class Editor {
        private boolean done;
        public final Entry entry;
        public final boolean[] written;

        public Editor(Entry entry2) {
            this.entry = entry2;
            this.written = entry2.readable ? null : new boolean[DiskLruCache.this.valueCount];
        }

        public void abort() throws IOException {
            synchronized (DiskLruCache.this) {
                if (!this.done) {
                    if (this.entry.currentEditor == this) {
                        DiskLruCache.this.completeEdit(this, false);
                    }
                    this.done = true;
                } else {
                    throw new IllegalStateException();
                }
            }
        }

        public void abortUnlessCommitted() {
            synchronized (DiskLruCache.this) {
                if (!this.done && this.entry.currentEditor == this) {
                    try {
                        DiskLruCache.this.completeEdit(this, false);
                    } catch (IOException unused) {
                    }
                }
            }
        }

        public void commit() throws IOException {
            synchronized (DiskLruCache.this) {
                if (!this.done) {
                    if (this.entry.currentEditor == this) {
                        DiskLruCache.this.completeEdit(this, true);
                    }
                    this.done = true;
                } else {
                    throw new IllegalStateException();
                }
            }
        }

        public void detach() {
            if (this.entry.currentEditor == this) {
                int i = 0;
                while (true) {
                    DiskLruCache diskLruCache = DiskLruCache.this;
                    if (i < diskLruCache.valueCount) {
                        try {
                            diskLruCache.fileSystem.delete(this.entry.dirtyFiles[i]);
                        } catch (IOException unused) {
                        }
                        i++;
                    } else {
                        this.entry.currentEditor = null;
                        return;
                    }
                }
            }
        }

        public sy2 newSink(int i) {
            synchronized (DiskLruCache.this) {
                if (this.done) {
                    throw new IllegalStateException();
                } else if (this.entry.currentEditor != this) {
                    return jy2.b();
                } else {
                    if (!this.entry.readable) {
                        this.written[i] = true;
                    }
                    try {
                        return new FaultHidingSink(DiskLruCache.this.fileSystem.sink(this.entry.dirtyFiles[i])) {
                            /* class okhttp3.internal.cache.DiskLruCache.Editor.AnonymousClass1 */

                            @Override // okhttp3.internal.cache.FaultHidingSink
                            public void onException(IOException iOException) {
                                synchronized (DiskLruCache.this) {
                                    Editor.this.detach();
                                }
                            }
                        };
                    } catch (FileNotFoundException unused) {
                        return jy2.b();
                    }
                }
            }
        }

        public ty2 newSource(int i) {
            synchronized (DiskLruCache.this) {
                if (this.done) {
                    throw new IllegalStateException();
                } else if (!this.entry.readable || this.entry.currentEditor != this) {
                    return null;
                } else {
                    try {
                        return DiskLruCache.this.fileSystem.source(this.entry.cleanFiles[i]);
                    } catch (FileNotFoundException unused) {
                        return null;
                    }
                }
            }
        }
    }

    /* access modifiers changed from: private */
    public final class Entry {
        public final File[] cleanFiles;
        public Editor currentEditor;
        public final File[] dirtyFiles;
        public final String key;
        public final long[] lengths;
        public boolean readable;
        public long sequenceNumber;

        public Entry(String str) {
            this.key = str;
            int i = DiskLruCache.this.valueCount;
            this.lengths = new long[i];
            this.cleanFiles = new File[i];
            this.dirtyFiles = new File[i];
            StringBuilder sb = new StringBuilder(str);
            sb.append('.');
            int length = sb.length();
            for (int i2 = 0; i2 < DiskLruCache.this.valueCount; i2++) {
                sb.append(i2);
                this.cleanFiles[i2] = new File(DiskLruCache.this.directory, sb.toString());
                sb.append(C0201.m82(10497));
                this.dirtyFiles[i2] = new File(DiskLruCache.this.directory, sb.toString());
                sb.setLength(length);
            }
        }

        private IOException invalidLengths(String[] strArr) throws IOException {
            throw new IOException(C0201.m82(10498) + Arrays.toString(strArr));
        }

        public void setLengths(String[] strArr) throws IOException {
            if (strArr.length == DiskLruCache.this.valueCount) {
                for (int i = 0; i < strArr.length; i++) {
                    try {
                        this.lengths[i] = Long.parseLong(strArr[i]);
                    } catch (NumberFormatException unused) {
                        throw invalidLengths(strArr);
                    }
                }
                return;
            }
            throw invalidLengths(strArr);
        }

        public Snapshot snapshot() {
            if (Thread.holdsLock(DiskLruCache.this)) {
                ty2[] ty2Arr = new ty2[DiskLruCache.this.valueCount];
                long[] jArr = (long[]) this.lengths.clone();
                int i = 0;
                for (int i2 = 0; i2 < DiskLruCache.this.valueCount; i2++) {
                    try {
                        ty2Arr[i2] = DiskLruCache.this.fileSystem.source(this.cleanFiles[i2]);
                    } catch (FileNotFoundException unused) {
                        while (i < DiskLruCache.this.valueCount && ty2Arr[i] != null) {
                            Util.closeQuietly(ty2Arr[i]);
                            i++;
                        }
                        try {
                            DiskLruCache.this.removeEntry(this);
                            return null;
                        } catch (IOException unused2) {
                            return null;
                        }
                    }
                }
                return new Snapshot(this.key, this.sequenceNumber, ty2Arr, jArr);
            }
            throw new AssertionError();
        }

        public void writeLengths(by2 by2) throws IOException {
            for (long j : this.lengths) {
                by2.O(32).c1(j);
            }
        }
    }

    public final class Snapshot implements Closeable {
        private final String key;
        private final long[] lengths;
        private final long sequenceNumber;
        private final ty2[] sources;

        public Snapshot(String str, long j, ty2[] ty2Arr, long[] jArr) {
            this.key = str;
            this.sequenceNumber = j;
            this.sources = ty2Arr;
            this.lengths = jArr;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            for (ty2 ty2 : this.sources) {
                Util.closeQuietly(ty2);
            }
        }

        public Editor edit() throws IOException {
            return DiskLruCache.this.edit(this.key, this.sequenceNumber);
        }

        public long getLength(int i) {
            return this.lengths[i];
        }

        public ty2 getSource(int i) {
            return this.sources[i];
        }

        public String key() {
            return this.key;
        }
    }

    static {
        C0201.m83(DiskLruCache.class, 371);
    }

    public DiskLruCache(FileSystem fileSystem2, File file, int i, int i2, long j, Executor executor2) {
        this.fileSystem = fileSystem2;
        this.directory = file;
        this.appVersion = i;
        this.journalFile = new File(file, C0201.m82(25225));
        this.journalFileTmp = new File(file, C0201.m82(25226));
        this.journalFileBackup = new File(file, C0201.m82(25227));
        this.valueCount = i2;
        this.maxSize = j;
        this.executor = executor2;
    }

    private synchronized void checkNotClosed() {
        if (isClosed()) {
            throw new IllegalStateException(C0201.m82(25228));
        }
    }

    public static DiskLruCache create(FileSystem fileSystem2, File file, int i, int i2, long j) {
        if (j <= 0) {
            throw new IllegalArgumentException(C0201.m82(25231));
        } else if (i2 > 0) {
            return new DiskLruCache(fileSystem2, file, i, i2, j, new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), Util.threadFactory(C0201.m82(25229), true)));
        } else {
            throw new IllegalArgumentException(C0201.m82(25230));
        }
    }

    private by2 newJournalWriter() throws FileNotFoundException {
        return jy2.c(new FaultHidingSink(this.fileSystem.appendingSink(this.journalFile)) {
            /* class okhttp3.internal.cache.DiskLruCache.AnonymousClass2 */
            public static final /* synthetic */ boolean $assertionsDisabled = false;

            @Override // okhttp3.internal.cache.FaultHidingSink
            public void onException(IOException iOException) {
                DiskLruCache.this.hasJournalErrors = true;
            }
        });
    }

    private void processJournal() throws IOException {
        this.fileSystem.delete(this.journalFileTmp);
        Iterator<Entry> it = this.lruEntries.values().iterator();
        while (it.hasNext()) {
            Entry next = it.next();
            int i = 0;
            if (next.currentEditor == null) {
                while (i < this.valueCount) {
                    this.size += next.lengths[i];
                    i++;
                }
            } else {
                next.currentEditor = null;
                while (i < this.valueCount) {
                    this.fileSystem.delete(next.cleanFiles[i]);
                    this.fileSystem.delete(next.dirtyFiles[i]);
                    i++;
                }
                it.remove();
            }
        }
    }

    private void readJournal() throws IOException {
        String r0 = C0201.m82(25232);
        cy2 d = jy2.d(this.fileSystem.source(this.journalFile));
        try {
            String J0 = d.J0();
            String J02 = d.J0();
            String J03 = d.J0();
            String J04 = d.J0();
            String J05 = d.J0();
            if (!C0201.m82(25233).equals(J0) || !C0201.m82(25234).equals(J02) || !Integer.toString(this.appVersion).equals(J03) || !Integer.toString(this.valueCount).equals(J04) || !C0201.m82(25235).equals(J05)) {
                throw new IOException(C0201.m82(25236) + J0 + r0 + J02 + r0 + J04 + r0 + J05 + C0201.m82(25237));
            }
            int i = 0;
            while (true) {
                try {
                    readJournalLine(d.J0());
                    i++;
                } catch (EOFException unused) {
                    this.redundantOpCount = i - this.lruEntries.size();
                    if (!d.M()) {
                        rebuildJournal();
                    } else {
                        this.journalWriter = newJournalWriter();
                    }
                    return;
                }
            }
        } finally {
            Util.closeQuietly(d);
        }
    }

    private void readJournalLine(String str) throws IOException {
        String str2;
        int indexOf = str.indexOf(32);
        String r2 = C0201.m82(25238);
        if (indexOf != -1) {
            int i = indexOf + 1;
            int indexOf2 = str.indexOf(32, i);
            if (indexOf2 == -1) {
                str2 = str.substring(i);
                if (indexOf == 6 && str.startsWith(C0201.m82(25239))) {
                    this.lruEntries.remove(str2);
                    return;
                }
            } else {
                str2 = str.substring(i, indexOf2);
            }
            Entry entry = this.lruEntries.get(str2);
            if (entry == null) {
                entry = new Entry(str2);
                this.lruEntries.put(str2, entry);
            }
            if (indexOf2 != -1 && indexOf == 5 && str.startsWith(C0201.m82(25240))) {
                String[] split = str.substring(indexOf2 + 1).split(C0201.m82(25241));
                entry.readable = true;
                entry.currentEditor = null;
                entry.setLengths(split);
            } else if (indexOf2 == -1 && indexOf == 5 && str.startsWith(C0201.m82(25242))) {
                entry.currentEditor = new Editor(entry);
            } else if (indexOf2 != -1 || indexOf != 4 || !str.startsWith(C0201.m82(25243))) {
                throw new IOException(r2 + str);
            }
        } else {
            throw new IOException(r2 + str);
        }
    }

    private void validateKey(String str) {
        if (!LEGAL_KEY_PATTERN.matcher(str).matches()) {
            throw new IllegalArgumentException(C0201.m82(25244) + str + C0201.m82(25245));
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() throws IOException {
        if (this.initialized) {
            if (!this.closed) {
                Entry[] entryArr = (Entry[]) this.lruEntries.values().toArray(new Entry[this.lruEntries.size()]);
                for (Entry entry : entryArr) {
                    if (entry.currentEditor != null) {
                        entry.currentEditor.abort();
                    }
                }
                trimToSize();
                this.journalWriter.close();
                this.journalWriter = null;
                this.closed = true;
                return;
            }
        }
        this.closed = true;
    }

    public synchronized void completeEdit(Editor editor, boolean z) throws IOException {
        Entry entry = editor.entry;
        if (entry.currentEditor == editor) {
            if (z && !entry.readable) {
                for (int i = 0; i < this.valueCount; i++) {
                    if (!editor.written[i]) {
                        editor.abort();
                        throw new IllegalStateException(C0201.m82(25246) + i);
                    } else if (!this.fileSystem.exists(entry.dirtyFiles[i])) {
                        editor.abort();
                        return;
                    }
                }
            }
            for (int i2 = 0; i2 < this.valueCount; i2++) {
                File file = entry.dirtyFiles[i2];
                if (!z) {
                    this.fileSystem.delete(file);
                } else if (this.fileSystem.exists(file)) {
                    File file2 = entry.cleanFiles[i2];
                    this.fileSystem.rename(file, file2);
                    long j = entry.lengths[i2];
                    long size2 = this.fileSystem.size(file2);
                    entry.lengths[i2] = size2;
                    this.size = (this.size - j) + size2;
                }
            }
            this.redundantOpCount++;
            entry.currentEditor = null;
            if (entry.readable || z) {
                entry.readable = true;
                this.journalWriter.l0(C0201.m82(25247)).O(32);
                this.journalWriter.l0(entry.key);
                entry.writeLengths(this.journalWriter);
                this.journalWriter.O(10);
                if (z) {
                    long j2 = this.nextSequenceNumber;
                    this.nextSequenceNumber = 1 + j2;
                    entry.sequenceNumber = j2;
                }
            } else {
                this.lruEntries.remove(entry.key);
                this.journalWriter.l0(C0201.m82(25248)).O(32);
                this.journalWriter.l0(entry.key);
                this.journalWriter.O(10);
            }
            this.journalWriter.flush();
            if (this.size > this.maxSize || journalRebuildRequired()) {
                this.executor.execute(this.cleanupRunnable);
            }
            return;
        }
        throw new IllegalStateException();
    }

    public void delete() throws IOException {
        close();
        this.fileSystem.deleteContents(this.directory);
    }

    public Editor edit(String str) throws IOException {
        return edit(str, -1);
    }

    public synchronized void evictAll() throws IOException {
        initialize();
        for (Entry entry : (Entry[]) this.lruEntries.values().toArray(new Entry[this.lruEntries.size()])) {
            removeEntry(entry);
        }
        this.mostRecentTrimFailed = false;
    }

    @Override // java.io.Flushable
    public synchronized void flush() throws IOException {
        if (this.initialized) {
            checkNotClosed();
            trimToSize();
            this.journalWriter.flush();
        }
    }

    public synchronized Snapshot get(String str) throws IOException {
        initialize();
        checkNotClosed();
        validateKey(str);
        Entry entry = this.lruEntries.get(str);
        if (entry != null) {
            if (entry.readable) {
                Snapshot snapshot = entry.snapshot();
                if (snapshot == null) {
                    return null;
                }
                this.redundantOpCount++;
                this.journalWriter.l0(C0201.m82(25250)).O(32).l0(str).O(10);
                if (journalRebuildRequired()) {
                    this.executor.execute(this.cleanupRunnable);
                }
                return snapshot;
            }
        }
        return null;
    }

    public File getDirectory() {
        return this.directory;
    }

    public synchronized long getMaxSize() {
        return this.maxSize;
    }

    public synchronized void initialize() throws IOException {
        if (!this.initialized) {
            if (this.fileSystem.exists(this.journalFileBackup)) {
                if (this.fileSystem.exists(this.journalFile)) {
                    this.fileSystem.delete(this.journalFileBackup);
                } else {
                    this.fileSystem.rename(this.journalFileBackup, this.journalFile);
                }
            }
            if (this.fileSystem.exists(this.journalFile)) {
                try {
                    readJournal();
                    processJournal();
                    this.initialized = true;
                    return;
                } catch (IOException e) {
                    Platform platform = Platform.get();
                    platform.log(5, C0201.m82(25251) + this.directory + C0201.m82(25252) + e.getMessage() + C0201.m82(25253), e);
                    delete();
                    this.closed = false;
                } catch (Throwable th) {
                    this.closed = false;
                    throw th;
                }
            }
            rebuildJournal();
            this.initialized = true;
        }
    }

    public synchronized boolean isClosed() {
        return this.closed;
    }

    public boolean journalRebuildRequired() {
        int i = this.redundantOpCount;
        return i >= 2000 && i >= this.lruEntries.size();
    }

    /* JADX INFO: finally extract failed */
    public synchronized void rebuildJournal() throws IOException {
        if (this.journalWriter != null) {
            this.journalWriter.close();
        }
        by2 c = jy2.c(this.fileSystem.sink(this.journalFileTmp));
        try {
            c.l0(C0201.m82(25254)).O(10);
            c.l0(C0201.m82(25255)).O(10);
            c.c1((long) this.appVersion).O(10);
            c.c1((long) this.valueCount).O(10);
            c.O(10);
            for (Entry entry : this.lruEntries.values()) {
                if (entry.currentEditor != null) {
                    c.l0(C0201.m82(25256)).O(32);
                    c.l0(entry.key);
                    c.O(10);
                } else {
                    c.l0(C0201.m82(25257)).O(32);
                    c.l0(entry.key);
                    entry.writeLengths(c);
                    c.O(10);
                }
            }
            c.close();
            if (this.fileSystem.exists(this.journalFile)) {
                this.fileSystem.rename(this.journalFile, this.journalFileBackup);
            }
            this.fileSystem.rename(this.journalFileTmp, this.journalFile);
            this.fileSystem.delete(this.journalFileBackup);
            this.journalWriter = newJournalWriter();
            this.hasJournalErrors = false;
            this.mostRecentRebuildFailed = false;
        } catch (Throwable th) {
            c.close();
            throw th;
        }
    }

    public synchronized boolean remove(String str) throws IOException {
        initialize();
        checkNotClosed();
        validateKey(str);
        Entry entry = this.lruEntries.get(str);
        if (entry == null) {
            return false;
        }
        boolean removeEntry = removeEntry(entry);
        if (removeEntry && this.size <= this.maxSize) {
            this.mostRecentTrimFailed = false;
        }
        return removeEntry;
    }

    public boolean removeEntry(Entry entry) throws IOException {
        Editor editor = entry.currentEditor;
        if (editor != null) {
            editor.detach();
        }
        for (int i = 0; i < this.valueCount; i++) {
            this.fileSystem.delete(entry.cleanFiles[i]);
            long j = this.size;
            long[] jArr = entry.lengths;
            this.size = j - jArr[i];
            jArr[i] = 0;
        }
        this.redundantOpCount++;
        this.journalWriter.l0(C0201.m82(25258)).O(32).l0(entry.key).O(10);
        this.lruEntries.remove(entry.key);
        if (journalRebuildRequired()) {
            this.executor.execute(this.cleanupRunnable);
        }
        return true;
    }

    public synchronized void setMaxSize(long j) {
        this.maxSize = j;
        if (this.initialized) {
            this.executor.execute(this.cleanupRunnable);
        }
    }

    public synchronized long size() throws IOException {
        initialize();
        return this.size;
    }

    public synchronized Iterator<Snapshot> snapshots() throws IOException {
        initialize();
        return new Iterator<Snapshot>() {
            /* class okhttp3.internal.cache.DiskLruCache.AnonymousClass3 */
            public final Iterator<Entry> delegate = new ArrayList(DiskLruCache.this.lruEntries.values()).iterator();
            public Snapshot nextSnapshot;
            public Snapshot removeSnapshot;

            public boolean hasNext() {
                if (this.nextSnapshot != null) {
                    return true;
                }
                synchronized (DiskLruCache.this) {
                    if (DiskLruCache.this.closed) {
                        return false;
                    }
                    while (this.delegate.hasNext()) {
                        Snapshot snapshot = this.delegate.next().snapshot();
                        if (snapshot != null) {
                            this.nextSnapshot = snapshot;
                            return true;
                        }
                    }
                    return false;
                }
            }

            public void remove() {
                Snapshot snapshot = this.removeSnapshot;
                if (snapshot != null) {
                    try {
                        DiskLruCache.this.remove(snapshot.key);
                    } catch (IOException unused) {
                    } catch (Throwable th) {
                        this.removeSnapshot = null;
                        throw th;
                    }
                    this.removeSnapshot = null;
                    return;
                }
                throw new IllegalStateException(C0201.m82(19249));
            }

            @Override // java.util.Iterator
            public Snapshot next() {
                if (hasNext()) {
                    Snapshot snapshot = this.nextSnapshot;
                    this.removeSnapshot = snapshot;
                    this.nextSnapshot = null;
                    return snapshot;
                }
                throw new NoSuchElementException();
            }
        };
    }

    public void trimToSize() throws IOException {
        while (this.size > this.maxSize) {
            removeEntry(this.lruEntries.values().iterator().next());
        }
        this.mostRecentTrimFailed = false;
    }

    public synchronized Editor edit(String str, long j) throws IOException {
        initialize();
        checkNotClosed();
        validateKey(str);
        Entry entry = this.lruEntries.get(str);
        if (j != -1 && (entry == null || entry.sequenceNumber != j)) {
            return null;
        }
        if (entry != null && entry.currentEditor != null) {
            return null;
        }
        if (this.mostRecentTrimFailed || this.mostRecentRebuildFailed) {
            this.executor.execute(this.cleanupRunnable);
            return null;
        }
        this.journalWriter.l0(C0201.m82(25249)).O(32).l0(str).O(10);
        this.journalWriter.flush();
        if (this.hasJournalErrors) {
            return null;
        }
        if (entry == null) {
            entry = new Entry(str);
            this.lruEntries.put(str, entry);
        }
        Editor editor = new Editor(entry);
        entry.currentEditor = editor;
        return editor;
    }
}
