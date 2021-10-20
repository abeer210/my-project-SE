package com.huawei.hms.rn.location.backend.interfaces;

import org.json.JSONException;

public interface JSONTriMapper<T, U, V, R> {
    R run(T t, U u, V v) throws JSONException;
}
