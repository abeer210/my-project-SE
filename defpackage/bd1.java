package defpackage;

import java.io.IOException;
import vigqyno.C0188;
import vigqyno.C0201;

/* renamed from: bd1  reason: default package */
public final class bd1 {
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
    private o81 k;

    private bd1(byte[] bArr, int i2, int i3) {
        this.a = bArr;
        this.b = 0;
        int i4 = i3 + 0;
        this.d = i4;
        this.c = i4;
        this.f = 0;
    }

    private final void e(int i2) throws jd1 {
        if (this.g != i2) {
            throw new jd1(C0201.m82(133));
        }
    }

    private final void g(int i2) throws IOException {
        if (i2 >= 0) {
            int i3 = this.f;
            int i4 = i3 + i2;
            int i5 = this.h;
            if (i4 > i5) {
                g(i5 - i3);
                throw jd1.a();
            } else if (i2 <= this.d - i3) {
                this.f = i3 + i2;
            } else {
                throw jd1.a();
            }
        } else {
            throw jd1.b();
        }
    }

    public static bd1 h(byte[] bArr, int i2, int i3) {
        return new bd1(bArr, 0, i3);
    }

    private final void n() {
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

    private final byte o() throws IOException {
        int i2 = this.f;
        if (i2 != this.d) {
            byte[] bArr = this.a;
            this.f = i2 + 1;
            return bArr[i2];
        }
        throw jd1.a();
    }

    public final int a() {
        return this.f - this.b;
    }

    public final String b() throws IOException {
        int l = l();
        if (l < 0) {
            throw jd1.b();
        } else if (l <= this.d - this.f) {
            String str = new String(this.a, this.f, l, kd1.a);
            this.f += l;
            return str;
        } else {
            throw jd1.a();
        }
    }

    public final <T extends l91<T, ?>> T c(fb1<T> fb1) throws IOException {
        try {
            if (this.k == null) {
                this.k = o81.n(this.a, this.b, this.c);
            }
            int E = this.k.E();
            int i2 = this.f - this.b;
            if (E <= i2) {
                this.k.k(i2 - E);
                this.k.h(this.j - this.i);
                T t = (T) ((l91) this.k.e(fb1, y81.e()));
                f(this.g);
                return t;
            }
            throw new IOException(String.format(C0201.m82(134), Integer.valueOf(E), Integer.valueOf(i2)));
        } catch (v91 e2) {
            throw new jd1(C0201.m82(135), e2);
        }
    }

    public final void d(md1 md1) throws IOException {
        int l = l();
        if (this.i >= this.j) {
            throw new jd1(C0201.m82(136));
        } else if (l >= 0) {
            int i2 = l + this.f;
            int i3 = this.h;
            if (i2 <= i3) {
                this.h = i2;
                n();
                this.i++;
                md1.a(this);
                e(0);
                this.i--;
                this.h = i3;
                n();
                return;
            }
            throw jd1.a();
        } else {
            throw jd1.b();
        }
    }

    public final boolean f(int i2) throws IOException {
        int i3;
        int i4 = i2 & 7;
        if (i4 == 0) {
            l();
            return true;
        } else if (i4 == 1) {
            o();
            o();
            o();
            o();
            o();
            o();
            o();
            o();
            return true;
        } else if (i4 == 2) {
            g(l());
            return true;
        } else if (i4 == 3) {
            do {
                i3 = i();
                if (i3 == 0) {
                    break;
                }
            } while (f(i3));
            e(((i2 >>> 3) << 3) | 4);
            return true;
        } else if (i4 == 4) {
            return false;
        } else {
            if (i4 == 5) {
                o();
                o();
                o();
                o();
                return true;
            }
            throw new jd1(C0201.m82(137));
        }
    }

    public final int i() throws IOException {
        if (this.f == this.d) {
            this.g = 0;
            return 0;
        }
        int l = l();
        this.g = l;
        if (l != 0) {
            return l;
        }
        throw new jd1(C0201.m82(138));
    }

    public final boolean j() throws IOException {
        return l() != 0;
    }

    public final byte[] k(int i2, int i3) {
        if (i3 == 0) {
            return nd1.a;
        }
        byte[] bArr = new byte[i3];
        System.arraycopy(this.a, this.b + i2, bArr, 0, i3);
        return bArr;
    }

    public final int l() throws IOException {
        int i2;
        byte o = o();
        if (o >= 0) {
            return o;
        }
        int i3 = o & Byte.MAX_VALUE;
        byte o2 = o();
        if (o2 >= 0) {
            i2 = o2 << 7;
        } else {
            i3 |= (o2 & Byte.MAX_VALUE) << 7;
            byte o3 = o();
            if (o3 >= 0) {
                i2 = o3 << 14;
            } else {
                i3 |= (o3 & Byte.MAX_VALUE) << 14;
                byte o4 = o();
                if (o4 >= 0) {
                    i2 = o4 << 21;
                } else {
                    int i4 = i3 | ((o4 & Byte.MAX_VALUE) << 21);
                    byte o5 = o();
                    int i5 = i4 | (o5 << 28);
                    if (o5 >= 0) {
                        return i5;
                    }
                    for (int i6 = 0; i6 < 5; i6++) {
                        if (o() >= 0) {
                            return i5;
                        }
                    }
                    throw jd1.c();
                }
            }
        }
        return i3 | i2;
    }

    public final long m() throws IOException {
        long j2 = 0;
        for (int i2 = 0; i2 < 64; i2 += 7) {
            byte o = o();
            j2 |= ((long) (o & Byte.MAX_VALUE)) << i2;
            if ((o & 128) == 0) {
                return j2;
            }
        }
        throw jd1.c();
    }

    public final void p(int i2, int i3) {
        int i4 = this.f;
        int i5 = this.b;
        if (i2 > i4 - i5) {
            int i6 = this.f - this.b;
            StringBuilder sb = new StringBuilder(50);
            sb.append(C0201.m82(140));
            sb.append(i2);
            sb.append(C0201.m82(141));
            sb.append(i6);
            throw new IllegalArgumentException(sb.toString());
        } else if (i2 >= 0) {
            this.f = i5 + i2;
            this.g = i3;
        } else {
            StringBuilder sb2 = new StringBuilder(24);
            sb2.append(C0201.m82(139));
            sb2.append(i2);
            throw new IllegalArgumentException(sb2.toString());
        }
    }
}
