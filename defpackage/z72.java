package defpackage;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import vigqyno.C0201;

/* renamed from: z72  reason: default package */
/* compiled from: Detector */
public final class z72 {
    private final c72 a;
    private final o72 b;

    /* access modifiers changed from: private */
    /* renamed from: z72$b */
    /* compiled from: Detector */
    public static final class b {
        private final v62 a;
        private final v62 b;
        private final int c;

        public v62 a() {
            return this.a;
        }

        public v62 b() {
            return this.b;
        }

        public int c() {
            return this.c;
        }

        public String toString() {
            return this.a + C0201.m82(27010) + this.b + '/' + this.c;
        }

        private b(v62 v62, v62 v622, int i) {
            this.a = v62;
            this.b = v622;
            this.c = i;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: z72$c */
    /* compiled from: Detector */
    public static final class c implements Serializable, Comparator<b> {
        private c() {
        }

        /* renamed from: a */
        public int compare(b bVar, b bVar2) {
            return bVar.c() - bVar2.c();
        }
    }

    public z72(c72 c72) throws o62 {
        this.a = c72;
        this.b = new o72(c72);
    }

    private v62 a(v62 v62, v62 v622, v62 v623, v62 v624, int i) {
        float f = (float) i;
        float d = ((float) d(v62, v622)) / f;
        float d2 = (float) d(v623, v624);
        v62 v625 = new v62(v624.c() + (((v624.c() - v623.c()) / d2) * d), v624.d() + (d * ((v624.d() - v623.d()) / d2)));
        float d3 = ((float) d(v62, v623)) / f;
        float d4 = (float) d(v622, v624);
        v62 v626 = new v62(v624.c() + (((v624.c() - v622.c()) / d4) * d3), v624.d() + (d3 * ((v624.d() - v622.d()) / d4)));
        if (f(v625)) {
            return (f(v626) && Math.abs(h(v623, v625).c() - h(v622, v625).c()) > Math.abs(h(v623, v626).c() - h(v622, v626).c())) ? v626 : v625;
        }
        if (f(v626)) {
            return v626;
        }
        return null;
    }

    private v62 b(v62 v62, v62 v622, v62 v623, v62 v624, int i, int i2) {
        float d = ((float) d(v62, v622)) / ((float) i);
        float d2 = (float) d(v623, v624);
        v62 v625 = new v62(v624.c() + (((v624.c() - v623.c()) / d2) * d), v624.d() + (d * ((v624.d() - v623.d()) / d2)));
        float d3 = ((float) d(v62, v623)) / ((float) i2);
        float d4 = (float) d(v622, v624);
        v62 v626 = new v62(v624.c() + (((v624.c() - v622.c()) / d4) * d3), v624.d() + (d3 * ((v624.d() - v622.d()) / d4)));
        if (f(v625)) {
            return (f(v626) && Math.abs(i - h(v623, v625).c()) + Math.abs(i2 - h(v622, v625).c()) > Math.abs(i - h(v623, v626).c()) + Math.abs(i2 - h(v622, v626).c())) ? v626 : v625;
        }
        if (f(v626)) {
            return v626;
        }
        return null;
    }

    private static int d(v62 v62, v62 v622) {
        return n72.c(v62.b(v62, v622));
    }

    private static void e(Map<v62, Integer> map, v62 v62) {
        Integer num = map.get(v62);
        int i = 1;
        if (num != null) {
            i = 1 + num.intValue();
        }
        map.put(v62, Integer.valueOf(i));
    }

    private boolean f(v62 v62) {
        return v62.c() >= 0.0f && v62.c() < ((float) this.a.l()) && v62.d() > 0.0f && v62.d() < ((float) this.a.g());
    }

    private static c72 g(c72 c72, v62 v62, v62 v622, v62 v623, v62 v624, int i, int i2) throws o62 {
        float f = ((float) i) - 0.5f;
        float f2 = ((float) i2) - 0.5f;
        return j72.b().c(c72, i, i2, 0.5f, 0.5f, f, 0.5f, f, f2, 0.5f, f2, v62.c(), v62.d(), v624.c(), v624.d(), v623.c(), v623.d(), v622.c(), v622.d());
    }

    private b h(v62 v62, v62 v622) {
        int c2 = (int) v62.c();
        int d = (int) v62.d();
        int c3 = (int) v622.c();
        int d2 = (int) v622.d();
        int i = 0;
        int i2 = 1;
        boolean z = Math.abs(d2 - d) > Math.abs(c3 - c2);
        if (z) {
            d = c2;
            c2 = d;
            d2 = c3;
            c3 = d2;
        }
        int abs = Math.abs(c3 - c2);
        int abs2 = Math.abs(d2 - d);
        int i3 = (-abs) / 2;
        int i4 = d < d2 ? 1 : -1;
        if (c2 >= c3) {
            i2 = -1;
        }
        boolean d3 = this.a.d(z ? d : c2, z ? c2 : d);
        while (c2 != c3) {
            boolean d4 = this.a.d(z ? d : c2, z ? c2 : d);
            if (d4 != d3) {
                i++;
                d3 = d4;
            }
            i3 += abs2;
            if (i3 > 0) {
                if (d == d2) {
                    break;
                }
                d += i4;
                i3 -= abs;
            }
            c2 += i2;
        }
        return new b(v62, v622, i);
    }

    public h72 c() throws o62 {
        v62 v62;
        v62 v622;
        c72 c72;
        v62[] c2 = this.b.c();
        v62 v623 = c2[0];
        v62 v624 = c2[1];
        v62 v625 = c2[2];
        v62 v626 = c2[3];
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(h(v623, v624));
        arrayList.add(h(v623, v625));
        arrayList.add(h(v624, v626));
        arrayList.add(h(v625, v626));
        v62 v627 = null;
        Collections.sort(arrayList, new c());
        b bVar = (b) arrayList.get(0);
        b bVar2 = (b) arrayList.get(1);
        HashMap hashMap = new HashMap();
        e(hashMap, bVar.a());
        e(hashMap, bVar.b());
        e(hashMap, bVar2.a());
        e(hashMap, bVar2.b());
        v62 v628 = null;
        v62 v629 = null;
        for (Map.Entry entry : hashMap.entrySet()) {
            v62 v6210 = (v62) entry.getKey();
            if (((Integer) entry.getValue()).intValue() == 2) {
                v628 = v6210;
            } else if (v627 == null) {
                v627 = v6210;
            } else {
                v629 = v6210;
            }
        }
        if (v627 == null || v628 == null || v629 == null) {
            throw o62.a();
        }
        v62[] v62Arr = {v627, v628, v629};
        v62.e(v62Arr);
        v62 v6211 = v62Arr[0];
        v62 v6212 = v62Arr[1];
        v62 v6213 = v62Arr[2];
        if (!hashMap.containsKey(v623)) {
            v62 = v623;
        } else if (!hashMap.containsKey(v624)) {
            v62 = v624;
        } else {
            v62 = !hashMap.containsKey(v625) ? v625 : v626;
        }
        int c3 = h(v6213, v62).c();
        int c4 = h(v6211, v62).c();
        if ((c3 & 1) == 1) {
            c3++;
        }
        int i = c3 + 2;
        if ((c4 & 1) == 1) {
            c4++;
        }
        int i2 = c4 + 2;
        if (i * 4 >= i2 * 7 || i2 * 4 >= i * 7) {
            v622 = v6213;
            v62 b2 = b(v6212, v6211, v6213, v62, i, i2);
            if (b2 != null) {
                v62 = b2;
            }
            int c5 = h(v622, v62).c();
            int c6 = h(v6211, v62).c();
            if ((c5 & 1) == 1) {
                c5++;
            }
            if ((c6 & 1) == 1) {
                c6++;
            }
            c72 = g(this.a, v622, v6212, v6211, v62, c5, c6);
        } else {
            v62 a2 = a(v6212, v6211, v6213, v62, Math.min(i2, i));
            if (a2 != null) {
                v62 = a2;
            }
            int max = Math.max(h(v6213, v62).c(), h(v6211, v62).c()) + 1;
            if ((max & 1) == 1) {
                max++;
            }
            c72 = g(this.a, v6213, v6212, v6211, v62, max, max);
            v622 = v6213;
        }
        return new h72(c72, new v62[]{v622, v6212, v6211, v62});
    }
}
