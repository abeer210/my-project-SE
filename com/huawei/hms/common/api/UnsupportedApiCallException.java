package com.huawei.hms.common.api;

import com.huawei.hms.common.Feature;
import vigqyno.C0201;

@Deprecated
public final class UnsupportedApiCallException extends UnsupportedOperationException {
    private final Feature feature;

    public UnsupportedApiCallException(Feature feature2) {
        this.feature = feature2;
    }

    public final String getMessage() {
        return this.feature + C0201.m82(7519);
    }
}
