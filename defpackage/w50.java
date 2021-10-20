package defpackage;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: w50  reason: default package */
/* compiled from: ImmutableMap */
public class w50<K, V> extends HashMap<K, V> {
    private w50(Map<? extends K, ? extends V> map) {
        super(map);
    }

    public static <K, V> w50<K, V> a(Map<? extends K, ? extends V> map) {
        return new w50<>(map);
    }

    public static <K, V> Map<K, V> b(K k, V v) {
        HashMap hashMap = new HashMap(1);
        hashMap.put(k, v);
        return Collections.unmodifiableMap(hashMap);
    }

    public static <K, V> Map<K, V> c(K k, V v, K k2, V v2) {
        HashMap hashMap = new HashMap(2);
        hashMap.put(k, v);
        hashMap.put(k2, v2);
        return Collections.unmodifiableMap(hashMap);
    }
}
