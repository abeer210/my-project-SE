package com.bumptech.glide.load;

import java.security.MessageDigest;
import vigqyno.C0201;

/* compiled from: Option */
public final class h<T> {
    private static final b<Object> e = new a();
    private final T a;
    private final b<T> b;
    private final String c;
    private volatile byte[] d;

    /* compiled from: Option */
    class a implements b<Object> {
        @Override // com.bumptech.glide.load.h.b
        public void a(byte[] bArr, Object obj, MessageDigest messageDigest) {
        }
    }

    /* compiled from: Option */
    public interface b<T> {
        void a(byte[] bArr, T t, MessageDigest messageDigest);
    }

    private h(String str, T t, b<T> bVar) {
        ep.b(str);
        this.c = str;
        this.a = t;
        ep.d(bVar);
        this.b = bVar;
    }

    public static <T> h<T> a(String str, T t, b<T> bVar) {
        return new h<>(str, t, bVar);
    }

    private static <T> b<T> b() {
        return (b<T>) e;
    }

    private byte[] d() {
        if (this.d == null) {
            this.d = this.c.getBytes(g.a);
        }
        return this.d;
    }

    public static <T> h<T> e(String str) {
        return new h<>(str, null, b());
    }

    public static <T> h<T> f(String str, T t) {
        return new h<>(str, t, b());
    }

    public T c() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj instanceof h) {
            return this.c.equals(((h) obj).c);
        }
        return false;
    }

    public void g(T t, MessageDigest messageDigest) {
        this.b.a(d(), t, messageDigest);
    }

    public int hashCode() {
        return this.c.hashCode();
    }

    public String toString() {
        return C0201.m82(23936) + this.c + '\'' + '}';
    }
}
