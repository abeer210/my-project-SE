package com.huawei.hms.rn.location.backend.interfaces;

public interface Mapper<T, R> {
    R map(T t);
}
