package defpackage;

import java.util.Iterator;
import vigqyno.C0201;

/* renamed from: m9  reason: default package */
public class m9 {
    public static void a(l9 l9Var, String str, String str2) throws t8 {
        l9 l9Var2 = new l9(C0201.m82(28182), str2, null);
        l9 l9Var3 = new l9(C0201.m82(28183), str, null);
        l9Var2.e(l9Var3);
        if (!C0201.m82(28184).equals(l9Var3.I())) {
            l9Var.d(l9Var2);
        } else {
            l9Var.b(1, l9Var2);
        }
    }

    public static Object[] b(l9 l9Var, String str, String str2) throws t8 {
        if (l9Var.v().j()) {
            l9 l9Var2 = null;
            if (!l9Var.J()) {
                return new Object[]{new Integer(0), null};
            }
            Iterator S = l9Var.S();
            l9 l9Var3 = null;
            int i = 0;
            while (S.hasNext()) {
                l9 l9Var4 = (l9) S.next();
                if (!l9Var4.v().m()) {
                    if (l9Var4.K()) {
                        if (C0201.m82(28185).equals(l9Var4.A(1).t())) {
                            String I = l9Var4.A(1).I();
                            if (str2.equals(I)) {
                                return new Object[]{new Integer(1), l9Var4};
                            } else if (str != null && I.startsWith(str)) {
                                if (l9Var2 == null) {
                                    l9Var2 = l9Var4;
                                }
                                i++;
                            } else if (C0201.m82(28186).equals(I)) {
                                l9Var3 = l9Var4;
                            }
                        }
                    }
                    throw new t8(C0201.m82(28187), 102);
                }
                throw new t8(C0201.m82(28188), 102);
            }
            if (i == 1) {
                return new Object[]{new Integer(2), l9Var2};
            } else if (i > 1) {
                return new Object[]{new Integer(3), l9Var2};
            } else if (l9Var3 != null) {
                return new Object[]{new Integer(4), l9Var3};
            } else {
                return new Object[]{new Integer(5), l9Var.m(1)};
            }
        } else {
            throw new t8(C0201.m82(28189), 102);
        }
    }

    public static void c(l9 l9Var) {
        l9 x = l9Var.x();
        if (l9Var.v().n()) {
            x.Z(l9Var);
        } else {
            x.X(l9Var);
        }
        if (!x.J() && x.v().o()) {
            x.x().X(x);
        }
    }

    public static void d(l9 l9Var) {
        if (l9Var.v().k() && l9Var.J()) {
            boolean z = false;
            Iterator S = l9Var.S();
            while (true) {
                if (S.hasNext()) {
                    if (((l9) S.next()).v().h()) {
                        z = true;
                        break;
                    }
                } else {
                    break;
                }
            }
            if (z) {
                l9Var.v().t(true);
                o(l9Var);
            }
        }
    }

    public static l9 e(l9 l9Var, String str, boolean z) throws t8 {
        if (!l9Var.v().o() && !l9Var.v().q()) {
            if (!l9Var.M()) {
                throw new t8(C0201.m82(28191), 102);
            } else if (l9Var.v().i()) {
                throw new t8(C0201.m82(28190), 102);
            } else if (z) {
                l9Var.v().B(true);
            }
        }
        l9 k = l9Var.k(str);
        if (k != null || !z) {
            return k;
        }
        l9 l9Var2 = new l9(str, new x9());
        l9Var2.k0(true);
        l9Var.d(l9Var2);
        return l9Var2;
    }

    private static int f(l9 l9Var, String str, boolean z) throws t8 {
        try {
            int parseInt = Integer.parseInt(str.substring(1, str.length() - 1));
            if (parseInt >= 1) {
                if (z && parseInt == l9Var.p() + 1) {
                    l9 l9Var2 = new l9(C0201.m82(28192), null);
                    l9Var2.k0(true);
                    l9Var.d(l9Var2);
                }
                return parseInt;
            }
            throw new t8(C0201.m82(28193), 102);
        } catch (NumberFormatException unused) {
            throw new t8(C0201.m82(28194), 102);
        }
    }

    public static l9 g(l9 l9Var, q9 q9Var, boolean z, x9 x9Var) throws t8 {
        l9 l9Var2;
        if (q9Var == null || q9Var.c() == 0) {
            throw new t8(C0201.m82(28195), 102);
        }
        l9 j = j(l9Var, q9Var.b(0).c(), z);
        if (j == null) {
            return null;
        }
        if (j.M()) {
            j.k0(false);
            l9Var2 = j;
        } else {
            l9Var2 = null;
        }
        for (int i = 1; i < q9Var.c(); i++) {
            try {
                j = k(j, q9Var.b(i), z);
                if (j == null) {
                    if (z) {
                        c(l9Var2);
                    }
                    return null;
                }
                if (j.M()) {
                    j.k0(false);
                    if (i == 1 && q9Var.b(i).d() && q9Var.b(i).a() != 0) {
                        j.v().f(q9Var.b(i).a(), true);
                    } else if (i < q9Var.c() - 1 && q9Var.b(i).b() == 1 && !j.v().m()) {
                        j.v().B(true);
                    }
                    if (l9Var2 == null) {
                        l9Var2 = j;
                    }
                }
            } catch (t8 e) {
                if (l9Var2 != null) {
                    c(l9Var2);
                }
                throw e;
            }
        }
        if (l9Var2 != null) {
            j.v().r(x9Var);
            j.m0(j.v());
        }
        return j;
    }

    private static l9 h(l9 l9Var, String str, boolean z) throws t8 {
        l9 l = l9Var.l(str);
        if (l != null || !z) {
            return l;
        }
        l9 l9Var2 = new l9(str, null);
        l9Var2.k0(true);
        l9Var.e(l9Var2);
        return l9Var2;
    }

    public static l9 i(l9 l9Var, String str, String str2, boolean z) throws t8 {
        l9 k = l9Var.k(str);
        if (k == null && z) {
            x9 x9Var = new x9();
            x9Var.A(true);
            k = new l9(str, x9Var);
            k.k0(true);
            String a = w8.a().a(str);
            if (a == null) {
                if (str2 == null || str2.length() == 0) {
                    throw new t8(C0201.m82(28196), 101);
                }
                a = w8.a().c(str, str2);
            }
            k.o0(a);
            l9Var.d(k);
        }
        return k;
    }

    public static l9 j(l9 l9Var, String str, boolean z) throws t8 {
        return i(l9Var, str, null, z);
    }

    private static l9 k(l9 l9Var, s9 s9Var, boolean z) throws t8 {
        int i;
        int b = s9Var.b();
        if (b == 1) {
            return e(l9Var, s9Var.c(), z);
        }
        if (b == 2) {
            return h(l9Var, s9Var.c().substring(1), z);
        }
        if (l9Var.v().i()) {
            if (b == 3) {
                i = f(l9Var, s9Var.c(), z);
            } else if (b == 4) {
                i = l9Var.p();
            } else if (b == 6) {
                String[] i2 = g9.i(s9Var.c());
                i = l(l9Var, i2[0], i2[1]);
            } else if (b == 5) {
                String[] i3 = g9.i(s9Var.c());
                i = n(l9Var, i3[0], i3[1], s9Var.a());
            } else {
                throw new t8(C0201.m82(28197), 9);
            }
            if (1 > i || i > l9Var.p()) {
                return null;
            }
            return l9Var.m(i);
        }
        throw new t8(C0201.m82(28198), 102);
    }

    private static int l(l9 l9Var, String str, String str2) throws t8 {
        int i = -1;
        for (int i2 = 1; i2 <= l9Var.p() && i < 0; i2++) {
            l9 m = l9Var.m(i2);
            if (m.v().q()) {
                int i3 = 1;
                while (true) {
                    if (i3 > m.p()) {
                        break;
                    }
                    l9 m2 = m.m(i3);
                    if (str.equals(m2.t()) && str2.equals(m2.I())) {
                        i = i2;
                        break;
                    }
                    i3++;
                }
            } else {
                throw new t8(C0201.m82(28199), 102);
            }
        }
        return i;
    }

    public static int m(l9 l9Var, String str) throws t8 {
        if (l9Var.v().i()) {
            for (int i = 1; i <= l9Var.p(); i++) {
                l9 m = l9Var.m(i);
                if (m.K()) {
                    if (C0201.m82(28200).equals(m.A(1).t()) && str.equals(m.A(1).I())) {
                        return i;
                    }
                }
            }
            return -1;
        }
        throw new t8(C0201.m82(28201), 102);
    }

    private static int n(l9 l9Var, String str, String str2, int i) throws t8 {
        String r0 = C0201.m82(28202);
        if (r0.equals(str)) {
            int m = m(l9Var, g9.h(str2));
            if (m >= 0 || (i & 4096) <= 0) {
                return m;
            }
            l9 l9Var2 = new l9(C0201.m82(28203), null);
            l9Var2.e(new l9(r0, C0201.m82(28204), null));
            l9Var.b(1, l9Var2);
            return 1;
        }
        for (int i2 = 1; i2 < l9Var.p(); i2++) {
            Iterator U = l9Var.m(i2).U();
            while (U.hasNext()) {
                l9 l9Var3 = (l9) U.next();
                if (str.equals(l9Var3.t()) && str2.equals(l9Var3.I())) {
                    return i2;
                }
            }
        }
        return -1;
    }

    public static void o(l9 l9Var) {
        if (l9Var.v().j()) {
            for (int i = 2; i <= l9Var.p(); i++) {
                l9 m = l9Var.m(i);
                if (m.K()) {
                    if (C0201.m82(28205).equals(m.A(1).I())) {
                        try {
                            l9Var.W(i);
                            l9Var.b(1, m);
                        } catch (t8 unused) {
                        }
                        if (i == 2) {
                            l9Var.m(2).o0(m.I());
                            return;
                        }
                        return;
                    }
                }
            }
        }
    }

    public static x9 p(x9 x9Var, Object obj) throws t8 {
        if (x9Var == null) {
            x9Var = new x9();
        }
        if (x9Var.j()) {
            x9Var.u(true);
        }
        if (x9Var.k()) {
            x9Var.v(true);
        }
        if (x9Var.l()) {
            x9Var.s(true);
        }
        if (!x9Var.m() || obj == null || obj.toString().length() <= 0) {
            x9Var.a(x9Var.d());
            return x9Var;
        }
        throw new t8(C0201.m82(28206), 103);
    }
}
