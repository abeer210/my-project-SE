package defpackage;

import vigqyno.C0201;

/* renamed from: qm1  reason: default package */
public final class qm1 {
    private static final om1 a = c();
    private static final om1 b = new pm1();

    public static om1 a() {
        return a;
    }

    public static om1 b() {
        return b;
    }

    private static om1 c() {
        try {
            return (om1) Class.forName(C0201.m82(32137)).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}
