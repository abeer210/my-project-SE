package defpackage;

import vigqyno.C0201;

/* renamed from: mw  reason: default package */
/* compiled from: IptcDescriptor */
public class mw extends as<nw> {
    public mw(nw nwVar) {
        super(nwVar);
    }

    public String A() {
        return w(549);
    }

    public String B() {
        return I(550);
    }

    public String C() {
        Integer l = ((nw) this.a).l(276);
        if (l == null) {
            return null;
        }
        switch (l.intValue()) {
            case 0:
                return C0201.m82(32272);
            case 1:
                return C0201.m82(32271);
            case 2:
                return C0201.m82(32270);
            case 3:
                return C0201.m82(32269);
            case 4:
                return C0201.m82(32268);
            case 5:
                return C0201.m82(32267);
            case 6:
                return C0201.m82(32266);
            case 7:
                return C0201.m82(32265);
            case 8:
                return C0201.m82(32264);
            case 9:
                return C0201.m82(32263);
            case 10:
                return C0201.m82(32262);
            case 11:
                return C0201.m82(32261);
            case 12:
                return C0201.m82(32260);
            case 13:
                return C0201.m82(32259);
            case 14:
                return C0201.m82(32258);
            case 15:
                return C0201.m82(32257);
            case 16:
                return C0201.m82(32256);
            case 17:
                return C0201.m82(32255);
            case 18:
                return C0201.m82(32254);
            case 19:
                return C0201.m82(32253);
            case 20:
                return C0201.m82(32252);
            case 21:
                return C0201.m82(32251);
            case 22:
                return C0201.m82(32250);
            case 23:
                return C0201.m82(32249);
            case 24:
                return C0201.m82(32248);
            case 25:
                return C0201.m82(32247);
            case 26:
                return C0201.m82(32246);
            case 27:
                return C0201.m82(32245);
            case 28:
                return C0201.m82(32244);
            case 29:
                return C0201.m82(32243);
            default:
                return String.format(C0201.m82(32242), l);
        }
    }

    public String D() {
        String[] s = ((nw) this.a).s(537);
        if (s == null) {
            return null;
        }
        return rr.b(s, C0201.m82(32273));
    }

    public String E() {
        return w(559);
    }

    public String F() {
        return w(542);
    }

    public String G() {
        return I(547);
    }

    public String H() {
        return I(572);
    }

    public String I(int i) {
        String r = ((nw) this.a).r(i);
        if (r == null) {
            return null;
        }
        if (r.length() != 6 && r.length() != 11) {
            return r;
        }
        return r.substring(0, 2) + ':' + r.substring(2, 4) + ':' + r.substring(4);
    }

    public String J() {
        return I(336);
    }

    @Override // defpackage.as
    public String f(int i) {
        if (i == 276) {
            return C();
        }
        if (i == 326) {
            return x();
        }
        if (i == 336) {
            return J();
        }
        if (i == 537) {
            return D();
        }
        if (i == 542) {
            return F();
        }
        if (i == 547) {
            return G();
        }
        if (i == 559) {
            return E();
        }
        if (i == 567) {
            return v();
        }
        if (i == 572) {
            return H();
        }
        if (i == 549) {
            return A();
        }
        if (i == 550) {
            return B();
        }
        if (i == 574) {
            return y();
        }
        if (i != 575) {
            return super.f(i);
        }
        return z();
    }

    public String v() {
        return w(567);
    }

    public String w(int i) {
        String r = ((nw) this.a).r(i);
        if (r == null) {
            return null;
        }
        if (r.length() != 8) {
            return r;
        }
        return r.substring(0, 4) + ':' + r.substring(4, 6) + ':' + r.substring(6);
    }

    public String x() {
        return w(326);
    }

    public String y() {
        return w(574);
    }

    public String z() {
        return I(575);
    }
}
