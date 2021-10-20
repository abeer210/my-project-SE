package defpackage;

import vigqyno.C0201;

/* renamed from: rt  reason: default package */
/* compiled from: CasioType1MakernoteDescriptor */
public class rt extends as<st> {
    public rt(st stVar) {
        super(stVar);
    }

    public String A() {
        return l(3, 2, C0201.m82(3837), C0201.m82(3838), C0201.m82(3839), C0201.m82(3840));
    }

    public String B() {
        Integer l = ((st) this.a).l(6);
        if (l == null) {
            return null;
        }
        return as.i((double) l.intValue());
    }

    public String C() {
        return l(2, 1, C0201.m82(3841), C0201.m82(3842), C0201.m82(3843));
    }

    public String D() {
        return l(1, 1, C0201.m82(3844), C0201.m82(3845), C0201.m82(3846), C0201.m82(3847), C0201.m82(3848));
    }

    public String E() {
        return m(13, C0201.m82(3849), C0201.m82(3850), C0201.m82(3851));
    }

    public String F() {
        return m(11, C0201.m82(3852), C0201.m82(3853), C0201.m82(3854));
    }

    public String G() {
        Integer l = ((st) this.a).l(7);
        if (l == null) {
            return null;
        }
        int intValue = l.intValue();
        if (intValue == 1) {
            return C0201.m82(3862);
        }
        if (intValue == 2) {
            return C0201.m82(3861);
        }
        if (intValue == 3) {
            return C0201.m82(3860);
        }
        if (intValue == 4) {
            return C0201.m82(3859);
        }
        if (intValue == 5) {
            return C0201.m82(3858);
        }
        if (intValue == 129) {
            return C0201.m82(3857);
        }
        return C0201.m82(3855) + l + C0201.m82(3856);
    }

    @Override // defpackage.as
    public String f(int i) {
        if (i == 20) {
            return v();
        }
        switch (i) {
            case 1:
                return D();
            case 2:
                return C();
            case 3:
                return A();
            case 4:
                return z();
            case 5:
                return y();
            case 6:
                return B();
            case 7:
                return G();
            default:
                switch (i) {
                    case 10:
                        return x();
                    case 11:
                        return F();
                    case 12:
                        return w();
                    case 13:
                        return E();
                    default:
                        return super.f(i);
                }
        }
    }

    public String v() {
        Integer l = ((st) this.a).l(20);
        if (l == null) {
            return null;
        }
        int intValue = l.intValue();
        if (intValue == 64) {
            return C0201.m82(3870);
        }
        if (intValue == 80) {
            return C0201.m82(3869);
        }
        if (intValue == 100) {
            return C0201.m82(3868);
        }
        if (intValue == 125) {
            return C0201.m82(3867);
        }
        if (intValue == 244) {
            return C0201.m82(3866);
        }
        if (intValue == 250) {
            return C0201.m82(3865);
        }
        return C0201.m82(3863) + l + C0201.m82(3864);
    }

    public String w() {
        return m(12, C0201.m82(3871), C0201.m82(3872), C0201.m82(3873));
    }

    public String x() {
        Integer l = ((st) this.a).l(10);
        if (l == null) {
            return null;
        }
        int intValue = l.intValue();
        if (intValue == 65536) {
            return C0201.m82(3878);
        }
        String r3 = C0201.m82(3874);
        if (intValue == 65537 || intValue == 131072) {
            return r3;
        }
        if (intValue == 262144) {
            return C0201.m82(3877);
        }
        return C0201.m82(3875) + l + C0201.m82(3876);
    }

    public String y() {
        Integer l = ((st) this.a).l(5);
        if (l == null) {
            return null;
        }
        int intValue = l.intValue();
        if (intValue == 11) {
            return C0201.m82(3883);
        }
        if (intValue == 13) {
            return C0201.m82(3882);
        }
        if (intValue == 15) {
            return C0201.m82(3881);
        }
        return C0201.m82(3879) + l + C0201.m82(3880);
    }

    public String z() {
        return l(4, 1, C0201.m82(3884), C0201.m82(3885), C0201.m82(3886), C0201.m82(3887));
    }
}
