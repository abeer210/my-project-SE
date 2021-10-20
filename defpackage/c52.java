package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: c52  reason: default package */
/* compiled from: GeoJsonMultiPolygon */
public class c52 extends r42 {
    public List<f52> f() {
        List<o42> e = d();
        ArrayList arrayList = new ArrayList();
        Iterator<o42> it = e.iterator();
        while (it.hasNext()) {
            arrayList.add((f52) it.next());
        }
        return arrayList;
    }
}
