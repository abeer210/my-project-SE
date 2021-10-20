package defpackage;

import vigqyno.C0201;

/* renamed from: xt  reason: default package */
/* compiled from: KodakMakernoteDescriptor */
public class xt extends as<yt> {
    public xt(yt ytVar) {
        super(ytVar);
    }

    public String A() {
        return l(9, 1, C0201.m82(18074), C0201.m82(18075));
    }

    public String B() {
        return m(107, C0201.m82(18076));
    }

    public String C() {
        Integer l = ((yt) this.a).l(27);
        if (l == null) {
            return null;
        }
        int intValue = l.intValue();
        if (intValue == 0) {
            return C0201.m82(18081);
        }
        if (intValue == 8) {
            return C0201.m82(18080);
        }
        if (intValue == 32) {
            return C0201.m82(18079);
        }
        return C0201.m82(18077) + l + C0201.m82(18078);
    }

    public String D() {
        return m(64, C0201.m82(18082), C0201.m82(18083), C0201.m82(18084), C0201.m82(18085));
    }

    @Override // defpackage.as
    public String f(int i) {
        if (i == 9) {
            return A();
        }
        if (i == 10) {
            return v();
        }
        if (i == 27) {
            return C();
        }
        if (i == 56) {
            return z();
        }
        if (i == 64) {
            return D();
        }
        if (i == 102) {
            return w();
        }
        if (i == 107) {
            return B();
        }
        if (i == 92) {
            return y();
        }
        if (i != 93) {
            return super.f(i);
        }
        return x();
    }

    public String v() {
        return m(10, C0201.m82(18086), C0201.m82(18087));
    }

    public String w() {
        Integer l = ((yt) this.a).l(102);
        if (l == null) {
            return null;
        }
        int intValue = l.intValue();
        if (intValue != 1) {
            if (intValue != 2) {
                if (intValue == 3) {
                    return C0201.m82(18093);
                }
                if (intValue == 4) {
                    return C0201.m82(18092);
                }
                String r3 = C0201.m82(18088);
                if (intValue == 32) {
                    return r3;
                }
                if (intValue != 64) {
                    if (intValue == 256) {
                        return r3;
                    }
                    if (intValue != 512) {
                        if (intValue != 8192) {
                            if (intValue != 16384) {
                                return C0201.m82(18089) + l + C0201.m82(18090);
                            }
                        }
                    }
                }
                return C0201.m82(18091);
            }
            return C0201.m82(18094);
        }
        return C0201.m82(18095);
    }

    public String x() {
        return m(93, C0201.m82(18096), C0201.m82(18097));
    }

    public String y() {
        Integer l = ((yt) this.a).l(92);
        if (l == null) {
            return null;
        }
        int intValue = l.intValue();
        if (intValue == 0) {
            return C0201.m82(18103);
        }
        if (intValue != 1) {
            if (intValue != 2) {
                if (intValue != 3) {
                    if (intValue != 16) {
                        if (intValue != 32) {
                            if (intValue != 64) {
                                return C0201.m82(18098) + l + C0201.m82(18099);
                            }
                        }
                    }
                }
                return C0201.m82(18100);
            }
            return C0201.m82(18101);
        }
        return C0201.m82(18102);
    }

    public String z() {
        return m(56, C0201.m82(18104), null, C0201.m82(18105));
    }
}
