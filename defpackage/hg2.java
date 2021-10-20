package defpackage;

import vigqyno.C0201;

/* renamed from: hg2  reason: default package */
/* compiled from: Param */
public abstract class hg2<T> {
    public T a;
    private boolean b;

    public hg2(T t) {
        this.a = t;
    }

    public boolean a() {
        return true;
    }

    public void b() {
        this.b = true;
    }

    public boolean c(hg2 hg2) {
        T t = this.a;
        T t2 = hg2.a;
        return t == t2 || qj2.a(t, t2);
    }

    public T d() {
        if (f()) {
            return this.a;
        }
        throw new RuntimeException(C0201.m82(8276));
    }

    public T e(T t) {
        return f() ? this.a : t;
    }

    public boolean f() {
        return this.a != null && !this.b;
    }
}
