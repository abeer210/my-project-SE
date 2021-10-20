package defpackage;

import com.google.android.gms.maps.model.LatLng;

/* renamed from: d62  reason: default package */
/* compiled from: SphericalMercatorProjection */
public class d62 {
    public final double a;

    public d62(double d) {
        this.a = d;
    }

    public c62 a(LatLng latLng) {
        double sin = Math.sin(Math.toRadians(latLng.a));
        double d = this.a;
        return new c62(((latLng.b / 360.0d) + 0.5d) * d, (((Math.log((sin + 1.0d) / (1.0d - sin)) * 0.5d) / -6.283185307179586d) + 0.5d) * d);
    }
}
