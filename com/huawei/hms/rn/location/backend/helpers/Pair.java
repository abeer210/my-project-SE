package com.huawei.hms.rn.location.backend.helpers;

public class Pair<K, V> {
    private final K element0;
    private final V element1;

    public Pair(K k, V v) {
        this.element0 = k;
        this.element1 = v;
    }

    public static <K, V> Pair<K, V> create(K k, V v) {
        return new Pair<>(k, v);
    }

    public K get0() {
        return this.element0;
    }

    public V get1() {
        return this.element1;
    }
}
