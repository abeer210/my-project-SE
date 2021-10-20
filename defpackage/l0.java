package defpackage;

import android.content.res.ColorStateList;

/* renamed from: l0  reason: default package */
/* compiled from: CardViewApi21Impl */
public class l0 implements o0 {
    private p0 n(n0 n0Var) {
        return (p0) n0Var.e();
    }

    @Override // defpackage.o0
    public void a(n0 n0Var, float f) {
        n(n0Var).h(f);
    }

    @Override // defpackage.o0
    public float b(n0 n0Var) {
        return n0Var.f().getElevation();
    }

    @Override // defpackage.o0
    public float c(n0 n0Var) {
        return n(n0Var).d();
    }

    @Override // defpackage.o0
    public void d(n0 n0Var) {
        m(n0Var, f(n0Var));
    }

    @Override // defpackage.o0
    public void e(n0 n0Var, float f) {
        n0Var.f().setElevation(f);
    }

    @Override // defpackage.o0
    public float f(n0 n0Var) {
        return n(n0Var).c();
    }

    @Override // defpackage.o0
    public ColorStateList g(n0 n0Var) {
        return n(n0Var).b();
    }

    @Override // defpackage.o0
    public void h() {
    }

    @Override // defpackage.o0
    public float i(n0 n0Var) {
        return c(n0Var) * 2.0f;
    }

    @Override // defpackage.o0
    public float j(n0 n0Var) {
        return c(n0Var) * 2.0f;
    }

    @Override // defpackage.o0
    public void k(n0 n0Var) {
        m(n0Var, f(n0Var));
    }

    @Override // defpackage.o0
    public void l(n0 n0Var, ColorStateList colorStateList) {
        n(n0Var).f(colorStateList);
    }

    @Override // defpackage.o0
    public void m(n0 n0Var, float f) {
        n(n0Var).g(f, n0Var.d(), n0Var.c());
        o(n0Var);
    }

    public void o(n0 n0Var) {
        if (!n0Var.d()) {
            n0Var.a(0, 0, 0, 0);
            return;
        }
        float f = f(n0Var);
        float c = c(n0Var);
        int ceil = (int) Math.ceil((double) q0.c(f, c, n0Var.c()));
        int ceil2 = (int) Math.ceil((double) q0.d(f, c, n0Var.c()));
        n0Var.a(ceil, ceil2, ceil, ceil2);
    }
}
