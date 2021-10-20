package defpackage;

import com.google.android.gms.maps.model.LatLng;
import defpackage.e62;

/* renamed from: b62  reason: default package */
/* compiled from: WeightedLatLng */
public class b62 implements e62.a {
    private static final d62 c = new d62(1.0d);
    private y52 a;
    private double b;

    public b62(LatLng latLng, double d) {
        this.a = c.a(latLng);
        if (d >= 0.0d) {
            this.b = d;
        } else {
            this.b = 1.0d;
        }
    }

    @Override // defpackage.e62.a
    public y52 a() {
        return this.a;
    }

    public double b() {
        return this.b;
    }

    public b62(LatLng latLng) {
        this(latLng, 1.0d);
    }
}
