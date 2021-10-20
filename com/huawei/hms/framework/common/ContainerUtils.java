package com.huawei.hms.framework.common;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import vigqyno.C0201;

public class ContainerUtils {
    public static final String FIELD_DELIMITER = null;
    public static final String KEY_VALUE_DELIMITER = null;

    static {
        C0201.m83(ContainerUtils.class, 436);
    }

    public static <K, V> boolean equals(Map<K, V> map, Map<K, V> map2) {
        if (map == map2) {
            return true;
        }
        boolean z = false;
        if (map == null || map2 == null || map.size() != map2.size()) {
            return false;
        }
        Iterator<Map.Entry<K, V>> it = map.entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Map.Entry<K, V> next = it.next();
            if (map2.get(next.getKey()) != next.getValue()) {
                z = true;
                break;
            }
        }
        return !z;
    }

    public static <K, V> int hashCode(Map<K, V> map) {
        return toString(map).hashCode();
    }

    public static <K> String toString(List<K> list) {
        if (list == null) {
            return C0201.m82(30919);
        }
        StringBuilder sb = new StringBuilder();
        int i = 0;
        for (K k : list) {
            int i2 = i + 1;
            if (i > 0) {
                sb.append(C0201.m82(30920));
            }
            sb.append(k.toString());
            i = i2;
        }
        return sb.toString();
    }

    public static <K, V> String toString(Map<K, V> map) {
        if (map == null) {
            return C0201.m82(30921);
        }
        StringBuilder sb = new StringBuilder();
        int i = 0;
        for (Map.Entry<K, V> entry : map.entrySet()) {
            int i2 = i + 1;
            if (i > 0) {
                sb.append(C0201.m82(30922));
            }
            sb.append(entry.getKey().toString());
            sb.append(C0201.m82(30923));
            sb.append(entry.getValue().toString());
            i = i2;
        }
        return sb.toString();
    }

    public static <K> String toString(Set<K> set) {
        if (set == null) {
            return C0201.m82(30924);
        }
        StringBuilder sb = new StringBuilder();
        int i = 0;
        for (K k : set) {
            int i2 = i + 1;
            if (i > 0) {
                sb.append(C0201.m82(30925));
            }
            sb.append(k.toString());
            i = i2;
        }
        return sb.toString();
    }
}
