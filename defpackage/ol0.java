package defpackage;

import java.util.List;

/* renamed from: ol0  reason: default package */
/* compiled from: MultiSourceHelper */
public class ol0 {

    /* renamed from: ol0$b */
    /* compiled from: MultiSourceHelper */
    public static class b {
        private final nl0 a;
        private final nl0 b;

        public nl0 a() {
            return this.a;
        }

        public nl0 b() {
            return this.b;
        }

        private b(nl0 nl0, nl0 nl02) {
            this.a = nl0;
            this.b = nl02;
        }
    }

    public static b a(int i, int i2, List<nl0> list) {
        return b(i, i2, list, 1.0d);
    }

    public static b b(int i, int i2, List<nl0> list, double d) {
        if (list.isEmpty()) {
            return new b(null, null);
        }
        if (list.size() == 1) {
            return new b(list.get(0), null);
        }
        if (i <= 0 || i2 <= 0) {
            return new b(null, null);
        }
        be0 i3 = ee0.k().i();
        double d2 = (double) (i * i2);
        Double.isNaN(d2);
        double d3 = d2 * d;
        double d4 = Double.MAX_VALUE;
        double d5 = Double.MAX_VALUE;
        nl0 nl0 = null;
        nl0 nl02 = null;
        for (nl0 nl03 : list) {
            double abs = Math.abs(1.0d - (nl03.c() / d3));
            if (abs < d4) {
                nl02 = nl03;
                d4 = abs;
            }
            if (abs < d5 && (i3.l(nl03.e()) || i3.n(nl03.e()))) {
                nl0 = nl03;
                d5 = abs;
            }
        }
        if (!(nl0 == null || nl02 == null || !nl0.d().equals(nl02.d()))) {
            nl0 = null;
        }
        return new b(nl02, nl0);
    }
}
