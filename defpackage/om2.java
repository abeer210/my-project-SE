package defpackage;

import android.app.Activity;
import android.view.View;
import androidx.fragment.app.d;
import com.reactnativenavigation.views.BehaviourDelegate;
import com.reactnativenavigation.views.h;

/* renamed from: om2  reason: default package */
/* compiled from: ExternalComponentViewController */
public class om2 extends cl2<h> {
    private final qe2 v;
    private final nm2 w;
    private si0 x;
    private final oi2 y;
    private final ei2 z;

    public om2(Activity activity, dl2 dl2, String str, ii2 ii2, qe2 qe2, nm2 nm2, si0 si0, oi2 oi2, ei2 ei2, bf2 bf2) {
        super(activity, dl2, str, ii2, bf2);
        this.v = qe2;
        this.w = nm2;
        this.x = si0;
        this.y = oi2;
        this.z = ei2;
    }

    private void p0(View view) {
        view.setFitsSystemWindows(true);
        k3.t0(view, km2.a);
    }

    public static /* synthetic */ t3 r0(View view, t3 t3Var) {
        return t3Var;
    }

    @Override // defpackage.nl2
    public int A() {
        return (Y().l.d.i() ? 0 : sj2.a(u())) + ((Integer) qj2.c(y(), 0, new lm2(this))).intValue();
    }

    @Override // defpackage.nl2, defpackage.cl2
    public void O() {
        super.O();
        this.y.f(x(), (String) this.v.a.d(), ni2.Component);
    }

    @Override // defpackage.nl2, defpackage.cl2
    public void P() {
        super.P();
        this.y.g(x(), (String) this.v.a.d(), ni2.Component);
    }

    @Override // defpackage.nl2
    public void b0(String str) {
        this.y.i(x(), str);
    }

    @Override // defpackage.nl2
    public void k() {
        T t = this.j;
        if (t != null) {
            this.z.a(t, v());
        }
    }

    @Override // defpackage.nl2
    public void n() {
        T t = this.j;
        if (t != null) {
            this.z.b(t, A());
        }
    }

    /* renamed from: o0 */
    public h p() {
        h hVar = new h(u());
        p0(hVar);
        hVar.addView(this.w.a(u(), this.x, this.v.b).a(), ej2.b(new BehaviourDelegate(this)));
        return hVar;
    }

    /* renamed from: q0 */
    public d u() {
        return (d) super.u();
    }

    public /* synthetic */ Integer s0(jl2 jl2) {
        return Integer.valueOf(jl2.u0(this));
    }

    @Override // defpackage.nl2
    public String w() {
        return (String) this.v.a.d();
    }
}
