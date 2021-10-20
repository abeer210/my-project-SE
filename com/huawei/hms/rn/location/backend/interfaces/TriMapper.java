package com.huawei.hms.rn.location.backend.interfaces;

public interface TriMapper<T, U, V, R> {
    R map(T t, U u, V v);
}
