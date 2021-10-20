package defpackage;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* renamed from: mm1  reason: default package */
public final class mm1<K, V> extends LinkedHashMap<K, V> {
    private static final mm1 b;
    private boolean a = true;

    static {
        mm1 mm1 = new mm1();
        b = mm1;
        mm1.a = false;
    }

    private mm1() {
    }

    public static <K, V> mm1<K, V> d() {
        return b;
    }

    private final void f() {
        if (!this.a) {
            throw new UnsupportedOperationException();
        }
    }

    private static int g(Object obj) {
        if (obj instanceof byte[]) {
            return nl1.b((byte[]) obj);
        }
        if (!(obj instanceof ol1)) {
            return obj.hashCode();
        }
        throw new UnsupportedOperationException();
    }

    public final boolean a() {
        return this.a;
    }

    public final void b(mm1<K, V> mm1) {
        f();
        if (!mm1.isEmpty()) {
            putAll(mm1);
        }
    }

    public final void c() {
        this.a = false;
    }

    public final void clear() {
        f();
        super.clear();
    }

    public final mm1<K, V> e() {
        return isEmpty() ? new mm1<>() : new mm1<>(this);
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

    public final int hashCode() {
        int i = 0;
        for (Map.Entry<K, V> entry : entrySet()) {
            i += g(entry.getValue()) ^ g(entry.getKey());
        }
        return i;
    }

    @Override // java.util.AbstractMap, java.util.Map, java.util.HashMap
    public final V put(K k, V v) {
        f();
        nl1.a(k);
        nl1.a(v);
        return (V) super.put(k, v);
    }

    @Override // java.util.AbstractMap, java.util.Map, java.util.HashMap
    public final void putAll(Map<? extends K, ? extends V> map) {
        f();
        for (Object obj : map.keySet()) {
            nl1.a(obj);
            nl1.a(map.get(obj));
        }
        super.putAll(map);
    }

    @Override // java.util.AbstractMap, java.util.Map, java.util.HashMap
    public final V remove(Object obj) {
        f();
        return (V) super.remove(obj);
    }

    private mm1(Map<K, V> map) {
        super(map);
    }
}
