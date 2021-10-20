package com.google.firebase.components;

/* compiled from: com.google.firebase:firebase-common@@17.1.0 */
public class s<T> implements x12<T> {
    private static final Object c = new Object();
    private volatile Object a = c;
    private volatile x12<T> b;

    public s(x12<T> x12) {
        this.b = x12;
    }

    @Override // defpackage.x12
    public T get() {
        T t = (T) this.a;
        if (t == c) {
            synchronized (this) {
                t = this.a;
                if (t == c) {
                    t = this.b.get();
                    this.a = t;
                    this.b = null;
                }
            }
        }
        return t;
    }
}
