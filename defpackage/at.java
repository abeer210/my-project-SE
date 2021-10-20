package defpackage;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.Set;
import vigqyno.C0201;

/* renamed from: at  reason: default package */
/* compiled from: ExifTiffHandler */
public class at extends d10 {
    public static final String a = null;
    public static final String b = null;
    public static final String e = null;
    public static final String f = null;
    public static final String g = null;
    public static final String h = null;
    public static final String i = null;
    public static final String j = null;
    public static final String k = null;
    public static final String l = null;
    public static final String m = null;
    public static final String n = null;
    public static final String o = null;

    static {
        C0201.m83(at.class, 11);
    }

    public at(wr wrVar, tr trVar) {
        super(wrVar, trVar);
    }

    private static String E(kr krVar, int i2, int i3) throws IOException {
        try {
            return krVar.q(i2, i3, fr.a);
        } catch (ar unused) {
            return C0201.m82(4278);
        }
    }

    private static boolean F(tr trVar, int i2) {
        if (i2 == 50341) {
            return true;
        }
        if (i2 == 3584) {
            return (trVar instanceof ut) || (trVar instanceof au) || (trVar instanceof iu) || (trVar instanceof su) || (trVar instanceof av) || (trVar instanceof cv) || (trVar instanceof iv) || (trVar instanceof mv) || (trVar instanceof qv);
        }
        return false;
    }

    private static void G(tr trVar, int i2, kr krVar, int i3, Boolean bool, int i4) throws IOException {
        int i5 = 0;
        while (i5 < i3) {
            if (trVar.z(i5)) {
                if (i5 >= i3 - 1 || !trVar.z(i5 + 1)) {
                    if (bool.booleanValue()) {
                        short[] sArr = new short[i4];
                        for (int i6 = 0; i6 < i4; i6++) {
                            sArr[i6] = krVar.f(((i5 + i6) * 2) + i2);
                        }
                        trVar.N(i5, sArr);
                    } else {
                        int[] iArr = new int[i4];
                        for (int i7 = 0; i7 < i4; i7++) {
                            iArr[i7] = krVar.s(((i5 + i7) * 2) + i2);
                        }
                        trVar.N(i5, iArr);
                    }
                    i5 += i4 - 1;
                } else if (bool.booleanValue()) {
                    trVar.M(i5, Short.valueOf(krVar.f((i5 * 2) + i2)));
                } else {
                    trVar.M(i5, Integer.valueOf(krVar.s((i5 * 2) + i2)));
                }
            }
            i5++;
        }
    }

    private static void H(yt ytVar, int i2, kr krVar) {
        int i3 = i2 + 8;
        try {
            ytVar.T(0, krVar.r(i3, 8, fr.a));
            ytVar.J(9, krVar.u(i3 + 9));
            ytVar.J(10, krVar.u(i3 + 10));
            ytVar.J(12, krVar.s(i3 + 12));
            ytVar.J(14, krVar.s(i3 + 14));
            ytVar.J(16, krVar.s(i3 + 16));
            ytVar.C(18, krVar.c(i3 + 18, 2));
            ytVar.C(20, krVar.c(i3 + 20, 4));
            ytVar.J(24, krVar.s(i3 + 24));
            ytVar.J(27, krVar.u(i3 + 27));
            ytVar.J(28, krVar.u(i3 + 28));
            ytVar.J(29, krVar.u(i3 + 29));
            ytVar.J(30, krVar.s(i3 + 30));
            ytVar.L(32, krVar.t(i3 + 32));
            ytVar.J(36, krVar.f(i3 + 36));
            ytVar.J(56, krVar.u(i3 + 56));
            ytVar.J(64, krVar.u(i3 + 64));
            ytVar.J(92, krVar.u(i3 + 92));
            ytVar.J(93, krVar.u(i3 + 93));
            ytVar.J(94, krVar.s(i3 + 94));
            ytVar.J(96, krVar.s(i3 + 96));
            ytVar.J(98, krVar.s(i3 + 98));
            ytVar.J(100, krVar.s(i3 + 100));
            ytVar.J(102, krVar.s(i3 + 102));
            ytVar.J(104, krVar.s(i3 + 104));
            ytVar.J(107, krVar.j(i3 + 107));
        } catch (IOException e2) {
            ytVar.a(C0201.m82(4279) + e2.getMessage());
        }
    }

    private boolean I(int i2, Set<Integer> set, int i3, kr krVar) throws IOException {
        String str;
        tr e2 = this.d.e(qs.class);
        if (e2 == null) {
            str = null;
        } else {
            str = e2.r(271);
        }
        String E = E(krVar, i2, 2);
        String E2 = E(krVar, i2, 3);
        String E3 = E(krVar, i2, 4);
        String E4 = E(krVar, i2, 5);
        String E5 = E(krVar, i2, 6);
        String E6 = E(krVar, i2, 7);
        String E7 = E(krVar, i2, 8);
        String E8 = E(krVar, i2, 9);
        String E9 = E(krVar, i2, 10);
        String E10 = E(krVar, i2, 12);
        boolean v = krVar.v();
        if ("OLYMP\u0000".equals(E5) || C0201.m82(4280).equals(E4) || C0201.m82(4281).equals(E3)) {
            D(su.class);
            xq.b(this, krVar, set, i2 + 8, i3);
        } else if ("OLYMPUS\u0000II".equals(E9)) {
            D(su.class);
            xq.b(this, krVar, set, i2 + 12, i2);
        } else if (str != null && str.toUpperCase().startsWith(C0201.m82(4282))) {
            D(su.class);
            xq.b(this, krVar, set, i2, i3);
        } else if (str == null || !str.trim().toUpperCase().startsWith(C0201.m82(4283))) {
            if (C0201.m82(4286).equals(E7) || C0201.m82(4287).equals(E7)) {
                D(qv.class);
                xq.b(this, krVar, set, i2 + 12, i3);
            } else if (str != null && str.startsWith(C0201.m82(4288)) && !Arrays.equals(krVar.c(i2, 2), new byte[]{1, 0})) {
                D(qv.class);
                xq.b(this, krVar, set, i2, i3);
            } else if ("SEMC MS\u0000\u0000\u0000\u0000\u0000".equals(E10)) {
                krVar.w(true);
                D(sv.class);
                xq.b(this, krVar, set, i2 + 20, i3);
            } else if ("SIGMA\u0000\u0000\u0000".equals(E7) || "FOVEON\u0000\u0000".equals(E7)) {
                D(ov.class);
                xq.b(this, krVar, set, i2 + 10, i3);
            } else if (C0201.m82(4289).equals(E2)) {
                krVar.w(E6.equals(C0201.m82(4290)));
                yt ytVar = new yt();
                this.d.a(ytVar);
                H(ytVar, i2, krVar);
            } else if (C0201.m82(4291).equalsIgnoreCase(str)) {
                D(qt.class);
                xq.b(this, krVar, set, i2, i3);
            } else if (str == null || !str.toUpperCase().startsWith(C0201.m82(4292))) {
                if (C0201.m82(4293).equals(E7) || C0201.m82(4294).equalsIgnoreCase(str)) {
                    krVar.w(false);
                    D(wt.class);
                    xq.b(this, krVar, set, krVar.h(i2 + 8) + i2, i2);
                } else if (C0201.m82(4295).equals(E6)) {
                    D(au.class);
                    xq.b(this, krVar, set, i2 + 22, i3);
                } else {
                    String r5 = C0201.m82(4296);
                    if (r5.equals(E4)) {
                        krVar.w(false);
                        if ("LEICA\u0000\u0001\u0000".equals(E7) || "LEICA\u0000\u0004\u0000".equals(E7) || "LEICA\u0000\u0005\u0000".equals(E7) || "LEICA\u0000\u0006\u0000".equals(E7) || "LEICA\u0000\u0007\u0000".equals(E7)) {
                            D(eu.class);
                            xq.b(this, krVar, set, i2 + 8, i2);
                        } else if (C0201.m82(4297).equals(str)) {
                            D(cu.class);
                            xq.b(this, krVar, set, i2 + 8, i3);
                        } else if (!r5.equals(str)) {
                            return false;
                        } else {
                            D(av.class);
                            xq.b(this, krVar, set, i2 + 8, i3);
                        }
                    } else if ("Panasonic\u0000\u0000\u0000".equals(E10)) {
                        D(av.class);
                        xq.b(this, krVar, set, i2 + 12, i3);
                    } else if ("AOC\u0000".equals(E3)) {
                        D(ut.class);
                        xq.b(this, krVar, set, i2 + 6, i2);
                    } else if (str != null && (str.toUpperCase().startsWith(C0201.m82(4298)) || str.toUpperCase().startsWith(C0201.m82(4299)))) {
                        D(cv.class);
                        xq.b(this, krVar, set, i2, i2);
                    } else if ("SANYO\u0000\u0001\u0000".equals(E7)) {
                        D(mv.class);
                        xq.b(this, krVar, set, i2 + 8, i2);
                    } else if (str == null || !str.toLowerCase().startsWith(C0201.m82(4300))) {
                        if (E9.equals("Apple iOS\u0000")) {
                            boolean v2 = krVar.v();
                            krVar.w(true);
                            D(ot.class);
                            xq.b(this, krVar, set, i2 + 14, i2);
                            krVar.w(v2);
                        } else if (krVar.s(i2) == 61697) {
                            ev evVar = new ev();
                            this.d.a(evVar);
                            K(evVar, i2, krVar);
                        } else if (E8.equalsIgnoreCase(C0201.m82(4304))) {
                            gv gvVar = new gv();
                            this.d.a(gvVar);
                            L(gvVar, i2, krVar);
                        } else if (!C0201.m82(4305).equals(str)) {
                            return false;
                        } else {
                            D(kv.class);
                            xq.b(this, krVar, set, i2, i3);
                        }
                    } else if (E.equals(C0201.m82(4301)) || E2.equals(C0201.m82(4302))) {
                        return false;
                    } else {
                        if (E4.equalsIgnoreCase(C0201.m82(4303))) {
                            krVar.w(true);
                            D(iv.class);
                            xq.b(this, krVar, set, i2 + 8, i2);
                        }
                    }
                }
            } else if ("QVC\u0000\u0000\u0000".equals(E5)) {
                D(ut.class);
                xq.b(this, krVar, set, i2 + 6, i3);
            } else {
                D(st.class);
                xq.b(this, krVar, set, i2, i3);
            }
        } else if (C0201.m82(4284).equals(E4)) {
            short u = krVar.u(i2 + 6);
            if (u == 1) {
                D(gu.class);
                xq.b(this, krVar, set, i2 + 8, i3);
            } else if (u != 2) {
                this.c.a(C0201.m82(4285));
            } else {
                D(iu.class);
                xq.b(this, krVar, set, i2 + 18, i2 + 10);
            }
        } else {
            D(iu.class);
            xq.b(this, krVar, set, i2, i3);
        }
        krVar.w(v);
        return true;
    }

    private static void J(mt mtVar, int i2, kr krVar, int i3) throws IOException {
        Boolean bool;
        int i4;
        if (i3 == 0) {
            mtVar.a(C0201.m82(4306));
        } else if (i3 <= 15) {
            mtVar.a(C0201.m82(4307));
        } else {
            String q = krVar.q(i2, 12, fr.a);
            if (!q.startsWith(C0201.m82(4308))) {
                mtVar.a(C0201.m82(4309));
                return;
            }
            int i5 = i2 + 14;
            int s = krVar.s(i5);
            if (i3 < (s * 6) + 16) {
                bool = Boolean.valueOf(krVar.v());
                krVar.w(!krVar.v());
                i4 = krVar.s(i5);
                if (i3 < (i4 * 6) + 16) {
                    mtVar.a(C0201.m82(4310));
                    return;
                }
            } else {
                i4 = s;
                bool = null;
            }
            String substring = q.substring(8, 12);
            mtVar.M(0, substring);
            for (int i6 = 0; i6 < i4; i6++) {
                int i7 = i2 + 16 + (i6 * 6);
                mtVar.M(krVar.s(i7), Long.valueOf(krVar.t(i7 + 2)));
            }
            if (bool != null) {
                krVar.w(bool.booleanValue());
            }
        }
    }

    private static void K(ev evVar, int i2, kr krVar) throws IOException {
        Integer num;
        evVar.M(0, Integer.valueOf(krVar.s(i2)));
        int i3 = i2 + 2;
        int s = krVar.s(i3);
        int s2 = krVar.s(i3 + 2);
        int s3 = krVar.s(i3 + 4);
        Object[] objArr = {Integer.valueOf(krVar.s(i3 + 6))};
        String str = g;
        String str2 = String.format(str, objArr) + String.format(str, Integer.valueOf(krVar.s(i3 + 8)));
        try {
            num = Integer.valueOf(Integer.parseInt(str2));
        } catch (NumberFormatException unused) {
            num = null;
        }
        if (num != null) {
            evVar.R(2, String.format(i, Integer.valueOf(s), Integer.valueOf(s2), Integer.valueOf(s3), num));
        } else {
            evVar.R(2, String.format(k, Integer.valueOf(s), Integer.valueOf(s2), Integer.valueOf(s3)));
            evVar.a(l + str2 + f);
        }
        evVar.R(12, String.valueOf((char) krVar.s(i2 + 12)));
        int i4 = i2 + 14;
        evVar.K(14, new int[]{krVar.s(i4), krVar.s(i4 + 2)});
        int i5 = i2 + 18;
        evVar.J(18, (krVar.s(i5) << 16) + krVar.s(i5 + 2));
        int i6 = i2 + 22;
        int s4 = krVar.s(i6);
        int s5 = krVar.s(i6 + 2);
        int s6 = krVar.s(i6 + 4);
        int s7 = krVar.s(i6 + 6);
        int s8 = krVar.s(i6 + 8);
        int s9 = krVar.s(i6 + 10);
        if (s4 < 0 || s4 >= 60 || s5 < 0 || s5 >= 60 || s6 < 0 || s6 >= 24 || s7 < 1 || s7 >= 13 || s8 < 1 || s8 >= 32 || s9 < 1 || s9 > 9999) {
            StringBuilder sb = new StringBuilder();
            sb.append(a);
            sb.append(s9);
            String str3 = j;
            sb.append(str3);
            sb.append(s7);
            sb.append(str3);
            sb.append(s8);
            sb.append(m);
            sb.append(s6);
            String str4 = b;
            sb.append(str4);
            sb.append(s5);
            sb.append(str4);
            sb.append(s4);
            sb.append(e);
            evVar.a(sb.toString());
        } else {
            evVar.R(22, String.format(h, Integer.valueOf(s9), Integer.valueOf(s7), Integer.valueOf(s8), Integer.valueOf(s6), Integer.valueOf(s5), Integer.valueOf(s4)));
        }
        evVar.J(36, krVar.s(i2 + 36));
        evVar.J(38, krVar.f(i2 + 38));
        evVar.J(40, krVar.f(i2 + 40));
        evVar.T(42, new yr(krVar.c(i2 + 42, 28), fr.e));
        evVar.J(72, krVar.s(i2 + 72));
        evVar.J(74, krVar.s(i2 + 74));
        evVar.J(76, krVar.s(i2 + 76));
        evVar.J(78, krVar.s(i2 + 78));
        evVar.J(80, krVar.s(i2 + 80));
        evVar.J(82, krVar.s(i2 + 82));
        double s10 = (double) krVar.s(i2 + 84);
        Double.isNaN(s10);
        evVar.F(84, s10 / 1000.0d);
        evVar.R(86, krVar.m(i2 + 86, 44, fr.a));
    }

    private static void L(gv gvVar, int i2, kr krVar) throws IOException {
        gvVar.R(0, krVar.q(i2, 9, fr.a));
        gvVar.R(52, krVar.q(i2 + 52, 1, fr.a));
        int i3 = i2 + 53;
        gvVar.K(53, new int[]{krVar.b(i3), krVar.b(i3 + 1)});
        int i4 = i2 + 59;
        krVar.b(i4);
        krVar.b(i4 + 1);
        krVar.b(i4 + 2);
        krVar.b(i4 + 3);
        krVar.b(i4 + 4);
        gvVar.J(67, krVar.b(i2 + 67));
        gvVar.J(72, krVar.b(i2 + 72));
        gvVar.T(75, new yr(krVar.c(i2 + 75, 14), fr.a));
        gvVar.R(80, krVar.m(i2 + 80, 20, fr.a));
    }

    @Override // defpackage.uq
    public boolean b() {
        tr trVar = this.c;
        if ((trVar instanceof qs) || (trVar instanceof ss)) {
            if (this.c.b(297)) {
                D(ss.class);
            } else {
                D(zs.class);
            }
            return true;
        } else if (trVar instanceof zs) {
            return true;
        } else {
            return false;
        }
    }

    @Override // defpackage.uq
    public void e(int i2) throws wq {
        if (i2 != 42) {
            if (i2 == 85) {
                D(gt.class);
                return;
            } else if (!(i2 == 20306 || i2 == 21330)) {
                throw new wq(String.format(C0201.m82(4311), Integer.valueOf(i2)));
            }
        }
        D(qs.class);
    }

    @Override // defpackage.uq
    public Long f(int i2, int i3, long j2) {
        if (i3 == 13) {
            return Long.valueOf(j2 * 4);
        }
        return i3 == 0 ? 0L : null;
    }

    @Override // defpackage.uq
    public boolean g(int i2, Set<Integer> set, int i3, kr krVar, int i4, int i5) throws IOException {
        if (i4 == 0) {
            if (this.c.b(i4)) {
                return false;
            }
            if (i5 == 0) {
                return true;
            }
        }
        if (i4 == 37500 && (this.c instanceof xs)) {
            return I(i2, set, i3, krVar);
        }
        if (i4 != 33723 || !(this.c instanceof qs)) {
            if (i4 == 700 && (this.c instanceof qs)) {
                new m10().g(krVar.l(i2, i5), this.d, this.c);
                return true;
            } else if (F(this.c, i4)) {
                mt mtVar = new mt();
                mtVar.O(this.c);
                this.d.a(mtVar);
                J(mtVar, i2, krVar, i5);
                return true;
            } else {
                if (this.c instanceof su) {
                    if (i4 == 8208) {
                        D(mu.class);
                        xq.b(this, krVar, set, i2, i3);
                        return true;
                    } else if (i4 == 8224) {
                        D(ku.class);
                        xq.b(this, krVar, set, i2, i3);
                        return true;
                    } else if (i4 == 8256) {
                        D(qu.class);
                        xq.b(this, krVar, set, i2, i3);
                        return true;
                    } else if (i4 == 8272) {
                        D(ou.class);
                        xq.b(this, krVar, set, i2, i3);
                        return true;
                    } else if (i4 == 12288) {
                        D(yu.class);
                        xq.b(this, krVar, set, i2, i3);
                        return true;
                    } else if (i4 == 16384) {
                        D(su.class);
                        xq.b(this, krVar, set, i2, i3);
                        return true;
                    } else if (i4 == 8240) {
                        D(wu.class);
                        xq.b(this, krVar, set, i2, i3);
                        return true;
                    } else if (i4 == 8241) {
                        D(uu.class);
                        xq.b(this, krVar, set, i2, i3);
                        return true;
                    }
                }
                if (this.c instanceof gt) {
                    if (i4 == 19) {
                        kt ktVar = new kt();
                        ktVar.O(this.c);
                        this.d.a(ktVar);
                        G(ktVar, i2, krVar, i5, Boolean.FALSE, 2);
                        return true;
                    } else if (i4 == 39) {
                        it itVar = new it();
                        itVar.O(this.c);
                        this.d.a(itVar);
                        G(itVar, i2, krVar, i5, Boolean.FALSE, 3);
                        return true;
                    } else if (i4 == 281) {
                        et etVar = new et();
                        etVar.O(this.c);
                        this.d.a(etVar);
                        G(etVar, i2, krVar, i5, Boolean.TRUE, 1);
                        return true;
                    }
                }
                if (i4 == 46 && (this.c instanceof gt)) {
                    try {
                        for (tr trVar : tp.c(new ByteArrayInputStream(krVar.c(i2, i5))).b()) {
                            trVar.O(this.c);
                            this.d.a(trVar);
                        }
                        return true;
                    } catch (up e2) {
                        tr trVar2 = this.c;
                        trVar2.a(o + e2.getMessage());
                    } catch (IOException e3) {
                        tr trVar3 = this.c;
                        trVar3.a(n + e3.getMessage());
                    }
                }
                return false;
            }
        } else if (krVar.j(i2) != 28) {
            return false;
        } else {
            byte[] c = krVar.c(i2, i5);
            new ow().d(new nr(c), this.d, (long) c.length, this.c);
            return true;
        }
    }

    @Override // defpackage.uq
    public boolean w(int i2) {
        if (i2 == 330) {
            D(xs.class);
            return true;
        }
        tr trVar = this.c;
        if ((trVar instanceof qs) || (trVar instanceof gt)) {
            if (i2 == 34665) {
                D(xs.class);
                return true;
            } else if (i2 == 34853) {
                D(ct.class);
                return true;
            }
        }
        if ((this.c instanceof xs) && i2 == 40965) {
            D(us.class);
            return true;
        } else if (!(this.c instanceof su)) {
            return false;
        } else {
            if (i2 == 8208) {
                D(mu.class);
                return true;
            } else if (i2 == 8224) {
                D(ku.class);
                return true;
            } else if (i2 == 8256) {
                D(qu.class);
                return true;
            } else if (i2 == 8272) {
                D(ou.class);
                return true;
            } else if (i2 == 12288) {
                D(yu.class);
                return true;
            } else if (i2 == 16384) {
                D(su.class);
                return true;
            } else if (i2 == 8240) {
                D(wu.class);
                return true;
            } else if (i2 != 8241) {
                return false;
            } else {
                D(uu.class);
                return true;
            }
        }
    }
}
