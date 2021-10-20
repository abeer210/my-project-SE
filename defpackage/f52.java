package defpackage;

import com.google.android.gms.maps.model.LatLng;
import java.util.ArrayList;
import java.util.List;
import vigqyno.C0201;

/* renamed from: f52  reason: default package */
/* compiled from: GeoJsonPolygon */
public class f52 implements m42 {
    private final List<? extends List<LatLng>> a;

    @Override // defpackage.o42
    public String a() {
        return i();
    }

    public List<? extends List<LatLng>> e() {
        return this.a;
    }

    /* renamed from: f */
    public List<? extends List<LatLng>> d() {
        return e();
    }

    /* renamed from: g */
    public ArrayList<ArrayList<LatLng>> c() {
        ArrayList<ArrayList<LatLng>> arrayList = new ArrayList<>();
        for (int i = 1; i < e().size(); i++) {
            arrayList.add((ArrayList) e().get(i));
        }
        return arrayList;
    }

    /* renamed from: h */
    public ArrayList<LatLng> b() {
        return (ArrayList) e().get(0);
    }

    public String i() {
        return C0201.m82(21091);
    }

    public String toString() {
        return C0201.m82(21092) + C0201.m82(21093) + C0201.m82(21094) + this.a + C0201.m82(21095);
    }
}
