package defpackage;

import defpackage.kv0;
import vigqyno.C0201;

/* renamed from: jv0  reason: default package */
public final class jv0 implements pw0 {
    private static final jv0 a = new jv0();

    private jv0() {
    }

    public static jv0 c() {
        return a;
    }

    @Override // defpackage.pw0
    public final ow0 a(Class<?> cls) {
        if (!kv0.class.isAssignableFrom(cls)) {
            String r1 = C0201.m82(29235);
            String valueOf = String.valueOf(cls.getName());
            throw new IllegalArgumentException(valueOf.length() != 0 ? r1.concat(valueOf) : new String(r1));
        }
        try {
            return (ow0) kv0.s(cls.asSubclass(kv0.class)).l(kv0.e.c, null, null);
        } catch (Exception e) {
            String r2 = C0201.m82(29236);
            String valueOf2 = String.valueOf(cls.getName());
            throw new RuntimeException(valueOf2.length() != 0 ? r2.concat(valueOf2) : new String(r2), e);
        }
    }

    @Override // defpackage.pw0
    public final boolean b(Class<?> cls) {
        return kv0.class.isAssignableFrom(cls);
    }
}
