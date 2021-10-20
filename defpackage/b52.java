package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: b52  reason: default package */
/* compiled from: GeoJsonMultiPoint */
public class b52 extends r42 {
    public List<d52> f() {
        List<o42> e = d();
        ArrayList arrayList = new ArrayList();
        Iterator<o42> it = e.iterator();
        while (it.hasNext()) {
            arrayList.add((d52) it.next());
        }
        return arrayList;
    }
}
