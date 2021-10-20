package defpackage;

import java.text.DecimalFormat;
import java.util.HashMap;
import vigqyno.C0201;

/* renamed from: ju  reason: default package */
/* compiled from: OlympusCameraSettingsMakernoteDescriptor */
public class ju extends as<ku> {
    private static final HashMap<Integer, String> b = new HashMap<>();
    private static final HashMap<Integer, String> c;

    static {
        HashMap<Integer, String> hashMap = new HashMap<>();
        c = hashMap;
        hashMap.put(0, C0201.m82(25579));
        c.put(1, C0201.m82(25580));
        c.put(2, C0201.m82(25581));
        c.put(3, C0201.m82(25582));
        c.put(4, C0201.m82(25583));
        c.put(5, C0201.m82(25584));
        c.put(6, C0201.m82(25585));
        c.put(9, C0201.m82(25586));
        c.put(10, C0201.m82(25587));
        c.put(12, C0201.m82(25588));
        c.put(13, C0201.m82(25589));
        c.put(14, C0201.m82(25590));
        c.put(15, C0201.m82(25591));
        c.put(16, C0201.m82(25592));
        c.put(17, C0201.m82(25593));
        c.put(18, C0201.m82(25594));
        c.put(19, C0201.m82(25595));
        c.put(20, C0201.m82(25596));
        c.put(21, C0201.m82(25597));
        c.put(22, C0201.m82(25598));
        c.put(23, C0201.m82(25599));
        c.put(24, C0201.m82(25600));
        c.put(25, C0201.m82(25601));
        c.put(26, C0201.m82(25602));
        c.put(27, C0201.m82(25603));
        c.put(28, C0201.m82(25604));
        c.put(29, C0201.m82(25605));
        c.put(31, C0201.m82(25606));
        c.put(32, C0201.m82(25607));
        c.put(33, C0201.m82(25608));
        c.put(34, C0201.m82(25609));
        c.put(35, C0201.m82(25610));
        c.put(36, C0201.m82(25611));
        c.put(37, C0201.m82(25612));
        c.put(38, C0201.m82(25613));
        c.put(39, C0201.m82(25614));
        c.put(40, C0201.m82(25615));
        c.put(41, C0201.m82(25616));
        b.put(0, C0201.m82(25617));
        b.put(-31999, C0201.m82(25618));
        b.put(-31998, C0201.m82(25619));
        b.put(-31997, C0201.m82(25620));
    }

    public ju(ku kuVar) {
        super(kuVar);
    }

    private String N(int i) {
        int[] k = ((ku) this.a).k(i);
        if (k == null || k.length == 0) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < k.length; i2++) {
            if (i2 == 0) {
                sb.append(c.containsKey(Integer.valueOf(k[i2])) ? c.get(Integer.valueOf(k[i2])) : C0201.m82(25621));
            } else {
                sb.append(k[i2]);
            }
            sb.append(C0201.m82(25622));
        }
        return sb.substring(0, sb.length() - 2);
    }

    private String x0(int i) {
        int[] k = ((ku) this.a).k(i);
        if (k == null || k.length < 3) {
            return null;
        }
        return String.format(C0201.m82(25623), Integer.valueOf(k[0]), Integer.valueOf(k[1]), Integer.valueOf(k[2]));
    }

    public String A() {
        return N(1321);
    }

    public String B() {
        int[] k = ((ku) this.a).k(1327);
        if (k == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < k.length; i++) {
            String r4 = C0201.m82(25624);
            if (i == 0) {
                sb.append(c.containsKey(Integer.valueOf(k[i])) ? c.get(Integer.valueOf(k[i])) : C0201.m82(25625));
                sb.append(r4);
            } else if (i == 3) {
                sb.append(C0201.m82(25626));
                sb.append(k[i]);
                sb.append(r4);
            } else {
                String r7 = C0201.m82(25627);
                String r8 = C0201.m82(25628);
                if (i == 4) {
                    switch (k[i]) {
                        case 0:
                            sb.append(C0201.m82(25635));
                            break;
                        case 32784:
                            sb.append(C0201.m82(25634));
                            break;
                        case 32800:
                            sb.append(C0201.m82(25633));
                            break;
                        case 32816:
                            sb.append(C0201.m82(25632));
                            break;
                        case 32832:
                            sb.append(C0201.m82(25631));
                            break;
                        case 32848:
                            sb.append(C0201.m82(25630));
                            break;
                        case 32864:
                            sb.append(C0201.m82(25629));
                            break;
                        default:
                            sb.append(r8);
                            sb.append(k[i]);
                            sb.append(r7);
                            break;
                    }
                    sb.append(r4);
                } else if (i == 6) {
                    int i2 = k[i];
                    if (i2 == 0) {
                        sb.append(C0201.m82(25640));
                    } else if (i2 == 1) {
                        sb.append(C0201.m82(25639));
                    } else if (i2 == 2) {
                        sb.append(C0201.m82(25638));
                    } else if (i2 == 3) {
                        sb.append(C0201.m82(25637));
                    } else if (i2 != 4) {
                        sb.append(r8);
                        sb.append(k[i]);
                        sb.append(r7);
                    } else {
                        sb.append(C0201.m82(25636));
                    }
                    sb.append(r4);
                } else {
                    sb.append(k[i]);
                    sb.append(r4);
                }
            }
        }
        return sb.substring(0, sb.length() - 2);
    }

    public String C() {
        return u(0, 4);
    }

    public String D() {
        int[] k = ((ku) this.a).k(1330);
        if (k == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < k.length; i++) {
            String r4 = C0201.m82(25641);
            if (i == 0) {
                sb.append(C0201.m82(25642));
                sb.append(k[i]);
                sb.append(r4);
            } else if (i == 3) {
                sb.append(C0201.m82(25643));
                sb.append(k[i]);
                sb.append(r4);
            } else {
                sb.append(k[i]);
                sb.append(r4);
            }
        }
        return sb.substring(0, sb.length() - 2);
    }

    public String E() {
        return m(1287, C0201.m82(25644), C0201.m82(25645), C0201.m82(25646));
    }

    public String F() {
        return x0(1285);
    }

    public String G() {
        return x0(1283);
    }

    public String H() {
        Object o = ((ku) this.a).o(2312);
        if (o == null) {
            return null;
        }
        return o.toString();
    }

    public String I() {
        return m(1291, C0201.m82(25647), C0201.m82(25648));
    }

    public String J() {
        int[] k = ((ku) this.a).k(1536);
        if (k == null) {
            return null;
        }
        if (k.length == 0 || k[0] == 0) {
            return C0201.m82(25662);
        }
        StringBuilder sb = new StringBuilder();
        if (k[0] != 5 || k.length < 3) {
            int i = k[0];
            if (i == 1) {
                sb.append(C0201.m82(25660));
            } else if (i == 2) {
                sb.append(C0201.m82(25659));
            } else if (i == 3) {
                sb.append(C0201.m82(25658));
            } else if (i != 4) {
                sb.append(C0201.m82(25655));
                sb.append(k[0]);
                sb.append(C0201.m82(25656));
            } else {
                sb.append(C0201.m82(25657));
            }
        } else {
            int i2 = k[2];
            if ((i2 & 1) > 0) {
                sb.append(C0201.m82(25649));
            }
            if (((i2 >> 1) & 1) > 0) {
                sb.append(C0201.m82(25650));
            }
            if (((i2 >> 2) & 1) > 0) {
                sb.append(C0201.m82(25651));
            }
            if (((i2 >> 3) & 1) > 0) {
                sb.append(C0201.m82(25652));
            }
            if (((i2 >> 6) & 1) > 0) {
                sb.append(C0201.m82(25653));
            }
            sb.append(C0201.m82(25654));
        }
        sb.append(C0201.m82(25661));
        sb.append(k[1]);
        return sb.toString();
    }

    public String K() {
        return l(512, 1, C0201.m82(25663), C0201.m82(25664), C0201.m82(25665), C0201.m82(25666), C0201.m82(25667));
    }

    public String L() {
        return q(515);
    }

    public String M() {
        return m(2306, C0201.m82(25668), C0201.m82(25669));
    }

    public String O() {
        int[] k = ((ku) this.a).k(1028);
        if (k == null || k.length == 0) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        int i = k[0];
        if (i == 0) {
            sb.append(C0201.m82(25675));
        } else if (i == 3) {
            sb.append(C0201.m82(25674));
        } else if (i == 4) {
            sb.append(C0201.m82(25673));
        } else if (i != 5) {
            sb.append(C0201.m82(25670));
            sb.append(k[0]);
            sb.append(C0201.m82(25671));
        } else {
            sb.append(C0201.m82(25672));
        }
        for (int i2 = 1; i2 < k.length; i2++) {
            sb.append(C0201.m82(25676));
            sb.append(k[i2]);
        }
        return sb.toString();
    }

    public String P() {
        mr[] q = ((ku) this.a).q(1029);
        if (q == null || q.length == 0) {
            return null;
        }
        if (q.length == 3) {
            if (q[0].f() == 0 && q[1].f() == 0 && q[2].f() == 0) {
                return C0201.m82(25677);
            }
        } else if (q.length == 4 && q[0].f() == 0 && q[1].f() == 0 && q[2].f() == 0 && q[3].f() == 0) {
            return C0201.m82(25678);
        }
        StringBuilder sb = new StringBuilder();
        for (mr mrVar : q) {
            sb.append(mrVar);
            sb.append(C0201.m82(25679));
        }
        return sb.substring(0, sb.length() - 2);
    }

    public String Q() {
        Integer l = ((ku) this.a).l(1024);
        if (l == null) {
            return null;
        }
        if (l.intValue() == 0) {
            return C0201.m82(25680);
        }
        StringBuilder sb = new StringBuilder();
        int intValue = l.intValue();
        if ((intValue & 1) != 0) {
            sb.append(C0201.m82(25681));
        }
        if (((intValue >> 1) & 1) != 0) {
            sb.append(C0201.m82(25682));
        }
        if (((intValue >> 2) & 1) != 0) {
            sb.append(C0201.m82(25683));
        }
        if (((intValue >> 3) & 1) != 0) {
            sb.append(C0201.m82(25684));
        }
        if (((intValue >> 4) & 1) != 0) {
            sb.append(C0201.m82(25685));
        }
        if (((intValue >> 5) & 1) != 0) {
            sb.append(C0201.m82(25686));
        }
        return sb.substring(0, sb.length() - 2);
    }

    public String R() {
        Integer l = ((ku) this.a).l(1027);
        if (l == null) {
            return null;
        }
        int intValue = l.intValue();
        if (intValue == 0) {
            return C0201.m82(25701);
        }
        if (intValue == 1) {
            return C0201.m82(25700);
        }
        if (intValue == 2) {
            return C0201.m82(25699);
        }
        if (intValue == 3) {
            return C0201.m82(25698);
        }
        if (intValue == 4) {
            return C0201.m82(25697);
        }
        switch (intValue) {
            case 9:
                return C0201.m82(25696);
            case 10:
                return C0201.m82(25695);
            case 11:
                return C0201.m82(25694);
            case 12:
                return C0201.m82(25693);
            default:
                switch (intValue) {
                    case 17:
                        return C0201.m82(25692);
                    case 18:
                        return C0201.m82(25691);
                    case 19:
                        return C0201.m82(25690);
                    case 20:
                        return C0201.m82(25689);
                    default:
                        return C0201.m82(25687) + l + C0201.m82(25688);
                }
        }
    }

    public String S() {
        int[] k = ((ku) this.a).k(769);
        if (k == null) {
            Integer l = ((ku) this.a).l(769);
            if (l == null) {
                return null;
            }
            k = new int[]{l.intValue()};
        }
        if (k.length == 0) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        int i = k[0];
        if (i == 0) {
            sb.append(C0201.m82(25709));
        } else if (i == 1) {
            sb.append(C0201.m82(25708));
        } else if (i == 2) {
            sb.append(C0201.m82(25707));
        } else if (i == 3) {
            sb.append(C0201.m82(25706));
        } else if (i == 4) {
            sb.append(C0201.m82(25705));
        } else if (i != 10) {
            sb.append(C0201.m82(25702) + k[0] + C0201.m82(25703));
        } else {
            sb.append(C0201.m82(25704));
        }
        if (k.length > 1) {
            sb.append(C0201.m82(25710));
            int i2 = k[1];
            if (i2 == 0) {
                sb.append(C0201.m82(25711));
            } else {
                if ((i2 & 1) > 0) {
                    sb.append(C0201.m82(25712));
                }
                if (((i2 >> 2) & 1) > 0) {
                    sb.append(C0201.m82(25713));
                }
                if (((i2 >> 4) & 1) > 0) {
                    sb.append(C0201.m82(25714));
                }
                if (((i2 >> 5) & 1) > 0) {
                    sb.append(C0201.m82(25715));
                }
                if (((i2 >> 6) & 1) > 0) {
                    sb.append(C0201.m82(25716));
                }
                if (((i2 >> 7) & 1) > 0) {
                    sb.append(C0201.m82(25717));
                }
                if (((i2 >> 8) & 1) > 0) {
                    sb.append(C0201.m82(25718));
                }
                sb.setLength(sb.length() - 2);
            }
        }
        return sb.toString();
    }

    public String T() {
        int[] k = ((ku) this.a).k(770);
        if (k == null) {
            Integer l = ((ku) this.a).l(770);
            if (l == null) {
                return null;
            }
            k = new int[]{l.intValue()};
        }
        if (k.length == 0) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        int i = k[0];
        if (i == 0) {
            sb.append(C0201.m82(25722));
        } else if (i != 1) {
            sb.append(C0201.m82(25719) + k[0] + C0201.m82(25720));
        } else {
            sb.append(C0201.m82(25721));
        }
        if (k.length > 1) {
            sb.append(C0201.m82(25723) + k[1]);
        }
        return sb.toString();
    }

    public String U() {
        String str;
        int[] k = ((ku) this.a).k(1295);
        if (k == null || k.length < 3) {
            return null;
        }
        String format = String.format(C0201.m82(25724), Integer.valueOf(k[0]), Integer.valueOf(k[1]), Integer.valueOf(k[2]));
        if (format.equals(C0201.m82(25725))) {
            str = C0201.m82(25726);
        } else if (format.equals(C0201.m82(25727))) {
            str = C0201.m82(25728);
        } else if (format.equals(C0201.m82(25729))) {
            str = C0201.m82(25730);
        } else if (format.equals(C0201.m82(25731))) {
            str = C0201.m82(25732);
        } else {
            str = C0201.m82(25733) + format + C0201.m82(25734);
        }
        if (k.length <= 3) {
            return str;
        }
        if (k[3] == 0) {
            return str + C0201.m82(25735);
        } else if (k[3] != 1) {
            return str;
        } else {
            return str + C0201.m82(25736);
        }
    }

    public String V() {
        return l(1539, 1, C0201.m82(25737), C0201.m82(25738), C0201.m82(25739), C0201.m82(25740), C0201.m82(25741));
    }

    public String W() {
        return m(1540, C0201.m82(25742), C0201.m82(25743), C0201.m82(25744), C0201.m82(25745), C0201.m82(25746));
    }

    public String X() {
        return m(768, C0201.m82(25747), C0201.m82(25748), C0201.m82(25749));
    }

    public String Y() {
        return N(1324);
    }

    public String Z() {
        Integer l = ((ku) this.a).l(2304);
        if (l == null) {
            return null;
        }
        DecimalFormat decimalFormat = new DecimalFormat(C0201.m82(25750));
        double intValue = (double) l.intValue();
        Double.isNaN(intValue);
        return String.format(C0201.m82(25751), decimalFormat.format(intValue / 10.0d));
    }

    public String a0() {
        int[] k = ((ku) this.a).k(2305);
        if (k == null || k.length < 2) {
            return null;
        }
        DecimalFormat decimalFormat = new DecimalFormat(C0201.m82(25752));
        double d = (double) k[0];
        Double.isNaN(d);
        double d2 = (double) k[1];
        Double.isNaN(d2);
        return String.format(C0201.m82(25753), decimalFormat.format(d / 10.0d), decimalFormat.format(d2 / 10.0d));
    }

    public String b0() {
        mr[] q = ((ku) this.a).q(1030);
        String r1 = C0201.m82(25754);
        if (q == null || q.length == 0) {
            return r1;
        }
        if (q.length == 3) {
            if (q[0].f() == 0 && q[1].f() == 0 && q[2].f() == 0) {
                return r1;
            }
        } else if (q.length == 4 && q[0].f() == 0 && q[1].f() == 0 && q[2].f() == 0 && q[3].f() == 0) {
            return C0201.m82(25755);
        }
        StringBuilder sb = new StringBuilder();
        for (mr mrVar : q) {
            sb.append(mrVar);
            sb.append(C0201.m82(25756));
        }
        return sb.substring(0, sb.length() - 2);
    }

    public String c0() {
        Integer l = ((ku) this.a).l(514);
        if (l == null) {
            return null;
        }
        int intValue = l.intValue();
        if (intValue == 2) {
            return C0201.m82(25764);
        }
        if (intValue == 3) {
            return C0201.m82(25763);
        }
        if (intValue == 5) {
            return C0201.m82(25762);
        }
        if (intValue == 261) {
            return C0201.m82(25761);
        }
        if (intValue == 515) {
            return C0201.m82(25760);
        }
        if (intValue == 1027) {
            return C0201.m82(25759);
        }
        return C0201.m82(25757) + l + C0201.m82(25758);
    }

    public String d0() {
        return m(1284, C0201.m82(25765), C0201.m82(25766), C0201.m82(25767), C0201.m82(25768), C0201.m82(25769));
    }

    public String e0() {
        return m(516, C0201.m82(25770), C0201.m82(25771));
    }

    @Override // defpackage.as
    public String f(int i) {
        if (i != 0) {
            if (i == 1280) {
                return y0();
            }
            if (i == 1281) {
                return z0();
            }
            if (i == 1312) {
                return k0();
            }
            if (i == 1313) {
                return m0();
            }
            if (i == 1536) {
                return J();
            }
            if (i == 1537) {
                return h0();
            }
            switch (i) {
                case 0:
                    break;
                case 256:
                    return q0();
                case 768:
                    return X();
                case 769:
                    return S();
                case 770:
                    return T();
                case 771:
                    return z();
                case 772:
                    return w();
                case 773:
                    return y();
                case 774:
                    return x();
                case 1024:
                    return Q();
                case 1295:
                    return U();
                case 1321:
                    return A();
                case 1330:
                    return D();
                case 1539:
                    return V();
                case 1540:
                    return W();
                case 2052:
                    return v0();
                case 2304:
                    return Z();
                case 2305:
                    return a0();
                case 2306:
                    return M();
                case 2307:
                    return r0();
                case 2308:
                    return p0();
                case 2312:
                    return H();
                default:
                    switch (i) {
                        case 512:
                            return K();
                        case 513:
                            return v();
                        case 514:
                            return c0();
                        case 515:
                            return L();
                        case 516:
                            return e0();
                        default:
                            switch (i) {
                                case 1027:
                                    return R();
                                case 1028:
                                    return O();
                                case 1029:
                                    return P();
                                case 1030:
                                    return b0();
                                default:
                                    switch (i) {
                                        case 1283:
                                            return G();
                                        case 1284:
                                            return d0();
                                        case 1285:
                                            return F();
                                        case 1286:
                                            return u0();
                                        case 1287:
                                            return E();
                                        default:
                                            switch (i) {
                                                case 1289:
                                                    return s0();
                                                case 1290:
                                                    return g0();
                                                case 1291:
                                                    return I();
                                                case 1292:
                                                    return t0();
                                                default:
                                                    switch (i) {
                                                        case 1315:
                                                            return j0();
                                                        case 1316:
                                                            return n0();
                                                        case 1317:
                                                            return i0();
                                                        case 1318:
                                                            return o0();
                                                        case 1319:
                                                            return f0();
                                                        default:
                                                            switch (i) {
                                                                case 1324:
                                                                    return Y();
                                                                case 1325:
                                                                    return l0();
                                                                case 1326:
                                                                    return w0();
                                                                case 1327:
                                                                    return B();
                                                                default:
                                                                    return super.f(i);
                                                            }
                                                    }
                                            }
                                    }
                            }
                    }
            }
        }
        return C();
    }

    public String f0() {
        int[] k = ((ku) this.a).k(1319);
        if (k == null) {
            return null;
        }
        String format = String.format(C0201.m82(25772), Integer.valueOf(k[0]), Integer.valueOf(k[1]), Integer.valueOf(k[2]));
        if (format.equals(C0201.m82(25773))) {
            return C0201.m82(25774);
        }
        if (format.equals(C0201.m82(25775))) {
            return C0201.m82(25776);
        }
        if (format.equals(C0201.m82(25777))) {
            return C0201.m82(25778);
        }
        if (format.equals(C0201.m82(25779))) {
            return C0201.m82(25780);
        }
        if (format.equals(C0201.m82(25781))) {
            return C0201.m82(25782);
        }
        return C0201.m82(25783) + format + C0201.m82(25784);
    }

    public String g0() {
        Integer l = ((ku) this.a).l(1290);
        if (l == null) {
            return null;
        }
        int intValue = l.intValue();
        String r2 = C0201.m82(25785);
        if (intValue == 0) {
            return r2;
        }
        StringBuilder sb = new StringBuilder();
        int intValue2 = l.intValue();
        if ((intValue2 & 1) != 0) {
            sb.append(C0201.m82(25786));
        }
        if (((intValue2 >> 1) & 1) != 0) {
            sb.append(C0201.m82(25787));
        }
        if (((intValue2 >> 2) & 1) != 0) {
            sb.append(C0201.m82(25788));
        }
        if (((intValue2 >> 3) & 1) != 0) {
            sb.append(C0201.m82(25789));
        }
        return sb.length() != 0 ? sb.substring(0, sb.length() - 2) : r2;
    }

    public String h0() {
        String str;
        int[] k = ((ku) this.a).k(1537);
        if (k == null) {
            return null;
        }
        if (k.length == 0 || k[0] == 0) {
            return C0201.m82(25797);
        }
        int i = k[0];
        if (i == 1) {
            str = C0201.m82(25795);
        } else if (i == 2) {
            str = C0201.m82(25794);
        } else if (i == 3) {
            str = C0201.m82(25793);
        } else if (i != 4) {
            str = C0201.m82(25790) + k[0] + C0201.m82(25791);
        } else {
            str = C0201.m82(25792);
        }
        return String.format(C0201.m82(25796), str, Integer.valueOf(k[1]));
    }

    public String i0() {
        return m(1317, C0201.m82(25798), C0201.m82(25799), C0201.m82(25800), C0201.m82(25801), C0201.m82(25802), C0201.m82(25803));
    }

    public String j0() {
        return x0(1315);
    }

    public String k0() {
        int[] k = ((ku) this.a).k(1312);
        if (k == null) {
            Integer l = ((ku) this.a).l(1290);
            if (l == null) {
                return null;
            }
            k = new int[]{l.intValue()};
        }
        if (k.length == 0) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        int i = k[0];
        if (i == 1) {
            sb.append(C0201.m82(25812));
        } else if (i == 2) {
            sb.append(C0201.m82(25811));
        } else if (i == 3) {
            sb.append(C0201.m82(25810));
        } else if (i == 4) {
            sb.append(C0201.m82(25809));
        } else if (i == 5) {
            sb.append(C0201.m82(25808));
        } else if (i == 256) {
            sb.append(C0201.m82(25807));
        } else if (i != 512) {
            sb.append(C0201.m82(25804));
            sb.append(k[0]);
            sb.append(C0201.m82(25805));
        } else {
            sb.append(C0201.m82(25806));
        }
        if (k.length > 1) {
            sb.append(C0201.m82(25813));
            sb.append(k[1]);
        }
        return sb.toString();
    }

    public String l0() {
        int[] k = ((ku) this.a).k(1325);
        if (k == null) {
            return null;
        }
        String format = String.format(C0201.m82(25814), Integer.valueOf(k[0]), Integer.valueOf(k[1]), Integer.valueOf(k[2]));
        if (format.equals(C0201.m82(25815))) {
            return C0201.m82(25816);
        }
        if (format.equals(C0201.m82(25817))) {
            return C0201.m82(25818);
        }
        if (format.equals(C0201.m82(25819))) {
            return C0201.m82(25820);
        }
        if (format.equals(C0201.m82(25821))) {
            return C0201.m82(25822);
        }
        return C0201.m82(25823) + format + C0201.m82(25824);
    }

    public String m0() {
        return x0(1313);
    }

    public String n0() {
        return x0(1316);
    }

    public String o0() {
        return m(1318, C0201.m82(25825), C0201.m82(25826), C0201.m82(25827), C0201.m82(25828), C0201.m82(25829), C0201.m82(25830));
    }

    public String p0() {
        String str;
        int[] k = ((ku) this.a).k(2308);
        if (k == null || k.length < 2) {
            return null;
        }
        if (k[0] != 0) {
            double d = (double) k[0];
            Double.isNaN(d);
            str = Double.toString(d / 10.0d);
        } else {
            str = C0201.m82(25831);
        }
        return String.format(C0201.m82(25832), str, Integer.valueOf(k[1]));
    }

    public String q0() {
        return m(256, C0201.m82(25833), C0201.m82(25834));
    }

    public String r0() {
        String str;
        int[] k = ((ku) this.a).k(2307);
        if (k == null || k.length < 2) {
            return null;
        }
        if (k[0] != 0) {
            double d = (double) (-k[0]);
            Double.isNaN(d);
            str = Double.toString(d / 10.0d);
        } else {
            str = C0201.m82(25835);
        }
        return String.format(C0201.m82(25836), str, Integer.valueOf(k[1]));
    }

    public String s0() {
        Integer l = ((ku) this.a).l(1289);
        if (l == null) {
            return null;
        }
        int intValue = l.intValue();
        if (intValue == 0) {
            return C0201.m82(25894);
        }
        if (intValue == 54) {
            return C0201.m82(25893);
        }
        if (intValue == 57) {
            return C0201.m82(25892);
        }
        if (intValue == 142) {
            return C0201.m82(25891);
        }
        if (intValue == 154) {
            return C0201.m82(25890);
        }
        if (intValue == 59) {
            return C0201.m82(25889);
        }
        if (intValue == 60) {
            return C0201.m82(25888);
        }
        String r2 = C0201.m82(25837);
        switch (intValue) {
            case 6:
                return C0201.m82(25887);
            case 7:
                return C0201.m82(25886);
            case 8:
                return C0201.m82(25885);
            case 9:
                return r2;
            case 10:
                return C0201.m82(25884);
            case 11:
                return C0201.m82(25883);
            case 12:
                return C0201.m82(25882);
            case 13:
                return C0201.m82(25881);
            case 14:
                return C0201.m82(25880);
            case 15:
                return C0201.m82(25879);
            case 16:
                return r2;
            case 17:
                return C0201.m82(25878);
            case 18:
                return C0201.m82(25877);
            case 19:
                return C0201.m82(25876);
            case 20:
                return C0201.m82(25875);
            case 21:
                return C0201.m82(25874);
            case 22:
                return C0201.m82(25873);
            case 23:
                return C0201.m82(25872);
            case 24:
                return C0201.m82(25871);
            case 25:
                return C0201.m82(25870);
            case 26:
                return C0201.m82(25869);
            case 27:
                return C0201.m82(25868);
            case 28:
                return C0201.m82(25867);
            case 29:
                return C0201.m82(25866);
            case 30:
                return C0201.m82(25865);
            case 31:
                return C0201.m82(25864);
            case 32:
                return C0201.m82(25863);
            case 33:
                return C0201.m82(25862);
            case 34:
                return C0201.m82(25861);
            case 35:
                return C0201.m82(25860);
            case 36:
                return C0201.m82(25859);
            case 37:
                return C0201.m82(25858);
            case 38:
                return C0201.m82(25857);
            case 39:
                return C0201.m82(25856);
            case 40:
                return C0201.m82(25855);
            case 41:
                return C0201.m82(25854);
            case 42:
                return C0201.m82(25853);
            case 43:
                return C0201.m82(25852);
            case 44:
                return C0201.m82(25851);
            case 45:
                return C0201.m82(25850);
            case 46:
                return C0201.m82(25849);
            case 47:
                return C0201.m82(25848);
            case 48:
                return C0201.m82(25847);
            case 49:
                return C0201.m82(25846);
            case 50:
                return C0201.m82(25845);
            default:
                switch (intValue) {
                    case 63:
                        return C0201.m82(25844);
                    case 64:
                        return C0201.m82(25843);
                    case 65:
                        return C0201.m82(25842);
                    case 66:
                        return C0201.m82(25841);
                    case 67:
                        return C0201.m82(25840);
                    default:
                        return C0201.m82(25838) + l + C0201.m82(25839);
                }
        }
    }

    public String t0() {
        return m(1292, C0201.m82(25895), C0201.m82(25896));
    }

    public String u0() {
        return x0(1286);
    }

    public String v() {
        return m(513, C0201.m82(25897), C0201.m82(25898));
    }

    public String v0() {
        int[] k = ((ku) this.a).k(2052);
        if (k == null || k.length < 2) {
            return null;
        }
        int i = k[0];
        int i2 = k[1];
        if (i == 0 && i2 == 0) {
            return C0201.m82(25899);
        }
        if (i == 9 && i2 == 8) {
            return C0201.m82(25900);
        }
        return String.format(C0201.m82(25901), Integer.valueOf(i), Integer.valueOf(i2));
    }

    public String w() {
        Object o = ((ku) this.a).o(772);
        if (o == null || !(o instanceof long[])) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        long[] jArr = (long[]) o;
        for (long j : jArr) {
            if (j != 0) {
                if (sb.length() != 0) {
                    sb.append(C0201.m82(25902));
                }
                if (j == 913916549) {
                    sb.append(C0201.m82(25903));
                } else if (j == 2038007173) {
                    sb.append(C0201.m82(25904));
                } else if (j == 3178875269L) {
                    sb.append(C0201.m82(25905));
                }
                sb.append(String.format(C0201.m82(25906), Long.valueOf((j >> 24) & 255), Long.valueOf((j >> 16) & 255), Long.valueOf((j >> 8) & 255), Long.valueOf(j & 255)));
            }
        }
        if (sb.length() == 0) {
            return null;
        }
        return sb.toString();
    }

    public String w0() {
        int[] k = ((ku) this.a).k(1326);
        if (k == null || k.length == 0) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < k.length; i++) {
            String r4 = C0201.m82(25907);
            if (i == 0 || i == 4 || i == 8 || i == 12 || i == 16 || i == 20 || i == 24) {
                sb.append(b.get(Integer.valueOf(k[i])));
                sb.append(r4);
            } else {
                sb.append(k[i]);
                sb.append(r4);
            }
        }
        return sb.substring(0, sb.length() - 2);
    }

    public String x() {
        return m(774, C0201.m82(25908), C0201.m82(25909));
    }

    public String y() {
        mr[] q = ((ku) this.a).q(773);
        String r1 = C0201.m82(25910);
        if (q == null) {
            return r1;
        }
        if (q.length < 4) {
            return null;
        }
        int i = (q.length == 5 && q[0].longValue() == 0) ? 1 : 0;
        int doubleValue = (int) (q[i].doubleValue() * 100.0d);
        int doubleValue2 = (int) (q[i + 1].doubleValue() * 100.0d);
        int doubleValue3 = (int) (q[i + 2].doubleValue() * 100.0d);
        int doubleValue4 = (int) (q[i + 3].doubleValue() * 100.0d);
        if (doubleValue + doubleValue2 + doubleValue3 + doubleValue4 == 0) {
            return r1;
        }
        return String.format(C0201.m82(25911), Integer.valueOf(doubleValue), Integer.valueOf(doubleValue2), Integer.valueOf(doubleValue3), Integer.valueOf(doubleValue4));
    }

    public String y0() {
        Integer l = ((ku) this.a).l(1280);
        if (l == null) {
            return null;
        }
        int intValue = l.intValue();
        if (intValue == 0) {
            return C0201.m82(25935);
        }
        if (intValue == 1) {
            return C0201.m82(25934);
        }
        String r3 = C0201.m82(25912);
        if (intValue == 48) {
            return r3;
        }
        if (intValue == 67) {
            return C0201.m82(25933);
        }
        switch (intValue) {
            case 16:
                return C0201.m82(25932);
            case 17:
                return C0201.m82(25931);
            case 18:
                return C0201.m82(25930);
            default:
                switch (intValue) {
                    case 20:
                        return C0201.m82(25929);
                    case 21:
                        return r3;
                    case 22:
                        return C0201.m82(25928);
                    case 23:
                        return C0201.m82(25927);
                    default:
                        switch (intValue) {
                            case 33:
                                return C0201.m82(25926);
                            case 34:
                                return C0201.m82(25925);
                            case 35:
                                return C0201.m82(25924);
                            case 36:
                                return C0201.m82(25923);
                            default:
                                switch (intValue) {
                                    case 256:
                                        return C0201.m82(25922);
                                    case 257:
                                        return C0201.m82(25921);
                                    case 258:
                                        return C0201.m82(25920);
                                    case 259:
                                        return C0201.m82(25919);
                                    default:
                                        switch (intValue) {
                                            case 512:
                                                return C0201.m82(25918);
                                            case 513:
                                                return C0201.m82(25917);
                                            case 514:
                                                return C0201.m82(25916);
                                            case 515:
                                                return C0201.m82(25915);
                                            default:
                                                return C0201.m82(25913) + l + C0201.m82(25914);
                                        }
                                }
                        }
                }
        }
    }

    public String z() {
        return m(771, C0201.m82(25936), C0201.m82(25937));
    }

    public String z0() {
        Integer l = ((ku) this.a).l(1281);
        if (l == null) {
            return null;
        }
        if (l.intValue() == 0) {
            return C0201.m82(25938);
        }
        return l.toString();
    }
}
