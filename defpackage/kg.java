package defpackage;

import android.annotation.TargetApi;
import android.os.Build;
import android.os.StrictMode;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import vigqyno.C0201;

/* renamed from: kg  reason: default package */
/* compiled from: DiskLruCache */
public final class kg implements Closeable {
    private final File a;
    private final File b;
    private final File c;
    private final File d;
    private final int e;
    private long f;
    private final int g;
    private long h = 0;
    private Writer i;
    private final LinkedHashMap<String, d> j = new LinkedHashMap<>(0, 0.75f, true);
    private int k;
    private long l = 0;
    public final ThreadPoolExecutor m = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), new b(null));
    private final Callable<Void> n = new a();

    /* access modifiers changed from: package-private */
    /* renamed from: kg$a */
    /* compiled from: DiskLruCache */
    public class a implements Callable<Void> {
        public a() {
        }

        /* renamed from: a */
        public Void call() throws Exception {
            synchronized (kg.this) {
                if (kg.this.i == null) {
                    return null;
                }
                kg.this.Q();
                if (kg.this.D()) {
                    kg.this.K();
                    kg.this.k = 0;
                }
                return null;
            }
        }
    }

    /* renamed from: kg$b */
    /* compiled from: DiskLruCache */
    private static final class b implements ThreadFactory {
        private b() {
        }

        public synchronized Thread newThread(Runnable runnable) {
            Thread thread;
            thread = new Thread(runnable, C0201.m82(132));
            thread.setPriority(1);
            return thread;
        }

        public /* synthetic */ b(a aVar) {
            this();
        }
    }

    /* renamed from: kg$c */
    /* compiled from: DiskLruCache */
    public final class c {
        private final d a;
        private final boolean[] b;
        private boolean c;

        public /* synthetic */ c(kg kgVar, d dVar, a aVar) {
            this(dVar);
        }

        public void a() throws IOException {
            kg.this.u(this, false);
        }

        public void b() {
            if (!this.c) {
                try {
                    a();
                } catch (IOException unused) {
                }
            }
        }

        public void e() throws IOException {
            kg.this.u(this, true);
            this.c = true;
        }

        public File f(int i) throws IOException {
            File k;
            synchronized (kg.this) {
                if (this.a.f == this) {
                    if (!this.a.e) {
                        this.b[i] = true;
                    }
                    k = this.a.k(i);
                    if (!kg.this.a.exists()) {
                        kg.this.a.mkdirs();
                    }
                } else {
                    throw new IllegalStateException();
                }
            }
            return k;
        }

        private c(d dVar) {
            this.a = dVar;
            this.b = dVar.e ? null : new boolean[kg.this.g];
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: kg$d */
    /* compiled from: DiskLruCache */
    public final class d {
        private final String a;
        private final long[] b;
        public File[] c;
        public File[] d;
        private boolean e;
        private c f;
        private long g;

        public /* synthetic */ d(kg kgVar, String str, a aVar) {
            this(str);
        }

        private IOException m(String[] strArr) throws IOException {
            throw new IOException(C0201.m82(19) + Arrays.toString(strArr));
        }

        /* access modifiers changed from: private */
        /* access modifiers changed from: public */
        private void n(String[] strArr) throws IOException {
            if (strArr.length == kg.this.g) {
                for (int i = 0; i < strArr.length; i++) {
                    try {
                        this.b[i] = Long.parseLong(strArr[i]);
                    } catch (NumberFormatException unused) {
                        m(strArr);
                        throw null;
                    }
                }
                return;
            }
            m(strArr);
            throw null;
        }

        public File j(int i) {
            return this.c[i];
        }

        public File k(int i) {
            return this.d[i];
        }

        public String l() throws IOException {
            StringBuilder sb = new StringBuilder();
            long[] jArr = this.b;
            for (long j : jArr) {
                sb.append(' ');
                sb.append(j);
            }
            return sb.toString();
        }

        private d(String str) {
            this.a = str;
            this.b = new long[kg.this.g];
            this.c = new File[kg.this.g];
            this.d = new File[kg.this.g];
            StringBuilder sb = new StringBuilder(str);
            sb.append('.');
            int length = sb.length();
            for (int i = 0; i < kg.this.g; i++) {
                sb.append(i);
                this.c[i] = new File(kg.this.a, sb.toString());
                sb.append(C0201.m82(18));
                this.d[i] = new File(kg.this.a, sb.toString());
                sb.setLength(length);
            }
        }
    }

    /* renamed from: kg$e */
    /* compiled from: DiskLruCache */
    public final class e {
        private final File[] a;

        public /* synthetic */ e(kg kgVar, String str, long j, File[] fileArr, long[] jArr, a aVar) {
            this(str, j, fileArr, jArr);
        }

        public File a(int i) {
            return this.a[i];
        }

        private e(String str, long j, File[] fileArr, long[] jArr) {
            this.a = fileArr;
        }
    }

    private kg(File file, int i2, int i3, long j2) {
        this.a = file;
        this.e = i2;
        this.b = new File(file, C0201.m82(27185));
        this.c = new File(file, C0201.m82(27186));
        this.d = new File(file, C0201.m82(27187));
        this.g = i3;
        this.f = j2;
    }

    @TargetApi(26)
    private static void A(Writer writer) throws IOException {
        if (Build.VERSION.SDK_INT < 26) {
            writer.flush();
            return;
        }
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitUnbufferedIo().build());
        try {
            writer.flush();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private boolean D() {
        int i2 = this.k;
        return i2 >= 2000 && i2 >= this.j.size();
    }

    public static kg E(File file, int i2, int i3, long j2) throws IOException {
        if (j2 <= 0) {
            throw new IllegalArgumentException(C0201.m82(27194));
        } else if (i3 > 0) {
            File file2 = new File(file, C0201.m82(27188));
            if (file2.exists()) {
                File file3 = new File(file, C0201.m82(27189));
                if (file3.exists()) {
                    file2.delete();
                } else {
                    P(file2, file3, false);
                }
            }
            kg kgVar = new kg(file, i2, i3, j2);
            if (kgVar.b.exists()) {
                try {
                    kgVar.G();
                    kgVar.F();
                    return kgVar;
                } catch (IOException e2) {
                    PrintStream printStream = System.out;
                    printStream.println(C0201.m82(27190) + file + C0201.m82(27191) + e2.getMessage() + C0201.m82(27192));
                    kgVar.w();
                }
            }
            file.mkdirs();
            kg kgVar2 = new kg(file, i2, i3, j2);
            kgVar2.K();
            return kgVar2;
        } else {
            throw new IllegalArgumentException(C0201.m82(27193));
        }
    }

    private void F() throws IOException {
        x(this.c);
        Iterator<d> it = this.j.values().iterator();
        while (it.hasNext()) {
            d next = it.next();
            int i2 = 0;
            if (next.f == null) {
                while (i2 < this.g) {
                    this.h += next.b[i2];
                    i2++;
                }
            } else {
                next.f = null;
                while (i2 < this.g) {
                    x(next.j(i2));
                    x(next.k(i2));
                    i2++;
                }
                it.remove();
            }
        }
    }

    private void G() throws IOException {
        String r0 = C0201.m82(27195);
        lg lgVar = new lg(new FileInputStream(this.b), mg.a);
        try {
            String k2 = lgVar.k();
            String k3 = lgVar.k();
            String k4 = lgVar.k();
            String k5 = lgVar.k();
            String k6 = lgVar.k();
            if (!C0201.m82(27196).equals(k2) || !C0201.m82(27197).equals(k3) || !Integer.toString(this.e).equals(k4) || !Integer.toString(this.g).equals(k5) || !C0201.m82(27198).equals(k6)) {
                throw new IOException(C0201.m82(27199) + k2 + r0 + k3 + r0 + k5 + r0 + k6 + C0201.m82(27200));
            }
            int i2 = 0;
            while (true) {
                try {
                    H(lgVar.k());
                    i2++;
                } catch (EOFException unused) {
                    this.k = i2 - this.j.size();
                    if (lgVar.h()) {
                        K();
                    } else {
                        this.i = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.b, true), mg.a));
                    }
                    return;
                }
            }
        } finally {
            mg.a(lgVar);
        }
    }

    private void H(String str) throws IOException {
        String str2;
        int indexOf = str.indexOf(32);
        String r2 = C0201.m82(27201);
        if (indexOf != -1) {
            int i2 = indexOf + 1;
            int indexOf2 = str.indexOf(32, i2);
            if (indexOf2 == -1) {
                str2 = str.substring(i2);
                if (indexOf == 6 && str.startsWith(C0201.m82(27202))) {
                    this.j.remove(str2);
                    return;
                }
            } else {
                str2 = str.substring(i2, indexOf2);
            }
            d dVar = this.j.get(str2);
            if (dVar == null) {
                dVar = new d(this, str2, null);
                this.j.put(str2, dVar);
            }
            if (indexOf2 != -1 && indexOf == 5 && str.startsWith(C0201.m82(27203))) {
                String[] split = str.substring(indexOf2 + 1).split(C0201.m82(27204));
                dVar.e = true;
                dVar.f = null;
                dVar.n(split);
            } else if (indexOf2 == -1 && indexOf == 5 && str.startsWith(C0201.m82(27205))) {
                dVar.f = new c(this, dVar, null);
            } else if (indexOf2 != -1 || indexOf != 4 || !str.startsWith(C0201.m82(27206))) {
                throw new IOException(r2 + str);
            }
        } else {
            throw new IOException(r2 + str);
        }
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private synchronized void K() throws IOException {
        if (this.i != null) {
            s(this.i);
        }
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.c), mg.a));
        try {
            bufferedWriter.write(C0201.m82(27207));
            bufferedWriter.write(C0201.m82(27208));
            bufferedWriter.write(C0201.m82(27209));
            bufferedWriter.write(C0201.m82(27210));
            bufferedWriter.write(Integer.toString(this.e));
            bufferedWriter.write(C0201.m82(27211));
            bufferedWriter.write(Integer.toString(this.g));
            bufferedWriter.write(C0201.m82(27212));
            bufferedWriter.write(C0201.m82(27213));
            for (d dVar : this.j.values()) {
                if (dVar.f != null) {
                    bufferedWriter.write(C0201.m82(27214) + dVar.a + '\n');
                } else {
                    bufferedWriter.write(C0201.m82(27215) + dVar.a + dVar.l() + '\n');
                }
            }
            s(bufferedWriter);
            if (this.b.exists()) {
                P(this.b, this.d, true);
            }
            P(this.c, this.b, false);
            this.d.delete();
            this.i = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.b, true), mg.a));
        } catch (Throwable th) {
            s(bufferedWriter);
            throw th;
        }
    }

    private static void P(File file, File file2, boolean z) throws IOException {
        if (z) {
            x(file2);
        }
        if (!file.renameTo(file2)) {
            throw new IOException();
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void Q() throws IOException {
        while (this.h > this.f) {
            N(this.j.entrySet().iterator().next().getKey());
        }
    }

    private void r() {
        if (this.i == null) {
            throw new IllegalStateException(C0201.m82(27216));
        }
    }

    @TargetApi(26)
    private static void s(Writer writer) throws IOException {
        if (Build.VERSION.SDK_INT < 26) {
            writer.close();
            return;
        }
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitUnbufferedIo().build());
        try {
            writer.close();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private synchronized void u(c cVar, boolean z) throws IOException {
        d dVar = cVar.a;
        if (dVar.f == cVar) {
            if (z && !dVar.e) {
                for (int i2 = 0; i2 < this.g; i2++) {
                    if (!cVar.b[i2]) {
                        cVar.a();
                        throw new IllegalStateException(C0201.m82(27217) + i2);
                    } else if (!dVar.k(i2).exists()) {
                        cVar.a();
                        return;
                    }
                }
            }
            for (int i3 = 0; i3 < this.g; i3++) {
                File k2 = dVar.k(i3);
                if (!z) {
                    x(k2);
                } else if (k2.exists()) {
                    File j2 = dVar.j(i3);
                    k2.renameTo(j2);
                    long j3 = dVar.b[i3];
                    long length = j2.length();
                    dVar.b[i3] = length;
                    this.h = (this.h - j3) + length;
                }
            }
            this.k++;
            dVar.f = null;
            if (dVar.e || z) {
                dVar.e = true;
                this.i.append((CharSequence) C0201.m82(27218));
                this.i.append(' ');
                this.i.append((CharSequence) dVar.a);
                this.i.append((CharSequence) dVar.l());
                this.i.append('\n');
                if (z) {
                    long j4 = this.l;
                    this.l = 1 + j4;
                    dVar.g = j4;
                }
            } else {
                this.j.remove(dVar.a);
                this.i.append((CharSequence) C0201.m82(27219));
                this.i.append(' ');
                this.i.append((CharSequence) dVar.a);
                this.i.append('\n');
            }
            A(this.i);
            if (this.h > this.f || D()) {
                this.m.submit(this.n);
            }
            return;
        }
        throw new IllegalStateException();
    }

    private static void x(File file) throws IOException {
        if (file.exists() && !file.delete()) {
            throw new IOException();
        }
    }

    private synchronized c z(String str, long j2) throws IOException {
        r();
        d dVar = this.j.get(str);
        if (j2 != -1 && (dVar == null || dVar.g != j2)) {
            return null;
        }
        if (dVar == null) {
            dVar = new d(this, str, null);
            this.j.put(str, dVar);
        } else if (dVar.f != null) {
            return null;
        }
        c cVar = new c(this, dVar, null);
        dVar.f = cVar;
        this.i.append((CharSequence) C0201.m82(27220));
        this.i.append(' ');
        this.i.append((CharSequence) str);
        this.i.append('\n');
        A(this.i);
        return cVar;
    }

    public synchronized e B(String str) throws IOException {
        r();
        d dVar = this.j.get(str);
        if (dVar == null) {
            return null;
        }
        if (!dVar.e) {
            return null;
        }
        for (File file : dVar.c) {
            if (!file.exists()) {
                return null;
            }
        }
        this.k++;
        this.i.append((CharSequence) C0201.m82(27221));
        this.i.append(' ');
        this.i.append((CharSequence) str);
        this.i.append('\n');
        if (D()) {
            this.m.submit(this.n);
        }
        return new e(this, str, dVar.g, dVar.c, dVar.b, null);
    }

    public synchronized boolean N(String str) throws IOException {
        r();
        d dVar = this.j.get(str);
        if (dVar != null) {
            if (dVar.f == null) {
                for (int i2 = 0; i2 < this.g; i2++) {
                    File j2 = dVar.j(i2);
                    if (j2.exists()) {
                        if (!j2.delete()) {
                            throw new IOException(C0201.m82(27222) + j2);
                        }
                    }
                    this.h -= dVar.b[i2];
                    dVar.b[i2] = 0;
                }
                this.k++;
                this.i.append((CharSequence) C0201.m82(27223));
                this.i.append(' ');
                this.i.append((CharSequence) str);
                this.i.append('\n');
                this.j.remove(str);
                if (D()) {
                    this.m.submit(this.n);
                }
                return true;
            }
        }
        return false;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() throws IOException {
        if (this.i != null) {
            Iterator it = new ArrayList(this.j.values()).iterator();
            while (it.hasNext()) {
                d dVar = (d) it.next();
                if (dVar.f != null) {
                    dVar.f.a();
                }
            }
            Q();
            s(this.i);
            this.i = null;
        }
    }

    public void w() throws IOException {
        close();
        mg.b(this.a);
    }

    public c y(String str) throws IOException {
        return z(str, -1);
    }
}
