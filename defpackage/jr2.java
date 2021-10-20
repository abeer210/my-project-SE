package defpackage;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import vigqyno.C0201;

/* renamed from: jr2  reason: default package */
/* compiled from: ASCII85InputStream */
public final class jr2 extends FilterInputStream {
    private int a = 0;
    private int b = 0;
    private boolean c = false;
    private byte[] d = new byte[5];
    private byte[] e = new byte[4];

    public jr2(InputStream inputStream) {
        super(inputStream);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int available() {
        return 0;
    }

    @Override // java.io.FilterInputStream, java.io.Closeable, java.lang.AutoCloseable, java.io.InputStream
    public void close() throws IOException {
        this.d = null;
        this.c = true;
        this.e = null;
        super.close();
    }

    public void mark(int i) {
    }

    public boolean markSupported() {
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0069, code lost:
        r13 = r14.d;
        r13[r2] = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x006d, code lost:
        if (r12 != 126) goto L_0x0072;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x006f, code lost:
        r13[r2] = 117;
     */
    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() throws IOException {
        if (this.a >= this.b) {
            if (this.c) {
                return -1;
            }
            this.a = 0;
            while (true) {
                byte read = (byte) ((FilterInputStream) this).in.read();
                if (read == -1) {
                    this.c = true;
                    return -1;
                }
                byte b2 = (byte) read;
                if (b2 != 10 && b2 != 13 && b2 != 32) {
                    if (b2 == 126) {
                        this.c = true;
                        this.e = null;
                        this.d = null;
                        this.b = 0;
                        return -1;
                    }
                    if (b2 == 122) {
                        byte[] bArr = this.e;
                        bArr[3] = 0;
                        bArr[2] = 0;
                        bArr[1] = 0;
                        bArr[0] = 0;
                        this.b = 4;
                    } else {
                        this.d[0] = b2;
                        int i = 1;
                        while (true) {
                            if (i >= 5) {
                                break;
                            }
                            while (true) {
                                byte read2 = (byte) ((FilterInputStream) this).in.read();
                                if (read2 != -1) {
                                    byte b3 = (byte) read2;
                                    if (!(b3 == 10 || b3 == 13 || b3 == 32)) {
                                        break;
                                    }
                                } else {
                                    this.c = true;
                                    return -1;
                                }
                            }
                            i++;
                        }
                        int i2 = i - 1;
                        this.b = i2;
                        if (i2 == 0) {
                            this.c = true;
                            this.d = null;
                            this.e = null;
                            return -1;
                        }
                        if (i < 5) {
                            for (int i3 = i + 1; i3 < 5; i3++) {
                                this.d[i3] = 117;
                            }
                            this.c = true;
                        }
                        long j = 0;
                        for (int i4 = 0; i4 < 5; i4++) {
                            byte b4 = (byte) (this.d[i4] - 33);
                            if (b4 < 0 || b4 > 93) {
                                this.b = 0;
                                this.c = true;
                                this.d = null;
                                this.e = null;
                                throw new IOException(C0201.m82(20085));
                            }
                            j = (j * 85) + ((long) b4);
                        }
                        for (int i5 = 3; i5 >= 0; i5--) {
                            this.e[i5] = (byte) ((int) (255 & j));
                            j >>>= 8;
                        }
                    }
                }
            }
        }
        byte[] bArr2 = this.e;
        int i6 = this.a;
        this.a = i6 + 1;
        return bArr2[i6] & 255;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public void reset() throws IOException {
        throw new IOException(C0201.m82(20086));
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public long skip(long j) {
        return 0;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        if (this.c && this.a >= this.b) {
            return -1;
        }
        for (int i3 = 0; i3 < i2; i3++) {
            int i4 = this.a;
            if (i4 < this.b) {
                byte[] bArr2 = this.e;
                this.a = i4 + 1;
                bArr[i3 + i] = bArr2[i4];
            } else {
                int read = read();
                if (read == -1) {
                    return i3;
                }
                bArr[i3 + i] = (byte) read;
            }
        }
        return i2;
    }
}
