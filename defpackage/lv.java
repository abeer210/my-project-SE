package defpackage;

import vigqyno.C0201;

/* renamed from: lv  reason: default package */
/* compiled from: SanyoMakernoteDescriptor */
public class lv extends as<mv> {
    public lv(mv mvVar) {
        super(mvVar);
    }

    private String A() {
        return m(541, C0201.m82(29678), C0201.m82(29679));
    }

    private String B() {
        return m(514, C0201.m82(29680), C0201.m82(29681), C0201.m82(29682), C0201.m82(29683));
    }

    private String C() {
        return m(537, C0201.m82(29684), C0201.m82(29685));
    }

    private String D() {
        return m(531, C0201.m82(29686), C0201.m82(29687));
    }

    private String E() {
        return m(535, C0201.m82(29688), C0201.m82(29689));
    }

    private String F() {
        return m(542, C0201.m82(29690), C0201.m82(29691));
    }

    private String H() {
        return m(543, C0201.m82(29692), C0201.m82(29693), C0201.m82(29694), C0201.m82(29695), C0201.m82(29696), C0201.m82(29697), C0201.m82(29698));
    }

    private String I() {
        return m(532, C0201.m82(29699), C0201.m82(29700));
    }

    private String J() {
        return m(548, C0201.m82(29701), C0201.m82(29702), C0201.m82(29703), C0201.m82(29704));
    }

    private String K() {
        return m(526, C0201.m82(29705), C0201.m82(29706), C0201.m82(29707), C0201.m82(29708));
    }

    private String L() {
        return m(534, C0201.m82(29709), C0201.m82(29710));
    }

    private String M() {
        return m(527, C0201.m82(29711), C0201.m82(29712));
    }

    private String v() {
        return m(528, C0201.m82(29713), C0201.m82(29714));
    }

    private String w() {
        return e(516, 3);
    }

    private String x() {
        return m(539, C0201.m82(29715), C0201.m82(29716));
    }

    private String y() {
        return m(549, C0201.m82(29717), C0201.m82(29718), C0201.m82(29719), C0201.m82(29720));
    }

    private String z() {
        return m(536, C0201.m82(29721), C0201.m82(29722));
    }

    public String G() {
        Integer l = ((mv) this.a).l(513);
        if (l == null) {
            return null;
        }
        int intValue = l.intValue();
        switch (intValue) {
            case 0:
                return C0201.m82(29748);
            case 1:
                return C0201.m82(29747);
            case 2:
                return C0201.m82(29746);
            case 3:
                return C0201.m82(29745);
            case 4:
                return C0201.m82(29744);
            case 5:
                return C0201.m82(29743);
            case 6:
                return C0201.m82(29742);
            case 7:
                return C0201.m82(29741);
            default:
                switch (intValue) {
                    case 256:
                        return C0201.m82(29740);
                    case 257:
                        return C0201.m82(29739);
                    case 258:
                        return C0201.m82(29738);
                    case 259:
                        return C0201.m82(29737);
                    case 260:
                        return C0201.m82(29736);
                    case 261:
                        return C0201.m82(29735);
                    case 262:
                        return C0201.m82(29734);
                    case 263:
                        return C0201.m82(29733);
                    default:
                        switch (intValue) {
                            case 512:
                                return C0201.m82(29732);
                            case 513:
                                return C0201.m82(29731);
                            case 514:
                                return C0201.m82(29730);
                            case 515:
                                return C0201.m82(29729);
                            case 516:
                                return C0201.m82(29728);
                            case 517:
                                return C0201.m82(29727);
                            case 518:
                                return C0201.m82(29726);
                            case 519:
                                return C0201.m82(29725);
                            default:
                                return C0201.m82(29723) + l + C0201.m82(29724);
                        }
                }
        }
    }

    @Override // defpackage.as
    public String f(int i) {
        if (i == 513) {
            return G();
        }
        if (i == 514) {
            return B();
        }
        if (i == 516) {
            return w();
        }
        if (i == 539) {
            return x();
        }
        if (i == 531) {
            return D();
        }
        if (i == 532) {
            return I();
        }
        if (i == 548) {
            return J();
        }
        if (i == 549) {
            return y();
        }
        switch (i) {
            case 526:
                return K();
            case 527:
                return M();
            case 528:
                return v();
            default:
                switch (i) {
                    case 534:
                        return L();
                    case 535:
                        return E();
                    case 536:
                        return z();
                    case 537:
                        return C();
                    default:
                        switch (i) {
                            case 541:
                                return A();
                            case 542:
                                return F();
                            case 543:
                                return H();
                            default:
                                return super.f(i);
                        }
                }
        }
    }
}
