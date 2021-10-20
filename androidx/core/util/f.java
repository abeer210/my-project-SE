package androidx.core.util;

/* compiled from: Pools */
public class f<T> extends Pools$SimplePool<T> {
    private final Object c = new Object();

    public f(int i) {
        super(i);
    }

    @Override // androidx.core.util.e, androidx.core.util.Pools$SimplePool
    public boolean a(T t) {
        boolean a;
        synchronized (this.c) {
            a = super.a(t);
        }
        return a;
    }

    @Override // androidx.core.util.e, androidx.core.util.Pools$SimplePool
    public T b() {
        T t;
        synchronized (this.c) {
            t = (T) super.b();
        }
        return t;
    }
}
