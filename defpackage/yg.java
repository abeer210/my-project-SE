package defpackage;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import vigqyno.C0201;

/* renamed from: yg  reason: default package */
/* compiled from: ExifOrientationStream */
public final class yg extends FilterInputStream {
    private static final byte[] c;
    private static final int d;
    private static final int e;
    private final byte a;
    private int b;

    static {
        byte[] bArr = {-1, -31, 0, 28, 69, 120, 105, 102, 0, 0, 77, 77, 0, 0, 0, 0, 0, 8, 0, 1, 1, 18, 0, 2, 0, 0, 0, 1, 0};
        c = bArr;
        int length = bArr.length;
        d = length;
        e = length + 2;
    }

    public yg(InputStream inputStream, int i) {
        super(inputStream);
        if (i < -1 || i > 8) {
            throw new IllegalArgumentException(C0201.m82(19771) + i);
        }
        this.a = (byte) i;
    }

    public void mark(int i) {
        throw new UnsupportedOperationException();
    }

    public boolean markSupported() {
        return false;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() throws IOException {
        int i;
        int i2;
        int i3 = this.b;
        if (i3 < 2 || i3 > (i2 = e)) {
            i = super.read();
        } else if (i3 == i2) {
            i = this.a;
        } else {
            i = c[i3 - 2] & 255;
        }
        if (i != -1) {
            this.b++;
        }
        return i;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public void reset() throws IOException {
        throw new UnsupportedOperationException();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public long skip(long j) throws IOException {
        long skip = super.skip(j);
        if (skip > 0) {
            this.b = (int) (((long) this.b) + skip);
        }
        return skip;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        int i3;
        int i4 = this.b;
        int i5 = e;
        if (i4 > i5) {
            i3 = super.read(bArr, i, i2);
        } else if (i4 == i5) {
            bArr[i] = this.a;
            i3 = 1;
        } else if (i4 < 2) {
            i3 = super.read(bArr, i, 2 - i4);
        } else {
            int min = Math.min(i5 - i4, i2);
            System.arraycopy(c, this.b - 2, bArr, i, min);
            i3 = min;
        }
        if (i3 > 0) {
            this.b += i3;
        }
        return i3;
    }
}
