package com.dynatrace.android.agent;

import android.content.Context;
import android.location.Location;
import defpackage.r20;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import vigqyno.C0188;
import vigqyno.C0201;

/* compiled from: Dynatrace */
public class q {
    public static final String a = (b.a() + C0201.m82(1745));
    private static final String b = (u.b + C0201.m82(1746));
    private static final Object c = new Object();
    private static AtomicBoolean d = new AtomicBoolean(false);

    public static void a(r20 r20) {
        if (d.get() && b.d().b().t && !r20.equals(i())) {
            b.d().d.p(r20);
            u30.n().u();
            j.u(true, new l20(r20));
        }
    }

    public static void b() {
        j.u(true, g30.a().c());
    }

    public static void c() {
        if (e()) {
            j.c();
        }
    }

    public static void d() {
        j.d();
    }

    public static boolean e() {
        if (!d.get()) {
            return false;
        }
        return j.e();
    }

    @Deprecated
    public static f20 f() {
        if (d.get()) {
            return i().f();
        }
        throw new IllegalStateException(a);
    }

    public static String g() {
        return b0.i(j.h());
    }

    public static String h() {
        return C0201.m82(1747);
    }

    public static r20 i() {
        if (!d.get()) {
            return l20.b.c();
        }
        return g30.a().c().c();
    }

    public static void j(String str) {
        k(str, null);
    }

    public static void k(String str, n nVar) {
        long j;
        int i;
        g30 g30;
        if (e()) {
            o oVar = null;
            if (nVar instanceof o) {
                oVar = (o) nVar;
                if (oVar.u >= 10) {
                    return;
                }
            }
            if (oVar == null || oVar.x()) {
                g30 = g30.b(false, false);
                i = b.d().c;
                j = 0;
            } else {
                j = oVar.u();
                g30 = oVar.h;
                i = oVar.r();
            }
            m a2 = j.a(str, 12, j, oVar, g30, i, new String[0]);
            if (a2 != null && j != 0) {
                oVar.E(a2);
            }
        }
    }

    public static n l(String str) {
        p e0 = p.e0();
        if (e0 != null) {
            return o.J(str, e0);
        }
        p c0 = p.c0(str, g30.b(false, true), b.d().c);
        c0.m0(C0188.f18);
        return c0;
    }

    @Deprecated
    public static boolean m() {
        if (d.get()) {
            return i().h();
        }
        throw new IllegalStateException(a);
    }

    public static void n() {
        if (d.get()) {
            if (b.d().e) {
                j.f.F();
            }
            j.d();
        }
    }

    public static void o(y20 y20, String str, String str2, String str3) {
        if (y20 != null && str != null) {
            p(str, 11, s30.o(str2, C0188.f18), s30.o(str3, 128000), y20.b());
        }
    }

    private static void p(String str, int i, String... strArr) {
        if (e()) {
            g30 b2 = g30.b(false, false);
            if (j.p(b2)) {
                j.a(str, i, 0, null, b2, b.d().c, strArr);
            }
        }
    }

    public static void q(y20 y20, String str, String str2, String str3, String str4) {
        if (y20 != null && str != null) {
            s(str, 10, s30.o(str2, 250), s30.o(str3, C0188.f18), s30.o(str4, 128000), y20.b());
        }
    }

    public static void r(String str, int i) {
        s(str, 9, String.valueOf(i));
    }

    private static void s(String str, int i, String... strArr) {
        if (e() && j.r()) {
            j.a(str, i, 0, null, g30.b(false, false), b.d().c, strArr);
        }
    }

    public static void t() {
        if (d.get()) {
            j30 j30 = j.b;
            if (j30 != null) {
                j30.d(x.a(), b.d().e().H());
            }
            j.f.D(false);
        }
    }

    public static void u(Map<String, String> map) {
        if (map == null || map.isEmpty()) {
            q10.a = null;
            return;
        }
        q10.a = new HashMap(map);
        if (d.get()) {
            j.f.y();
        }
    }

    @Deprecated
    public static void v(boolean z) {
        if (d.get()) {
            r20.b i = i().i();
            i.e(z);
            a(i.d());
            return;
        }
        throw new IllegalStateException(a);
    }

    @Deprecated
    public static void w(f20 f20) {
        if (d.get()) {
            r20.b i = i().i();
            i.f(f20);
            a(i.d());
            return;
        }
        throw new IllegalStateException(a);
    }

    public static void x(Location location) {
        j.n(location);
    }

    public static void y(Context context, b20 b20) {
        if (context != null && b20 != null && s30.f(context)) {
            synchronized (c) {
                if (!d.get()) {
                    try {
                        j.v(context, b20);
                        d.set(true);
                    } catch (Exception e) {
                        if (u.c) {
                            s30.s(b, C0201.m82(1748), e);
                        }
                    }
                }
            }
        }
    }
}
