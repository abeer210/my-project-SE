package defpackage;

import java.util.ArrayList;
import java.util.Map;
import vigqyno.C0188;

/* renamed from: z92  reason: default package */
/* compiled from: PDF417Reader */
public final class z92 implements r62 {
    private static t62[] c(h62 h62, Map<j62, ?> map, boolean z) throws o62, k62, i62 {
        ArrayList arrayList = new ArrayList();
        pa2 b = oa2.b(h62, map, z);
        for (v62[] v62Arr : b.b()) {
            f72 i = ka2.i(b.a(), v62Arr[4], v62Arr[5], v62Arr[6], v62Arr[7], f(v62Arr), d(v62Arr));
            t62 t62 = new t62(i.h(), i.e(), v62Arr, f62.PDF_417);
            t62.h(u62.ERROR_CORRECTION_LEVEL, i.b());
            aa2 aa2 = (aa2) i.d();
            if (aa2 != null) {
                t62.h(u62.PDF417_EXTRA_METADATA, aa2);
            }
            arrayList.add(t62);
        }
        return (t62[]) arrayList.toArray(new t62[arrayList.size()]);
    }

    private static int d(v62[] v62Arr) {
        return Math.max(Math.max(e(v62Arr[0], v62Arr[4]), (e(v62Arr[6], v62Arr[2]) * 17) / 18), Math.max(e(v62Arr[1], v62Arr[5]), (e(v62Arr[7], v62Arr[3]) * 17) / 18));
    }

    private static int e(v62 v62, v62 v622) {
        if (v62 == null || v622 == null) {
            return 0;
        }
        return (int) Math.abs(v62.c() - v622.c());
    }

    private static int f(v62[] v62Arr) {
        return Math.min(Math.min(g(v62Arr[0], v62Arr[4]), (g(v62Arr[6], v62Arr[2]) * 17) / 18), Math.min(g(v62Arr[1], v62Arr[5]), (g(v62Arr[7], v62Arr[3]) * 17) / 18));
    }

    private static int g(v62 v62, v62 v622) {
        return (v62 == null || v622 == null) ? C0188.f24 : (int) Math.abs(v62.c() - v622.c());
    }

    @Override // defpackage.r62
    public void a() {
    }

    @Override // defpackage.r62
    public t62 b(h62 h62, Map<j62, ?> map) throws o62, k62, i62 {
        t62[] c = c(h62, map, false);
        if (c != null && c.length != 0 && c[0] != null) {
            return c[0];
        }
        throw o62.a();
    }
}
