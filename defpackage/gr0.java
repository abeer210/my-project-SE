package defpackage;

@Deprecated
/* renamed from: gr0  reason: default package */
public abstract class gr0<T> {
    private final T a;

    @Deprecated
    /* renamed from: gr0$a */
    public static class a extends gr0<Boolean> {
        public a(int i, String str, Boolean bool) {
            super(i, str, bool);
        }
    }

    private gr0(int i, String str, T t) {
        this.a = t;
        ir0.a().a(this);
    }

    @Deprecated
    public static a a(int i, String str, Boolean bool) {
        return new a(i, str, bool);
    }
}
