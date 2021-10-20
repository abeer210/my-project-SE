package defpackage;

import defpackage.l91;
import vigqyno.C0201;

/* renamed from: j91  reason: default package */
public final class j91 implements ta1 {
    private static final j91 a = new j91();

    private j91() {
    }

    public static j91 c() {
        return a;
    }

    @Override // defpackage.ta1
    public final ua1 a(Class<?> cls) {
        if (!l91.class.isAssignableFrom(cls)) {
            String r1 = C0201.m82(1365);
            String valueOf = String.valueOf(cls.getName());
            throw new IllegalArgumentException(valueOf.length() != 0 ? r1.concat(valueOf) : new String(r1));
        }
        try {
            return (ua1) l91.v(cls.asSubclass(l91.class)).q(l91.d.c, null, null);
        } catch (Exception e) {
            String r2 = C0201.m82(1366);
            String valueOf2 = String.valueOf(cls.getName());
            throw new RuntimeException(valueOf2.length() != 0 ? r2.concat(valueOf2) : new String(r2), e);
        }
    }

    @Override // defpackage.ta1
    public final boolean b(Class<?> cls) {
        return l91.class.isAssignableFrom(cls);
    }
}
