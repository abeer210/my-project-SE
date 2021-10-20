package com.airbnb.android.react.maps;

import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;

/* compiled from: LatLngBoundsUtils */
public class r {
    public static boolean a(LatLngBounds latLngBounds, LatLngBounds latLngBounds2) {
        LatLng o = latLngBounds.o();
        double d = o.a;
        double d2 = o.b;
        LatLng latLng = latLngBounds.b;
        double d3 = latLng.a;
        LatLng latLng2 = latLngBounds.a;
        double d4 = d3 - latLng2.a;
        double d5 = latLng.b - latLng2.b;
        LatLng o2 = latLngBounds2.o();
        double d6 = o2.a;
        double d7 = o2.b;
        LatLng latLng3 = latLngBounds2.b;
        double d8 = latLng3.a;
        LatLng latLng4 = latLngBounds2.a;
        double d9 = d8 - latLng4.a;
        double d10 = latLng3.b - latLng4.b;
        double b = b(latLngBounds, latLngBounds2);
        double c = c(latLngBounds, latLngBounds2);
        return d(d, d6, b) || d(d2, d7, c) || d(d4, d9, b) || d(d5, d10, c);
    }

    private static double b(LatLngBounds latLngBounds, LatLngBounds latLngBounds2) {
        return Math.min(Math.abs(latLngBounds.b.a - latLngBounds.a.a), Math.abs(latLngBounds2.b.a - latLngBounds2.a.a)) / 2560.0d;
    }

    private static double c(LatLngBounds latLngBounds, LatLngBounds latLngBounds2) {
        return Math.min(Math.abs(latLngBounds.b.b - latLngBounds.a.b), Math.abs(latLngBounds2.b.b - latLngBounds2.a.b)) / 2560.0d;
    }

    private static boolean d(double d, double d2, double d3) {
        return Math.abs(d - d2) > d3;
    }
}
