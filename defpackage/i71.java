package defpackage;

import java.io.Serializable;

/* renamed from: i71  reason: default package */
public abstract class i71<T> implements Serializable {
    public static <T> i71<T> c(T t) {
        l71.a(t);
        return new k71(t);
    }

    public static <T> i71<T> d() {
        return g71.a;
    }

    public abstract T a();

    public abstract boolean b();
}
