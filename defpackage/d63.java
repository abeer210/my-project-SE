package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: d63  reason: default package */
/* compiled from: RecipientInformationStore */
public class d63 implements Object<c63> {
    private final List a;
    private final Map b = new HashMap();

    public d63(Collection<c63> collection) {
        for (c63 c63 : collection) {
            b63 c = c63.c();
            ArrayList arrayList = (ArrayList) this.b.get(c);
            if (arrayList == null) {
                arrayList = new ArrayList(1);
                this.b.put(c, arrayList);
            }
            arrayList.add(c63);
        }
        this.a = new ArrayList(collection);
    }

    public Collection<c63> a() {
        return new ArrayList(this.a);
    }

    public Iterator<c63> iterator() {
        return a().iterator();
    }
}
