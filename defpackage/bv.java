package defpackage;

import vigqyno.C0201;

/* renamed from: bv  reason: default package */
/* compiled from: PentaxMakernoteDescriptor */
public class bv extends as<cv> {
    public bv(cv cvVar) {
        super(cvVar);
    }

    public String A() {
        return l(3, 2, C0201.m82(7324), C0201.m82(7325));
    }

    public String B() {
        Integer l = ((cv) this.a).l(20);
        if (l == null) {
            return null;
        }
        int intValue = l.intValue();
        String r3 = C0201.m82(7326);
        if (intValue == 10) {
            return r3;
        }
        String r4 = C0201.m82(7327);
        if (intValue == 16) {
            return r4;
        }
        if (intValue == 100) {
            return r3;
        }
        if (intValue == 200) {
            return r4;
        }
        return C0201.m82(7328) + l + C0201.m82(7329);
    }

    public String C() {
        return m(2, C0201.m82(7330), C0201.m82(7331), C0201.m82(7332));
    }

    public String D() {
        return m(13, C0201.m82(7333), C0201.m82(7334), C0201.m82(7335));
    }

    public String E() {
        return m(11, C0201.m82(7336), C0201.m82(7337), C0201.m82(7338));
    }

    public String F() {
        return m(7, C0201.m82(7339), C0201.m82(7340), C0201.m82(7341), C0201.m82(7342), C0201.m82(7343), C0201.m82(7344));
    }

    @Override // defpackage.as
    public String f(int i) {
        if (i == 1) {
            return v();
        }
        if (i == 2) {
            return C();
        }
        if (i == 3) {
            return A();
        }
        if (i == 4) {
            return z();
        }
        if (i == 7) {
            return F();
        }
        if (i == 20) {
            return B();
        }
        if (i == 23) {
            return w();
        }
        switch (i) {
            case 10:
                return y();
            case 11:
                return E();
            case 12:
                return x();
            case 13:
                return D();
            default:
                return super.f(i);
        }
    }

    public String v() {
        return m(1, C0201.m82(7345), C0201.m82(7346), C0201.m82(7347), null, C0201.m82(7348));
    }

    public String w() {
        return l(23, 1, C0201.m82(7349), C0201.m82(7350), C0201.m82(7351));
    }

    public String x() {
        return m(12, C0201.m82(7352), C0201.m82(7353), C0201.m82(7354));
    }

    public String y() {
        Float i = ((cv) this.a).i(10);
        if (i == null) {
            return null;
        }
        if (i.floatValue() == 0.0f) {
            return C0201.m82(7355);
        }
        return Float.toString(i.floatValue());
    }

    public String z() {
        return l(4, 1, C0201.m82(7356), C0201.m82(7357), null, C0201.m82(7358), null, C0201.m82(7359));
    }
}
