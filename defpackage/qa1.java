package defpackage;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* renamed from: qa1  reason: default package */
public final class qa1<K, V> extends LinkedHashMap<K, V> {
    private static final qa1 b;
    private boolean a = true;

    static {
        qa1 qa1 = new qa1();
        b = qa1;
        qa1.a = false;
    }

    private qa1() {
    }

    private static int d(Object obj) {
        if (obj instanceof byte[]) {
            return m91.b((byte[]) obj);
        }
        if (!(obj instanceof p91)) {
            return obj.hashCode();
        }
        throw new UnsupportedOperationException();
    }

    public static <K, V> qa1<K, V> e() {
        return b;
    }

    private final void g() {
        if (!this.a) {
            throw new UnsupportedOperationException();
        }
    }

    public final boolean a() {
        return this.a;
    }

    public final void b(qa1<K, V> qa1) {
        g();
        if (!qa1.isEmpty()) {
            putAll(qa1);
        }
    }

    public final void c() {
        this.a = false;
    }

    public final void clear() {
        g();
        super.clear();
    }

    @Override // java.util.LinkedHashMap, java.util.AbstractMap, java.util.Map, java.util.HashMap
    public final Set<Map.Entry<K, V>> entrySet() {
        return isEmpty() ? Collections.emptySet() : super.entrySet();
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x005c A[RETURN] */
    public final boolean equals(Object obj) {
        boolean z;
        boolean z2;
        if (obj instanceof Map) {
            Map map = (Map) obj;
            if (this != map) {
                if (size() == map.size()) {
                    Iterator<Map.Entry<K, V>> it = entrySet().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        Map.Entry<K, V> next = it.next();
                        if (map.containsKey(next.getKey())) {
                            V value = next.getValue();
                            Object obj2 = map.get(next.getKey());
                            if (!(value instanceof byte[]) || !(obj2 instanceof byte[])) {
                                z2 = value.equals(obj2);
                                continue;
                            } else {
                                z2 = Arrays.equals((byte[]) value, (byte[]) obj2);
                                continue;
                            }
                            if (!z2) {
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                }
                z = false;
                if (!z) {
                    return true;
                }
            }
            z = true;
            if (!z) {
                return false;
            }
        }
        return false;
    }

    public final qa1<K, V> f() {
        return isEmpty() ? new qa1<>() : new qa1<>(this);
    }

    public final int hashCode() {
        int i = 0;
        for (Map.Entry<K, V> entry : entrySet()) {
            i += d(entry.getValue()) ^ d(entry.getKey());
        }
        return i;
    }

    @Override // java.util.AbstractMap, java.util.Map, java.util.HashMap
    public final V put(K k, V v) {
        g();
        m91.a(k);
        m91.a(v);
        return (V) super.put(k, v);
    }

    @Override // java.util.AbstractMap, java.util.Map, java.util.HashMap
    public final void putAll(Map<? extends K, ? extends V> map) {
        g();
        for (Object obj : map.keySet()) {
            m91.a(obj);
            m91.a(map.get(obj));
        }
        super.putAll(map);
    }

    @Override // java.util.AbstractMap, java.util.Map, java.util.HashMap
    public final V remove(Object obj) {
        g();
        return (V) super.remove(obj);
    }

    private qa1(Map<K, V> map) {
        super(map);
    }
}
