package defpackage;

import android.app.Activity;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import vigqyno.C0201;

/* renamed from: an2  reason: default package */
/* compiled from: Navigator */
public class an2 extends jl2 {
    private final CoordinatorLayout A;
    private final CoordinatorLayout B;
    private final CoordinatorLayout C;
    private ViewGroup D;
    private bf2 E = new bf2();
    private final tm2 v;
    private final hi2 w;
    private final ki2 x;
    private nl2 y;
    private nl2 z;

    /* renamed from: an2$a */
    /* compiled from: Navigator */
    class a extends bj2 {
        public final /* synthetic */ boolean b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(aj2 aj2, boolean z) {
            super(aj2);
            this.b = z;
        }

        @Override // defpackage.aj2, defpackage.bj2
        public void a(String str) {
            if (this.b) {
                an2.this.D.removeViewAt(0);
            }
            super.a(str);
            an2.this.I0();
        }
    }

    public an2(Activity activity, dl2 dl2, tm2 tm2, hi2 hi2, ki2 ki2) {
        super(activity, dl2, C0201.m82(31048) + cj2.a(), new ii2(activity, new bf2()), new bf2());
        this.v = tm2;
        this.w = hi2;
        this.x = ki2;
        this.A = new CoordinatorLayout(u());
        this.B = new CoordinatorLayout(u());
        this.C = new CoordinatorLayout(u());
    }

    private void G0(String str, aj2 aj2, fj2<qn2> fj2) {
        nl2 t = t(str);
        if (t == null) {
            aj2.onError(C0201.m82(31049) + str + C0201.m82(31050));
        } else if (t instanceof qn2) {
            fj2.a((qn2) t);
        } else {
            t.T(new vm2(fj2));
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void I0() {
        nl2 nl2 = this.z;
        if (nl2 != null) {
            nl2.q();
        }
        this.z = null;
    }

    private void J0() {
        nl2 nl2 = this.y;
        if (nl2 != null) {
            nl2.q();
        }
        this.y = null;
    }

    private boolean O0() {
        return this.j == null;
    }

    @Override // defpackage.nl2
    public boolean C(aj2 aj2) {
        if (this.v.i() && this.y == null) {
            return false;
        }
        if (this.v.i()) {
            return this.y.C(aj2);
        }
        return this.v.h(aj2, this.y);
    }

    public void H0() {
        this.v.n(this.B);
        this.v.o(this.A);
        this.x.e(this.A);
    }

    public void K0() {
        this.v.b();
        this.w.a(this.C);
        J0();
    }

    public void L0(bf2 bf2, aj2 aj2) {
        this.v.c(this.y, bf2, aj2);
    }

    public void M0(String str, aj2 aj2) {
        if (!O0() || this.v.q() != 1) {
            this.v.d(str, this.y, aj2);
        } else {
            aj2.onError(C0201.m82(31051));
        }
    }

    public void N0(String str, aj2 aj2) {
        this.w.c(this.C, str, aj2);
    }

    public void V0(String str, bf2 bf2) {
        nl2 t = t(str);
        if (t != null) {
            t.M(bf2);
        }
    }

    public void W0(String str, bf2 bf2, aj2 aj2) {
        G0(str, aj2, new ym2(bf2, aj2));
    }

    public void X0(String str, bf2 bf2, aj2 aj2) {
        nl2 t = t(str);
        if (t != null) {
            t.T(new um2(t, bf2, aj2));
            return;
        }
        aj2.onError(C0201.m82(31052) + str + C0201.m82(31053));
    }

    public void Y0(String str, bf2 bf2, aj2 aj2) {
        G0(str, aj2, new zm2(bf2, aj2));
    }

    public void Z0(String str, nl2 nl2, aj2 aj2) {
        G0(str, aj2, new xm2(nl2, aj2));
    }

    public void a1(ViewGroup viewGroup) {
        this.D = viewGroup;
        viewGroup.addView(this.A);
        viewGroup.addView(this.B);
        viewGroup.addView(this.C);
    }

    @Override // defpackage.nl2
    public void b0(String str) {
    }

    public void b1(oi2 oi2) {
        this.v.m(oi2);
    }

    @Override // defpackage.jl2, defpackage.nl2, defpackage.cl2
    public void c0(bf2 bf2) {
        super.c0(bf2);
        this.E = bf2;
        this.v.l(bf2);
    }

    public void c1(nl2 nl2, aj2 aj2, si0 si0) {
        this.z = this.y;
        this.v.b();
        boolean O0 = O0();
        if (O0()) {
            B();
        }
        this.y = nl2;
        this.x.d(nl2, this.E, new a(aj2, O0), si0);
    }

    public void d1(String str, List<nl2> list, aj2 aj2) {
        G0(str, aj2, new wm2(list, aj2));
    }

    public void e1(nl2 nl2, aj2 aj2) {
        this.v.p(nl2, this.y, aj2);
    }

    public void f1(nl2 nl2, aj2 aj2) {
        this.w.h(this.C, nl2, aj2);
    }

    @Override // defpackage.nl2
    public ViewGroup p() {
        return this.A;
    }

    @Override // defpackage.jl2, defpackage.nl2, defpackage.cl2
    public void q() {
        K0();
        super.q();
    }

    @Override // defpackage.jl2
    public Collection<nl2> s0() {
        nl2 nl2 = this.y;
        return nl2 == null ? Collections.emptyList() : Collections.singletonList(nl2);
    }

    @Override // defpackage.jl2, defpackage.nl2
    public nl2 t(String str) {
        nl2 t = super.t(str);
        if (t == null) {
            t = this.v.e(str);
        }
        return t == null ? this.w.d(str) : t;
    }

    @Override // defpackage.jl2
    public nl2 t0() {
        return this.y;
    }
}
