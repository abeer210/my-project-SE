package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: xc0  reason: default package */
/* compiled from: CountingLruMap */
public class xc0<K, V> {
    private final md0<V> a;
    private final LinkedHashMap<K, V> b = new LinkedHashMap<>();
    private int c = 0;

    public xc0(md0<V> md0) {
        this.a = md0;
    }

    private int g(V v) {
        if (v == null) {
            return 0;
        }
        return this.a.a(v);
    }

    public synchronized boolean a(K k) {
        return this.b.containsKey(k);
    }

    public synchronized V b(K k) {
        return this.b.get(k);
    }

    public synchronized int c() {
        return this.b.size();
    }

    public synchronized K d() {
        return this.b.isEmpty() ? null : this.b.keySet().iterator().next();
    }

    public synchronized ArrayList<Map.Entry<K, V>> e(a60<K> a60) {
        ArrayList<Map.Entry<K, V>> arrayList;
        arrayList = new ArrayList<>(this.b.entrySet().size());
        for (Map.Entry<K, V> entry : this.b.entrySet()) {
            if (a60 == null || a60.a(entry.getKey())) {
                arrayList.add(entry);
            }
        }
        return arrayList;
    }

    public synchronized int f() {
        return this.c;
    }

    public synchronized V h(K k, V v) {
        V remove;
        remove = this.b.remove(k);
        this.c -= g(remove);
        this.b.put(k, v);
        this.c += g(v);
        return remove;
    }

    public synchronized V i(K k) {
        V remove;
        remove = this.b.remove(k);
        this.c -= g(remove);
        return remove;
    }

    public synchronized ArrayList<V> j(a60<K> a60) {
        ArrayList<V> arrayList;
        arrayList = new ArrayList<>();
        Iterator<Map.Entry<K, V>> it = this.b.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<K, V> next = it.next();
            if (a60 == null || a60.a(next.getKey())) {
                arrayList.add(next.getValue());
                this.c -= g(next.getValue());
                it.remove();
            }
        }
        return arrayList;
    }
}
