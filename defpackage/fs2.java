package defpackage;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.util.LinkedHashMap;
import java.util.Map;
import vigqyno.C0188;
import vigqyno.C0201;

/* renamed from: fs2  reason: default package */
/* compiled from: RandomAccessBufferedFileInputStream */
public class fs2 extends InputStream implements is2 {
    private int a = 12;
    private int b = (1 << 12);
    private long c = (-1 << 12);
    private int d = C0188.f18;
    private File e;
    private byte[] f = null;
    private final Map<Long, byte[]> g = new a(this.d, 0.75f, true);
    private long h = -1;
    private byte[] i = new byte[this.b];
    private int j = 0;
    private final RandomAccessFile k;
    private final long l;
    private long m = 0;
    private boolean n;

    /* renamed from: fs2$a */
    /* compiled from: RandomAccessBufferedFileInputStream */
    class a extends LinkedHashMap<Long, byte[]> {
        public a(int i, float f, boolean z) {
            super(i, f, z);
        }

        @Override // java.util.LinkedHashMap
        public boolean removeEldestEntry(Map.Entry<Long, byte[]> entry) {
            boolean z = size() > fs2.this.d;
            if (z) {
                fs2.this.f = entry.getValue();
            }
            return z;
        }
    }

    public fs2(File file) throws IOException {
        this.k = new RandomAccessFile(file, C0201.m82(7223));
        this.l = file.length();
        seek(0);
    }

    private void h() {
        File file = this.e;
        if (file != null) {
            file.delete();
        }
    }

    private byte[] k() throws IOException {
        int read;
        byte[] bArr = this.f;
        if (bArr != null) {
            this.f = null;
        } else {
            bArr = new byte[this.b];
        }
        int i2 = 0;
        while (true) {
            int i3 = this.b;
            if (i2 >= i3 || (read = this.k.read(bArr, i2, i3 - i2)) < 0) {
                return bArr;
            }
            i2 += read;
        }
        return bArr;
    }

    @Override // java.io.InputStream
    public int available() throws IOException {
        return (int) Math.min(this.l - this.m, 2147483647L);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.io.InputStream
    public void close() throws IOException {
        this.k.close();
        h();
        this.g.clear();
        this.n = true;
    }

    @Override // defpackage.is2
    public long getPosition() {
        return this.m;
    }

    @Override // defpackage.is2
    public void h0(int i2) throws IOException {
        seek(getPosition() - ((long) i2));
    }

    @Override // defpackage.is2
    public byte[] i(int i2) throws IOException {
        byte[] bArr = new byte[i2];
        int read = read(bArr);
        while (read < i2) {
            read += read(bArr, read, i2 - read);
        }
        return bArr;
    }

    @Override // defpackage.is2
    public boolean isClosed() {
        return this.n;
    }

    @Override // defpackage.is2
    public boolean j() throws IOException {
        return peek() == -1;
    }

    @Override // defpackage.is2
    public long length() throws IOException {
        return this.l;
    }

    @Override // defpackage.is2
    public int peek() throws IOException {
        int read = read();
        if (read != -1) {
            h0(1);
        }
        return read;
    }

    @Override // defpackage.is2, java.io.InputStream
    public int read() throws IOException {
        long j2 = this.m;
        if (j2 >= this.l) {
            return -1;
        }
        if (this.j == this.b) {
            seek(j2);
        }
        this.m++;
        byte[] bArr = this.i;
        int i2 = this.j;
        this.j = i2 + 1;
        return bArr[i2] & 255;
    }

    @Override // defpackage.is2
    public void seek(long j2) throws IOException {
        long j3 = this.c & j2;
        if (j3 != this.h) {
            byte[] bArr = this.g.get(Long.valueOf(j3));
            if (bArr == null) {
                this.k.seek(j3);
                bArr = k();
                this.g.put(Long.valueOf(j3), bArr);
            }
            this.h = j3;
            this.i = bArr;
        }
        this.j = (int) (j2 - this.h);
        this.m = j2;
    }

    @Override // java.io.InputStream
    public long skip(long j2) throws IOException {
        long j3 = this.l;
        long j4 = this.m;
        if (j3 - j4 < j2) {
            j2 = j3 - j4;
        }
        int i2 = this.b;
        if (j2 < ((long) i2)) {
            int i3 = this.j;
            if (((long) i3) + j2 <= ((long) i2)) {
                this.j = (int) (((long) i3) + j2);
                this.m += j2;
                return j2;
            }
        }
        seek(this.m + j2);
        return j2;
    }

    @Override // defpackage.is2, java.io.InputStream
    public int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }

    @Override // defpackage.is2, java.io.InputStream
    public int read(byte[] bArr, int i2, int i3) throws IOException {
        long j2 = this.m;
        if (j2 >= this.l) {
            return -1;
        }
        if (this.j == this.b) {
            seek(j2);
        }
        int min = Math.min(this.b - this.j, i3);
        long j3 = this.l;
        long j4 = this.m;
        if (j3 - j4 < ((long) this.b)) {
            min = Math.min(min, (int) (j3 - j4));
        }
        System.arraycopy(this.i, this.j, bArr, i2, min);
        this.j += min;
        this.m += (long) min;
        return min;
    }
}
