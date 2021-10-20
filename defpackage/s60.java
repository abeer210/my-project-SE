package defpackage;

import java.io.InputStream;
import vigqyno.C0201;

/* renamed from: s60  reason: default package */
/* compiled from: PooledByteBufferInputStream */
public class s60 extends InputStream {
    public final q60 a;
    public int b = 0;
    public int c = 0;

    public s60(q60 q60) {
        z50.b(!q60.isClosed());
        z50.g(q60);
        this.a = q60;
    }

    @Override // java.io.InputStream
    public int available() {
        return this.a.size() - this.b;
    }

    public void mark(int i) {
        this.c = this.b;
    }

    public boolean markSupported() {
        return true;
    }

    @Override // java.io.InputStream
    public int read() {
        if (available() <= 0) {
            return -1;
        }
        q60 q60 = this.a;
        int i = this.b;
        this.b = i + 1;
        return q60.e(i) & 255;
    }

    @Override // java.io.InputStream
    public void reset() {
        this.b = this.c;
    }

    @Override // java.io.InputStream
    public long skip(long j) {
        z50.b(j >= 0);
        int min = Math.min((int) j, available());
        this.b += min;
        return (long) min;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) {
        if (i < 0 || i2 < 0 || i + i2 > bArr.length) {
            throw new ArrayIndexOutOfBoundsException(C0201.m82(13678) + bArr.length + C0201.m82(13679) + i + C0201.m82(13680) + i2);
        }
        int available = available();
        if (available <= 0) {
            return -1;
        }
        if (i2 <= 0) {
            return 0;
        }
        int min = Math.min(available, i2);
        this.a.f(this.b, bArr, i, min);
        this.b += min;
        return min;
    }
}
