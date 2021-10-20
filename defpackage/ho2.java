package defpackage;

import android.app.Activity;
import android.view.View;
import androidx.viewpager.widget.ViewPager;
import java.util.Collection;
import java.util.List;

/* renamed from: ho2  reason: default package */
/* compiled from: TopTabsController */
public class ho2 extends jl2<np2> {
    private List<nl2> v;
    private lp2 w;

    /* renamed from: ho2$a */
    /* compiled from: TopTabsController */
    class a extends ol2 {
        public a() {
        }

        @Override // defpackage.ol2, defpackage.nl2.a
        public boolean b(View view) {
            return ((np2) ho2.this.B()).X(view);
        }
    }

    public ho2(Activity activity, dl2 dl2, String str, List<nl2> list, lp2 lp2, bf2 bf2, ii2 ii2) {
        super(activity, dl2, str, ii2, bf2);
        this.w = lp2;
        this.v = list;
        for (nl2 nl2 : list) {
            nl2.d0(this);
            nl2.e0(new a());
        }
    }

    private void K0(fj2<nl2> fj2) {
        fj2.a(this.v.get(((np2) B()).getCurrentItem()));
    }

    @Override // defpackage.jl2
    public void A0(bf2 bf2, nl2 nl2) {
        super.A0(bf2, nl2);
        S(new do2(bf2, nl2));
    }

    /* renamed from: E0 */
    public np2 p() {
        np2 a2 = this.w.a();
        this.j = a2;
        return a2;
    }

    public /* synthetic */ void F0(nl2 nl2, jl2 jl2) {
        jl2.o0(this.f.i(), nl2);
    }

    public /* synthetic */ void H0(jl2 jl2) {
        jl2.D0((ViewPager) B());
    }

    @Override // defpackage.nl2, defpackage.cl2
    public void O() {
        super.O();
        S(new eo2(this));
        K0(zn2.a);
    }

    @Override // defpackage.nl2, defpackage.cl2
    public void P() {
        super.P();
        K0(ao2.a);
        S(fo2.a);
    }

    @Override // defpackage.nl2
    public void R() {
        super.R();
    }

    @Override // defpackage.nl2
    public void b0(String str) {
        K0(new bo2(str));
    }

    @Override // defpackage.nl2, defpackage.cl2
    public void m(bf2 bf2) {
        super.m(bf2);
        ((np2) B()).U(bf2);
    }

    @Override // defpackage.jl2
    public void o0(bf2 bf2, nl2 nl2) {
        super.o0(bf2, nl2);
        S(new co2(this, nl2));
    }

    @Override // defpackage.jl2
    public Collection<? extends nl2> s0() {
        return this.v;
    }

    @Override // defpackage.jl2
    public nl2 t0() {
        return this.v.get(((np2) B()).getCurrentItem());
    }
}
