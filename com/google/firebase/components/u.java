package com.google.firebase.components;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* compiled from: com.google.firebase:firebase-common@@17.1.0 */
public final class u extends a {
    private final Set<Class<?>> a;
    private final Set<Class<?>> b;
    private final Set<Class<?>> c;
    private final Set<Class<?>> d;
    private final Set<Class<?>> e;
    private final e f;

    /* compiled from: com.google.firebase:firebase-common@@17.1.0 */
    private static class a implements u12 {
        public a(Set<Class<?>> set, u12 u12) {
        }
    }

    public u(d<?> dVar, e eVar) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        HashSet hashSet4 = new HashSet();
        for (n nVar : dVar.c()) {
            if (nVar.b()) {
                if (nVar.d()) {
                    hashSet3.add(nVar.a());
                } else {
                    hashSet.add(nVar.a());
                }
            } else if (nVar.d()) {
                hashSet4.add(nVar.a());
            } else {
                hashSet2.add(nVar.a());
            }
        }
        if (!dVar.f().isEmpty()) {
            hashSet.add(u12.class);
        }
        this.a = Collections.unmodifiableSet(hashSet);
        this.b = Collections.unmodifiableSet(hashSet2);
        this.c = Collections.unmodifiableSet(hashSet3);
        this.d = Collections.unmodifiableSet(hashSet4);
        this.e = dVar.f();
        this.f = eVar;
    }

    @Override // com.google.firebase.components.e, com.google.firebase.components.a
    public <T> T a(Class<T> cls) {
        if (this.a.contains(cls)) {
            T t = (T) this.f.a(cls);
            return !cls.equals(u12.class) ? t : (T) new a(this.e, t);
        }
        throw new IllegalArgumentException(String.format("Attempting to request an undeclared dependency %s.", cls));
    }

    @Override // com.google.firebase.components.e
    public <T> x12<T> b(Class<T> cls) {
        if (this.b.contains(cls)) {
            return this.f.b(cls);
        }
        throw new IllegalArgumentException(String.format("Attempting to request an undeclared dependency Provider<%s>.", cls));
    }

    @Override // com.google.firebase.components.e
    public <T> x12<Set<T>> c(Class<T> cls) {
        if (this.d.contains(cls)) {
            return this.f.c(cls);
        }
        throw new IllegalArgumentException(String.format("Attempting to request an undeclared dependency Provider<Set<%s>>.", cls));
    }

    @Override // com.google.firebase.components.e, com.google.firebase.components.a
    public <T> Set<T> d(Class<T> cls) {
        if (this.c.contains(cls)) {
            return this.f.d(cls);
        }
        throw new IllegalArgumentException(String.format("Attempting to request an undeclared dependency Set<%s>.", cls));
    }
}
