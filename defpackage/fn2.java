package defpackage;

import android.app.Activity;
import android.view.View;
import com.reactnativenavigation.views.l;
import com.reactnativenavigation.views.m;
import defpackage.j4;
import java.util.ArrayList;
import java.util.Collection;

/* renamed from: fn2  reason: default package */
/* compiled from: SideMenuController */
public class fn2 extends jl2<m> implements j4.d {
    private float A = 0.0f;
    private nl2 v;
    private nl2 w;
    private nl2 x;
    private li2 y;
    private float z = 0.0f;

    public fn2(Activity activity, dl2 dl2, String str, bf2 bf2, li2 li2, ii2 ii2) {
        super(activity, dl2, str, ii2, bf2);
        this.y = li2;
    }

    private void F0(nl2 nl2, float f, float f2) {
        if (f == 0.0f && f2 > 0.0f) {
            nl2.O();
        } else if (f > 0.0f && f2 == 0.0f) {
            nl2.P();
        }
    }

    private nl2 G0(View view) {
        return R0(view) ? this.w : this.x;
    }

    private bf2 H0(boolean z2, boolean z3) {
        bf2 bf2 = new bf2();
        if (z2) {
            bf2.i.a.a = new sf2(Boolean.valueOf(z3));
        } else {
            bf2.i.b.a = new sf2(Boolean.valueOf(z3));
        }
        return bf2;
    }

    private int I0(View view) {
        return ((j4.e) view.getLayoutParams()).a;
    }

    private boolean J0(int i) {
        return !D() && ((m) B()).i0(i);
    }

    private boolean R0(View view) {
        nl2 nl2 = this.w;
        return nl2 != null && view.equals(nl2.B());
    }

    @Override // defpackage.jl2
    public void A0(bf2 bf2, nl2 nl2) {
        super.A0(bf2, nl2);
        this.y.g(bf2.i);
        S(new dn2(bf2, nl2));
    }

    @Override // defpackage.nl2
    public boolean C(aj2 aj2) {
        return this.y.e() || this.v.C(aj2) || super.C(aj2);
    }

    /* renamed from: E0 */
    public m p() {
        l lVar = new l(u());
        this.y.d(lVar);
        lVar.a(this);
        m mVar = new m(u());
        mVar.d0(lVar, this);
        return mVar;
    }

    public /* synthetic */ void K0(nl2 nl2, jl2 jl2) {
        jl2.o0(this.f, nl2);
    }

    @Override // defpackage.nl2, defpackage.cl2
    public void M(bf2 bf2) {
        super.M(bf2);
        this.y.g(bf2.i);
    }

    @Override // defpackage.nl2, defpackage.cl2
    public void O() {
        super.O();
        nl2 nl2 = this.w;
        if (nl2 != null) {
            nl2.U(cn2.a);
        }
        nl2 nl22 = this.x;
        if (nl22 != null) {
            nl22.U(en2.a);
        }
    }

    public void O0(nl2 nl2) {
        this.v = nl2;
        ((m) B()).setCenter(this.v);
    }

    public void P0(nl2 nl2) {
        this.w = nl2;
        ((m) B()).l0(this.w, this.f);
    }

    public void Q0(nl2 nl2) {
        this.x = nl2;
        ((m) B()).m0(this.x, this.f);
    }

    @Override // defpackage.jl2, defpackage.nl2
    public bf2 Y() {
        bf2 Y = super.Y();
        return (J0(3) || J0(5)) ? Y.j(this.v.Y()) : Y;
    }

    @Override // defpackage.nl2
    public void b0(String str) {
        this.v.b0(str);
    }

    @Override // defpackage.j4.d
    public void d(View view) {
        G0(view).M(H0(R0(view), true));
    }

    @Override // defpackage.j4.d
    public void e(View view) {
        G0(view).M(H0(R0(view), false));
    }

    @Override // defpackage.j4.d
    public void f(int i) {
    }

    @Override // defpackage.j4.d
    public void h(View view, float f) {
        int I0 = I0(view);
        if (I0 == 3) {
            F0(this.w, this.z, f);
            this.z = f;
        } else if (I0 == 5) {
            F0(this.x, this.A, f);
            this.A = f;
        }
    }

    @Override // defpackage.nl2, defpackage.cl2
    public void m(bf2 bf2) {
        super.m(bf2);
        this.y.c(bf2);
    }

    @Override // defpackage.jl2
    public void o0(bf2 bf2, nl2 nl2) {
        super.o0(bf2, nl2);
        this.y.a(Y());
        S(new bn2(this, nl2));
    }

    @Override // defpackage.jl2, defpackage.nl2
    public nl2 s(View view) {
        return ((m) B()).j0(view) ? this : super.s(view);
    }

    @Override // defpackage.jl2
    public Collection<nl2> s0() {
        ArrayList arrayList = new ArrayList();
        nl2 nl2 = this.v;
        if (nl2 != null) {
            arrayList.add(nl2);
        }
        nl2 nl22 = this.w;
        if (nl22 != null) {
            arrayList.add(nl22);
        }
        nl2 nl23 = this.x;
        if (nl23 != null) {
            arrayList.add(nl23);
        }
        return arrayList;
    }

    @Override // defpackage.jl2
    public nl2 t0() {
        if (!D()) {
            if (((m) B()).i0(3)) {
                return this.w;
            }
            if (((m) B()).i0(5)) {
                return this.x;
            }
        }
        return this.v;
    }
}
