package com.google.firebase.components;

import com.google.android.gms.common.internal.u;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* compiled from: com.google.firebase:firebase-common@@17.1.0 */
public final class d<T> {
    private final Set<Class<? super T>> a;
    private final Set<n> b;
    private final int c;
    private final int d;
    private final g<T> e;
    private final Set<Class<?>> f;

    /* compiled from: com.google.firebase:firebase-common@@17.1.0 */
    public static class b<T> {
        private final Set<Class<? super T>> a;
        private final Set<n> b;
        private int c;
        private int d;
        private g<T> e;
        private Set<Class<?>> f;

        /* access modifiers changed from: private */
        /* access modifiers changed from: public */
        private b<T> g() {
            this.d = 1;
            return this;
        }

        private b<T> h(int i) {
            u.o(this.c == 0, "Instantiation type has already been set.");
            this.c = i;
            return this;
        }

        private void i(Class<?> cls) {
            u.b(!this.a.contains(cls), "Components are not allowed to depend on interfaces they themselves provide.");
        }

        public b<T> b(n nVar) {
            u.l(nVar, "Null dependency");
            i(nVar.a());
            this.b.add(nVar);
            return this;
        }

        public b<T> c() {
            h(1);
            return this;
        }

        public d<T> d() {
            u.o(this.e != null, "Missing required property: factory.");
            return new d<>(new HashSet(this.a), new HashSet(this.b), this.c, this.d, this.e, this.f);
        }

        public b<T> e() {
            h(2);
            return this;
        }

        public b<T> f(g<T> gVar) {
            u.l(gVar, "Null factory");
            this.e = gVar;
            return this;
        }

        @SafeVarargs
        private b(Class<T> cls, Class<? super T>... clsArr) {
            this.a = new HashSet();
            this.b = new HashSet();
            this.c = 0;
            this.d = 0;
            this.f = new HashSet();
            u.l(cls, "Null interface");
            this.a.add(cls);
            for (Class<? super T> cls2 : clsArr) {
                u.l(cls2, "Null interface");
            }
            Collections.addAll(this.a, clsArr);
        }
    }

    public static <T> b<T> a(Class<T> cls) {
        return new b<>(cls, new Class[0]);
    }

    @SafeVarargs
    public static <T> b<T> b(Class<T> cls, Class<? super T>... clsArr) {
        return new b<>(cls, clsArr);
    }

    public static <T> d<T> g(T t, Class<T> cls) {
        b h = h(cls);
        h.f(c.b(t));
        return h.d();
    }

    public static <T> b<T> h(Class<T> cls) {
        b<T> a2 = a(cls);
        a2.g();
        return a2;
    }

    public static /* synthetic */ Object l(Object obj, e eVar) {
        return obj;
    }

    public static /* synthetic */ Object m(Object obj, e eVar) {
        return obj;
    }

    @SafeVarargs
    public static <T> d<T> n(T t, Class<T> cls, Class<? super T>... clsArr) {
        b b2 = b(cls, clsArr);
        b2.f(b.b(t));
        return b2.d();
    }

    public Set<n> c() {
        return this.b;
    }

    public g<T> d() {
        return this.e;
    }

    public Set<Class<? super T>> e() {
        return this.a;
    }

    public Set<Class<?>> f() {
        return this.f;
    }

    public boolean i() {
        return this.c == 1;
    }

    public boolean j() {
        return this.c == 2;
    }

    public boolean k() {
        return this.d == 0;
    }

    public String toString() {
        return "Component<" + Arrays.toString(this.a.toArray()) + ">{" + this.c + ", type=" + this.d + ", deps=" + Arrays.toString(this.b.toArray()) + "}";
    }

    private d(Set<Class<? super T>> set, Set<n> set2, int i, int i2, g<T> gVar, Set<Class<?>> set3) {
        this.a = Collections.unmodifiableSet(set);
        this.b = Collections.unmodifiableSet(set2);
        this.c = i;
        this.d = i2;
        this.e = gVar;
        this.f = Collections.unmodifiableSet(set3);
    }
}
