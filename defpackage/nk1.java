package defpackage;

import java.io.IOException;
import java.util.Arrays;
import vigqyno.C0188;
import vigqyno.C0201;

/* renamed from: nk1  reason: default package */
public final class nk1 extends kk1 {
    private final byte[] d;
    private int e;
    private int f;
    private int g;
    private int h;
    private int i;
    private int j;

    private nk1(byte[] bArr, int i2, int i3, boolean z) {
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
    private final int H() throws IOException {
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
        return (int) G();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00b0, code lost:
        if (((long) r2[r0]) >= 0) goto L_0x006e;
     */
    private final long I() throws IOException {
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
        return G();
    }

    private final int J() throws IOException {
        int i2 = this.g;
        if (this.e - i2 >= 4) {
            byte[] bArr = this.d;
            this.g = i2 + 4;
            return ((bArr[i2 + 3] & 255) << 24) | (bArr[i2] & 255) | ((bArr[i2 + 1] & 255) << 8) | ((bArr[i2 + 2] & 255) << 16);
        }
        throw sl1.a();
    }

    private final long K() throws IOException {
        int i2 = this.g;
        if (this.e - i2 >= 8) {
            byte[] bArr = this.d;
            this.g = i2 + 8;
            return ((((long) bArr[i2 + 7]) & 255) << 56) | (((long) bArr[i2]) & 255) | ((((long) bArr[i2 + 1]) & 255) << 8) | ((((long) bArr[i2 + 2]) & 255) << 16) | ((((long) bArr[i2 + 3]) & 255) << 24) | ((((long) bArr[i2 + 4]) & 255) << 32) | ((((long) bArr[i2 + 5]) & 255) << 40) | ((((long) bArr[i2 + 6]) & 255) << 48);
        }
        throw sl1.a();
    }

    private final void L() {
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

    private final byte M() throws IOException {
        int i2 = this.g;
        if (i2 != this.e) {
            byte[] bArr = this.d;
            this.g = i2 + 1;
            return bArr[i2];
        }
        throw sl1.a();
    }

    @Override // defpackage.kk1
    public final int A() throws IOException {
        return kk1.l(H());
    }

    @Override // defpackage.kk1
    public final long B() throws IOException {
        return kk1.y(I());
    }

    @Override // defpackage.kk1
    public final int C() throws IOException {
        if (m()) {
            this.i = 0;
            return 0;
        }
        int H = H();
        this.i = H;
        if ((H >>> 3) != 0) {
            return H;
        }
        throw sl1.d();
    }

    @Override // defpackage.kk1
    public final int D() {
        return this.g - this.h;
    }

    public final long G() throws IOException {
        long j2 = 0;
        for (int i2 = 0; i2 < 64; i2 += 7) {
            byte M = M();
            j2 |= ((long) (M & Byte.MAX_VALUE)) << i2;
            if ((M & 128) == 0) {
                return j2;
            }
        }
        throw sl1.c();
    }

    @Override // defpackage.kk1
    public final double a() throws IOException {
        return Double.longBitsToDouble(K());
    }

    @Override // defpackage.kk1
    public final float b() throws IOException {
        return Float.intBitsToFloat(J());
    }

    @Override // defpackage.kk1
    public final String c() throws IOException {
        int H = H();
        if (H > 0 && H <= this.e - this.g) {
            String str = new String(this.d, this.g, H, nl1.a);
            this.g += H;
            return str;
        } else if (H == 0) {
            return C0201.m82(13989);
        } else {
            if (H < 0) {
                throw sl1.b();
            }
            throw sl1.a();
        }
    }

    @Override // defpackage.kk1
    public final <T extends tm1> T e(dn1<T> dn1, wk1 wk1) throws IOException {
        int H = H();
        if (this.a < this.b) {
            int i2 = i(H);
            this.a++;
            T a = dn1.a(this, wk1);
            f(0);
            this.a--;
            j(i2);
            return a;
        }
        throw sl1.g();
    }

    @Override // defpackage.kk1
    public final void f(int i2) throws sl1 {
        if (this.i != i2) {
            throw sl1.e();
        }
    }

    @Override // defpackage.kk1
    public final boolean g(int i2) throws IOException {
        int C;
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
                throw sl1.c();
            }
            while (i4 < 10) {
                if (M() < 0) {
                    i4++;
                }
            }
            throw sl1.c();
            return true;
        } else if (i3 == 1) {
            k(8);
            return true;
        } else if (i3 == 2) {
            k(H());
            return true;
        } else if (i3 == 3) {
            do {
                C = C();
                if (C == 0) {
                    break;
                }
            } while (g(C));
            f(((i2 >>> 3) << 3) | 4);
            return true;
        } else if (i3 == 4) {
            return false;
        } else {
            if (i3 == 5) {
                k(4);
                return true;
            }
            throw sl1.f();
        }
    }

    @Override // defpackage.kk1
    public final int i(int i2) throws sl1 {
        if (i2 >= 0) {
            int D = i2 + D();
            int i3 = this.j;
            if (D <= i3) {
                this.j = D;
                L();
                return i3;
            }
            throw sl1.a();
        }
        throw sl1.b();
    }

    @Override // defpackage.kk1
    public final void j(int i2) {
        this.j = i2;
        L();
    }

    @Override // defpackage.kk1
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
            throw sl1.b();
        }
        throw sl1.a();
    }

    @Override // defpackage.kk1
    public final boolean m() throws IOException {
        return this.g == this.e;
    }

    @Override // defpackage.kk1
    public final long n() throws IOException {
        return I();
    }

    @Override // defpackage.kk1
    public final long o() throws IOException {
        return I();
    }

    @Override // defpackage.kk1
    public final int p() throws IOException {
        return H();
    }

    @Override // defpackage.kk1
    public final long q() throws IOException {
        return K();
    }

    @Override // defpackage.kk1
    public final int r() throws IOException {
        return J();
    }

    @Override // defpackage.kk1
    public final boolean s() throws IOException {
        return I() != 0;
    }

    @Override // defpackage.kk1
    public final String t() throws IOException {
        int H = H();
        if (H > 0) {
            int i2 = this.e;
            int i3 = this.g;
            if (H <= i2 - i3) {
                String j2 = jo1.j(this.d, i3, H);
                this.g += H;
                return j2;
            }
        }
        if (H == 0) {
            return C0201.m82(13990);
        }
        if (H <= 0) {
            throw sl1.b();
        }
        throw sl1.a();
    }

    @Override // defpackage.kk1
    public final bk1 u() throws IOException {
        byte[] bArr;
        int H = H();
        if (H > 0) {
            int i2 = this.e;
            int i3 = this.g;
            if (H <= i2 - i3) {
                bk1 i4 = bk1.i(this.d, i3, H);
                this.g += H;
                return i4;
            }
        }
        if (H == 0) {
            return bk1.b;
        }
        if (H > 0) {
            int i5 = this.e;
            int i6 = this.g;
            if (H <= i5 - i6) {
                int i7 = H + i6;
                this.g = i7;
                bArr = Arrays.copyOfRange(this.d, i6, i7);
                return bk1.q(bArr);
            }
        }
        if (H > 0) {
            throw sl1.a();
        } else if (H == 0) {
            bArr = nl1.b;
            return bk1.q(bArr);
        } else {
            throw sl1.b();
        }
    }

    @Override // defpackage.kk1
    public final int v() throws IOException {
        return H();
    }

    @Override // defpackage.kk1
    public final int w() throws IOException {
        return H();
    }

    @Override // defpackage.kk1
    public final int x() throws IOException {
        return J();
    }

    @Override // defpackage.kk1
    public final long z() throws IOException {
        return K();
    }
}
