package defpackage;

/* renamed from: wo  reason: default package */
/* compiled from: CachedHashCodeArrayMap */
public final class wo<K, V> extends r0<K, V> {
    private int i;

    @Override // defpackage.x0
    public void clear() {
        this.i = 0;
        super.clear();
    }

    @Override // defpackage.x0
    public int hashCode() {
        if (this.i == 0) {
            this.i = super.hashCode();
        }
        return this.i;
    }

    @Override // defpackage.x0
    public void j(x0<? extends K, ? extends V> x0Var) {
        this.i = 0;
        super.j(x0Var);
    }

    @Override // defpackage.x0
    public V k(int i2) {
        this.i = 0;
        return (V) super.k(i2);
    }

    @Override // defpackage.x0
    public V l(int i2, V v) {
        this.i = 0;
        return (V) super.l(i2, v);
    }

    @Override // java.util.Map, defpackage.x0
    public V put(K k, V v) {
        this.i = 0;
        return (V) super.put(k, v);
    }
}
