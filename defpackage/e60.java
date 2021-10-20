package defpackage;

/* renamed from: e60  reason: default package */
/* compiled from: Throwables */
public final class e60 {
    public static RuntimeException a(Throwable th) {
        z50.g(th);
        c(th);
        throw new RuntimeException(th);
    }

    public static <X extends Throwable> void b(Throwable th, Class<X> cls) throws Throwable {
        if (th != null && cls.isInstance(th)) {
            throw cls.cast(th);
        }
    }

    public static void c(Throwable th) {
        b(th, Error.class);
        b(th, RuntimeException.class);
    }
}
