package defpackage;

import vigqyno.C0201;

/* renamed from: cn1  reason: default package */
public final class cn1 {
    private static final an1 a = c();
    private static final an1 b = new bn1();

    public static an1 a() {
        return a;
    }

    public static an1 b() {
        return b;
    }

    private static an1 c() {
        try {
            return (an1) Class.forName(C0201.m82(16763)).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}
