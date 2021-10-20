package com.huawei.hms.common.api;

import com.huawei.hms.support.api.client.Result;

public class Response<T extends Result> {
    public T result;

    public Response() {
    }

    public T getResult() {
        return this.result;
    }

    public void setResult(T t) {
        this.result = t;
    }

    public Response(T t) {
        this.result = t;
    }
}
