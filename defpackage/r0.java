package defpackage;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* renamed from: r0  reason: default package */
/* compiled from: ArrayMap */
public class r0<K, V> extends x0<K, V> implements Map<K, V> {
    public w0<K, V> h;

    /* access modifiers changed from: package-private */
    /* renamed from: r0$a */
    /* compiled from: ArrayMap */
    public class a extends w0<K, V> {
        public a() {
        }

        @Override // defpackage.w0
        public void a() {
            r0.this.clear();
        }

        @Override // defpackage.w0
        public Object b(int i, int i2) {
            return r0.this.b[(i << 1) + i2];
        }

        @Override // defpackage.w0
        public Map<K, V> c() {
            return r0.this;
        }

        @Override // defpackage.w0
        public int d() {
            return r0.this.c;
        }

        @Override // defpackage.w0
        public int e(Object obj) {
            return r0.this.f(obj);
        }

        @Override // defpackage.w0
        public int f(Object obj) {
            return r0.this.h(obj);
        }

        @Override // defpackage.w0
        public void g(K k, V v) {
            r0.this.put(k, v);
        }

        @Override // defpackage.w0
        public void h(int i) {
            r0.this.k(i);
        }

        @Override // defpackage.w0
        public V i(int i, V v) {
            return (V) r0.this.l(i, v);
        }
    }

    public r0() {
    }

    private w0<K, V> n() {
        if (this.h == null) {
            this.h = new a();
        }
        return this.h;
    }

    @Override // java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        return n().l();
    }

    @Override // java.util.Map
    public Set<K> keySet() {
        return n().m();
    }

    public boolean o(Collection<?> collection) {
        return w0.p(this, collection);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: r0<K, V> */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map
    public void putAll(Map<? extends K, ? extends V> map) {
        c(this.c + map.size());
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map
    public Collection<V> values() {
        return n().n();
    }

    public r0(int i) {
        super(i);
    }

    public r0(x0 x0Var) {
        super(x0Var);
    }
}
