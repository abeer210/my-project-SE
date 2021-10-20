package defpackage;

import vigqyno.C0201;

/* renamed from: qw2  reason: default package */
/* compiled from: Reflection */
public class qw2 {
    private static final rw2 a;

    static {
        rw2 rw2 = null;
        try {
            rw2 = (rw2) Class.forName(C0201.m82(15748)).newInstance();
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException unused) {
        }
        if (rw2 == null) {
            rw2 = new rw2();
        }
        a = rw2;
    }

    public static cx2 a(nw2 nw2) {
        a.a(nw2);
        return nw2;
    }

    public static ax2 b(Class cls) {
        return a.b(cls);
    }

    public static String c(pw2 pw2) {
        return a.d(pw2);
    }
}
