package defpackage;

import java.io.IOException;
import java.util.Arrays;
import vigqyno.C0188;
import vigqyno.C0201;

/* renamed from: q81  reason: default package */
public final class q81 extends o81 {
    private final byte[] d;
    private int e;
    private int f;
    private int g;
    private int h;
    private int i;
    private int j;

    private q81(byte[] bArr, int i2, int i3, boolean z) {
        super();
        this.j = C0188.f24;
        this.d = bArr;
        this.e = i3 + i2;
        this.g = i2;
        this.h = i2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0066, code lost:
        if (r2[r3] >= 0) goto L_0x0068;
     */
    private final int G() throws IOException {
        int i2;
        int i3 = this.g;
        int i4 = this.e;
        if (i4 != i3) {
            byte[] bArr = this.d;
            int i5 = i3 + 1;
            byte b = bArr[i3];
            if (b >= 0) {
                this.g = i5;
                return b;
            } else if (i4 - i5 >= 9) {
                int i6 = i5 + 1;
                int i7 = b ^ (bArr[i5] << 7);
                if (i7 < 0) {
                    i2 = i7 ^ -128;
                } else {
                    int i8 = i6 + 1;
                    int i9 = i7 ^ (bArr[i6] << 14);
                    if (i9 >= 0) {
                        i2 = i9 ^ 16256;
                    } else {
                        i6 = i8 + 1;
                        int i10 = i9 ^ (bArr[i8] << 21);
                        if (i10 < 0) {
                            i2 = i10 ^ -2080896;
                        } else {
                            i8 = i6 + 1;
                            byte b2 = bArr[i6];
                            i2 = (i10 ^ (b2 << 28)) ^ 266354560;
                            if (b2 < 0) {
                                i6 = i8 + 1;
                                if (bArr[i8] < 0) {
                                    i8 = i6 + 1;
                                    if (bArr[i6] < 0) {
                                        i6 = i8 + 1;
                                        if (bArr[i8] < 0) {
                                            i8 = i6 + 1;
                                            if (bArr[i6] < 0) {
                                                i6 = i8 + 1;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    i6 = i8;
                }
                this.g = i6;
                return i2;
            }
        }
        return (int) F();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00b0, code lost:
        if (((long) r2[r0]) >= 0) goto L_0x006e;
     */
    private final long H() throws IOException {
        long j2;
        long j3;
        long j4;
        long j5;
        int i2;
        int i3 = this.g;
        int i4 = this.e;
        if (i4 != i3) {
            byte[] bArr = this.d;
            int i5 = i3 + 1;
            byte b = bArr[i3];
            if (b >= 0) {
                this.g = i5;
                return (long) b;
            } else if (i4 - i5 >= 9) {
                int i6 = i5 + 1;
                int i7 = b ^ (bArr[i5] << 7);
                if (i7 < 0) {
                    i2 = i7 ^ -128;
                } else {
                    int i8 = i6 + 1;
                    int i9 = i7 ^ (bArr[i6] << 14);
                    if (i9 >= 0) {
                        i6 = i8;
                        j2 = (long) (i9 ^ 16256);
                    } else {
                        i6 = i8 + 1;
                        int i10 = i9 ^ (bArr[i8] << 21);
                        if (i10 < 0) {
                            i2 = i10 ^ -2080896;
                        } else {
                            long j6 = (long) i10;
                            int i11 = i6 + 1;
                            long j7 = j6 ^ (((long) bArr[i6]) << 28);
                            if (j7 >= 0) {
                                j5 = 266354560;
                            } else {
                                i6 = i11 + 1;
                                long j8 = j7 ^ (((long) bArr[i11]) << 35);
                                if (j8 < 0) {
                                    j4 = -34093383808L;
                                } else {
                                    i11 = i6 + 1;
                                    j7 = j8 ^ (((long) bArr[i6]) << 42);
                                    if (j7 >= 0) {
                                        j5 = 4363953127296L;
                                    } else {
                                        i6 = i11 + 1;
                                        j8 = j7 ^ (((long) bArr[i11]) << 49);
                                        if (j8 < 0) {
                                            j4 = -558586000294016L;
                                        } else {
                                            int i12 = i6 + 1;
                                            j3 = (j8 ^ (((long) bArr[i6]) << 56)) ^ 71499008037633920L;
                                            if (j3 < 0) {
                                                i6 = i12 + 1;
                                            } else {
                                                i6 = i12;
                                            }
                                            j2 = j3;
                                        }
                                    }
                                }
                                j3 = j8 ^ j4;
                                j2 = j3;
                            }
                            j2 = j5 ^ j7;
                            i6 = i11;
                        }
                    }
                    this.g = i6;
                    return j2;
                }
                j2 = (long) i2;
                this.g = i6;
                return j2;
            }
        }
        return F();
    }

    private final int I() throws IOException {
        int i2 = this.g;
        if (this.e - i2 >= 4) {
            byte[] bArr = this.d;
            this.g = i2 + 4;
            return ((bArr[i2 + 3] & 255) << 24) | (bArr[i2] & 255) | ((bArr[i2 + 1] & 255) << 8) | ((bArr[i2 + 2] & 255) << 16);
        }
        throw v91.b();
    }

    private final long J() throws IOException {
        int i2 = this.g;
        if (this.e - i2 >= 8) {
            byte[] bArr = this.d;
            this.g = i2 + 8;
            return ((((long) bArr[i2 + 7]) & 255) << 56) | (((long) bArr[i2]) & 255) | ((((long) bArr[i2 + 1]) & 255) << 8) | ((((long) bArr[i2 + 2]) & 255) << 16) | ((((long) bArr[i2 + 3]) & 255) << 24) | ((((long) bArr[i2 + 4]) & 255) << 32) | ((((long) bArr[i2 + 5]) & 255) << 40) | ((((long) bArr[i2 + 6]) & 255) << 48);
        }
        throw v91.b();
    }

    private final void K() {
        int i2 = this.e + this.f;
        this.e = i2;
        int i3 = i2 - this.h;
        int i4 = this.j;
        if (i3 > i4) {
            int i5 = i3 - i4;
            this.f = i5;
            this.e = i2 - i5;
            return;
        }
        this.f = 0;
    }

    private final byte L() throws IOException {
        int i2 = this.g;
        if (i2 != this.e) {
            byte[] bArr = this.d;
            this.g = i2 + 1;
            return bArr[i2];
        }
        throw v91.b();
    }

    @Override // defpackage.o81
    public final long A() throws IOException {
        return J();
    }

    @Override // defpackage.o81
    public final int B() throws IOException {
        return o81.l(G());
    }

    @Override // defpackage.o81
    public final long C() throws IOException {
        return o81.m(H());
    }

    @Override // defpackage.o81
    public final boolean D() throws IOException {
        return this.g == this.e;
    }

    @Override // defpackage.o81
    public final int E() {
        return this.g - this.h;
    }

    public final long F() throws IOException {
        long j2 = 0;
        for (int i2 = 0; i2 < 64; i2 += 7) {
            byte L = L();
            j2 |= ((long) (L & Byte.MAX_VALUE)) << i2;
            if ((L & 128) == 0) {
                return j2;
            }
        }
        throw v91.d();
    }

    @Override // defpackage.o81
    public final double a() throws IOException {
        return Double.longBitsToDouble(J());
    }

    @Override // defpackage.o81
    public final float b() throws IOException {
        return Float.intBitsToFloat(I());
    }

    @Override // defpackage.o81
    public final String c() throws IOException {
        int G = G();
        if (G > 0 && G <= this.e - this.g) {
            String str = new String(this.d, this.g, G, m91.a);
            this.g += G;
            return str;
        } else if (G == 0) {
            return C0201.m82(32826);
        } else {
            if (G < 0) {
                throw v91.c();
            }
            throw v91.b();
        }
    }

    @Override // defpackage.o81
    public final <T extends wa1> T e(fb1<T> fb1, y81 y81) throws IOException {
        int G = G();
        if (this.a < this.b) {
            int i2 = i(G);
            this.a++;
            T a = fb1.a(this, y81);
            f(0);
            this.a--;
            j(i2);
            return a;
        }
        throw v91.h();
    }

    @Override // defpackage.o81
    public final void f(int i2) throws v91 {
        if (this.i != i2) {
            throw v91.f();
        }
    }

    @Override // defpackage.o81
    public final boolean g(int i2) throws IOException {
        int o;
        int i3 = i2 & 7;
        int i4 = 0;
        if (i3 == 0) {
            if (this.e - this.g >= 10) {
                while (i4 < 10) {
                    byte[] bArr = this.d;
                    int i5 = this.g;
                    this.g = i5 + 1;
                    if (bArr[i5] < 0) {
                        i4++;
                    }
                }
                throw v91.d();
            }
            while (i4 < 10) {
                if (L() < 0) {
                    i4++;
                }
            }
            throw v91.d();
            return true;
        } else if (i3 == 1) {
            k(8);
            return true;
        } else if (i3 == 2) {
            k(G());
            return true;
        } else if (i3 == 3) {
            do {
                o = o();
                if (o == 0) {
                    break;
                }
            } while (g(o));
            f(((i2 >>> 3) << 3) | 4);
            return true;
        } else if (i3 == 4) {
            return false;
        } else {
            if (i3 == 5) {
                k(4);
                return true;
            }
            throw v91.g();
        }
    }

    @Override // defpackage.o81
    public final int i(int i2) throws v91 {
        if (i2 >= 0) {
            int E = i2 + E();
            int i3 = this.j;
            if (E <= i3) {
                this.j = E;
                K();
                return i3;
            }
            throw v91.b();
        }
        throw v91.c();
    }

    @Override // defpackage.o81
    public final void j(int i2) {
        this.j = i2;
        K();
    }

    @Override // defpackage.o81
    public final void k(int i2) throws IOException {
        if (i2 >= 0) {
            int i3 = this.e;
            int i4 = this.g;
            if (i2 <= i3 - i4) {
                this.g = i4 + i2;
                return;
            }
        }
        if (i2 < 0) {
            throw v91.c();
        }
        throw v91.b();
    }

    @Override // defpackage.o81
    public final int o() throws IOException {
        if (D()) {
            this.i = 0;
            return 0;
        }
        int G = G();
        this.i = G;
        if ((G >>> 3) != 0) {
            return G;
        }
        throw v91.e();
    }

    @Override // defpackage.o81
    public final long p() throws IOException {
        return H();
    }

    @Override // defpackage.o81
    public final long q() throws IOException {
        return H();
    }

    @Override // defpackage.o81
    public final int r() throws IOException {
        return G();
    }

    @Override // defpackage.o81
    public final long s() throws IOException {
        return J();
    }

    @Override // defpackage.o81
    public final int t() throws IOException {
        return I();
    }

    @Override // defpackage.o81
    public final boolean u() throws IOException {
        return H() != 0;
    }

    @Override // defpackage.o81
    public final String v() throws IOException {
        int G = G();
        if (G > 0) {
            int i2 = this.e;
            int i3 = this.g;
            if (G <= i2 - i3) {
                String j2 = nc1.j(this.d, i3, G);
                this.g += G;
                return j2;
            }
        }
        if (G == 0) {
            return C0201.m82(32827);
        }
        if (G <= 0) {
            throw v91.c();
        }
        throw v91.b();
    }

    @Override // defpackage.o81
    public final c81 w() throws IOException {
        byte[] bArr;
        int G = G();
        if (G > 0) {
            int i2 = this.e;
            int i3 = this.g;
            if (G <= i2 - i3) {
                c81 j2 = c81.j(this.d, i3, G);
                this.g += G;
                return j2;
            }
        }
        if (G == 0) {
            return c81.b;
        }
        if (G > 0) {
            int i4 = this.e;
            int i5 = this.g;
            if (G <= i4 - i5) {
                int i6 = G + i5;
                this.g = i6;
                bArr = Arrays.copyOfRange(this.d, i5, i6);
                return c81.l(bArr);
            }
        }
        if (G > 0) {
            throw v91.b();
        } else if (G == 0) {
            bArr = m91.b;
            return c81.l(bArr);
        } else {
            throw v91.c();
        }
    }

    @Override // defpackage.o81
    public final int x() throws IOException {
        return G();
    }

    @Override // defpackage.o81
    public final int y() throws IOException {
        return G();
    }

    @Override // defpackage.o81
    public final int z() throws IOException {
        return I();
    }
}
