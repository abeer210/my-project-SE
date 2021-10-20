package defpackage;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import vigqyno.C0201;

/* renamed from: ru  reason: default package */
/* compiled from: OlympusMakernoteDescriptor */
public class ru extends as<su> {
    public ru(su suVar) {
        super(suVar);
    }

    public String A() {
        return m(515, C0201.m82(4043), C0201.m82(4044));
    }

    public String A0() {
        Long m = ((su) this.a).m(61472);
        if (m == null) {
            return null;
        }
        return Long.toString(m.longValue() - 3);
    }

    public String B() {
        return super.f(61483);
    }

    public String B0() {
        return m(61474, C0201.m82(4045), C0201.m82(4046), C0201.m82(4047));
    }

    public String C() {
        int[] k = ((su) this.a).k(4120);
        if (k == null) {
            return null;
        }
        double d = (double) ((short) k[0]);
        Double.isNaN(d);
        return String.valueOf(d / 256.0d);
    }

    public String C0() {
        return m(4111, C0201.m82(4048), C0201.m82(4049), C0201.m82(4050));
    }

    public String D() {
        return m(61455, C0201.m82(4051), C0201.m82(4052), C0201.m82(4053));
    }

    public String D0() {
        return m(61447, C0201.m82(4054), C0201.m82(4055), C0201.m82(4056), null, C0201.m82(4057), C0201.m82(4058), C0201.m82(4059), C0201.m82(4060));
    }

    public String E() {
        byte[] e = ((su) this.a).e(521);
        if (e == null) {
            return null;
        }
        return new String(e);
    }

    public String E0() {
        return super.r(4096);
    }

    public String F() {
        return m(61478, C0201.m82(4061), C0201.m82(4062), C0201.m82(4063), C0201.m82(4064), C0201.m82(4065), C0201.m82(4066), C0201.m82(4067), C0201.m82(4068));
    }

    public String F0() {
        int i;
        long[] jArr = (long[]) ((su) this.a).o(512);
        if (jArr == null) {
            return null;
        }
        if (jArr.length < 1) {
            return C0201.m82(4069);
        }
        StringBuilder sb = new StringBuilder();
        int i2 = (int) jArr[0];
        if (i2 != 0) {
            String r6 = C0201.m82(4070);
            if (i2 == 1) {
                sb.append(r6);
            } else if (i2 == 2) {
                sb.append(C0201.m82(4072));
            } else if (i2 != 3) {
                sb.append(r6);
            } else {
                sb.append(C0201.m82(4071));
            }
        } else {
            sb.append(C0201.m82(4073));
        }
        if (jArr.length >= 2 && (i = (int) jArr[1]) != 0) {
            if (i == 1) {
                sb.append(C0201.m82(4078));
            } else if (i == 2) {
                sb.append(C0201.m82(4077));
            } else if (i != 3) {
                sb.append(C0201.m82(4074));
                sb.append(jArr[1]);
                sb.append(C0201.m82(4075));
            } else {
                sb.append(C0201.m82(4076));
            }
        }
        if (jArr.length >= 3) {
            int i3 = (int) jArr[2];
            if (i3 == 1) {
                sb.append(C0201.m82(4082));
            } else if (i3 == 2) {
                sb.append(C0201.m82(4081));
            } else if (i3 == 3) {
                sb.append(C0201.m82(4080));
            } else if (i3 == 4) {
                sb.append(C0201.m82(4079));
            }
        }
        return sb.toString();
    }

    public String G() {
        String r = ((su) this.a).r(519);
        if (r == null) {
            return null;
        }
        return su.f.containsKey(r) ? su.f.get(r) : r;
    }

    public String G0() {
        return super.f(61486);
    }

    public String H() {
        Long m = ((su) this.a).m(61482);
        if (m == null) {
            return null;
        }
        return Long.toString(m.longValue() - 3);
    }

    public String H0() {
        return super.f(61487);
    }

    public String I() {
        int[] k = ((su) this.a).k(4113);
        if (k == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < k.length; i++) {
            sb.append((int) ((short) k[i]));
            if (i < k.length - 1) {
                sb.append(C0201.m82(4083));
            }
        }
        if (sb.length() == 0) {
            return null;
        }
        return sb.toString();
    }

    public String I0() {
        return m(61475, C0201.m82(4084), C0201.m82(4085), C0201.m82(4086), C0201.m82(4087), C0201.m82(4088), C0201.m82(4089));
    }

    public String J() {
        return m(61481, C0201.m82(4090), C0201.m82(4091), C0201.m82(4092), C0201.m82(4093), C0201.m82(4094));
    }

    public String J0() {
        Long m = ((su) this.a).m(61463);
        if (m == null) {
            return null;
        }
        int longValue = (int) ((m.longValue() >> 8) & 255);
        int longValue2 = (int) ((m.longValue() >> 16) & 255);
        int longValue3 = (int) (255 & m.longValue());
        if (!hr.b(longValue, longValue2, longValue3)) {
            return C0201.m82(4095);
        }
        return String.format(C0201.m82(4096), Integer.valueOf(longValue), Integer.valueOf(longValue2), Integer.valueOf(longValue3));
    }

    public String K() {
        return m(257, C0201.m82(4097), C0201.m82(4098), C0201.m82(4099), C0201.m82(4100), C0201.m82(4101));
    }

    public String K0() {
        int[] k = ((su) this.a).k(4117);
        if (k == null) {
            return null;
        }
        String format = String.format(C0201.m82(4102), Integer.valueOf(k[0]), Integer.valueOf(k[1]));
        if (format.equals(C0201.m82(4103))) {
            return C0201.m82(4104);
        }
        if (format.equals(C0201.m82(4105))) {
            return C0201.m82(4106);
        }
        if (format.equals(C0201.m82(4107))) {
            return C0201.m82(4108);
        }
        if (format.equals(C0201.m82(4109))) {
            return C0201.m82(4110);
        }
        if (format.equals(C0201.m82(4111))) {
            return C0201.m82(4112);
        }
        if (format.equals(C0201.m82(4113))) {
            return C0201.m82(4114);
        }
        if (format.equals(C0201.m82(4115))) {
            return C0201.m82(4116);
        }
        if (format.equals(C0201.m82(4117))) {
            return C0201.m82(4118);
        }
        if (format.equals(C0201.m82(4119))) {
            return C0201.m82(4120);
        }
        if (format.equals(C0201.m82(4121))) {
            return C0201.m82(4122);
        }
        if (format.equals(C0201.m82(4123))) {
            return C0201.m82(4124);
        }
        return C0201.m82(4125) + format;
    }

    public String L() {
        Long m = ((su) this.a).m(61473);
        if (m == null) {
            return null;
        }
        return Long.toString(m.longValue() - 3);
    }

    public String L0() {
        Long m = ((su) this.a).m(61471);
        DecimalFormat decimalFormat = new DecimalFormat(C0201.m82(4126));
        if (m == null) {
            return null;
        }
        double longValue = (double) m.longValue();
        Double.isNaN(longValue);
        return decimalFormat.format(longValue / 256.0d);
    }

    public String M() {
        return m(4137, C0201.m82(4127), C0201.m82(4128), C0201.m82(4129));
    }

    public String M0() {
        return m(61444, C0201.m82(4130), C0201.m82(4131), C0201.m82(4132), C0201.m82(4133), null, C0201.m82(4134), null, C0201.m82(4135), C0201.m82(4136), null, null, C0201.m82(4137), C0201.m82(4138));
    }

    public String N() {
        Long m = ((su) this.a).m(61462);
        if (m == null) {
            return null;
        }
        int longValue = (int) (m.longValue() & 255);
        int longValue2 = (int) ((m.longValue() >> 16) & 255);
        int longValue3 = ((int) (255 & (m.longValue() >> 8))) + 1970;
        if (!hr.a(longValue3, longValue2, longValue)) {
            return C0201.m82(4139);
        }
        return String.format(C0201.m82(4140), Integer.valueOf(longValue3), Integer.valueOf(longValue2 + 1), Integer.valueOf(longValue));
    }

    public String N0() {
        Long m = ((su) this.a).m(61470);
        DecimalFormat decimalFormat = new DecimalFormat(C0201.m82(4141));
        if (m == null) {
            return null;
        }
        double longValue = (double) m.longValue();
        Double.isNaN(longValue);
        return decimalFormat.format(longValue / 256.0d);
    }

    public String O() {
        return m(61491, C0201.m82(4142), C0201.m82(4143), C0201.m82(4144), C0201.m82(4145));
    }

    public String O0() {
        Long m = ((su) this.a).m(61469);
        DecimalFormat decimalFormat = new DecimalFormat(C0201.m82(4146));
        if (m == null) {
            return null;
        }
        double longValue = (double) m.longValue();
        Double.isNaN(longValue);
        return decimalFormat.format(longValue / 256.0d);
    }

    public String P() {
        return m(61453, C0201.m82(4147), C0201.m82(4148), C0201.m82(4149));
    }

    public String P0() {
        return m(61488, C0201.m82(4150), C0201.m82(4151), C0201.m82(4152), C0201.m82(4153), C0201.m82(4154));
    }

    public String Q() {
        mr p = ((su) this.a).p(516);
        if (p == null) {
            return null;
        }
        return p.l(false);
    }

    public String R() {
        Long m = ((su) this.a).m(61454);
        DecimalFormat decimalFormat = new DecimalFormat(C0201.m82(4155));
        if (m == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        double longValue = (double) m.longValue();
        Double.isNaN(longValue);
        sb.append(decimalFormat.format((longValue / 3.0d) - 2.0d));
        sb.append(C0201.m82(4156));
        return sb.toString();
    }

    public String S() {
        return m(61442, C0201.m82(4157), C0201.m82(4158), C0201.m82(4159), C0201.m82(4160));
    }

    public String T() {
        return m(61467, C0201.m82(4161), C0201.m82(4162));
    }

    public String U() {
        Long m = ((su) this.a).m(61476);
        DecimalFormat decimalFormat = new DecimalFormat(C0201.m82(4163));
        if (m == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        double longValue = (double) (m.longValue() - 6);
        Double.isNaN(longValue);
        sb.append(decimalFormat.format(longValue / 3.0d));
        sb.append(C0201.m82(4164));
        return sb.toString();
    }

    public String V() {
        return m(61461, C0201.m82(4165), C0201.m82(4166));
    }

    public String W() {
        return m(61443, C0201.m82(4167), C0201.m82(4168), C0201.m82(4169), C0201.m82(4170));
    }

    public String X() {
        return m(4100, null, null, C0201.m82(4171), C0201.m82(4172));
    }

    public String Y() {
        Long m = ((su) this.a).m(61459);
        if (m == null) {
            return null;
        }
        double longValue = (double) m.longValue();
        Double.isNaN(longValue);
        return as.i(longValue / 256.0d);
    }

    public String Z() {
        mr p = ((su) this.a).p(517);
        if (p == null) {
            return null;
        }
        DecimalFormat decimalFormat = new DecimalFormat(C0201.m82(4173));
        return decimalFormat.format(p.doubleValue()) + C0201.m82(4174);
    }

    public String a0() {
        return m(61490, C0201.m82(4175), C0201.m82(4176));
    }

    public String b0() {
        Long m = ((su) this.a).m(61460);
        if (m == null) {
            return null;
        }
        if (m.longValue() == 0) {
            return C0201.m82(4177);
        }
        return m + C0201.m82(4178);
    }

    public String c0() {
        return m(61489, C0201.m82(4179), C0201.m82(4180));
    }

    public String d0() {
        return m(4107, C0201.m82(4181), C0201.m82(4182));
    }

    public String e0() {
        return m(4106, C0201.m82(4183), C0201.m82(4184));
    }

    @Override // defpackage.as
    public String f(int i) {
        if (i == 0) {
            return u0();
        }
        if (i == 519) {
            return G();
        }
        if (i == 521) {
            return E();
        }
        if (i == 770) {
            return x0();
        }
        if (i == 4100) {
            return X();
        }
        if (i == 4111) {
            return C0();
        }
        if (i == 4113) {
            return I();
        }
        if (i == 4117) {
            return K0();
        }
        if (i == 4137) {
            return M();
        }
        if (i == 4149) {
            return y0();
        }
        if (i == 4106) {
            return e0();
        }
        if (i == 4107) {
            return d0();
        }
        if (i == 4119) {
            return z0();
        }
        if (i == 4120) {
            return C();
        }
        switch (i) {
            case 257:
                return K();
            case 258:
                return g0();
            case 259:
                return h0();
            default:
                switch (i) {
                    case 512:
                        return F0();
                    case 513:
                        return q0();
                    case 514:
                        return t0();
                    case 515:
                        return A();
                    case 516:
                        return Q();
                    case 517:
                        return Z();
                    default:
                        switch (i) {
                            case 4096:
                                return E0();
                            case 4097:
                                return p0();
                            case 4098:
                                return v();
                            default:
                                switch (i) {
                                    case 61442:
                                        return S();
                                    case 61443:
                                        return W();
                                    case 61444:
                                        return M0();
                                    case 61445:
                                        return j0();
                                    case 61446:
                                        return i0();
                                    case 61447:
                                        return D0();
                                    case 61448:
                                        return w0();
                                    case 61449:
                                        return y();
                                    case 61450:
                                        return z();
                                    case 61451:
                                        return w();
                                    case 61452:
                                        return s0();
                                    case 61453:
                                        return P();
                                    case 61454:
                                        return R();
                                    case 61455:
                                        return D();
                                    default:
                                        switch (i) {
                                            case 61457:
                                                return l0();
                                            case 61458:
                                                return n0();
                                            case 61459:
                                                return Y();
                                            case 61460:
                                                return b0();
                                            case 61461:
                                                return V();
                                            case 61462:
                                                return N();
                                            case 61463:
                                                return J0();
                                            case 61464:
                                                return v0();
                                            default:
                                                switch (i) {
                                                    case 61467:
                                                        return T();
                                                    case 61468:
                                                        return r0();
                                                    case 61469:
                                                        return O0();
                                                    case 61470:
                                                        return N0();
                                                    case 61471:
                                                        return L0();
                                                    case 61472:
                                                        return A0();
                                                    case 61473:
                                                        return L();
                                                    case 61474:
                                                        return B0();
                                                    case 61475:
                                                        return I0();
                                                    case 61476:
                                                        return U();
                                                    case 61477:
                                                        return o0();
                                                    case 61478:
                                                        return F();
                                                    case 61479:
                                                        return m0();
                                                    case 61480:
                                                        return f0();
                                                    case 61481:
                                                        return J();
                                                    case 61482:
                                                        return H();
                                                    case 61483:
                                                        return B();
                                                    case 61484:
                                                        return k0();
                                                    case 61485:
                                                        return x();
                                                    case 61486:
                                                        return G0();
                                                    case 61487:
                                                        return H0();
                                                    case 61488:
                                                        return P0();
                                                    case 61489:
                                                        return c0();
                                                    case 61490:
                                                        return a0();
                                                    case 61491:
                                                        return O();
                                                    default:
                                                        return super.f(i);
                                                }
                                        }
                                }
                        }
                }
        }
    }

    public String f0() {
        return m(61480, C0201.m82(4185), C0201.m82(4186));
    }

    public String g0() {
        return m(258, C0201.m82(4187), C0201.m82(4188), C0201.m82(4189), C0201.m82(4190), C0201.m82(4191));
    }

    public String h0() {
        return m(259, C0201.m82(4192), C0201.m82(4193), C0201.m82(4194), C0201.m82(4195), C0201.m82(4196));
    }

    public String i0() {
        return m(61446, C0201.m82(4197), C0201.m82(4198), C0201.m82(4199), C0201.m82(4200), C0201.m82(4201), C0201.m82(4202));
    }

    public String j0() {
        return m(61445, C0201.m82(4203), C0201.m82(4204), C0201.m82(4205), C0201.m82(4206));
    }

    public String k0() {
        return m(61484, C0201.m82(4207), C0201.m82(4208));
    }

    public String l0() {
        if (!((su) this.a).V()) {
            return C0201.m82(4209);
        }
        Long m = ((su) this.a).m(61457);
        if (m == null) {
            return null;
        }
        return m + C0201.m82(4210);
    }

    public String m0() {
        return m(61479, C0201.m82(4211), C0201.m82(4212));
    }

    public String n0() {
        if (!((su) this.a).V()) {
            return C0201.m82(4213);
        }
        Long m = ((su) this.a).m(61458);
        if (m == null) {
            return null;
        }
        return Long.toString(m.longValue());
    }

    public String o0() {
        return m(61477, C0201.m82(4214), C0201.m82(4215), C0201.m82(4216), C0201.m82(4217), C0201.m82(4218), C0201.m82(4219));
    }

    public String p0() {
        mr p = ((su) this.a).p(4097);
        if (p == null) {
            return null;
        }
        return String.valueOf(Math.round(Math.pow(2.0d, p.doubleValue() - 5.0d) * 100.0d));
    }

    public String q0() {
        String r = ((su) this.a).r(519);
        if (r == null) {
            return l(513, 1, C0201.m82(4232), C0201.m82(4233), C0201.m82(4234));
        }
        Integer l = ((su) this.a).l(513);
        if (l == null) {
            return null;
        }
        boolean startsWith = r.startsWith(C0201.m82(4220));
        String r4 = C0201.m82(4221);
        String r5 = C0201.m82(4222);
        String r6 = C0201.m82(4223);
        String r7 = C0201.m82(4224);
        String r8 = C0201.m82(4225);
        String r9 = C0201.m82(4226);
        if ((!startsWith || r.startsWith(C0201.m82(4227))) && !r.startsWith(C0201.m82(4228))) {
            int intValue = l.intValue();
            if (intValue == 0) {
                return r9;
            }
            if (intValue == 1) {
                return r8;
            }
            if (intValue == 2) {
                return r7;
            }
            if (intValue == 4) {
                return r4;
            }
            if (intValue == 5) {
                return C0201.m82(4231);
            }
            if (intValue == 6) {
                return C0201.m82(4230);
            }
            if (intValue == 33) {
                return C0201.m82(4229);
            }
            return r6 + l.toString() + r5;
        }
        int intValue2 = l.intValue();
        if (intValue2 == 0) {
            return r9;
        }
        if (intValue2 == 1) {
            return r8;
        }
        if (intValue2 == 2) {
            return r7;
        }
        if (intValue2 == 6) {
            return r4;
        }
        return r6 + l.toString() + r5;
    }

    public String r0() {
        Long m = ((su) this.a).m(61468);
        if (m == null) {
            return null;
        }
        return m.longValue() == 0 ? C0201.m82(4235) : Long.toString(m.longValue());
    }

    public String s0() {
        return m(61452, C0201.m82(4236), C0201.m82(4237));
    }

    public String t0() {
        return m(514, C0201.m82(4238), C0201.m82(4239));
    }

    public String u0() {
        return u(0, 2);
    }

    public String v() {
        Double h = ((su) this.a).h(4098);
        if (h == null) {
            return null;
        }
        return as.h(np.a(h.doubleValue()));
    }

    public String v0() {
        Long m = ((su) this.a).m(61463);
        if (m == null) {
            return null;
        }
        double longValue = (double) m.longValue();
        Double.isNaN(longValue);
        return as.h(Math.pow((longValue / 16.0d) - 0.5d, 2.0d));
    }

    public String w() {
        Long m = ((su) this.a).m(61451);
        if (m == null) {
            return null;
        }
        double longValue = (double) m.longValue();
        Double.isNaN(longValue);
        return as.h(Math.pow((longValue / 16.0d) - 0.5d, 2.0d));
    }

    public String w0() {
        return m(61448, C0201.m82(4240), C0201.m82(4241), C0201.m82(4242));
    }

    public String x() {
        Long m = ((su) this.a).m(61485);
        DecimalFormat decimalFormat = new DecimalFormat(C0201.m82(4243));
        if (m == null) {
            return null;
        }
        double longValue = (double) m.longValue();
        Double.isNaN(longValue);
        return decimalFormat.format((longValue / 8.0d) - 6.0d);
    }

    public String x0() {
        return m(770, C0201.m82(4244), C0201.m82(4245), C0201.m82(4246));
    }

    public String y() {
        Long m = ((su) this.a).m(61449);
        if (m == null) {
            return null;
        }
        double longValue = (double) m.longValue();
        Double.isNaN(longValue);
        DecimalFormat decimalFormat = new DecimalFormat(C0201.m82(4247));
        decimalFormat.setRoundingMode(RoundingMode.HALF_UP);
        return decimalFormat.format(Math.pow((longValue / 8.0d) - 1.0d, 2.0d) * 3.125d);
    }

    public String y0() {
        return m(4149, C0201.m82(4248), C0201.m82(4249));
    }

    public String z() {
        Long m = ((su) this.a).m(61450);
        if (m == null) {
            return null;
        }
        double longValue = (double) (49 - m.longValue());
        Double.isNaN(longValue);
        double pow = Math.pow(longValue / 8.0d, 2.0d);
        DecimalFormat decimalFormat = new DecimalFormat(C0201.m82(4250));
        decimalFormat.setRoundingMode(RoundingMode.HALF_UP);
        return decimalFormat.format(pow) + C0201.m82(4251);
    }

    public String z0() {
        int[] k = ((su) this.a).k(4119);
        if (k == null) {
            return null;
        }
        double d = (double) ((short) k[0]);
        Double.isNaN(d);
        return String.valueOf(d / 256.0d);
    }
}
