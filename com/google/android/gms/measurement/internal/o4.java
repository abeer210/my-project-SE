package com.google.android.gms.measurement.internal;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.common.internal.u;
import com.google.android.gms.common.util.e;
import com.google.android.gms.common.util.h;
import java.net.URL;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONException;
import org.json.JSONObject;
import vigqyno.C0201;

public class o4 implements n5 {
    private static volatile o4 G;
    private volatile Boolean A;
    private Boolean B;
    private Boolean C;
    private int D;
    private AtomicInteger E = new AtomicInteger(0);
    private final long F;
    private final Context a;
    private final String b;
    private final String c;
    private final String d;
    private final boolean e;
    private final h9 f;
    private final i9 g;
    private final t3 h;
    private final k3 i;
    private final i4 j;
    private final b8 k;
    private final y8 l;
    private final i3 m;
    private final e n;
    private final v6 o;
    private final v5 p;
    private final a q;
    private final q6 r;
    private g3 s;
    private a7 t;
    private d u;
    private c3 v;
    private z3 w;
    private boolean x = false;
    private Boolean y;
    private long z;

    private o4(s5 s5Var) {
        Bundle bundle;
        boolean z2 = false;
        u.k(s5Var);
        h9 h9Var = new h9(s5Var.a);
        this.f = h9Var;
        l.d(h9Var);
        this.a = s5Var.a;
        this.b = s5Var.b;
        this.c = s5Var.c;
        this.d = s5Var.d;
        this.e = s5Var.h;
        this.A = s5Var.e;
        qh1 qh1 = s5Var.g;
        if (!(qh1 == null || (bundle = qh1.g) == null)) {
            Object obj = bundle.get(C0201.m82(16892));
            if (obj instanceof Boolean) {
                this.B = (Boolean) obj;
            }
            Object obj2 = qh1.g.get(C0201.m82(16893));
            if (obj2 instanceof Boolean) {
                this.C = (Boolean) obj2;
            }
        }
        y61.l(this.a);
        e d2 = h.d();
        this.n = d2;
        this.F = d2.a();
        this.g = new i9(this);
        t3 t3Var = new t3(this);
        t3Var.n();
        this.h = t3Var;
        k3 k3Var = new k3(this);
        k3Var.n();
        this.i = k3Var;
        y8 y8Var = new y8(this);
        y8Var.n();
        this.l = y8Var;
        i3 i3Var = new i3(this);
        i3Var.n();
        this.m = i3Var;
        this.q = new a(this);
        v6 v6Var = new v6(this);
        v6Var.v();
        this.o = v6Var;
        v5 v5Var = new v5(this);
        v5Var.v();
        this.p = v5Var;
        b8 b8Var = new b8(this);
        b8Var.v();
        this.k = b8Var;
        q6 q6Var = new q6(this);
        q6Var.n();
        this.r = q6Var;
        i4 i4Var = new i4(this);
        i4Var.n();
        this.j = i4Var;
        qh1 qh12 = s5Var.g;
        if (!(qh12 == null || qh12.b == 0)) {
            z2 = true;
        }
        boolean z3 = !z2;
        if (this.a.getApplicationContext() instanceof Application) {
            v5 L = L();
            if (L.getContext().getApplicationContext() instanceof Application) {
                Application application = (Application) L.getContext().getApplicationContext();
                if (L.c == null) {
                    L.c = new o6(L, null);
                }
                if (z3) {
                    application.unregisterActivityLifecycleCallbacks(L.c);
                    application.registerActivityLifecycleCallbacks(L.c);
                    L.e().M().d(C0201.m82(16894));
                }
            }
        } else {
            e().H().d(C0201.m82(16895));
        }
        this.j.y(new q4(this, s5Var));
    }

    public static o4 g(Context context, qh1 qh1) {
        Bundle bundle;
        if (qh1 != null && (qh1.e == null || qh1.f == null)) {
            qh1 = new qh1(qh1.a, qh1.b, qh1.c, qh1.d, null, null, qh1.g);
        }
        u.k(context);
        u.k(context.getApplicationContext());
        if (G == null) {
            synchronized (o4.class) {
                if (G == null) {
                    G = new o4(new s5(context, qh1));
                }
            }
        } else if (!(qh1 == null || (bundle = qh1.g) == null || !bundle.containsKey(C0201.m82(16896)))) {
            G.p(qh1.g.getBoolean(C0201.m82(16897)));
        }
        return G;
    }

    public static o4 h(Context context, String str, String str2, Bundle bundle) {
        return g(context, new qh1(0, 0, true, null, null, null, bundle));
    }

    private static void l(f5 f5Var) {
        if (f5Var == null) {
            throw new IllegalStateException(C0201.m82(16899));
        } else if (!f5Var.w()) {
            String valueOf = String.valueOf(f5Var.getClass());
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 27);
            sb.append(C0201.m82(16898));
            sb.append(valueOf);
            throw new IllegalStateException(sb.toString());
        }
    }

    private static void m(k5 k5Var) {
        if (k5Var == null) {
            throw new IllegalStateException(C0201.m82(16901));
        } else if (!k5Var.o()) {
            String valueOf = String.valueOf(k5Var.getClass());
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 27);
            sb.append(C0201.m82(16900));
            sb.append(valueOf);
            throw new IllegalStateException(sb.toString());
        }
    }

    private static void n(l5 l5Var) {
        if (l5Var == null) {
            throw new IllegalStateException(C0201.m82(16902));
        }
    }

    /* access modifiers changed from: private */
    public final void o(s5 s5Var) {
        m3 m3Var;
        String str;
        c().j();
        i9.s();
        d dVar = new d(this);
        dVar.n();
        this.u = dVar;
        c3 c3Var = new c3(this, s5Var.f);
        c3Var.v();
        this.v = c3Var;
        g3 g3Var = new g3(this);
        g3Var.v();
        this.s = g3Var;
        a7 a7Var = new a7(this);
        a7Var.v();
        this.t = a7Var;
        this.l.q();
        this.h.q();
        this.w = new z3(this);
        this.v.y();
        e().K().a(C0201.m82(16903), Long.valueOf(this.g.q()));
        e().K().d(C0201.m82(16904));
        String C2 = c3Var.C();
        if (TextUtils.isEmpty(this.b)) {
            if (T().f0(C2)) {
                m3Var = e().K();
                str = C0201.m82(16905);
            } else {
                m3 K = e().K();
                String r1 = C0201.m82(16906);
                String valueOf = String.valueOf(C2);
                str = valueOf.length() != 0 ? r1.concat(valueOf) : new String(r1);
                m3Var = K;
            }
            m3Var.d(str);
        }
        e().L().d(C0201.m82(16907));
        if (this.D != this.E.get()) {
            e().E().b(C0201.m82(16908), Integer.valueOf(this.D), Integer.valueOf(this.E.get()));
        }
        this.x = true;
    }

    private final void u() {
        if (!this.x) {
            throw new IllegalStateException(C0201.m82(16909));
        }
    }

    private final q6 y() {
        m(this.r);
        return this.r;
    }

    public final String A() {
        return this.b;
    }

    public final String B() {
        return this.c;
    }

    public final String C() {
        return this.d;
    }

    public final boolean D() {
        return this.e;
    }

    public final boolean E() {
        return this.A != null && this.A.booleanValue();
    }

    public final long F() {
        Long valueOf = Long.valueOf(q().j.a());
        if (valueOf.longValue() == 0) {
            return this.F;
        }
        return Math.min(this.F, valueOf.longValue());
    }

    public final void G() {
        this.E.incrementAndGet();
    }

    public final boolean H() {
        u();
        c().j();
        Boolean bool = this.y;
        if (bool == null || this.z == 0 || (bool != null && !bool.booleanValue() && Math.abs(this.n.b() - this.z) > 1000)) {
            this.z = this.n.b();
            boolean z2 = true;
            Boolean valueOf = Boolean.valueOf(T().d0(C0201.m82(16910)) && T().d0(C0201.m82(16911)) && (hq0.a(this.a).f() || this.g.C() || (e4.b(this.a) && y8.V(this.a, false))));
            this.y = valueOf;
            if (valueOf.booleanValue()) {
                if (!T().y0(M().B(), M().D()) && TextUtils.isEmpty(M().D())) {
                    z2 = false;
                }
                this.y = Boolean.valueOf(z2);
            }
        }
        return this.y.booleanValue();
    }

    public final void I() {
        throw new IllegalStateException(C0201.m82(16912));
    }

    public final void J() {
    }

    public final a K() {
        a aVar = this.q;
        if (aVar != null) {
            return aVar;
        }
        throw new IllegalStateException(C0201.m82(16913));
    }

    public final v5 L() {
        l(this.p);
        return this.p;
    }

    public final c3 M() {
        l(this.v);
        return this.v;
    }

    public final a7 N() {
        l(this.t);
        return this.t;
    }

    public final v6 O() {
        l(this.o);
        return this.o;
    }

    public final g3 P() {
        l(this.s);
        return this.s;
    }

    public final b8 Q() {
        l(this.k);
        return this.k;
    }

    public final d R() {
        m(this.u);
        return this.u;
    }

    public final i3 S() {
        n(this.m);
        return this.m;
    }

    public final y8 T() {
        n(this.l);
        return this.l;
    }

    @Override // com.google.android.gms.measurement.internal.n5
    public final h9 a() {
        return this.f;
    }

    @Override // com.google.android.gms.measurement.internal.n5
    public final e b() {
        return this.n;
    }

    @Override // com.google.android.gms.measurement.internal.n5
    public final i4 c() {
        m(this.j);
        return this.j;
    }

    public final boolean d() {
        boolean z2;
        c().j();
        u();
        if (this.g.p(l.l0)) {
            if (this.g.v()) {
                return false;
            }
            Boolean bool = this.C;
            if (bool != null && bool.booleanValue()) {
                return false;
            }
            Boolean H = q().H();
            if (H != null) {
                return H.booleanValue();
            }
            Boolean w2 = this.g.w();
            if (w2 != null) {
                return w2.booleanValue();
            }
            Boolean bool2 = this.B;
            if (bool2 != null) {
                return bool2.booleanValue();
            }
            if (com.google.android.gms.common.api.internal.h.d()) {
                return false;
            }
            if (!this.g.p(l.g0) || this.A == null) {
                return true;
            }
            return this.A.booleanValue();
        } else if (this.g.v()) {
            return false;
        } else {
            Boolean w3 = this.g.w();
            if (w3 != null) {
                z2 = w3.booleanValue();
            } else {
                z2 = !com.google.android.gms.common.api.internal.h.d();
                if (z2 && this.A != null && l.g0.a(null).booleanValue()) {
                    z2 = this.A.booleanValue();
                }
            }
            return q().A(z2);
        }
    }

    @Override // com.google.android.gms.measurement.internal.n5
    public final k3 e() {
        m(this.i);
        return this.i;
    }

    public final void f() {
        c().j();
        if (q().e.a() == 0) {
            q().e.b(this.n.a());
        }
        if (Long.valueOf(q().j.a()).longValue() == 0) {
            e().M().a(C0201.m82(16914), Long.valueOf(this.F));
            q().j.b(this.F);
        }
        if (H()) {
            if (!TextUtils.isEmpty(M().B()) || !TextUtils.isEmpty(M().D())) {
                T();
                if (y8.N(M().B(), q().D(), M().D(), q().E())) {
                    e().K().d(C0201.m82(16922));
                    q().G();
                    P().C();
                    this.t.B();
                    this.t.f0();
                    q().j.b(this.F);
                    q().l.a(null);
                }
                q().x(M().B());
                q().y(M().D());
            }
            L().l0(q().l.b());
            if (!TextUtils.isEmpty(M().B()) || !TextUtils.isEmpty(M().D())) {
                boolean d2 = d();
                if (!q().K() && !this.g.v()) {
                    q().B(!d2);
                }
                if (d2) {
                    L().A0();
                }
                N().P(new AtomicReference<>());
            }
        } else if (d()) {
            if (!T().d0(C0201.m82(16915))) {
                e().E().d(C0201.m82(16916));
            }
            if (!T().d0(C0201.m82(16917))) {
                e().E().d(C0201.m82(16918));
            }
            if (!hq0.a(this.a).f() && !this.g.C()) {
                if (!e4.b(this.a)) {
                    e().E().d(C0201.m82(16919));
                }
                if (!y8.V(this.a, false)) {
                    e().E().d(C0201.m82(16920));
                }
            }
            e().E().d(C0201.m82(16921));
        }
        q().t.b(this.g.p(l.t0));
        q().u.b(this.g.p(l.u0));
    }

    @Override // com.google.android.gms.measurement.internal.n5
    public final Context getContext() {
        return this.a;
    }

    public final void i(jh1 jh1) {
        c().j();
        m(y());
        String C2 = M().C();
        Pair<String, Boolean> v2 = q().v(C2);
        boolean booleanValue = this.g.x().booleanValue();
        String r2 = C0201.m82(16923);
        if (!booleanValue || ((Boolean) v2.second).booleanValue()) {
            e().L().d(C0201.m82(16925));
            T().T(jh1, r2);
        } else if (!y().w()) {
            e().H().d(C0201.m82(16924));
            T().T(jh1, r2);
        } else {
            URL z2 = T().z(M().g().q(), C2, (String) v2.first);
            q6 y2 = y();
            n4 n4Var = new n4(this, jh1);
            y2.j();
            y2.p();
            u.k(z2);
            u.k(n4Var);
            y2.c().B(new s6(y2, C2, z2, null, null, n4Var));
        }
    }

    public final /* synthetic */ void j(jh1 jh1, String str, int i2, Throwable th, byte[] bArr, Map map) {
        List<ResolveInfo> queryIntentActivities;
        String r9 = C0201.m82(16926);
        String r13 = C0201.m82(16927);
        boolean z2 = true;
        boolean z3 = (i2 == 200 || i2 == 204 || i2 == 304) && th == null;
        String r3 = C0201.m82(16928);
        if (!z3) {
            e().H().b(C0201.m82(16929), Integer.valueOf(i2), th);
            T().T(jh1, r3);
        } else if (bArr.length == 0) {
            T().T(jh1, r3);
        } else {
            try {
                JSONObject jSONObject = new JSONObject(new String(bArr));
                String optString = jSONObject.optString(r13, r3);
                String optString2 = jSONObject.optString(r9, r3);
                y8 T = T();
                T.h();
                if (TextUtils.isEmpty(optString) || (queryIntentActivities = T.getContext().getPackageManager().queryIntentActivities(new Intent(C0201.m82(16930), Uri.parse(optString)), 0)) == null || queryIntentActivities.isEmpty()) {
                    z2 = false;
                }
                if (!z2) {
                    e().H().b(C0201.m82(16931), optString2, optString);
                    T().T(jh1, r3);
                    return;
                }
                Bundle bundle = new Bundle();
                bundle.putString(r13, optString);
                bundle.putString(r9, optString2);
                this.p.I(C0201.m82(16932), C0201.m82(16933), bundle);
                T().T(jh1, optString);
            } catch (JSONException e2) {
                e().E().a(C0201.m82(16934), e2);
                T().T(jh1, r3);
            }
        }
    }

    public final void p(boolean z2) {
        this.A = Boolean.valueOf(z2);
    }

    public final t3 q() {
        n(this.h);
        return this.h;
    }

    public final i9 r() {
        return this.g;
    }

    public final void s(f5 f5Var) {
        this.D++;
    }

    public final void t(k5 k5Var) {
        this.D++;
    }

    public final k3 v() {
        k3 k3Var = this.i;
        if (k3Var == null || !k3Var.o()) {
            return null;
        }
        return this.i;
    }

    public final z3 w() {
        return this.w;
    }

    public final i4 x() {
        return this.j;
    }

    public final boolean z() {
        return TextUtils.isEmpty(this.b);
    }
}
