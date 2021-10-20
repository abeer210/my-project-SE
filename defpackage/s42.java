package defpackage;

import com.google.android.gms.maps.model.LatLng;
import vigqyno.C0201;

/* renamed from: s42  reason: default package */
/* compiled from: Point */
public class s42 implements o42 {
    private final LatLng a;

    public s42(LatLng latLng) {
        if (latLng != null) {
            this.a = latLng;
            return;
        }
        throw new IllegalArgumentException(C0201.m82(8615));
    }

    @Override // defpackage.o42
    public String a() {
        return C0201.m82(8616);
    }

    /* renamed from: e */
    public LatLng d() {
        return this.a;
    }

    public String toString() {
        return C0201.m82(8617) + C0201.m82(8618) + C0201.m82(8619) + this.a + C0201.m82(8620);
    }
}
