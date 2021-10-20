package com.huawei.hms.rn.location.backend.interfaces;

import org.json.JSONException;

public interface JSONMapper<T, R> {
    R map(T t) throws JSONException;
}
