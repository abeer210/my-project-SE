package androidx.core.util;

import vigqyno.C0201;

public class Pools$SimplePool<T> implements e<T> {
    private final Object[] a;
    private int b;

    public Pools$SimplePool(int i) {
        if (i > 0) {
            this.a = new Object[i];
            return;
        }
        throw new IllegalArgumentException(C0201.m82(37109));
    }

    private boolean c(T t) {
        for (int i = 0; i < this.b; i++) {
            if (this.a[i] == t) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.core.util.e
    public boolean a(T t) {
        if (!c(t)) {
            int i = this.b;
            Object[] objArr = this.a;
            if (i >= objArr.length) {
                return false;
            }
            objArr[i] = t;
            this.b = i + 1;
            return true;
        }
        throw new IllegalStateException(C0201.m82(37110));
    }

    @Override // androidx.core.util.e
    public T b() {
        int i = this.b;
        if (i <= 0) {
            return null;
        }
        int i2 = i - 1;
        Object[] objArr = this.a;
        T t = (T) objArr[i2];
        objArr[i2] = null;
        this.b = i - 1;
        return t;
    }
}
