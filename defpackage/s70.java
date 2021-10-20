package defpackage;

/* renamed from: s70  reason: default package */
/* compiled from: SimpleDataSource */
public class s70<T> extends l70<T> {
    private s70() {
    }

    public static <T> s70<T> u() {
        return new s70<>();
    }

    @Override // defpackage.l70
    public boolean n(Throwable th) {
        z50.g(th);
        return super.n(th);
    }

    @Override // defpackage.l70
    public boolean p(float f) {
        return super.p(f);
    }

    @Override // defpackage.l70
    public boolean r(T t, boolean z) {
        z50.g(t);
        return super.r(t, z);
    }
}
