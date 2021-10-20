package defpackage;

import vigqyno.C0201;

/* renamed from: vj1  reason: default package */
public final class vj1 {
    private static final Class<?> a = c(C0201.m82(33506));
    private static final boolean b = (c(C0201.m82(33507)) != null);

    public static boolean a() {
        return a != null && !b;
    }

    public static Class<?> b() {
        return a;
    }

    private static <T> Class<T> c(String str) {
        try {
            return (Class<T>) Class.forName(str);
        } catch (Throwable unused) {
            return null;
        }
    }
}
