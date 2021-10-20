package defpackage;

import java.util.Calendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import vigqyno.C0201;

/* renamed from: n9  reason: default package */
public class n9 {
    private static Map a;
    public static final String b = null;
    public static final String c = null;
    public static final String d = null;
    public static final String e = null;
    public static final String f = null;
    public static final String g = null;
    public static final String h = null;
    public static final String i = null;
    public static final String j = null;
    public static final String k = null;
    public static final String l = null;
    public static final String m = null;

    static {
        C0201.m83(n9.class, 94);
        d();
    }

    private static void a(l9 l9Var, l9 l9Var2, boolean z) throws t8 {
        boolean equals = l9Var.I().equals(l9Var2.I());
        String r2 = C0201.m82(30316);
        if (!equals || l9Var.p() != l9Var2.p()) {
            throw new t8(r2, 203);
        } else if (z || (l9Var.t().equals(l9Var2.t()) && l9Var.v().equals(l9Var2.v()) && l9Var.E() == l9Var2.E())) {
            Iterator S = l9Var.S();
            Iterator S2 = l9Var2.S();
            while (S.hasNext() && S2.hasNext()) {
                a((l9) S.next(), (l9) S2.next(), false);
            }
            Iterator U = l9Var.U();
            Iterator U2 = l9Var2.U();
            while (U.hasNext() && U2.hasNext()) {
                a((l9) U.next(), (l9) U2.next(), false);
            }
        } else {
            throw new t8(r2, 203);
        }
    }

    private static void b(l9 l9Var) {
        Iterator S = l9Var.S();
        while (S.hasNext()) {
            if (!((l9) S.next()).J()) {
                S.remove();
            }
        }
    }

    private static void c(l9 l9Var) throws t8 {
        l9 e2 = m9.e(l9Var, C0201.m82(30317), false);
        if (e2 != null) {
            try {
                s8 b2 = y8.b(e2.I());
                if (b2.getYear() != 0 || b2.getMonth() != 0) {
                    return;
                }
                if (b2.getDay() == 0) {
                    l9 e3 = m9.e(l9Var, C0201.m82(30318), false);
                    if (e3 == null) {
                        e3 = m9.e(l9Var, C0201.m82(30319), false);
                    }
                    s8 b3 = y8.b(e3.I());
                    Calendar Q = b2.Q();
                    Q.set(1, b3.getYear());
                    Q.set(2, b3.getMonth());
                    Q.set(5, b3.getDay());
                    e2.o0(y8.a(new h9(Q)));
                }
            } catch (t8 unused) {
            }
        }
    }

    private static void d() {
        a = new HashMap();
        x9 x9Var = new x9();
        x9Var.s(true);
        a.put(C0201.m82(30320), x9Var);
        a.put(C0201.m82(30321), x9Var);
        a.put(C0201.m82(30322), x9Var);
        a.put(C0201.m82(30323), x9Var);
        a.put(C0201.m82(30324), x9Var);
        a.put(C0201.m82(30325), x9Var);
        x9 x9Var2 = new x9();
        x9Var2.s(true);
        x9Var2.v(true);
        a.put(C0201.m82(30326), x9Var2);
        a.put(C0201.m82(30327), x9Var2);
        x9 x9Var3 = new x9();
        x9Var3.s(true);
        x9Var3.v(true);
        x9Var3.u(true);
        x9Var3.t(true);
        a.put(C0201.m82(30328), x9Var3);
        a.put(C0201.m82(30329), x9Var3);
        a.put(C0201.m82(30330), x9Var3);
    }

    private static void e(v8 v8Var, l9 l9Var) {
        String str;
        String str2 = j;
        try {
            l9 j2 = m9.j(((j9) v8Var).a(), m, true);
            String I = l9Var.I();
            String str3 = c;
            l9 e2 = m9.e(j2, e, false);
            if (e2 != null) {
                if (e2.J()) {
                    int m2 = m9.m(e2, str2);
                    if (m2 < 0) {
                        v8Var.g0(l, d, g, h, e2.m(1).I(), null);
                        m2 = m9.m(e2, str2);
                    }
                    l9 m3 = e2.m(m2);
                    String I2 = m3.I();
                    int indexOf = I2.indexOf(str3);
                    if (indexOf < 0) {
                        if (!I.equals(I2)) {
                            str = I2 + str3 + I;
                        }
                        l9Var.x().X(l9Var);
                    }
                    int i2 = indexOf + 2;
                    if (!I2.substring(i2).equals(I)) {
                        str = I2.substring(0, i2) + I;
                    }
                    l9Var.x().X(l9Var);
                    m3.o0(str);
                    l9Var.x().X(l9Var);
                }
            }
            v8Var.g0(i, f, k, b, str3 + I, null);
            l9Var.x().X(l9Var);
        } catch (t8 unused) {
        }
    }

    private static void f(l9 l9Var, w9 w9Var) throws t8 {
        if (l9Var.q()) {
            l9Var.g0(false);
            boolean m2 = w9Var.m();
            for (l9 l9Var2 : l9Var.H()) {
                if (l9Var2.q()) {
                    Iterator S = l9Var2.S();
                    while (S.hasNext()) {
                        l9 l9Var3 = (l9) S.next();
                        if (l9Var3.L()) {
                            l9Var3.c0(false);
                            y9 d2 = w8.a().d(l9Var3.t());
                            if (d2 != null) {
                                l9 l9Var4 = null;
                                l9 i2 = m9.i(l9Var, d2.a(), null, true);
                                i2.k0(false);
                                l9 e2 = m9.e(i2, d2.b() + d2.c(), false);
                                if (e2 == null) {
                                    if (d2.d().j()) {
                                        l9Var3.l0(d2.b() + d2.c());
                                        i2.d(l9Var3);
                                    } else {
                                        l9 l9Var5 = new l9(d2.b() + d2.c(), d2.d().m());
                                        i2.d(l9Var5);
                                        k(S, l9Var3, l9Var5);
                                    }
                                } else if (!d2.d().j()) {
                                    if (d2.d().i()) {
                                        int m3 = m9.m(e2, C0201.m82(30331));
                                        if (m3 != -1) {
                                            l9Var4 = e2.m(m3);
                                        }
                                    } else if (e2.J()) {
                                        l9Var4 = e2.m(1);
                                    }
                                    if (l9Var4 == null) {
                                        k(S, l9Var3, e2);
                                    } else if (m2) {
                                        a(l9Var3, l9Var4, true);
                                    }
                                } else if (m2) {
                                    a(l9Var3, e2, true);
                                }
                                S.remove();
                            }
                        }
                    }
                    l9Var2.g0(false);
                }
            }
        }
    }

    private static void g(l9 l9Var) throws t8 {
        for (int i2 = 1; i2 <= l9Var.p(); i2++) {
            l9 m2 = l9Var.m(i2);
            x9 x9Var = (x9) a.get(m2.t());
            if (x9Var != null) {
                if (m2.v().p()) {
                    l9 l9Var2 = new l9(m2.t(), x9Var);
                    m2.l0(C0201.m82(30332));
                    l9Var2.d(m2);
                    l9Var.b0(i2, l9Var2);
                    if (x9Var.j() && !m2.v().h()) {
                        m2.e(new l9(C0201.m82(30333), C0201.m82(30334), null));
                    }
                } else {
                    m2.v().f(7680, false);
                    m2.v().r(x9Var);
                    if (x9Var.j()) {
                        i(m2);
                    }
                }
            }
        }
    }

    public static v8 h(j9 j9Var, w9 w9Var) throws t8 {
        l9 a2 = j9Var.a();
        j(j9Var);
        f(a2, w9Var);
        l(a2);
        b(a2);
        return j9Var;
    }

    private static void i(l9 l9Var) throws t8 {
        if (l9Var != null && l9Var.v().i()) {
            x9 v = l9Var.v();
            v.v(true);
            v.u(true);
            v.t(true);
            Iterator S = l9Var.S();
            while (S.hasNext()) {
                l9 l9Var2 = (l9) S.next();
                if (!l9Var2.v().m()) {
                    if (!l9Var2.v().h()) {
                        String I = l9Var2.I();
                        if (!(I == null || I.length() == 0)) {
                            l9Var2.e(new l9(C0201.m82(30335), C0201.m82(30336), null));
                        }
                    }
                }
                S.remove();
            }
        }
    }

    private static void j(j9 j9Var) throws t8 {
        l9 e2;
        l9 a2 = j9Var.a();
        String r1 = C0201.m82(30337);
        m9.j(a2, r1, true);
        Iterator S = j9Var.a().S();
        while (S.hasNext()) {
            l9 l9Var = (l9) S.next();
            if (r1.equals(l9Var.t())) {
                g(l9Var);
            } else {
                if (C0201.m82(30338).equals(l9Var.t())) {
                    c(l9Var);
                    e2 = m9.e(l9Var, C0201.m82(30339), false);
                    if (e2 == null) {
                    }
                } else {
                    if (C0201.m82(30340).equals(l9Var.t())) {
                        l9 e3 = m9.e(l9Var, C0201.m82(30341), false);
                        if (e3 != null) {
                            e(j9Var, e3);
                        }
                    } else {
                        if (C0201.m82(30342).equals(l9Var.t())) {
                            e2 = m9.e(l9Var, C0201.m82(30343), false);
                            if (e2 == null) {
                            }
                        }
                    }
                }
                i(e2);
            }
        }
    }

    private static void k(Iterator it, l9 l9Var, l9 l9Var2) throws t8 {
        if (l9Var2.v().j()) {
            if (!l9Var.v().h()) {
                l9Var.e(new l9(C0201.m82(30344), C0201.m82(30345), null));
            } else {
                throw new t8(C0201.m82(30346), 203);
            }
        }
        it.remove();
        l9Var.l0(C0201.m82(30347));
        l9Var2.d(l9Var);
    }

    private static void l(l9 l9Var) throws t8 {
        if (l9Var.t() != null && l9Var.t().length() >= 36) {
            String lowerCase = l9Var.t().toLowerCase();
            String r1 = C0201.m82(30348);
            if (lowerCase.startsWith(r1)) {
                lowerCase = lowerCase.substring(5);
            }
            if (g9.a(lowerCase)) {
                l9 g2 = m9.g(l9Var, r9.a(C0201.m82(30349), C0201.m82(30350)), true, null);
                if (g2 != null) {
                    g2.m0(null);
                    g2.o0(r1 + lowerCase);
                    g2.Y();
                    g2.a0();
                    l9Var.l0(null);
                    return;
                }
                throw new t8(C0201.m82(30351), 9);
            }
        }
    }
}
