package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: a52  reason: default package */
/* compiled from: GeoJsonMultiLineString */
public class a52 extends r42 {
    public List<y42> f() {
        List<o42> e = d();
        ArrayList arrayList = new ArrayList();
        Iterator<o42> it = e.iterator();
        while (it.hasNext()) {
            arrayList.add((y42) it.next());
        }
        return arrayList;
    }
}
