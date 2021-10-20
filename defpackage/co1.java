package defpackage;

import defpackage.kl1;
import java.io.IOException;
import java.util.Arrays;

/* renamed from: co1  reason: default package */
public final class co1 {
    private static final co1 f = new co1(0, new int[0], new Object[0], false);
    private int a;
    private int[] b;
    private Object[] c;
    private int d;
    private boolean e;

    private co1() {
        this(0, new int[8], new Object[8], true);
    }

    public static co1 a(co1 co1, co1 co12) {
        int i = co1.a + co12.a;
        int[] copyOf = Arrays.copyOf(co1.b, i);
        System.arraycopy(co12.b, 0, copyOf, co1.a, co12.a);
        Object[] copyOf2 = Arrays.copyOf(co1.c, i);
        System.arraycopy(co12.c, 0, copyOf2, co1.a, co12.a);
        return new co1(i, copyOf, copyOf2, true);
    }

    private static void e(int i, Object obj, xo1 xo1) throws IOException {
        int i2 = i >>> 3;
        int i3 = i & 7;
        if (i3 == 0) {
            xo1.l(i2, ((Long) obj).longValue());
        } else if (i3 == 1) {
            xo1.g(i2, ((Long) obj).longValue());
        } else if (i3 == 2) {
            xo1.K(i2, (bk1) obj);
        } else if (i3 != 3) {
            if (i3 == 5) {
                xo1.G(i2, ((Integer) obj).intValue());
                return;
            }
            throw new RuntimeException(sl1.f());
        } else if (xo1.F() == kl1.f.k) {
            xo1.H(i2);
            ((co1) obj).f(xo1);
            xo1.I(i2);
        } else {
            xo1.I(i2);
            ((co1) obj).f(xo1);
            xo1.H(i2);
        }
    }

    public static co1 i() {
        return f;
    }

    public static co1 j() {
        return new co1();
    }

    public final void b(xo1 xo1) throws IOException {
        if (xo1.F() == kl1.f.l) {
            for (int i = this.a - 1; i >= 0; i--) {
                xo1.h(this.b[i] >>> 3, this.c[i]);
            }
            return;
        }
        for (int i2 = 0; i2 < this.a; i2++) {
            xo1.h(this.b[i2] >>> 3, this.c[i2]);
        }
    }

    public final void c(StringBuilder sb, int i) {
        for (int i2 = 0; i2 < this.a; i2++) {
            wm1.c(sb, i, String.valueOf(this.b[i2] >>> 3), this.c[i2]);
        }
    }

    public final void d(int i, Object obj) {
        if (this.e) {
            int i2 = this.a;
            if (i2 == this.b.length) {
                int i3 = this.a + (i2 < 4 ? 8 : i2 >> 1);
                this.b = Arrays.copyOf(this.b, i3);
                this.c = Arrays.copyOf(this.c, i3);
            }
            int[] iArr = this.b;
            int i4 = this.a;
            iArr[i4] = i;
            this.c[i4] = obj;
            this.a = i4 + 1;
            return;
        }
        throw new UnsupportedOperationException();
    }

    public final boolean equals(Object obj) {
        boolean z;
        boolean z2;
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof co1)) {
            return false;
        }
        co1 co1 = (co1) obj;
        int i = this.a;
        if (i == co1.a) {
            int[] iArr = this.b;
            int[] iArr2 = co1.b;
            int i2 = 0;
            while (true) {
                if (i2 >= i) {
                    z = true;
                    break;
                } else if (iArr[i2] != iArr2[i2]) {
                    z = false;
                    break;
                } else {
                    i2++;
                }
            }
            if (z) {
                Object[] objArr = this.c;
                Object[] objArr2 = co1.c;
                int i3 = this.a;
                int i4 = 0;
                while (true) {
                    if (i4 >= i3) {
                        z2 = true;
                        break;
                    } else if (!objArr[i4].equals(objArr2[i4])) {
                        z2 = false;
                        break;
                    } else {
                        i4++;
                    }
                }
                return z2;
            }
        }
    }

    public final void f(xo1 xo1) throws IOException {
        if (this.a != 0) {
            if (xo1.F() == kl1.f.k) {
                for (int i = 0; i < this.a; i++) {
                    e(this.b[i], this.c[i], xo1);
                }
                return;
            }
            for (int i2 = this.a - 1; i2 >= 0; i2--) {
                e(this.b[i2], this.c[i2], xo1);
            }
        }
    }

    public final void g() {
        this.e = false;
    }

    public final int h() {
        int i;
        int i2 = this.d;
        if (i2 != -1) {
            return i2;
        }
        int i3 = 0;
        for (int i4 = 0; i4 < this.a; i4++) {
            int i5 = this.b[i4];
            int i6 = i5 >>> 3;
            int i7 = i5 & 7;
            if (i7 == 0) {
                i = qk1.d0(i6, ((Long) this.c[i4]).longValue());
            } else if (i7 == 1) {
                i = qk1.o0(i6, ((Long) this.c[i4]).longValue());
            } else if (i7 == 2) {
                i = qk1.Q(i6, (bk1) this.c[i4]);
            } else if (i7 == 3) {
                i = (qk1.u(i6) << 1) + ((co1) this.c[i4]).h();
            } else if (i7 == 5) {
                i = qk1.E0(i6, ((Integer) this.c[i4]).intValue());
            } else {
                throw new IllegalStateException(sl1.f());
            }
            i3 += i;
        }
        this.d = i3;
        return i3;
    }

    public final int hashCode() {
        int i = this.a;
        int i2 = (i + 527) * 31;
        int[] iArr = this.b;
        int i3 = 17;
        int i4 = 17;
        for (int i5 = 0; i5 < i; i5++) {
            i4 = (i4 * 31) + iArr[i5];
        }
        int i6 = (i2 + i4) * 31;
        Object[] objArr = this.c;
        int i7 = this.a;
        for (int i8 = 0; i8 < i7; i8++) {
            i3 = (i3 * 31) + objArr[i8].hashCode();
        }
        return i6 + i3;
    }

    public final int k() {
        int i = this.d;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.a; i3++) {
            i2 += qk1.Y(this.b[i3] >>> 3, (bk1) this.c[i3]);
        }
        this.d = i2;
        return i2;
    }

    private co1(int i, int[] iArr, Object[] objArr, boolean z) {
        this.d = -1;
        this.a = i;
        this.b = iArr;
        this.c = objArr;
        this.e = z;
    }
}
