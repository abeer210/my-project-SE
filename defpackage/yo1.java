package defpackage;

import java.io.IOException;
import vigqyno.C0188;
import vigqyno.C0201;

/* renamed from: yo1  reason: default package */
public final class yo1 {
    private final byte[] a;
    private final int b;
    private final int c;
    private int d;
    private int e;
    private int f;
    private int g;
    private int h = C0188.f24;
    private int i;
    private int j = 64;
    private kk1 k;

    private yo1(byte[] bArr, int i2, int i3) {
        this.a = bArr;
        this.b = i2;
        int i4 = i3 + i2;
        this.d = i4;
        this.c = i4;
        this.f = i2;
    }

    private final void i(int i2) throws IOException {
        if (i2 >= 0) {
            int i3 = this.f;
            int i4 = i3 + i2;
            int i5 = this.h;
            if (i4 > i5) {
                i(i5 - i3);
                throw gp1.a();
            } else if (i2 <= this.d - i3) {
                this.f = i3 + i2;
            } else {
                throw gp1.a();
            }
        } else {
            throw gp1.b();
        }
    }

    private final void p() {
        int i2 = this.d + this.e;
        this.d = i2;
        int i3 = this.h;
        if (i2 > i3) {
            int i4 = i2 - i3;
            this.e = i4;
            this.d = i2 - i4;
            return;
        }
        this.e = 0;
    }

    private final byte q() throws IOException {
        int i2 = this.f;
        if (i2 != this.d) {
            byte[] bArr = this.a;
            this.f = i2 + 1;
            return bArr[i2];
        }
        throw gp1.a();
    }

    public static yo1 s(byte[] bArr, int i2, int i3) {
        return new yo1(bArr, 0, i3);
    }

    public final int a() {
        return this.f - this.b;
    }

    public final String b() throws IOException {
        int m = m();
        if (m < 0) {
            throw gp1.b();
        } else if (m <= this.d - this.f) {
            String str = new String(this.a, this.f, m, fp1.a);
            this.f += m;
            return str;
        } else {
            throw gp1.a();
        }
    }

    public final <T extends kl1<T, ?>> T c(dn1<T> dn1) throws IOException {
        try {
            if (this.k == null) {
                this.k = kk1.E(this.a, this.b, this.c);
            }
            int D = this.k.D();
            int i2 = this.f - this.b;
            if (D <= i2) {
                this.k.k(i2 - D);
                this.k.h(this.j - this.i);
                T t = (T) ((kl1) this.k.e(dn1, wk1.e()));
                f(this.g);
                return t;
            }
            throw new IOException(String.format(C0201.m82(24290), Integer.valueOf(D), Integer.valueOf(i2)));
        } catch (sl1 e2) {
            throw new gp1(C0201.m82(24291), e2);
        }
    }

    public final void d(hp1 hp1) throws IOException {
        int m = m();
        if (this.i < this.j) {
            int g2 = g(m);
            this.i++;
            hp1.a(this);
            e(0);
            this.i--;
            h(g2);
            return;
        }
        throw new gp1(C0201.m82(24292));
    }

    public final void e(int i2) throws gp1 {
        if (this.g != i2) {
            throw new gp1(C0201.m82(24293));
        }
    }

    public final boolean f(int i2) throws IOException {
        int l;
        int i3 = i2 & 7;
        if (i3 == 0) {
            m();
            return true;
        } else if (i3 == 1) {
            q();
            q();
            q();
            q();
            q();
            q();
            q();
            q();
            return true;
        } else if (i3 == 2) {
            i(m());
            return true;
        } else if (i3 == 3) {
            do {
                l = l();
                if (l == 0) {
                    break;
                }
            } while (f(l));
            e(((i2 >>> 3) << 3) | 4);
            return true;
        } else if (i3 == 4) {
            return false;
        } else {
            if (i3 == 5) {
                o();
                return true;
            }
            throw new gp1(C0201.m82(24294));
        }
    }

    public final int g(int i2) throws gp1 {
        if (i2 >= 0) {
            int i3 = i2 + this.f;
            int i4 = this.h;
            if (i3 <= i4) {
                this.h = i3;
                p();
                return i4;
            }
            throw gp1.a();
        }
        throw gp1.b();
    }

    public final void h(int i2) {
        this.h = i2;
        p();
    }

    public final void j(int i2) {
        u(i2, this.g);
    }

    public final boolean k() throws IOException {
        return m() != 0;
    }

    public final int l() throws IOException {
        if (this.f == this.d) {
            this.g = 0;
            return 0;
        }
        int m = m();
        this.g = m;
        if (m != 0) {
            return m;
        }
        throw new gp1(C0201.m82(24295));
    }

    public final int m() throws IOException {
        int i2;
        byte q = q();
        if (q >= 0) {
            return q;
        }
        int i3 = q & Byte.MAX_VALUE;
        byte q2 = q();
        if (q2 >= 0) {
            i2 = q2 << 7;
        } else {
            i3 |= (q2 & Byte.MAX_VALUE) << 7;
            byte q3 = q();
            if (q3 >= 0) {
                i2 = q3 << 14;
            } else {
                i3 |= (q3 & Byte.MAX_VALUE) << 14;
                byte q4 = q();
                if (q4 >= 0) {
                    i2 = q4 << 21;
                } else {
                    int i4 = i3 | ((q4 & Byte.MAX_VALUE) << 21);
                    byte q5 = q();
                    int i5 = i4 | (q5 << 28);
                    if (q5 >= 0) {
                        return i5;
                    }
                    for (int i6 = 0; i6 < 5; i6++) {
                        if (q() >= 0) {
                            return i5;
                        }
                    }
                    throw gp1.c();
                }
            }
        }
        return i3 | i2;
    }

    public final long n() throws IOException {
        long j2 = 0;
        for (int i2 = 0; i2 < 64; i2 += 7) {
            byte q = q();
            j2 |= ((long) (q & Byte.MAX_VALUE)) << i2;
            if ((q & 128) == 0) {
                return j2;
            }
        }
        throw gp1.c();
    }

    public final int o() throws IOException {
        return (q() & 255) | ((q() & 255) << 8) | ((q() & 255) << 16) | ((q() & 255) << 24);
    }

    public final int r() {
        int i2 = this.h;
        if (i2 == Integer.MAX_VALUE) {
            return -1;
        }
        return i2 - this.f;
    }

    public final byte[] t(int i2, int i3) {
        if (i3 == 0) {
            return kp1.c;
        }
        byte[] bArr = new byte[i3];
        System.arraycopy(this.a, this.b + i2, bArr, 0, i3);
        return bArr;
    }

    public final void u(int i2, int i3) {
        int i4 = this.f;
        int i5 = this.b;
        if (i2 > i4 - i5) {
            int i6 = this.f - this.b;
            StringBuilder sb = new StringBuilder(50);
            sb.append(C0201.m82(24297));
            sb.append(i2);
            sb.append(C0201.m82(24298));
            sb.append(i6);
            throw new IllegalArgumentException(sb.toString());
        } else if (i2 >= 0) {
            this.f = i5 + i2;
            this.g = i3;
        } else {
            StringBuilder sb2 = new StringBuilder(24);
            sb2.append(C0201.m82(24296));
            sb2.append(i2);
            throw new IllegalArgumentException(sb2.toString());
        }
    }
}
