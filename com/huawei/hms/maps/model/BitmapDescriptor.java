package com.huawei.hms.maps.model;

import com.huawei.hms.feature.dynamic.IObjectWrapper;
import vigqyno.C0201;

public final class BitmapDescriptor {
    private final IObjectWrapper a;

    public BitmapDescriptor(IObjectWrapper iObjectWrapper) {
        if (iObjectWrapper != null) {
            this.a = iObjectWrapper;
            return;
        }
        throw new NullPointerException(C0201.m82(1980));
    }

    public final IObjectWrapper getObject() {
        return this.a;
    }
}
