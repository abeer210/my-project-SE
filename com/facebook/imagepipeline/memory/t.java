package com.facebook.imagepipeline.memory;

import java.util.HashSet;
import java.util.Set;

/* compiled from: LruBucketsPoolBackend */
public abstract class t<T> implements d0<T> {
    private final Set<T> a = new HashSet();
    private final g<T> b = new g<>();

    private T b(T t) {
        if (t != null) {
            synchronized (this) {
                this.a.remove(t);
            }
        }
        return t;
    }

    @Override // com.facebook.imagepipeline.memory.d0
    public void c(T t) {
        boolean add;
        synchronized (this) {
            add = this.a.add(t);
        }
        if (add) {
            this.b.e(a(t), t);
        }
    }

    @Override // com.facebook.imagepipeline.memory.d0
    public T get(int i) {
        T a2 = this.b.a(i);
        b(a2);
        return a2;
    }

    @Override // com.facebook.imagepipeline.memory.d0
    public T pop() {
        T f = this.b.f();
        b(f);
        return f;
    }
}
