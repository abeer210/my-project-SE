package defpackage;

import vigqyno.C0201;

/* renamed from: ra1  reason: default package */
public final class ra1 {
    private static final pa1 a = c();
    private static final pa1 b = new sa1();

    public static pa1 a() {
        return a;
    }

    public static pa1 b() {
        return b;
    }

    private static pa1 c() {
        try {
            return (pa1) Class.forName(C0201.m82(35598)).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}
