package defpackage;

import vigqyno.C0201;

/* renamed from: ax0  reason: default package */
public final class ax0 {
    private static final yw0 a = c();
    private static final yw0 b = new zw0();

    public static yw0 a() {
        return a;
    }

    public static yw0 b() {
        return b;
    }

    private static yw0 c() {
        try {
            return (yw0) Class.forName(C0201.m82(19455)).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}
