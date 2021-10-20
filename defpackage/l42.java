package defpackage;

import com.google.android.gms.maps.model.LatLng;

/* renamed from: l42  reason: default package */
/* compiled from: SphericalUtil */
public class l42 {
    public static double a(LatLng latLng, LatLng latLng2) {
        return b(Math.toRadians(latLng.a), Math.toRadians(latLng.b), Math.toRadians(latLng2.a), Math.toRadians(latLng2.b));
    }

    private static double b(double d, double d2, double d3, double d4) {
        return i42.a(i42.c(d, d3, d2 - d4));
    }

    public static LatLng c(LatLng latLng, LatLng latLng2, double d) {
        double radians = Math.toRadians(latLng.a);
        double radians2 = Math.toRadians(latLng.b);
        double radians3 = Math.toRadians(latLng2.a);
        double radians4 = Math.toRadians(latLng2.b);
        double cos = Math.cos(radians);
        double cos2 = Math.cos(radians3);
        double a = a(latLng, latLng2);
        double sin = Math.sin(a);
        if (sin < 1.0E-6d) {
            return latLng;
        }
        double sin2 = Math.sin((1.0d - d) * a) / sin;
        double sin3 = Math.sin(a * d) / sin;
        double d2 = cos * sin2;
        double d3 = cos2 * sin3;
        double cos3 = (Math.cos(radians2) * d2) + (Math.cos(radians4) * d3);
        double sin4 = (d2 * Math.sin(radians2)) + (d3 * Math.sin(radians4));
        return new LatLng(Math.toDegrees(Math.atan2((sin2 * Math.sin(radians)) + (Math.sin(radians3) * sin3), Math.sqrt((cos3 * cos3) + (sin4 * sin4)))), Math.toDegrees(Math.atan2(sin4, cos3)));
    }
}
