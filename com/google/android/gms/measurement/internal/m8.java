package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.common.internal.u;
import com.google.android.gms.common.util.e;
import defpackage.a61;
import defpackage.b61;
import defpackage.f61;
import defpackage.l91;
import defpackage.x51;
import defpackage.z51;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.nio.channels.OverlappingFileLockException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import vigqyno.C0188;
import vigqyno.C0201;

public class m8 implements n5 {
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
    public static final String aA = null;
    public static final String aB = null;
    public static final String aC = null;
    public static final String aD = null;
    public static final String aE = null;
    public static final String aF = null;
    public static final String aG = null;
    public static final String aH = null;
    public static final String aI = null;
    public static final String aJ = null;
    public static final String aK = null;
    public static final String aL = null;
    public static final String aM = null;
    public static final String aN = null;
    public static final String aO = null;
    public static final String aP = null;
    public static final String aQ = null;
    public static final String aR = null;
    public static final String aS = null;
    public static final String aT = null;
    public static final String aU = null;
    public static final String aV = null;
    public static final String aW = null;
    public static final String aX = null;
    public static final String aY = null;
    public static final String aZ = null;
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
    public static final String az = null;
    public static final String bA = null;
    public static final String ba = null;
    public static final String bb = null;
    public static final String bc = null;
    public static final String bd = null;
    public static final String be = null;
    public static final String bf = null;
    public static final String bg = null;
    public static final String bh = null;
    public static final String bi = null;
    public static final String bj = null;
    public static final String bk = null;
    public static final String bl = null;
    public static final String bm = null;
    public static final String bn = null;
    public static final String bo = null;
    public static final String bp = null;
    public static final String bq = null;
    public static final String br = null;
    public static final String bs = null;
    public static final String bt = null;
    public static final String bu = null;
    public static final String bv = null;
    public static final String bw = null;
    public static final String bx = null;
    public static final String by = null;
    public static final String bz = null;
    public static final String cA = null;
    public static final String ca = null;
    public static final String cb = null;
    public static final String cc = null;
    public static final String cd = null;
    public static final String ce = null;
    public static final String cf = null;
    public static final String cg = null;
    public static final String ch = null;
    public static final String ci = null;
    public static final String cj = null;
    public static final String ck = null;

    /* renamed from: cl  reason: collision with root package name */
    public static final String f49cl = null;
    public static final String cm = null;
    public static final String cn = null;
    public static final String co = null;
    public static final String cp = null;
    public static final String cq = null;
    public static final String cr = null;
    public static final String cs = null;
    public static final String ct = null;
    public static final String cu = null;
    public static final String cv = null;
    public static final String cw = null;
    public static final String cx = null;
    public static final String cy = null;
    public static final String cz = null;
    public static final String dA = null;
    public static final String da = null;
    public static final String db = null;
    public static final String dc = null;
    public static final String dd = null;
    public static final String de = null;
    public static final String df = null;
    public static final String dg = null;
    public static final String dh = null;
    public static final String di = null;
    public static final String dj = null;
    public static final String dk = null;
    public static final String dl = null;
    public static final String dm = null;
    public static final String dn = null;

    /* renamed from: do  reason: not valid java name */
    public static final String f0do = null;
    public static final String dp = null;
    public static final String dq = null;
    public static final String dr = null;
    public static final String ds = null;
    public static final String dt = null;
    public static final String du = null;
    public static final String dv = null;
    public static final String dw = null;
    public static final String dx = null;
    public static final String dy = null;
    public static final String dz = null;
    public static final String eA = null;
    public static final String ea = null;
    public static final String eb = null;
    public static final String ec = null;
    public static final String ed = null;
    public static final String ee = null;
    public static final String ef = null;
    public static final String eg = null;
    public static final String eh = null;
    public static final String ei = null;
    public static final String ej = null;
    public static final String ek = null;
    public static final String el = null;
    public static final String em = null;
    public static final String en = null;
    public static final String eo = null;
    public static final String ep = null;
    public static final String eq = null;
    public static final String er = null;
    public static final String es = null;
    public static final String et = null;
    public static final String eu = null;
    public static final String ev = null;
    public static final String ew = null;
    public static final String ex = null;
    public static final String ey = null;
    public static final String ez = null;
    public static final String fa = null;
    public static final String fb = null;
    public static final String fc = null;
    public static final String fd = null;
    public static final String fe = null;
    public static final String ff = null;
    public static final String fg = null;
    public static final String fh = null;
    public static final String fi = null;
    public static final String fj = null;
    public static final String fk = null;
    public static final String fl = null;
    private static volatile m8 y;
    public static final String z = null;
    private j4 a;
    private o3 b;
    private n9 c;
    private r3 d;
    private i8 e;
    private f9 f;
    private final u8 g;
    private u6 h;
    private final o4 i;
    private boolean j;
    private boolean k;
    private boolean l;
    private long m;
    private List<Runnable> n;
    private int o;
    private int p;
    private boolean q;
    private boolean r;
    private boolean s;
    private FileLock t;
    private FileChannel u;
    private List<Long> v;
    private List<Long> w;
    private long x;

    /* access modifiers changed from: package-private */
    public class a implements p9 {
        public b61 a;
        public List<Long> b;
        public List<x51> c;
        private long d;

        private a(m8 m8Var) {
        }

        private static long c(x51 x51) {
            return ((x51.F() / 1000) / 60) / 60;
        }

        @Override // com.google.android.gms.measurement.internal.p9
        public final boolean a(long j, x51 x51) {
            u.k(x51);
            if (this.c == null) {
                this.c = new ArrayList();
            }
            if (this.b == null) {
                this.b = new ArrayList();
            }
            if (this.c.size() > 0 && c(this.c.get(0)) != c(x51)) {
                return false;
            }
            long a2 = this.d + ((long) x51.a());
            if (a2 >= ((long) Math.max(0, l.n.a(null).intValue()))) {
                return false;
            }
            this.d = a2;
            this.c.add(x51);
            this.b.add(Long.valueOf(j));
            if (this.c.size() >= Math.max(1, l.o.a(null).intValue())) {
                return false;
            }
            return true;
        }

        @Override // com.google.android.gms.measurement.internal.p9
        public final void b(b61 b61) {
            u.k(b61);
            this.a = b61;
        }

        public /* synthetic */ a(m8 m8Var, p8 p8Var) {
            this(m8Var);
        }
    }

    static {
        C0201.m83(m8.class, 38);
    }

    private m8(s8 s8Var) {
        this(s8Var, null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:214:0x0807, code lost:
        r11 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:219:0x0841, code lost:
        if (r10.e < ((long) r27.i.r().H(r4.a))) goto L_0x0807;
     */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x02a8  */
    private final void C(j jVar, d9 d9Var) {
        long j2;
        String str;
        f fVar;
        List<Integer> T2;
        v8 x0;
        boolean z2;
        long j3;
        v8 v8Var;
        f4 V2;
        String str2 = aY;
        u.k(d9Var);
        u.g(d9Var.a);
        long nanoTime = System.nanoTime();
        i0();
        W();
        String str3 = d9Var.a;
        if (M().S(jVar, d9Var)) {
            if (!d9Var.h) {
                L(d9Var);
                return;
            }
            boolean I2 = P().I(str3, jVar.a);
            String str4 = A;
            if (I2) {
                this.i.e().H().b(T, k3.B(str3), this.i.S().v(jVar.a));
                boolean z3 = P().G(str3) || P().H(str3);
                if (!z3 && !str4.equals(jVar.a)) {
                    this.i.T().I(str3, 11, bf, jVar.a, 0);
                }
                if (z3 && (V2 = O().V(str3)) != null) {
                    if (Math.abs(this.i.b().a() - Math.max(V2.w(), V2.v())) > l.E.a(null).longValue()) {
                        this.i.e().L().d(f0do);
                        s(V2);
                        return;
                    }
                    return;
                }
                return;
            }
            if (this.i.e().t(2)) {
                this.i.e().M().a(ey, this.i.S().z(jVar));
            }
            O().v();
            try {
                L(d9Var);
                boolean equals = ak.equals(jVar.a);
                String str5 = S;
                if (equals || str5.equals(jVar.a)) {
                    String r2 = jVar.b.r(X);
                    boolean equals2 = str5.equals(jVar.a);
                    String str6 = af;
                    if (equals2) {
                        double doubleValue = jVar.b.u(str6).doubleValue() * 1000000.0d;
                        if (doubleValue == 0.0d) {
                            double longValue = (double) jVar.b.p(str6).longValue();
                            Double.isNaN(longValue);
                            doubleValue = longValue * 1000000.0d;
                        }
                        if (doubleValue > 9.223372036854776E18d || doubleValue < -9.223372036854776E18d) {
                            this.i.e().H().b(df, k3.B(str3), Double.valueOf(doubleValue));
                            j2 = nanoTime;
                            z2 = false;
                            if (!z2) {
                                O().y();
                                O().w();
                                return;
                            }
                        } else {
                            j3 = Math.round(doubleValue);
                        }
                    } else {
                        j3 = jVar.b.p(str6).longValue();
                    }
                    if (!TextUtils.isEmpty(r2)) {
                        String upperCase = r2.toUpperCase(Locale.US);
                        if (upperCase.matches(eA)) {
                            String str7 = aZ;
                            String valueOf = String.valueOf(upperCase);
                            String concat = valueOf.length() != 0 ? str7.concat(valueOf) : new String(str7);
                            v8 x02 = O().x0(str3, concat);
                            if (x02 == null || !(x02.e instanceof Long)) {
                                j2 = nanoTime;
                                n9 O2 = O();
                                int r3 = this.i.r().r(str3, l.J) - 1;
                                u.g(str3);
                                O2.j();
                                O2.t();
                                try {
                                    O2.x().execSQL(E, new String[]{str3, str3, String.valueOf(r3)});
                                } catch (SQLiteException e2) {
                                    O2.e().E().b(ba, k3.B(str3), e2);
                                }
                                v8Var = new v8(str3, jVar.c, concat, this.i.b().a(), Long.valueOf(j3));
                            } else {
                                j2 = nanoTime;
                                v8Var = new v8(str3, jVar.c, concat, this.i.b().a(), Long.valueOf(((Long) x02.e).longValue() + j3));
                            }
                            if (!O().O(v8Var)) {
                                this.i.e().E().c(K, k3.B(str3), this.i.S().x(v8Var.c), v8Var.e);
                                this.i.T().I(str3, 9, null, null, 0);
                            }
                            z2 = true;
                            if (!z2) {
                            }
                        }
                    }
                    j2 = nanoTime;
                    z2 = true;
                    if (!z2) {
                    }
                } else {
                    j2 = nanoTime;
                }
                boolean Y2 = y8.Y(jVar.a);
                boolean equals3 = str4.equals(jVar.a);
                m9 E2 = O().E(X(), str3, true, Y2, false, equals3, false);
                long intValue = E2.b - ((long) l.p.a(null).intValue());
                if (intValue > 0) {
                    if (intValue % 1000 == 1) {
                        this.i.e().E().b(Y, k3.B(str3), Long.valueOf(E2.b));
                    }
                    O().y();
                    return;
                }
                if (Y2) {
                    long intValue2 = E2.a - ((long) l.r.a(null).intValue());
                    if (intValue2 > 0) {
                        if (intValue2 % 1000 == 1) {
                            this.i.e().E().b(ai, k3.B(str3), Long.valueOf(E2.a));
                        }
                        this.i.T().I(str3, 16, fk, jVar.a, 0);
                        O().y();
                        O().w();
                        return;
                    }
                }
                if (equals3) {
                    long max = E2.d - ((long) Math.max(0, Math.min(1000000, this.i.r().r(d9Var.a, l.q))));
                    if (max > 0) {
                        if (max == 1) {
                            this.i.e().E().b(aE, k3.B(str3), Long.valueOf(E2.d));
                        }
                        O().y();
                        O().w();
                        return;
                    }
                }
                Bundle w2 = jVar.b.w();
                this.i.T().B(w2, cb, jVar.c);
                boolean f0 = this.i.T().f0(str3);
                String str8 = au;
                if (f0) {
                    this.i.T().B(w2, aP, 1L);
                    this.i.T().B(w2, str8, 1L);
                }
                boolean equals4 = str2.equals(jVar.a);
                String str9 = fl;
                if (equals4 && this.i.r().V(d9Var.a) && (x0 = O().x0(d9Var.a, str9)) != null && (x0.e instanceof Long)) {
                    this.i.T().B(w2, str9, x0.e);
                }
                if (!str2.equals(jVar.a) || !this.i.r().G(d9Var.a, l.f0) || this.i.r().V(d9Var.a)) {
                    str = null;
                } else {
                    str = null;
                    A(new t8(str9, 0, null), d9Var);
                }
                long W2 = O().W(str3);
                if (W2 > 0) {
                    this.i.e().H().b(aQ, k3.B(str3), Long.valueOf(W2));
                }
                String str10 = str8;
                g gVar = new g(this.i, jVar.c, str3, jVar.a, jVar.d, 0, w2);
                f g0 = O().g0(str3, gVar.b);
                if (g0 != null) {
                    gVar = gVar.a(this.i, g0.f);
                    fVar = g0.c(gVar.d);
                } else if (O().a0(str3) < 500 || !Y2) {
                    fVar = new f(str3, gVar.b, 0, 0, gVar.d, 0, null, null, null, null);
                } else {
                    this.i.e().E().c(an, k3.B(str3), this.i.S().v(gVar.b), Integer.valueOf((int) C0188.f21));
                    this.i.T().I(str3, 8, null, null, 0);
                    O().w();
                    return;
                }
                O().J(fVar);
                i0();
                W();
                u.k(gVar);
                u.k(d9Var);
                u.g(gVar.a);
                u.a(gVar.a.equals(d9Var.a));
                b61.a D2 = b61.D2();
                D2.C0(1);
                D2.S(dq);
                if (!TextUtils.isEmpty(d9Var.a)) {
                    D2.X(d9Var.a);
                }
                if (!TextUtils.isEmpty(d9Var.d)) {
                    D2.W(d9Var.d);
                }
                if (!TextUtils.isEmpty(d9Var.c)) {
                    D2.Y(d9Var.c);
                }
                if (d9Var.j != -2147483648L) {
                    D2.K0((int) d9Var.j);
                }
                D2.K(d9Var.e);
                if (!TextUtils.isEmpty(d9Var.b)) {
                    D2.c0(d9Var.b);
                }
                if (this.i.r().p(l.s0)) {
                    if (TextUtils.isEmpty(D2.u()) && !TextUtils.isEmpty(d9Var.u)) {
                        D2.h0(d9Var.u);
                    }
                } else if (!TextUtils.isEmpty(d9Var.u)) {
                    D2.h0(d9Var.u);
                }
                if (d9Var.f != 0) {
                    D2.M(d9Var.f);
                }
                D2.P(d9Var.w);
                if (this.i.r().G(d9Var.a, l.n0) && (T2 = M().T()) != null) {
                    D2.i0(T2);
                }
                Pair<String, Boolean> v2 = this.i.q().v(d9Var.a);
                if (v2 == null || TextUtils.isEmpty((CharSequence) v2.first)) {
                    if (!this.i.R().y(this.i.getContext()) && d9Var.p) {
                        String string = Settings.Secure.getString(this.i.getContext().getContentResolver(), aO);
                        if (string == null) {
                            this.i.e().H().a(cp, k3.B(D2.C()));
                            string = ew;
                        } else if (string.isEmpty()) {
                            this.i.e().H().a(ae, k3.B(D2.C()));
                        }
                        D2.e0(string);
                    }
                } else if (d9Var.o) {
                    D2.Z((String) v2.first);
                    if (v2.second != null) {
                        D2.j0(((Boolean) v2.second).booleanValue());
                    }
                }
                this.i.R().p();
                D2.U(Build.MODEL);
                this.i.R().p();
                D2.T(Build.VERSION.RELEASE);
                D2.I0((int) this.i.R().t());
                D2.V(this.i.R().u());
                D2.O(d9Var.l);
                if (this.i.d() && i9.B()) {
                    D2.C();
                    if (!TextUtils.isEmpty(str)) {
                        D2.f0(str);
                    }
                }
                f4 V3 = O().V(d9Var.a);
                if (V3 == null) {
                    V3 = new f4(this.i, d9Var.a);
                    V3.g(this.i.T().v0());
                    V3.R(d9Var.k);
                    V3.D(d9Var.b);
                    V3.P(this.i.q().w(d9Var.a));
                    V3.a0(0);
                    V3.Q(0);
                    V3.S(0);
                    V3.T(d9Var.c);
                    V3.U(d9Var.j);
                    V3.V(d9Var.d);
                    V3.W(d9Var.e);
                    V3.Y(d9Var.f);
                    V3.e(d9Var.h);
                    V3.j0(d9Var.l);
                    V3.Z(d9Var.w);
                    O().K(V3);
                }
                if (!TextUtils.isEmpty(V3.a())) {
                    D2.a0(V3.a());
                }
                if (!TextUtils.isEmpty(V3.b())) {
                    D2.d0(V3.b());
                }
                List<v8> U2 = O().U(d9Var.a);
                for (int i2 = 0; i2 < U2.size(); i2++) {
                    f61.a c0 = f61.c0();
                    c0.x(U2.get(i2).c);
                    c0.u(U2.get(i2).d);
                    M().G(c0, U2.get(i2).e);
                    D2.y(c0);
                }
                try {
                    long z4 = O().z((b61) ((l91) D2.G0()));
                    n9 O3 = O();
                    if (gVar.f != null) {
                        Iterator<String> it = gVar.f.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                boolean J2 = P().J(gVar.a, gVar.b);
                                m9 E3 = O().E(X(), gVar.a, false, false, false, false, false);
                                if (J2) {
                                }
                            } else if (str10.equals(it.next())) {
                                break;
                            } else {
                                str10 = str10;
                            }
                        }
                    }
                    boolean z5 = false;
                    if (O3.N(gVar, z4, z5)) {
                        this.m = 0;
                    }
                } catch (IOException e3) {
                    this.i.e().E().b(ff, k3.B(D2.C()), e3);
                }
                O().y();
                if (this.i.e().t(2)) {
                    this.i.e().M().a(dc, this.i.S().t(gVar));
                }
                O().w();
                a0();
                this.i.e().M().a(bA, Long.valueOf(((System.nanoTime() - j2) + 500000) / 1000000));
            } finally {
                O().w();
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0044, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0045, code lost:
        r9 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0048, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0049, code lost:
        r8 = null;
        r9 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x009b, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x009c, code lost:
        r9 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:415:0x0c41, code lost:
        if (r5 != r16) goto L_0x0c43;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:417:0x0c45, code lost:
        r1 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:419:0x0c59, code lost:
        if (java.lang.Math.abs(r7.v() - r11.g) >= 86400000) goto L_0x0c43;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x0269  */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0044 A[ExcHandler: all (th java.lang.Throwable), PHI: r4 
      PHI: (r4v133 android.database.Cursor) = (r4v131 android.database.Cursor), (r4v131 android.database.Cursor), (r4v131 android.database.Cursor), (r4v131 android.database.Cursor), (r4v1 android.database.Cursor), (r4v1 android.database.Cursor) binds: [B:22:0x0080, B:23:?, B:28:0x0091, B:29:?, B:10:0x0035, B:11:?] A[DONT_GENERATE, DONT_INLINE], Splitter:B:10:0x0035] */
    /* JADX WARNING: Removed duplicated region for block: B:137:0x03aa  */
    /* JADX WARNING: Removed duplicated region for block: B:144:0x03b6  */
    /* JADX WARNING: Removed duplicated region for block: B:193:0x05bc  */
    /* JADX WARNING: Removed duplicated region for block: B:202:0x05e5  */
    /* JADX WARNING: Removed duplicated region for block: B:226:0x067d  */
    /* JADX WARNING: Removed duplicated region for block: B:252:0x0739  */
    /* JADX WARNING: Removed duplicated region for block: B:259:0x0754  */
    /* JADX WARNING: Removed duplicated region for block: B:260:0x076e  */
    /* JADX WARNING: Removed duplicated region for block: B:373:0x0aa0  */
    /* JADX WARNING: Removed duplicated region for block: B:374:0x0ab3  */
    /* JADX WARNING: Removed duplicated region for block: B:376:0x0ab6  */
    /* JADX WARNING: Removed duplicated region for block: B:377:0x0add  */
    /* JADX WARNING: Removed duplicated region for block: B:503:0x0ed2  */
    /* JADX WARNING: Removed duplicated region for block: B:508:0x0ee9  */
    /* JADX WARNING: Removed duplicated region for block: B:528:0x05e2 A[EDGE_INSN: B:528:0x05e2->B:200:0x05e2 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x0254  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x025b  */
    private final boolean F(String str, long j2) {
        Throwable th;
        Cursor cursor;
        Throwable th2;
        String str2;
        String str3;
        boolean z2;
        String str4;
        long j3;
        m8 m8Var;
        SecureRandom secureRandom;
        HashMap hashMap;
        int i2;
        boolean z3;
        int K2;
        long j4;
        HashMap hashMap2;
        long j5;
        f4 V2;
        boolean z4;
        boolean z5;
        x51.a aVar;
        x51.a aVar2;
        long j6;
        boolean z6;
        b61.a aVar3;
        int i3;
        b61.a aVar4;
        long j7;
        int i4;
        String str5;
        long j8;
        int i5;
        int i6;
        ArrayList arrayList;
        int i7;
        int i8;
        int size;
        String str6;
        String str7;
        boolean z7;
        String str8;
        x51.a aVar5;
        char c2;
        String str9;
        SQLiteException sQLiteException;
        String str10;
        String[] strArr;
        String str11;
        String[] strArr2;
        m8 m8Var2 = this;
        String str12 = bi;
        O().v();
        try {
            Cursor cursor2 = null;
            a aVar6 = new a(m8Var2, null);
            n9 O2 = O();
            long j9 = m8Var2.x;
            u.k(aVar6);
            O2.j();
            O2.t();
            try {
                SQLiteDatabase x2 = O2.x();
                boolean isEmpty = TextUtils.isEmpty(null);
                String str13 = aJ;
                if (isEmpty) {
                    if (j9 != -1) {
                        try {
                            strArr2 = new String[]{String.valueOf(j9), String.valueOf(j2)};
                        } catch (SQLiteException e2) {
                            e = e2;
                            cursor = cursor2;
                            str9 = null;
                        } catch (Throwable th3) {
                        }
                    } else {
                        strArr2 = new String[]{String.valueOf(j2)};
                    }
                    if (j9 != -1) {
                        str13 = z;
                    }
                    StringBuilder sb = new StringBuilder(str13.length() + 148);
                    sb.append(ck);
                    sb.append(str13);
                    sb.append(ce);
                    cursor2 = x2.rawQuery(sb.toString(), strArr2);
                    if (!cursor2.moveToFirst()) {
                        if (cursor2 != null) {
                            cursor2.close();
                        }
                        if (!(aVar6.c != null || aVar6.c.isEmpty())) {
                            b61.a aVar7 = (b61.a) aVar6.a.y();
                            aVar7.o0();
                            boolean G2 = m8Var2.i.r().G(aVar6.a.U(), l.i0);
                            int i9 = -1;
                            x51.a aVar8 = null;
                            x51.a aVar9 = null;
                            int i10 = 0;
                            int i11 = -1;
                            boolean z8 = false;
                            long j10 = 0;
                            int i12 = 0;
                            while (true) {
                                int size2 = aVar6.c.size();
                                str2 = eq;
                                str3 = aX;
                                z2 = z8;
                                str4 = P;
                                if (i10 >= size2) {
                                    break;
                                }
                                x51.a aVar10 = (x51.a) aVar6.c.get(i10).y();
                                boolean I2 = P().I(aVar6.a.U(), aVar10.u());
                                String str14 = ek;
                                if (I2) {
                                    m8Var2.i.e().H().b(cc, k3.B(aVar6.a.U()), m8Var2.i.S().v(aVar10.u()));
                                    if (!(P().G(aVar6.a.U()) || P().H(aVar6.a.U())) && !str14.equals(aVar10.u())) {
                                        m8Var2.i.T().I(aVar6.a.U(), 11, ed, aVar10.u(), 0);
                                    }
                                    aVar2 = aVar8;
                                    aVar = aVar9;
                                    z8 = z2;
                                    i11 = i11;
                                    i3 = i10;
                                    aVar3 = aVar7;
                                    j6 = j10;
                                    z6 = G2;
                                } else {
                                    boolean J2 = P().J(aVar6.a.U(), aVar10.u());
                                    String str15 = aG;
                                    if (!J2) {
                                        M();
                                        String u2 = aVar10.u();
                                        u.g(u2);
                                        j7 = j10;
                                        int hashCode = u2.hashCode();
                                        z6 = G2;
                                        if (hashCode != 94660) {
                                            if (hashCode != 95025) {
                                                if (hashCode == 95027 && u2.equals(ax)) {
                                                    c2 = 1;
                                                    if (!(c2 != 0 || c2 == 1 || c2 == 2)) {
                                                        aVar4 = aVar7;
                                                        i4 = i9;
                                                        aVar2 = aVar8;
                                                        aVar = aVar9;
                                                        if (m8Var2.i.r().R(aVar6.a.U()) && J2) {
                                                            arrayList = new ArrayList(aVar10.I());
                                                            i7 = 0;
                                                            i8 = -1;
                                                            int i13 = -1;
                                                            while (true) {
                                                                size = arrayList.size();
                                                                str6 = am;
                                                                str7 = f49cl;
                                                                if (i7 < size) {
                                                                    break;
                                                                }
                                                                if (str7.equals(((z51) arrayList.get(i7)).C())) {
                                                                    i8 = i7;
                                                                } else if (str6.equals(((z51) arrayList.get(i7)).C())) {
                                                                    i13 = i7;
                                                                }
                                                                i7++;
                                                            }
                                                            if (i8 != -1) {
                                                                if (((z51) arrayList.get(i8)).S() || ((z51) arrayList.get(i8)).V()) {
                                                                    if (i13 == -1) {
                                                                        z7 = true;
                                                                    } else {
                                                                        String Q2 = ((z51) arrayList.get(i13)).Q();
                                                                        if (Q2.length() == 3) {
                                                                            int i14 = 0;
                                                                            while (true) {
                                                                                if (i14 >= Q2.length()) {
                                                                                    z7 = false;
                                                                                    break;
                                                                                }
                                                                                int codePointAt = Q2.codePointAt(i14);
                                                                                if (!Character.isLetter(codePointAt)) {
                                                                                    break;
                                                                                }
                                                                                i14 += Character.charCount(codePointAt);
                                                                            }
                                                                        }
                                                                        z7 = true;
                                                                    }
                                                                    if (z7) {
                                                                        m8Var2.i.e().J().d(db);
                                                                        aVar10.G(i8);
                                                                        k(aVar10, str15);
                                                                        j(aVar10, 19, str6);
                                                                    }
                                                                    if (!m8Var2.i.r().G(aVar6.a.U(), l.h0)) {
                                                                        if (str4.equals(aVar10.u())) {
                                                                            M();
                                                                            if (u8.x((x51) ((l91) aVar10.G0()), str2) == null) {
                                                                                if (aVar != null && Math.abs(aVar.v() - aVar10.v()) <= 1000) {
                                                                                    x51.a aVar11 = (x51.a) ((l91.a) aVar.clone());
                                                                                    if (m8Var2.q(aVar10, aVar11)) {
                                                                                        aVar3 = aVar4;
                                                                                        aVar3.v(i4, aVar11);
                                                                                        i9 = i4;
                                                                                        i11 = i11;
                                                                                        str5 = str3;
                                                                                    }
                                                                                }
                                                                                aVar3 = aVar4;
                                                                                aVar2 = aVar10;
                                                                                i9 = i4;
                                                                                i11 = i12;
                                                                                str5 = str3;
                                                                                if (!z6 && str4.equals(aVar10.u())) {
                                                                                    if (aVar10.J() == 0) {
                                                                                        m8Var2.i.e().H().a(J, k3.B(aVar6.a.U()));
                                                                                    } else {
                                                                                        M();
                                                                                        Long l2 = (Long) u8.N((x51) ((l91) aVar10.G0()), str5);
                                                                                        if (l2 == null) {
                                                                                            m8Var2.i.e().H().a(U, k3.B(aVar6.a.U()));
                                                                                        } else {
                                                                                            j8 = j7 + l2.longValue();
                                                                                            i3 = i10;
                                                                                            aVar6.c.set(i3, (x51) ((l91) aVar10.G0()));
                                                                                            i12++;
                                                                                            aVar3.x(aVar10);
                                                                                            z8 = z2;
                                                                                            j6 = j8;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                j8 = j7;
                                                                                i3 = i10;
                                                                                aVar6.c.set(i3, (x51) ((l91) aVar10.G0()));
                                                                                i12++;
                                                                                aVar3.x(aVar10);
                                                                                z8 = z2;
                                                                                j6 = j8;
                                                                            } else {
                                                                                i5 = i4;
                                                                                aVar3 = aVar4;
                                                                                i6 = i11;
                                                                                str5 = str3;
                                                                            }
                                                                        } else {
                                                                            i5 = i4;
                                                                            aVar3 = aVar4;
                                                                            if (R.equals(aVar10.u())) {
                                                                                M();
                                                                                str5 = str3;
                                                                                if (u8.x((x51) ((l91) aVar10.G0()), str5) == null) {
                                                                                    if (aVar2 != null && Math.abs(aVar2.v() - aVar10.v()) <= 1000) {
                                                                                        x51.a aVar12 = (x51.a) ((l91.a) aVar2.clone());
                                                                                        if (m8Var2.q(aVar12, aVar10)) {
                                                                                            aVar3.v(i11, aVar12);
                                                                                            i11 = i11;
                                                                                            i9 = i5;
                                                                                        }
                                                                                    }
                                                                                    i11 = i11;
                                                                                    aVar = aVar10;
                                                                                    i9 = i12;
                                                                                    if (aVar10.J() == 0) {
                                                                                    }
                                                                                    j8 = j7;
                                                                                    i3 = i10;
                                                                                    aVar6.c.set(i3, (x51) ((l91) aVar10.G0()));
                                                                                    i12++;
                                                                                    aVar3.x(aVar10);
                                                                                    z8 = z2;
                                                                                    j6 = j8;
                                                                                } else {
                                                                                    i6 = i11;
                                                                                }
                                                                            }
                                                                            i6 = i11;
                                                                            str5 = str3;
                                                                        }
                                                                        aVar2 = null;
                                                                        aVar = null;
                                                                        if (aVar10.J() == 0) {
                                                                        }
                                                                        j8 = j7;
                                                                        i3 = i10;
                                                                        aVar6.c.set(i3, (x51) ((l91) aVar10.G0()));
                                                                        i12++;
                                                                        aVar3.x(aVar10);
                                                                        z8 = z2;
                                                                        j6 = j8;
                                                                    } else {
                                                                        i5 = i4;
                                                                        i6 = i11;
                                                                        str5 = str3;
                                                                        aVar3 = aVar4;
                                                                    }
                                                                    i11 = i6;
                                                                    i9 = i5;
                                                                    if (aVar10.J() == 0) {
                                                                    }
                                                                    j8 = j7;
                                                                    i3 = i10;
                                                                    aVar6.c.set(i3, (x51) ((l91) aVar10.G0()));
                                                                    i12++;
                                                                    aVar3.x(aVar10);
                                                                    z8 = z2;
                                                                    j6 = j8;
                                                                } else {
                                                                    m8Var2.i.e().J().d(Z);
                                                                    aVar10.G(i8);
                                                                    k(aVar10, str15);
                                                                    j(aVar10, 18, str7);
                                                                }
                                                            }
                                                            if (!m8Var2.i.r().G(aVar6.a.U(), l.h0)) {
                                                            }
                                                            i11 = i6;
                                                            i9 = i5;
                                                            if (aVar10.J() == 0) {
                                                            }
                                                            j8 = j7;
                                                            i3 = i10;
                                                            aVar6.c.set(i3, (x51) ((l91) aVar10.G0()));
                                                            i12++;
                                                            aVar3.x(aVar10);
                                                            z8 = z2;
                                                            j6 = j8;
                                                        }
                                                        if (!m8Var2.i.r().G(aVar6.a.U(), l.h0)) {
                                                        }
                                                        i11 = i6;
                                                        i9 = i5;
                                                        if (aVar10.J() == 0) {
                                                        }
                                                        j8 = j7;
                                                        i3 = i10;
                                                        aVar6.c.set(i3, (x51) ((l91) aVar10.G0()));
                                                        i12++;
                                                        aVar3.x(aVar10);
                                                        z8 = z2;
                                                        j6 = j8;
                                                    }
                                                }
                                            } else if (u2.equals(bu)) {
                                                c2 = 2;
                                                if (!(c2 != 0 || c2 == 1 || c2 == 2)) {
                                                }
                                            }
                                        } else if (u2.equals(O)) {
                                            c2 = 0;
                                            if (!(c2 != 0 || c2 == 1 || c2 == 2)) {
                                            }
                                        }
                                        c2 = 65535;
                                        if (!(c2 != 0 || c2 == 1 || c2 == 2)) {
                                        }
                                    } else {
                                        j7 = j10;
                                        z6 = G2;
                                    }
                                    aVar2 = aVar8;
                                    int i15 = 0;
                                    boolean z9 = false;
                                    boolean z10 = false;
                                    while (true) {
                                        int J3 = aVar10.J();
                                        aVar4 = aVar7;
                                        str8 = cy;
                                        if (i15 >= J3) {
                                            break;
                                        }
                                        if (str15.equals(aVar10.F(i15).C())) {
                                            z51.a aVar13 = (z51.a) aVar10.F(i15).y();
                                            aVar5 = aVar9;
                                            aVar13.v(1);
                                            aVar10.x(i15, (z51) ((l91) aVar13.G0()));
                                            z9 = true;
                                        } else {
                                            aVar5 = aVar9;
                                            if (str8.equals(aVar10.F(i15).C())) {
                                                z51.a aVar14 = (z51.a) aVar10.F(i15).y();
                                                aVar14.v(1);
                                                aVar10.x(i15, (z51) ((l91) aVar14.G0()));
                                                z10 = true;
                                            }
                                        }
                                        i15++;
                                        aVar7 = aVar4;
                                        aVar9 = aVar5;
                                    }
                                    aVar = aVar9;
                                    if (!z9 && J2) {
                                        m8Var2.i.e().M().a(aF, m8Var2.i.S().v(aVar10.u()));
                                        z51.a Y2 = z51.Y();
                                        Y2.w(str15);
                                        Y2.v(1);
                                        aVar10.y(Y2);
                                    }
                                    if (!z10) {
                                        m8Var2.i.e().M().a(bz, m8Var2.i.S().v(aVar10.u()));
                                        z51.a Y3 = z51.Y();
                                        Y3.w(str8);
                                        Y3.v(1);
                                        aVar10.y(Y3);
                                    }
                                    i4 = i9;
                                    if (O().E(X(), aVar6.a.U(), false, false, false, false, true).e > ((long) m8Var2.i.r().H(aVar6.a.U()))) {
                                        k(aVar10, str8);
                                    } else {
                                        z2 = true;
                                    }
                                    if (y8.Y(aVar10.u()) && J2 && O().E(X(), aVar6.a.U(), false, false, true, false, false).c > ((long) m8Var2.i.r().r(aVar6.a.U(), l.s))) {
                                        m8Var2.i.e().H().a(cv, k3.B(aVar6.a.U()));
                                        boolean z11 = false;
                                        int i16 = -1;
                                        z51.a aVar15 = null;
                                        for (int i17 = 0; i17 < aVar10.J(); i17++) {
                                            z51 F2 = aVar10.F(i17);
                                            if (str15.equals(F2.C())) {
                                                aVar15 = (z51.a) F2.y();
                                                i16 = i17;
                                            } else if (str14.equals(F2.C())) {
                                                z11 = true;
                                            }
                                        }
                                        if (z11 && aVar15 != null) {
                                            aVar10.G(i16);
                                        } else if (aVar15 != null) {
                                            z51.a aVar16 = (z51.a) ((l91.a) aVar15.clone());
                                            aVar16.w(str14);
                                            aVar16.v(10);
                                            aVar10.x(i16, (z51) ((l91) aVar16.G0()));
                                        } else {
                                            m8Var2.i.e().E().a(dn, k3.B(aVar6.a.U()));
                                        }
                                    }
                                    arrayList = new ArrayList(aVar10.I());
                                    i7 = 0;
                                    i8 = -1;
                                    int i132 = -1;
                                    while (true) {
                                        size = arrayList.size();
                                        str6 = am;
                                        str7 = f49cl;
                                        if (i7 < size) {
                                        }
                                        i7++;
                                    }
                                    if (i8 != -1) {
                                    }
                                    if (!m8Var2.i.r().G(aVar6.a.U(), l.h0)) {
                                    }
                                    i11 = i6;
                                    i9 = i5;
                                    if (aVar10.J() == 0) {
                                    }
                                    j8 = j7;
                                    i3 = i10;
                                    aVar6.c.set(i3, (x51) ((l91) aVar10.G0()));
                                    i12++;
                                    aVar3.x(aVar10);
                                    z8 = z2;
                                    j6 = j8;
                                }
                                i10 = i3 + 1;
                                aVar7 = aVar3;
                                G2 = z6;
                                j10 = j6;
                                str12 = str12;
                                aVar8 = aVar2;
                                aVar9 = aVar;
                            }
                            if (G2) {
                                int i18 = i12;
                                long j11 = j10;
                                int i19 = 0;
                                while (i19 < i18) {
                                    x51 D0 = aVar7.D0(i19);
                                    if (str4.equals(D0.D())) {
                                        M();
                                        if (u8.x(D0, str2) != null) {
                                            aVar7.E0(i19);
                                            i18--;
                                            i19--;
                                            i19++;
                                        }
                                    }
                                    M();
                                    z51 x3 = u8.x(D0, str3);
                                    if (x3 != null) {
                                        Long valueOf = x3.S() ? Long.valueOf(x3.T()) : null;
                                        if (valueOf != null && valueOf.longValue() > 0) {
                                            j11 += valueOf.longValue();
                                        }
                                    }
                                    i19++;
                                }
                                j3 = j11;
                            } else {
                                j3 = j10;
                            }
                            m8Var2.l(aVar7, j3, false);
                            boolean G3 = m8Var2.i.r().G(aVar7.C(), l.z0);
                            String str16 = as;
                            if (G3) {
                                Iterator<x51> it = aVar7.m0().iterator();
                                while (true) {
                                    if (it.hasNext()) {
                                        if (du.equals(it.next().D())) {
                                            z5 = true;
                                            break;
                                        }
                                    } else {
                                        z5 = false;
                                        break;
                                    }
                                }
                                if (z5) {
                                    O().w0(aVar7.C(), str16);
                                }
                                m8Var2.l(aVar7, j3, true);
                            } else if (m8Var2.i.r().G(aVar7.C(), l.A0)) {
                                O().w0(aVar7.C(), str16);
                            }
                            if (m8Var2.i.r().G(aVar7.C(), l.j0)) {
                                u8 M2 = M();
                                M2.e().M().d(aw);
                                if (M2.q().E(aVar7.C()) && (V2 = M2.p().V(aVar7.C())) != null && V2.J() && M2.k().x()) {
                                    M2.e().L().d(aj);
                                    f61.a c0 = f61.c0();
                                    c0.x(str12);
                                    c0.u(M2.k().v());
                                    c0.v(1);
                                    f61 f61 = (f61) ((l91) c0.G0());
                                    int i20 = 0;
                                    while (true) {
                                        if (i20 >= aVar7.r0()) {
                                            z4 = false;
                                            break;
                                        } else if (str12.equals(aVar7.F0(i20).C())) {
                                            aVar7.w(i20, f61);
                                            z4 = true;
                                            break;
                                        } else {
                                            i20++;
                                        }
                                    }
                                    if (!z4) {
                                        aVar7.z(f61);
                                    }
                                }
                            }
                            aVar7.A0();
                            String C2 = aVar7.C();
                            List<f61> p0 = aVar7.p0();
                            List<x51> m0 = aVar7.m0();
                            u.g(C2);
                            aVar7.R(N().E(C2, m0, p0));
                            if (m8Var2.i.r().L(aVar6.a.U())) {
                                try {
                                    HashMap hashMap3 = new HashMap();
                                    ArrayList arrayList2 = new ArrayList();
                                    SecureRandom t0 = m8Var2.i.T().t0();
                                    int i21 = 0;
                                    while (i21 < aVar7.n0()) {
                                        x51.a aVar17 = (x51.a) aVar7.D0(i21).y();
                                        boolean equals = aVar17.u().equals(ef);
                                        String str17 = bc;
                                        if (equals) {
                                            M();
                                            String str18 = (String) u8.N((x51) ((l91) aVar17.G0()), bm);
                                            f fVar = (f) hashMap3.get(str18);
                                            if (fVar == null) {
                                                fVar = O().g0(aVar6.a.U(), str18);
                                                hashMap3.put(str18, fVar);
                                            }
                                            if (fVar.i == null) {
                                                if (fVar.j.longValue() > 1) {
                                                    M();
                                                    u8.E(aVar17, str17, fVar.j);
                                                }
                                                if (fVar.k != null && fVar.k.booleanValue()) {
                                                    M();
                                                    u8.E(aVar17, eh, 1L);
                                                }
                                                arrayList2.add((x51) ((l91) aVar17.G0()));
                                            }
                                            aVar7.v(i21, aVar17);
                                        } else {
                                            long F3 = P().F(aVar6.a.U());
                                            m8Var2.i.T();
                                            long h0 = y8.h0(aVar17.v(), F3);
                                            x51 x51 = (x51) ((l91) aVar17.G0());
                                            String str19 = dt;
                                            Long l3 = 1L;
                                            if (!TextUtils.isEmpty(str19) && l3 != null) {
                                                Iterator<z51> it2 = x51.X().iterator();
                                                while (true) {
                                                    if (!it2.hasNext()) {
                                                        break;
                                                    }
                                                    z51 next = it2.next();
                                                    if (!str19.equals(next.C())) {
                                                        it2 = it2;
                                                    } else if (((l3 instanceof Long) && l3.equals(Long.valueOf(next.T()))) || (((l3 instanceof String) && l3.equals(next.Q())) || ((l3 instanceof Double) && l3.equals(Double.valueOf(next.W()))))) {
                                                        z3 = true;
                                                    }
                                                }
                                                K2 = z3 ? P().K(aVar6.a.U(), aVar17.u()) : 1;
                                                if (K2 > 0) {
                                                    m8Var2.i.e().H().b(bx, aVar17.u(), Integer.valueOf(K2));
                                                    arrayList2.add((x51) ((l91) aVar17.G0()));
                                                    aVar7.v(i21, aVar17);
                                                } else {
                                                    f fVar2 = (f) hashMap3.get(aVar17.u());
                                                    if (fVar2 == null && (fVar2 = O().g0(aVar6.a.U(), aVar17.u())) == null) {
                                                        j4 = h0;
                                                        m8Var2.i.e().H().b(em, aVar6.a.U(), aVar17.u());
                                                        if (m8Var2.i.r().G(aVar6.a.U(), l.y0)) {
                                                            fVar2 = new f(aVar6.a.U(), aVar17.u(), 1, 1, 1, aVar17.v(), 0, null, null, null, null);
                                                        } else {
                                                            fVar2 = new f(aVar6.a.U(), aVar17.u(), 1, 1, aVar17.v(), 0, null, null, null, null);
                                                        }
                                                    } else {
                                                        j4 = h0;
                                                    }
                                                    M();
                                                    Long l4 = (Long) u8.N((x51) ((l91) aVar17.G0()), fg);
                                                    Boolean valueOf2 = Boolean.valueOf(l4 != null);
                                                    if (K2 == 1) {
                                                        arrayList2.add((x51) ((l91) aVar17.G0()));
                                                        if (valueOf2.booleanValue() && !(fVar2.i == null && fVar2.j == null && fVar2.k == null)) {
                                                            hashMap3.put(aVar17.u(), fVar2.b(null, null, null));
                                                        }
                                                        aVar7.v(i21, aVar17);
                                                    } else {
                                                        if (t0.nextInt(K2) == 0) {
                                                            M();
                                                            long j12 = (long) K2;
                                                            u8.E(aVar17, str17, Long.valueOf(j12));
                                                            arrayList2.add((x51) ((l91) aVar17.G0()));
                                                            if (valueOf2.booleanValue()) {
                                                                fVar2 = fVar2.b(null, Long.valueOf(j12), null);
                                                            }
                                                            hashMap3.put(aVar17.u(), fVar2.a(aVar17.v(), j4));
                                                            hashMap = hashMap3;
                                                            secureRandom = t0;
                                                            i2 = i21;
                                                        } else {
                                                            secureRandom = t0;
                                                            if (!m8Var2.i.r().T(aVar6.a.U())) {
                                                                hashMap2 = hashMap3;
                                                            } else if (fVar2.h != null) {
                                                                j5 = fVar2.h.longValue();
                                                                hashMap2 = hashMap3;
                                                            } else {
                                                                m8Var2.i.T();
                                                                hashMap2 = hashMap3;
                                                                j5 = y8.h0(aVar17.K(), F3);
                                                            }
                                                            boolean z12 = true;
                                                            if (z12) {
                                                                M();
                                                                u8.E(aVar17, cm, 1L);
                                                                M();
                                                                long j13 = (long) K2;
                                                                u8.E(aVar17, str17, Long.valueOf(j13));
                                                                arrayList2.add((x51) ((l91) aVar17.G0()));
                                                                if (valueOf2.booleanValue()) {
                                                                    fVar2 = fVar2.b(null, Long.valueOf(j13), Boolean.TRUE);
                                                                }
                                                                hashMap = hashMap2;
                                                                hashMap.put(aVar17.u(), fVar2.a(aVar17.v(), j4));
                                                            } else {
                                                                hashMap = hashMap2;
                                                                if (valueOf2.booleanValue()) {
                                                                    hashMap.put(aVar17.u(), fVar2.b(l4, null, null));
                                                                }
                                                            }
                                                            i2 = i21;
                                                        }
                                                        aVar7.v(i2, aVar17);
                                                        i21 = i2 + 1;
                                                        hashMap3 = hashMap;
                                                        t0 = secureRandom;
                                                        m8Var2 = this;
                                                    }
                                                }
                                            }
                                            z3 = false;
                                            if (z3) {
                                            }
                                            if (K2 > 0) {
                                            }
                                        }
                                        hashMap = hashMap3;
                                        secureRandom = t0;
                                        i2 = i21;
                                        i21 = i2 + 1;
                                        hashMap3 = hashMap;
                                        t0 = secureRandom;
                                        m8Var2 = this;
                                    }
                                    if (arrayList2.size() < aVar7.n0()) {
                                        aVar7.o0();
                                        aVar7.B(arrayList2);
                                    }
                                    for (Map.Entry entry : hashMap3.entrySet()) {
                                        O().J((f) entry.getValue());
                                    }
                                } catch (Throwable th4) {
                                    th = th4;
                                    O().w();
                                    throw th;
                                }
                            }
                            aVar7.F(Long.MAX_VALUE);
                            aVar7.G(Long.MIN_VALUE);
                            for (int i22 = 0; i22 < aVar7.n0(); i22++) {
                                x51 D02 = aVar7.D0(i22);
                                if (D02.F() < aVar7.v0()) {
                                    aVar7.F(D02.F());
                                }
                                if (D02.F() > aVar7.w0()) {
                                    aVar7.G(D02.F());
                                }
                            }
                            String U2 = aVar6.a.U();
                            f4 V3 = O().V(U2);
                            if (V3 == null) {
                                m8Var = this;
                                try {
                                    m8Var.i.e().E().a(bl, k3.B(aVar6.a.U()));
                                } catch (Throwable th5) {
                                    th = th5;
                                    O().w();
                                    throw th;
                                }
                            } else {
                                m8Var = this;
                                if (aVar7.n0() > 0) {
                                    long n2 = V3.n();
                                    if (n2 != 0) {
                                        aVar7.J(n2);
                                    } else {
                                        aVar7.y0();
                                    }
                                    long m2 = V3.m();
                                    if (m2 != 0) {
                                        n2 = m2;
                                    }
                                    if (n2 != 0) {
                                        aVar7.I(n2);
                                    } else {
                                        aVar7.x0();
                                    }
                                    V3.x();
                                    aVar7.J0((int) V3.u());
                                    V3.Q(aVar7.v0());
                                    V3.S(aVar7.w0());
                                    String H2 = V3.H();
                                    if (H2 != null) {
                                        aVar7.b0(H2);
                                    } else {
                                        aVar7.z0();
                                    }
                                    O().K(V3);
                                }
                            }
                            if (aVar7.n0() > 0) {
                                m8Var.i.a();
                                i61 A2 = P().A(aVar6.a.U());
                                if (A2 != null) {
                                    if (A2.c != null) {
                                        aVar7.N(A2.c.longValue());
                                        O().M((b61) ((l91) aVar7.G0()), z2);
                                    }
                                }
                                if (TextUtils.isEmpty(aVar6.a.F())) {
                                    aVar7.N(-1);
                                } else {
                                    m8Var.i.e().H().a(es, k3.B(aVar6.a.U()));
                                }
                                O().M((b61) ((l91) aVar7.G0()), z2);
                            }
                            n9 O3 = O();
                            List<Long> list = aVar6.b;
                            u.k(list);
                            O3.j();
                            O3.t();
                            StringBuilder sb2 = new StringBuilder(aH);
                            for (int i23 = 0; i23 < list.size(); i23++) {
                                if (i23 != 0) {
                                    sb2.append(ea);
                                }
                                sb2.append(list.get(i23).longValue());
                            }
                            sb2.append(dy);
                            int delete = O3.x().delete(ca, sb2.toString(), null);
                            if (delete != list.size()) {
                                O3.e().E().b(Q, Integer.valueOf(delete), Integer.valueOf(list.size()));
                            }
                            n9 O4 = O();
                            try {
                                O4.x().execSQL(ag, new String[]{U2, U2});
                            } catch (SQLiteException e3) {
                                O4.e().E().b(ci, k3.B(U2), e3);
                            }
                            O().y();
                            O().w();
                            return true;
                        }
                        O().y();
                        O().w();
                        return false;
                    }
                    str9 = cursor2.getString(0);
                    String string = cursor2.getString(1);
                    cursor2.close();
                    cursor = cursor2;
                    str10 = string;
                } else {
                    String[] strArr3 = j9 != -1 ? new String[]{null, String.valueOf(j9)} : new String[]{null};
                    if (j9 != -1) {
                        str13 = az;
                    }
                    StringBuilder sb3 = new StringBuilder(str13.length() + 84);
                    sb3.append(cr);
                    sb3.append(str13);
                    sb3.append(cz);
                    Cursor rawQuery = x2.rawQuery(sb3.toString(), strArr3);
                    if (!rawQuery.moveToFirst()) {
                        if (rawQuery != null) {
                            rawQuery.close();
                        }
                        if (!(aVar6.c != null || aVar6.c.isEmpty())) {
                        }
                    } else {
                        String string2 = rawQuery.getString(0);
                        rawQuery.close();
                        cursor = rawQuery;
                        str10 = string2;
                        str9 = null;
                    }
                }
                try {
                    Cursor query = x2.query(ex, new String[]{bd}, er, new String[]{str9, str10}, null, null, aS, bk);
                    if (!query.moveToFirst()) {
                        O2.e().E().a(cj, k3.B(str9));
                        if (query != null) {
                            query.close();
                        }
                    } else {
                        try {
                            b61 M0 = b61.M0(query.getBlob(0), y81.e());
                            if (query.moveToNext()) {
                                O2.e().H().a(de, k3.B(str9));
                            }
                            query.close();
                            aVar6.b(M0);
                            if (j9 != -1) {
                                str11 = bo;
                                strArr = new String[]{str9, str10, String.valueOf(j9)};
                            } else {
                                str11 = bv;
                                strArr = new String[]{str9, str10};
                            }
                            Cursor query2 = x2.query(N, new String[]{cf, fe, dz, dd}, str11, strArr, null, null, dp, null);
                            if (!query2.moveToFirst()) {
                                O2.e().H().a(bb, k3.B(str9));
                                if (query2 != null) {
                                    query2.close();
                                }
                            } else {
                                while (true) {
                                    long j14 = query2.getLong(0);
                                    byte[] blob = query2.getBlob(3);
                                    try {
                                        x51.a e0 = x51.e0();
                                        e0.l(blob, y81.e());
                                        x51.a aVar18 = e0;
                                        aVar18.D(query2.getString(1));
                                        aVar18.B(query2.getLong(2));
                                        if (!aVar6.a(j14, (x51) ((l91) aVar18.G0()))) {
                                            if (query2 != null) {
                                                query2.close();
                                            }
                                        }
                                    } catch (IOException e4) {
                                        O2.e().E().b(V, k3.B(str9), e4);
                                    }
                                    if (!query2.moveToNext()) {
                                        if (query2 != null) {
                                            query2.close();
                                        }
                                    }
                                }
                            }
                        } catch (IOException e5) {
                            O2.e().E().b(aa, k3.B(str9), e5);
                            if (query != null) {
                                query.close();
                            }
                        }
                    }
                } catch (SQLiteException e6) {
                    e = e6;
                    sQLiteException = e;
                    try {
                        O2.e().E().b(cw, k3.B(str9), sQLiteException);
                        if (cursor != null) {
                        }
                        if (!(aVar6.c != null || aVar6.c.isEmpty())) {
                        }
                    } catch (Throwable th6) {
                        th2 = th6;
                        if (cursor != null) {
                            cursor.close();
                        }
                        throw th2;
                    }
                }
            } catch (SQLiteException e7) {
                sQLiteException = e7;
                str9 = null;
                cursor = null;
                O2.e().E().b(cw, k3.B(str9), sQLiteException);
                if (cursor != null) {
                    cursor.close();
                }
                if (!(aVar6.c != null || aVar6.c.isEmpty())) {
                }
            } catch (Throwable th7) {
                th2 = th7;
                cursor = null;
                if (cursor != null) {
                }
                throw th2;
            }
            if (!(aVar6.c != null || aVar6.c.isEmpty())) {
            }
        } catch (Throwable th8) {
            th = th8;
            O().w();
            throw th;
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x007c  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00d6  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00fa  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0108  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0132  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0140  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x014e  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x0189  */
    public final f4 L(d9 d9Var) {
        boolean z2;
        long j2;
        i0();
        W();
        u.k(d9Var);
        u.g(d9Var.a);
        f4 V2 = O().V(d9Var.a);
        String w2 = this.i.q().w(d9Var.a);
        boolean z3 = true;
        if (V2 == null) {
            V2 = new f4(this.i, d9Var.a);
            V2.g(this.i.T().v0());
            V2.P(w2);
        } else if (!w2.equals(V2.l())) {
            V2.P(w2);
            V2.g(this.i.T().v0());
        } else {
            z2 = false;
            if (!TextUtils.equals(d9Var.b, V2.c())) {
                V2.D(d9Var.b);
                z2 = true;
            }
            if (!TextUtils.equals(d9Var.u, V2.k())) {
                V2.N(d9Var.u);
                z2 = true;
            }
            if (!TextUtils.isEmpty(d9Var.k) && !d9Var.k.equals(V2.b())) {
                V2.R(d9Var.k);
                z2 = true;
            }
            long j3 = d9Var.e;
            if (!(j3 == 0 || j3 == V2.r())) {
                V2.W(d9Var.e);
                z2 = true;
            }
            if (!TextUtils.isEmpty(d9Var.c) && !d9Var.c.equals(V2.o())) {
                V2.T(d9Var.c);
                z2 = true;
            }
            if (d9Var.j != V2.p()) {
                V2.U(d9Var.j);
                z2 = true;
            }
            String str = d9Var.d;
            if (str != null && !str.equals(V2.q())) {
                V2.V(d9Var.d);
                z2 = true;
            }
            if (d9Var.f != V2.s()) {
                V2.Y(d9Var.f);
                z2 = true;
            }
            if (d9Var.h != V2.d()) {
                V2.e(d9Var.h);
                z2 = true;
            }
            if (!TextUtils.isEmpty(d9Var.g) && !d9Var.g.equals(V2.G())) {
                V2.X(d9Var.g);
                z2 = true;
            }
            if (d9Var.l != V2.I()) {
                V2.j0(d9Var.l);
                z2 = true;
            }
            if (d9Var.o != V2.J()) {
                V2.E(d9Var.o);
                z2 = true;
            }
            if (d9Var.p != V2.K()) {
                V2.O(d9Var.p);
                z2 = true;
            }
            if (this.i.r().G(d9Var.a, l.j0) && d9Var.v != V2.L()) {
                V2.f(d9Var.v);
                z2 = true;
            }
            j2 = d9Var.w;
            if (j2 != 0 || j2 == V2.t()) {
                z3 = z2;
            } else {
                V2.Z(d9Var.w);
            }
            if (z3) {
                O().K(V2);
            }
            return V2;
        }
        z2 = true;
        if (!TextUtils.equals(d9Var.b, V2.c())) {
        }
        if (!TextUtils.equals(d9Var.u, V2.k())) {
        }
        V2.R(d9Var.k);
        z2 = true;
        long j32 = d9Var.e;
        V2.W(d9Var.e);
        z2 = true;
        V2.T(d9Var.c);
        z2 = true;
        if (d9Var.j != V2.p()) {
        }
        String str2 = d9Var.d;
        V2.V(d9Var.d);
        z2 = true;
        if (d9Var.f != V2.s()) {
        }
        if (d9Var.h != V2.d()) {
        }
        V2.X(d9Var.g);
        z2 = true;
        if (d9Var.l != V2.I()) {
        }
        if (d9Var.o != V2.J()) {
        }
        if (d9Var.p != V2.K()) {
        }
        V2.f(d9Var.v);
        z2 = true;
        j2 = d9Var.w;
        if (j2 != 0) {
        }
        z3 = z2;
        if (z3) {
        }
        return V2;
    }

    private final r3 T() {
        r3 r3Var = this.d;
        if (r3Var != null) {
            return r3Var;
        }
        throw new IllegalStateException(C0201.m82(12100));
    }

    private final i8 U() {
        n(this.e);
        return this.e;
    }

    private final long X() {
        long a2 = this.i.b().a();
        t3 q2 = this.i.q();
        q2.p();
        q2.j();
        long a3 = q2.i.a();
        if (a3 == 0) {
            a3 = 1 + ((long) q2.m().t0().nextInt(86400000));
            q2.i.b(a3);
        }
        return ((((a2 + a3) / 1000) / 60) / 60) / 24;
    }

    private final boolean Z() {
        i0();
        W();
        return O().k0() || !TextUtils.isEmpty(O().e0());
    }

    /* JADX WARNING: Removed duplicated region for block: B:53:0x01ab  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x01ce  */
    private final void a0() {
        long j2;
        long j3;
        i0();
        W();
        if (e0() || this.i.r().p(l.m0)) {
            if (this.m > 0) {
                long abs = 3600000 - Math.abs(this.i.b().b() - this.m);
                if (abs > 0) {
                    this.i.e().M().a(C0201.m82(12101), Long.valueOf(abs));
                    T().a();
                    U().v();
                    return;
                }
                this.m = 0;
            }
            if (!this.i.H() || !Z()) {
                this.i.e().M().d(C0201.m82(12106));
                T().a();
                U().v();
                return;
            }
            long a2 = this.i.b().a();
            long max = Math.max(0L, l.F.a(null).longValue());
            boolean z2 = O().l0() || O().f0();
            if (z2) {
                String A2 = this.i.r().A();
                if (TextUtils.isEmpty(A2) || C0201.m82(12102).equals(A2)) {
                    j2 = Math.max(0L, l.z.a(null).longValue());
                } else {
                    j2 = Math.max(0L, l.A.a(null).longValue());
                }
            } else {
                j2 = Math.max(0L, l.y.a(null).longValue());
            }
            long a3 = this.i.q().e.a();
            long a4 = this.i.q().f.a();
            long max2 = Math.max(O().i0(), O().j0());
            if (max2 != 0) {
                long abs2 = a2 - Math.abs(max2 - a2);
                long abs3 = a2 - Math.abs(a3 - a2);
                long abs4 = a2 - Math.abs(a4 - a2);
                long max3 = Math.max(abs3, abs4);
                j3 = abs2 + max;
                if (z2 && max3 > 0) {
                    j3 = Math.min(abs2, max3) + j2;
                }
                if (!M().O(max3, j2)) {
                    j3 = max3 + j2;
                }
                if (abs4 != 0 && abs4 >= abs2) {
                    int i2 = 0;
                    while (true) {
                        if (i2 >= Math.min(20, Math.max(0, l.H.a(null).intValue()))) {
                            break;
                        }
                        j3 += Math.max(0L, l.G.a(null).longValue()) * (1 << i2);
                        if (j3 > abs4) {
                            break;
                        }
                        i2++;
                    }
                }
                if (j3 != 0) {
                    this.i.e().M().d(C0201.m82(12103));
                    T().a();
                    U().v();
                    return;
                } else if (!S().y()) {
                    this.i.e().M().d(C0201.m82(12104));
                    T().c();
                    U().v();
                    return;
                } else {
                    long a5 = this.i.q().g.a();
                    long max4 = Math.max(0L, l.w.a(null).longValue());
                    if (!M().O(a5, max4)) {
                        j3 = Math.max(j3, a5 + max4);
                    }
                    T().a();
                    long a6 = j3 - this.i.b().a();
                    if (a6 <= 0) {
                        a6 = Math.max(0L, l.B.a(null).longValue());
                        this.i.q().e.b(this.i.b().a());
                    }
                    this.i.e().M().a(C0201.m82(12105), Long.valueOf(a6));
                    U().z(a6);
                    return;
                }
            }
            j3 = 0;
            if (j3 != 0) {
            }
        }
    }

    private final void b0() {
        i0();
        if (this.q || this.r || this.s) {
            this.i.e().M().c(C0201.m82(12108), Boolean.valueOf(this.q), Boolean.valueOf(this.r), Boolean.valueOf(this.s));
            return;
        }
        this.i.e().M().d(C0201.m82(12107));
        List<Runnable> list = this.n;
        if (list != null) {
            for (Runnable runnable : list) {
                runnable.run();
            }
            this.n.clear();
        }
    }

    private final boolean c0() {
        FileLock fileLock;
        i0();
        boolean p2 = this.i.r().p(l.F0);
        String r2 = C0201.m82(12109);
        if (!p2 || (fileLock = this.t) == null || !fileLock.isValid()) {
            try {
                FileChannel channel = new RandomAccessFile(new File(this.i.getContext().getFilesDir(), C0201.m82(12110)), C0201.m82(12111)).getChannel();
                this.u = channel;
                FileLock tryLock = channel.tryLock();
                this.t = tryLock;
                if (tryLock != null) {
                    this.i.e().M().d(r2);
                    return true;
                }
                this.i.e().E().d(C0201.m82(12112));
                return false;
            } catch (FileNotFoundException e2) {
                this.i.e().E().a(C0201.m82(12115), e2);
                return false;
            } catch (IOException e3) {
                this.i.e().E().a(C0201.m82(12114), e3);
                return false;
            } catch (OverlappingFileLockException e4) {
                this.i.e().H().a(C0201.m82(12113), e4);
                return false;
            }
        } else {
            this.i.e().M().d(r2);
            return true;
        }
    }

    private final boolean e0() {
        i0();
        W();
        return this.k;
    }

    private final int f(FileChannel fileChannel) {
        i0();
        if (fileChannel == null || !fileChannel.isOpen()) {
            this.i.e().E().d(C0201.m82(12118));
            return 0;
        }
        ByteBuffer allocate = ByteBuffer.allocate(4);
        try {
            fileChannel.position(0L);
            int read = fileChannel.read(allocate);
            if (read != 4) {
                if (read != -1) {
                    this.i.e().H().a(C0201.m82(12116), Integer.valueOf(read));
                }
                return 0;
            }
            allocate.flip();
            return allocate.getInt();
        } catch (IOException e2) {
            this.i.e().E().a(C0201.m82(12117), e2);
            return 0;
        }
    }

    private final d9 h(Context context, String str, String str2, boolean z2, boolean z3, boolean z4, long j2, String str3) {
        String str4;
        String str5;
        int i2;
        String str6 = ac;
        PackageManager packageManager = context.getPackageManager();
        if (packageManager == null) {
            this.i.e().E().d(cq);
            return null;
        }
        try {
            str4 = packageManager.getInstallerPackageName(str);
        } catch (IllegalArgumentException unused) {
            this.i.e().E().a(aK, k3.B(str));
            str4 = str6;
        }
        if (str4 == null) {
            str4 = ee;
        } else if (ar.equals(str4)) {
            str4 = fa;
        }
        try {
            PackageInfo d2 = hq0.a(context).d(str, 0);
            if (d2 != null) {
                CharSequence c2 = hq0.a(context).c(str);
                if (!TextUtils.isEmpty(c2)) {
                    c2.toString();
                }
                String str7 = d2.versionName;
                i2 = d2.versionCode;
                str5 = str7;
            } else {
                i2 = C0188.f23;
                str5 = str6;
            }
            this.i.a();
            return new d9(str, str2, str5, (long) i2, str4, this.i.r().q(), this.i.T().i0(context, str), (String) null, z2, false, ay, 0L, this.i.r().Q(str) ? j2 : 0, 0, z3, z4, false, str3, (Boolean) null, 0L, (List<String>) null);
        } catch (PackageManager.NameNotFoundException unused2) {
            this.i.e().E().b(F, k3.B(str), str6);
            return null;
        }
    }

    public static m8 h0(Context context) {
        u.k(context);
        u.k(context.getApplicationContext());
        if (y == null) {
            synchronized (m8.class) {
                if (y == null) {
                    y = new m8(new s8(context));
                }
            }
        }
        return y;
    }

    private final void i0() {
        this.i.c().j();
    }

    private static void j(x51.a aVar, int i2, String str) {
        List<z51> I2 = aVar.I();
        int i3 = 0;
        while (true) {
            int size = I2.size();
            String r3 = C0201.m82(12119);
            if (i3 >= size) {
                z51.a Y2 = z51.Y();
                Y2.w(r3);
                Y2.v(Long.valueOf((long) i2).longValue());
                z51.a Y3 = z51.Y();
                Y3.w(C0201.m82(12120));
                Y3.x(str);
                aVar.z((z51) ((l91) Y2.G0()));
                aVar.z((z51) ((l91) Y3.G0()));
                return;
            } else if (!r3.equals(I2.get(i3).C())) {
                i3++;
            } else {
                return;
            }
        }
    }

    private static void k(x51.a aVar, String str) {
        List<z51> I2 = aVar.I();
        for (int i2 = 0; i2 < I2.size(); i2++) {
            if (str.equals(I2.get(i2).C())) {
                aVar.G(i2);
                return;
            }
        }
    }

    private final void l(b61.a aVar, long j2, boolean z2) {
        v8 v8Var;
        String r0 = z2 ? C0201.m82(12121) : C0201.m82(12122);
        v8 x0 = O().x0(aVar.C(), r0);
        if (x0 == null || x0.e == null) {
            v8Var = new v8(aVar.C(), C0201.m82(12124), r0, this.i.b().a(), Long.valueOf(j2));
        } else {
            v8Var = new v8(aVar.C(), C0201.m82(12123), r0, this.i.b().a(), Long.valueOf(((Long) x0.e).longValue() + j2));
        }
        f61.a c0 = f61.c0();
        c0.x(r0);
        c0.u(this.i.b().a());
        c0.v(((Long) v8Var.e).longValue());
        f61 f61 = (f61) ((l91) c0.G0());
        boolean z3 = false;
        int i2 = 0;
        while (true) {
            if (i2 >= aVar.r0()) {
                break;
            } else if (r0.equals(aVar.F0(i2).C())) {
                aVar.w(i2, f61);
                z3 = true;
                break;
            } else {
                i2++;
            }
        }
        if (!z3) {
            aVar.z(f61);
        }
        if (j2 > 0) {
            O().O(v8Var);
            this.i.e().L().b(C0201.m82(12127), z2 ? C0201.m82(12125) : C0201.m82(12126), v8Var.e);
        }
    }

    private static void n(n8 n8Var) {
        if (n8Var == null) {
            throw new IllegalStateException(C0201.m82(12129));
        } else if (!n8Var.s()) {
            String valueOf = String.valueOf(n8Var.getClass());
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 27);
            sb.append(C0201.m82(12128));
            sb.append(valueOf);
            throw new IllegalStateException(sb.toString());
        }
    }

    /* access modifiers changed from: private */
    public final void o(s8 s8Var) {
        this.i.c().j();
        n9 n9Var = new n9(this);
        n9Var.r();
        this.c = n9Var;
        this.i.r().o(this.a);
        f9 f9Var = new f9(this);
        f9Var.r();
        this.f = f9Var;
        u6 u6Var = new u6(this);
        u6Var.r();
        this.h = u6Var;
        i8 i8Var = new i8(this);
        i8Var.r();
        this.e = i8Var;
        this.d = new r3(this);
        if (this.o != this.p) {
            this.i.e().E().b(C0201.m82(12130), Integer.valueOf(this.o), Integer.valueOf(this.p));
        }
        this.j = true;
    }

    private final boolean p(int i2, FileChannel fileChannel) {
        i0();
        if (fileChannel == null || !fileChannel.isOpen()) {
            this.i.e().E().d(C0201.m82(12133));
            return false;
        }
        ByteBuffer allocate = ByteBuffer.allocate(4);
        allocate.putInt(i2);
        allocate.flip();
        try {
            fileChannel.truncate(0L);
            fileChannel.write(allocate);
            fileChannel.force(true);
            if (fileChannel.size() != 4) {
                this.i.e().E().a(C0201.m82(12131), Long.valueOf(fileChannel.size()));
            }
            return true;
        } catch (IOException e2) {
            this.i.e().E().a(C0201.m82(12132), e2);
            return false;
        }
    }

    private final boolean q(x51.a aVar, x51.a aVar2) {
        String str;
        u.a(C0201.m82(12134).equals(aVar.u()));
        M();
        z51 x2 = u8.x((x51) ((l91) aVar.G0()), C0201.m82(12135));
        String str2 = null;
        if (x2 == null) {
            str = null;
        } else {
            str = x2.Q();
        }
        M();
        z51 x3 = u8.x((x51) ((l91) aVar2.G0()), C0201.m82(12136));
        if (x3 != null) {
            str2 = x3.Q();
        }
        if (str2 == null || !str2.equals(str)) {
            return false;
        }
        M();
        String r1 = C0201.m82(12137);
        z51 x4 = u8.x((x51) ((l91) aVar.G0()), r1);
        if (x4.S() && x4.T() > 0) {
            long T2 = x4.T();
            M();
            z51 x5 = u8.x((x51) ((l91) aVar2.G0()), r1);
            if (x5 != null && x5.T() > 0) {
                T2 += x5.T();
            }
            M();
            u8.E(aVar2, r1, Long.valueOf(T2));
            M();
            u8.E(aVar, C0201.m82(12138), 1L);
        }
        return true;
    }

    private final void s(f4 f4Var) {
        i0();
        if (!TextUtils.isEmpty(f4Var.c()) || (i9.D() && !TextUtils.isEmpty(f4Var.k()))) {
            i9 r2 = this.i.r();
            Uri.Builder builder = new Uri.Builder();
            String c2 = f4Var.c();
            if (TextUtils.isEmpty(c2) && i9.D()) {
                c2 = f4Var.k();
            }
            r0 r0Var = null;
            Uri.Builder encodedAuthority = builder.scheme(l.j.a(null)).encodedAuthority(l.k.a(null));
            String r5 = C0201.m82(12139);
            String valueOf = String.valueOf(c2);
            encodedAuthority.path(valueOf.length() != 0 ? r5.concat(valueOf) : new String(r5)).appendQueryParameter(C0201.m82(12140), f4Var.a()).appendQueryParameter(C0201.m82(12141), C0201.m82(12142)).appendQueryParameter(C0201.m82(12143), String.valueOf(r2.q()));
            String uri = builder.build().toString();
            try {
                URL url = new URL(uri);
                this.i.e().M().a(C0201.m82(12144), f4Var.j());
                i61 A2 = P().A(f4Var.j());
                String B2 = P().B(f4Var.j());
                if (A2 != null && !TextUtils.isEmpty(B2)) {
                    r0Var = new r0();
                    r0Var.put(C0201.m82(12145), B2);
                }
                this.q = true;
                o3 S2 = S();
                String j2 = f4Var.j();
                r8 r8Var = new r8(this);
                S2.j();
                S2.t();
                u.k(url);
                u.k(r8Var);
                S2.c().B(new s3(S2, j2, url, null, r0Var, r8Var));
            } catch (MalformedURLException unused) {
                this.i.e().E().b(C0201.m82(12146), k3.B(f4Var.j()), uri);
            }
        } else {
            w(f4Var.j(), 204, null, null, null);
        }
    }

    private final d9 x(String str) {
        f4 V2 = O().V(str);
        if (V2 == null || TextUtils.isEmpty(V2.o())) {
            this.i.e().L().a(C0201.m82(12148), str);
            return null;
        }
        Boolean y2 = y(V2);
        if (y2 == null || y2.booleanValue()) {
            return new d9(str, V2.c(), V2.o(), V2.p(), V2.q(), V2.r(), V2.s(), (String) null, V2.d(), false, V2.b(), V2.I(), 0L, 0, V2.J(), V2.K(), false, V2.k(), V2.L(), V2.t(), V2.M());
        }
        this.i.e().E().a(C0201.m82(12147), k3.B(str));
        return null;
    }

    private final Boolean y(f4 f4Var) {
        try {
            if (f4Var.p() != -2147483648L) {
                if (f4Var.p() == ((long) hq0.a(this.i.getContext()).d(f4Var.j(), 0).versionCode)) {
                    return Boolean.TRUE;
                }
            } else {
                String str = hq0.a(this.i.getContext()).d(f4Var.j(), 0).versionName;
                if (f4Var.o() != null && f4Var.o().equals(str)) {
                    return Boolean.TRUE;
                }
            }
            return Boolean.FALSE;
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    public final void A(t8 t8Var, d9 d9Var) {
        i0();
        W();
        if (TextUtils.isEmpty(d9Var.b) && TextUtils.isEmpty(d9Var.u)) {
            return;
        }
        if (!d9Var.h) {
            L(d9Var);
            return;
        }
        boolean G2 = this.i.r().G(d9Var.a, l.j0);
        String r1 = C0201.m82(12149);
        String r2 = C0201.m82(12150);
        if (G2) {
            if (!C0201.m82(12151).equals(t8Var.b) || d9Var.v == null) {
                this.i.e().L().a(r2, this.i.S().x(t8Var.b));
                O().v();
                try {
                    L(d9Var);
                    O().w0(d9Var.a, t8Var.b);
                    O().y();
                    this.i.e().L().a(r1, this.i.S().x(t8Var.b));
                } finally {
                    O().w();
                }
            } else {
                this.i.e().L().d(C0201.m82(12152));
                u(new t8(C0201.m82(12153), this.i.b().a(), Long.valueOf(d9Var.v.booleanValue() ? 1 : 0), C0201.m82(12154)), d9Var);
            }
        } else {
            this.i.e().L().a(r2, this.i.S().x(t8Var.b));
            O().v();
            try {
                L(d9Var);
                O().w0(d9Var.a, t8Var.b);
                O().y();
                this.i.e().L().a(r1, this.i.S().x(t8Var.b));
            } finally {
                O().w();
            }
        }
    }

    public final void B(g9 g9Var, d9 d9Var) {
        u.k(g9Var);
        u.g(g9Var.a);
        u.k(g9Var.c);
        u.g(g9Var.c.b);
        i0();
        W();
        if (TextUtils.isEmpty(d9Var.b) && TextUtils.isEmpty(d9Var.u)) {
            return;
        }
        if (!d9Var.h) {
            L(d9Var);
            return;
        }
        O().v();
        try {
            L(d9Var);
            g9 y0 = O().y0(g9Var.a, g9Var.c.b);
            if (y0 != null) {
                this.i.e().L().b(C0201.m82(12155), g9Var.a, this.i.S().x(g9Var.c.b));
                O().z0(g9Var.a, g9Var.c.b);
                if (y0.e) {
                    O().w0(g9Var.a, g9Var.c.b);
                }
                if (g9Var.k != null) {
                    Bundle bundle = null;
                    if (g9Var.k.b != null) {
                        bundle = g9Var.k.b.w();
                    }
                    C(this.i.T().w(g9Var.a, g9Var.k.a, bundle, y0.b, g9Var.k.d, true, false), d9Var);
                }
            } else {
                this.i.e().H().b(C0201.m82(12156), k3.B(g9Var.a), this.i.S().x(g9Var.c.b));
            }
            O().y();
        } finally {
            O().w();
        }
    }

    public final void D(j jVar, String str) {
        f4 V2 = O().V(str);
        if (V2 == null || TextUtils.isEmpty(V2.o())) {
            this.i.e().L().a(C0201.m82(12160), str);
            return;
        }
        Boolean y2 = y(V2);
        if (y2 == null) {
            if (!C0201.m82(12157).equals(jVar.a)) {
                this.i.e().H().a(C0201.m82(12158), k3.B(str));
            }
        } else if (!y2.booleanValue()) {
            this.i.e().E().a(C0201.m82(12159), k3.B(str));
            return;
        }
        z(jVar, new d9(str, V2.c(), V2.o(), V2.p(), V2.q(), V2.r(), V2.s(), (String) null, V2.d(), false, V2.b(), V2.I(), 0L, 0, V2.J(), V2.K(), false, V2.k(), V2.L(), V2.t(), V2.M()));
    }

    public final void E(d9 d9Var) {
        String r0 = C0201.m82(12161);
        if (this.v != null) {
            ArrayList arrayList = new ArrayList();
            this.w = arrayList;
            arrayList.addAll(this.v);
        }
        n9 O2 = O();
        String str = d9Var.a;
        u.g(str);
        O2.j();
        O2.t();
        try {
            SQLiteDatabase x2 = O2.x();
            String[] strArr = {str};
            int delete = x2.delete(C0201.m82(12162), r0, strArr) + 0 + x2.delete(C0201.m82(12163), r0, strArr) + x2.delete(C0201.m82(12164), r0, strArr) + x2.delete(C0201.m82(12165), r0, strArr) + x2.delete(C0201.m82(12166), r0, strArr) + x2.delete(C0201.m82(12167), r0, strArr) + x2.delete(C0201.m82(12168), r0, strArr) + x2.delete(C0201.m82(12169), r0, strArr) + x2.delete(C0201.m82(12170), r0, strArr);
            if (delete > 0) {
                O2.e().M().b(C0201.m82(12171), str, Integer.valueOf(delete));
            }
        } catch (SQLiteException e2) {
            O2.e().E().b(C0201.m82(12172), k3.B(str), e2);
        }
        d9 h2 = h(this.i.getContext(), d9Var.a, d9Var.b, d9Var.h, d9Var.o, d9Var.p, d9Var.m, d9Var.u);
        if (d9Var.h) {
            I(h2);
        }
    }

    public final void G(d9 d9Var) {
        i0();
        W();
        u.g(d9Var.a);
        L(d9Var);
    }

    public final void H(g9 g9Var) {
        d9 x2 = x(g9Var.a);
        if (x2 != null) {
            v(g9Var, x2);
        }
    }

    public final void I(d9 d9Var) {
        String str;
        int i2;
        f fVar;
        String str2;
        long j2;
        long j3;
        PackageInfo packageInfo;
        String str3;
        ApplicationInfo applicationInfo;
        boolean z2;
        v8 x0;
        String str4 = bn;
        String str5 = bj;
        String str6 = aq;
        String str7 = I;
        String str8 = dm;
        i0();
        W();
        u.k(d9Var);
        u.g(d9Var.a);
        if (!TextUtils.isEmpty(d9Var.b) || !TextUtils.isEmpty(d9Var.u)) {
            f4 V2 = O().V(d9Var.a);
            if (V2 != null && TextUtils.isEmpty(V2.c()) && !TextUtils.isEmpty(d9Var.b)) {
                V2.b0(0);
                O().K(V2);
                P().D(d9Var.a);
            }
            if (!d9Var.h) {
                L(d9Var);
                return;
            }
            long j4 = d9Var.m;
            if (j4 == 0) {
                j4 = this.i.b().a();
            }
            if (this.i.r().G(d9Var.a, l.j0)) {
                this.i.R().w();
            }
            int i3 = d9Var.n;
            if (!(i3 == 0 || i3 == 1)) {
                this.i.e().H().b(aN, k3.B(d9Var.a), Integer.valueOf(i3));
                i3 = 0;
            }
            O().v();
            try {
                if (!this.i.r().G(d9Var.a, l.j0) || ((x0 = O().x0(d9Var.a, cn)) != null && !cA.equals(x0.b))) {
                    str = str4;
                    i2 = 1;
                } else if (d9Var.v != null) {
                    str = str4;
                    i2 = 1;
                    t8 t8Var = new t8(ap, j4, Long.valueOf(d9Var.v.booleanValue() ? 1 : 0), ah);
                    if (x0 == null || !x0.e.equals(t8Var.d)) {
                        u(t8Var, d9Var);
                    }
                } else {
                    str = str4;
                    i2 = 1;
                    if (x0 != null) {
                        A(new t8(aU, j4, null, aM), d9Var);
                    }
                }
                f4 V3 = O().V(d9Var.a);
                if (V3 != null) {
                    this.i.T();
                    if (y8.N(d9Var.b, V3.c(), d9Var.u, V3.k())) {
                        this.i.e().H().a(fi, k3.B(V3.j()));
                        n9 O2 = O();
                        String j5 = V3.j();
                        O2.t();
                        O2.j();
                        u.g(j5);
                        try {
                            SQLiteDatabase x2 = O2.x();
                            String[] strArr = new String[i2];
                            strArr[0] = j5;
                            int delete = x2.delete(ev, str8, strArr) + 0 + x2.delete(aA, str8, strArr) + x2.delete(D, str8, strArr) + x2.delete(br, str8, strArr) + x2.delete(eu, str8, strArr) + x2.delete(cx, str8, strArr) + x2.delete(eb, str8, strArr) + x2.delete(ch, str8, strArr) + x2.delete(aC, str8, strArr);
                            if (delete > 0) {
                                O2.e().M().b(dj, j5, Integer.valueOf(delete));
                            }
                        } catch (SQLiteException e2) {
                            O2.e().E().b(ao, k3.B(j5), e2);
                        }
                        V3 = null;
                    }
                }
                if (V3 != null) {
                    long p2 = V3.p();
                    String str9 = cd;
                    if (p2 != -2147483648L) {
                        if (V3.p() != d9Var.j) {
                            Bundle bundle = new Bundle();
                            bundle.putString(str9, V3.o());
                            z(new j(dv, new i(bundle), et, j4), d9Var);
                        }
                    } else if (V3.o() != null && !V3.o().equals(d9Var.c)) {
                        Bundle bundle2 = new Bundle();
                        bundle2.putString(str9, V3.o());
                        z(new j(aR, new i(bundle2), dh, j4), d9Var);
                    }
                }
                L(d9Var);
                if (i3 == 0) {
                    fVar = O().g0(d9Var.a, at);
                } else {
                    fVar = i3 == i2 ? O().g0(d9Var.a, ei) : null;
                }
                if (fVar == null) {
                    long j6 = ((j4 / 3600000) + 1) * 3600000;
                    String str10 = bt;
                    String str11 = cs;
                    String str12 = bp;
                    String str13 = fj;
                    if (i3 == 0) {
                        str2 = str13;
                        u(new t8(bq, j4, Long.valueOf(j6), dA), d9Var);
                        if (this.i.r().S(d9Var.b)) {
                            i0();
                            this.i.w().b(d9Var.a);
                        }
                        i0();
                        W();
                        Bundle bundle3 = new Bundle();
                        bundle3.putLong(str12, 1);
                        bundle3.putLong(str11, 1);
                        bundle3.putLong(str7, 0);
                        bundle3.putLong(str6, 0);
                        bundle3.putLong(str5, 0);
                        bundle3.putLong(str, 0);
                        if (this.i.r().Y(d9Var.a)) {
                            j3 = 1;
                            bundle3.putLong(str2, 1);
                        } else {
                            j3 = 1;
                        }
                        if (d9Var.q) {
                            bundle3.putLong(str10, j3);
                        }
                        if (this.i.getContext().getPackageManager() == null) {
                            this.i.e().E().a(eg, k3.B(d9Var.a));
                        } else {
                            try {
                                packageInfo = hq0.a(this.i.getContext()).d(d9Var.a, 0);
                            } catch (PackageManager.NameNotFoundException e3) {
                                this.i.e().E().b(fh, k3.B(d9Var.a), e3);
                                packageInfo = null;
                            }
                            if (packageInfo == null || packageInfo.firstInstallTime == 0) {
                                str3 = str;
                            } else {
                                if (packageInfo.firstInstallTime != packageInfo.lastUpdateTime) {
                                    bundle3.putLong(str7, 1);
                                    z2 = false;
                                } else {
                                    z2 = true;
                                }
                                str3 = str;
                                u(new t8(ep, j4, Long.valueOf(z2 ? 1 : 0), bg), d9Var);
                            }
                            try {
                                applicationInfo = hq0.a(this.i.getContext()).b(d9Var.a, 0);
                            } catch (PackageManager.NameNotFoundException e4) {
                                this.i.e().E().b(H, k3.B(d9Var.a), e4);
                                applicationInfo = null;
                            }
                            if (applicationInfo != null) {
                                if ((applicationInfo.flags & 1) != 0) {
                                    bundle3.putLong(str5, 1);
                                }
                                if ((applicationInfo.flags & 128) != 0) {
                                    bundle3.putLong(str3, 1);
                                }
                            }
                        }
                        n9 O3 = O();
                        String str14 = d9Var.a;
                        u.g(str14);
                        O3.j();
                        O3.t();
                        long C0 = O3.C0(str14, aV);
                        if (C0 >= 0) {
                            bundle3.putLong(str6, C0);
                        }
                        z(new j(bs, new i(bundle3), dl, j4), d9Var);
                    } else {
                        str2 = str13;
                        if (i3 == 1) {
                            u(new t8(bw, j4, Long.valueOf(j6), fc), d9Var);
                            i0();
                            W();
                            Bundle bundle4 = new Bundle();
                            bundle4.putLong(str12, 1);
                            bundle4.putLong(str11, 1);
                            if (this.i.r().Y(d9Var.a)) {
                                j2 = 1;
                                bundle4.putLong(str2, 1);
                            } else {
                                j2 = 1;
                            }
                            if (d9Var.q) {
                                bundle4.putLong(str10, j2);
                            }
                            z(new j(el, new i(bundle4), G, j4), d9Var);
                        }
                    }
                    if (!this.i.r().G(d9Var.a, l.i0)) {
                        Bundle bundle5 = new Bundle();
                        bundle5.putLong(str2, 1);
                        if (this.i.r().Y(d9Var.a)) {
                            bundle5.putLong(av, 1);
                        }
                        z(new j(fb, new i(bundle5), dx, j4), d9Var);
                    }
                } else if (d9Var.i) {
                    z(new j(aT, new i(new Bundle()), dw, j4), d9Var);
                }
                O().y();
            } finally {
                O().w();
            }
        }
    }

    public final void J(g9 g9Var) {
        d9 x2 = x(g9Var.a);
        if (x2 != null) {
            B(g9Var, x2);
        }
    }

    public final void K(Runnable runnable) {
        i0();
        if (this.n == null) {
            this.n = new ArrayList();
        }
        this.n.add(runnable);
    }

    public final u8 M() {
        n(this.g);
        return this.g;
    }

    public final f9 N() {
        n(this.f);
        return this.f;
    }

    public final n9 O() {
        n(this.c);
        return this.c;
    }

    public final j4 P() {
        n(this.a);
        return this.a;
    }

    public final String Q(d9 d9Var) {
        try {
            return (String) this.i.c().v(new q8(this, d9Var)).get(30000, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e2) {
            this.i.e().E().b(C0201.m82(12173), k3.B(d9Var.a), e2);
            return null;
        }
    }

    public final void R(boolean z2) {
        a0();
    }

    public final o3 S() {
        n(this.b);
        return this.b;
    }

    public final u6 V() {
        n(this.h);
        return this.h;
    }

    public final void W() {
        if (!this.j) {
            throw new IllegalStateException(C0201.m82(12174));
        }
    }

    public final void Y() {
        f4 V2;
        String str;
        i0();
        W();
        this.s = true;
        try {
            this.i.a();
            Boolean g0 = this.i.N().g0();
            if (g0 == null) {
                this.i.e().H().d(L);
            } else if (g0.booleanValue()) {
                this.i.e().E().d(fd);
                this.s = false;
                b0();
            } else if (this.m > 0) {
                a0();
                this.s = false;
                b0();
            } else {
                i0();
                if (this.v != null) {
                    this.i.e().M().d(co);
                    this.s = false;
                    b0();
                } else if (!S().y()) {
                    this.i.e().M().d(M);
                    a0();
                    this.s = false;
                    b0();
                } else {
                    long a2 = this.i.b().a();
                    F(null, a2 - i9.z());
                    long a3 = this.i.q().e.a();
                    if (a3 != 0) {
                        this.i.e().L().a(al, Long.valueOf(Math.abs(a2 - a3)));
                    }
                    String e0 = O().e0();
                    if (!TextUtils.isEmpty(e0)) {
                        if (this.x == -1) {
                            this.x = O().m0();
                        }
                        List<Pair<b61, Long>> G2 = O().G(e0, this.i.r().r(e0, l.l), Math.max(0, this.i.r().r(e0, l.m)));
                        if (!G2.isEmpty()) {
                            Iterator<Pair<b61, Long>> it = G2.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    str = null;
                                    break;
                                }
                                b61 b61 = (b61) it.next().first;
                                if (!TextUtils.isEmpty(b61.e2())) {
                                    str = b61.e2();
                                    break;
                                }
                            }
                            if (str != null) {
                                int i2 = 0;
                                while (true) {
                                    if (i2 >= G2.size()) {
                                        break;
                                    }
                                    b61 b612 = (b61) G2.get(i2).first;
                                    if (!(TextUtils.isEmpty(b612.e2()) || b612.e2().equals(str))) {
                                        G2 = G2.subList(0, i2);
                                        break;
                                    }
                                    i2++;
                                }
                            }
                            a61.a G3 = a61.G();
                            int size = G2.size();
                            ArrayList arrayList = new ArrayList(G2.size());
                            boolean z2 = i9.B() && this.i.r().K(e0);
                            for (int i3 = 0; i3 < size; i3++) {
                                b61.a aVar = (b61.a) ((b61) G2.get(i3).first).y();
                                arrayList.add((Long) G2.get(i3).second);
                                aVar.L(this.i.r().q());
                                aVar.D(a2);
                                this.i.a();
                                aVar.l0(false);
                                if (!z2) {
                                    aVar.B0();
                                }
                                if (this.i.r().G(e0, l.r0)) {
                                    aVar.Q(M().v(((b61) ((l91) aVar.G0())).h()));
                                }
                                G3.u(aVar);
                            }
                            String A2 = this.i.e().t(2) ? M().A((a61) ((l91) G3.G0())) : null;
                            M();
                            byte[] h2 = ((a61) ((l91) G3.G0())).h();
                            String a4 = l.v.a(null);
                            try {
                                URL url = new URL(a4);
                                u.a(!arrayList.isEmpty());
                                if (this.v != null) {
                                    this.i.e().E().d(dk);
                                } else {
                                    this.v = new ArrayList(arrayList);
                                }
                                this.i.q().f.b(a2);
                                String str2 = cu;
                                if (size > 0) {
                                    str2 = G3.v(0).U();
                                }
                                this.i.e().M().c(be, str2, Integer.valueOf(h2.length), A2);
                                this.r = true;
                                o3 S2 = S();
                                o8 o8Var = new o8(this, e0);
                                S2.j();
                                S2.t();
                                u.k(url);
                                u.k(h2);
                                u.k(o8Var);
                                S2.c().B(new s3(S2, e0, url, h2, null, o8Var));
                            } catch (MalformedURLException unused) {
                                this.i.e().E().b(ct, k3.B(e0), a4);
                            }
                        }
                    } else {
                        this.x = -1;
                        String D0 = O().D0(a2 - i9.z());
                        if (!TextUtils.isEmpty(D0) && (V2 = O().V(D0)) != null) {
                            s(V2);
                        }
                    }
                    this.s = false;
                    b0();
                }
            }
        } finally {
            this.s = false;
            b0();
        }
    }

    @Override // com.google.android.gms.measurement.internal.n5
    public final h9 a() {
        return this.i.a();
    }

    @Override // com.google.android.gms.measurement.internal.n5
    public final e b() {
        return this.i.b();
    }

    @Override // com.google.android.gms.measurement.internal.n5
    public final i4 c() {
        return this.i.c();
    }

    public final void d() {
        this.i.c().j();
        O().h0();
        if (this.i.q().e.a() == 0) {
            this.i.q().e.b(this.i.b().a());
        }
        a0();
    }

    public final void d0() {
        i0();
        W();
        if (!this.l) {
            this.l = true;
            i0();
            W();
            if ((this.i.r().p(l.m0) || e0()) && c0()) {
                int f2 = f(this.u);
                int H2 = this.i.M().H();
                i0();
                if (f2 > H2) {
                    this.i.e().E().b(C0201.m82(12175), Integer.valueOf(f2), Integer.valueOf(H2));
                } else if (f2 < H2) {
                    if (p(H2, this.u)) {
                        this.i.e().M().b(C0201.m82(12176), Integer.valueOf(f2), Integer.valueOf(H2));
                    } else {
                        this.i.e().E().b(C0201.m82(12177), Integer.valueOf(f2), Integer.valueOf(H2));
                    }
                }
            }
        }
        if (!this.k && !this.i.r().p(l.m0)) {
            this.i.e().K().d(C0201.m82(12178));
            this.k = true;
            a0();
        }
    }

    @Override // com.google.android.gms.measurement.internal.n5
    public final k3 e() {
        return this.i.e();
    }

    public final void f0() {
        this.p++;
    }

    public final o4 g0() {
        return this.i;
    }

    @Override // com.google.android.gms.measurement.internal.n5
    public final Context getContext() {
        return this.i.getContext();
    }

    /* JADX INFO: finally extract failed */
    public final void i(int i2, Throwable th, byte[] bArr, String str) {
        i0();
        W();
        if (bArr == null) {
            try {
                bArr = new byte[0];
            } catch (Throwable th2) {
                this.r = false;
                b0();
                throw th2;
            }
        }
        List<Long> list = this.v;
        this.v = null;
        boolean z2 = true;
        if ((i2 == 200 || i2 == 204) && th == null) {
            try {
                this.i.q().e.b(this.i.b().a());
                this.i.q().f.b(0);
                a0();
                this.i.e().M().b(C0201.m82(12179), Integer.valueOf(i2), Integer.valueOf(bArr.length));
                O().v();
                try {
                    for (Long l2 : list) {
                        try {
                            n9 O2 = O();
                            long longValue = l2.longValue();
                            O2.j();
                            O2.t();
                            try {
                                if (O2.x().delete(C0201.m82(12180), C0201.m82(12181), new String[]{String.valueOf(longValue)}) != 1) {
                                    throw new SQLiteException(C0201.m82(12182));
                                }
                            } catch (SQLiteException e2) {
                                O2.e().E().a(C0201.m82(12183), e2);
                                throw e2;
                            }
                        } catch (SQLiteException e3) {
                            if (this.w == null || !this.w.contains(l2)) {
                                throw e3;
                            }
                        }
                    }
                    O().y();
                    O().w();
                    this.w = null;
                    if (!S().y() || !Z()) {
                        this.x = -1;
                        a0();
                    } else {
                        Y();
                    }
                    this.m = 0;
                } catch (Throwable th3) {
                    O().w();
                    throw th3;
                }
            } catch (SQLiteException e4) {
                this.i.e().E().a(C0201.m82(12184), e4);
                this.m = this.i.b().b();
                this.i.e().M().a(C0201.m82(12185), Long.valueOf(this.m));
            }
        } else {
            this.i.e().M().b(C0201.m82(12186), Integer.valueOf(i2), th);
            this.i.q().f.b(this.i.b().a());
            if (!(i2 == 503 || i2 == 429)) {
                z2 = false;
            }
            if (z2) {
                this.i.q().g.b(this.i.b().a());
            }
            O().d0(list);
            a0();
        }
        this.r = false;
        b0();
    }

    public final i3 j0() {
        return this.i.S();
    }

    public final y8 k0() {
        return this.i.T();
    }

    public final i9 r() {
        return this.i.r();
    }

    public final void t(n8 n8Var) {
        this.o++;
    }

    public final void u(t8 t8Var, d9 d9Var) {
        f g0;
        i0();
        W();
        if (TextUtils.isEmpty(d9Var.b) && TextUtils.isEmpty(d9Var.u)) {
            return;
        }
        if (!d9Var.h) {
            L(d9Var);
            return;
        }
        int a0 = this.i.T().a0(t8Var.b);
        if (a0 != 0) {
            this.i.T();
            String y2 = y8.y(t8Var.b, 24, true);
            String str = t8Var.b;
            this.i.T().I(d9Var.a, a0, B, y2, str != null ? str.length() : 0);
            return;
        }
        int g02 = this.i.T().g0(t8Var.b, t8Var.o());
        if (g02 != 0) {
            this.i.T();
            String y3 = y8.y(t8Var.b, 24, true);
            Object o2 = t8Var.o();
            this.i.T().I(d9Var.a, g02, ds, y3, (o2 == null || (!(o2 instanceof String) && !(o2 instanceof CharSequence))) ? 0 : String.valueOf(o2).length());
            return;
        }
        Object n0 = this.i.T().n0(t8Var.b, t8Var.o());
        if (n0 != null) {
            if (dr.equals(t8Var.b) && this.i.r().V(d9Var.a)) {
                long j2 = t8Var.c;
                String str2 = t8Var.f;
                long j3 = 0;
                v8 x0 = O().x0(d9Var.a, ez);
                if (x0 != null) {
                    Object obj = x0.e;
                    if (obj instanceof Long) {
                        j3 = ((Long) obj).longValue();
                        u(new t8(aW, j2, Long.valueOf(j3 + 1), str2), d9Var);
                    }
                }
                if (x0 != null) {
                    this.i.e().H().a(aI, x0.e);
                }
                if (this.i.r().G(d9Var.a, l.e0) && (g0 = O().g0(d9Var.a, aL)) != null) {
                    j3 = g0.c;
                    this.i.e().M().a(by, Long.valueOf(j3));
                }
                u(new t8(aW, j2, Long.valueOf(j3 + 1), str2), d9Var);
            }
            v8 v8Var = new v8(d9Var.a, t8Var.f, t8Var.b, t8Var.c, n0);
            this.i.e().L().b(ec, this.i.S().x(v8Var.c), n0);
            O().v();
            try {
                L(d9Var);
                boolean O2 = O().O(v8Var);
                O().y();
                if (O2) {
                    this.i.e().L().b(ej, this.i.S().x(v8Var.c), v8Var.e);
                } else {
                    this.i.e().E().b(bh, this.i.S().x(v8Var.c), v8Var.e);
                    this.i.T().I(d9Var.a, 9, null, null, 0);
                }
            } finally {
                O().w();
            }
        }
    }

    public final void v(g9 g9Var, d9 d9Var) {
        u.k(g9Var);
        u.g(g9Var.a);
        u.k(g9Var.b);
        u.k(g9Var.c);
        u.g(g9Var.c.b);
        i0();
        W();
        if (TextUtils.isEmpty(d9Var.b) && TextUtils.isEmpty(d9Var.u)) {
            return;
        }
        if (!d9Var.h) {
            L(d9Var);
            return;
        }
        g9 g9Var2 = new g9(g9Var);
        boolean z2 = false;
        g9Var2.e = false;
        O().v();
        try {
            g9 y0 = O().y0(g9Var2.a, g9Var2.c.b);
            if (y0 != null && !y0.b.equals(g9Var2.b)) {
                this.i.e().H().c(C0201.m82(12187), this.i.S().x(g9Var2.c.b), g9Var2.b, y0.b);
            }
            if (y0 != null && y0.e) {
                g9Var2.b = y0.b;
                g9Var2.d = y0.d;
                g9Var2.h = y0.h;
                g9Var2.f = y0.f;
                g9Var2.i = y0.i;
                g9Var2.e = y0.e;
                g9Var2.c = new t8(g9Var2.c.b, y0.c.c, g9Var2.c.o(), y0.c.f);
            } else if (TextUtils.isEmpty(g9Var2.f)) {
                g9Var2.c = new t8(g9Var2.c.b, g9Var2.d, g9Var2.c.o(), g9Var2.c.f);
                g9Var2.e = true;
                z2 = true;
            }
            if (g9Var2.e) {
                t8 t8Var = g9Var2.c;
                v8 v8Var = new v8(g9Var2.a, g9Var2.b, t8Var.b, t8Var.c, t8Var.o());
                if (O().O(v8Var)) {
                    this.i.e().L().c(C0201.m82(12188), g9Var2.a, this.i.S().x(v8Var.c), v8Var.e);
                } else {
                    this.i.e().E().c(C0201.m82(12189), k3.B(g9Var2.a), this.i.S().x(v8Var.c), v8Var.e);
                }
                if (z2 && g9Var2.i != null) {
                    C(new j(g9Var2.i, g9Var2.d), d9Var);
                }
            }
            if (O().P(g9Var2)) {
                this.i.e().L().c(C0201.m82(12190), g9Var2.a, this.i.S().x(g9Var2.c.b), g9Var2.c.o());
            } else {
                this.i.e().E().c(C0201.m82(12191), k3.B(g9Var2.a), this.i.S().x(g9Var2.c.b), g9Var2.c.o());
            }
            O().y();
        } finally {
            O().w();
        }
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x014e  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0163  */
    public final void w(String str, int i2, Throwable th, byte[] bArr, Map<String, List<String>> map) {
        i0();
        W();
        u.g(str);
        if (bArr == null) {
            try {
                bArr = new byte[0];
            } catch (Throwable th2) {
                this.q = false;
                b0();
                throw th2;
            }
        }
        this.i.e().M().a(C0201.m82(12192), Integer.valueOf(bArr.length));
        O().v();
        try {
            f4 V2 = O().V(str);
            boolean z2 = true;
            boolean z3 = (i2 == 200 || i2 == 204 || i2 == 304) && th == null;
            if (V2 == null) {
                this.i.e().H().a(C0201.m82(12193), k3.B(str));
            } else {
                if (!z3) {
                    if (i2 != 404) {
                        V2.c0(this.i.b().a());
                        O().K(V2);
                        this.i.e().M().b(C0201.m82(12194), Integer.valueOf(i2), th);
                        P().C(str);
                        this.i.q().f.b(this.i.b().a());
                        if (i2 != 503) {
                            if (i2 != 429) {
                                z2 = false;
                            }
                        }
                        if (z2) {
                            this.i.q().g.b(this.i.b().a());
                        }
                        a0();
                    }
                }
                List<String> list = map != null ? map.get(C0201.m82(12195)) : null;
                String str2 = (list == null || list.size() <= 0) ? null : list.get(0);
                if (i2 != 404) {
                    if (i2 != 304) {
                        if (!P().y(str, bArr, str2)) {
                            O().w();
                            this.q = false;
                            b0();
                            return;
                        }
                        V2.b0(this.i.b().a());
                        O().K(V2);
                        if (i2 != 404) {
                            this.i.e().J().a(C0201.m82(12196), str);
                        } else {
                            this.i.e().M().b(C0201.m82(12197), Integer.valueOf(i2), Integer.valueOf(bArr.length));
                        }
                        if (S().y() || !Z()) {
                            a0();
                        } else {
                            Y();
                        }
                    }
                }
                if (P().A(str) == null && !P().y(str, null, null)) {
                    O().w();
                    this.q = false;
                    b0();
                    return;
                }
                V2.b0(this.i.b().a());
                O().K(V2);
                if (i2 != 404) {
                }
                if (S().y()) {
                }
                a0();
            }
            O().y();
            O().w();
            this.q = false;
            b0();
        } catch (Throwable th3) {
            O().w();
            throw th3;
        }
    }

    public final void z(j jVar, d9 d9Var) {
        List<g9> list;
        List<g9> list2;
        List<g9> list3;
        List<String> list4;
        j jVar2 = jVar;
        u.k(d9Var);
        u.g(d9Var.a);
        i0();
        W();
        String str = d9Var.a;
        long j2 = jVar2.d;
        if (M().S(jVar2, d9Var)) {
            if (!d9Var.h) {
                L(d9Var);
                return;
            }
            if (this.i.r().G(str, l.w0) && (list4 = d9Var.x) != null) {
                if (list4.contains(jVar2.a)) {
                    Bundle w2 = jVar2.b.w();
                    w2.putLong(ad, 1);
                    jVar2 = new j(jVar2.a, new i(w2), jVar2.c, jVar2.d);
                } else {
                    this.i.e().L().c(ab, str, jVar2.a, jVar2.c);
                    return;
                }
            }
            O().v();
            try {
                n9 O2 = O();
                u.g(str);
                O2.j();
                O2.t();
                if (j2 < 0) {
                    O2.e().H().b(en, k3.B(str), Long.valueOf(j2));
                    list = Collections.emptyList();
                } else {
                    list = O2.c0(W, new String[]{str, String.valueOf(j2)});
                }
                for (g9 g9Var : list) {
                    if (g9Var != null) {
                        this.i.e().L().c(aD, g9Var.a, this.i.S().x(g9Var.c.b), g9Var.c.o());
                        if (g9Var.g != null) {
                            C(new j(g9Var.g, j2), d9Var);
                        }
                        O().z0(str, g9Var.c.b);
                    }
                }
                n9 O3 = O();
                u.g(str);
                O3.j();
                O3.t();
                if (j2 < 0) {
                    O3.e().H().b(da, k3.B(str), Long.valueOf(j2));
                    list2 = Collections.emptyList();
                } else {
                    list2 = O3.c0(eo, new String[]{str, String.valueOf(j2)});
                }
                ArrayList arrayList = new ArrayList(list2.size());
                for (g9 g9Var2 : list2) {
                    if (g9Var2 != null) {
                        this.i.e().L().c(dg, g9Var2.a, this.i.S().x(g9Var2.c.b), g9Var2.c.o());
                        O().w0(str, g9Var2.c.b);
                        if (g9Var2.k != null) {
                            arrayList.add(g9Var2.k);
                        }
                        O().z0(str, g9Var2.c.b);
                    }
                }
                int size = arrayList.size();
                int i2 = 0;
                while (i2 < size) {
                    Object obj = arrayList.get(i2);
                    i2++;
                    C(new j((j) obj, j2), d9Var);
                }
                n9 O4 = O();
                String str2 = jVar2.a;
                u.g(str);
                u.g(str2);
                O4.j();
                O4.t();
                if (j2 < 0) {
                    O4.e().H().c(di, k3.B(str), O4.l().v(str2), Long.valueOf(j2));
                    list3 = Collections.emptyList();
                } else {
                    list3 = O4.c0(aB, new String[]{str, str2, String.valueOf(j2)});
                }
                ArrayList arrayList2 = new ArrayList(list3.size());
                for (g9 g9Var3 : list3) {
                    if (g9Var3 != null) {
                        t8 t8Var = g9Var3.c;
                        v8 v8Var = new v8(g9Var3.a, g9Var3.b, t8Var.b, j2, t8Var.o());
                        if (O().O(v8Var)) {
                            this.i.e().L().c(C, g9Var3.a, this.i.S().x(v8Var.c), v8Var.e);
                        } else {
                            this.i.e().E().c(cg, k3.B(g9Var3.a), this.i.S().x(v8Var.c), v8Var.e);
                        }
                        if (g9Var3.i != null) {
                            arrayList2.add(g9Var3.i);
                        }
                        g9Var3.c = new t8(v8Var);
                        g9Var3.e = true;
                        O().P(g9Var3);
                    }
                }
                C(jVar2, d9Var);
                int size2 = arrayList2.size();
                int i3 = 0;
                while (i3 < size2) {
                    Object obj2 = arrayList2.get(i3);
                    i3++;
                    C(new j((j) obj2, j2), d9Var);
                }
                O().y();
            } finally {
                O().w();
            }
        }
    }

    private m8(s8 s8Var, o4 o4Var) {
        this.j = false;
        u.k(s8Var);
        this.i = o4.g(s8Var.a, null);
        this.x = -1;
        u8 u8Var = new u8(this);
        u8Var.r();
        this.g = u8Var;
        o3 o3Var = new o3(this);
        o3Var.r();
        this.b = o3Var;
        j4 j4Var = new j4(this);
        j4Var.r();
        this.a = j4Var;
        this.i.c().y(new p8(this, s8Var));
    }
}
