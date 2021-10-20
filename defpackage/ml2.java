package defpackage;

import android.app.Activity;
import vigqyno.C0201;

/* renamed from: ml2  reason: default package */
/* compiled from: TitleBarReactViewController */
public class ml2 extends nl2<gp2> {
    private final hp2 q;
    private final me2 u;

    public ml2(Activity activity, hp2 hp2, me2 me2) {
        super(activity, cj2.a() + C0201.m82(24167), new pl2(activity), new bf2(), new io2(activity));
        this.q = hp2;
        this.u = me2;
    }

    @Override // defpackage.nl2
    public void O() {
        super.O();
        if (!D()) {
            a0(rk2.a);
            ((gp2) B()).x(ni2.Title);
        }
    }

    @Override // defpackage.nl2
    public void P() {
        ((gp2) B()).y(ni2.Title);
        super.P();
    }

    @Override // defpackage.nl2
    public void b0(String str) {
    }

    /* renamed from: g0 */
    public gp2 p() {
        return this.q.a(u(), (String) this.u.b.d(), (String) this.u.a.d());
    }

    public me2 h0() {
        return this.u;
    }

    @Override // defpackage.nl2
    public String w() {
        return null;
    }
}
