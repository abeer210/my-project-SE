package com.huawei.hms.maps;

import android.graphics.Point;
import android.os.RemoteException;
import com.huawei.hms.maps.model.LatLng;
import com.huawei.hms.maps.model.VisibleRegion;
import vigqyno.C0201;

public final class Projection {
    private final mbn a;

    public Projection(mbn mbn) {
        this.a = mbn;
    }

    public final LatLng fromScreenLocation(Point point) {
        try {
            return this.a.a(point);
        } catch (RemoteException e) {
            mco.d(C0201.m82(36589), C0201.m82(36588) + e.getMessage());
            return null;
        }
    }

    public final VisibleRegion getVisibleRegion() {
        try {
            return this.a.a();
        } catch (RemoteException e) {
            mco.d(C0201.m82(36591), C0201.m82(36590) + e.getMessage());
            return null;
        }
    }

    public final Point toScreenLocation(LatLng latLng) {
        try {
            return this.a.a(latLng);
        } catch (RemoteException e) {
            mco.d(C0201.m82(36593), C0201.m82(36592) + e.getMessage());
            return null;
        }
    }
}
