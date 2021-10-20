package defpackage;

import java.util.ArrayList;
import java.util.List;
import vigqyno.C0201;

/* renamed from: r42  reason: default package */
/* compiled from: MultiGeometry */
public class r42 implements o42 {
    private String a = C0201.m82(11155);
    private List<o42> b;

    public r42(List<? extends o42> list) {
        if (list != null) {
            ArrayList arrayList = new ArrayList();
            for (o42 o42 : list) {
                arrayList.add(o42);
            }
            this.b = arrayList;
            return;
        }
        throw new IllegalArgumentException(C0201.m82(11156));
    }

    @Override // defpackage.o42
    public String a() {
        return this.a;
    }

    /* renamed from: e */
    public List<o42> d() {
        return this.b;
    }

    public String toString() {
        String r0 = this.a.equals(C0201.m82(11157)) ? C0201.m82(11158) : C0201.m82(11159);
        if (this.a.equals(C0201.m82(11160))) {
            r0 = C0201.m82(11161);
        }
        if (this.a.equals(C0201.m82(11162))) {
            r0 = C0201.m82(11163);
        }
        StringBuilder sb = new StringBuilder(a());
        sb.append(C0201.m82(11164));
        sb.append(C0201.m82(11165) + r0);
        sb.append(d());
        sb.append(C0201.m82(11166));
        return sb.toString();
    }
}
