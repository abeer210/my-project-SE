package defpackage;

import java.io.EOFException;
import java.io.IOException;
import vigqyno.C0188;
import vigqyno.C0201;

/* renamed from: ls2  reason: default package */
/* compiled from: ScratchFileBuffer */
public class ls2 implements ds2 {
    private final int a;
    private ks2 b;
    private long c = 0;
    private int d;
    private long e;
    private byte[] f;
    private int g;
    private boolean h = false;
    private int[] i = new int[16];
    private int j = 0;

    public ls2(ks2 ks2) throws IOException {
        ks2.a();
        this.b = ks2;
        this.a = ks2.m();
        a();
    }

    private void a() throws IOException {
        int i2 = this.j + 1;
        int[] iArr = this.i;
        if (i2 >= iArr.length) {
            int length = iArr.length * 2;
            if (length < iArr.length) {
                if (iArr.length != Integer.MAX_VALUE) {
                    length = C0188.f24;
                } else {
                    throw new IOException(C0201.m82(7862));
                }
            }
            int[] iArr2 = new int[length];
            System.arraycopy(this.i, 0, iArr2, 0, this.j);
            this.i = iArr2;
        }
        int k = this.b.k();
        int[] iArr3 = this.i;
        int i3 = this.j;
        iArr3[i3] = k;
        this.d = i3;
        int i4 = this.a;
        this.e = ((long) i3) * ((long) i4);
        this.j = i3 + 1;
        this.f = new byte[i4];
        this.g = 0;
    }

    private void c() throws IOException {
        ks2 ks2 = this.b;
        if (ks2 != null) {
            ks2.a();
            return;
        }
        throw new IOException(C0201.m82(7863));
    }

    private boolean h(boolean z) throws IOException {
        if (this.g >= this.a) {
            if (this.h) {
                this.b.p(this.i[this.d], this.f);
                this.h = false;
            }
            int i2 = this.d;
            if (i2 + 1 < this.j) {
                ks2 ks2 = this.b;
                int[] iArr = this.i;
                int i3 = i2 + 1;
                this.d = i3;
                this.f = ks2.o(iArr[i3]);
                this.e = ((long) this.d) * ((long) this.a);
                this.g = 0;
            } else if (!z) {
                return false;
            } else {
                a();
            }
        }
        return true;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        ks2 ks2 = this.b;
        if (ks2 != null) {
            ks2.n(this.i, 0, this.j);
            this.b = null;
            this.i = null;
            this.f = null;
            this.e = 0;
            this.d = -1;
            this.g = 0;
            this.c = 0;
        }
    }

    @Override // defpackage.is2
    public long getPosition() throws IOException {
        c();
        return this.e + ((long) this.g);
    }

    @Override // defpackage.is2
    public void h0(int i2) throws IOException {
        seek((this.e + ((long) this.g)) - ((long) i2));
    }

    @Override // defpackage.is2
    public byte[] i(int i2) throws IOException {
        byte[] bArr = new byte[i2];
        int i3 = 0;
        do {
            int read = read(bArr, i3, i2 - i3);
            if (read >= 0) {
                i3 += read;
            } else {
                throw new EOFException();
            }
        } while (i3 < i2);
        return bArr;
    }

    @Override // defpackage.is2
    public boolean isClosed() {
        return this.b == null;
    }

    @Override // defpackage.is2
    public boolean j() throws IOException {
        c();
        return this.e + ((long) this.g) >= this.c;
    }

    @Override // defpackage.is2
    public long length() throws IOException {
        return this.c;
    }

    @Override // defpackage.is2
    public int peek() throws IOException {
        int read = read();
        if (read != -1) {
            h0(1);
        }
        return read;
    }

    @Override // defpackage.is2
    public int read() throws IOException {
        c();
        if (this.e + ((long) this.g) >= this.c) {
            return -1;
        }
        if (h(false)) {
            byte[] bArr = this.f;
            int i2 = this.g;
            this.g = i2 + 1;
            return bArr[i2] & 255;
        }
        throw new IOException(C0201.m82(7864));
    }

    @Override // defpackage.is2
    public void seek(long j2) throws IOException {
        c();
        if (j2 > this.c) {
            throw new EOFException();
        } else if (j2 >= 0) {
            long j3 = this.e;
            if (j2 < j3 || j2 > ((long) this.a) + j3) {
                if (this.h) {
                    this.b.p(this.i[this.d], this.f);
                    this.h = false;
                }
                int i2 = (int) (j2 / ((long) this.a));
                this.f = this.b.o(this.i[i2]);
                this.d = i2;
                long j4 = ((long) i2) * ((long) this.a);
                this.e = j4;
                this.g = (int) (j2 - j4);
                return;
            }
            this.g = (int) (j2 - j3);
        } else {
            throw new IOException(C0201.m82(7866) + j2);
        }
    }

    @Override // defpackage.js2
    public void write(int i2) throws IOException {
        c();
        h(true);
        byte[] bArr = this.f;
        int i3 = this.g;
        int i4 = i3 + 1;
        this.g = i4;
        bArr[i3] = (byte) i2;
        this.h = true;
        long j2 = this.e;
        if (((long) i4) + j2 > this.c) {
            this.c = j2 + ((long) i4);
        }
    }

    @Override // defpackage.is2
    public int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }

    @Override // defpackage.is2
    public int read(byte[] bArr, int i2, int i3) throws IOException {
        c();
        long j2 = this.e;
        int i4 = this.g;
        long j3 = this.c;
        if (((long) i4) + j2 >= j3) {
            return -1;
        }
        int min = (int) Math.min((long) i3, j3 - (j2 + ((long) i4)));
        int i5 = 0;
        while (min > 0) {
            if (h(false)) {
                int min2 = Math.min(min, this.a - this.g);
                System.arraycopy(this.f, this.g, bArr, i2, min2);
                this.g += min2;
                i5 += min2;
                i2 += min2;
                min -= min2;
            } else {
                throw new IOException(C0201.m82(7865));
            }
        }
        return i5;
    }

    @Override // defpackage.js2
    public void write(byte[] bArr) throws IOException {
        write(bArr, 0, bArr.length);
    }

    @Override // defpackage.js2
    public void write(byte[] bArr, int i2, int i3) throws IOException {
        c();
        while (i3 > 0) {
            h(true);
            int min = Math.min(i3, this.a - this.g);
            System.arraycopy(bArr, i2, this.f, this.g, min);
            this.g += min;
            this.h = true;
            i2 += min;
            i3 -= min;
        }
        long j2 = this.e;
        int i4 = this.g;
        if (((long) i4) + j2 > this.c) {
            this.c = j2 + ((long) i4);
        }
    }
}
