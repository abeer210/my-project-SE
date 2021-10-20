package defpackage;

import java.io.IOException;
import java.text.DecimalFormat;
import vigqyno.C0201;

/* renamed from: zu  reason: default package */
/* compiled from: PanasonicMakernoteDescriptor */
public class zu extends as<av> {
    private static final String[] b = {C0201.m82(23186), C0201.m82(23187), C0201.m82(23188), C0201.m82(23189), C0201.m82(23190), C0201.m82(23191), C0201.m82(23192), C0201.m82(23193), C0201.m82(23194), C0201.m82(23195), C0201.m82(23196), C0201.m82(23197), C0201.m82(23198), C0201.m82(23199), C0201.m82(23200), C0201.m82(23201), C0201.m82(23202), C0201.m82(23203), C0201.m82(23204), C0201.m82(23205), C0201.m82(23206), C0201.m82(23207), C0201.m82(23208), C0201.m82(23209), C0201.m82(23210), C0201.m82(23211), C0201.m82(23212), C0201.m82(23213), C0201.m82(23214), C0201.m82(23215), C0201.m82(23216), C0201.m82(23217), C0201.m82(23218), C0201.m82(23219), C0201.m82(23220), C0201.m82(23221), C0201.m82(23222), null, C0201.m82(23223), null, C0201.m82(23224), C0201.m82(23225), C0201.m82(23226), C0201.m82(23227), C0201.m82(23228), C0201.m82(23229), null, null, null, null, C0201.m82(23230)};

    public zu(av avVar) {
        super(avVar);
    }

    private String H0(int i) {
        byte[] e = ((av) this.a).e(i);
        if (e == null) {
            return null;
        }
        br brVar = new br(e);
        try {
            int s = brVar.s(0);
            int s2 = brVar.s(2);
            if (s == -1 && s2 == 1) {
                return C0201.m82(23231);
            }
            if (s == -3 && s2 == 2) {
                return C0201.m82(23232);
            }
            if (s == 0 && s2 == 0) {
                return C0201.m82(23233);
            }
            if (s == 1 && s2 == 1) {
                return C0201.m82(23234);
            }
            if (s == 3 && s2 == 2) {
                return C0201.m82(23235);
            }
            return C0201.m82(23236) + s + C0201.m82(23237) + s2 + C0201.m82(23238);
        } catch (IOException unused) {
            return null;
        }
    }

    private static String N0(String str) {
        if (str == null) {
            return null;
        }
        return str.trim();
    }

    private String v(vr[] vrVarArr) {
        if (vrVarArr == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (i < vrVarArr.length) {
            sb.append(C0201.m82(23239));
            int i2 = i + 1;
            sb.append(i2);
            sb.append(C0201.m82(23240));
            sb.append(vrVarArr[i].toString());
            sb.append(C0201.m82(23241));
            i = i2;
        }
        if (sb.length() > 0) {
            return sb.substring(0, sb.length() - 1);
        }
        return null;
    }

    public String A() {
        int[] k = ((av) this.a).k(15);
        if (k == null || k.length < 2) {
            return null;
        }
        int i = k[0];
        String r5 = C0201.m82(23242);
        String r6 = C0201.m82(23243);
        String r7 = C0201.m82(23244);
        if (i == 0) {
            int i2 = k[1];
            if (i2 == 1) {
                return C0201.m82(23255);
            }
            if (i2 == 16) {
                return C0201.m82(23254);
            }
            return r7 + k[0] + r6 + k[1] + r5;
        } else if (i == 1) {
            int i3 = k[1];
            if (i3 == 0) {
                return C0201.m82(23253);
            }
            if (i3 == 1) {
                return C0201.m82(23252);
            }
            return r7 + k[0] + r6 + k[1] + r5;
        } else if (i == 16) {
            int i4 = k[1];
            if (i4 == 0) {
                return C0201.m82(23251);
            }
            if (i4 == 16) {
                return C0201.m82(23250);
            }
            return r7 + k[0] + r6 + k[1] + r5;
        } else if (i == 32) {
            int i5 = k[1];
            if (i5 == 0) {
                return C0201.m82(23249);
            }
            if (i5 == 1) {
                return C0201.m82(23248);
            }
            if (i5 == 2) {
                return C0201.m82(23247);
            }
            if (i5 == 3) {
                return C0201.m82(23246);
            }
            return r7 + k[0] + r6 + k[1] + r5;
        } else if (i == 64) {
            return C0201.m82(23245);
        } else {
            return r7 + k[0] + r6 + k[1] + r5;
        }
    }

    public String A0() {
        return l(32777, 1, C0201.m82(23256), C0201.m82(23257));
    }

    public String B() {
        return l(49, 1, C0201.m82(23258), C0201.m82(23259), C0201.m82(23260), C0201.m82(23261));
    }

    public String B0() {
        return l(59, 1, C0201.m82(23262), C0201.m82(23263));
    }

    public String C() {
        return l(32, 1, C0201.m82(23264), C0201.m82(23265));
    }

    public String C0() {
        return m(150, C0201.m82(23266), C0201.m82(23267), C0201.m82(23268));
    }

    public String D() {
        sr V = ((av) this.a).V(32784);
        if (V == null) {
            return null;
        }
        return V.c();
    }

    public String D0() {
        return N0(t(101, fr.a));
    }

    public String E() {
        sr V = ((av) this.a).V(51);
        if (V == null) {
            return null;
        }
        return V.c();
    }

    public String E0() {
        return m(171, C0201.m82(23269), C0201.m82(23270));
    }

    public String F() {
        return N0(t(102, fr.a));
    }

    public String F0() {
        return H0(32786);
    }

    public String G() {
        return m(69, C0201.m82(23271), C0201.m82(23272), C0201.m82(23273), C0201.m82(23274), C0201.m82(23275), C0201.m82(23276), C0201.m82(23277));
    }

    public String G0() {
        return H0(89);
    }

    public String H() {
        return m(42, C0201.m82(23278), null, C0201.m82(23279), C0201.m82(23280), C0201.m82(23281));
    }

    public String I() {
        return m(143, C0201.m82(23282), C0201.m82(23283), C0201.m82(23284), C0201.m82(23285), C0201.m82(23286), C0201.m82(23287));
    }

    public String I0() {
        return d(33);
    }

    public String J() {
        return N0(t(109, fr.a));
    }

    public String J0() {
        Integer l = ((av) this.a).l(41);
        if (l == null) {
            return null;
        }
        return (((float) l.intValue()) / 100.0f) + C0201.m82(23288);
    }

    public String K() {
        return m(124, C0201.m82(23289), C0201.m82(23290));
    }

    public String K0() {
        return u(2, 2);
    }

    public String L() {
        return l(40, 1, C0201.m82(23291), C0201.m82(23292), C0201.m82(23293), C0201.m82(23294), C0201.m82(23295));
    }

    public String L0() {
        return l(3, 1, C0201.m82(23296), C0201.m82(23297), C0201.m82(23298), C0201.m82(23299), C0201.m82(23300), null, null, C0201.m82(23301), null, C0201.m82(23302), C0201.m82(23303), C0201.m82(23304));
    }

    public String M() {
        return m(50, C0201.m82(23305), C0201.m82(23306), C0201.m82(23307));
    }

    public String M0() {
        return l(58, 1, C0201.m82(23308), C0201.m82(23309));
    }

    public String N() {
        return m(57, C0201.m82(23310));
    }

    public String O() {
        Integer l = ((av) this.a).l(44);
        if (l == null) {
            return null;
        }
        int intValue = l.intValue();
        String r2 = C0201.m82(23311);
        if (intValue == 0) {
            return r2;
        }
        String r4 = C0201.m82(23312);
        if (intValue == 1) {
            return r4;
        }
        String r5 = C0201.m82(23313);
        if (intValue == 2) {
            return r5;
        }
        if (intValue == 6) {
            return C0201.m82(23317);
        }
        if (intValue == 7) {
            return C0201.m82(23316);
        }
        if (intValue == 256) {
            return r4;
        }
        if (intValue == 272) {
            return r2;
        }
        if (intValue == 288) {
            return r5;
        }
        return C0201.m82(23314) + l + C0201.m82(23315);
    }

    public String P() {
        return l(53, 1, C0201.m82(23318), C0201.m82(23319), C0201.m82(23320), C0201.m82(23321));
    }

    public String Q() {
        return N0(t(105, fr.a));
    }

    public String R() {
        return v(((av) this.a).W());
    }

    public String S() {
        return u(38, 2);
    }

    public String T() {
        return m(72, C0201.m82(23322), C0201.m82(23323), C0201.m82(23324));
    }

    public String U() {
        return l(32775, 1, C0201.m82(23325), C0201.m82(23326));
    }

    public String V() {
        return m(98, C0201.m82(23327), C0201.m82(23328));
    }

    public String W() {
        return l(7, 1, C0201.m82(23329), C0201.m82(23330), null, C0201.m82(23331), C0201.m82(23332));
    }

    public String X() {
        Integer l = ((av) this.a).l(158);
        if (l == null) {
            return null;
        }
        int intValue = l.intValue();
        if (intValue == 0) {
            return C0201.m82(23340);
        }
        if (intValue == 100) {
            return C0201.m82(23339);
        }
        if (intValue == 200) {
            return C0201.m82(23338);
        }
        if (intValue == 300) {
            return C0201.m82(23337);
        }
        if (intValue == 32868) {
            return C0201.m82(23336);
        }
        if (intValue == 32968) {
            return C0201.m82(23335);
        }
        if (intValue == 33068) {
            return C0201.m82(23334);
        }
        return String.format(C0201.m82(23333), l);
    }

    public String Y() {
        return l(26, 2, C0201.m82(23341), C0201.m82(23342), C0201.m82(23343));
    }

    public String Z() {
        return m(121, C0201.m82(23344), C0201.m82(23345), C0201.m82(23346), C0201.m82(23347));
    }

    public String a0() {
        return m(93, C0201.m82(23348), C0201.m82(23349), C0201.m82(23350), C0201.m82(23351));
    }

    public String b0() {
        return m(112, C0201.m82(23352), null, C0201.m82(23353), C0201.m82(23354));
    }

    public String c0() {
        return b(37);
    }

    public String d0() {
        return N0(t(111, fr.a));
    }

    public String e0() {
        byte[] e = ((av) this.a).e(96);
        if (e == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < e.length; i++) {
            sb.append((int) e[i]);
            if (i < e.length - 1) {
                sb.append(C0201.m82(23355));
            }
        }
        return sb.toString();
    }

    @Override // defpackage.as
    public String f(int i) {
        switch (i) {
            case 1:
                return n0();
            case 2:
                return K0();
            case 3:
                return L0();
            case 7:
                return W();
            case 15:
                return A();
            case 26:
                return Y();
            case 28:
                return h0();
            case 31:
                return p0();
            case 32:
                return C();
            case 33:
                return I0();
            case 37:
                return c0();
            case 38:
                return S();
            case 40:
                return L();
            case 41:
                return J0();
            case 42:
                return H();
            case 44:
                return O();
            case 45:
                return j0();
            case 46:
                return t0();
            case 48:
                return r0();
            case 49:
                return B();
            case 50:
                return M();
            case 51:
                return E();
            case 52:
                return k0();
            case 53:
                return P();
            case 57:
                return N();
            case 58:
                return M0();
            case 59:
                return B0();
            case 61:
                return z();
            case 62:
                return y0();
            case 69:
                return G();
            case 72:
                return T();
            case 73:
                return g0();
            case 78:
                return R();
            case 89:
                return G0();
            case 93:
                return a0();
            case 96:
                return e0();
            case 97:
                return o0();
            case 98:
                return V();
            case 101:
                return D0();
            case 102:
                return F();
            case 103:
                return f0();
            case 105:
                return Q();
            case 107:
                return w0();
            case 109:
                return J();
            case 111:
                return d0();
            case 112:
                return b0();
            case 121:
                return Z();
            case 124:
                return K();
            case 137:
                return l0();
            case 138:
                return u0();
            case 140:
                return y();
            case 141:
                return w();
            case 142:
                return x();
            case 143:
                return I();
            case 144:
                return q0();
            case 145:
                return m0();
            case 147:
                return x0();
            case 150:
                return C0();
            case 158:
                return X();
            case 159:
                return v0();
            case 171:
                return E0();
            case 32768:
                return i0();
            case 32769:
                return s0();
            case 32775:
                return U();
            case 32776:
                return z0();
            case 32777:
                return A0();
            case 32784:
                return D();
            case 32786:
                return F0();
            default:
                return super.f(i);
        }
    }

    public String f0() {
        return N0(t(103, fr.a));
    }

    public String g0() {
        return l(73, 1, C0201.m82(23356), C0201.m82(23357));
    }

    public String h0() {
        return l(28, 1, C0201.m82(23358), C0201.m82(23359));
    }

    public String i0() {
        return u(32768, 2);
    }

    public String j0() {
        return m(45, C0201.m82(23360), C0201.m82(23361), C0201.m82(23362), C0201.m82(23363), C0201.m82(23364));
    }

    public String k0() {
        return l(52, 1, C0201.m82(23365), C0201.m82(23366));
    }

    public String l0() {
        return m(137, C0201.m82(23367), C0201.m82(23368), C0201.m82(23369), C0201.m82(23370), C0201.m82(23371), C0201.m82(23372), C0201.m82(23373));
    }

    public String m0() {
        Integer l = ((av) this.a).l(145);
        if (l == null) {
            return null;
        }
        DecimalFormat decimalFormat = new DecimalFormat(C0201.m82(23374));
        double d = (double) (-l.shortValue());
        Double.isNaN(d);
        return decimalFormat.format(d / 10.0d);
    }

    public String n0() {
        return l(1, 2, C0201.m82(23375), C0201.m82(23376), null, null, C0201.m82(23377), C0201.m82(23378), null, C0201.m82(23379));
    }

    public String o0() {
        return v(((av) this.a).X());
    }

    public String p0() {
        return l(31, 1, b);
    }

    public String q0() {
        Integer l = ((av) this.a).l(144);
        if (l == null) {
            return null;
        }
        DecimalFormat decimalFormat = new DecimalFormat(C0201.m82(23380));
        double shortValue = (double) l.shortValue();
        Double.isNaN(shortValue);
        return decimalFormat.format(shortValue / 10.0d);
    }

    public String r0() {
        Integer l = ((av) this.a).l(48);
        if (l == null) {
            return null;
        }
        int intValue = l.intValue();
        if (intValue == 1) {
            return C0201.m82(23386);
        }
        if (intValue == 3) {
            return C0201.m82(23385);
        }
        if (intValue == 6) {
            return C0201.m82(23384);
        }
        if (intValue == 8) {
            return C0201.m82(23383);
        }
        return C0201.m82(23381) + l + C0201.m82(23382);
    }

    public String s0() {
        return l(32769, 1, b);
    }

    public String t0() {
        return l(46, 1, C0201.m82(23387), C0201.m82(23388), C0201.m82(23389));
    }

    public String u0() {
        return m(138, C0201.m82(23390), C0201.m82(23391));
    }

    public String v0() {
        return m(159, C0201.m82(23392), C0201.m82(23393), C0201.m82(23394));
    }

    public String w() {
        Integer l = ((av) this.a).l(141);
        if (l == null) {
            return null;
        }
        return String.valueOf((int) l.shortValue());
    }

    public String w0() {
        return N0(t(107, fr.a));
    }

    public String x() {
        Integer l = ((av) this.a).l(142);
        if (l == null) {
            return null;
        }
        return String.valueOf((int) l.shortValue());
    }

    public String x0() {
        return m(147, C0201.m82(23395), C0201.m82(23396), C0201.m82(23397), C0201.m82(23398), C0201.m82(23399));
    }

    public String y() {
        Integer l = ((av) this.a).l(140);
        if (l == null) {
            return null;
        }
        return String.valueOf((int) l.shortValue());
    }

    public String y0() {
        return l(62, 1, C0201.m82(23400), C0201.m82(23401));
    }

    public String z() {
        return l(61, 1, C0201.m82(23402), C0201.m82(23403), C0201.m82(23404), C0201.m82(23405), C0201.m82(23406), null, C0201.m82(23407), C0201.m82(23408), C0201.m82(23409), C0201.m82(23410), null, C0201.m82(23411), C0201.m82(23412), C0201.m82(23413));
    }

    public String z0() {
        return l(32776, 1, C0201.m82(23414), C0201.m82(23415));
    }
}
