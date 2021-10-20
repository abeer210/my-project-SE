package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;

/* renamed from: n62  reason: default package */
/* compiled from: MultiFormatReader */
public final class n62 implements r62 {
    private Map<j62, ?> a;
    private r62[] b;

    private t62 c(h62 h62) throws o62 {
        r62[] r62Arr = this.b;
        if (r62Arr != null) {
            for (r62 r62 : r62Arr) {
                try {
                    return r62.b(h62, this.a);
                } catch (s62 unused) {
                }
            }
        }
        throw o62.a();
    }

    @Override // defpackage.r62
    public void a() {
        r62[] r62Arr = this.b;
        if (r62Arr != null) {
            for (r62 r62 : r62Arr) {
                r62.a();
            }
        }
    }

    @Override // defpackage.r62
    public t62 b(h62 h62, Map<j62, ?> map) throws o62 {
        e(map);
        return c(h62);
    }

    public t62 d(h62 h62) throws o62 {
        if (this.b == null) {
            e(null);
        }
        return c(h62);
    }

    public void e(Map<j62, ?> map) {
        Collection collection;
        this.a = map;
        boolean z = true;
        boolean z2 = map != null && map.containsKey(j62.TRY_HARDER);
        if (map == null) {
            collection = null;
        } else {
            collection = (Collection) map.get(j62.POSSIBLE_FORMATS);
        }
        ArrayList arrayList = new ArrayList();
        if (collection != null) {
            if (!collection.contains(f62.UPC_A) && !collection.contains(f62.UPC_E) && !collection.contains(f62.EAN_13) && !collection.contains(f62.EAN_8) && !collection.contains(f62.CODABAR) && !collection.contains(f62.CODE_39) && !collection.contains(f62.CODE_93) && !collection.contains(f62.CODE_128) && !collection.contains(f62.ITF) && !collection.contains(f62.RSS_14) && !collection.contains(f62.RSS_EXPANDED)) {
                z = false;
            }
            if (z && !z2) {
                arrayList.add(new m82(map));
            }
            if (collection.contains(f62.QR_CODE)) {
                arrayList.add(new qa2());
            }
            if (collection.contains(f62.DATA_MATRIX)) {
                arrayList.add(new t72());
            }
            if (collection.contains(f62.AZTEC)) {
                arrayList.add(new y62());
            }
            if (collection.contains(f62.PDF_417)) {
                arrayList.add(new z92());
            }
            if (collection.contains(f62.MAXICODE)) {
                arrayList.add(new a82());
            }
            if (z && z2) {
                arrayList.add(new m82(map));
            }
        }
        if (arrayList.isEmpty()) {
            if (!z2) {
                arrayList.add(new m82(map));
            }
            arrayList.add(new qa2());
            arrayList.add(new t72());
            arrayList.add(new y62());
            arrayList.add(new z92());
            arrayList.add(new a82());
            if (z2) {
                arrayList.add(new m82(map));
            }
        }
        this.b = (r62[]) arrayList.toArray(new r62[arrayList.size()]);
    }
}
