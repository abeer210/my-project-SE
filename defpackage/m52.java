package defpackage;

import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.gms.maps.model.k;
import java.util.HashMap;
import java.util.Map;
import vigqyno.C0201;

/* renamed from: m52  reason: default package */
/* compiled from: KmlGroundOverlay */
public class m52 {
    private final Map<String, String> a;
    private final k b;
    private String c;
    private LatLngBounds d;

    public m52(String str, LatLngBounds latLngBounds, float f, int i, HashMap<String, String> hashMap, float f2) {
        k kVar = new k();
        this.b = kVar;
        this.c = str;
        this.a = hashMap;
        if (latLngBounds != null) {
            this.d = latLngBounds;
            kVar.H(latLngBounds);
            this.b.o(f2);
            this.b.Q(f);
            this.b.P(i != 0);
            return;
        }
        throw new IllegalArgumentException(C0201.m82(14611));
    }

    public k a() {
        return this.b;
    }

    public String b() {
        return this.c;
    }

    public LatLngBounds c() {
        return this.d;
    }

    public String toString() {
        return C0201.m82(14612) + C0201.m82(14613) + C0201.m82(14614) + this.a + C0201.m82(14615) + this.c + C0201.m82(14616) + this.d + C0201.m82(14617);
    }
}
