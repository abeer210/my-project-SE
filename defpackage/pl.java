package defpackage;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import vigqyno.C0201;

/* renamed from: pl  reason: default package */
/* compiled from: RecyclableBufferedInputStream */
public class pl extends FilterInputStream {
    private volatile byte[] a;
    private int b;
    private int c;
    private int d;
    private int e;
    private final ni f;

    /* renamed from: pl$a */
    /* compiled from: RecyclableBufferedInputStream */
    static class a extends IOException {
        public a(String str) {
            super(str);
        }
    }

    public pl(InputStream inputStream, ni niVar) {
        this(inputStream, niVar, 65536);
    }

    private int a(InputStream inputStream, byte[] bArr) throws IOException {
        int i;
        int i2 = this.d;
        if (i2 == -1 || this.e - i2 >= (i = this.c)) {
            int read = inputStream.read(bArr);
            if (read > 0) {
                this.d = -1;
                this.e = 0;
                this.b = read;
            }
            return read;
        }
        if (i2 == 0 && i > bArr.length && this.b == bArr.length) {
            int length = bArr.length * 2;
            if (length <= i) {
                i = length;
            }
            byte[] bArr2 = (byte[]) this.f.e(i, byte[].class);
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
            this.a = bArr2;
            this.f.c(bArr);
            bArr = bArr2;
        } else {
            int i3 = this.d;
            if (i3 > 0) {
                System.arraycopy(bArr, i3, bArr, 0, bArr.length - i3);
            }
        }
        int i4 = this.e - this.d;
        this.e = i4;
        this.d = 0;
        this.b = 0;
        int read2 = inputStream.read(bArr, i4, bArr.length - i4);
        int i5 = this.e;
        if (read2 > 0) {
            i5 += read2;
        }
        this.b = i5;
        return read2;
    }

    private static IOException k() throws IOException {
        throw new IOException(C0201.m82(37290));
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int available() throws IOException {
        InputStream inputStream;
        inputStream = ((FilterInputStream) this).in;
        if (this.a == null || inputStream == null) {
            k();
            throw null;
        }
        return (this.b - this.e) + inputStream.available();
    }

    public synchronized void c() {
        this.c = this.a.length;
    }

    @Override // java.io.FilterInputStream, java.io.Closeable, java.lang.AutoCloseable, java.io.InputStream
    public void close() throws IOException {
        if (this.a != null) {
            this.f.c(this.a);
            this.a = null;
        }
        InputStream inputStream = ((FilterInputStream) this).in;
        ((FilterInputStream) this).in = null;
        if (inputStream != null) {
            inputStream.close();
        }
    }

    public synchronized void h() {
        if (this.a != null) {
            this.f.c(this.a);
            this.a = null;
        }
    }

    public synchronized void mark(int i) {
        this.c = Math.max(this.c, i);
        this.d = this.e;
    }

    public boolean markSupported() {
        return true;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int read() throws IOException {
        byte[] bArr = this.a;
        InputStream inputStream = ((FilterInputStream) this).in;
        if (bArr == null || inputStream == null) {
            k();
            throw null;
        } else if (this.e >= this.b && a(inputStream, bArr) == -1) {
            return -1;
        } else {
            if (bArr != this.a && (bArr = this.a) == null) {
                k();
                throw null;
            } else if (this.b - this.e <= 0) {
                return -1;
            } else {
                int i = this.e;
                this.e = i + 1;
                return bArr[i] & 255;
            }
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void reset() throws IOException {
        if (this.a == null) {
            throw new IOException(C0201.m82(37293));
        } else if (-1 != this.d) {
            this.e = this.d;
        } else {
            throw new a(C0201.m82(37291) + this.e + C0201.m82(37292) + this.c);
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized long skip(long j) throws IOException {
        if (j < 1) {
            return 0;
        }
        byte[] bArr = this.a;
        if (bArr != null) {
            InputStream inputStream = ((FilterInputStream) this).in;
            if (inputStream == null) {
                k();
                throw null;
            } else if (((long) (this.b - this.e)) >= j) {
                this.e = (int) (((long) this.e) + j);
                return j;
            } else {
                long j2 = ((long) this.b) - ((long) this.e);
                this.e = this.b;
                if (this.d == -1 || j > ((long) this.c)) {
                    return j2 + inputStream.skip(j - j2);
                } else if (a(inputStream, bArr) == -1) {
                    return j2;
                } else {
                    if (((long) (this.b - this.e)) >= j - j2) {
                        this.e = (int) ((((long) this.e) + j) - j2);
                        return j;
                    }
                    long j3 = (j2 + ((long) this.b)) - ((long) this.e);
                    this.e = this.b;
                    return j3;
                }
            }
        } else {
            k();
            throw null;
        }
    }

    public pl(InputStream inputStream, ni niVar, int i) {
        super(inputStream);
        this.d = -1;
        this.f = niVar;
        this.a = (byte[]) niVar.e(i, byte[].class);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int read(byte[] bArr, int i, int i2) throws IOException {
        int i3;
        int i4;
        byte[] bArr2 = this.a;
        if (bArr2 == null) {
            k();
            throw null;
        } else if (i2 == 0) {
            return 0;
        } else {
            InputStream inputStream = ((FilterInputStream) this).in;
            if (inputStream != null) {
                if (this.e < this.b) {
                    int i5 = this.b - this.e >= i2 ? i2 : this.b - this.e;
                    System.arraycopy(bArr2, this.e, bArr, i, i5);
                    this.e += i5;
                    if (i5 == i2 || inputStream.available() == 0) {
                        return i5;
                    }
                    i += i5;
                    i3 = i2 - i5;
                } else {
                    i3 = i2;
                }
                while (true) {
                    int i6 = -1;
                    if (this.d == -1 && i3 >= bArr2.length) {
                        i4 = inputStream.read(bArr, i, i3);
                        if (i4 == -1) {
                            if (i3 != i2) {
                                i6 = i2 - i3;
                            }
                            return i6;
                        }
                    } else if (a(inputStream, bArr2) == -1) {
                        if (i3 != i2) {
                            i6 = i2 - i3;
                        }
                        return i6;
                    } else if (bArr2 == this.a || (bArr2 = this.a) != null) {
                        i4 = this.b - this.e >= i3 ? i3 : this.b - this.e;
                        System.arraycopy(bArr2, this.e, bArr, i, i4);
                        this.e += i4;
                    } else {
                        k();
                        throw null;
                    }
                    i3 -= i4;
                    if (i3 == 0) {
                        return i2;
                    }
                    if (inputStream.available() == 0) {
                        return i2 - i3;
                    }
                    i += i4;
                }
            } else {
                k();
                throw null;
            }
        }
    }
}
