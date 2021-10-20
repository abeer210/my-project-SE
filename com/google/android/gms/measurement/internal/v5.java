package com.google.android.gms.measurement.internal;

import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.common.api.internal.h;
import com.google.android.gms.common.internal.u;
import com.google.android.gms.common.util.f;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicReference;
import vigqyno.C0201;

public final class v5 extends f5 {
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
    public static final String N = null;
    public static final String O = null;
    public static final String P = null;
    public static final String Q = null;
    public static final String R = null;
    public static final String S = null;
    public static final String T = null;
    public static final String U = null;
    public static final String V = null;
    public static final String W = null;
    public static final String X = null;
    public static final String Y = null;
    public static final String Z = null;
    public static final String aa = null;
    public static final String ab = null;
    public static final String ac = null;
    public static final String ad = null;
    public static final String ae = null;
    public static final String af = null;
    public static final String ag = null;
    public static final String ah = null;
    public static final String ai = null;
    public static final String aj = null;
    public static final String ak = null;
    public static final String al = null;
    public static final String am = null;
    public static final String an = null;
    public static final String ao = null;
    public static final String ap = null;
    public static final String aq = null;
    public static final String ar = null;
    public static final String as = null;
    public static final String at = null;
    public static final String au = null;
    public static final String av = null;
    public static final String aw = null;
    public static final String ax = null;
    public static final String ay = null;
    public static final String b = null;
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
    public o6 c;
    private q5 d;
    private final Set<t5> e = new CopyOnWriteArraySet();
    private boolean f;
    private final AtomicReference<String> g = new AtomicReference<>();
    public boolean h = true;

    static {
        C0201.m83(v5.class, 93);
    }

    public v5(o4 o4Var) {
        super(o4Var);
    }

    private final void Q(Bundle bundle, long j2) {
        u.k(bundle);
        m5.a(bundle, C0201.m82(30099), String.class, null);
        String r2 = C0201.m82(30100);
        m5.a(bundle, r2, String.class, null);
        String r4 = C0201.m82(30101);
        m5.a(bundle, r4, String.class, null);
        String r6 = C0201.m82(30102);
        m5.a(bundle, r6, Object.class, null);
        String r5 = C0201.m82(30103);
        m5.a(bundle, r5, String.class, null);
        String r8 = C0201.m82(30104);
        m5.a(bundle, r8, Long.class, 0L);
        m5.a(bundle, C0201.m82(30105), String.class, null);
        m5.a(bundle, C0201.m82(30106), Bundle.class, null);
        m5.a(bundle, C0201.m82(30107), String.class, null);
        m5.a(bundle, C0201.m82(30108), Bundle.class, null);
        String r9 = C0201.m82(30109);
        m5.a(bundle, r9, Long.class, 0L);
        m5.a(bundle, C0201.m82(30110), String.class, null);
        m5.a(bundle, C0201.m82(30111), Bundle.class, null);
        u.g(bundle.getString(r4));
        u.g(bundle.getString(r2));
        u.k(bundle.get(r6));
        bundle.putLong(C0201.m82(30112), j2);
        String string = bundle.getString(r4);
        Object obj = bundle.get(r6);
        if (m().a0(string) != 0) {
            e().E().a(C0201.m82(30113), l().x(string));
        } else if (m().g0(string, obj) != 0) {
            e().E().b(C0201.m82(30114), l().x(string), obj);
        } else {
            Object n0 = m().n0(string, obj);
            if (n0 == null) {
                e().E().b(C0201.m82(30115), l().x(string), obj);
                return;
            }
            m5.b(bundle, n0);
            long j3 = bundle.getLong(r8);
            if (TextUtils.isEmpty(bundle.getString(r5)) || (j3 <= 15552000000L && j3 >= 1)) {
                long j4 = bundle.getLong(r9);
                if (j4 > 15552000000L || j4 < 1) {
                    e().E().b(C0201.m82(30117), l().x(string), Long.valueOf(j4));
                    return;
                }
                c().y(new b6(this, bundle));
                return;
            }
            e().E().b(C0201.m82(30116), l().x(string), Long.valueOf(j3));
        }
    }

    /* access modifiers changed from: private */
    public final void Y(String str, String str2, long j2, Bundle bundle, boolean z2, boolean z3, boolean z4, String str3) {
        String str4;
        long j3;
        long j4;
        String str5;
        String str6;
        String str7;
        String str8;
        int i2;
        int i3;
        int i4;
        w6 w6Var;
        ArrayList arrayList;
        Bundle bundle2;
        long j5;
        Class<?> cls;
        List<String> F2;
        String str9 = n;
        u.g(str);
        if (!g().G(str3, l.p0)) {
            u.g(str2);
        }
        u.k(bundle);
        j();
        x();
        if (!this.a.d()) {
            e().L().d(X);
        } else if (!g().G(q().C(), l.w0) || (F2 = q().F()) == null || F2.contains(str2)) {
            int i5 = 0;
            if (!this.f) {
                this.f = true;
                try {
                    if (!this.a.D()) {
                        cls = Class.forName(str9, true, getContext().getClassLoader());
                    } else {
                        cls = Class.forName(str9);
                    }
                    try {
                        cls.getDeclaredMethod(ax, Context.class).invoke(null, getContext());
                    } catch (Exception e2) {
                        e().H().a(o, e2);
                    }
                } catch (ClassNotFoundException unused) {
                    e().K().d(G);
                }
            }
            if (g().G(q().C(), l.D0) && Z.equals(str2)) {
                String str10 = ac;
                if (bundle.containsKey(str10)) {
                    c0(U, af, bundle.getString(str10), b().a());
                }
            }
            if (z4) {
                a();
                if (!x.equals(str2)) {
                    y8 T2 = this.a.T();
                    String str11 = V;
                    int i6 = 2;
                    if (T2.w0(str11, str2)) {
                        if (!T2.O(str11, p5.a, str2)) {
                            i6 = 13;
                        } else if (T2.L(str11, 40, str2)) {
                            i6 = 0;
                        }
                    }
                    if (i6 != 0) {
                        e().G().a(s, l().v(str2));
                        this.a.T();
                        this.a.T().A(i6, ay, y8.y(str2, 40, true), str2 != null ? str2.length() : 0);
                        return;
                    }
                }
            }
            a();
            w6 O2 = s().O();
            String str12 = i;
            if (O2 != null && !bundle.containsKey(str12)) {
                O2.d = true;
            }
            v6.K(O2, bundle, z2 && z4);
            boolean equals = t.equals(str);
            boolean e0 = y8.e0(str2);
            if (z2 && this.d != null && !e0 && !equals) {
                e().L().b(y, l().v(str2), l().A(bundle));
                this.d.a(str, str2, bundle, j2);
            } else if (this.a.H()) {
                int Z2 = m().Z(str2);
                if (Z2 != 0) {
                    e().G().a(Q, l().v(str2));
                    m();
                    String y2 = y8.y(str2, 40, true);
                    if (str2 != null) {
                        i5 = str2.length();
                    }
                    this.a.T().I(str3, Z2, S, y2, i5);
                    return;
                }
                String str13 = ap;
                String str14 = z;
                String str15 = at;
                List<String> c2 = f.c(str13, str14, str12, str15);
                String str16 = str2;
                Bundle v2 = m().v(str3, str2, bundle, c2, z4, true);
                w6 w6Var2 = (v2 == null || !v2.containsKey(str12) || !v2.containsKey(str15)) ? null : new w6(v2.getString(str14), v2.getString(str12), Long.valueOf(v2.getLong(str15)).longValue());
                w6 w6Var3 = w6Var2 == null ? O2 : w6Var2;
                boolean Y2 = g().Y(str3);
                String str17 = al;
                if (Y2) {
                    a();
                    if (s().O() != null && str17.equals(str16)) {
                        long M2 = u().M();
                        if (M2 > 0) {
                            m().R(v2, M2);
                        }
                    }
                }
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(v2);
                long nextLong = m().t0().nextLong();
                if (!g().G(q().C(), l.d0) || f().v.a() <= 0) {
                    j4 = nextLong;
                    str4 = str17;
                    j3 = j2;
                } else if (!f().L(j2) || !f().y.a()) {
                    j4 = nextLong;
                    str4 = str17;
                    j3 = j2;
                } else {
                    e().M().d(ab);
                    if (g().G(q().C(), l.Z)) {
                        str4 = str17;
                        j3 = j2;
                        j4 = nextLong;
                        c0(ao, am, null, b().a());
                    } else {
                        j4 = nextLong;
                        str4 = str17;
                        j3 = j2;
                    }
                    if (g().G(q().C(), l.a0)) {
                        c0(r, av, null, b().a());
                    }
                }
                if (g().X(q().C()) && v2.getLong(N, 0) == 1) {
                    e().M().d(H);
                    this.a.Q().B(j3, true);
                }
                String[] strArr = (String[]) v2.keySet().toArray(new String[bundle.size()]);
                Arrays.sort(strArr);
                int length = strArr.length;
                int i7 = 0;
                int i8 = 0;
                while (true) {
                    str5 = R;
                    if (i7 >= length) {
                        break;
                    }
                    String str18 = strArr[i7];
                    Object obj = v2.get(str18);
                    m();
                    Bundle[] X2 = y8.X(obj);
                    if (X2 != null) {
                        i4 = length;
                        v2.putInt(str18, X2.length);
                        long j6 = j4;
                        int i9 = 0;
                        while (i9 < X2.length) {
                            Bundle bundle3 = X2[i9];
                            v6.K(w6Var3, bundle3, true);
                            Bundle v3 = m().v(str3, l, bundle3, c2, z4, false);
                            v3.putString(Y, str16);
                            v3.putLong(str5, j6);
                            v3.putString(aq, str18);
                            v3.putInt(A, X2.length);
                            v3.putInt(W, i9);
                            arrayList2.add(v3);
                            i9++;
                            j6 = j6;
                            v2 = v2;
                            arrayList2 = arrayList2;
                            w6Var3 = w6Var3;
                            i7 = i7;
                            i8 = i8;
                            str4 = str4;
                        }
                        str8 = str4;
                        i3 = i7;
                        arrayList = arrayList2;
                        w6Var = w6Var3;
                        bundle2 = v2;
                        j5 = j6;
                        i2 = i8 + X2.length;
                    } else {
                        str8 = str4;
                        i4 = length;
                        i3 = i7;
                        i2 = i8;
                        j5 = j4;
                        arrayList = arrayList2;
                        w6Var = w6Var3;
                        bundle2 = v2;
                    }
                    v2 = bundle2;
                    arrayList2 = arrayList;
                    w6Var3 = w6Var;
                    length = i4;
                    str4 = str8;
                    j4 = j5;
                    i8 = i2;
                    i7 = i3 + 1;
                    strArr = strArr;
                }
                if (i8 != 0) {
                    v2.putLong(str5, j4);
                    v2.putInt(F, i8);
                }
                int i10 = 0;
                while (i10 < arrayList2.size()) {
                    Bundle bundle4 = (Bundle) arrayList2.get(i10);
                    if (i10 != 0) {
                        str7 = w;
                        str6 = str16;
                    } else {
                        str7 = str16;
                        str6 = str7;
                    }
                    bundle4.putString(str13, str);
                    if (z3) {
                        bundle4 = m().q0(bundle4);
                    }
                    e().L().b(aa, l().v(str6), l().A(bundle4));
                    r().U(new j(str7, new i(bundle4), str, j2), str3);
                    if (!equals) {
                        for (t5 t5Var : this.e) {
                            t5Var.b(str, str2, new Bundle(bundle4), j2);
                        }
                    }
                    i10++;
                    str16 = str6;
                }
                a();
                if (s().O() != null && str4.equals(str16)) {
                    u().E(true, true);
                }
            }
        } else {
            e().L().b(L, str2, str);
        }
    }

    private final void Z(String str, String str2, long j2, Object obj) {
        c().y(new w5(this, str, str2, obj, j2));
    }

    private final void e0(String str, String str2, String str3, Bundle bundle) {
        long a = b().a();
        u.g(str2);
        Bundle bundle2 = new Bundle();
        if (str != null) {
            bundle2.putString(C0201.m82(30118), str);
        }
        bundle2.putString(C0201.m82(30119), str2);
        bundle2.putLong(C0201.m82(30120), a);
        if (str3 != null) {
            bundle2.putString(C0201.m82(30121), str3);
            bundle2.putBundle(C0201.m82(30122), bundle);
        }
        c().y(new a6(this, bundle2));
    }

    private final Map<String, Object> g0(String str, String str2, String str3, boolean z2) {
        if (c().G()) {
            e().E().d(j);
            return Collections.emptyMap();
        } else if (h9.a()) {
            e().E().d(K);
            return Collections.emptyMap();
        } else {
            AtomicReference atomicReference = new AtomicReference();
            synchronized (atomicReference) {
                this.a.c().y(new g6(this, atomicReference, str, str2, str3, z2));
                try {
                    atomicReference.wait(5000);
                } catch (InterruptedException e2) {
                    e().H().a(J, e2);
                }
            }
            List<t8> list = (List) atomicReference.get();
            if (list == null) {
                e().H().d(E);
                return Collections.emptyMap();
            }
            r0 r0Var = new r0(list.size());
            for (t8 t8Var : list) {
                r0Var.put(t8Var.b, t8Var.o());
            }
            return r0Var;
        }
    }

    private final void j0(String str, String str2, long j2, Bundle bundle, boolean z2, boolean z3, boolean z4, String str3) {
        c().y(new x5(this, str, str2, j2, y8.r0(bundle), z2, z3, z4, str3));
    }

    private final ArrayList<Bundle> o0(String str, String str2, String str3) {
        if (c().G()) {
            e().E().d(C0201.m82(30123));
            return new ArrayList<>(0);
        } else if (h9.a()) {
            e().E().d(C0201.m82(30124));
            return new ArrayList<>(0);
        } else {
            AtomicReference atomicReference = new AtomicReference();
            synchronized (atomicReference) {
                this.a.c().y(new d6(this, atomicReference, str, str2, str3));
                try {
                    atomicReference.wait(5000);
                } catch (InterruptedException e2) {
                    e().H().b(C0201.m82(30125), str, e2);
                }
            }
            List list = (List) atomicReference.get();
            if (list != null) {
                return y8.o0(list);
            }
            e().H().a(C0201.m82(30126), str);
            return new ArrayList<>();
        }
    }

    /* access modifiers changed from: private */
    public final void p0(Bundle bundle) {
        String str = aw;
        j();
        x();
        u.k(bundle);
        String str2 = P;
        u.g(bundle.getString(str2));
        String str3 = au;
        u.g(bundle.getString(str3));
        String str4 = ah;
        u.k(bundle.get(str4));
        if (!this.a.d()) {
            e().L().d(T);
            return;
        }
        t8 t8Var = new t8(bundle.getString(str2), bundle.getLong(ai), bundle.get(str4), bundle.getString(str3));
        try {
            j w2 = m().w(bundle.getString(str), bundle.getString(q), bundle.getBundle(k), bundle.getString(str3), 0, true, false);
            r().X(new g9(bundle.getString(str), bundle.getString(str3), t8Var, bundle.getLong(I), false, bundle.getString(ad), m().w(bundle.getString(str), bundle.getString(ae), bundle.getBundle(ag), bundle.getString(str3), 0, true, false), bundle.getLong(m), w2, bundle.getLong(b), m().w(bundle.getString(str), bundle.getString(C), bundle.getBundle(D), bundle.getString(str3), 0, true, false)));
        } catch (IllegalArgumentException unused) {
        }
    }

    /* access modifiers changed from: private */
    public final void q0(Bundle bundle) {
        String str = an;
        String str2 = M;
        String str3 = aj;
        j();
        x();
        u.k(bundle);
        String str4 = v;
        u.g(bundle.getString(str4));
        if (!this.a.d()) {
            e().L().d(O);
            return;
        }
        try {
            r().X(new g9(bundle.getString(str3), bundle.getString(str2), new t8(bundle.getString(str4), 0, null, null), bundle.getLong(str), bundle.getBoolean(u), bundle.getString(as), null, bundle.getLong(ar), null, bundle.getLong(ak), m().w(bundle.getString(str3), bundle.getString(p), bundle.getBundle(B), bundle.getString(str2), bundle.getLong(str), true, false)));
        } catch (IllegalArgumentException unused) {
        }
    }

    /* access modifiers changed from: private */
    public final void r0(boolean z2) {
        j();
        h();
        x();
        e().L().a(C0201.m82(30127), Boolean.valueOf(z2));
        f().t(z2);
        z0();
    }

    /* access modifiers changed from: private */
    public final void z0() {
        if (g().G(q().C(), l.k0)) {
            j();
            String b2 = f().s.b();
            if (b2 != null) {
                if (C0201.m82(30128).equals(b2)) {
                    c0(C0201.m82(30129), C0201.m82(30130), null, b().a());
                } else {
                    c0(C0201.m82(30132), C0201.m82(30133), Long.valueOf(C0201.m82(30131).equals(b2) ? 1 : 0), b().a());
                }
            }
        }
        if (!this.a.d() || !this.h) {
            e().L().d(C0201.m82(30135));
            r().c0();
            return;
        }
        e().L().d(C0201.m82(30134));
        A0();
    }

    public final void A0() {
        j();
        h();
        x();
        if (this.a.H()) {
            r().b0();
            this.h = false;
            String I2 = f().I();
            if (!TextUtils.isEmpty(I2)) {
                k().p();
                if (!I2.equals(Build.VERSION.RELEASE)) {
                    Bundle bundle = new Bundle();
                    bundle.putString(C0201.m82(30136), I2);
                    I(C0201.m82(30137), C0201.m82(30138), bundle);
                }
            }
        }
    }

    public final void B(String str, String str2, Bundle bundle) {
        h();
        e0(null, str, str2, bundle);
    }

    public final ArrayList<Bundle> B0(String str, String str2) {
        h();
        return o0(null, str, str2);
    }

    public final void C(String str, String str2, String str3, Bundle bundle) {
        u.g(str);
        n();
        throw null;
    }

    public final String D() {
        w6 P2 = this.a.O().P();
        if (P2 != null) {
            return P2.b;
        }
        return null;
    }

    public final String E() {
        w6 P2 = this.a.O().P();
        if (P2 != null) {
            return P2.a;
        }
        return null;
    }

    public final String F() {
        if (this.a.A() != null) {
            return this.a.A();
        }
        try {
            return h.b();
        } catch (IllegalStateException e2) {
            this.a.e().E().a(C0201.m82(30139), e2);
            return null;
        }
    }

    public final Map<String, Object> G(String str, String str2, boolean z2) {
        h();
        return g0(null, str, str2, z2);
    }

    public final Map<String, Object> H(String str, String str2, String str3, boolean z2) {
        u.g(str);
        n();
        throw null;
    }

    public final void I(String str, String str2, Bundle bundle) {
        J(str, str2, bundle, true, true, b().a());
    }

    public final void J(String str, String str2, Bundle bundle, boolean z2, boolean z3, long j2) {
        h();
        j0(str == null ? C0201.m82(30140) : str, str2, j2, bundle == null ? new Bundle() : bundle, z3, !z3 || this.d == null || y8.e0(str2), !z2, null);
    }

    public final void K(long j2) {
        l0(null);
        c().y(new z5(this, j2));
    }

    public final void L(Bundle bundle) {
        M(bundle, b().a());
    }

    public final void M(Bundle bundle, long j2) {
        u.k(bundle);
        h();
        Bundle bundle2 = new Bundle(bundle);
        String r4 = C0201.m82(30141);
        if (!TextUtils.isEmpty(bundle2.getString(r4))) {
            e().H().d(C0201.m82(30142));
        }
        bundle2.remove(r4);
        Q(bundle2, j2);
    }

    public final void N(boolean z2) {
        x();
        h();
        c().y(new k6(this, z2));
    }

    public final void O(long j2) {
        h();
        c().y(new m6(this, j2));
    }

    public final void P(long j2) {
        h();
        c().y(new l6(this, j2));
    }

    public final void R(q5 q5Var) {
        q5 q5Var2;
        j();
        h();
        x();
        if (!(q5Var == null || q5Var == (q5Var2 = this.d))) {
            u.o(q5Var2 == null, C0201.m82(30143));
        }
        this.d = q5Var;
    }

    public final void S(t5 t5Var) {
        h();
        x();
        u.k(t5Var);
        if (!this.e.add(t5Var)) {
            e().H().d(C0201.m82(30144));
        }
    }

    public final void X(String str, String str2, long j2, Bundle bundle) {
        h();
        j();
        Y(str, str2, j2, bundle, true, this.d == null || y8.e0(str2), false, null);
    }

    public final void a0(String str, String str2, Bundle bundle) {
        h();
        j();
        X(str, str2, b().a(), bundle);
    }

    public final void b0(String str, String str2, Bundle bundle, boolean z2) {
        J(str, str2, bundle, false, true, b().a());
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x009a  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00ad  */
    public final void c0(String str, String str2, Object obj, long j2) {
        Long l2;
        String str3;
        u.g(str);
        u.g(str2);
        j();
        h();
        x();
        boolean G2 = g().G(q().C(), l.k0);
        String r1 = C0201.m82(30145);
        if (G2 && C0201.m82(30146).equals(str2)) {
            if (obj instanceof String) {
                String str4 = (String) obj;
                if (!TextUtils.isEmpty(str4)) {
                    String lowerCase = str4.toLowerCase(Locale.ENGLISH);
                    String r11 = C0201.m82(30147);
                    Long valueOf = Long.valueOf(r11.equals(lowerCase) ? 1 : 0);
                    a4 a4Var = f().s;
                    if (valueOf.longValue() == 1) {
                        r11 = C0201.m82(30148);
                    }
                    a4Var.a(r11);
                    l2 = valueOf;
                    str3 = r1;
                    if (!this.a.d()) {
                        e().L().d(C0201.m82(30150));
                        return;
                    } else if (this.a.H()) {
                        e().L().b(C0201.m82(30151), l().v(str3), l2);
                        r().T(new t8(str3, j2, l2, str));
                        return;
                    } else {
                        return;
                    }
                }
            }
            if (obj == null) {
                f().s.a(C0201.m82(30149));
                l2 = obj;
                str3 = r1;
                if (!this.a.d()) {
                }
            }
        }
        str3 = str2;
        l2 = obj;
        if (!this.a.d()) {
        }
    }

    public final void d0(String str, String str2, Object obj, boolean z2, long j2) {
        if (str == null) {
            str = C0201.m82(30152);
        }
        int i2 = 6;
        int i3 = 0;
        if (z2) {
            i2 = m().a0(str2);
        } else {
            y8 m2 = m();
            String r3 = C0201.m82(30153);
            if (m2.w0(r3, str2)) {
                if (!m2.O(r3, r5.a, str2)) {
                    i2 = 15;
                } else if (m2.L(r3, 24, str2)) {
                    i2 = 0;
                }
            }
        }
        String r10 = C0201.m82(30154);
        if (i2 != 0) {
            m();
            String y2 = y8.y(str2, 24, true);
            if (str2 != null) {
                i3 = str2.length();
            }
            this.a.T().A(i2, r10, y2, i3);
        } else if (obj != null) {
            int g0 = m().g0(str2, obj);
            if (g0 != 0) {
                m();
                String y3 = y8.y(str2, 24, true);
                if ((obj instanceof String) || (obj instanceof CharSequence)) {
                    i3 = String.valueOf(obj).length();
                }
                this.a.T().A(g0, r10, y3, i3);
                return;
            }
            Object n0 = m().n0(str2, obj);
            if (n0 != null) {
                Z(str, str2, j2, n0);
            }
        } else {
            Z(str, str2, j2, null);
        }
    }

    public final void f0(boolean z2) {
        x();
        h();
        c().y(new j6(this, z2));
    }

    public final void h0(t5 t5Var) {
        h();
        x();
        u.k(t5Var);
        if (!this.e.remove(t5Var)) {
            e().H().d(C0201.m82(30155));
        }
    }

    public final void k0(String str, String str2, Object obj, boolean z2) {
        d0(str, str2, obj, z2, b().a());
    }

    public final void l0(String str) {
        this.g.set(str);
    }

    public final ArrayList<Bundle> m0(String str, String str2, String str3) {
        u.g(str);
        n();
        throw null;
    }

    public final void n0(Bundle bundle) {
        u.k(bundle);
        u.g(bundle.getString(C0201.m82(30156)));
        n();
        throw null;
    }

    public final String s0() {
        h();
        return this.g.get();
    }

    public final void t0() {
        if (getContext().getApplicationContext() instanceof Application) {
            ((Application) getContext().getApplicationContext()).unregisterActivityLifecycleCallbacks(this.c);
        }
    }

    public final Boolean u0() {
        AtomicReference atomicReference = new AtomicReference();
        return (Boolean) c().u(atomicReference, 15000, C0201.m82(30157), new u5(this, atomicReference));
    }

    public final String v0() {
        AtomicReference atomicReference = new AtomicReference();
        return (String) c().u(atomicReference, 15000, C0201.m82(30158), new c6(this, atomicReference));
    }

    public final Long w0() {
        AtomicReference atomicReference = new AtomicReference();
        return (Long) c().u(atomicReference, 15000, C0201.m82(30159), new f6(this, atomicReference));
    }

    public final Integer x0() {
        AtomicReference atomicReference = new AtomicReference();
        return (Integer) c().u(atomicReference, 15000, C0201.m82(30160), new i6(this, atomicReference));
    }

    public final Double y0() {
        AtomicReference atomicReference = new AtomicReference();
        return (Double) c().u(atomicReference, 15000, C0201.m82(30161), new h6(this, atomicReference));
    }

    @Override // com.google.android.gms.measurement.internal.f5
    public final boolean z() {
        return false;
    }
}
