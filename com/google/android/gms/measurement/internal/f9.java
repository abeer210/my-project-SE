package com.google.android.gms.measurement.internal;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.common.internal.u;
import defpackage.d61;
import defpackage.e61;
import defpackage.n51;
import defpackage.p51;
import defpackage.v51;
import defpackage.w51;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;
import vigqyno.C0201;

public final class f9 extends n8 {
    public static final String A = null;
    public static final String B = null;
    public static final String C = null;
    public static final String D = null;
    public static final String E = null;
    public static final String F = null;
    public static final String G = null;
    public static final String H = null;
    public static final String I = null;
    public static final String J = null;
    public static final String K = null;
    public static final String L = null;
    public static final String M = null;
    public static final String c = null;
    public static final String d = null;
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
    public static final String p = null;
    public static final String q = null;
    public static final String r = null;
    public static final String s = null;
    public static final String t = null;
    public static final String u = null;
    public static final String v = null;
    public static final String w = null;
    public static final String x = null;
    public static final String y = null;
    public static final String z = null;

    static {
        C0201.m83(f9.class, 102);
    }

    public f9(m8 m8Var) {
        super(m8Var);
    }

    private final Boolean A(String str, n51 n51) {
        if (!u8.Q(str)) {
            return null;
        }
        try {
            return D(new BigDecimal(str), n51, 0.0d);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    private final Boolean B(String str, p51.a aVar, boolean z2, String str2, List<String> list, String str3) {
        if (str == null) {
            return null;
        }
        if (aVar == p51.a.IN_LIST) {
            if (list == null || list.size() == 0) {
                return null;
            }
        } else if (str2 == null) {
            return null;
        }
        if (!z2 && aVar != p51.a.REGEXP) {
            str = str.toUpperCase(Locale.ENGLISH);
        }
        switch (e9.a[aVar.ordinal()]) {
            case 1:
                try {
                    return Boolean.valueOf(Pattern.compile(str3, z2 ? 0 : 66).matcher(str).matches());
                } catch (PatternSyntaxException unused) {
                    e().H().a(C0201.m82(33367), str3);
                    return null;
                }
            case 2:
                return Boolean.valueOf(str.startsWith(str2));
            case 3:
                return Boolean.valueOf(str.endsWith(str2));
            case 4:
                return Boolean.valueOf(str.contains(str2));
            case 5:
                return Boolean.valueOf(str.equals(str2));
            case 6:
                return Boolean.valueOf(list.contains(str));
            default:
                return null;
        }
    }

    private final Boolean C(String str, p51 p51) {
        String str2;
        List<String> list;
        u.k(p51);
        if (str == null || !p51.C() || p51.D() == p51.a.UNKNOWN_MATCH_TYPE) {
            return null;
        }
        if (p51.D() == p51.a.IN_LIST) {
            if (p51.K() == 0) {
                return null;
            }
        } else if (!p51.F()) {
            return null;
        }
        p51.a D2 = p51.D();
        boolean I2 = p51.I();
        if (I2 || D2 == p51.a.REGEXP || D2 == p51.a.IN_LIST) {
            str2 = p51.G();
        } else {
            str2 = p51.G().toUpperCase(Locale.ENGLISH);
        }
        if (p51.K() == 0) {
            list = null;
        } else {
            List<String> J2 = p51.J();
            if (!I2) {
                ArrayList arrayList = new ArrayList(J2.size());
                for (String str3 : J2) {
                    arrayList.add(str3.toUpperCase(Locale.ENGLISH));
                }
                J2 = Collections.unmodifiableList(arrayList);
            }
            list = J2;
        }
        return B(str, D2, I2, str2, list, D2 == p51.a.REGEXP ? str2 : null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0085, code lost:
        if (r2 != null) goto L_0x0087;
     */
    private static Boolean D(BigDecimal bigDecimal, n51 n51, double d2) {
        BigDecimal bigDecimal2;
        BigDecimal bigDecimal3;
        BigDecimal bigDecimal4;
        u.k(n51);
        if (n51.C() && n51.D() != n51.b.UNKNOWN_COMPARISON_TYPE) {
            if (n51.D() == n51.b.BETWEEN) {
                if (!n51.J() || !n51.L()) {
                    return null;
                }
            } else if (!n51.H()) {
                return null;
            }
            n51.b D2 = n51.D();
            if (n51.D() == n51.b.BETWEEN) {
                if (u8.Q(n51.K()) && u8.Q(n51.M())) {
                    try {
                        BigDecimal bigDecimal5 = new BigDecimal(n51.K());
                        bigDecimal3 = new BigDecimal(n51.M());
                        bigDecimal2 = bigDecimal5;
                        bigDecimal4 = null;
                    } catch (NumberFormatException unused) {
                    }
                }
                return null;
            } else if (!u8.Q(n51.I())) {
                return null;
            } else {
                try {
                    bigDecimal4 = new BigDecimal(n51.I());
                    bigDecimal2 = null;
                    bigDecimal3 = null;
                } catch (NumberFormatException unused2) {
                }
            }
            if (D2 == n51.b.BETWEEN) {
                if (bigDecimal2 == null) {
                    return null;
                }
            }
            int i2 = e9.b[D2.ordinal()];
            boolean z2 = false;
            if (i2 == 1) {
                if (bigDecimal.compareTo(bigDecimal4) == -1) {
                    z2 = true;
                }
                return Boolean.valueOf(z2);
            } else if (i2 == 2) {
                if (bigDecimal.compareTo(bigDecimal4) == 1) {
                    z2 = true;
                }
                return Boolean.valueOf(z2);
            } else if (i2 != 3) {
                if (i2 == 4) {
                    if (!(bigDecimal.compareTo(bigDecimal2) == -1 || bigDecimal.compareTo(bigDecimal3) == 1)) {
                        z2 = true;
                    }
                    return Boolean.valueOf(z2);
                }
            } else if (d2 != 0.0d) {
                if (bigDecimal.compareTo(bigDecimal4.subtract(new BigDecimal(d2).multiply(new BigDecimal(2)))) == 1 && bigDecimal.compareTo(bigDecimal4.add(new BigDecimal(d2).multiply(new BigDecimal(2)))) == -1) {
                    z2 = true;
                }
                return Boolean.valueOf(z2);
            } else {
                if (bigDecimal.compareTo(bigDecimal4) == 0) {
                    z2 = true;
                }
                return Boolean.valueOf(z2);
            }
        }
        return null;
    }

    private static List<w51> F(Map<Integer, Long> map) {
        if (map == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(map.size());
        for (Integer num : map.keySet()) {
            int intValue = num.intValue();
            w51.a L2 = w51.L();
            L2.v(intValue);
            L2.u(map.get(Integer.valueOf(intValue)).longValue());
            arrayList.add((w51) ((l91) L2.G0()));
        }
        return arrayList;
    }

    private static void G(Map<Integer, Long> map, int i2, long j2) {
        Long l2 = map.get(Integer.valueOf(i2));
        long j3 = j2 / 1000;
        if (l2 == null || j3 > l2.longValue()) {
            map.put(Integer.valueOf(i2), Long.valueOf(j3));
        }
    }

    private static void H(Map<Integer, List<Long>> map, int i2, long j2) {
        List<Long> list = map.get(Integer.valueOf(i2));
        if (list == null) {
            list = new ArrayList<>();
            map.put(Integer.valueOf(i2), list);
        }
        list.add(Long.valueOf(j2 / 1000));
    }

    private final Boolean v(double d2, n51 n51) {
        try {
            return D(new BigDecimal(d2), n51, Math.ulp(d2));
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    private final Boolean w(long j2, n51 n51) {
        try {
            return D(new BigDecimal(j2), n51, 0.0d);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    private final Boolean x(l51 l51, String str, List<z51> list, long j2) {
        Boolean bool;
        if (l51.O()) {
            Boolean w2 = w(j2, l51.P());
            if (w2 == null) {
                return null;
            }
            if (!w2.booleanValue()) {
                return Boolean.FALSE;
            }
        }
        HashSet hashSet = new HashSet();
        for (m51 m51 : l51.N()) {
            if (m51.L().isEmpty()) {
                e().H().a(C0201.m82(33368), l().v(str));
                return null;
            }
            hashSet.add(m51.L());
        }
        r0 r0Var = new r0();
        for (z51 z51 : list) {
            if (hashSet.contains(z51.C())) {
                if (z51.S()) {
                    r0Var.put(z51.C(), z51.S() ? Long.valueOf(z51.T()) : null);
                } else if (z51.V()) {
                    r0Var.put(z51.C(), z51.V() ? Double.valueOf(z51.W()) : null);
                } else if (z51.P()) {
                    r0Var.put(z51.C(), z51.Q());
                } else {
                    e().H().b(C0201.m82(33369), l().v(str), l().w(z51.C()));
                    return null;
                }
            }
        }
        for (m51 m512 : l51.N()) {
            boolean z2 = m512.J() && m512.K();
            String L2 = m512.L();
            if (L2.isEmpty()) {
                e().H().a(C0201.m82(33370), l().v(str));
                return null;
            }
            Object obj = r0Var.get(L2);
            if (obj instanceof Long) {
                if (!m512.H()) {
                    e().H().b(C0201.m82(33371), l().v(str), l().w(L2));
                    return null;
                }
                Boolean w3 = w(((Long) obj).longValue(), m512.I());
                if (w3 == null) {
                    return null;
                }
                if (w3.booleanValue() == z2) {
                    return Boolean.FALSE;
                }
            } else if (obj instanceof Double) {
                if (!m512.H()) {
                    e().H().b(C0201.m82(33372), l().v(str), l().w(L2));
                    return null;
                }
                Boolean v2 = v(((Double) obj).doubleValue(), m512.I());
                if (v2 == null) {
                    return null;
                }
                if (v2.booleanValue() == z2) {
                    return Boolean.FALSE;
                }
            } else if (obj instanceof String) {
                if (m512.F()) {
                    bool = C((String) obj, m512.G());
                } else if (m512.H()) {
                    String str2 = (String) obj;
                    if (u8.Q(str2)) {
                        bool = A(str2, m512.I());
                    } else {
                        e().H().b(C0201.m82(33373), l().v(str), l().w(L2));
                        return null;
                    }
                } else {
                    e().H().b(C0201.m82(33374), l().v(str), l().w(L2));
                    return null;
                }
                if (bool == null) {
                    return null;
                }
                if (bool.booleanValue() == z2) {
                    return Boolean.FALSE;
                }
            } else if (obj == null) {
                e().M().b(C0201.m82(33375), l().v(str), l().w(L2));
                return Boolean.FALSE;
            } else {
                e().H().b(C0201.m82(33376), l().v(str), l().w(L2));
                return null;
            }
        }
        return Boolean.TRUE;
    }

    private final Boolean y(o51 o51, f61 f61) {
        m51 O = o51.O();
        boolean K2 = O.K();
        if (f61.U()) {
            if (O.H()) {
                return z(w(f61.V(), O.I()), K2);
            }
            e().H().a(C0201.m82(33377), l().x(f61.C()));
            return null;
        } else if (f61.X()) {
            if (O.H()) {
                return z(v(f61.Y(), O.I()), K2);
            }
            e().H().a(C0201.m82(33378), l().x(f61.C()));
            return null;
        } else if (!f61.R()) {
            e().H().a(C0201.m82(33381), l().x(f61.C()));
            return null;
        } else if (O.F()) {
            return z(C(f61.S(), O.G()), K2);
        } else {
            if (!O.H()) {
                e().H().a(C0201.m82(33379), l().x(f61.C()));
            } else if (u8.Q(f61.S())) {
                return z(A(f61.S(), O.I()), K2);
            } else {
                e().H().b(C0201.m82(33380), l().x(f61.C()), f61.S());
            }
            return null;
        }
    }

    private static Boolean z(Boolean bool, boolean z2) {
        if (bool == null) {
            return null;
        }
        return Boolean.valueOf(bool.booleanValue() != z2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v82, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r1v109, types: [java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:412:0x0d0b, code lost:
        if (r0.I() == false) goto L_0x0d16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:413:0x0d0d, code lost:
        r8 = java.lang.Integer.valueOf(r0.C());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:414:0x0d16, code lost:
        r8 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:415:0x0d17, code lost:
        r1.b(com.google.android.gms.measurement.internal.f9.J, r6, java.lang.String.valueOf(r8));
        r15.add(java.lang.Integer.valueOf(r5));
        r1 = r87;
        r0 = r16;
        r3 = r3;
        r46 = r11;
        r10 = r39;
        r39 = r44;
        r23 = r22;
        r22 = r22;
     */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x035d  */
    /* JADX WARNING: Removed duplicated region for block: B:156:0x0485  */
    /* JADX WARNING: Removed duplicated region for block: B:161:0x04a2  */
    /* JADX WARNING: Removed duplicated region for block: B:166:0x04c1  */
    /* JADX WARNING: Removed duplicated region for block: B:183:0x0556  */
    /* JADX WARNING: Removed duplicated region for block: B:187:0x05de  */
    /* JADX WARNING: Removed duplicated region for block: B:193:0x066d  */
    /* JADX WARNING: Removed duplicated region for block: B:200:0x068e  */
    /* JADX WARNING: Removed duplicated region for block: B:218:0x0772  */
    /* JADX WARNING: Removed duplicated region for block: B:301:0x09f8  */
    /* JADX WARNING: Removed duplicated region for block: B:422:0x0d81  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x01dc  */
    /* JADX WARNING: Unknown variable types count: 2 */
    public final List<v51> E(String str, List<x51> list, List<f61> list2) {
        Long l2;
        Map<Integer, d61> Z;
        boolean isEmpty;
        Iterator it;
        v51.a aVar;
        Iterator it2;
        HashSet hashSet;
        r0 r0Var;
        r0 r0Var2;
        r0 r0Var3;
        SQLiteException e2;
        List list3;
        List list4;
        Iterator<f61> it3;
        r0 r0Var4;
        Map map;
        r0 r0Var5;
        Map map2;
        r0 r0Var6;
        r0 r0Var7;
        String str2;
        r0 r0Var8;
        String str3;
        r0 r0Var9;
        Integer num;
        long j2;
        r0 r0Var10;
        String str4;
        ArrayList arrayList;
        Long l3;
        HashSet hashSet2;
        x51 x51;
        f g0;
        HashSet hashSet3;
        String str5;
        r0 r0Var11;
        r0 r0Var12;
        r0 r0Var13;
        x51 x512;
        f fVar;
        String str6;
        String str7;
        r0 r0Var14;
        r0 r0Var15;
        Map<Integer, List<l51>> map3;
        Iterator<Integer> it4;
        r0 r0Var16;
        x51 x513;
        BitSet bitSet;
        r0 r0Var17;
        Map map4;
        Iterator<Integer> it5;
        BitSet bitSet2;
        r0 r0Var18;
        long j3;
        r0 r0Var19;
        r0 r0Var20;
        f fVar2;
        String str8;
        Map map5;
        String str9;
        Map<Integer, List<l51>> map6;
        r0 r0Var21;
        r0 r0Var22;
        String str10;
        r0 r0Var23;
        r0 r0Var24;
        Map map7;
        BitSet bitSet3;
        String str11;
        Integer num2;
        String str12;
        r0 r0Var25;
        String str13;
        HashSet hashSet4;
        Long l4;
        x51 x514;
        long j4;
        String str14;
        ArrayList arrayList2;
        SQLiteException e3;
        Object obj;
        Map<Integer, d61> map8;
        Iterator it6;
        Iterator it7;
        Map<Integer, d61> map9;
        r0 r0Var26;
        r0 r0Var27;
        r0 r0Var28;
        r0 r0Var29;
        boolean z2;
        Iterator it8;
        Map<Integer, d61> map10;
        Long l5;
        f9 f9Var;
        Iterator<Integer> it9;
        Map<Integer, List<Integer>> map11;
        n9 p2;
        String str15 = str;
        u.g(str);
        u.k(list);
        u.k(list2);
        HashSet hashSet5 = new HashSet();
        r0 r0Var30 = new r0();
        r0 r0Var31 = new r0();
        r0 r0Var32 = new r0();
        r0 r0Var33 = new r0();
        r0 r0Var34 = new r0();
        boolean P = g().P(str15);
        boolean F2 = g().F(str15, l.q0);
        boolean F3 = g().F(str15, l.x0);
        boolean F4 = g().F(str15, l.y0);
        if (F3 || F4) {
            Iterator<x51> it10 = list.iterator();
            while (true) {
                if (!it10.hasNext()) {
                    break;
                }
                x51 next = it10.next();
                if (t.equals(next.D())) {
                    l2 = Long.valueOf(next.F());
                    break;
                }
            }
            if (l2 != null && F4) {
                p2 = p();
                p2.t();
                p2.j();
                u.g(str);
                ContentValues contentValues = new ContentValues();
                contentValues.put(F, (Integer) 0);
                p2.x().update(L, contentValues, l, new String[]{str15});
            }
            Z = p().Z(str15);
            if (Z != null && !Z.isEmpty()) {
                HashSet hashSet6 = new HashSet(Z.keySet());
                if (F3 || l2 == null) {
                    map8 = Z;
                } else {
                    f9 o2 = o();
                    u.g(str);
                    u.k(Z);
                    map8 = new r0<>();
                    if (!Z.isEmpty()) {
                        Map<Integer, List<Integer>> Y = o2.p().Y(str15);
                        Iterator<Integer> it11 = Z.keySet().iterator();
                        while (it11.hasNext()) {
                            int intValue = it11.next().intValue();
                            d61 d61 = Z.get(Integer.valueOf(intValue));
                            List<Integer> list5 = Y.get(Integer.valueOf(intValue));
                            if (list5 == null || list5.isEmpty()) {
                                f9Var = o2;
                                map11 = Y;
                                it9 = it11;
                                map8.put(Integer.valueOf(intValue), d61);
                            } else {
                                map11 = Y;
                                it9 = it11;
                                List<Long> D2 = o2.n().D(d61.X(), list5);
                                if (!D2.isEmpty()) {
                                    d61.a aVar2 = (d61.a) d61.y();
                                    aVar2.C();
                                    aVar2.x(D2);
                                    f9Var = o2;
                                    List<Long> D3 = o2.n().D(d61.U(), list5);
                                    aVar2.B();
                                    aVar2.w(D3);
                                    for (int i2 = 0; i2 < d61.b0(); i2++) {
                                        if (list5.contains(Integer.valueOf(d61.F(i2).C()))) {
                                            aVar2.u(i2);
                                        }
                                    }
                                    for (int i3 = 0; i3 < d61.e0(); i3++) {
                                        if (list5.contains(Integer.valueOf(d61.H(i3).C()))) {
                                            aVar2.v(i3);
                                        }
                                    }
                                    map8.put(Integer.valueOf(intValue), (d61) ((l91) aVar2.G0()));
                                } else {
                                    Y = map11;
                                    it11 = it9;
                                }
                            }
                            Y = map11;
                            it11 = it9;
                            o2 = f9Var;
                        }
                    }
                }
                it6 = hashSet6.iterator();
                while (it6.hasNext()) {
                    int intValue2 = ((Integer) it6.next()).intValue();
                    d61 d612 = map8.get(Integer.valueOf(intValue2));
                    BitSet bitSet4 = (BitSet) r0Var31.get(Integer.valueOf(intValue2));
                    BitSet bitSet5 = (BitSet) r0Var32.get(Integer.valueOf(intValue2));
                    if (P) {
                        r0Var26 = new r0();
                        if (!(d612 == null || d612.b0() == 0)) {
                            for (w51 w51 : d612.a0()) {
                                if (w51.I()) {
                                    it8 = it6;
                                    Integer valueOf = Integer.valueOf(w51.C());
                                    if (w51.J()) {
                                        Long valueOf2 = Long.valueOf(w51.K());
                                        map10 = map8;
                                        l5 = valueOf2;
                                    } else {
                                        map10 = map8;
                                        l5 = null;
                                    }
                                    r0Var26.put(valueOf, l5);
                                } else {
                                    it8 = it6;
                                    map10 = map8;
                                }
                                map8 = map10;
                                it6 = it8;
                            }
                        }
                        it7 = it6;
                        map9 = map8;
                        r0Var33.put(Integer.valueOf(intValue2), r0Var26);
                    } else {
                        it7 = it6;
                        map9 = map8;
                        r0Var26 = null;
                    }
                    if (bitSet4 == null) {
                        bitSet4 = new BitSet();
                        r0Var31.put(Integer.valueOf(intValue2), bitSet4);
                        bitSet5 = new BitSet();
                        r0Var32.put(Integer.valueOf(intValue2), bitSet5);
                    }
                    if (d612 != null) {
                        int i4 = 0;
                        while (i4 < (d612.V() << 6)) {
                            if (u8.M(d612.U(), i4)) {
                                r0Var29 = r0Var32;
                                r0Var28 = r0Var33;
                                r0Var27 = r0Var31;
                                e().M().b(c, Integer.valueOf(intValue2), Integer.valueOf(i4));
                                bitSet5.set(i4);
                                if (u8.M(d612.X(), i4)) {
                                    bitSet4.set(i4);
                                    z2 = true;
                                    if (r0Var26 != null && !z2) {
                                        r0Var26.remove(Integer.valueOf(i4));
                                    }
                                    i4++;
                                    r0Var32 = r0Var29;
                                    r0Var33 = r0Var28;
                                    r0Var31 = r0Var27;
                                }
                            } else {
                                r0Var29 = r0Var32;
                                r0Var28 = r0Var33;
                                r0Var27 = r0Var31;
                            }
                            z2 = false;
                            r0Var26.remove(Integer.valueOf(i4));
                            i4++;
                            r0Var32 = r0Var29;
                            r0Var33 = r0Var28;
                            r0Var31 = r0Var27;
                        }
                    }
                    v51.a S = v51.S();
                    S.x(false);
                    if (F3) {
                        S.v(Z.get(Integer.valueOf(intValue2)));
                    } else {
                        S.v(d612);
                    }
                    d61.a g02 = d61.g0();
                    g02.x(u8.C(bitSet4));
                    g02.w(u8.C(bitSet5));
                    if (P) {
                        g02.y(F(r0Var26));
                        r0Var34.put(Integer.valueOf(intValue2), new r0());
                    }
                    S.u(g02);
                    r0Var30.put(Integer.valueOf(intValue2), (v51) ((l91) S.G0()));
                    r0Var32 = r0Var32;
                    map8 = map9;
                    r0Var33 = r0Var33;
                    it6 = it7;
                    r0Var31 = r0Var31;
                }
            }
            r0 r0Var35 = r0Var32;
            r0 r0Var36 = r0Var33;
            r0 r0Var37 = r0Var31;
            isEmpty = list.isEmpty();
            String str16 = H;
            String str17 = j;
            String str18 = B;
            if (!isEmpty) {
                r0 r0Var38 = new r0();
                long j5 = 0;
                x51 x515 = null;
                Long l6 = null;
                for (x51 x516 : list) {
                    String D4 = x516.D();
                    List<z51> X = x516.X();
                    n();
                    String str19 = x;
                    Long l7 = (Long) u8.N(x516, str19);
                    boolean z3 = l7 != null;
                    if (z3 && D4.equals(k)) {
                        n();
                        String str20 = (String) u8.N(x516, m);
                        if (TextUtils.isEmpty(str20)) {
                            e().E().a(i, l7);
                            r0Var25 = r0Var38;
                            str13 = str17;
                            hashSet4 = hashSet5;
                        } else {
                            if (x515 == null || l6 == null || l7.longValue() != l6.longValue()) {
                                Pair<x51, Long> C2 = p().C(str15, l7);
                                if (C2 == null || (obj = C2.first) == null) {
                                    r0Var25 = r0Var38;
                                    str13 = str17;
                                    hashSet4 = hashSet5;
                                    e().E().b(w, str20, l7);
                                } else {
                                    x51 x517 = (x51) obj;
                                    j4 = ((Long) C2.second).longValue();
                                    n();
                                    x514 = x517;
                                    l4 = (Long) u8.N(x517, str19);
                                }
                            } else {
                                x514 = x515;
                                l4 = l6;
                                j4 = j5;
                            }
                            long j6 = j4 - 1;
                            if (j6 <= 0) {
                                n9 p3 = p();
                                p3.j();
                                p3.e().M().a(e, str15);
                                try {
                                    SQLiteDatabase x2 = p3.x();
                                    String str21 = q;
                                    try {
                                        String[] strArr = new String[1];
                                        try {
                                            strArr[0] = str15;
                                            x2.execSQL(str21, strArr);
                                        } catch (SQLiteException e4) {
                                            e3 = e4;
                                        }
                                    } catch (SQLiteException e5) {
                                        e3 = e5;
                                        p3.e().E().a(g, e3);
                                        r0Var10 = r0Var38;
                                        str4 = str17;
                                        hashSet2 = hashSet5;
                                        x51 = x516;
                                        str14 = str20;
                                        arrayList2 = new ArrayList();
                                        while (r1.hasNext()) {
                                        }
                                        if (!arrayList2.isEmpty()) {
                                        }
                                        g0 = p().g0(str15, x51.D());
                                        if (g0 == null) {
                                        }
                                        p().J(fVar);
                                        long j7 = fVar.c;
                                        r0 r0Var39 = r0Var10;
                                        map3 = (Map) r0Var39.get(D4);
                                        if (map3 == null) {
                                        }
                                        Map<Integer, List<l51>> map12 = map3;
                                        it4 = map12.keySet().iterator();
                                        while (it4.hasNext()) {
                                        }
                                        r0Var35 = r0Var15;
                                        r0Var34 = r0Var14;
                                        str17 = str7;
                                        str15 = str6;
                                        r0Var38 = r0Var39;
                                        l6 = l3;
                                        j5 = j2;
                                        r0Var36 = r0Var13;
                                        r0Var30 = r0Var12;
                                        r0Var37 = r0Var11;
                                        str16 = str5;
                                        hashSet5 = hashSet3;
                                    }
                                } catch (SQLiteException e6) {
                                    e3 = e6;
                                    p3.e().E().a(g, e3);
                                    r0Var10 = r0Var38;
                                    str4 = str17;
                                    hashSet2 = hashSet5;
                                    x51 = x516;
                                    str14 = str20;
                                    arrayList2 = new ArrayList();
                                    while (r1.hasNext()) {
                                    }
                                    if (!arrayList2.isEmpty()) {
                                    }
                                    g0 = p().g0(str15, x51.D());
                                    if (g0 == null) {
                                    }
                                    p().J(fVar);
                                    long j72 = fVar.c;
                                    r0 r0Var392 = r0Var10;
                                    map3 = (Map) r0Var392.get(D4);
                                    if (map3 == null) {
                                    }
                                    Map<Integer, List<l51>> map122 = map3;
                                    it4 = map122.keySet().iterator();
                                    while (it4.hasNext()) {
                                    }
                                    r0Var35 = r0Var15;
                                    r0Var34 = r0Var14;
                                    str17 = str7;
                                    str15 = str6;
                                    r0Var38 = r0Var392;
                                    l6 = l3;
                                    j5 = j2;
                                    r0Var36 = r0Var13;
                                    r0Var30 = r0Var12;
                                    r0Var37 = r0Var11;
                                    str16 = str5;
                                    hashSet5 = hashSet3;
                                }
                                r0Var10 = r0Var38;
                                str4 = str17;
                                hashSet2 = hashSet5;
                                x51 = x516;
                                str14 = str20;
                            } else {
                                str4 = str17;
                                hashSet2 = hashSet5;
                                x51 = x516;
                                str14 = str20;
                                r0Var10 = r0Var38;
                                p().S(str, l7, j6, x514);
                            }
                            arrayList2 = new ArrayList();
                            for (z51 z51 : x514.X()) {
                                n();
                                if (u8.x(x51, z51.C()) == null) {
                                    arrayList2.add(z51);
                                }
                            }
                            if (!arrayList2.isEmpty()) {
                                for (z51 z512 : X) {
                                    arrayList2.add(z512);
                                }
                                D4 = str14;
                                j2 = j6;
                                arrayList = arrayList2;
                                x515 = x514;
                                l3 = l4;
                            } else {
                                e().H().a(h, str14);
                                D4 = str14;
                                x515 = x514;
                                j2 = j6;
                                arrayList = X;
                                l3 = l4;
                            }
                        }
                        hashSet5 = hashSet4;
                        j5 = j5;
                        str17 = str13;
                        r0Var38 = r0Var25;
                    } else {
                        r0Var10 = r0Var38;
                        str4 = str17;
                        hashSet2 = hashSet5;
                        x51 = x516;
                        if (z3) {
                            n();
                            long j8 = 0L;
                            ?? N = u8.N(x51, A);
                            if (N != 0) {
                                j8 = N;
                            }
                            long longValue = j8.longValue();
                            if (longValue <= 0) {
                                e().H().a(f, D4);
                                str12 = D4;
                            } else {
                                str12 = D4;
                                p().S(str, l7, longValue, x51);
                            }
                            D4 = str12;
                            x515 = x51;
                            j2 = longValue;
                            l3 = l7;
                        } else {
                            j2 = j5;
                            l3 = l6;
                        }
                        arrayList = X;
                    }
                    g0 = p().g0(str15, x51.D());
                    if (g0 == null) {
                        e().H().b(y, k3.B(str), l().v(D4));
                        if (F4) {
                            str7 = str4;
                            r0Var14 = r0Var34;
                            r0Var15 = r0Var35;
                            r0Var13 = r0Var36;
                            r0Var12 = r0Var30;
                            str5 = str16;
                            r0Var11 = r0Var37;
                            x512 = x51;
                            hashSet3 = hashSet2;
                            str6 = str15;
                            fVar = new f(str, x51.D(), 1, 1, 1, x512.F(), 0, null, null, null, null);
                        } else {
                            str6 = str15;
                            r0Var14 = r0Var34;
                            r0Var12 = r0Var30;
                            str5 = str16;
                            x512 = x51;
                            r0Var15 = r0Var35;
                            hashSet3 = hashSet2;
                            r0Var13 = r0Var36;
                            r0Var11 = r0Var37;
                            str7 = str4;
                            fVar = new f(str, x512.D(), 1, 1, x512.F(), 0, null, null, null, null);
                        }
                    } else {
                        str6 = str15;
                        r0Var14 = r0Var34;
                        r0Var12 = r0Var30;
                        str5 = str16;
                        x512 = x51;
                        r0Var15 = r0Var35;
                        hashSet3 = hashSet2;
                        r0Var13 = r0Var36;
                        r0Var11 = r0Var37;
                        str7 = str4;
                        if (F4) {
                            fVar = new f(g0.a, g0.b, g0.c + 1, g0.d + 1, g0.e + 1, g0.f, g0.g, g0.h, g0.i, g0.j, g0.k);
                        } else {
                            fVar = new f(g0.a, g0.b, g0.c + 1, g0.d + 1, g0.e, g0.f, g0.g, g0.h, g0.i, g0.j, g0.k);
                        }
                    }
                    p().J(fVar);
                    long j722 = fVar.c;
                    r0 r0Var3922 = r0Var10;
                    map3 = (Map) r0Var3922.get(D4);
                    if (map3 == null) {
                        map3 = p().A0(str6, D4);
                        if (map3 == null) {
                            map3 = new r0<>();
                        }
                        r0Var3922.put(D4, map3);
                    }
                    Map<Integer, List<l51>> map1222 = map3;
                    it4 = map1222.keySet().iterator();
                    while (it4.hasNext()) {
                        int intValue3 = it4.next().intValue();
                        if (hashSet3.contains(Integer.valueOf(intValue3))) {
                            e().M().a(str7, Integer.valueOf(intValue3));
                            hashSet3 = hashSet3;
                        } else {
                            BitSet bitSet6 = (BitSet) r0Var11.get(Integer.valueOf(intValue3));
                            BitSet bitSet7 = (BitSet) r0Var15.get(Integer.valueOf(intValue3));
                            if (P) {
                                bitSet = bitSet7;
                                r0Var17 = r0Var13;
                                map4 = (Map) r0Var17.get(Integer.valueOf(intValue3));
                                x513 = x515;
                                r0Var16 = (Map) r0Var14.get(Integer.valueOf(intValue3));
                            } else {
                                x513 = x515;
                                bitSet = bitSet7;
                                r0Var17 = r0Var13;
                                map4 = null;
                                r0Var16 = null;
                            }
                            r0 r0Var40 = r0Var12;
                            if (((v51) r0Var40.get(Integer.valueOf(intValue3))) == null) {
                                Integer valueOf3 = Integer.valueOf(intValue3);
                                v51.a S2 = v51.S();
                                it5 = it4;
                                S2.x(true);
                                r0Var40.put(valueOf3, (v51) ((l91) S2.G0()));
                                bitSet6 = new BitSet();
                                r0Var11.put(Integer.valueOf(intValue3), bitSet6);
                                BitSet bitSet8 = new BitSet();
                                r0Var15.put(Integer.valueOf(intValue3), bitSet8);
                                if (P) {
                                    map4 = new r0();
                                    r0Var17.put(Integer.valueOf(intValue3), map4);
                                    r0 r0Var41 = new r0();
                                    bitSet = bitSet8;
                                    r0Var14.put(Integer.valueOf(intValue3), r0Var41);
                                    r0Var18 = r0Var41;
                                    bitSet2 = bitSet6;
                                    for (l51 l51 : map1222.get(Integer.valueOf(intValue3))) {
                                        if (!F4 || !F3 || !l51.T()) {
                                            r0Var19 = r0Var15;
                                            r0Var20 = r0Var14;
                                            j3 = j722;
                                        } else {
                                            r0Var19 = r0Var15;
                                            r0Var20 = r0Var14;
                                            j3 = fVar.e;
                                        }
                                        if (e().t(2)) {
                                            m3 M2 = e().M();
                                            Integer valueOf4 = Integer.valueOf(intValue3);
                                            if (l51.M()) {
                                                str8 = str7;
                                                num2 = Integer.valueOf(l51.C());
                                                map5 = map4;
                                            } else {
                                                str8 = str7;
                                                map5 = map4;
                                                num2 = null;
                                            }
                                            fVar2 = fVar;
                                            M2.c(s, valueOf4, num2, l().v(l51.K()));
                                            str9 = str5;
                                            e().M().a(str9, n().y(l51));
                                        } else {
                                            str8 = str7;
                                            map5 = map4;
                                            fVar2 = fVar;
                                            str9 = str5;
                                        }
                                        if (!l51.M() || l51.C() > 256) {
                                            str5 = str9;
                                            map6 = map1222;
                                            r0Var21 = r0Var19;
                                            map7 = map5;
                                            str10 = D4;
                                            r0Var23 = r0Var20;
                                            r0Var24 = r0Var40;
                                            bitSet3 = bitSet;
                                            r0Var22 = r0Var17;
                                            str11 = str8;
                                            e().H().b(u, k3.B(str), String.valueOf(l51.M() ? Integer.valueOf(l51.C()) : null));
                                        } else {
                                            String str22 = K;
                                            if (P) {
                                                boolean Q = l51.Q();
                                                boolean R = l51.R();
                                                boolean z4 = Q || R || (F3 && l51.T());
                                                if (!bitSet2.get(l51.C()) || z4) {
                                                    map6 = map1222;
                                                    str5 = str9;
                                                    r0Var24 = r0Var40;
                                                    bitSet3 = bitSet;
                                                    r0Var23 = r0Var20;
                                                    r0Var22 = r0Var17;
                                                    str11 = str8;
                                                    r0Var21 = r0Var19;
                                                    map7 = map5;
                                                    str10 = D4;
                                                    Boolean x3 = x(l51, D4, arrayList, j3);
                                                    e().M().a(str22, x3 == null ? str18 : x3);
                                                    if (x3 == null) {
                                                        hashSet3.add(Integer.valueOf(intValue3));
                                                    } else {
                                                        bitSet3.set(l51.C());
                                                        if (x3.booleanValue()) {
                                                            bitSet2.set(l51.C());
                                                            if (z4 && x512.Z()) {
                                                                if (R) {
                                                                    H(r0Var18, l51.C(), x512.F());
                                                                } else {
                                                                    G(map7, l51.C(), x512.F());
                                                                }
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    e().M().b(I, Integer.valueOf(intValue3), l51.M() ? Integer.valueOf(l51.C()) : null);
                                                    str5 = str9;
                                                    r0Var14 = r0Var20;
                                                    r0Var15 = r0Var19;
                                                    map4 = map5;
                                                    str7 = str8;
                                                    fVar = fVar2;
                                                }
                                            } else {
                                                str5 = str9;
                                                map6 = map1222;
                                                r0Var21 = r0Var19;
                                                map7 = map5;
                                                str10 = D4;
                                                r0Var23 = r0Var20;
                                                r0Var24 = r0Var40;
                                                bitSet3 = bitSet;
                                                r0Var22 = r0Var17;
                                                str11 = str8;
                                                if (bitSet2.get(l51.C())) {
                                                    e().M().b(M, Integer.valueOf(intValue3), l51.M() ? Integer.valueOf(l51.C()) : null);
                                                } else {
                                                    Boolean x4 = x(l51, str10, arrayList, j3);
                                                    e().M().a(str22, x4 == null ? str18 : x4);
                                                    if (x4 == null) {
                                                        hashSet3.add(Integer.valueOf(intValue3));
                                                    } else {
                                                        bitSet3.set(l51.C());
                                                        if (x4.booleanValue()) {
                                                            bitSet2.set(l51.C());
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                        str7 = str11;
                                        bitSet = bitSet3;
                                        map4 = map7;
                                        r0Var40 = r0Var24;
                                        r0Var14 = r0Var23;
                                        D4 = str10;
                                        r0Var17 = r0Var22;
                                        fVar = fVar2;
                                        r0Var15 = r0Var21;
                                        map1222 = map6;
                                    }
                                    r0Var11 = r0Var11;
                                    r0Var12 = r0Var40;
                                    hashSet3 = hashSet3;
                                    j722 = j722;
                                    x515 = x513;
                                    it4 = it5;
                                    r0Var13 = r0Var17;
                                    r0Var3922 = r0Var3922;
                                } else {
                                    bitSet = bitSet8;
                                }
                            } else {
                                it5 = it4;
                            }
                            bitSet2 = bitSet6;
                            r0Var18 = r0Var16;
                            while (r20.hasNext()) {
                            }
                            r0Var11 = r0Var11;
                            r0Var12 = r0Var40;
                            hashSet3 = hashSet3;
                            j722 = j722;
                            x515 = x513;
                            it4 = it5;
                            r0Var13 = r0Var17;
                            r0Var3922 = r0Var3922;
                        }
                    }
                    r0Var35 = r0Var15;
                    r0Var34 = r0Var14;
                    str17 = str7;
                    str15 = str6;
                    r0Var38 = r0Var3922;
                    l6 = l3;
                    j5 = j2;
                    r0Var36 = r0Var13;
                    r0Var30 = r0Var12;
                    r0Var37 = r0Var11;
                    str16 = str5;
                    hashSet5 = hashSet3;
                }
            }
            String str23 = str15;
            r0 r0Var42 = r0Var30;
            String str24 = str16;
            r0 r0Var43 = r0Var35;
            r0 r0Var44 = r0Var36;
            r0 r0Var45 = r0Var34;
            String str25 = str17;
            if (!list2.isEmpty()) {
                r0 r0Var46 = new r0();
                Iterator<f61> it12 = list2.iterator();
                while (it12.hasNext()) {
                    f61 next2 = it12.next();
                    Map<Integer, List<o51>> map13 = (Map) r0Var46.get(next2.C());
                    if (map13 == null) {
                        map13 = p().B0(str23, next2.C());
                        if (map13 == null) {
                            map13 = new r0<>();
                        }
                        r0Var46.put(next2.C(), map13);
                    }
                    Iterator<Integer> it13 = map13.keySet().iterator();
                    while (it13.hasNext()) {
                        int intValue4 = it13.next().intValue();
                        if (hashSet5.contains(Integer.valueOf(intValue4))) {
                            e().M().a(str25, Integer.valueOf(intValue4));
                        } else {
                            BitSet bitSet9 = (BitSet) r0Var37.get(Integer.valueOf(intValue4));
                            r0 r0Var47 = r0Var43;
                            BitSet bitSet10 = (BitSet) r0Var47.get(Integer.valueOf(intValue4));
                            if (P) {
                                r0Var5 = r0Var44;
                                map2 = (Map) r0Var5.get(Integer.valueOf(intValue4));
                                it3 = it12;
                                r0Var6 = r0Var45;
                                map = (Map) r0Var6.get(Integer.valueOf(intValue4));
                                r0Var4 = r0Var46;
                            } else {
                                it3 = it12;
                                r0Var6 = r0Var45;
                                r0Var5 = r0Var44;
                                r0Var4 = r0Var46;
                                map2 = null;
                                map = null;
                            }
                            if (((v51) r0Var42.get(Integer.valueOf(intValue4))) == null) {
                                Integer valueOf5 = Integer.valueOf(intValue4);
                                v51.a S3 = v51.S();
                                S3.x(true);
                                r0Var42.put(valueOf5, (v51) ((l91) S3.G0()));
                                bitSet9 = new BitSet();
                                r0Var37.put(Integer.valueOf(intValue4), bitSet9);
                                bitSet10 = new BitSet();
                                r0Var47.put(Integer.valueOf(intValue4), bitSet10);
                                if (P) {
                                    map2 = new r0();
                                    r0Var5.put(Integer.valueOf(intValue4), map2);
                                    map = new r0();
                                    r0Var6.put(Integer.valueOf(intValue4), map);
                                }
                            }
                            Iterator<o51> it14 = map13.get(Integer.valueOf(intValue4)).iterator();
                            while (true) {
                                if (!it14.hasNext()) {
                                    r0Var45 = r0Var6;
                                    r0Var42 = r0Var42;
                                    r0Var43 = r0Var47;
                                    r0Var44 = r0Var5;
                                    r0Var46 = r0Var4;
                                    map13 = map13;
                                    it12 = it3;
                                    break;
                                }
                                o51 next3 = it14.next();
                                if (e().t(2)) {
                                    m3 M3 = e().M();
                                    Integer valueOf6 = Integer.valueOf(intValue4);
                                    if (next3.I()) {
                                        r0Var8 = r0Var6;
                                        str2 = str25;
                                        num = Integer.valueOf(next3.C());
                                    } else {
                                        r0Var8 = r0Var6;
                                        str2 = str25;
                                        num = null;
                                    }
                                    r0Var7 = r0Var5;
                                    M3.c(r, valueOf6, num, l().x(next3.D()));
                                    str3 = str24;
                                    e().M().a(str3, n().z(next3));
                                } else {
                                    r0Var8 = r0Var6;
                                    str2 = str25;
                                    r0Var7 = r0Var5;
                                    str3 = str24;
                                }
                                if (!next3.I() || next3.C() > 256) {
                                    str24 = str3;
                                    m3 H2 = e().H();
                                    Object B2 = k3.B(str);
                                } else {
                                    String str26 = v;
                                    if (P) {
                                        boolean J2 = next3.J();
                                        boolean K2 = next3.K();
                                        boolean z5 = F3 && next3.M();
                                        boolean z6 = J2 || K2 || z5;
                                        if (!bitSet9.get(next3.C()) || z6) {
                                            str24 = str3;
                                            Boolean y2 = y(next3, next2);
                                            r0Var9 = r0Var47;
                                            e().M().a(str26, y2 == null ? str18 : y2);
                                            if (y2 == null) {
                                                hashSet5.add(Integer.valueOf(intValue4));
                                            } else {
                                                bitSet10.set(next3.C());
                                                if (!F3 || !z5 || y2.booleanValue()) {
                                                    if (!F2) {
                                                        bitSet9.set(next3.C(), y2.booleanValue());
                                                    } else if (!bitSet9.get(next3.C()) || next3.J()) {
                                                        bitSet9.set(next3.C(), y2.booleanValue());
                                                    }
                                                    if (y2.booleanValue() && z6 && next2.a0()) {
                                                        long b0 = next2.b0();
                                                        if (F3 && z5 && l2 != null) {
                                                            b0 = l2.longValue();
                                                        }
                                                        if (K2) {
                                                            H(map, next3.C(), b0);
                                                        } else {
                                                            G(map2, next3.C(), b0);
                                                        }
                                                    }
                                                }
                                            }
                                        } else {
                                            e().M().b(o, Integer.valueOf(intValue4), next3.I() ? Integer.valueOf(next3.C()) : null);
                                            str24 = str3;
                                            map13 = map13;
                                            it14 = it14;
                                            r0Var6 = r0Var8;
                                            str25 = str2;
                                            r0Var5 = r0Var7;
                                        }
                                    } else {
                                        str24 = str3;
                                        r0Var9 = r0Var47;
                                        if (bitSet9.get(next3.C())) {
                                            e().M().b(G, Integer.valueOf(intValue4), next3.I() ? Integer.valueOf(next3.C()) : null);
                                        } else {
                                            Boolean y3 = y(next3, next2);
                                            e().M().a(str26, y3 == null ? str18 : y3);
                                            if (y3 == null) {
                                                hashSet5.add(Integer.valueOf(intValue4));
                                            } else {
                                                bitSet10.set(next3.C());
                                                if (y3.booleanValue()) {
                                                    bitSet9.set(next3.C());
                                                }
                                            }
                                        }
                                    }
                                    map13 = map13;
                                    it14 = it14;
                                    r0Var6 = r0Var8;
                                    r0Var47 = r0Var9;
                                    str25 = str2;
                                    r0Var5 = r0Var7;
                                }
                            }
                            it13 = it13;
                        }
                    }
                    str23 = str;
                    r0Var45 = r0Var45;
                    r0Var42 = r0Var42;
                }
            }
            r0 r0Var48 = r0Var45;
            r0 r0Var49 = r0Var44;
            r0 r0Var50 = r0Var43;
            ArrayList arrayList3 = new ArrayList();
            it = r0Var37.keySet().iterator();
            while (it.hasNext()) {
                int intValue5 = ((Integer) it.next()).intValue();
                if (!hashSet5.contains(Integer.valueOf(intValue5))) {
                    v51 v51 = (v51) r0Var42.get(Integer.valueOf(intValue5));
                    if (v51 == null) {
                        aVar = v51.S();
                    } else {
                        aVar = (v51.a) v51.y();
                    }
                    aVar.w(intValue5);
                    d61.a g03 = d61.g0();
                    g03.x(u8.C((BitSet) r0Var37.get(Integer.valueOf(intValue5))));
                    r0 r0Var51 = r0Var50;
                    g03.w(u8.C((BitSet) r0Var51.get(Integer.valueOf(intValue5))));
                    if (P) {
                        r0Var3 = r0Var49;
                        g03.y(F((Map) r0Var3.get(Integer.valueOf(intValue5))));
                        r0Var2 = r0Var48;
                        Map map14 = (Map) r0Var2.get(Integer.valueOf(intValue5));
                        if (map14 == null) {
                            list3 = Collections.emptyList();
                            it2 = it;
                            r0Var = r0Var51;
                        } else {
                            ArrayList arrayList4 = new ArrayList(map14.size());
                            for (Integer num3 : map14.keySet()) {
                                e61.a R2 = e61.R();
                                R2.u(num3.intValue());
                                List<Long> list6 = (List) map14.get(num3);
                                if (list6 != null) {
                                    Collections.sort(list6);
                                    for (Long l8 : list6) {
                                        R2.v(l8.longValue());
                                        map14 = map14;
                                        r0Var51 = r0Var51;
                                    }
                                }
                                arrayList4.add((e61) ((l91) R2.G0()));
                                it = it;
                                map14 = map14;
                                r0Var51 = r0Var51;
                            }
                            it2 = it;
                            r0Var = r0Var51;
                            list3 = arrayList4;
                        }
                        if (F2 && aVar.z()) {
                            List<e61> d0 = aVar.B().d0();
                            if (!d0.isEmpty()) {
                                ArrayList arrayList5 = new ArrayList(list3);
                                r0 r0Var52 = new r0();
                                for (e61 e61 : d0) {
                                    if (e61.M() && e61.O() > 0) {
                                        r0Var52.put(Integer.valueOf(e61.C()), Long.valueOf(e61.J(e61.O() - 1)));
                                    }
                                }
                                for (int i5 = 0; i5 < arrayList5.size(); i5++) {
                                    e61 e612 = (e61) arrayList5.get(i5);
                                    Long l9 = (Long) r0Var52.remove(e612.M() ? Integer.valueOf(e612.C()) : null);
                                    if (l9 != null) {
                                        ArrayList arrayList6 = new ArrayList();
                                        if (l9.longValue() < e612.J(0)) {
                                            arrayList6.add(l9);
                                        }
                                        arrayList6.addAll(e612.N());
                                        e61.a aVar3 = (e61.a) e612.y();
                                        aVar3.w();
                                        aVar3.x(arrayList6);
                                        arrayList5.set(i5, (e61) ((l91) aVar3.G0()));
                                    }
                                }
                                for (Integer num4 : r0Var52.keySet()) {
                                    e61.a R3 = e61.R();
                                    R3.u(num4.intValue());
                                    R3.v(((Long) r0Var52.get(num4)).longValue());
                                    arrayList5.add((e61) ((l91) R3.G0()));
                                    hashSet5 = hashSet5;
                                }
                                hashSet = hashSet5;
                                list4 = arrayList5;
                                g03.z(list4);
                            }
                        }
                        hashSet = hashSet5;
                        list4 = list3;
                        g03.z(list4);
                    } else {
                        it2 = it;
                        r0Var = r0Var51;
                        hashSet = hashSet5;
                        r0Var2 = r0Var48;
                        r0Var3 = r0Var49;
                    }
                    aVar.u(g03);
                    r0Var42.put(Integer.valueOf(intValue5), (v51) ((l91) aVar.G0()));
                    arrayList3.add((v51) ((l91) aVar.G0()));
                    n9 p4 = p();
                    d61 y4 = aVar.y();
                    p4.t();
                    p4.j();
                    u.g(str);
                    u.k(y4);
                    byte[] h2 = y4.h();
                    ContentValues contentValues2 = new ContentValues();
                    contentValues2.put(z, str);
                    contentValues2.put(D, Integer.valueOf(intValue5));
                    contentValues2.put(d, h2);
                    try {
                        try {
                            if (p4.x().insertWithOnConflict(C, null, contentValues2, 5) == -1) {
                                p4.e().E().a(n, k3.B(str));
                            }
                        } catch (SQLiteException e7) {
                            e2 = e7;
                            p4.e().E().b(p, k3.B(str), e2);
                            it = it2;
                            r0Var49 = r0Var3;
                            r0Var48 = r0Var2;
                            r0Var50 = r0Var;
                            hashSet5 = hashSet;
                        }
                    } catch (SQLiteException e8) {
                        e2 = e8;
                        p4.e().E().b(p, k3.B(str), e2);
                        it = it2;
                        r0Var49 = r0Var3;
                        r0Var48 = r0Var2;
                        r0Var50 = r0Var;
                        hashSet5 = hashSet;
                    }
                    it = it2;
                    r0Var49 = r0Var3;
                    r0Var48 = r0Var2;
                    r0Var50 = r0Var;
                    hashSet5 = hashSet;
                }
            }
            return arrayList3;
        }
        l2 = null;
        p2 = p();
        p2.t();
        p2.j();
        u.g(str);
        ContentValues contentValues3 = new ContentValues();
        contentValues3.put(F, (Integer) 0);
        try {
            p2.x().update(L, contentValues3, l, new String[]{str15});
        } catch (SQLiteException e9) {
            p2.e().E().b(E, k3.B(str), e9);
        }
        Z = p().Z(str15);
        HashSet hashSet62 = new HashSet(Z.keySet());
        if (F3) {
        }
        map8 = Z;
        it6 = hashSet62.iterator();
        while (it6.hasNext()) {
        }
        r0 r0Var352 = r0Var32;
        r0 r0Var362 = r0Var33;
        r0 r0Var372 = r0Var31;
        isEmpty = list.isEmpty();
        String str162 = H;
        String str172 = j;
        String str182 = B;
        if (!isEmpty) {
        }
        String str232 = str15;
        r0 r0Var422 = r0Var30;
        String str242 = str162;
        r0 r0Var432 = r0Var352;
        r0 r0Var442 = r0Var362;
        r0 r0Var452 = r0Var34;
        String str252 = str172;
        if (!list2.isEmpty()) {
        }
        r0 r0Var482 = r0Var452;
        r0 r0Var492 = r0Var442;
        r0 r0Var502 = r0Var432;
        ArrayList arrayList32 = new ArrayList();
        it = r0Var372.keySet().iterator();
        while (it.hasNext()) {
        }
        return arrayList32;
    }

    @Override // com.google.android.gms.measurement.internal.n8
    public final boolean u() {
        return false;
    }
}
