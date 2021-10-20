package defpackage;

import defpackage.kv0;
import vigqyno.C0201;

/* renamed from: fw0  reason: default package */
public final class fw0 implements jx0 {
    private static final pw0 b = new gw0();
    private final pw0 a;

    public fw0() {
        this(new hw0(jv0.c(), c()));
    }

    private fw0(pw0 pw0) {
        mv0.e(pw0, C0201.m82(15411));
        this.a = pw0;
    }

    private static boolean b(ow0 ow0) {
        return ow0.o() == kv0.e.i;
    }

    private static pw0 c() {
        try {
            return (pw0) Class.forName(C0201.m82(15412)).getDeclaredMethod(C0201.m82(15413), new Class[0]).invoke(null, new Object[0]);
        } catch (Exception unused) {
            return b;
        }
    }

    @Override // defpackage.jx0
    public final <T> ix0<T> a(Class<T> cls) {
        kx0.I(cls);
        ow0 a2 = this.a.a(cls);
        if (a2.p()) {
            return kv0.class.isAssignableFrom(cls) ? ww0.c(kx0.B(), av0.b(), a2.n()) : ww0.c(kx0.z(), av0.c(), a2.n());
        }
        if (kv0.class.isAssignableFrom(cls)) {
            boolean b2 = b(a2);
            yw0 b3 = ax0.b();
            aw0 d = aw0.d();
            ay0<?, ?> B = kx0.B();
            return b2 ? uw0.t(cls, a2, b3, d, B, av0.b(), nw0.b()) : uw0.t(cls, a2, b3, d, B, null, nw0.b());
        }
        boolean b4 = b(a2);
        yw0 a3 = ax0.a();
        aw0 c = aw0.c();
        return b4 ? uw0.t(cls, a2, a3, c, kx0.z(), av0.c(), nw0.a()) : uw0.t(cls, a2, a3, c, kx0.A(), null, nw0.a());
    }
}
