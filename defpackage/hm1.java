package defpackage;

import defpackage.kl1;
import vigqyno.C0201;

/* renamed from: hm1  reason: default package */
public final class hm1 implements jn1 {
    private static final sm1 b = new im1();
    private final sm1 a;

    public hm1() {
        this(new jm1(jl1.c(), c()));
    }

    private static boolean b(rm1 rm1) {
        return rm1.b() == kl1.f.i;
    }

    private static sm1 c() {
        try {
            return (sm1) Class.forName(C0201.m82(23032)).getDeclaredMethod(C0201.m82(23033), new Class[0]).invoke(null, new Object[0]);
        } catch (Exception unused) {
            return b;
        }
    }

    @Override // defpackage.jn1
    public final <T> in1<T> a(Class<T> cls) {
        kn1.x(cls);
        rm1 b2 = this.a.b(cls);
        if (b2.c()) {
            if (kl1.class.isAssignableFrom(cls)) {
                return ym1.j(kn1.A(), al1.b(), b2.a());
            }
            return ym1.j(kn1.y(), al1.c(), b2.a());
        } else if (kl1.class.isAssignableFrom(cls)) {
            if (b(b2)) {
                return xm1.k(cls, b2, cn1.b(), cm1.e(), kn1.A(), al1.b(), qm1.b());
            }
            return xm1.k(cls, b2, cn1.b(), cm1.e(), kn1.A(), null, qm1.b());
        } else if (b(b2)) {
            return xm1.k(cls, b2, cn1.a(), cm1.d(), kn1.y(), al1.c(), qm1.a());
        } else {
            return xm1.k(cls, b2, cn1.a(), cm1.d(), kn1.z(), null, qm1.a());
        }
    }

    private hm1(sm1 sm1) {
        nl1.e(sm1, C0201.m82(23031));
        this.a = sm1;
    }
}
