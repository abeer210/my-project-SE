package defpackage;

import java.text.DecimalFormat;
import vigqyno.C0201;

/* renamed from: hu  reason: default package */
/* compiled from: NikonType2MakernoteDescriptor */
public class hu extends as<iu> {
    public hu(iu iuVar) {
        super(iuVar);
    }

    private String B(int i) {
        int[] k = ((iu) this.a).k(i);
        if (k == null || k.length < 2 || k.length < 3 || k[2] == 0) {
            return null;
        }
        DecimalFormat decimalFormat = new DecimalFormat(C0201.m82(21018));
        double d = (double) (k[0] * k[1]);
        double d2 = (double) k[2];
        Double.isNaN(d);
        Double.isNaN(d2);
        return decimalFormat.format(d / d2) + C0201.m82(21019);
    }

    public String A() {
        mr p = ((iu) this.a).p(134);
        if (p == null) {
            return null;
        }
        if (p.intValue() == 1) {
            return C0201.m82(21020);
        }
        return p.l(true) + C0201.m82(21021);
    }

    public String C() {
        return B(14);
    }

    public String D() {
        return B(28);
    }

    public String E() {
        return u(1, 2);
    }

    public String F() {
        return B(24);
    }

    public String G() {
        return B(23);
    }

    public String H() {
        return m(135, C0201.m82(21022), C0201.m82(21023), null, C0201.m82(21024), null, null, null, C0201.m82(21025), C0201.m82(21026), C0201.m82(21027));
    }

    public String I() {
        return m(177, C0201.m82(21028), C0201.m82(21029), C0201.m82(21030), null, C0201.m82(21031), null, C0201.m82(21032));
    }

    public String J() {
        return k(146, C0201.m82(21033));
    }

    public String K() {
        int[] k = ((iu) this.a).k(2);
        if (k == null) {
            return null;
        }
        if (k[0] != 0 || k[1] == 0) {
            return C0201.m82(21035) + ((iu) this.a).r(2) + C0201.m82(21036);
        }
        return C0201.m82(21034) + k[1];
    }

    public String L() {
        return n(132);
    }

    public String M() {
        return B(139);
    }

    public String N() {
        return c(131, new String[]{C0201.m82(21037), C0201.m82(21038)}, C0201.m82(21039), C0201.m82(21040), C0201.m82(21041));
    }

    public String O() {
        return l(147, 1, C0201.m82(21042), null, C0201.m82(21043), null, null, null, C0201.m82(21044), C0201.m82(21045));
    }

    public String P() {
        return g(182);
    }

    public String Q() {
        return B(13);
    }

    public String R() {
        return c(137, new String[]{C0201.m82(21046), C0201.m82(21047)}, C0201.m82(21048), null, C0201.m82(21049), C0201.m82(21050), C0201.m82(21051), C0201.m82(21052), C0201.m82(21053));
    }

    public String S() {
        Integer l = ((iu) this.a).l(42);
        if (l == null) {
            return null;
        }
        int intValue = l.intValue();
        if (intValue == 0) {
            return C0201.m82(21059);
        }
        if (intValue == 1) {
            return C0201.m82(21058);
        }
        if (intValue == 3) {
            return C0201.m82(21057);
        }
        if (intValue == 5) {
            return C0201.m82(21056);
        }
        return C0201.m82(21054) + l + C0201.m82(21055);
    }

    @Override // defpackage.as
    public String f(int i) {
        if (i == 1) {
            return E();
        }
        if (i == 2) {
            return K();
        }
        if (i == 13) {
            return Q();
        }
        if (i == 14) {
            return C();
        }
        if (i == 18) {
            return w();
        }
        if (i == 28) {
            return D();
        }
        if (i == 30) {
            return z();
        }
        if (i == 34) {
            return v();
        }
        if (i == 42) {
            return S();
        }
        if (i == 139) {
            return M();
        }
        if (i == 141) {
            return y();
        }
        if (i == 177) {
            return I();
        }
        if (i == 182) {
            return P();
        }
        if (i == 23) {
            return G();
        }
        if (i == 24) {
            return F();
        }
        if (i == 131) {
            return N();
        }
        if (i == 132) {
            return L();
        }
        if (i == 146) {
            return J();
        }
        if (i == 147) {
            return O();
        }
        switch (i) {
            case 134:
                return A();
            case 135:
                return H();
            case 136:
                return x();
            case 137:
                return R();
            default:
                return super.f(i);
        }
    }

    public String v() {
        Integer l = ((iu) this.a).l(34);
        if (l == null) {
            return null;
        }
        int intValue = l.intValue();
        if (intValue == 0) {
            return C0201.m82(21067);
        }
        if (intValue == 1) {
            return C0201.m82(21066);
        }
        if (intValue == 3) {
            return C0201.m82(21065);
        }
        if (intValue == 5) {
            return C0201.m82(21064);
        }
        if (intValue == 7) {
            return C0201.m82(21063);
        }
        if (intValue == 65535) {
            return C0201.m82(21062);
        }
        return C0201.m82(21060) + l + C0201.m82(21061);
    }

    public String w() {
        return B(18);
    }

    public String x() {
        int[] k = ((iu) this.a).k(136);
        if (k == null) {
            return null;
        }
        int length = k.length;
        String r3 = C0201.m82(21068);
        String r4 = C0201.m82(21069);
        if (length == 4 && k[0] == 0 && k[2] == 0 && k[3] == 0) {
            int i = k[1];
            if (i == 0) {
                return C0201.m82(21074);
            }
            if (i == 1) {
                return C0201.m82(21073);
            }
            if (i == 2) {
                return C0201.m82(21072);
            }
            if (i == 3) {
                return C0201.m82(21071);
            }
            if (i == 4) {
                return C0201.m82(21070);
            }
            return r4 + k[1] + r3;
        }
        return r4 + ((iu) this.a).r(136) + r3;
    }

    public String y() {
        String r = ((iu) this.a).r(141);
        if (r == null) {
            return null;
        }
        return r.startsWith(C0201.m82(21075)) ? C0201.m82(21076) : r;
    }

    public String z() {
        return l(30, 1, C0201.m82(21077), C0201.m82(21078));
    }
}
