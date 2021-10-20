package defpackage;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import vigqyno.C0201;

/* renamed from: g42  reason: default package */
/* compiled from: TypeToken */
public class g42<T> {
    public final Class<? super T> a;
    public final Type b;
    public final int c = this.b.hashCode();

    public g42() {
        Type d = d(g42.class);
        this.b = d;
        this.a = (Class<? super T>) f32.k(d);
    }

    public static <T> g42<T> a(Class<T> cls) {
        return new g42<>(cls);
    }

    public static g42<?> b(Type type) {
        return new g42<>(type);
    }

    public static Type d(Class<?> cls) {
        Type genericSuperclass = cls.getGenericSuperclass();
        if (!(genericSuperclass instanceof Class)) {
            return f32.b(((ParameterizedType) genericSuperclass).getActualTypeArguments()[0]);
        }
        throw new RuntimeException(C0201.m82(11025));
    }

    public final Class<? super T> c() {
        return this.a;
    }

    public final Type e() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof g42) && f32.f(this.b, ((g42) obj).b);
    }

    public final int hashCode() {
        return this.c;
    }

    public final String toString() {
        return f32.u(this.b);
    }

    public g42(Type type) {
        e32.b(type);
        Type b2 = f32.b(type);
        this.b = b2;
        this.a = (Class<? super T>) f32.k(b2);
    }
}
