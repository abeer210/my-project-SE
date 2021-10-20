package defpackage;

/* renamed from: qj2  reason: default package */
/* compiled from: ObjectUtils */
public class qj2 {
    public static <T> boolean a(T t, T t2) {
        return t != null && t.equals(t2);
    }

    public static boolean b(Object obj) {
        return obj != null;
    }

    public static <T, S> S c(T t, S s, hj2<T, S> hj2) {
        return t == null ? s : hj2.a(t);
    }

    public static <T> void d(T t, fj2<T> fj2) {
        if (t != null) {
            fj2.a(t);
        }
    }

    public static <T> T e(T t, T t2) {
        return t == null ? t2 : t;
    }
}
