package com.huawei.hms.maps;

import com.huawei.hms.maps.model.CameraUpdateParam;
import vigqyno.C0201;

public final class CameraUpdate {
    private CameraUpdateParam a;

    public CameraUpdate(CameraUpdateParam cameraUpdateParam) {
        if (cameraUpdateParam != null) {
            this.a = cameraUpdateParam;
            return;
        }
        throw new NullPointerException(C0201.m82(20305));
    }

    @Deprecated
    public final CameraUpdateParam getCameraUpdate() {
        return this.a;
    }

    public final CameraUpdateParam getCameraUpdateParam() {
        return this.a;
    }
}
