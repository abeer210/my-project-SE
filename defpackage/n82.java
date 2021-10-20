package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;

/* renamed from: n82  reason: default package */
/* compiled from: MultiFormatUPCEANReader */
public final class n82 extends o82 {
    private final t82[] a;

    public n82(Map<j62, ?> map) {
        Collection collection;
        if (map == null) {
            collection = null;
        } else {
            collection = (Collection) map.get(j62.POSSIBLE_FORMATS);
        }
        ArrayList arrayList = new ArrayList();
        if (collection != null) {
            if (collection.contains(f62.EAN_13)) {
                arrayList.add(new i82());
            } else if (collection.contains(f62.UPC_A)) {
                arrayList.add(new p82());
            }
            if (collection.contains(f62.EAN_8)) {
                arrayList.add(new j82());
            }
            if (collection.contains(f62.UPC_E)) {
                arrayList.add(new u82());
            }
        }
        if (arrayList.isEmpty()) {
            arrayList.add(new i82());
            arrayList.add(new j82());
            arrayList.add(new u82());
        }
        this.a = (t82[]) arrayList.toArray(new t82[arrayList.size()]);
    }

    @Override // defpackage.o82, defpackage.r62
    public void a() {
        for (t82 t82 : this.a) {
            t82.a();
        }
    }

    @Override // defpackage.o82
    public t62 c(int i, b72 b72, Map<j62, ?> map) throws o62 {
        t82[] t82Arr;
        Collection collection;
        boolean z;
        int[] p = t82.p(b72);
        for (t82 t82 : this.a) {
            try {
                t62 m = t82.m(i, b72, p, map);
                boolean z2 = m.b() == f62.EAN_13 && m.f().charAt(0) == '0';
                if (map == null) {
                    collection = null;
                } else {
                    collection = (Collection) map.get(j62.POSSIBLE_FORMATS);
                }
                if (collection != null) {
                    if (!collection.contains(f62.UPC_A)) {
                        z = false;
                        if (z2 || !z) {
                            return m;
                        }
                        t62 t62 = new t62(m.f().substring(1), m.c(), m.e(), f62.UPC_A);
                        t62.g(m.d());
                        return t62;
                    }
                }
                z = true;
                if (z2) {
                }
                return m;
            } catch (s62 unused) {
            }
        }
        throw o62.a();
    }
}
