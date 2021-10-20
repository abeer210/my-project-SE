package defpackage;

import defpackage.i0;
import java.util.HashMap;
import java.util.Map;

/* renamed from: h0  reason: default package */
/* compiled from: FastSafeIterableMap */
public class h0<K, V> extends i0<K, V> {
    private HashMap<K, i0.c<K, V>> e = new HashMap<>();

    @Override // defpackage.i0
    public i0.c<K, V> b(K k) {
        return this.e.get(k);
    }

    public boolean contains(K k) {
        return this.e.containsKey(k);
    }

    @Override // defpackage.i0
    public V f(K k, V v) {
        i0.c<K, V> b = b(k);
        if (b != null) {
            return b.b;
        }
        this.e.put(k, e(k, v));
        return null;
    }

    @Override // defpackage.i0
    public V g(K k) {
        V v = (V) super.g(k);
        this.e.remove(k);
        return v;
    }

    public Map.Entry<K, V> i(K k) {
        if (contains(k)) {
            return this.e.get(k).d;
        }
        return null;
    }
}
