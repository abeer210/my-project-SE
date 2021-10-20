package defpackage;

import defpackage.tr;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map;
import vigqyno.C0201;

/* renamed from: ns  reason: default package */
/* compiled from: ExifDescriptorBase */
public abstract class ns<T extends tr> extends as<T> {
    public ns(T t) {
        super(t);
    }

    private String D0(int i) {
        byte[] e = this.a.e(i);
        if (e == null) {
            return null;
        }
        try {
            return new String(e, C0201.m82(33812)).trim();
        } catch (UnsupportedEncodingException unused) {
            return null;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r13v1, resolved type: byte[] */
    /* JADX DEBUG: Multi-variable search result rejected for r0v6, resolved type: int[] */
    /* JADX DEBUG: Multi-variable search result rejected for r1v5, resolved type: byte */
    /* JADX WARN: Multi-variable type inference failed */
    private int[] v(int i) {
        byte[] e = this.a.e(i);
        if (e == 0) {
            return null;
        }
        if (e.length < 4) {
            int[] iArr = new int[e.length];
            for (int i2 = 0; i2 < e.length; i2++) {
                iArr[i2] = e[i2];
            }
            return iArr;
        }
        int[] iArr2 = new int[(e.length - 2)];
        try {
            br brVar = new br(e);
            int f = brVar.f(0);
            int f2 = brVar.f(2);
            Boolean bool = Boolean.FALSE;
            if ((f * f2) + 2 > e.length) {
                brVar.w(!brVar.v());
                f = brVar.f(0);
                f2 = brVar.f(2);
                if (e.length >= (f * f2) + 2) {
                    bool = Boolean.TRUE;
                }
            } else {
                bool = Boolean.TRUE;
            }
            if (bool.booleanValue()) {
                iArr2[0] = f;
                iArr2[1] = f2;
                for (int i3 = 4; i3 < e.length; i3++) {
                    iArr2[i3 - 2] = brVar.j(i3);
                }
            }
        } catch (IOException e2) {
            T t = this.a;
            t.a(C0201.m82(33813) + e2.getMessage());
        }
        return iArr2;
    }

    private static String w(int[] iArr) {
        if (iArr == null) {
            return null;
        }
        if (iArr.length < 2) {
            return C0201.m82(33814);
        }
        if (iArr[0] == 0 && iArr[1] == 0) {
            return C0201.m82(33815);
        }
        int i = (iArr[0] * iArr[1]) + 2;
        if (i > iArr.length) {
            return C0201.m82(33816);
        }
        String[] strArr = {C0201.m82(33817), C0201.m82(33818), C0201.m82(33819), C0201.m82(33820), C0201.m82(33821), C0201.m82(33822), C0201.m82(33823)};
        StringBuilder sb = new StringBuilder();
        sb.append(C0201.m82(33824));
        for (int i2 = 2; i2 < i; i2++) {
            if (iArr[i2] <= 6) {
                sb.append(strArr[iArr[i2]]);
            } else {
                sb.append(C0201.m82(33825));
            }
            if ((i2 - 2) % iArr[1] == 0) {
                sb.append(C0201.m82(33826));
            } else if (i2 != i - 1) {
                sb.append(C0201.m82(33827));
            }
        }
        sb.append(C0201.m82(33828));
        return sb.toString();
    }

    public String A() {
        byte[] e = this.a.e(33422);
        if (e == null) {
            return null;
        }
        int[] k = this.a.k(33421);
        if (k == null) {
            return String.format(C0201.m82(33829), super.f(33422));
        } else if (k.length == 2 && e.length == k[0] * k[1]) {
            int[] iArr = new int[(e.length + 2)];
            iArr[0] = k[0];
            iArr[1] = k[1];
            for (int i = 0; i < e.length; i++) {
                iArr[i + 2] = e[i] & 255;
            }
            return w(iArr);
        } else {
            return String.format(C0201.m82(33830), super.f(33422));
        }
    }

    public String A0() {
        mr p = this.a.p(37382);
        if (p == null) {
            return null;
        }
        DecimalFormat decimalFormat = new DecimalFormat(C0201.m82(33831));
        return decimalFormat.format(p.doubleValue()) + C0201.m82(33832);
    }

    public String B() {
        return w(v(41730));
    }

    public String B0() {
        return m(41996, C0201.m82(33833), C0201.m82(33834), C0201.m82(33835), C0201.m82(33836));
    }

    public String C() {
        Integer l = this.a.l(40961);
        if (l == null) {
            return null;
        }
        if (l.intValue() == 1) {
            return C0201.m82(33837);
        }
        if (l.intValue() == 65535) {
            return C0201.m82(33838);
        }
        return C0201.m82(33839) + l + C0201.m82(33840);
    }

    public String C0() {
        return l(263, 1, C0201.m82(33841), C0201.m82(33842), C0201.m82(33843));
    }

    public String D() {
        int[] k = this.a.k(37121);
        if (k == null) {
            return null;
        }
        String[] strArr = {C0201.m82(33844), C0201.m82(33845), C0201.m82(33846), C0201.m82(33847), C0201.m82(33848), C0201.m82(33849), C0201.m82(33850)};
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < Math.min(4, k.length); i++) {
            int i2 = k[i];
            if (i2 > 0 && i2 < 7) {
                sb.append(strArr[i2]);
            }
        }
        return sb.toString();
    }

    public String E() {
        String str;
        StringBuilder sb;
        mr p = this.a.p(37122);
        if (p == null) {
            return null;
        }
        String l = p.l(true);
        if (!p.j() || p.intValue() != 1) {
            sb = new StringBuilder();
            sb.append(l);
            str = C0201.m82(33852);
        } else {
            sb = new StringBuilder();
            sb.append(l);
            str = C0201.m82(33851);
        }
        sb.append(str);
        return sb.toString();
    }

    public String E0() {
        byte[] e = this.a.e(37510);
        if (e == null) {
            return null;
        }
        if (e.length == 0) {
            return C0201.m82(33853);
        }
        HashMap hashMap = new HashMap();
        String r3 = C0201.m82(33854);
        hashMap.put(C0201.m82(33855), System.getProperty(r3));
        hashMap.put(C0201.m82(33856), C0201.m82(33857));
        hashMap.put(C0201.m82(33858), C0201.m82(33859));
        try {
            if (e.length >= 10) {
                String str = new String(e, 0, 10);
                for (Map.Entry entry : hashMap.entrySet()) {
                    String str2 = (String) entry.getKey();
                    String str3 = (String) entry.getValue();
                    if (str.startsWith(str2)) {
                        for (int length = str2.length(); length < 10; length++) {
                            byte b = e[length];
                            if (!(b == 0 || b == 32)) {
                                return new String(e, length, e.length - length, str3).trim();
                            }
                        }
                        return new String(e, 10, e.length - 10, str3).trim();
                    }
                }
            }
            return new String(e, System.getProperty(r3)).trim();
        } catch (UnsupportedEncodingException unused) {
            return null;
        }
    }

    public String F() {
        Integer l = this.a.l(259);
        if (l == null) {
            return null;
        }
        int intValue = l.intValue();
        if (intValue == 32766) {
            return C0201.m82(33901);
        }
        if (intValue == 32767) {
            return C0201.m82(33900);
        }
        String r2 = C0201.m82(33860);
        switch (intValue) {
            case 1:
                return C0201.m82(33899);
            case 2:
                return C0201.m82(33898);
            case 3:
                return C0201.m82(33897);
            case 4:
                return C0201.m82(33896);
            case 5:
                return C0201.m82(33895);
            case 6:
                return C0201.m82(33894);
            case 7:
                return r2;
            case 8:
                return C0201.m82(33893);
            case 9:
                return C0201.m82(33892);
            case 10:
                return C0201.m82(33891);
            default:
                switch (intValue) {
                    case 99:
                        return r2;
                    case 262:
                        return C0201.m82(33890);
                    case 32809:
                        return C0201.m82(33889);
                    case 32867:
                        return C0201.m82(33888);
                    case 34661:
                        return C0201.m82(33887);
                    case 34715:
                        return C0201.m82(33886);
                    case 34892:
                        return C0201.m82(33885);
                    case 65000:
                        return C0201.m82(33884);
                    case 65535:
                        return C0201.m82(33883);
                    default:
                        switch (intValue) {
                            case 32769:
                                return C0201.m82(33882);
                            case 32770:
                                return C0201.m82(33881);
                            case 32771:
                                return C0201.m82(33880);
                            case 32772:
                                return C0201.m82(33879);
                            case 32773:
                                return C0201.m82(33878);
                            default:
                                switch (intValue) {
                                    case 32895:
                                        return C0201.m82(33877);
                                    case 32896:
                                        return C0201.m82(33876);
                                    case 32897:
                                        return C0201.m82(33875);
                                    case 32898:
                                        return C0201.m82(33874);
                                    default:
                                        switch (intValue) {
                                            case 32908:
                                                return C0201.m82(33873);
                                            case 32909:
                                                return C0201.m82(33872);
                                            default:
                                                switch (intValue) {
                                                    case 32946:
                                                        return C0201.m82(33871);
                                                    case 32947:
                                                        return C0201.m82(33870);
                                                    default:
                                                        switch (intValue) {
                                                            case 34676:
                                                                return C0201.m82(33869);
                                                            case 34677:
                                                                return C0201.m82(33868);
                                                            default:
                                                                switch (intValue) {
                                                                    case 34712:
                                                                        return C0201.m82(33867);
                                                                    case 34713:
                                                                        return C0201.m82(33866);
                                                                    default:
                                                                        switch (intValue) {
                                                                            case 34718:
                                                                                return C0201.m82(33865);
                                                                            case 34719:
                                                                                return C0201.m82(33864);
                                                                            case 34720:
                                                                                return C0201.m82(33863);
                                                                            default:
                                                                                return C0201.m82(33861) + l + C0201.m82(33862);
                                                                        }
                                                                }
                                                        }
                                                }
                                        }
                                }
                        }
                }
        }
    }

    public String F0() {
        Integer l = this.a.l(37384);
        if (l == null) {
            return null;
        }
        int intValue = l.intValue();
        if (intValue == 0) {
            return C0201.m82(33925);
        }
        if (intValue == 1) {
            return C0201.m82(33924);
        }
        if (intValue == 2) {
            return C0201.m82(33923);
        }
        if (intValue == 3) {
            return C0201.m82(33922);
        }
        if (intValue == 4) {
            return C0201.m82(33921);
        }
        if (intValue == 255) {
            return C0201.m82(33920);
        }
        switch (intValue) {
            case 9:
                return C0201.m82(33919);
            case 10:
                return C0201.m82(33918);
            case 11:
                return C0201.m82(33917);
            case 12:
                return C0201.m82(33916);
            case 13:
                return C0201.m82(33915);
            case 14:
                return C0201.m82(33914);
            case 15:
                return C0201.m82(33913);
            case 16:
                return C0201.m82(33912);
            case 17:
                return C0201.m82(33911);
            case 18:
                return C0201.m82(33910);
            case 19:
                return C0201.m82(33909);
            case 20:
                return C0201.m82(33908);
            case 21:
                return C0201.m82(33907);
            case 22:
                return C0201.m82(33906);
            case 23:
                return C0201.m82(33905);
            case 24:
                return C0201.m82(33904);
            default:
                return C0201.m82(33902) + l + C0201.m82(33903);
        }
    }

    public String G() {
        return m(41992, C0201.m82(33926), C0201.m82(33927), C0201.m82(33928));
    }

    public String G0() {
        return m(41987, C0201.m82(33929), C0201.m82(33930));
    }

    public String H() {
        return m(41985, C0201.m82(33931), C0201.m82(33932));
    }

    public String H0() {
        return D0(40093);
    }

    public String I() {
        mr p = this.a.p(41988);
        if (p == null) {
            return null;
        }
        return p.g() == 0 ? C0201.m82(33933) : new DecimalFormat(C0201.m82(33934)).format(p.doubleValue());
    }

    public String I0() {
        return D0(40092);
    }

    public String J() {
        Integer l = this.a.l(40963);
        if (l == null) {
            return null;
        }
        return l + C0201.m82(33935);
    }

    public String J0() {
        return D0(40094);
    }

    public String K() {
        Integer l = this.a.l(40962);
        if (l == null) {
            return null;
        }
        return l + C0201.m82(33936);
    }

    public String K0() {
        return D0(40095);
    }

    public String L() {
        return u(36864, 2);
    }

    public String L0() {
        return D0(40091);
    }

    public String M() {
        mr p = this.a.p(37380);
        if (p == null) {
            return null;
        }
        return p.l(true) + C0201.m82(33937);
    }

    public String M0() {
        mr p = this.a.p(282);
        if (p == null) {
            return null;
        }
        String o0 = o0();
        Object[] objArr = new Object[2];
        objArr[0] = p.l(true);
        objArr[1] = o0 == null ? C0201.m82(33938) : o0.toLowerCase();
        return String.format(C0201.m82(33939), objArr);
    }

    public String N() {
        return m(41986, C0201.m82(33940), C0201.m82(33941), C0201.m82(33942));
    }

    public String N0() {
        return l(531, 1, C0201.m82(33943), C0201.m82(33944));
    }

    public String O() {
        return l(34850, 1, C0201.m82(33945), C0201.m82(33946), C0201.m82(33947), C0201.m82(33948), C0201.m82(33949), C0201.m82(33950), C0201.m82(33951), C0201.m82(33952));
    }

    public String O0() {
        int[] k = this.a.k(530);
        if (k == null || k.length < 2) {
            return null;
        }
        if (k[0] == 2 && k[1] == 1) {
            return C0201.m82(33953);
        }
        return (k[0] == 2 && k[1] == 2) ? C0201.m82(33954) : C0201.m82(33955);
    }

    public String P() {
        String r = this.a.r(33434);
        if (r == null) {
            return null;
        }
        return r + C0201.m82(33956);
    }

    public String P0() {
        mr p = this.a.p(283);
        if (p == null) {
            return null;
        }
        String o0 = o0();
        Object[] objArr = new Object[2];
        objArr[0] = p.l(true);
        objArr[1] = o0 == null ? C0201.m82(33957) : o0.toLowerCase();
        return String.format(C0201.m82(33958), objArr);
    }

    public String Q() {
        mr p = this.a.p(33437);
        if (p == null) {
            return null;
        }
        return as.h(p.doubleValue());
    }

    public String R() {
        return l(41728, 1, C0201.m82(33959), C0201.m82(33960), C0201.m82(33961));
    }

    public String S() {
        return l(266, 1, C0201.m82(33962), C0201.m82(33963));
    }

    public String T() {
        Integer l = this.a.l(37385);
        if (l == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        if ((l.intValue() & 1) != 0) {
            sb.append(C0201.m82(33964));
        } else {
            sb.append(C0201.m82(33965));
        }
        if ((l.intValue() & 4) != 0) {
            if ((l.intValue() & 2) != 0) {
                sb.append(C0201.m82(33966));
            } else {
                sb.append(C0201.m82(33967));
            }
        }
        if ((l.intValue() & 16) != 0) {
            sb.append(C0201.m82(33968));
        }
        if ((l.intValue() & 64) != 0) {
            sb.append(C0201.m82(33969));
        }
        return sb.toString();
    }

    public String U() {
        return u(40960, 2);
    }

    public String V() {
        mr p = this.a.p(37386);
        if (p == null) {
            return null;
        }
        return as.i(p.doubleValue());
    }

    public String W() {
        return l(41488, 1, C0201.m82(33970), C0201.m82(33971), C0201.m82(33972));
    }

    public String X() {
        String str;
        mr p = this.a.p(41486);
        if (p == null) {
            return null;
        }
        String W = W();
        StringBuilder sb = new StringBuilder();
        sb.append(p.h().l(true));
        if (W == null) {
            str = C0201.m82(33973);
        } else {
            str = C0201.m82(33974) + W.toLowerCase();
        }
        sb.append(str);
        return sb.toString();
    }

    public String Y() {
        String str;
        mr p = this.a.p(41487);
        if (p == null) {
            return null;
        }
        String W = W();
        StringBuilder sb = new StringBuilder();
        sb.append(p.h().l(true));
        if (W == null) {
            str = C0201.m82(33975);
        } else {
            str = C0201.m82(33976) + W.toLowerCase();
        }
        sb.append(str);
        return sb.toString();
    }

    public String Z() {
        return m(41991, C0201.m82(33977), C0201.m82(33978), C0201.m82(33979), C0201.m82(33980), C0201.m82(33981));
    }

    public String a0() {
        String r = this.a.r(257);
        if (r == null) {
            return null;
        }
        return r + C0201.m82(33982);
    }

    public String b0() {
        String r = this.a.r(256);
        if (r == null) {
            return null;
        }
        return r + C0201.m82(33983);
    }

    public String c0() {
        String r = this.a.r(1);
        if (r == null) {
            return null;
        }
        if (C0201.m82(33984).equalsIgnoreCase(r.trim())) {
            return C0201.m82(33985);
        }
        return C0201.m82(33986) + r + C0201.m82(33987);
    }

    public String d0() {
        return u(2, 2);
    }

    public String e0() {
        Integer l = this.a.l(34855);
        if (l != null) {
            return Integer.toString(l.intValue());
        }
        return null;
    }

    @Override // defpackage.as
    public String f(int i) {
        switch (i) {
            case 1:
                return c0();
            case 2:
                return d0();
            case 254:
                return j0();
            case 255:
                return z0();
            case 256:
                return b0();
            case 257:
                return a0();
            case 258:
                return z();
            case 259:
                return F();
            case 262:
                return l0();
            case 263:
                return C0();
            case 266:
                return S();
            case 274:
                return k0();
            case 277:
                return q0();
            case 278:
                return p0();
            case 279:
                return y0();
            case 282:
                return M0();
            case 283:
                return P0();
            case 284:
                return m0();
            case 296:
                return o0();
            case 512:
                return f0();
            case 530:
                return O0();
            case 531:
                return N0();
            case 532:
                return n0();
            case 33422:
                return A();
            case 33434:
                return P();
            case 33437:
                return Q();
            case 34850:
                return O();
            case 34855:
                return e0();
            case 34864:
                return v0();
            case 36864:
                return L();
            case 37121:
                return D();
            case 37122:
                return E();
            case 37377:
                return x0();
            case 37378:
                return y();
            case 37380:
                return M();
            case 37381:
                return h0();
            case 37382:
                return A0();
            case 37383:
                return i0();
            case 37384:
                return F0();
            case 37385:
                return T();
            case 37386:
                return V();
            case 37510:
                return E0();
            case 40091:
                return L0();
            case 40092:
                return I0();
            case 40093:
                return H0();
            case 40094:
                return J0();
            case 40095:
                return K0();
            case 40960:
                return U();
            case 40961:
                return C();
            case 40962:
                return K();
            case 40963:
                return J();
            case 41486:
                return X();
            case 41487:
                return Y();
            case 41488:
                return W();
            case 41495:
                return u0();
            case 41728:
                return R();
            case 41729:
                return t0();
            case 41730:
                return B();
            case 41985:
                return H();
            case 41986:
                return N();
            case 41987:
                return G0();
            case 41988:
                return I();
            case 41989:
                return x();
            case 41990:
                return s0();
            case 41991:
                return Z();
            case 41992:
                return G();
            case 41993:
                return r0();
            case 41994:
                return w0();
            case 41996:
                return B0();
            case 42034:
                return g0();
            default:
                return super.f(i);
        }
    }

    public String f0() {
        Integer l = this.a.l(512);
        if (l == null) {
            return null;
        }
        int intValue = l.intValue();
        if (intValue == 1) {
            return C0201.m82(33991);
        }
        if (intValue == 14) {
            return C0201.m82(33990);
        }
        return C0201.m82(33988) + l + C0201.m82(33989);
    }

    public String g0() {
        return n(42034);
    }

    public String h0() {
        Double h = this.a.h(37381);
        if (h == null) {
            return null;
        }
        return as.h(np.a(h.doubleValue()));
    }

    public String i0() {
        Integer l = this.a.l(37383);
        if (l == null) {
            return null;
        }
        int intValue = l.intValue();
        if (intValue == 255) {
            return C0201.m82(34001);
        }
        switch (intValue) {
            case 0:
                return C0201.m82(34000);
            case 1:
                return C0201.m82(33999);
            case 2:
                return C0201.m82(33998);
            case 3:
                return C0201.m82(33997);
            case 4:
                return C0201.m82(33996);
            case 5:
                return C0201.m82(33995);
            case 6:
                return C0201.m82(33994);
            default:
                return C0201.m82(33992) + l + C0201.m82(33993);
        }
    }

    public String j0() {
        return l(254, 0, C0201.m82(34002), C0201.m82(34003), C0201.m82(34004), C0201.m82(34005), C0201.m82(34006), C0201.m82(34007), C0201.m82(34008), C0201.m82(34009));
    }

    public String k0() {
        return super.p(274);
    }

    public String l0() {
        Integer l = this.a.l(262);
        if (l == null) {
            return null;
        }
        int intValue = l.intValue();
        if (intValue == 32803) {
            return C0201.m82(34024);
        }
        if (intValue == 32892) {
            return C0201.m82(34023);
        }
        switch (intValue) {
            case 0:
                return C0201.m82(34022);
            case 1:
                return C0201.m82(34021);
            case 2:
                return C0201.m82(34020);
            case 3:
                return C0201.m82(34019);
            case 4:
                return C0201.m82(34018);
            case 5:
                return C0201.m82(34017);
            case 6:
                return C0201.m82(34016);
            default:
                switch (intValue) {
                    case 8:
                        return C0201.m82(34015);
                    case 9:
                        return C0201.m82(34014);
                    case 10:
                        return C0201.m82(34013);
                    default:
                        switch (intValue) {
                            case 32844:
                                return C0201.m82(34012);
                            case 32845:
                                return C0201.m82(34011);
                            default:
                                return C0201.m82(34010);
                        }
                }
        }
    }

    public String m0() {
        return l(284, 1, C0201.m82(34025), C0201.m82(34026));
    }

    public String n0() {
        int[] k = this.a.k(532);
        if (k == null || k.length < 6) {
            Object o = this.a.o(532);
            if (o == null || !(o instanceof long[])) {
                return null;
            }
            long[] jArr = (long[]) o;
            if (jArr.length < 6) {
                return null;
            }
            int[] iArr = new int[jArr.length];
            for (int i = 0; i < jArr.length; i++) {
                iArr[i] = (int) jArr[i];
            }
            k = iArr;
        }
        int i2 = k[0];
        int i3 = k[1];
        int i4 = k[2];
        int i5 = k[3];
        return String.format(C0201.m82(34027), Integer.valueOf(i2), Integer.valueOf(i4), Integer.valueOf(k[4]), Integer.valueOf(i3), Integer.valueOf(i5), Integer.valueOf(k[5]));
    }

    public String o0() {
        return l(296, 1, C0201.m82(34028), C0201.m82(34029), C0201.m82(34030));
    }

    public String p0() {
        String r = this.a.r(278);
        if (r == null) {
            return null;
        }
        return r + C0201.m82(34031);
    }

    public String q0() {
        String r = this.a.r(277);
        if (r == null) {
            return null;
        }
        return r + C0201.m82(34032);
    }

    public String r0() {
        return m(41993, C0201.m82(34033), C0201.m82(34034), C0201.m82(34035));
    }

    public String s0() {
        return m(41990, C0201.m82(34036), C0201.m82(34037), C0201.m82(34038), C0201.m82(34039));
    }

    public String t0() {
        return l(41729, 1, C0201.m82(34040));
    }

    public String u0() {
        return l(41495, 1, C0201.m82(34041), C0201.m82(34042), C0201.m82(34043), C0201.m82(34044), C0201.m82(34045), null, C0201.m82(34046), C0201.m82(34047));
    }

    public String v0() {
        return m(34864, C0201.m82(34048), C0201.m82(34049), C0201.m82(34050), C0201.m82(34051), C0201.m82(34052), C0201.m82(34053), C0201.m82(34054), C0201.m82(34055));
    }

    public String w0() {
        return m(41994, C0201.m82(34056), C0201.m82(34057), C0201.m82(34058));
    }

    public String x() {
        Integer l = this.a.l(41989);
        if (l == null) {
            return null;
        }
        return l.intValue() == 0 ? C0201.m82(34059) : as.i((double) l.intValue());
    }

    public String x0() {
        return super.r(37377);
    }

    public String y() {
        Double h = this.a.h(37378);
        if (h == null) {
            return null;
        }
        return as.h(np.a(h.doubleValue()));
    }

    public String y0() {
        String r = this.a.r(279);
        if (r == null) {
            return null;
        }
        return r + C0201.m82(34060);
    }

    public String z() {
        String r = this.a.r(258);
        if (r == null) {
            return null;
        }
        return r + C0201.m82(34061);
    }

    public String z0() {
        return l(255, 1, C0201.m82(34062), C0201.m82(34063), C0201.m82(34064));
    }
}
