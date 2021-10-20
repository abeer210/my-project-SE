package defpackage;

import defpackage.kl1;
import vigqyno.C0201;

/* renamed from: jl1  reason: default package */
public final class jl1 implements sm1 {
    private static final jl1 a = new jl1();

    private jl1() {
    }

    public static jl1 c() {
        return a;
    }

    @Override // defpackage.sm1
    public final boolean a(Class<?> cls) {
        return kl1.class.isAssignableFrom(cls);
    }

    @Override // defpackage.sm1
    public final rm1 b(Class<?> cls) {
        if (!kl1.class.isAssignableFrom(cls)) {
            String r1 = C0201.m82(1201);
            String valueOf = String.valueOf(cls.getName());
            throw new IllegalArgumentException(valueOf.length() != 0 ? r1.concat(valueOf) : new String(r1));
        }
        try {
            return (rm1) kl1.q(cls.asSubclass(kl1.class)).k(kl1.f.c, null, null);
        } catch (Exception e) {
            String r2 = C0201.m82(1202);
            String valueOf2 = String.valueOf(cls.getName());
            throw new RuntimeException(valueOf2.length() != 0 ? r2.concat(valueOf2) : new String(r2), e);
        }
    }
}
