package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.os.RemoteException;
import com.google.android.gms.common.internal.u;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import vigqyno.C0201;

public final class a7 extends f5 {
    public static final String b = null;
    public static final String j = null;
    public static final String k = null;
    public static final String l = null;
    private final s7 c;
    private b3 d;
    private volatile Boolean e;
    private final b f;
    private final j8 g;
    private final List<Runnable> h = new ArrayList();
    private final b i;

    static {
        C0201.m83(a7.class, 10);
    }

    public a7(o4 o4Var) {
        super(o4Var);
        this.g = new j8(o4Var.b());
        this.c = new s7(this);
        this.f = new z6(this, o4Var);
        this.i = new k7(this, o4Var);
    }

    /* access modifiers changed from: private */
    public final void E(ComponentName componentName) {
        j();
        if (this.d != null) {
            this.d = null;
            e().M().a(C0201.m82(4252), componentName);
            j();
            f0();
        }
    }

    private final void Y(Runnable runnable) throws IllegalStateException {
        j();
        if (D()) {
            runnable.run();
        } else if (((long) this.h.size()) >= 1000) {
            e().E().d(C0201.m82(4253));
        } else {
            this.h.add(runnable);
            this.i.f(60000);
            f0();
        }
    }

    private final d9 a0(boolean z) {
        a();
        return q().E(z ? e().O() : null);
    }

    private final boolean d0() {
        a();
        return true;
    }

    /* access modifiers changed from: private */
    public final void e0() {
        j();
        this.g.b();
        this.f.f(l.L.a(null).longValue());
    }

    /* access modifiers changed from: private */
    public final void h0() {
        j();
        if (D()) {
            e().M().d(C0201.m82(4254));
            B();
        }
    }

    /* access modifiers changed from: private */
    public final void i0() {
        j();
        e().M().a(C0201.m82(4255), Integer.valueOf(this.h.size()));
        for (Runnable runnable : this.h) {
            try {
                runnable.run();
            } catch (Exception e2) {
                e().E().a(C0201.m82(4256), e2);
            }
        }
        this.h.clear();
        this.i.a();
    }

    public final void B() {
        j();
        x();
        this.c.c();
        try {
            aq0.b().c(getContext(), this.c);
        } catch (IllegalArgumentException | IllegalStateException unused) {
        }
        this.d = null;
    }

    public final void C(jh1 jh1) {
        j();
        x();
        Y(new g7(this, a0(false), jh1));
    }

    public final boolean D() {
        j();
        x();
        return this.d != null;
    }

    public final void F() {
        j();
        h();
        x();
        d9 a0 = a0(false);
        if (d0()) {
            t().C();
        }
        Y(new d7(this, a0));
    }

    public final void I(jh1 jh1, j jVar, String str) {
        j();
        x();
        if (m().l0(12451000) != 0) {
            e().H().d(C0201.m82(4257));
            m().H(jh1, new byte[0]);
            return;
        }
        Y(new h7(this, jVar, str, jh1));
    }

    public final void J(jh1 jh1, String str, String str2) {
        j();
        x();
        Y(new n7(this, str, str2, a0(false), jh1));
    }

    public final void K(jh1 jh1, String str, String str2, boolean z) {
        j();
        x();
        Y(new p7(this, str, str2, z, a0(false), jh1));
    }

    public final void L(b3 b3Var) {
        j();
        u.k(b3Var);
        this.d = b3Var;
        e0();
        i0();
    }

    public final void M(b3 b3Var, ip0 ip0, d9 d9Var) {
        int i2;
        List<ip0> H;
        j();
        h();
        x();
        boolean d0 = d0();
        int i3 = 0;
        int i4 = 100;
        while (i3 < 1001 && i4 == 100) {
            ArrayList arrayList = new ArrayList();
            if (!d0 || (H = t().H(100)) == null) {
                i2 = 0;
            } else {
                arrayList.addAll(H);
                i2 = H.size();
            }
            if (ip0 != null && i2 < 100) {
                arrayList.add(ip0);
            }
            int size = arrayList.size();
            int i5 = 0;
            while (i5 < size) {
                Object obj = arrayList.get(i5);
                i5++;
                ip0 ip02 = (ip0) obj;
                if (ip02 instanceof j) {
                    try {
                        b3Var.p3((j) ip02, d9Var);
                    } catch (RemoteException e2) {
                        e().E().a(j, e2);
                    }
                } else if (ip02 instanceof t8) {
                    try {
                        b3Var.g2((t8) ip02, d9Var);
                    } catch (RemoteException e3) {
                        e().E().a(l, e3);
                    }
                } else if (ip02 instanceof g9) {
                    try {
                        b3Var.q0((g9) ip02, d9Var);
                    } catch (RemoteException e4) {
                        e().E().a(k, e4);
                    }
                } else {
                    e().E().d(b);
                }
            }
            i3++;
            i4 = i2;
        }
    }

    public final void N(w6 w6Var) {
        j();
        x();
        Y(new i7(this, w6Var));
    }

    public final void P(AtomicReference<String> atomicReference) {
        j();
        x();
        Y(new c7(this, atomicReference, a0(false)));
    }

    public final void Q(AtomicReference<List<g9>> atomicReference, String str, String str2, String str3) {
        j();
        x();
        Y(new o7(this, atomicReference, str, str2, str3, a0(false)));
    }

    public final void R(AtomicReference<List<t8>> atomicReference, String str, String str2, String str3, boolean z) {
        j();
        x();
        Y(new q7(this, atomicReference, str, str2, str3, z, a0(false)));
    }

    public final void T(t8 t8Var) {
        j();
        x();
        Y(new b7(this, d0() && t().G(t8Var), t8Var, a0(true)));
    }

    public final void U(j jVar, String str) {
        u.k(jVar);
        j();
        x();
        boolean d0 = d0();
        Y(new m7(this, d0, d0 && t().F(jVar), jVar, a0(true), str));
    }

    public final void X(g9 g9Var) {
        u.k(g9Var);
        j();
        x();
        a();
        Y(new l7(this, true, t().I(g9Var), new g9(g9Var), a0(true), g9Var));
    }

    public final void b0() {
        j();
        x();
        d9 a0 = a0(true);
        boolean p = g().p(l.C0);
        if (p) {
            t().K();
        }
        Y(new f7(this, a0, p));
    }

    public final void c0() {
        j();
        x();
        Y(new j7(this, a0(true)));
    }

    /* JADX WARNING: Removed duplicated region for block: B:46:0x0139  */
    public final void f0() {
        boolean z;
        boolean z2;
        j();
        x();
        if (!D()) {
            boolean z3 = false;
            if (this.e == null) {
                j();
                x();
                Boolean F = f().F();
                if (F == null || !F.booleanValue()) {
                    a();
                    if (q().I() != 1) {
                        e().M().d(C0201.m82(4258));
                        int l0 = m().l0(12451000);
                        if (l0 != 0) {
                            if (l0 != 1) {
                                if (l0 == 2) {
                                    e().L().d(C0201.m82(4263));
                                    if (m().u0() >= 15300) {
                                        Boolean F2 = f().F();
                                        if (F2 == null || F2.booleanValue()) {
                                            z = true;
                                            z2 = false;
                                            if (!z && g().C()) {
                                                e().E().d(C0201.m82(4266));
                                                z2 = false;
                                            }
                                            if (z2) {
                                                f().z(z);
                                            }
                                        }
                                    }
                                } else if (l0 == 3) {
                                    e().H().d(C0201.m82(4262));
                                } else if (l0 == 9) {
                                    e().H().d(C0201.m82(4261));
                                } else if (l0 != 18) {
                                    e().H().a(C0201.m82(4259), Integer.valueOf(l0));
                                } else {
                                    e().H().d(C0201.m82(4260));
                                }
                                z = false;
                                z2 = false;
                                e().E().d(C0201.m82(4266));
                                z2 = false;
                                if (z2) {
                                }
                            } else {
                                e().M().d(C0201.m82(4264));
                            }
                            z = false;
                            z2 = true;
                            e().E().d(C0201.m82(4266));
                            z2 = false;
                            if (z2) {
                            }
                        } else {
                            e().M().d(C0201.m82(4265));
                        }
                    }
                    z = true;
                    z2 = true;
                    e().E().d(C0201.m82(4266));
                    z2 = false;
                    if (z2) {
                    }
                } else {
                    z = true;
                }
                this.e = Boolean.valueOf(z);
            }
            if (this.e.booleanValue()) {
                this.c.d();
            } else if (!g().C()) {
                a();
                PackageManager packageManager = getContext().getPackageManager();
                Intent intent = new Intent();
                Context context = getContext();
                String r5 = C0201.m82(4267);
                List<ResolveInfo> queryIntentServices = packageManager.queryIntentServices(intent.setClassName(context, r5), 65536);
                if (queryIntentServices != null && queryIntentServices.size() > 0) {
                    z3 = true;
                }
                if (z3) {
                    Intent intent2 = new Intent(C0201.m82(4268));
                    Context context2 = getContext();
                    a();
                    intent2.setComponent(new ComponentName(context2, r5));
                    this.c.b(intent2);
                    return;
                }
                e().E().d(C0201.m82(4269));
            }
        }
    }

    public final Boolean g0() {
        return this.e;
    }

    @Override // com.google.android.gms.measurement.internal.f5
    public final boolean z() {
        return false;
    }
}
