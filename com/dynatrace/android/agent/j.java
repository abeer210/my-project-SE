package com.dynatrace.android.agent;

import android.content.Context;
import android.location.Location;
import android.os.Build;
import defpackage.k30;
import java.security.KeyStore;
import java.util.Collections;
import java.util.HashSet;
import java.util.concurrent.atomic.AtomicBoolean;
import vigqyno.C0188;
import vigqyno.C0201;

/* compiled from: Core */
public final class j {
    private static final String a = (u.b + C0201.m82(3269));
    public static j30 b;
    private static f c = null;
    private static long d = 12;
    private static g e = new g(12);
    public static h f = new h(e);
    private static AtomicBoolean g = new AtomicBoolean(true);
    private static b h = b.d();
    private static k i = new k(f);
    private static c j = null;
    private static s20 k;

    public static m a(String str, int i2, long j2, o oVar, g30 g30, int i3, String... strArr) {
        m mVar;
        m mVar2;
        m mVar3;
        if (u.c) {
            s30.r(a, String.format(C0201.m82(3270), str, Integer.valueOf(i2)));
        }
        long j3 = j2 < 0 ? 0 : j2;
        switch (i2) {
            case 1:
                if (oVar != null) {
                    e.a(oVar);
                }
                mVar = oVar;
                break;
            case 2:
                if (oVar != null) {
                    oVar.C();
                }
                mVar = oVar;
                break;
            case 3:
            case 5:
            default:
                if (u.c) {
                    s30.r(a, String.format(C0201.m82(3271), Integer.valueOf(i2)));
                }
                mVar = null;
                break;
            case 4:
                if (str != null && !str.isEmpty()) {
                    mVar2 = new m(str, 4, t.NAMED_EVENT, j3, g30, i3);
                    e.b();
                    mVar = mVar2;
                    break;
                } else {
                    return null;
                }
            case 6:
                if (str != null && !str.isEmpty()) {
                    mVar = new m(str, 6, t.VALUE_INT64, j3, g30, i3);
                    mVar.a = s30.o(strArr[0], 250);
                    e.b();
                    break;
                } else {
                    return null;
                }
                break;
            case 7:
                if (str != null && !str.isEmpty()) {
                    mVar = new m(str, 6, t.VALUE_DOUBLE, j3, g30, i3);
                    mVar.a = s30.o(strArr[0], 250);
                    e.b();
                    break;
                } else {
                    return null;
                }
            case 8:
                if (str != null && !str.isEmpty()) {
                    mVar = new m(str, 6, t.VALUE_STRING, j3, g30, i3);
                    mVar.a = s30.o(strArr[0], 250);
                    e.b();
                    break;
                } else {
                    return null;
                }
                break;
            case 9:
                if (str != null && !str.isEmpty()) {
                    mVar = new m(str, 6, t.ERROR_INT, j3, g30, i3);
                    mVar.a = s30.o(strArr[0], 250);
                    e.b();
                    break;
                } else {
                    return null;
                }
            case 10:
                if (str != null && !str.isEmpty()) {
                    mVar3 = new s(str, strArr[0], strArr[1], strArr[2], j3, g30, i3, strArr[3]);
                    e.b();
                    mVar = mVar3;
                    break;
                } else {
                    return null;
                }
                break;
            case 11:
                if (str != null && !str.isEmpty()) {
                    mVar3 = new l(str, strArr[0], strArr[1], j3, g30, i3, strArr[2]);
                    e.b();
                    v20.g(strArr[2], str, strArr[0], strArr[1]);
                    mVar = mVar3;
                    break;
                } else {
                    return null;
                }
            case 12:
                mVar2 = new m(str, 12, t.IDENTIFY_USER, j3, g30, i3);
                e.b();
                mVar = mVar2;
                break;
            case 13:
                if (str != null && !str.isEmpty()) {
                    mVar2 = new m(str, 13, t.SELF_MONITORING_EVENT, j3, g30, i3);
                    mVar2.a = s30.o(strArr[0], C0188.f18);
                    e.b();
                    mVar = mVar2;
                    break;
                } else {
                    return null;
                }
        }
        m(mVar, i2);
        return mVar;
    }

    public static void b(n20 n20) {
        h.i(n20);
        long A = (long) (((n20.A() + 10) - 1) / 10);
        d = A;
        e.d(A);
        if (u.c) {
            s30.r(a, String.format(C0201.m82(3272), Long.valueOf(A)));
        }
        u30.n().v(o());
        if (!n20.I()) {
            u30.n().v(false);
        }
        if (n20.K()) {
            b.d().c = n20.B();
        }
    }

    public static void c() {
        g30 b2 = g30.b(true, false);
        int i2 = b.d().c;
        if (u.c) {
            String str = a;
            s30.r(str, C0201.m82(3273) + b2.c);
        }
        l(z.E(b2, i2));
        u30.n().u();
        u(true, b2.c());
    }

    public static void d() {
        if (b != null) {
            k30.c().b();
            e.f();
            f.p();
        }
    }

    public static boolean e() {
        return f.w();
    }

    public static w20 f() {
        return i;
    }

    public static String g(g30 g30) {
        return c.b(g30, false).toString();
    }

    public static b0 h() {
        b0 b0Var;
        int i2;
        g30 g30;
        long j2;
        if (!f.w()) {
            return null;
        }
        o c2 = a.c();
        if (c2 instanceof v) {
            c2 = null;
        }
        if (c2 == null) {
            c2 = p.e0();
        }
        if (c2 != null) {
            j2 = c2.u();
            g30 = c2.h;
            i2 = c2.i;
            b0Var = c2.L();
        } else {
            g30 = null;
            b0Var = null;
            j2 = 0;
            i2 = 0;
        }
        if (b0Var == null) {
            g30 = g30.b(false, false);
            i2 = b.d().c;
            b0Var = new b0(0, i2, g30);
            j2 = 0;
        }
        if (!g30.c().e(t.WEB_REQUEST)) {
            return null;
        }
        m mVar = new m(b0Var.toString(), 100, t.PLACEHOLDER, j2, g30, i2);
        if (j2 == 0) {
            o.G(mVar);
        } else {
            c2.E(mVar);
        }
        if (u.c) {
            s30.r(a, String.format(C0201.m82(3274), mVar.o(), Long.valueOf(mVar.u()), Long.valueOf(mVar.q())));
        }
        return b0Var;
    }

    public static void i(g30 g30) {
        if (b.d().f) {
            k.c(g30);
        }
    }

    public static void j(m mVar) {
        if (mVar.h.c().e(mVar.m())) {
            String sb = mVar.i().toString();
            c.f(false);
            String g2 = g(mVar.h);
            if (u.c) {
                s30.r(a, String.format(C0201.m82(3275), Integer.valueOf(g2.length() + sb.length())));
            }
            k30.c().a(new k30.a(g2, sb, mVar.h, mVar.m().d(), mVar.t(), mVar.r()));
        }
    }

    public static void k(m mVar) {
        e.g(mVar);
    }

    public static void l(m mVar) {
        m(mVar, mVar.v());
    }

    private static void m(m mVar, int i2) {
        if (mVar != null && mVar.x() && mVar.w()) {
            if (c != null) {
                j(mVar);
                if (m.n.get() == 0) {
                    m.n.set(1);
                }
            } else if (mVar instanceof v) {
                e.c(mVar);
                if (m.n.get() == 0) {
                    m.n.set(1);
                }
                if (u.c) {
                    String str = a;
                    s30.r(str, C0201.m82(3276) + mVar.o());
                }
            } else if (u.c) {
                s30.r(a, C0201.m82(3277));
            }
            if (i2 == 2) {
                e.g(mVar);
            }
        }
    }

    public static void n(Location location) {
        if (u.c && location != null) {
            s30.r(a, String.format(C0201.m82(3278), Double.valueOf(location.getLatitude()), Double.valueOf(location.getLongitude())));
        }
        c.e(location);
    }

    public static boolean o() {
        return q(b.d().e().t());
    }

    public static boolean p(g30 g30) {
        return g30.c().e(t.CRASH) && q(b.d().e().y());
    }

    private static boolean q(int i2) {
        if (i2 == 0) {
            return false;
        }
        if (i2 == 1) {
            return true;
        }
        return i2 == 2 && r30.MOBILE != q30.e().c();
    }

    public static boolean r() {
        return q(b.d().e().z());
    }

    public static synchronized void s(long j2) {
        synchronized (j.class) {
            k30.c().d();
            u30.n().v(false);
            f.B(j2);
        }
    }

    public static void t(g30 g30, boolean z) {
        int B = b.d().e().B();
        b.d().c = B;
        c.f(true);
        u30.n().v(true);
        if (b.d().f) {
            if (!z) {
                k.a(h.c());
            }
            k.b(g30, b.k);
        }
        if (g30.c().e(t.ACTION_AUTO_LOADING_APP)) {
            p pVar = new p(C0201.m82(3279) + b.l, g30, B);
            pVar.C();
            pVar.o = s30.c();
            pVar.j = t.ACTION_AUTO_LOADING_APP;
            l(pVar);
        }
        f.C(g30);
        d();
        c cVar = j;
        if (cVar != null) {
            cVar.c(g30, B);
        }
    }

    public static void u(boolean z, l20 l20) {
        long j2;
        long j3;
        g30 g30;
        if (u.c) {
            s30.r(a, C0201.m82(3280) + l20.c().toString());
        }
        if (l20.d()) {
            j3 = b.i();
            if (z && g30.a().b != j3) {
                b.d().g(false);
            }
            j2 = b.l();
            if (j2 < 0) {
                return;
            }
        } else {
            long h2 = b.h();
            b.f();
            b.d().g(true);
            n(null);
            j3 = h2;
            j2 = 1;
        }
        if (z) {
            g30 = g30.k(l20);
        } else {
            g30 = g30.l(l20);
        }
        g30.b = j3;
        g30.c = j2;
        if (!z) {
            g30.f(l20);
        }
        t(g30, z);
    }

    public static void v(Context context, b20 b20) {
        l20 l20;
        if (b20.q) {
            u.c = true;
        }
        if (u.c) {
            String str = a;
            s30.r(str, C0201.m82(3281) + b20);
            s30.v(a, String.format(C0201.m82(3282), b.a(), y.a(), Integer.valueOf(s30.a(context)), Integer.valueOf(Build.VERSION.SDK_INT)));
        }
        p.k0(b20);
        h.h(b20, context);
        b(h.d.d(new h20().a(b20)));
        if (b20.t) {
            l20 = new l20(h.d.i());
        } else {
            h.d.k();
            l20 = l20.b;
        }
        b.k = b20.a;
        q30.e();
        q10.b = b20.a().startsWith(C0201.m82(3283));
        q10.c = !b20.d;
        KeyStore keyStore = b20.e;
        q10.d = keyStore;
        if (keyStore != null) {
            q10.e = b20.f;
        }
        if (g.get()) {
            g30.l(l20);
        } else {
            u30.n().u();
            g30.k(l20);
        }
        b = new j30(context);
        c = new f(false);
        k30.c().start();
        e.d(d);
        f.E(b, b20);
        if (b20.l) {
            v20.f();
            v20.h(f());
        }
        if (b20.p) {
            HashSet hashSet = new HashSet();
            String[] strArr = b20.n;
            if (strArr != null) {
                Collections.addAll(hashSet, strArr);
            }
            if (b20.c == z10.APP_MON) {
                hashSet.add(b20.a());
            }
            hashSet.add(C0201.m82(3284));
            k = new s20(hashSet, b20.c);
        }
        u(false, l20);
        f.D(true);
        g.set(false);
    }
}
