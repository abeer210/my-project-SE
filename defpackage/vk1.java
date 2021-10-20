package defpackage;

import vigqyno.C0201;

/* renamed from: vk1  reason: default package */
public final class vk1 {
    private static final Class<?> a = a();

    private static Class<?> a() {
        try {
            return Class.forName(C0201.m82(30881));
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    public static wk1 b() {
        if (a != null) {
            try {
                return d(C0201.m82(30882));
            } catch (Exception unused) {
            }
        }
        return wk1.c;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0019  */
    /* JADX WARNING: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0013  */
    public static wk1 c() {
        wk1 wk1;
        if (a != null) {
            try {
                wk1 = d(C0201.m82(30883));
            } catch (Exception unused) {
            }
            if (wk1 == null) {
                wk1 = wk1.b();
            }
            return wk1 != null ? b() : wk1;
        }
        wk1 = null;
        if (wk1 == null) {
        }
        if (wk1 != null) {
        }
    }

    private static final wk1 d(String str) throws Exception {
        return (wk1) a.getDeclaredMethod(str, new Class[0]).invoke(null, new Object[0]);
    }
}
