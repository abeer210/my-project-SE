package defpackage;

import vigqyno.C0201;

/* renamed from: gb1  reason: default package */
public final class gb1 {
    private static final eb1 a = c();
    private static final eb1 b = new db1();

    public static eb1 a() {
        return a;
    }

    public static eb1 b() {
        return b;
    }

    private static eb1 c() {
        try {
            return (eb1) Class.forName(C0201.m82(4324)).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}
