package com.google.android.gms.maps;

import android.os.RemoteException;
import com.google.android.gms.common.internal.u;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.gms.maps.model.x;
import vigqyno.C0201;

public final class b {
    private static sp1 a;

    public static a a(CameraPosition cameraPosition) {
        try {
            return new a(g().n2(cameraPosition));
        } catch (RemoteException e) {
            throw new x(e);
        }
    }

    public static a b(LatLng latLng) {
        try {
            return new a(g().A0(latLng));
        } catch (RemoteException e) {
            throw new x(e);
        }
    }

    public static a c(LatLngBounds latLngBounds, int i) {
        try {
            return new a(g().r(latLngBounds, i));
        } catch (RemoteException e) {
            throw new x(e);
        }
    }

    public static a d(LatLngBounds latLngBounds, int i, int i2, int i3) {
        try {
            return new a(g().c2(latLngBounds, i, i2, i3));
        } catch (RemoteException e) {
            throw new x(e);
        }
    }

    public static a e(LatLng latLng, float f) {
        try {
            return new a(g().q3(latLng, f));
        } catch (RemoteException e) {
            throw new x(e);
        }
    }

    public static void f(sp1 sp1) {
        u.k(sp1);
        a = sp1;
    }

    private static sp1 g() {
        sp1 sp1 = a;
        u.l(sp1, C0201.m82(19329));
        return sp1;
    }
}
