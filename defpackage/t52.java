package defpackage;

import com.google.android.gms.maps.model.LatLng;
import java.util.ArrayList;
import java.util.List;
import vigqyno.C0201;

/* renamed from: t52  reason: default package */
/* compiled from: KmlPolygon */
public class t52 implements m42<ArrayList<ArrayList<LatLng>>> {
    private final List<LatLng> a;
    private final List<List<LatLng>> b;

    public t52(List<LatLng> list, List<List<LatLng>> list2) {
        if (list != null) {
            this.a = list;
            this.b = list2;
            return;
        }
        throw new IllegalArgumentException(C0201.m82(4369));
    }

    @Override // defpackage.o42
    public String a() {
        return C0201.m82(4370);
    }

    @Override // defpackage.m42
    public List<LatLng> b() {
        return this.a;
    }

    @Override // defpackage.m42
    public List<List<LatLng>> c() {
        return this.b;
    }

    /* renamed from: e */
    public List<List<LatLng>> d() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(this.a);
        List<List<LatLng>> list = this.b;
        if (list != null) {
            arrayList.addAll(list);
        }
        return arrayList;
    }

    public String toString() {
        return C0201.m82(4371) + C0201.m82(4372) + C0201.m82(4373) + this.a + C0201.m82(4374) + this.b + C0201.m82(4375);
    }
}
