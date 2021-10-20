package defpackage;

import android.content.Context;
import androidx.viewpager.widget.ViewPager;
import com.reactnativenavigation.views.n;
import com.reactnativenavigation.views.topbar.a;
import java.util.List;

/* renamed from: yn2  reason: default package */
/* compiled from: TopBarController */
public class yn2 {
    private a a;
    private dp2 b;
    private ce2 c = new ce2();

    private void i(he2 he2, Runnable runnable, float f, float f2) {
        if (zj2.j(this.a)) {
            this.c.f(he2, runnable, f, f2);
        }
    }

    public static /* synthetic */ void l() {
    }

    public void a(List<ll2> list) {
        this.a.A();
        yi2.j(list, new vn2(this, list));
    }

    public void b() {
        this.a.B();
    }

    public a c(Context context, n nVar) {
        return new a(context);
    }

    public a d(Context context, n nVar) {
        if (this.a == null) {
            a c2 = c(context, nVar);
            this.a = c2;
            this.b = c2.getTitleBar();
            this.c.b(this.a, nVar);
        }
        return this.a;
    }

    public int e() {
        return ((Integer) qj2.c(this.a, 0, sn2.a)).intValue();
    }

    public a f() {
        return this.a;
    }

    public void g() {
        if (!this.c.h()) {
            this.a.setVisibility(8);
        }
    }

    public void h(he2 he2, float f, float f2) {
        i(he2, wn2.a, f, f2);
    }

    public void j(ViewPager viewPager) {
        this.a.J(viewPager);
    }

    public /* synthetic */ void k(List list, ll2 ll2, Integer num) {
        ll2.i0(this.b, (list.size() - num.intValue()) * 10);
    }

    public /* synthetic */ void m(ll2 ll2) {
        this.a.L(ll2);
    }

    public /* synthetic */ void n(List list, ll2 ll2, Integer num) {
        ll2.i0(this.b, (list.size() - num.intValue()) * 10);
    }

    public void o(List<ll2> list, List<ll2> list2) {
        yi2.i(list2, new tn2(this));
        yi2.j(list, new un2(this, list));
    }

    public void p() {
        this.a.setTranslationY(0.0f);
        this.a.setTranslationX(0.0f);
        this.a.setAlpha(1.0f);
        this.a.setScaleY(1.0f);
        this.a.setScaleX(1.0f);
        this.a.setRotationX(0.0f);
        this.a.setRotationY(0.0f);
        this.a.setRotation(0.0f);
    }

    public void q(List<ll2> list) {
        this.b.setLeftButtons(list);
    }

    public void r(ml2 ml2) {
        this.a.setTitleComponent(ml2.B());
    }

    public void s() {
        if (!zj2.j(this.a) && !this.c.i()) {
            this.a.setVisibility(0);
        }
    }

    public void t(he2 he2, int i) {
        if (!zj2.j(this.a) && !this.c.i()) {
            this.c.l(he2, i);
        }
    }
}
