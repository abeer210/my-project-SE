package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;

/* renamed from: m82  reason: default package */
/* compiled from: MultiFormatOneDReader */
public final class m82 extends o82 {
    private final o82[] a;

    public m82(Map<j62, ?> map) {
        Collection collection;
        if (map == null) {
            collection = null;
        } else {
            collection = (Collection) map.get(j62.POSSIBLE_FORMATS);
        }
        boolean z = (map == null || map.get(j62.ASSUME_CODE_39_CHECK_DIGIT) == null) ? false : true;
        ArrayList arrayList = new ArrayList();
        if (collection != null) {
            if (collection.contains(f62.EAN_13) || collection.contains(f62.UPC_A) || collection.contains(f62.EAN_8) || collection.contains(f62.UPC_E)) {
                arrayList.add(new n82(map));
            }
            if (collection.contains(f62.CODE_39)) {
                arrayList.add(new g82(z));
            }
            if (collection.contains(f62.CODE_93)) {
                arrayList.add(new h82());
            }
            if (collection.contains(f62.CODE_128)) {
                arrayList.add(new f82());
            }
            if (collection.contains(f62.ITF)) {
                arrayList.add(new l82());
            }
            if (collection.contains(f62.CODABAR)) {
                arrayList.add(new e82());
            }
            if (collection.contains(f62.RSS_14)) {
                arrayList.add(new z82());
            }
            if (collection.contains(f62.RSS_EXPANDED)) {
                arrayList.add(new e92());
            }
        }
        if (arrayList.isEmpty()) {
            arrayList.add(new n82(map));
            arrayList.add(new g82());
            arrayList.add(new e82());
            arrayList.add(new h82());
            arrayList.add(new f82());
            arrayList.add(new l82());
            arrayList.add(new z82());
            arrayList.add(new e92());
        }
        this.a = (o82[]) arrayList.toArray(new o82[arrayList.size()]);
    }

    @Override // defpackage.o82, defpackage.r62
    public void a() {
        for (o82 o82 : this.a) {
            o82.a();
        }
    }

    @Override // defpackage.o82
    public t62 c(int i, b72 b72, Map<j62, ?> map) throws o62 {
        o82[] o82Arr;
        for (o82 o82 : this.a) {
            try {
                return o82.c(i, b72, map);
            } catch (s62 unused) {
            }
        }
        throw o62.a();
    }
}
