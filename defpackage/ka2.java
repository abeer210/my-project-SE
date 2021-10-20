package defpackage;

import java.lang.reflect.Array;
import java.util.ArrayList;

/* renamed from: ka2  reason: default package */
/* compiled from: PDF417ScanningDecoder */
public final class ka2 {
    private static final la2 a = new la2();

    private static da2 a(ia2 ia2) throws o62 {
        int[] j;
        if (ia2 == null || (j = ia2.j()) == null) {
            return null;
        }
        int p = p(j);
        int i = 0;
        int i2 = 0;
        for (int i3 : j) {
            i2 += p - i3;
            if (i3 > 0) {
                break;
            }
        }
        ea2[] d = ia2.d();
        int i4 = 0;
        while (i2 > 0 && d[i4] == null) {
            i2--;
            i4++;
        }
        for (int length = j.length - 1; length >= 0; length--) {
            i += p - j[length];
            if (j[length] > 0) {
                break;
            }
        }
        int length2 = d.length - 1;
        while (i > 0 && d[length2] == null) {
            i--;
            length2--;
        }
        return ia2.a().a(i2, i, ia2.k());
    }

    private static void b(ga2 ga2, ca2[][] ca2Arr) throws o62 {
        ca2 ca2 = ca2Arr[0][1];
        int[] a2 = ca2.a();
        int j = (ga2.j() * ga2.l()) - r(ga2.k());
        if (a2.length == 0) {
            if (j <= 0 || j > 928) {
                throw o62.a();
            }
            ca2.b(j);
        } else if (a2[0] != j) {
            ca2.b(j);
        }
    }

    private static int c(c72 c72, int i, int i2, boolean z, int i3, int i4) {
        int i5 = z ? -1 : 1;
        int i6 = i3;
        for (int i7 = 0; i7 < 2; i7++) {
            while (true) {
                if (z) {
                    if (i6 < i) {
                        continue;
                        break;
                    }
                } else if (i6 >= i2) {
                    continue;
                    break;
                }
                if (z != c72.d(i6, i4)) {
                    continue;
                    break;
                } else if (Math.abs(i3 - i6) > 2) {
                    return i3;
                } else {
                    i6 += i5;
                }
            }
            i5 = -i5;
            z = !z;
        }
        return i6;
    }

    private static boolean d(int i, int i2, int i3) {
        return i2 + -2 <= i && i <= i3 + 2;
    }

    private static int e(int[] iArr, int[] iArr2, int i) throws i62 {
        if ((iArr2 == null || iArr2.length <= (i / 2) + 3) && i >= 0 && i <= 512) {
            return a.a(iArr, i, iArr2);
        }
        throw i62.a();
    }

    private static ca2[][] f(ga2 ga2) {
        int c;
        int l = ga2.l();
        int[] iArr = new int[2];
        iArr[1] = ga2.j() + 2;
        iArr[0] = l;
        ca2[][] ca2Arr = (ca2[][]) Array.newInstance(ca2.class, iArr);
        for (int i = 0; i < ca2Arr.length; i++) {
            for (int i2 = 0; i2 < ca2Arr[i].length; i2++) {
                ca2Arr[i][i2] = new ca2();
            }
        }
        ha2[] o = ga2.o();
        int i3 = 0;
        for (ha2 ha2 : o) {
            if (ha2 != null) {
                ea2[] d = ha2.d();
                for (ea2 ea2 : d) {
                    if (ea2 != null && (c = ea2.c()) >= 0 && c < ca2Arr.length) {
                        ca2Arr[c][i3].b(ea2.e());
                    }
                }
            }
            i3++;
        }
        return ca2Arr;
    }

    private static f72 g(ga2 ga2) throws k62, i62, o62 {
        ca2[][] f = f(ga2);
        b(ga2, f);
        ArrayList arrayList = new ArrayList();
        int[] iArr = new int[(ga2.l() * ga2.j())];
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        for (int i = 0; i < ga2.l(); i++) {
            int i2 = 0;
            while (i2 < ga2.j()) {
                int i3 = i2 + 1;
                int[] a2 = f[i][i3].a();
                int j = (ga2.j() * i) + i2;
                if (a2.length == 0) {
                    arrayList.add(Integer.valueOf(j));
                } else if (a2.length == 1) {
                    iArr[j] = a2[0];
                } else {
                    arrayList3.add(Integer.valueOf(j));
                    arrayList2.add(a2);
                }
                i2 = i3;
            }
        }
        int size = arrayList2.size();
        int[][] iArr2 = new int[size][];
        for (int i4 = 0; i4 < size; i4++) {
            iArr2[i4] = (int[]) arrayList2.get(i4);
        }
        return h(ga2.k(), iArr, y92.b(arrayList), y92.b(arrayList3), iArr2);
    }

    private static f72 h(int i, int[] iArr, int[] iArr2, int[] iArr3, int[][] iArr4) throws k62, i62 {
        int length = iArr3.length;
        int[] iArr5 = new int[length];
        int i2 = 100;
        while (true) {
            int i3 = i2 - 1;
            if (i2 > 0) {
                for (int i4 = 0; i4 < length; i4++) {
                    iArr[iArr3[i4]] = iArr4[i4][iArr5[i4]];
                }
                try {
                    return j(iArr, i, iArr2);
                } catch (i62 unused) {
                    if (length != 0) {
                        int i5 = 0;
                        while (true) {
                            if (i5 >= length) {
                                break;
                            } else if (iArr5[i5] < iArr4[i5].length - 1) {
                                iArr5[i5] = iArr5[i5] + 1;
                                break;
                            } else {
                                iArr5[i5] = 0;
                                if (i5 != length - 1) {
                                    i5++;
                                } else {
                                    throw i62.a();
                                }
                            }
                        }
                        i2 = i3;
                    } else {
                        throw i62.a();
                    }
                }
            } else {
                throw i62.a();
            }
        }
    }

    public static f72 i(c72 c72, v62 v62, v62 v622, v62 v623, v62 v624, int i, int i2) throws o62, k62, i62 {
        ha2 ha2;
        int i3;
        int i4;
        int i5;
        ia2 ia2 = null;
        ia2 ia22 = null;
        ga2 ga2 = null;
        da2 da2 = new da2(c72, v62, v622, v623, v624);
        int i6 = 0;
        while (true) {
            if (i6 >= 2) {
                break;
            }
            if (v62 != null) {
                ia2 = s(c72, da2, v62, true, i, i2);
            }
            if (v623 != null) {
                ia22 = s(c72, da2, v623, false, i, i2);
            }
            ga2 = v(ia2, ia22);
            if (ga2 == null) {
                throw o62.a();
            } else if (i6 != 0 || ga2.m() == null || (ga2.m().g() >= da2.g() && ga2.m().e() <= da2.e())) {
                ga2.p(da2);
            } else {
                da2 = ga2.m();
                i6++;
            }
        }
        ga2.p(da2);
        int j = ga2.j() + 1;
        ga2.q(0, ia2);
        ga2.q(j, ia22);
        boolean z = ia2 != null;
        int i7 = i;
        int i8 = i2;
        for (int i9 = 1; i9 <= j; i9++) {
            int i10 = z ? i9 : j - i9;
            if (ga2.n(i10) == null) {
                if (i10 == 0 || i10 == j) {
                    ha2 = new ia2(da2, i10 == 0);
                } else {
                    ha2 = new ha2(da2);
                }
                ga2.q(i10, ha2);
                int i11 = -1;
                int g = da2.g();
                int i12 = -1;
                while (g <= da2.e()) {
                    int t = t(ga2, i10, g, z);
                    if (t >= 0 && t <= da2.d()) {
                        i5 = t;
                    } else if (i12 != i11) {
                        i5 = i12;
                    } else {
                        i4 = i12;
                        i3 = g;
                        i12 = i4;
                        g = i3 + 1;
                        i11 = -1;
                    }
                    i4 = i12;
                    ea2 k = k(c72, da2.f(), da2.d(), z, i5, g, i7, i8);
                    i3 = g;
                    if (k != null) {
                        ha2.f(i3, k);
                        i7 = Math.min(i7, k.f());
                        i8 = Math.max(i8, k.f());
                        i12 = i5;
                        g = i3 + 1;
                        i11 = -1;
                    }
                    i12 = i4;
                    g = i3 + 1;
                    i11 = -1;
                }
            }
        }
        return g(ga2);
    }

    private static f72 j(int[] iArr, int i, int[] iArr2) throws k62, i62 {
        if (iArr.length != 0) {
            int i2 = 1 << (i + 1);
            int e = e(iArr, iArr2, i2);
            w(iArr, i2);
            f72 b = fa2.b(iArr, String.valueOf(i));
            b.k(Integer.valueOf(e));
            b.j(Integer.valueOf(iArr2.length));
            return b;
        }
        throw k62.a();
    }

    private static ea2 k(c72 c72, int i, int i2, boolean z, int i3, int i4, int i5, int i6) {
        int i7;
        int d;
        int a2;
        int c = c(c72, i, i2, z, i3, i4);
        int[] q = q(c72, i, i2, z, c, i4);
        if (q == null) {
            return null;
        }
        int d2 = n72.d(q);
        if (z) {
            i7 = c + d2;
        } else {
            for (int i8 = 0; i8 < q.length / 2; i8++) {
                int i9 = q[i8];
                q[i8] = q[(q.length - 1) - i8];
                q[(q.length - 1) - i8] = i9;
            }
            c -= d2;
            i7 = c;
        }
        if (d(d2, i5, i6) && (a2 = y92.a((d = ja2.d(q)))) != -1) {
            return new ea2(c, i7, n(d), a2);
        }
        return null;
    }

    private static ba2 l(ia2 ia2, ia2 ia22) {
        ba2 i;
        ba2 i2;
        if (ia2 == null || (i = ia2.i()) == null) {
            if (ia22 == null) {
                return null;
            }
            return ia22.i();
        } else if (ia22 == null || (i2 = ia22.i()) == null || i.a() == i2.a() || i.b() == i2.b() || i.c() == i2.c()) {
            return i;
        } else {
            return null;
        }
    }

    private static int[] m(int i) {
        int[] iArr = new int[8];
        int i2 = 0;
        int i3 = 7;
        while (true) {
            int i4 = i & 1;
            if (i4 != i2) {
                i3--;
                if (i3 < 0) {
                    return iArr;
                }
                i2 = i4;
            }
            iArr[i3] = iArr[i3] + 1;
            i >>= 1;
        }
    }

    private static int n(int i) {
        return o(m(i));
    }

    private static int o(int[] iArr) {
        return ((((iArr[0] - iArr[2]) + iArr[4]) - iArr[6]) + 9) % 9;
    }

    private static int p(int[] iArr) {
        int i = -1;
        for (int i2 : iArr) {
            i = Math.max(i, i2);
        }
        return i;
    }

    private static int[] q(c72 c72, int i, int i2, boolean z, int i3, int i4) {
        int[] iArr = new int[8];
        int i5 = z ? 1 : -1;
        int i6 = 0;
        boolean z2 = z;
        while (true) {
            if (!z) {
                if (i3 < i) {
                    break;
                }
            } else if (i3 >= i2) {
                break;
            }
            if (i6 >= 8) {
                break;
            } else if (c72.d(i3, i4) == z2) {
                iArr[i6] = iArr[i6] + 1;
                i3 += i5;
            } else {
                i6++;
                z2 = !z2;
            }
        }
        if (i6 != 8) {
            if (z) {
                i = i2;
            }
            if (!(i3 == i && i6 == 7)) {
                return null;
            }
        }
        return iArr;
    }

    private static int r(int i) {
        return 2 << i;
    }

    private static ia2 s(c72 c72, da2 da2, v62 v62, boolean z, int i, int i2) {
        int i3;
        ia2 ia2 = new ia2(da2, z);
        int i4 = 0;
        while (i4 < 2) {
            int i5 = i4 == 0 ? 1 : -1;
            int c = (int) v62.c();
            int d = (int) v62.d();
            while (d <= da2.e() && d >= da2.g()) {
                ea2 k = k(c72, 0, c72.l(), z, c, d, i, i2);
                if (k != null) {
                    ia2.f(d, k);
                    if (z) {
                        i3 = k.d();
                    } else {
                        i3 = k.b();
                    }
                    c = i3;
                }
                d += i5;
            }
            i4++;
        }
        return ia2;
    }

    private static int t(ga2 ga2, int i, int i2, boolean z) {
        int i3 = z ? 1 : -1;
        ea2 ea2 = null;
        int i4 = i - i3;
        if (u(ga2, i4)) {
            ea2 = ga2.n(i4).b(i2);
        }
        if (ea2 != null) {
            return z ? ea2.b() : ea2.d();
        }
        ea2 c = ga2.n(i).c(i2);
        if (c != null) {
            return z ? c.d() : c.b();
        }
        if (u(ga2, i4)) {
            c = ga2.n(i4).c(i2);
        }
        if (c != null) {
            return z ? c.b() : c.d();
        }
        int i5 = 0;
        while (true) {
            i -= i3;
            if (u(ga2, i)) {
                ea2[] d = ga2.n(i).d();
                for (ea2 ea22 : d) {
                    if (ea22 != null) {
                        return (z ? ea22.b() : ea22.d()) + (i3 * i5 * (ea22.b() - ea22.d()));
                    }
                }
                i5++;
            } else {
                da2 m = ga2.m();
                return z ? m.f() : m.d();
            }
        }
    }

    private static boolean u(ga2 ga2, int i) {
        return i >= 0 && i <= ga2.j() + 1;
    }

    private static ga2 v(ia2 ia2, ia2 ia22) throws o62 {
        ba2 l;
        if ((ia2 == null && ia22 == null) || (l = l(ia2, ia22)) == null) {
            return null;
        }
        return new ga2(l, da2.j(a(ia2), a(ia22)));
    }

    private static void w(int[] iArr, int i) throws k62 {
        if (iArr.length >= 4) {
            int i2 = iArr[0];
            if (i2 > iArr.length) {
                throw k62.a();
            } else if (i2 != 0) {
            } else {
                if (i < iArr.length) {
                    iArr[0] = iArr.length - i;
                    return;
                }
                throw k62.a();
            }
        } else {
            throw k62.a();
        }
    }
}
