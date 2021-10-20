package defpackage;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* renamed from: kw0  reason: default package */
public final class kw0<K, V> extends LinkedHashMap<K, V> {
    private static final kw0 b;
    private boolean a = true;

    static {
        kw0 kw0 = new kw0();
        b = kw0;
        kw0.a = false;
    }

    private kw0() {
    }

    private kw0(Map<K, V> map) {
        super(map);
    }

    public static <K, V> kw0<K, V> c() {
        return b;
    }

    private final void e() {
        if (!this.a) {
            throw new UnsupportedOperationException();
        }
    }

    private static int f(Object obj) {
        if (obj instanceof byte[]) {
            return mv0.b((byte[]) obj);
        }
        if (!(obj instanceof nv0)) {
            return obj.hashCode();
        }
        throw new UnsupportedOperationException();
    }

    public final boolean a() {
        return this.a;
    }

    public final void b(kw0<K, V> kw0) {
        e();
        if (!kw0.isEmpty()) {
            putAll(kw0);
        }
    }

    public final void clear() {
        e();
        super.clear();
    }

    public final kw0<K, V> d() {
        return isEmpty() ? new kw0<>() : new kw0<>(this);
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

    public final void g() {
        this.a = false;
    }

    public final int hashCode() {
        int i = 0;
        for (Map.Entry<K, V> entry : entrySet()) {
            i += f(entry.getValue()) ^ f(entry.getKey());
        }
        return i;
    }

    @Override // java.util.AbstractMap, java.util.Map, java.util.HashMap
    public final V put(K k, V v) {
        e();
        mv0.a(k);
        mv0.a(v);
        return (V) super.put(k, v);
    }

    @Override // java.util.AbstractMap, java.util.Map, java.util.HashMap
    public final void putAll(Map<? extends K, ? extends V> map) {
        e();
        for (Object obj : map.keySet()) {
            mv0.a(obj);
            mv0.a(map.get(obj));
        }
        super.putAll(map);
    }

    @Override // java.util.AbstractMap, java.util.Map, java.util.HashMap
    public final V remove(Object obj) {
        e();
        return (V) super.remove(obj);
    }
}
