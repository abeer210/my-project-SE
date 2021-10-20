package defpackage;

/* renamed from: rk  reason: default package */
/* compiled from: SimpleResource */
public class rk<T> implements hi<T> {
    public final T a;

    public rk(T t) {
        ep.d(t);
        this.a = t;
    }

    @Override // defpackage.hi
    public final int a() {
        return 1;
    }

    @Override // defpackage.hi
    public Class<T> b() {
        return (Class<T>) this.a.getClass();
    }

    @Override // defpackage.hi
    public final T get() {
        return this.a;
    }

    @Override // defpackage.hi
    public void recycle() {
    }
}
