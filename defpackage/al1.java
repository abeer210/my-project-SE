package defpackage;

import vigqyno.C0201;

/* renamed from: al1  reason: default package */
public final class al1 {
    private static final xk1<?> a = new yk1();
    private static final xk1<?> b = a();

    private static xk1<?> a() {
        try {
            return (xk1) Class.forName(C0201.m82(26808)).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }

    public static xk1<?> b() {
        return a;
    }

    public static xk1<?> c() {
        xk1<?> xk1 = b;
        if (xk1 != null) {
            return xk1;
        }
        throw new IllegalStateException(C0201.m82(26809));
    }
}
