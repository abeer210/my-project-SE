package defpackage;

import defpackage.l91;
import java.io.IOException;
import java.util.Arrays;

/* renamed from: hc1  reason: default package */
public final class hc1 {
    private static final hc1 f = new hc1(0, new int[0], new Object[0], false);
    private int a;
    private int[] b;
    private Object[] c;
    private int d;
    private boolean e;

    private hc1() {
        this(0, new int[8], new Object[8], true);
    }

    public static hc1 a(hc1 hc1, hc1 hc12) {
        int i = hc1.a + hc12.a;
        int[] copyOf = Arrays.copyOf(hc1.b, i);
        System.arraycopy(hc12.b, 0, copyOf, hc1.a, hc12.a);
        Object[] copyOf2 = Arrays.copyOf(hc1.c, i);
        System.arraycopy(hc12.c, 0, copyOf2, hc1.a, hc12.a);
        return new hc1(i, copyOf, copyOf2, true);
    }

    private static void d(int i, Object obj, cd1 cd1) throws IOException {
        int i2 = i >>> 3;
        int i3 = i & 7;
        if (i3 == 0) {
            cd1.l(i2, ((Long) obj).longValue());
        } else if (i3 == 1) {
            cd1.g(i2, ((Long) obj).longValue());
        } else if (i3 == 2) {
            cd1.L(i2, (c81) obj);
        } else if (i3 != 3) {
            if (i3 == 5) {
                cd1.s(i2, ((Integer) obj).intValue());
                return;
            }
            throw new RuntimeException(v91.g());
        } else if (cd1.K() == l91.d.k) {
            cd1.M(i2);
            ((hc1) obj).e(cd1);
            cd1.N(i2);
        } else {
            cd1.N(i2);
            ((hc1) obj).e(cd1);
            cd1.M(i2);
        }
    }

    public static hc1 i() {
        return f;
    }

    public static hc1 j() {
        return new hc1();
    }

    public final void b(cd1 cd1) throws IOException {
        if (cd1.K() == l91.d.l) {
            for (int i = this.a - 1; i >= 0; i--) {
                cd1.h(this.b[i] >>> 3, this.c[i]);
            }
            return;
        }
        for (int i2 = 0; i2 < this.a; i2++) {
            cd1.h(this.b[i2] >>> 3, this.c[i2]);
        }
    }

    public final void c(int i, Object obj) {
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

    public final void e(cd1 cd1) throws IOException {
        if (this.a != 0) {
            if (cd1.K() == l91.d.k) {
                for (int i = 0; i < this.a; i++) {
                    d(this.b[i], this.c[i], cd1);
                }
                return;
            }
            for (int i2 = this.a - 1; i2 >= 0; i2--) {
                d(this.b[i2], this.c[i2], cd1);
            }
        }
    }

    public final boolean equals(Object obj) {
        boolean z;
        boolean z2;
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof hc1)) {
            return false;
        }
        hc1 hc1 = (hc1) obj;
        int i = this.a;
        if (i == hc1.a) {
            int[] iArr = this.b;
            int[] iArr2 = hc1.b;
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
                Object[] objArr2 = hc1.c;
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

    public final void f(StringBuilder sb, int i) {
        for (int i2 = 0; i2 < this.a; i2++) {
            xa1.c(sb, i, String.valueOf(this.b[i2] >>> 3), this.c[i2]);
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
                i = r81.r0(i6, ((Long) this.c[i4]).longValue());
            } else if (i7 == 1) {
                i = r81.y0(i6, ((Long) this.c[i4]).longValue());
            } else if (i7 == 2) {
                i = r81.Z(i6, (c81) this.c[i4]);
            } else if (i7 == 3) {
                i = (r81.H(i6) << 1) + ((hc1) this.c[i4]).h();
            } else if (i7 == 5) {
                i = r81.D0(i6, ((Integer) this.c[i4]).intValue());
            } else {
                throw new IllegalStateException(v91.g());
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
            i2 += r81.j0(this.b[i3] >>> 3, (c81) this.c[i3]);
        }
        this.d = i2;
        return i2;
    }

    private hc1(int i, int[] iArr, Object[] objArr, boolean z) {
        this.d = -1;
        this.a = i;
        this.b = iArr;
        this.c = objArr;
        this.e = z;
    }
}
