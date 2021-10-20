package defpackage;

import defpackage.l91;
import vigqyno.C0201;

/* renamed from: ia1  reason: default package */
public final class ia1 implements pb1 {
    private static final ta1 b = new la1();
    private final ta1 a;

    public ia1() {
        this(new ka1(j91.c(), c()));
    }

    private static boolean b(ua1 ua1) {
        return ua1.c() == l91.d.i;
    }

    private static ta1 c() {
        try {
            return (ta1) Class.forName(C0201.m82(22456)).getDeclaredMethod(C0201.m82(22457), new Class[0]).invoke(null, new Object[0]);
        } catch (Exception unused) {
            return b;
        }
    }

    @Override // defpackage.pb1
    public final <T> lb1<T> a(Class<T> cls) {
        nb1.A(cls);
        ua1 a2 = this.a.a(cls);
        if (a2.b()) {
            if (l91.class.isAssignableFrom(cls)) {
                return cb1.k(nb1.X(), c91.b(), a2.a());
            }
            return cb1.k(nb1.V(), c91.c(), a2.a());
        } else if (l91.class.isAssignableFrom(cls)) {
            if (b(a2)) {
                return ab1.q(cls, a2, gb1.b(), fa1.e(), nb1.X(), c91.b(), ra1.b());
            }
            return ab1.q(cls, a2, gb1.b(), fa1.e(), nb1.X(), null, ra1.b());
        } else if (b(a2)) {
            return ab1.q(cls, a2, gb1.a(), fa1.d(), nb1.V(), c91.c(), ra1.a());
        } else {
            return ab1.q(cls, a2, gb1.a(), fa1.d(), nb1.W(), null, ra1.a());
        }
    }

    private ia1(ta1 ta1) {
        m91.e(ta1, C0201.m82(22455));
        this.a = ta1;
    }
}
