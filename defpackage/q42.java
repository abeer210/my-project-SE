package defpackage;

import com.google.android.gms.maps.model.LatLng;
import java.util.List;
import vigqyno.C0201;

/* renamed from: q42  reason: default package */
/* compiled from: LineString */
public class q42 implements o42<List<LatLng>> {
    private final List<LatLng> a;

    public q42(List<LatLng> list) {
        if (list != null) {
            this.a = list;
            return;
        }
        throw new IllegalArgumentException(C0201.m82(24078));
    }

    @Override // defpackage.o42
    public String a() {
        return C0201.m82(24079);
    }

    /* renamed from: e */
    public List<LatLng> d() {
        return this.a;
    }

    public String toString() {
        return C0201.m82(24080) + C0201.m82(24081) + C0201.m82(24082) + this.a + C0201.m82(24083);
    }
}
