package defpackage;

import vigqyno.C0201;

/* renamed from: w81  reason: default package */
public final class w81 {
    private static final Class<?> a = b();

    private static final y81 a(String str) throws Exception {
        return (y81) a.getDeclaredMethod(str, new Class[0]).invoke(null, new Object[0]);
    }

    private static Class<?> b() {
        try {
            return Class.forName(C0201.m82(29164));
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    public static y81 c() {
        if (a != null) {
            try {
                return a(C0201.m82(29165));
            } catch (Exception unused) {
            }
        }
        return y81.d;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0019  */
    /* JADX WARNING: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0013  */
    public static y81 d() {
        y81 y81;
        if (a != null) {
            try {
                y81 = a(C0201.m82(29166));
            } catch (Exception unused) {
            }
            if (y81 == null) {
                y81 = y81.b();
            }
            return y81 != null ? c() : y81;
        }
        y81 = null;
        if (y81 == null) {
        }
        if (y81 != null) {
        }
    }
}
