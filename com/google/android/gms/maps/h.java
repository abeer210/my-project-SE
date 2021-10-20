package com.google.android.gms.maps;

import android.graphics.Point;
import android.os.RemoteException;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.e0;
import com.google.android.gms.maps.model.x;

public final class h {
    private final wp1 a;

    public h(wp1 wp1) {
        this.a = wp1;
    }

    public final LatLng a(Point point) {
        try {
            return this.a.X2(ar0.W3(point));
        } catch (RemoteException e) {
            throw new x(e);
        }
    }

    public final e0 b() {
        try {
            return this.a.c1();
        } catch (RemoteException e) {
            throw new x(e);
        }
    }

    public final Point c(LatLng latLng) {
        try {
            return (Point) ar0.V3(this.a.D0(latLng));
        } catch (RemoteException e) {
            throw new x(e);
        }
    }
}
