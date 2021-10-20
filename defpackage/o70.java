package defpackage;

/* renamed from: o70  reason: default package */
/* compiled from: DataSources */
public class o70 {

    /* renamed from: o70$a */
    /* compiled from: DataSources */
    static class a implements c60<n70<T>> {
        public final /* synthetic */ Throwable a;

        public a(Throwable th) {
            this.a = th;
        }

        /* renamed from: a */
        public n70<T> get() {
            return o70.b(this.a);
        }
    }

    public static <T> c60<n70<T>> a(Throwable th) {
        return new a(th);
    }

    public static <T> n70<T> b(Throwable th) {
        s70 u = s70.u();
        u.n(th);
        return u;
    }
}
