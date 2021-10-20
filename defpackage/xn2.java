package defpackage;

import android.app.Activity;
import com.reactnativenavigation.views.topbar.b;
import com.reactnativenavigation.views.topbar.c;
import vigqyno.C0201;

/* renamed from: xn2  reason: default package */
/* compiled from: TopBarBackgroundViewController */
public class xn2 extends nl2<b> {
    private c q;
    private me2 u;

    public xn2(Activity activity, c cVar) {
        super(activity, cj2.a() + C0201.m82(29079), new pl2(activity), new bf2(), new io2(activity));
        this.q = cVar;
    }

    @Override // defpackage.nl2
    public void O() {
        super.O();
        ((b) B()).x(ni2.Background);
    }

    @Override // defpackage.nl2
    public void P() {
        ((b) B()).y(ni2.Background);
        super.P();
    }

    @Override // defpackage.nl2
    public void b0(String str) {
    }

    /* renamed from: g0 */
    public b p() {
        return this.q.a(u(), (String) this.u.b.d(), (String) this.u.a.d());
    }

    public me2 h0() {
        return this.u;
    }

    public void i0(me2 me2) {
        this.u = me2;
    }

    @Override // defpackage.nl2
    public String w() {
        return (String) this.u.a.d();
    }
}
