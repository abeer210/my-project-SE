package com.google.android.gms.measurement.internal;

import android.content.Context;
import com.google.android.gms.common.internal.u;
import com.google.android.gms.common.util.e;

public class l5 implements n5 {
    public final o4 a;

    public l5(o4 o4Var) {
        u.k(o4Var);
        this.a = o4Var;
    }

    @Override // com.google.android.gms.measurement.internal.n5
    public h9 a() {
        return this.a.a();
    }

    @Override // com.google.android.gms.measurement.internal.n5
    public e b() {
        return this.a.b();
    }

    @Override // com.google.android.gms.measurement.internal.n5
    public i4 c() {
        return this.a.c();
    }

    @Override // com.google.android.gms.measurement.internal.n5
    public k3 e() {
        return this.a.e();
    }

    public t3 f() {
        return this.a.q();
    }

    public i9 g() {
        return this.a.r();
    }

    @Override // com.google.android.gms.measurement.internal.n5
    public Context getContext() {
        return this.a.getContext();
    }

    public void h() {
        this.a.J();
    }

    public void i() {
        this.a.c().i();
    }

    public void j() {
        this.a.c().j();
    }

    public d k() {
        return this.a.R();
    }

    public i3 l() {
        return this.a.S();
    }

    public y8 m() {
        return this.a.T();
    }
}
