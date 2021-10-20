package com.facebook.react.common;

import androidx.core.util.e;

/* compiled from: ClearableSynchronizedPool */
public class a<T> implements e<T> {
    private final Object[] a;
    private int b = 0;

    public a(int i) {
        this.a = new Object[i];
    }

    @Override // androidx.core.util.e
    public synchronized boolean a(T t) {
        if (this.b == this.a.length) {
            return false;
        }
        this.a[this.b] = t;
        this.b++;
        return true;
    }

    @Override // androidx.core.util.e
    public synchronized T b() {
        if (this.b == 0) {
            return null;
        }
        int i = this.b - 1;
        this.b = i;
        T t = (T) this.a[i];
        this.a[i] = null;
        return t;
    }

    public synchronized void c() {
        for (int i = 0; i < this.b; i++) {
            this.a[i] = null;
        }
        this.b = 0;
    }
}
