package okhttp3.internal.cache2;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import okhttp3.internal.Util;
import vigqyno.C0201;

public final class Relay {
    private static final long FILE_HEADER_SIZE = 0;
    public static final dy2 PREFIX_CLEAN = dy2.k(C0201.m82(4387));
    public static final dy2 PREFIX_DIRTY = dy2.k(C0201.m82(4388));
    private static final int SOURCE_FILE = 0;
    private static final int SOURCE_UPSTREAM = 0;
    public final ay2 buffer = new ay2();
    public final long bufferMaxSize;
    public boolean complete;
    public RandomAccessFile file;
    private final dy2 metadata;
    public int sourceCount;
    public ty2 upstream;
    public final ay2 upstreamBuffer = new ay2();
    public long upstreamPos;
    public Thread upstreamReader;

    class RelaySource implements ty2 {
        public static final String a = null;
        private FileOperator fileOperator = new FileOperator(Relay.this.file.getChannel());
        private long sourcePos;
        private final uy2 timeout = new uy2();

        static {
            C0201.m83(RelaySource.class, 19);
        }

        public RelaySource() {
        }

        @Override // java.io.Closeable, defpackage.ty2, java.lang.AutoCloseable
        public void close() throws IOException {
            if (this.fileOperator != null) {
                RandomAccessFile randomAccessFile = null;
                this.fileOperator = null;
                synchronized (Relay.this) {
                    Relay relay = Relay.this;
                    relay.sourceCount--;
                    if (Relay.this.sourceCount == 0) {
                        RandomAccessFile randomAccessFile2 = Relay.this.file;
                        Relay.this.file = null;
                        randomAccessFile = randomAccessFile2;
                    }
                }
                if (randomAccessFile != null) {
                    Util.closeQuietly(randomAccessFile);
                }
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:20:0x004a, code lost:
            r5 = 2;
         */
        @Override // defpackage.ty2
        public long read(ay2 ay2, long j) throws IOException {
            long j2;
            char c;
            if (this.fileOperator != null) {
                synchronized (Relay.this) {
                    while (true) {
                        long j3 = this.sourcePos;
                        j2 = Relay.this.upstreamPos;
                        if (j3 != j2) {
                            long Q = j2 - Relay.this.buffer.Q();
                            if (this.sourcePos >= Q) {
                                long min = Math.min(j, j2 - this.sourcePos);
                                Relay.this.buffer.n(ay2, this.sourcePos - Q, min);
                                this.sourcePos += min;
                                return min;
                            }
                        } else if (Relay.this.complete) {
                            return -1;
                        } else {
                            if (Relay.this.upstreamReader != null) {
                                this.timeout.waitUntilNotified(Relay.this);
                            } else {
                                Relay.this.upstreamReader = Thread.currentThread();
                                c = 1;
                            }
                        }
                    }
                    if (c == 2) {
                        long min2 = Math.min(j, j2 - this.sourcePos);
                        this.fileOperator.read(this.sourcePos + 32, ay2, min2);
                        this.sourcePos += min2;
                        return min2;
                    }
                    try {
                        long read = Relay.this.upstream.read(Relay.this.upstreamBuffer, Relay.this.bufferMaxSize);
                        if (read == -1) {
                            Relay.this.commit(j2);
                            synchronized (Relay.this) {
                                Relay.this.upstreamReader = null;
                                Relay.this.notifyAll();
                            }
                            return -1;
                        }
                        long min3 = Math.min(read, j);
                        Relay.this.upstreamBuffer.n(ay2, 0, min3);
                        this.sourcePos += min3;
                        this.fileOperator.write(j2 + 32, Relay.this.upstreamBuffer.clone(), read);
                        synchronized (Relay.this) {
                            Relay.this.buffer.write(Relay.this.upstreamBuffer, read);
                            if (Relay.this.buffer.Q() > Relay.this.bufferMaxSize) {
                                Relay.this.buffer.b(Relay.this.buffer.Q() - Relay.this.bufferMaxSize);
                            }
                            Relay.this.upstreamPos += read;
                        }
                        synchronized (Relay.this) {
                            Relay.this.upstreamReader = null;
                            Relay.this.notifyAll();
                        }
                        return min3;
                    } catch (Throwable th) {
                        synchronized (Relay.this) {
                            Relay.this.upstreamReader = null;
                            Relay.this.notifyAll();
                            throw th;
                        }
                    }
                }
            } else {
                throw new IllegalStateException(a);
            }
        }

        @Override // defpackage.ty2
        public uy2 timeout() {
            return this.timeout;
        }
    }

    static {
        C0201.m83(Relay.class, 472);
    }

    private Relay(RandomAccessFile randomAccessFile, ty2 ty2, long j, dy2 dy2, long j2) {
        this.file = randomAccessFile;
        this.upstream = ty2;
        this.complete = ty2 == null;
        this.upstreamPos = j;
        this.metadata = dy2;
        this.bufferMaxSize = j2;
    }

    public static Relay edit(File file2, ty2 ty2, dy2 dy2, long j) throws IOException {
        RandomAccessFile randomAccessFile = new RandomAccessFile(file2, C0201.m82(4389));
        Relay relay = new Relay(randomAccessFile, ty2, 0, dy2, j);
        randomAccessFile.setLength(0);
        relay.writeHeader(PREFIX_DIRTY, -1, -1);
        return relay;
    }

    public static Relay read(File file2) throws IOException {
        RandomAccessFile randomAccessFile = new RandomAccessFile(file2, C0201.m82(4390));
        FileOperator fileOperator = new FileOperator(randomAccessFile.getChannel());
        ay2 ay2 = new ay2();
        fileOperator.read(0, ay2, 32);
        if (ay2.q((long) PREFIX_CLEAN.A()).equals(PREFIX_CLEAN)) {
            long readLong = ay2.readLong();
            long readLong2 = ay2.readLong();
            ay2 ay22 = new ay2();
            fileOperator.read(readLong + 32, ay22, readLong2);
            return new Relay(randomAccessFile, null, readLong, ay22.D(), 0);
        }
        throw new IOException(C0201.m82(4391));
    }

    private void writeHeader(dy2 dy2, long j, long j2) throws IOException {
        ay2 ay2 = new ay2();
        ay2.V(dy2);
        ay2.i0(j);
        ay2.i0(j2);
        if (ay2.Q() == 32) {
            new FileOperator(this.file.getChannel()).write(0, ay2, 32);
            return;
        }
        throw new IllegalArgumentException();
    }

    private void writeMetadata(long j) throws IOException {
        ay2 ay2 = new ay2();
        ay2.V(this.metadata);
        new FileOperator(this.file.getChannel()).write(32 + j, ay2, (long) this.metadata.A());
    }

    public void commit(long j) throws IOException {
        writeMetadata(j);
        this.file.getChannel().force(false);
        writeHeader(PREFIX_CLEAN, j, (long) this.metadata.A());
        this.file.getChannel().force(false);
        synchronized (this) {
            this.complete = true;
        }
        Util.closeQuietly(this.upstream);
        this.upstream = null;
    }

    public boolean isClosed() {
        return this.file == null;
    }

    public dy2 metadata() {
        return this.metadata;
    }

    public ty2 newSource() {
        synchronized (this) {
            if (this.file == null) {
                return null;
            }
            this.sourceCount++;
            return new RelaySource();
        }
    }
}
