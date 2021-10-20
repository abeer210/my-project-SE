package defpackage;

import vigqyno.C0201;

/* renamed from: zt0  reason: default package */
public final class zt0 {
    private static final Class<?> a = a(C0201.m82(28691));
    private static final boolean b = (a(C0201.m82(28692)) != null);

    private static <T> Class<T> a(String str) {
        try {
            return (Class<T>) Class.forName(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static boolean b() {
        return a != null && !b;
    }

    public static Class<?> c() {
        return a;
    }
}
