package defpackage;

import vigqyno.C0201;

/* renamed from: nu  reason: default package */
/* compiled from: OlympusFocusInfoMakernoteDescriptor */
public class nu extends as<ou> {
    public nu(ou ouVar) {
        super(ouVar);
    }

    public String A() {
        mr p = ((ou) this.a).p(773);
        String r1 = C0201.m82(34165);
        if (p == null || p.g() == 4294967295L || p.g() == 0) {
            return r1;
        }
        StringBuilder sb = new StringBuilder();
        double g = (double) p.g();
        Double.isNaN(g);
        sb.append(g / 1000.0d);
        sb.append(C0201.m82(34166));
        return sb.toString();
    }

    public String B() {
        return u(0, 4);
    }

    public String C() {
        byte[] e = ((ou) this.a).e(5632);
        if (e == null) {
            return null;
        }
        if ((e[0] | e[1] | e[2] | e[3]) == 0) {
            return C0201.m82(34167);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(C0201.m82(34168));
        sb.append((e[43] & 1) > 0 ? C0201.m82(34169) : C0201.m82(34170));
        return sb.toString();
    }

    public String D() {
        return m(4618, C0201.m82(34171), C0201.m82(34172));
    }

    public String E() {
        int[] k = ((ou) this.a).k(4617);
        if (k == null) {
            return null;
        }
        if (((short) k[0]) == 0) {
            return C0201.m82(34173);
        }
        if (((short) k[1]) == 1) {
            return C0201.m82(34174);
        }
        return C0201.m82(34175) + ((int) ((short) k[1])) + C0201.m82(34176);
    }

    public String F() {
        return ((ou) this.a).r(5376);
    }

    @Override // defpackage.as
    public String f(int i) {
        if (i == 0) {
            return B();
        }
        if (i == 521) {
            return w();
        }
        if (i == 773) {
            return A();
        }
        if (i == 776) {
            return v();
        }
        if (i == 4609) {
            return y();
        }
        if (i == 5376) {
            return F();
        }
        if (i == 5632) {
            return C();
        }
        if (i == 4612) {
            return x();
        }
        if (i == 4613) {
            return z();
        }
        if (i == 4617) {
            return E();
        }
        if (i != 4618) {
            return super.f(i);
        }
        return D();
    }

    public String v() {
        Integer l = ((ou) this.a).l(776);
        if (l == null) {
            return null;
        }
        return l.toString();
    }

    public String w() {
        return m(521, C0201.m82(34177), C0201.m82(34178));
    }

    public String x() {
        return m(4612, C0201.m82(34179), C0201.m82(34180));
    }

    public String y() {
        int[] k = ((ou) this.a).k(4609);
        if (k == null || k.length < 2) {
            return null;
        }
        String format = String.format(C0201.m82(34181), Short.valueOf((short) k[0]), Short.valueOf((short) k[1]));
        if (format.equals(C0201.m82(34182))) {
            return C0201.m82(34183);
        }
        if (format.equals(C0201.m82(34184))) {
            return C0201.m82(34185);
        }
        return C0201.m82(34186) + format + C0201.m82(34187);
    }

    public String z() {
        int[] k = ((ou) this.a).k(4613);
        if (k == null) {
            Integer l = ((ou) this.a).l(4613);
            if (l == null) {
                return null;
            }
            k = new int[]{l.intValue()};
        }
        if (k.length == 0) {
            return null;
        }
        Object[] objArr = {Short.valueOf((short) k[0])};
        String r2 = C0201.m82(34188);
        String format = String.format(r2, objArr);
        if (k.length > 1) {
            format = format + C0201.m82(34189) + String.format(r2, Short.valueOf((short) k[1]));
        }
        boolean equals = format.equals(C0201.m82(34190));
        String r22 = C0201.m82(34191);
        if (equals) {
            return r22;
        }
        boolean equals2 = format.equals(C0201.m82(34192));
        String r3 = C0201.m82(34193);
        if (equals2) {
            return r3;
        }
        if (format.equals(C0201.m82(34194))) {
            return r22;
        }
        if (format.equals(C0201.m82(34195))) {
            return r3;
        }
        return C0201.m82(34196) + format + C0201.m82(34197);
    }
}
