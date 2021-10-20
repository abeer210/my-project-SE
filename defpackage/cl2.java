package defpackage;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import com.reactnativenavigation.views.e;

/* renamed from: cl2  reason: default package */
/* compiled from: ChildController */
public abstract class cl2<T extends ViewGroup> extends nl2<T> {
    private final ii2 q;
    private final dl2 u;

    public cl2(Activity activity, dl2 dl2, String str, ii2 ii2, bf2 bf2) {
        super(activity, str, new il2(activity), bf2, new io2(activity));
        this.q = ii2;
        this.u = dl2;
    }

    /* access modifiers changed from: private */
    public t3 m0(View view, t3 t3Var) {
        sj2.c(t3Var.d());
        return g0(s(view), t3Var);
    }

    @Override // defpackage.nl2
    public T B() {
        if (this.j == null) {
            super.B();
            this.j.setFitsSystemWindows(true);
            k3.t0(this.j, new bk2(this));
        }
        return this.j;
    }

    @Override // defpackage.nl2
    public void M(bf2 bf2) {
        if (bf2 != bf2.n) {
            if (G()) {
                this.q.m(B(), bf2);
            }
            super.M(bf2);
            S(new ck2(this, bf2));
        }
    }

    @Override // defpackage.nl2
    public void O() {
        super.O();
        this.u.d(this);
    }

    @Override // defpackage.nl2
    public void P() {
        super.P();
        this.u.e(this);
    }

    @Override // defpackage.nl2
    public void c0(bf2 bf2) {
        this.q.t(bf2);
    }

    public t3 g0(nl2 nl2, t3 t3Var) {
        return t3Var.f(t3Var.b(), 0, t3Var.c(), t3Var.a());
    }

    public dl2 h0() {
        return this.u;
    }

    public boolean i0() {
        return y() == null && !(this instanceof an2) && B().getParent() != null;
    }

    public /* synthetic */ void k0(jl2 jl2) {
        jl2.B0(this);
    }

    public /* synthetic */ void l0(bf2 bf2, jl2 jl2) {
        jl2.A0(bf2, this);
    }

    @Override // defpackage.nl2
    public void m(bf2 bf2) {
        super.m(bf2);
        this.q.d(this, Y());
    }

    public void n0() {
        this.q.s(Y());
    }

    @Override // defpackage.nl2
    public void q() {
        if (!D() && (B() instanceof e)) {
            S(new dk2(this));
        }
        super.q();
        this.u.c(this);
    }
}
