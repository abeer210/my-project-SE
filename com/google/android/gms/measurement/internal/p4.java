package com.google.android.gms.measurement.internal;

import android.os.Binder;
import android.text.TextUtils;
import com.google.android.gms.common.internal.u;
import com.google.android.gms.common.util.o;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ExecutionException;
import vigqyno.C0201;

public final class p4 extends a3 {
    private final m8 a;
    private Boolean b;
    private String c;

    public p4(m8 m8Var) {
        this(m8Var, null);
    }

    private final void V3(String str, boolean z) {
        boolean z2;
        if (!TextUtils.isEmpty(str)) {
            if (z) {
                try {
                    if (this.b == null) {
                        if (!C0201.m82(15729).equals(this.c) && !o.a(this.a.getContext(), Binder.getCallingUid())) {
                            if (!ep0.a(this.a.getContext()).c(Binder.getCallingUid())) {
                                z2 = false;
                                this.b = Boolean.valueOf(z2);
                            }
                        }
                        z2 = true;
                        this.b = Boolean.valueOf(z2);
                    }
                    if (this.b.booleanValue()) {
                        return;
                    }
                } catch (SecurityException e) {
                    this.a.e().E().a(C0201.m82(15731), k3.B(str));
                    throw e;
                }
            }
            if (this.c == null && dp0.m(this.a.getContext(), Binder.getCallingUid(), str)) {
                this.c = str;
            }
            if (!str.equals(this.c)) {
                throw new SecurityException(String.format(C0201.m82(15730), str));
            }
            return;
        }
        m3 E = this.a.e().E();
        String r6 = C0201.m82(15732);
        E.d(r6);
        throw new SecurityException(r6);
    }

    private final void X3(d9 d9Var, boolean z) {
        u.k(d9Var);
        V3(d9Var.a, false);
        this.a.k0().y0(d9Var.b, d9Var.u);
    }

    private final void Y3(Runnable runnable) {
        u.k(runnable);
        if (this.a.c().G()) {
            runnable.run();
        } else {
            this.a.c().y(runnable);
        }
    }

    @Override // com.google.android.gms.measurement.internal.b3
    public final String G0(d9 d9Var) {
        X3(d9Var, false);
        return this.a.Q(d9Var);
    }

    @Override // com.google.android.gms.measurement.internal.b3
    public final void I(g9 g9Var) {
        u.k(g9Var);
        u.k(g9Var.c);
        V3(g9Var.a, true);
        g9 g9Var2 = new g9(g9Var);
        if (g9Var.c.o() == null) {
            Y3(new t4(this, g9Var2));
        } else {
            Y3(new w4(this, g9Var2));
        }
    }

    @Override // com.google.android.gms.measurement.internal.b3
    public final void K(j jVar, String str, String str2) {
        u.k(jVar);
        u.g(str);
        V3(str, true);
        Y3(new b5(this, jVar, str));
    }

    @Override // com.google.android.gms.measurement.internal.b3
    public final List<t8> O1(String str, String str2, boolean z, d9 d9Var) {
        X3(d9Var, false);
        try {
            List<v8> list = (List) this.a.c().v(new v4(this, d9Var, str, str2)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (v8 v8Var : list) {
                if (z || !y8.e0(v8Var.c)) {
                    arrayList.add(new t8(v8Var));
                }
            }
            return arrayList;
        } catch (InterruptedException | ExecutionException e) {
            this.a.e().E().b(C0201.m82(15733), k3.B(d9Var.a), e);
            return Collections.emptyList();
        }
    }

    @Override // com.google.android.gms.measurement.internal.b3
    public final List<t8> P1(d9 d9Var, boolean z) {
        X3(d9Var, false);
        try {
            List<v8> list = (List) this.a.c().v(new g5(this, d9Var)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (v8 v8Var : list) {
                if (z || !y8.e0(v8Var.c)) {
                    arrayList.add(new t8(v8Var));
                }
            }
            return arrayList;
        } catch (InterruptedException | ExecutionException e) {
            this.a.e().E().b(C0201.m82(15734), k3.B(d9Var.a), e);
            return null;
        }
    }

    @Override // com.google.android.gms.measurement.internal.b3
    public final void R1(d9 d9Var) {
        X3(d9Var, false);
        Y3(new j5(this, d9Var));
    }

    public final j W3(j jVar, d9 d9Var) {
        i iVar;
        boolean z = false;
        if (!(!C0201.m82(15735).equals(jVar.a) || (iVar = jVar.b) == null || iVar.size() == 0)) {
            String r = jVar.b.r(C0201.m82(15736));
            if (!TextUtils.isEmpty(r) && ((C0201.m82(15737).equals(r) || C0201.m82(15738).equals(r)) && this.a.r().S(d9Var.a))) {
                z = true;
            }
        }
        if (!z) {
            return jVar;
        }
        this.a.e().K().a(C0201.m82(15739), jVar.toString());
        return new j(C0201.m82(15740), jVar.b, jVar.c, jVar.d);
    }

    @Override // com.google.android.gms.measurement.internal.b3
    public final void g2(t8 t8Var, d9 d9Var) {
        u.k(t8Var);
        X3(d9Var, false);
        if (t8Var.o() == null) {
            Y3(new d5(this, t8Var, d9Var));
        } else {
            Y3(new h5(this, t8Var, d9Var));
        }
    }

    @Override // com.google.android.gms.measurement.internal.b3
    public final void j1(long j, String str, String str2, String str3) {
        Y3(new i5(this, str2, str3, str, j));
    }

    @Override // com.google.android.gms.measurement.internal.b3
    public final List<t8> k0(String str, String str2, String str3, boolean z) {
        V3(str, true);
        try {
            List<v8> list = (List) this.a.c().v(new y4(this, str, str2, str3)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (v8 v8Var : list) {
                if (z || !y8.e0(v8Var.c)) {
                    arrayList.add(new t8(v8Var));
                }
            }
            return arrayList;
        } catch (InterruptedException | ExecutionException e) {
            this.a.e().E().b(C0201.m82(15741), k3.B(str), e);
            return Collections.emptyList();
        }
    }

    @Override // com.google.android.gms.measurement.internal.b3
    public final void n1(d9 d9Var) {
        V3(d9Var.a, false);
        Y3(new z4(this, d9Var));
    }

    @Override // com.google.android.gms.measurement.internal.b3
    public final void p3(j jVar, d9 d9Var) {
        u.k(jVar);
        X3(d9Var, false);
        Y3(new c5(this, jVar, d9Var));
    }

    @Override // com.google.android.gms.measurement.internal.b3
    public final void q0(g9 g9Var, d9 d9Var) {
        u.k(g9Var);
        u.k(g9Var.c);
        X3(d9Var, false);
        g9 g9Var2 = new g9(g9Var);
        g9Var2.a = d9Var.a;
        if (g9Var.c.o() == null) {
            Y3(new r4(this, g9Var2, d9Var));
        } else {
            Y3(new u4(this, g9Var2, d9Var));
        }
    }

    @Override // com.google.android.gms.measurement.internal.b3
    public final List<g9> q1(String str, String str2, d9 d9Var) {
        X3(d9Var, false);
        try {
            return (List) this.a.c().v(new x4(this, d9Var, str, str2)).get();
        } catch (InterruptedException | ExecutionException e) {
            this.a.e().E().a(C0201.m82(15742), e);
            return Collections.emptyList();
        }
    }

    @Override // com.google.android.gms.measurement.internal.b3
    public final byte[] r3(j jVar, String str) {
        u.g(str);
        u.k(jVar);
        V3(str, true);
        this.a.e().L().a(C0201.m82(15743), this.a.j0().v(jVar.a));
        long c2 = this.a.b().c() / 1000000;
        try {
            byte[] bArr = (byte[]) this.a.c().A(new e5(this, jVar, str)).get();
            if (bArr == null) {
                this.a.e().E().a(C0201.m82(15744), k3.B(str));
                bArr = new byte[0];
            }
            this.a.e().L().c(C0201.m82(15745), this.a.j0().v(jVar.a), Integer.valueOf(bArr.length), Long.valueOf((this.a.b().c() / 1000000) - c2));
            return bArr;
        } catch (InterruptedException | ExecutionException e) {
            this.a.e().E().c(C0201.m82(15746), k3.B(str), this.a.j0().v(jVar.a), e);
            return null;
        }
    }

    @Override // com.google.android.gms.measurement.internal.b3
    public final void t2(d9 d9Var) {
        X3(d9Var, false);
        Y3(new s4(this, d9Var));
    }

    @Override // com.google.android.gms.measurement.internal.b3
    public final List<g9> u2(String str, String str2, String str3) {
        V3(str, true);
        try {
            return (List) this.a.c().v(new a5(this, str, str2, str3)).get();
        } catch (InterruptedException | ExecutionException e) {
            this.a.e().E().a(C0201.m82(15747), e);
            return Collections.emptyList();
        }
    }

    private p4(m8 m8Var, String str) {
        u.k(m8Var);
        this.a = m8Var;
        this.c = null;
    }
}
