package defpackage;

import java.io.IOException;
import java.io.InputStream;
import vigqyno.C0201;

/* renamed from: p60  reason: default package */
/* compiled from: PooledByteArrayBufferedInputStream */
public class p60 extends InputStream {
    private final InputStream a;
    private final byte[] b;
    private final x60<byte[]> c;
    private int d = 0;
    private int e = 0;
    private boolean f = false;

    public p60(InputStream inputStream, byte[] bArr, x60<byte[]> x60) {
        z50.g(inputStream);
        this.a = inputStream;
        z50.g(bArr);
        this.b = bArr;
        z50.g(x60);
        this.c = x60;
    }

    private boolean a() throws IOException {
        if (this.e < this.d) {
            return true;
        }
        int read = this.a.read(this.b);
        if (read <= 0) {
            return false;
        }
        this.d = read;
        this.e = 0;
        return true;
    }

    private void c() throws IOException {
        if (this.f) {
            throw new IOException(C0201.m82(30551));
        }
    }

    @Override // java.io.InputStream
    public int available() throws IOException {
        z50.i(this.e <= this.d);
        c();
        return (this.d - this.e) + this.a.available();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.io.InputStream
    public void close() throws IOException {
        if (!this.f) {
            this.f = true;
            this.c.a(this.b);
            super.close();
        }
    }

    @Override // java.lang.Object
    public void finalize() throws Throwable {
        if (!this.f) {
            f60.i(C0201.m82(30552), C0201.m82(30553));
            close();
        }
        super.finalize();
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        z50.i(this.e <= this.d);
        c();
        if (!a()) {
            return -1;
        }
        byte[] bArr = this.b;
        int i = this.e;
        this.e = i + 1;
        return bArr[i] & 255;
    }

    @Override // java.io.InputStream
    public long skip(long j) throws IOException {
        z50.i(this.e <= this.d);
        c();
        int i = this.d;
        int i2 = this.e;
        long j2 = (long) (i - i2);
        if (j2 >= j) {
            this.e = (int) (((long) i2) + j);
            return j;
        }
        this.e = i;
        return j2 + this.a.skip(j - j2);
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        z50.i(this.e <= this.d);
        c();
        if (!a()) {
            return -1;
        }
        int min = Math.min(this.d - this.e, i2);
        System.arraycopy(this.b, this.e, bArr, i, min);
        this.e += min;
        return min;
    }
}
