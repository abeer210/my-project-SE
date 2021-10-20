package defpackage;

import android.app.Activity;
import android.view.View;
import com.reactnativenavigation.views.f;

/* renamed from: el2  reason: default package */
/* compiled from: ComponentViewController */
public class el2 extends cl2<f> {
    private final String v;
    private ci2 w;
    private final kl2 x;

    public el2(Activity activity, dl2 dl2, String str, String str2, kl2 kl2, bf2 bf2, ii2 ii2, ci2 ci2) {
        super(activity, dl2, str, ii2, bf2);
        this.v = str2;
        this.x = kl2;
        this.w = ci2;
    }

    private void o0() {
        Activity u = u();
        View currentFocus = u != null ? u.getCurrentFocus() : null;
        if (currentFocus != null) {
            currentFocus.clearFocus();
        }
    }

    @Override // defpackage.nl2
    public int A() {
        return (Y().l.b() ? 0 : sj2.a(u())) + ((Integer) qj2.c(y(), 0, new fk2(this))).intValue();
    }

    @Override // defpackage.nl2
    public boolean G() {
        T t;
        return super.G() && (t = this.j) != null && ((f) t).e0();
    }

    @Override // defpackage.nl2, defpackage.cl2
    public void M(bf2 bf2) {
        if (bf2 != bf2.n) {
            if (G()) {
                this.w.e((f) B(), bf2);
            }
            super.M(bf2);
        }
    }

    @Override // defpackage.nl2, defpackage.cl2
    public void O() {
        super.O();
        T t = this.j;
        if (t != null) {
            ((f) t).f0();
        }
    }

    @Override // defpackage.nl2, defpackage.cl2
    public void P() {
        T t = this.j;
        if (t != null) {
            ((f) t).g0();
        }
        super.P();
    }

    @Override // defpackage.nl2
    public void b0(String str) {
        ((f) B()).d(str);
    }

    @Override // defpackage.nl2, defpackage.cl2
    public void c0(bf2 bf2) {
        super.c0(bf2);
        this.w.f(bf2);
    }

    @Override // defpackage.cl2
    public t3 g0(nl2 nl2, t3 t3Var) {
        k3.V(nl2.B(), t3Var.f(t3Var.b(), t3Var.d(), t3Var.c(), Math.max(t3Var.a() - v(), 0)));
        return t3Var;
    }

    @Override // defpackage.nl2
    public void k() {
        T t = this.j;
        if (t != null) {
            this.w.a(t, v());
        }
    }

    @Override // defpackage.nl2, defpackage.cl2
    public void m(bf2 bf2) {
        if (i0()) {
            n();
        }
        super.m(bf2);
        ((f) B()).d0(bf2);
        this.w.c((f) B(), Z(this.w.a));
    }

    @Override // defpackage.nl2
    public void n() {
        T t = this.j;
        if (t != null) {
            this.w.b(t, A());
        }
    }

    /* renamed from: p0 */
    public f p() {
        f fVar = (f) this.x.a(u(), x(), this.v);
        fVar.a();
        return fVar;
    }

    @Override // defpackage.nl2, defpackage.cl2
    public void q() {
        bf2 bf2 = this.f;
        if (bf2 != null && bf2.j.b.i()) {
            o0();
        }
        super.q();
    }

    public /* synthetic */ Integer q0(jl2 jl2) {
        return Integer.valueOf(jl2.u0(this));
    }

    @Override // defpackage.nl2
    public String w() {
        return this.v;
    }

    @Override // defpackage.nl2
    public fe2 z() {
        return (fe2) qj2.c(this.j, null, bl2.a);
    }
}
