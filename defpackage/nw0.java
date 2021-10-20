package defpackage;

import vigqyno.C0201;

/* renamed from: nw0  reason: default package */
public final class nw0 {
    private static final lw0 a = c();
    private static final lw0 b = new mw0();

    public static lw0 a() {
        return a;
    }

    public static lw0 b() {
        return b;
    }

    private static lw0 c() {
        try {
            return (lw0) Class.forName(C0201.m82(36110)).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}
