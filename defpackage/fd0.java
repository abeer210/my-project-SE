package defpackage;

/* renamed from: fd0  reason: default package */
/* compiled from: InstrumentedMemoryCache */
public class fd0<K, V> implements gd0<K, V> {
    private final gd0<K, V> a;
    private final id0 b;

    public fd0(gd0<K, V> gd0, id0 id0) {
        this.a = gd0;
        this.b = id0;
    }

    @Override // defpackage.gd0
    public v60<V> b(K k, v60<V> v60) {
        this.b.b();
        return this.a.b(k, v60);
    }

    @Override // defpackage.gd0
    public int c(a60<K> a60) {
        return this.a.c(a60);
    }

    @Override // defpackage.gd0
    public boolean d(a60<K> a60) {
        return this.a.d(a60);
    }

    @Override // defpackage.gd0
    public v60<V> get(K k) {
        v60<V> v60 = this.a.get(k);
        if (v60 == null) {
            this.b.c();
        } else {
            this.b.a(k);
        }
        return v60;
    }
}
