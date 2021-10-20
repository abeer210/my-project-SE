package defpackage;

import vigqyno.C0201;

/* renamed from: vu0  reason: default package */
public final class vu0 {
    private static final Class<?> a = a();

    private static Class<?> a() {
        try {
            return Class.forName(C0201.m82(19830));
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    public static wu0 b() {
        Class<?> cls = a;
        if (cls != null) {
            try {
                return (wu0) cls.getDeclaredMethod(C0201.m82(19831), new Class[0]).invoke(null, new Object[0]);
            } catch (Exception unused) {
            }
        }
        return wu0.a;
    }
}
