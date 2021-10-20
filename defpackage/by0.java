package defpackage;

import defpackage.kv0;
import java.io.IOException;
import java.util.Arrays;

/* renamed from: by0  reason: default package */
public final class by0 {
    private static final by0 f = new by0(0, new int[0], new Object[0], false);
    private int a;
    private int[] b;
    private Object[] c;
    private int d;
    private boolean e;

    private by0() {
        this(0, new int[8], new Object[8], true);
    }

    private by0(int i, int[] iArr, Object[] objArr, boolean z) {
        this.d = -1;
        this.a = i;
        this.b = iArr;
        this.c = objArr;
        this.e = z;
    }

    public static by0 a(by0 by0, by0 by02) {
        int i = by0.a + by02.a;
        int[] copyOf = Arrays.copyOf(by0.b, i);
        System.arraycopy(by02.b, 0, copyOf, by0.a, by02.a);
        Object[] copyOf2 = Arrays.copyOf(by0.c, i);
        System.arraycopy(by02.c, 0, copyOf2, by0.a, by02.a);
        return new by0(i, copyOf, copyOf2, true);
    }

    private static void f(int i, Object obj, vy0 vy0) throws IOException {
        int i2 = i >>> 3;
        int i3 = i & 7;
        if (i3 == 0) {
            vy0.l(i2, ((Long) obj).longValue());
        } else if (i3 == 1) {
            vy0.g(i2, ((Long) obj).longValue());
        } else if (i3 == 2) {
            vy0.J(i2, (fu0) obj);
        } else if (i3 != 3) {
            if (i3 == 5) {
                vy0.s(i2, ((Integer) obj).intValue());
                return;
            }
            throw new RuntimeException(qv0.c());
        } else if (vy0.N() == kv0.e.k) {
            vy0.L(i2);
            ((by0) obj).g(vy0);
            vy0.I(i2);
        } else {
            vy0.I(i2);
            ((by0) obj).g(vy0);
            vy0.L(i2);
        }
    }

    public static by0 h() {
        return f;
    }

    public static by0 i() {
        return new by0();
    }

    public final void b(vy0 vy0) throws IOException {
        if (vy0.N() == kv0.e.l) {
            for (int i = this.a - 1; i >= 0; i--) {
                vy0.h(this.b[i] >>> 3, this.c[i]);
            }
            return;
        }
        for (int i2 = 0; i2 < this.a; i2++) {
            vy0.h(this.b[i2] >>> 3, this.c[i2]);
        }
    }

    public final void c(StringBuilder sb, int i) {
        for (int i2 = 0; i2 < this.a; i2++) {
            tw0.c(sb, i, String.valueOf(this.b[i2] >>> 3), this.c[i2]);
        }
    }

    public final int d() {
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
                i = ru0.d0(i6, ((Long) this.c[i4]).longValue());
            } else if (i7 == 1) {
                i = ru0.k0(i6, ((Long) this.c[i4]).longValue());
            } else if (i7 == 2) {
                i = ru0.M(i6, (fu0) this.c[i4]);
            } else if (i7 == 3) {
                i = (ru0.B0(i6) << 1) + ((by0) this.c[i4]).d();
            } else if (i7 == 5) {
                i = ru0.t0(i6, ((Integer) this.c[i4]).intValue());
            } else {
                throw new IllegalStateException(qv0.c());
            }
            i3 += i;
        }
        this.d = i3;
        return i3;
    }

    public final void e(int i, Object obj) {
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
        if (obj == null || !(obj instanceof by0)) {
            return false;
        }
        by0 by0 = (by0) obj;
        int i = this.a;
        if (i == by0.a) {
            int[] iArr = this.b;
            int[] iArr2 = by0.b;
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
                Object[] objArr2 = by0.c;
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

    public final void g(vy0 vy0) throws IOException {
        if (this.a != 0) {
            if (vy0.N() == kv0.e.k) {
                for (int i = 0; i < this.a; i++) {
                    f(this.b[i], this.c[i], vy0);
                }
                return;
            }
            for (int i2 = this.a - 1; i2 >= 0; i2--) {
                f(this.b[i2], this.c[i2], vy0);
            }
        }
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

    public final int j() {
        int i = this.d;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.a; i3++) {
            i2 += ru0.W(this.b[i3] >>> 3, (fu0) this.c[i3]);
        }
        this.d = i2;
        return i2;
    }

    public final void k() {
        this.e = false;
    }
}
