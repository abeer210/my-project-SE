package defpackage;

/* renamed from: e32  reason: default package */
/* compiled from: $Gson$Preconditions */
public final class e32 {
    public static void a(boolean z) {
        if (!z) {
            throw new IllegalArgumentException();
        }
    }

    public static <T> T b(T t) {
        if (t != null) {
            return t;
        }
        throw null;
    }
}
