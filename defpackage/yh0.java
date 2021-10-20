package defpackage;

/* renamed from: yh0  reason: default package */
/* compiled from: Assertions */
public class yh0 {
    public static void a(boolean z) {
        if (!z) {
            throw new AssertionError();
        }
    }

    public static void b(boolean z, String str) {
        if (!z) {
            throw new AssertionError(str);
        }
    }

    public static <T> T c(T t) {
        if (t != null) {
            return t;
        }
        throw new AssertionError();
    }

    public static <T> T d(T t, String str) {
        if (t != null) {
            return t;
        }
        throw new AssertionError(str);
    }
}
