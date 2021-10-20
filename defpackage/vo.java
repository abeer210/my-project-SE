package defpackage;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.concurrent.atomic.AtomicReference;
import vigqyno.C0201;

/* renamed from: vo  reason: default package */
/* compiled from: ByteBufferUtil */
public final class vo {
    private static final AtomicReference<byte[]> a = new AtomicReference<>();

    /* access modifiers changed from: package-private */
    /* renamed from: vo$b */
    /* compiled from: ByteBufferUtil */
    public static final class b {
        public final int a;
        public final int b;
        public final byte[] c;

        public b(byte[] bArr, int i, int i2) {
            this.c = bArr;
            this.a = i;
            this.b = i2;
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(7:6|7|8|(2:10|11)|12|13|14) */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:12:0x0034 */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0058 A[SYNTHETIC, Splitter:B:24:0x0058] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x005f A[SYNTHETIC, Splitter:B:28:0x005f] */
    public static ByteBuffer a(File file) throws IOException {
        Throwable th;
        RandomAccessFile randomAccessFile;
        FileChannel fileChannel = null;
        try {
            long length = file.length();
            if (length > 2147483647L) {
                throw new IOException(C0201.m82(13047));
            } else if (length != 0) {
                randomAccessFile = new RandomAccessFile(file, C0201.m82(13045));
                try {
                    fileChannel = randomAccessFile.getChannel();
                    MappedByteBuffer load = fileChannel.map(FileChannel.MapMode.READ_ONLY, 0, length).load();
                    if (fileChannel != null) {
                        fileChannel.close();
                    }
                    randomAccessFile.close();
                    return load;
                } catch (Throwable th2) {
                    th = th2;
                    if (fileChannel != null) {
                    }
                    if (randomAccessFile != null) {
                    }
                    throw th;
                }
            } else {
                throw new IOException(C0201.m82(13046));
            }
        } catch (Throwable th3) {
            th = th3;
            randomAccessFile = null;
            if (fileChannel != null) {
                try {
                    fileChannel.close();
                } catch (IOException unused) {
                }
            }
            if (randomAccessFile != null) {
                try {
                    randomAccessFile.close();
                } catch (IOException unused2) {
                }
            }
            throw th;
        }
    }

    public static ByteBuffer b(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(16384);
        byte[] andSet = a.getAndSet(null);
        if (andSet == null) {
            andSet = new byte[16384];
        }
        while (true) {
            int read = inputStream.read(andSet);
            if (read >= 0) {
                byteArrayOutputStream.write(andSet, 0, read);
            } else {
                a.set(andSet);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                return (ByteBuffer) ByteBuffer.allocateDirect(byteArray.length).put(byteArray).position(0);
            }
        }
    }

    private static b c(ByteBuffer byteBuffer) {
        if (byteBuffer.isReadOnly() || !byteBuffer.hasArray()) {
            return null;
        }
        return new b(byteBuffer.array(), byteBuffer.arrayOffset(), byteBuffer.limit());
    }

    public static byte[] d(ByteBuffer byteBuffer) {
        b c = c(byteBuffer);
        if (c != null && c.a == 0 && c.b == c.c.length) {
            return byteBuffer.array();
        }
        ByteBuffer asReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
        byte[] bArr = new byte[asReadOnlyBuffer.limit()];
        asReadOnlyBuffer.position(0);
        asReadOnlyBuffer.get(bArr);
        return bArr;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:3|4|(2:6|7)|8|9|23) */
    /* JADX WARNING: Code restructure failed: missing block: B:24:?, code lost:
        return;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x0026 */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0030 A[SYNTHETIC, Splitter:B:15:0x0030] */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0037 A[SYNTHETIC, Splitter:B:19:0x0037] */
    public static void e(ByteBuffer byteBuffer, File file) throws IOException {
        Throwable th;
        RandomAccessFile randomAccessFile;
        byteBuffer.position(0);
        FileChannel fileChannel = null;
        try {
            randomAccessFile = new RandomAccessFile(file, C0201.m82(13048));
            try {
                fileChannel = randomAccessFile.getChannel();
                fileChannel.write(byteBuffer);
                fileChannel.force(false);
                fileChannel.close();
                randomAccessFile.close();
                if (fileChannel != null) {
                    fileChannel.close();
                }
                randomAccessFile.close();
            } catch (Throwable th2) {
                th = th2;
                if (fileChannel != null) {
                    try {
                        fileChannel.close();
                    } catch (IOException unused) {
                    }
                }
                if (randomAccessFile != null) {
                    try {
                        randomAccessFile.close();
                    } catch (IOException unused2) {
                    }
                }
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            randomAccessFile = null;
            if (fileChannel != null) {
            }
            if (randomAccessFile != null) {
            }
            throw th;
        }
    }

    public static InputStream f(ByteBuffer byteBuffer) {
        return new a(byteBuffer);
    }

    /* access modifiers changed from: private */
    /* renamed from: vo$a */
    /* compiled from: ByteBufferUtil */
    public static class a extends InputStream {
        private final ByteBuffer a;
        private int b = -1;

        public a(ByteBuffer byteBuffer) {
            this.a = byteBuffer;
        }

        @Override // java.io.InputStream
        public int available() {
            return this.a.remaining();
        }

        public synchronized void mark(int i) {
            this.b = this.a.position();
        }

        public boolean markSupported() {
            return true;
        }

        @Override // java.io.InputStream
        public int read() {
            if (!this.a.hasRemaining()) {
                return -1;
            }
            return this.a.get() & 255;
        }

        @Override // java.io.InputStream
        public synchronized void reset() throws IOException {
            if (this.b != -1) {
                this.a.position(this.b);
            } else {
                throw new IOException(C0201.m82(23132));
            }
        }

        @Override // java.io.InputStream
        public long skip(long j) throws IOException {
            if (!this.a.hasRemaining()) {
                return -1;
            }
            long min = Math.min(j, (long) available());
            ByteBuffer byteBuffer = this.a;
            byteBuffer.position((int) (((long) byteBuffer.position()) + min));
            return min;
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i, int i2) throws IOException {
            if (!this.a.hasRemaining()) {
                return -1;
            }
            int min = Math.min(i2, available());
            this.a.get(bArr, i, min);
            return min;
        }
    }
}
