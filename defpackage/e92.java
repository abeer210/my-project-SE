package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: e92  reason: default package */
/* compiled from: RSSExpandedReader */
public final class e92 extends v82 {
    private static final int[] k = {7, 5, 4, 3, 1};
    private static final int[] l = {4, 20, 52, 104, 204};
    private static final int[] m = {0, 348, 1388, 2948, 3988};
    private static final int[][] n = {new int[]{1, 8, 4, 1}, new int[]{3, 6, 4, 1}, new int[]{3, 4, 6, 1}, new int[]{3, 2, 8, 1}, new int[]{2, 6, 5, 1}, new int[]{2, 2, 9, 1}};
    private static final int[][] o = {new int[]{1, 3, 9, 27, 81, 32, 96, 77}, new int[]{20, 60, 180, 118, 143, 7, 21, 63}, new int[]{189, 145, 13, 39, 117, 140, 209, 205}, new int[]{193, 157, 49, 147, 19, 57, 171, 91}, new int[]{62, 186, 136, 197, 169, 85, 44, 132}, new int[]{185, 133, 188, 142, 4, 12, 36, 108}, new int[]{113, 128, 173, 97, 80, 29, 87, 50}, new int[]{150, 28, 84, 41, 123, 158, 52, 156}, new int[]{46, 138, 203, 187, 139, 206, 196, 166}, new int[]{76, 17, 51, 153, 37, 111, 122, 155}, new int[]{43, 129, 176, 106, 107, 110, 119, 146}, new int[]{16, 48, 144, 10, 30, 90, 59, 177}, new int[]{109, 116, 137, 200, 178, 112, 125, 164}, new int[]{70, 210, 208, 202, 184, 130, 179, 115}, new int[]{134, 191, 151, 31, 93, 68, 204, 190}, new int[]{148, 22, 66, 198, 172, 94, 71, 2}, new int[]{6, 18, 54, 162, 64, 192, 154, 40}, new int[]{120, 149, 25, 75, 14, 42, 126, 167}, new int[]{79, 26, 78, 23, 69, 207, 199, 175}, new int[]{103, 98, 83, 38, 114, 131, 182, 124}, new int[]{161, 61, 183, 127, 170, 88, 53, 159}, new int[]{55, 165, 73, 8, 24, 72, 5, 15}, new int[]{45, 135, 194, 160, 58, 174, 100, 89}};
    private static final int[][] p = {new int[]{0, 0}, new int[]{0, 1, 1}, new int[]{0, 2, 1, 3}, new int[]{0, 4, 1, 3, 2}, new int[]{0, 4, 1, 3, 3, 5}, new int[]{0, 4, 1, 3, 4, 5, 5}, new int[]{0, 0, 1, 1, 2, 2, 3, 3}, new int[]{0, 0, 1, 1, 2, 2, 3, 4, 4}, new int[]{0, 0, 1, 1, 2, 2, 3, 4, 5, 5}, new int[]{0, 0, 1, 1, 2, 3, 3, 4, 4, 5, 5}};
    private final List<c92> g = new ArrayList(11);
    private final List<d92> h = new ArrayList();
    private final int[] i = new int[2];
    private boolean j;

    private static boolean A(x82 x82, boolean z, boolean z2) {
        return x82.c() != 0 || !z || !z2;
    }

    private static boolean B(Iterable<c92> iterable, Iterable<d92> iterable2) {
        boolean z;
        boolean z2;
        Iterator<d92> it = iterable2.iterator();
        do {
            z = false;
            if (it.hasNext()) {
                d92 next = it.next();
                Iterator<c92> it2 = iterable.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        z = true;
                        continue;
                        break;
                    }
                    c92 next2 = it2.next();
                    Iterator<c92> it3 = next.a().iterator();
                    while (true) {
                        if (it3.hasNext()) {
                            if (next2.equals(it3.next())) {
                                z2 = true;
                                continue;
                                break;
                            }
                        } else {
                            z2 = false;
                            continue;
                            break;
                        }
                    }
                    if (!z2) {
                        continue;
                        break;
                    }
                }
            } else {
                return false;
            }
        } while (!z);
        return true;
    }

    private static boolean C(List<c92> list) {
        boolean z;
        int[][] iArr = p;
        for (int[] iArr2 : iArr) {
            if (list.size() <= iArr2.length) {
                int i2 = 0;
                while (true) {
                    if (i2 >= list.size()) {
                        z = true;
                        break;
                    } else if (list.get(i2).b().c() != iArr2[i2]) {
                        z = false;
                        break;
                    } else {
                        i2++;
                    }
                }
                if (z) {
                    return true;
                }
            }
        }
        return false;
    }

    private x82 D(b72 b72, int i2, boolean z) {
        int i3;
        int i4;
        int i5;
        if (z) {
            int i6 = this.i[0] - 1;
            while (i6 >= 0 && !b72.c(i6)) {
                i6--;
            }
            int i7 = i6 + 1;
            int[] iArr = this.i;
            i5 = iArr[0] - i7;
            i3 = iArr[1];
            i4 = i7;
        } else {
            int[] iArr2 = this.i;
            int i8 = iArr2[0];
            int f = b72.f(iArr2[1] + 1);
            i3 = f;
            i4 = i8;
            i5 = f - this.i[1];
        }
        int[] j2 = j();
        System.arraycopy(j2, 0, j2, 1, j2.length - 1);
        j2[0] = i5;
        try {
            return new x82(v82.q(j2, n), new int[]{i4, i3}, i4, i3, i2);
        } catch (o62 unused) {
            return null;
        }
    }

    private static void E(List<c92> list, List<d92> list2) {
        boolean z;
        Iterator<d92> it = list2.iterator();
        while (it.hasNext()) {
            d92 next = it.next();
            if (next.a().size() != list.size()) {
                Iterator<c92> it2 = next.a().iterator();
                while (true) {
                    z = false;
                    boolean z2 = true;
                    if (!it2.hasNext()) {
                        z = true;
                        break;
                    }
                    c92 next2 = it2.next();
                    Iterator<c92> it3 = list.iterator();
                    while (true) {
                        if (it3.hasNext()) {
                            if (next2.equals(it3.next())) {
                                continue;
                                break;
                            }
                        } else {
                            z2 = false;
                            continue;
                            break;
                        }
                    }
                    if (!z2) {
                        break;
                    }
                }
                if (z) {
                    it.remove();
                }
            }
        }
    }

    private static void G(int[] iArr) {
        int length = iArr.length;
        for (int i2 = 0; i2 < length / 2; i2++) {
            int i3 = iArr[i2];
            int i4 = (length - i2) - 1;
            iArr[i2] = iArr[i4];
            iArr[i4] = i3;
        }
    }

    private void H(int i2, boolean z) {
        boolean z2 = false;
        int i3 = 0;
        boolean z3 = false;
        while (true) {
            if (i3 >= this.h.size()) {
                break;
            }
            d92 d92 = this.h.get(i3);
            if (d92.b() > i2) {
                z2 = d92.c(this.g);
                break;
            } else {
                z3 = d92.c(this.g);
                i3++;
            }
        }
        if (!z2 && !z3 && !B(this.g, this.h)) {
            this.h.add(i3, new d92(this.g, i2, z));
            E(this.g, this.h);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:52:0x007f  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0094  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00a1  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x00b6  */
    /* JADX WARNING: Removed duplicated region for block: B:70:? A[RETURN, SYNTHETIC] */
    private void r(int i2) throws o62 {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        int d = n72.d(m());
        int d2 = n72.d(k());
        boolean z5 = false;
        boolean z6 = true;
        if (d > 13) {
            z2 = false;
            z = true;
        } else {
            z2 = d < 4;
            z = false;
        }
        if (d2 > 13) {
            z4 = false;
            z3 = true;
        } else {
            z4 = d2 < 4;
            z3 = false;
        }
        int i3 = (d + d2) - i2;
        boolean z7 = (d & 1) == 1;
        if ((d2 & 1) == 0) {
            z5 = true;
        }
        if (i3 != 1) {
            if (i3 == -1) {
                if (z7) {
                    if (z5) {
                        throw o62.a();
                    }
                } else if (z5) {
                    z6 = z2;
                    z4 = true;
                } else {
                    throw o62.a();
                }
            } else if (i3 != 0) {
                throw o62.a();
            } else if (z7) {
                if (z5) {
                    if (d >= d2) {
                        z6 = z2;
                        z4 = true;
                    }
                    z3 = true;
                } else {
                    throw o62.a();
                }
            } else if (!z5) {
                z6 = z2;
            } else {
                throw o62.a();
            }
            if (z6) {
            }
            if (z) {
            }
            if (z4) {
            }
            if (z3) {
            }
        } else if (z7) {
            if (!z5) {
                z6 = z2;
            } else {
                throw o62.a();
            }
        } else if (z5) {
            z6 = z2;
            z3 = true;
            if (z6) {
                if (!z) {
                    v82.o(m(), n());
                } else {
                    throw o62.a();
                }
            }
            if (z) {
                v82.h(m(), n());
            }
            if (z4) {
                if (!z3) {
                    v82.o(k(), n());
                } else {
                    throw o62.a();
                }
            }
            if (z3) {
                v82.h(k(), l());
                return;
            }
            return;
        } else {
            throw o62.a();
        }
        z = true;
        if (z6) {
        }
        if (z) {
        }
        if (z4) {
        }
        if (z3) {
        }
    }

    private boolean s() {
        c92 c92 = this.g.get(0);
        w82 c = c92.c();
        w82 d = c92.d();
        if (d == null) {
            return false;
        }
        int a = d.a();
        int i2 = 2;
        for (int i3 = 1; i3 < this.g.size(); i3++) {
            c92 c922 = this.g.get(i3);
            a += c922.c().a();
            i2++;
            w82 d2 = c922.d();
            if (d2 != null) {
                a += d2.a();
                i2++;
            }
        }
        if (((i2 - 4) * 211) + (a % 211) == c.b()) {
            return true;
        }
        return false;
    }

    private List<c92> t(List<d92> list, int i2) throws o62 {
        while (i2 < this.h.size()) {
            d92 d92 = this.h.get(i2);
            this.g.clear();
            for (d92 d922 : list) {
                this.g.addAll(d922.a());
            }
            this.g.addAll(d92.a());
            if (!C(this.g)) {
                i2++;
            } else if (s()) {
                return this.g;
            } else {
                ArrayList arrayList = new ArrayList(list);
                arrayList.add(d92);
                try {
                    return t(arrayList, i2 + 1);
                } catch (o62 unused) {
                    continue;
                }
            }
        }
        throw o62.a();
    }

    private List<c92> u(boolean z) {
        List<c92> list = null;
        if (this.h.size() > 25) {
            this.h.clear();
            return null;
        }
        this.g.clear();
        if (z) {
            Collections.reverse(this.h);
        }
        try {
            list = t(new ArrayList(), 0);
        } catch (o62 unused) {
        }
        if (z) {
            Collections.reverse(this.h);
        }
        return list;
    }

    public static t62 v(List<c92> list) throws o62, k62 {
        String d = o92.a(b92.a(list)).d();
        v62[] a = list.get(0).b().a();
        v62[] a2 = list.get(list.size() - 1).b().a();
        return new t62(d, null, new v62[]{a[0], a[1], a2[0], a2[1]}, f62.RSS_EXPANDED);
    }

    private void y(b72 b72, List<c92> list, int i2) throws o62 {
        int[] j2 = j();
        j2[0] = 0;
        j2[1] = 0;
        j2[2] = 0;
        j2[3] = 0;
        int g2 = b72.g();
        if (i2 < 0) {
            if (list.isEmpty()) {
                i2 = 0;
            } else {
                i2 = list.get(list.size() - 1).b().b()[1];
            }
        }
        boolean z = list.size() % 2 != 0;
        if (this.j) {
            z = !z;
        }
        boolean z2 = false;
        while (i2 < g2) {
            z2 = !b72.c(i2);
            if (!z2) {
                break;
            }
            i2++;
        }
        boolean z3 = z2;
        int i3 = 0;
        int i4 = i2;
        while (i2 < g2) {
            if (b72.c(i2) != z3) {
                j2[i3] = j2[i3] + 1;
            } else {
                if (i3 == 3) {
                    if (z) {
                        G(j2);
                    }
                    if (v82.p(j2)) {
                        int[] iArr = this.i;
                        iArr[0] = i4;
                        iArr[1] = i2;
                        return;
                    }
                    if (z) {
                        G(j2);
                    }
                    i4 += j2[0] + j2[1];
                    j2[0] = j2[2];
                    j2[1] = j2[3];
                    j2[2] = 0;
                    j2[3] = 0;
                    i3--;
                } else {
                    i3++;
                }
                j2[i3] = 1;
                z3 = !z3;
            }
            i2++;
        }
        throw o62.a();
    }

    private static int z(b72 b72, int i2) {
        if (b72.c(i2)) {
            return b72.e(b72.f(i2));
        }
        return b72.f(b72.e(i2));
    }

    public c92 F(b72 b72, List<c92> list, int i2) throws o62 {
        x82 D;
        w82 w82;
        boolean z = list.size() % 2 == 0;
        if (this.j) {
            z = !z;
        }
        int i3 = -1;
        boolean z2 = true;
        do {
            y(b72, list, i3);
            D = D(b72, i2, z);
            if (D == null) {
                i3 = z(b72, this.i[0]);
                continue;
            } else {
                z2 = false;
                continue;
            }
        } while (z2);
        w82 w = w(b72, D, z, true);
        if (list.isEmpty() || !list.get(list.size() - 1).f()) {
            try {
                w82 = w(b72, D, z, false);
            } catch (o62 unused) {
                w82 = null;
            }
            return new c92(w, w82, D, true);
        }
        throw o62.a();
    }

    @Override // defpackage.o82, defpackage.r62
    public void a() {
        this.g.clear();
        this.h.clear();
    }

    @Override // defpackage.o82
    public t62 c(int i2, b72 b72, Map<j62, ?> map) throws o62, k62 {
        this.g.clear();
        this.j = false;
        try {
            return v(x(i2, b72));
        } catch (o62 unused) {
            this.g.clear();
            this.j = true;
            return v(x(i2, b72));
        }
    }

    public w82 w(b72 b72, x82 x82, boolean z, boolean z2) throws o62 {
        int[] i2 = i();
        for (int i3 = 0; i3 < i2.length; i3++) {
            i2[i3] = 0;
        }
        if (z2) {
            o82.g(b72, x82.b()[0], i2);
        } else {
            o82.f(b72, x82.b()[1], i2);
            int i4 = 0;
            for (int length = i2.length - 1; i4 < length; length--) {
                int i5 = i2[i4];
                i2[i4] = i2[length];
                i2[length] = i5;
                i4++;
            }
        }
        float d = ((float) n72.d(i2)) / 17.0f;
        float f = ((float) (x82.b()[1] - x82.b()[0])) / 15.0f;
        if (Math.abs(d - f) / f <= 0.3f) {
            int[] m2 = m();
            int[] k2 = k();
            float[] n2 = n();
            float[] l2 = l();
            for (int i6 = 0; i6 < i2.length; i6++) {
                float f2 = (((float) i2[i6]) * 1.0f) / d;
                int i7 = (int) (0.5f + f2);
                if (i7 <= 0) {
                    if (f2 >= 0.3f) {
                        i7 = 1;
                    } else {
                        throw o62.a();
                    }
                } else if (i7 > 8) {
                    if (f2 <= 8.7f) {
                        i7 = 8;
                    } else {
                        throw o62.a();
                    }
                }
                int i8 = i6 / 2;
                if ((i6 & 1) == 0) {
                    m2[i8] = i7;
                    n2[i8] = f2 - ((float) i7);
                } else {
                    k2[i8] = i7;
                    l2[i8] = f2 - ((float) i7);
                }
            }
            r(17);
            int c = (((x82.c() * 4) + (z ? 0 : 2)) + (!z2 ? 1 : 0)) - 1;
            int i9 = 0;
            int i10 = 0;
            for (int length2 = m2.length - 1; length2 >= 0; length2--) {
                if (A(x82, z, z2)) {
                    i9 += m2[length2] * o[c][length2 * 2];
                }
                i10 += m2[length2];
            }
            int i11 = 0;
            for (int length3 = k2.length - 1; length3 >= 0; length3--) {
                if (A(x82, z, z2)) {
                    i11 += k2[length3] * o[c][(length3 * 2) + 1];
                }
            }
            int i12 = i9 + i11;
            if ((i10 & 1) != 0 || i10 > 13 || i10 < 4) {
                throw o62.a();
            }
            int i13 = (13 - i10) / 2;
            int i14 = k[i13];
            return new w82((a92.b(m2, i14, true) * l[i13]) + a92.b(k2, 9 - i14, false) + m[i13], i12);
        }
        throw o62.a();
    }

    public List<c92> x(int i2, b72 b72) throws o62 {
        boolean z = false;
        while (!z) {
            try {
                this.g.add(F(b72, this.g, i2));
            } catch (o62 e) {
                if (!this.g.isEmpty()) {
                    z = true;
                } else {
                    throw e;
                }
            }
        }
        if (s()) {
            return this.g;
        }
        boolean z2 = !this.h.isEmpty();
        H(i2, false);
        if (z2) {
            List<c92> u = u(false);
            if (u != null) {
                return u;
            }
            List<c92> u2 = u(true);
            if (u2 != null) {
                return u2;
            }
        }
        throw o62.a();
    }
}
