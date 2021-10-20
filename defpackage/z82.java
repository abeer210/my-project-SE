package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: z82  reason: default package */
/* compiled from: RSS14Reader */
public final class z82 extends v82 {
    private static final int[] i = {1, 10, 34, 70, 126};
    private static final int[] j = {4, 20, 48, 81};
    private static final int[] k = {0, 161, 961, 2015, 2715};
    private static final int[] l = {0, 336, 1036, 1516};
    private static final int[] m = {8, 6, 4, 3, 1};
    private static final int[] n = {2, 4, 6, 8};
    private static final int[][] o = {new int[]{3, 8, 2, 1}, new int[]{3, 5, 5, 1}, new int[]{3, 3, 7, 1}, new int[]{3, 1, 9, 1}, new int[]{2, 7, 4, 1}, new int[]{2, 5, 6, 1}, new int[]{2, 3, 8, 1}, new int[]{1, 5, 7, 1}, new int[]{1, 3, 9, 1}};
    private final List<y82> g = new ArrayList();
    private final List<y82> h = new ArrayList();

    private static void r(Collection<y82> collection, y82 y82) {
        if (y82 != null) {
            boolean z = false;
            Iterator<y82> it = collection.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                y82 next = it.next();
                if (next.b() == y82.b()) {
                    next.e();
                    z = true;
                    break;
                }
            }
            if (!z) {
                collection.add(y82);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0025, code lost:
        if (r1 < 4) goto L_0x003f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x003d, code lost:
        if (r1 < 4) goto L_0x003f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x003f, code lost:
        r2 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0041, code lost:
        r2 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0042, code lost:
        r5 = false;
     */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0097  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x00ac  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x00b9  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x00ce  */
    /* JADX WARNING: Removed duplicated region for block: B:83:? A[RETURN, SYNTHETIC] */
    private void s(boolean z, int i2) throws o62 {
        boolean z2;
        boolean z3;
        int d = n72.d(m());
        int d2 = n72.d(k());
        boolean z4 = false;
        boolean z5 = true;
        if (z) {
            if (d > 12) {
                z3 = false;
                z2 = true;
            } else {
                z3 = d < 4;
                z2 = false;
            }
            if (d2 <= 12) {
            }
        } else {
            if (d > 11) {
                z3 = false;
                z2 = true;
            } else {
                z3 = d < 5;
                z2 = false;
            }
            if (d2 <= 10) {
            }
        }
        boolean z6 = false;
        boolean z7 = true;
        int i3 = (d + d2) - i2;
        boolean z8 = (d & 1) == z;
        if ((d2 & 1) == 1) {
            z4 = true;
        }
        if (i3 != 1) {
            if (i3 == -1) {
                if (z8) {
                    if (z4) {
                        throw o62.a();
                    }
                } else if (z4) {
                    z5 = z3;
                    z6 = true;
                } else {
                    throw o62.a();
                }
            } else if (i3 != 0) {
                throw o62.a();
            } else if (z8) {
                if (z4) {
                    if (d >= d2) {
                        z5 = z3;
                        z6 = true;
                    }
                    z7 = true;
                } else {
                    throw o62.a();
                }
            } else if (!z4) {
                z5 = z3;
            } else {
                throw o62.a();
            }
            if (z5) {
            }
            if (z2) {
            }
            if (z6) {
            }
            if (z7) {
            }
        } else if (z8) {
            if (!z4) {
                z5 = z3;
            } else {
                throw o62.a();
            }
        } else if (z4) {
            z5 = z3;
            z7 = true;
            if (z5) {
                if (!z2) {
                    v82.o(m(), n());
                } else {
                    throw o62.a();
                }
            }
            if (z2) {
                v82.h(m(), n());
            }
            if (z6) {
                if (!z7) {
                    v82.o(k(), n());
                } else {
                    throw o62.a();
                }
            }
            if (z7) {
                v82.h(k(), l());
                return;
            }
            return;
        } else {
            throw o62.a();
        }
        z2 = true;
        if (z5) {
        }
        if (z2) {
        }
        if (z6) {
        }
        if (z7) {
        }
    }

    private static boolean t(y82 y82, y82 y822) {
        int a = (y82.a() + (y822.a() * 16)) % 79;
        int c = (y82.d().c() * 9) + y822.d().c();
        if (c > 72) {
            c--;
        }
        if (c > 8) {
            c--;
        }
        return a == c;
    }

    private static t62 u(y82 y82, y82 y822) {
        String valueOf = String.valueOf((((long) y82.b()) * 4537077) + ((long) y822.b()));
        StringBuilder sb = new StringBuilder(14);
        for (int length = 13 - valueOf.length(); length > 0; length--) {
            sb.append('0');
        }
        sb.append(valueOf);
        int i2 = 0;
        for (int i3 = 0; i3 < 13; i3++) {
            int charAt = sb.charAt(i3) - '0';
            if ((i3 & 1) == 0) {
                charAt *= 3;
            }
            i2 += charAt;
        }
        int i4 = 10 - (i2 % 10);
        if (i4 == 10) {
            i4 = 0;
        }
        sb.append(i4);
        v62[] a = y82.d().a();
        v62[] a2 = y822.d().a();
        return new t62(sb.toString(), null, new v62[]{a[0], a[1], a2[0], a2[1]}, f62.RSS_14);
    }

    private w82 v(b72 b72, x82 x82, boolean z) throws o62 {
        int[] i2 = i();
        for (int i3 = 0; i3 < i2.length; i3++) {
            i2[i3] = 0;
        }
        if (z) {
            o82.g(b72, x82.b()[0], i2);
        } else {
            o82.f(b72, x82.b()[1] + 1, i2);
            int i4 = 0;
            for (int length = i2.length - 1; i4 < length; length--) {
                int i5 = i2[i4];
                i2[i4] = i2[length];
                i2[length] = i5;
                i4++;
            }
        }
        int i6 = z ? 16 : 15;
        float d = ((float) n72.d(i2)) / ((float) i6);
        int[] m2 = m();
        int[] k2 = k();
        float[] n2 = n();
        float[] l2 = l();
        for (int i7 = 0; i7 < i2.length; i7++) {
            float f = ((float) i2[i7]) / d;
            int i8 = (int) (0.5f + f);
            if (i8 <= 0) {
                i8 = 1;
            } else if (i8 > 8) {
                i8 = 8;
            }
            int i9 = i7 / 2;
            if ((i7 & 1) == 0) {
                m2[i9] = i8;
                n2[i9] = f - ((float) i8);
            } else {
                k2[i9] = i8;
                l2[i9] = f - ((float) i8);
            }
        }
        s(z, i6);
        int i10 = 0;
        int i11 = 0;
        for (int length2 = m2.length - 1; length2 >= 0; length2--) {
            i10 = (i10 * 9) + m2[length2];
            i11 += m2[length2];
        }
        int i12 = 0;
        int i13 = 0;
        for (int length3 = k2.length - 1; length3 >= 0; length3--) {
            i12 = (i12 * 9) + k2[length3];
            i13 += k2[length3];
        }
        int i14 = i10 + (i12 * 3);
        if (z) {
            if ((i11 & 1) != 0 || i11 > 12 || i11 < 4) {
                throw o62.a();
            }
            int i15 = (12 - i11) / 2;
            int i16 = m[i15];
            return new w82((a92.b(m2, i16, false) * i[i15]) + a92.b(k2, 9 - i16, true) + k[i15], i14);
        } else if ((i13 & 1) != 0 || i13 > 10 || i13 < 4) {
            throw o62.a();
        } else {
            int i17 = (10 - i13) / 2;
            int i18 = n[i17];
            return new w82((a92.b(k2, 9 - i18, false) * j[i17]) + a92.b(m2, i18, true) + l[i17], i14);
        }
    }

    private y82 w(b72 b72, boolean z, int i2, Map<j62, ?> map) {
        w62 w62;
        try {
            int[] x = x(b72, z);
            x82 y = y(b72, i2, z, x);
            if (map == null) {
                w62 = null;
            } else {
                w62 = (w62) map.get(j62.NEED_RESULT_POINT_CALLBACK);
            }
            if (w62 != null) {
                float f = ((float) (x[0] + x[1])) / 2.0f;
                if (z) {
                    f = ((float) (b72.g() - 1)) - f;
                }
                w62.a(new v62(f, (float) i2));
            }
            w82 v = v(b72, y, true);
            w82 v2 = v(b72, y, false);
            return new y82((v.b() * 1597) + v2.b(), v.a() + (v2.a() * 4), y);
        } catch (o62 unused) {
            return null;
        }
    }

    private int[] x(b72 b72, boolean z) throws o62 {
        int[] j2 = j();
        j2[0] = 0;
        j2[1] = 0;
        j2[2] = 0;
        j2[3] = 0;
        int g2 = b72.g();
        int i2 = 0;
        boolean z2 = false;
        while (i2 < g2) {
            z2 = !b72.c(i2);
            if (z == z2) {
                break;
            }
            i2++;
        }
        int i3 = i2;
        int i4 = 0;
        while (i2 < g2) {
            if (b72.c(i2) != z2) {
                j2[i4] = j2[i4] + 1;
            } else {
                if (i4 != 3) {
                    i4++;
                } else if (v82.p(j2)) {
                    return new int[]{i3, i2};
                } else {
                    i3 += j2[0] + j2[1];
                    j2[0] = j2[2];
                    j2[1] = j2[3];
                    j2[2] = 0;
                    j2[3] = 0;
                    i4--;
                }
                j2[i4] = 1;
                z2 = !z2;
            }
            i2++;
        }
        throw o62.a();
    }

    private x82 y(b72 b72, int i2, boolean z, int[] iArr) throws o62 {
        int i3;
        int i4;
        boolean c = b72.c(iArr[0]);
        int i5 = iArr[0] - 1;
        while (i5 >= 0 && c != b72.c(i5)) {
            i5--;
        }
        int i6 = i5 + 1;
        int[] j2 = j();
        System.arraycopy(j2, 0, j2, 1, j2.length - 1);
        j2[0] = iArr[0] - i6;
        int q = v82.q(j2, o);
        int i7 = iArr[1];
        if (z) {
            i3 = (b72.g() - 1) - i7;
            i4 = (b72.g() - 1) - i6;
        } else {
            i3 = i7;
            i4 = i6;
        }
        return new x82(q, new int[]{i6, iArr[1]}, i4, i3, i2);
    }

    @Override // defpackage.o82, defpackage.r62
    public void a() {
        this.g.clear();
        this.h.clear();
    }

    @Override // defpackage.o82
    public t62 c(int i2, b72 b72, Map<j62, ?> map) throws o62 {
        r(this.g, w(b72, false, i2, map));
        b72.l();
        r(this.h, w(b72, true, i2, map));
        b72.l();
        for (y82 y82 : this.g) {
            if (y82.c() > 1) {
                for (y82 y822 : this.h) {
                    if (y822.c() > 1 && t(y82, y822)) {
                        return u(y82, y822);
                    }
                }
                continue;
            }
        }
        throw o62.a();
    }
}
