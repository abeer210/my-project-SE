package defpackage;

import android.app.Activity;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.aurelhubert.ahbottomnavigation.q;
import com.aurelhubert.ahbottomnavigation.r;
import com.reactnativenavigation.views.bottomtabs.a;
import com.reactnativenavigation.views.d;
import java.util.Collection;
import java.util.List;
import vigqyno.C0201;

/* renamed from: fm2  reason: default package */
/* compiled from: BottomTabsController */
public class fm2 extends jl2<a> implements q.e, hm2 {
    private bi2 A;
    private ai2 B;
    private d v;
    private List<nl2> w;
    private oi2 x;
    private kj2 y;
    private final em2 z;

    public fm2(Activity activity, List<nl2> list, dl2 dl2, oi2 oi2, kj2 kj2, String str, bf2 bf2, ii2 ii2, em2 em2, bi2 bi2, ai2 ai2) {
        super(activity, dl2, str, ii2, bf2);
        this.w = list;
        this.x = oi2;
        this.y = kj2;
        this.z = em2;
        this.A = bi2;
        this.B = ai2;
        yi2.i(list, new tl2(this));
    }

    private List<r> F0() {
        if (this.w.size() <= 5) {
            return yi2.q(this.w, new xl2(this));
        }
        throw new RuntimeException(C0201.m82(32050));
    }

    private ViewGroup H0() {
        return this.w.get(this.v.getCurrentItem()).B();
    }

    public static /* synthetic */ void L0(bf2 bf2, nl2 nl2, jl2 jl2) {
        bf2 i = bf2.i();
        i.c();
        jl2.A0(i, nl2);
    }

    @Override // defpackage.jl2
    public void A0(bf2 bf2, nl2 nl2) {
        super.A0(bf2, nl2);
        this.A.j(bf2, nl2);
        this.B.m(bf2, nl2);
        S(new ul2(bf2, nl2));
    }

    @Override // defpackage.nl2
    public boolean C(aj2 aj2) {
        return !this.w.isEmpty() && this.w.get(this.v.getCurrentItem()).C(aj2);
    }

    public d E0() {
        return new d(u());
    }

    /* renamed from: G0 */
    public a p() {
        a aVar = new a(u());
        this.v = E0();
        this.z.c(aVar, Y());
        bi2 bi2 = this.A;
        d dVar = this.v;
        bi2.f(dVar, this, new xd2(dVar));
        this.B.d(this.v);
        this.v.setOnTabSelectedListener(this);
        CoordinatorLayout.f fVar = new CoordinatorLayout.f(-1, -2);
        fVar.c = 80;
        aVar.addView(this.v, fVar);
        this.v.d(F0());
        this.z.a();
        return aVar;
    }

    public /* synthetic */ void I0(nl2 nl2, jl2 jl2) {
        bf2 i = this.f.i();
        i.c();
        i.b();
        jl2.o0(i, nl2);
    }

    public /* synthetic */ r J0(nl2 nl2) {
        ke2 ke2 = nl2.Y().d;
        ig2 ig2 = ke2.a;
        String r2 = C0201.m82(32051);
        return new r((String) ig2.e(r2), this.y.f(u(), (String) ke2.d.e(null)), this.y.f(u(), (String) ke2.e.e(null)), (String) ke2.h.e(r2));
    }

    public /* synthetic */ Integer K0(jl2 jl2) {
        return Integer.valueOf(jl2.r0(this));
    }

    @Override // defpackage.nl2, defpackage.cl2
    public void M(bf2 bf2) {
        this.A.l(bf2, this);
        this.B.q(bf2);
        super.M(bf2);
        this.f.e.a();
        this.e.e.a();
    }

    public /* synthetic */ void M0(nl2 nl2) {
        nl2.d0(this);
    }

    @Override // com.aurelhubert.ahbottomnavigation.q.e
    public boolean a(int i, boolean z2) {
        ke2 ke2 = this.w.get(i).Y().d;
        this.x.c(i);
        if (((Boolean) ke2.o.e(Boolean.TRUE)).booleanValue()) {
            this.x.d(this.v.getCurrentItem(), i);
            if (z2) {
                return false;
            }
            g(i);
        }
        return false;
    }

    @Override // defpackage.nl2, com.reactnativenavigation.views.c
    public boolean b(CoordinatorLayout coordinatorLayout, ViewGroup viewGroup, int i, int i2, int i3, int i4) {
        qj2.d(s(viewGroup), am2.a);
        return super.b(coordinatorLayout, viewGroup, i, i2, i3, i4);
    }

    @Override // defpackage.nl2
    public void b0(String str) {
        t0().b0(str);
    }

    @Override // defpackage.jl2, defpackage.nl2, defpackage.cl2
    public void c0(bf2 bf2) {
        super.c0(bf2);
        this.A.m(bf2);
        this.B.r(bf2);
    }

    @Override // defpackage.hm2
    public void g(int i) {
        this.z.d(this.w.get(i));
        H0().setVisibility(4);
        this.v.I(i, false);
        H0().setVisibility(0);
    }

    @Override // defpackage.jl2, defpackage.nl2
    public void k() {
        this.A.a(v());
        super.k();
    }

    @Override // defpackage.nl2, defpackage.cl2
    public void m(bf2 bf2) {
        super.m(bf2);
        this.v.Z();
        this.A.e(bf2);
        this.B.c();
        this.v.a0();
        this.f.e.a();
        this.e.e.a();
    }

    @Override // defpackage.jl2
    public void o0(bf2 bf2, nl2 nl2) {
        super.o0(bf2, nl2);
        this.A.c(Y(), nl2);
        S(new vl2(this, nl2));
    }

    @Override // defpackage.jl2, defpackage.nl2, defpackage.cl2
    public void q() {
        this.z.b();
        super.q();
    }

    @Override // defpackage.jl2
    public int r0(nl2 nl2) {
        return this.A.g(C0(nl2)) + ((Integer) qj2.c(y(), 0, new wl2(this))).intValue();
    }

    @Override // defpackage.jl2
    public Collection<nl2> s0() {
        return this.w;
    }

    @Override // defpackage.jl2
    public nl2 t0() {
        List<nl2> list = this.w;
        d dVar = this.v;
        return list.get(dVar == null ? 0 : dVar.getCurrentItem());
    }
}
