package com.bumptech.glide.load;

import java.security.MessageDigest;
import vigqyno.C0201;

/* compiled from: Options */
public final class i implements g {
    private final r0<h<?>, Object> b = new wo();

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: java.lang.Object */
    /* JADX WARN: Multi-variable type inference failed */
    private static <T> void f(h<T> hVar, Object obj, MessageDigest messageDigest) {
        hVar.g(obj, messageDigest);
    }

    @Override // com.bumptech.glide.load.g
    public void a(MessageDigest messageDigest) {
        for (int i = 0; i < this.b.size(); i++) {
            f(this.b.i(i), this.b.m(i), messageDigest);
        }
    }

    public <T> T c(h<T> hVar) {
        return this.b.containsKey(hVar) ? (T) this.b.get(hVar) : hVar.c();
    }

    public void d(i iVar) {
        this.b.j(iVar.b);
    }

    public <T> i e(h<T> hVar, T t) {
        this.b.put(hVar, t);
        return this;
    }

    @Override // com.bumptech.glide.load.g
    public boolean equals(Object obj) {
        if (obj instanceof i) {
            return this.b.equals(((i) obj).b);
        }
        return false;
    }

    @Override // com.bumptech.glide.load.g
    public int hashCode() {
        return this.b.hashCode();
    }

    public String toString() {
        return C0201.m82(24047) + this.b + '}';
    }
}
