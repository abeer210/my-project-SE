package defpackage;

import vigqyno.C0201;

/* renamed from: av0  reason: default package */
public final class av0 {
    private static final xu0<?> a = new yu0();
    private static final xu0<?> b = a();

    private static xu0<?> a() {
        try {
            return (xu0) Class.forName(C0201.m82(14211)).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }

    public static xu0<?> b() {
        return a;
    }

    public static xu0<?> c() {
        xu0<?> xu0 = b;
        if (xu0 != null) {
            return xu0;
        }
        throw new IllegalStateException(C0201.m82(14212));
    }
}
