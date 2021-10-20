package defpackage;

import android.app.Activity;
import android.graphics.Typeface;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.appcompat.widget.Toolbar;
import com.reactnativenavigation.views.topbar.a;
import com.reactnativenavigation.views.topbar.b;
import com.reactnativenavigation.views.topbar.c;
import defpackage.ll2;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import vigqyno.C0201;

/* renamed from: mi2  reason: default package */
/* compiled from: StackPresenter */
public class mi2 {
    private final double a;
    private final double b;
    private final Activity c;
    private a d;
    private yn2 e;
    private final hp2 f;
    private ll2.b g;
    private final ji2 h;
    private final c i;
    private final ep2 j;
    private bf2 k;
    private List<ll2> l = new ArrayList();
    private Map<View, ml2> m = new HashMap();
    private Map<View, xn2> n = new HashMap();
    private Map<View, Map<String, ll2>> o = new HashMap();
    private Map<View, Map<String, ll2>> p = new HashMap();
    private jm2 q;

    public mi2(Activity activity, hp2 hp2, c cVar, ep2 ep2, jm2 jm2, ji2 ji2, bf2 bf2) {
        this.c = activity;
        this.f = hp2;
        this.i = cVar;
        this.j = ep2;
        this.q = jm2;
        this.h = ji2;
        this.k = bf2;
        this.a = (double) xj2.c(activity, 18.0f);
        this.b = (double) xj2.c(activity, 14.0f);
    }

    private void A(nf2 nf2) {
        if (!nf2.a.l()) {
            return;
        }
        if (nf2.a.p.g()) {
            this.d.z();
        } else {
            this.d.setBackButton(z(nf2.a));
        }
    }

    private void B(of2 of2, nf2 nf2, View view) {
        H(of2, nf2, view);
        E(of2, nf2, view);
        A(nf2);
    }

    private List<tf2> C(List<tf2> list, uf2 uf2, uf2 uf22) {
        ArrayList arrayList = new ArrayList();
        for (tf2 tf2 : list) {
            tf2 a2 = tf2.a();
            if (!tf2.h.f()) {
                a2.h = uf2;
            }
            if (!tf2.i.f()) {
                a2.i = uf22;
            }
            arrayList.add(a2);
        }
        return arrayList;
    }

    private void E(of2 of2, nf2 nf2, View view) {
        ArrayList<tf2> arrayList = nf2.b;
        if (arrayList != null) {
            List<ll2> r = r(this.p.get(view), C(arrayList, of2.p, of2.r));
            this.p.put(view, yi2.m(r, vg2.a));
            this.e.q(r);
        }
    }

    private void G(cf2 cf2) {
        if (cf2.c()) {
            d(cf2);
        }
    }

    private void H(of2 of2, nf2 nf2, View view) {
        ArrayList<tf2> arrayList = nf2.c;
        if (arrayList != null) {
            List<ll2> r = r(this.o.get(view), C(arrayList, of2.o, of2.q));
            List<ll2> b2 = yi2.b(this.l, r, th2.a);
            yi2.i(b2, wg2.a);
            if (!yi2.c(this.l, r)) {
                this.e.o(r, b2);
                this.l = r;
            }
            if (of2.o.f()) {
                this.d.setOverflowButtonColor(((Integer) of2.o.d()).intValue());
            }
        }
    }

    private void I(bf2 bf2, qn2 qn2, nl2 nl2) {
        bf2 i2 = bf2.i();
        i2.m(this.k);
        ie2 ie2 = i2.h;
        of2 of2 = bf2.a;
        ViewGroup B = nl2.B();
        if (bf2.m.e.e()) {
            this.d.setLayoutDirection(bf2.m.e);
        }
        if (of2.j.f()) {
            this.d.setHeight(((Integer) of2.j.d()).intValue());
        }
        if (of2.k.f()) {
            this.d.setElevation((Double) of2.k.d());
        }
        if (of2.l.f() && (this.d.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            ((ViewGroup.MarginLayoutParams) this.d.getLayoutParams()).topMargin = xj2.b(this.c, ((Integer) of2.l.d()).intValue());
        }
        if (of2.a.g.f()) {
            this.d.setTitleHeight(((Integer) of2.a.g.d()).intValue());
        }
        if (of2.a.h.f()) {
            this.d.setTitleTopMargin(((Integer) of2.a.h.d()).intValue());
        }
        if (of2.a.f.b()) {
            ml2 o2 = o(of2.a.f);
            if (o2 == null) {
                o2 = new ml2(this.c, this.f, of2.a.f);
                qj2.d(this.m.put(B, o2), wh2.a);
                ((gp2) o2.B()).setLayoutParams(p(of2.a.f));
            }
            this.e.r(o2);
        } else if (of2.a.a.f()) {
            qj2.d(this.m.remove(B), wh2.a);
            this.d.setTitle((String) of2.a.a.d());
        }
        if (of2.a.b.f()) {
            this.d.setTitleTextColor(((Integer) of2.a.b.d()).intValue());
        }
        if (of2.a.c.f()) {
            this.d.setTitleFontSize(((Double) of2.a.c.d()).doubleValue());
        }
        Typeface typeface = of2.a.e;
        if (typeface != null) {
            this.d.setTitleTypeface(typeface);
        }
        if (of2.b.a.f()) {
            this.d.setSubtitle((String) of2.b.a.d());
        }
        if (of2.b.b.f()) {
            this.d.setSubtitleColor(((Integer) of2.b.b.d()).intValue());
        }
        if (of2.b.c.f()) {
            this.d.setSubtitleFontSize(((Double) of2.b.c.d()).doubleValue());
        }
        Typeface typeface2 = of2.b.d;
        if (typeface2 != null) {
            this.d.setSubtitleFontFamily(typeface2);
        }
        if (of2.e.a.f()) {
            this.d.setBackgroundColor(((Integer) of2.e.a.d()).intValue());
        }
        if (of2.e.b.b()) {
            if (this.n.containsKey(B)) {
                this.d.setBackgroundComponent(this.n.get(B).B());
            } else {
                xn2 xn2 = new xn2(this.c, this.i);
                this.n.put(B, xn2);
                xn2.i0(of2.e.b);
                ((b) xn2.B()).setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
                this.d.setBackgroundComponent(xn2.B());
            }
        }
        if (of2.d.f()) {
            this.d.setTestId((String) of2.d.d());
        }
        this.e.p();
        if (of2.f.g()) {
            if (of2.g.j()) {
                this.e.h(ie2.b.e, 0.0f, (float) u(qn2, nl2));
            } else {
                this.e.g();
            }
        }
        if (of2.f.i()) {
            if (of2.g.j()) {
                this.e.t(ie2.a.e, u(qn2, nl2));
            } else {
                this.e.s();
            }
        }
        if (of2.h.i() && (B instanceof gl2)) {
            this.d.I(((gl2) B).getScrollEventListener());
        }
        if (of2.h.g()) {
            this.d.H();
        }
    }

    private void J(pf2 pf2) {
        Typeface typeface = pf2.b;
        if (typeface != null) {
            this.d.M(pf2.c, typeface);
        }
    }

    private void K(qf2 qf2) {
        if (qf2.a.f() && qf2.b.f()) {
            this.d.w(qf2.a, qf2.b);
        }
        if (qf2.c.f()) {
            this.d.x(qf2.c);
        }
        if (qf2.d.f()) {
            this.d.setTopTabsVisible(qf2.d.i());
        }
        if (qf2.e.f()) {
            this.d.setTopTabsHeight(((Integer) qf2.e.e(-2)).intValue());
        }
    }

    private void P(of2 of2) {
        if (of2.f.g()) {
            this.e.g();
        }
        if (of2.f.j()) {
            this.e.s();
        }
    }

    private void a(of2 of2, nl2 nl2) {
        ArrayList<tf2> arrayList = of2.c.c;
        if (arrayList != null) {
            List<ll2> s = s(this.o.get(nl2.B()), C(arrayList, of2.o, of2.q));
            this.o.put(nl2.B(), yi2.m(s, vg2.a));
            if (!yi2.c(this.l, s)) {
                this.l = s;
                this.e.a(s);
            }
        } else {
            this.l = null;
            this.d.A();
        }
        ArrayList<tf2> arrayList2 = of2.c.b;
        if (arrayList2 != null) {
            List<ll2> s2 = s(this.p.get(nl2.B()), C(arrayList2, of2.p, of2.r));
            this.p.put(nl2.B(), yi2.m(s2, vg2.a));
            this.e.q(s2);
        } else {
            this.d.z();
        }
        if (of2.c.a.p.i() && !of2.c.a()) {
            this.d.setBackButton(z(of2.c.a));
        }
        this.d.setOverflowButtonColor(((Integer) of2.o.e(-16777216)).intValue());
    }

    private void e(qn2 qn2, nl2 nl2) {
        ((ViewGroup.MarginLayoutParams) this.d.getLayoutParams()).topMargin = t(qn2, nl2);
        this.d.requestLayout();
    }

    private void f(bf2 bf2, qn2 qn2, nl2 nl2, bf2 bf22) {
        ViewGroup B = nl2.B();
        of2 of2 = bf2.a;
        ie2 ie2 = bf2.h;
        a aVar = this.d;
        ig2 ig2 = of2.d;
        String r4 = C0201.m82(12087);
        aVar.setTestId((String) ig2.e(r4));
        this.d.setLayoutDirection(bf2.m.e);
        this.d.setHeight(((Integer) of2.j.e(Integer.valueOf(xj2.f(this.c)))).intValue());
        this.d.setElevation((Double) of2.k.e(Double.valueOf(4.0d)));
        if (this.d.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
            ((ViewGroup.MarginLayoutParams) this.d.getLayoutParams()).topMargin = xj2.b(this.c, ((Integer) of2.l.e(0)).intValue());
        }
        this.d.setTitleHeight(((Integer) of2.a.g.e(Integer.valueOf(xj2.f(this.c)))).intValue());
        this.d.setTitle((String) of2.a.a.e(r4));
        this.d.setTitleTopMargin(((Integer) of2.a.h.e(0)).intValue());
        if (of2.a.f.b()) {
            if (this.m.containsKey(B)) {
                this.e.r(this.m.get(B));
            } else {
                ml2 ml2 = new ml2(this.c, this.f, of2.a.f);
                ml2.f0(of2.a.f.d);
                this.m.put(B, ml2);
                ((gp2) ml2.B()).setLayoutParams(p(of2.a.f));
                this.e.r(ml2);
            }
        }
        this.d.setTitleFontSize(((Double) of2.a.c.e(Double.valueOf(this.a))).doubleValue());
        this.d.setTitleTextColor(((Integer) of2.a.b.e(-16777216)).intValue());
        this.d.setTitleTypeface(of2.a.e);
        this.d.setTitleAlignment(of2.a.d);
        this.d.setSubtitle((String) of2.b.a.e(r4));
        this.d.setSubtitleFontSize(((Double) of2.b.c.e(Double.valueOf(this.b))).doubleValue());
        this.d.setSubtitleColor(((Integer) of2.b.b.e(-7829368)).intValue());
        this.d.setSubtitleFontFamily(of2.b.d);
        this.d.setSubtitleAlignment(of2.b.e);
        this.d.setBorderHeight(((Double) of2.m.e(Double.valueOf(0.0d))).doubleValue());
        this.d.setBorderColor(((Integer) of2.n.e(-16777216)).intValue());
        this.d.setBackgroundColor(((Integer) of2.e.a.e(-1)).intValue());
        if (of2.e.b.b()) {
            View n2 = n(of2.e.b);
            if (n2 != null) {
                this.d.setBackgroundComponent(n2);
            } else {
                xn2 xn2 = new xn2(this.c, this.i);
                xn2.f0(of2.e.c);
                this.n.put(B, xn2);
                xn2.i0(of2.e.b);
                ((b) xn2.B()).setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
                this.d.setBackgroundComponent(xn2.B());
            }
        } else {
            this.d.y();
        }
        g(of2, ie2, bf22, qn2, nl2);
        if (of2.h.i()) {
            if (B instanceof gl2) {
                this.d.I(((gl2) B).getScrollEventListener());
            }
        } else if (of2.h.h()) {
            this.d.H();
        }
    }

    private void g(of2 of2, ie2 ie2, bf2 bf2, qn2 qn2, nl2 nl2) {
        if (of2.f.g()) {
            this.e.p();
            if (!of2.g.j() || !bf2.h.a.a.j()) {
                this.e.g();
            } else {
                this.e.h(ie2.b.e, 0.0f, (float) u(qn2, nl2));
            }
        } else if (of2.f.j()) {
            this.e.p();
            if (!of2.g.j() || !bf2.h.a.a.j()) {
                this.e.s();
            } else {
                this.e.t(ie2.a.e, u(qn2, nl2));
            }
        }
    }

    private void i(pf2 pf2) {
        Typeface typeface = pf2.b;
        if (typeface != null) {
            this.d.M(pf2.c, typeface);
        }
    }

    private void j(qf2 qf2) {
        this.d.w(qf2.a, qf2.b);
        this.d.x(qf2.c);
        this.d.setTopTabsVisible(qf2.d.j());
        this.d.setTopTabsHeight(((Integer) qf2.e.e(-2)).intValue());
    }

    /* access modifiers changed from: private */
    /* renamed from: l */
    public ll2 z(tf2 tf2) {
        ll2 ll2 = new ll2(this.c, this.q, new wi2(tf2), tf2, this.j, this.g);
        ll2.f0(tf2.o.d);
        return ll2;
    }

    private void m(Map<String, ll2> map) {
        if (map != null) {
            yi2.g(map.values(), wg2.a);
        }
    }

    private View n(me2 me2) {
        for (xn2 xn2 : this.n.values()) {
            if (qj2.a(xn2.h0().a.e(null), me2.a.e(null)) && qj2.a(xn2.h0().b.e(null), me2.b.e(null))) {
                return xn2.B();
            }
        }
        return null;
    }

    private ml2 o(me2 me2) {
        for (ml2 ml2 : this.m.values()) {
            if (qj2.a(ml2.h0().a.e(null), me2.a.e(null)) && qj2.a(ml2.h0().b.e(null), me2.b.e(null))) {
                return ml2;
            }
        }
        return null;
    }

    private ViewGroup.LayoutParams p(me2 me2) {
        return new Toolbar.e(-2, -2, me2.c == ge2.Center ? 17 : 8388611);
    }

    private List<ll2> r(Map<String, ll2> map, List<tf2> list) {
        ArrayList arrayList = new ArrayList();
        for (tf2 tf2 : list) {
            arrayList.add(qj2.e(yi2.e((Collection) qj2.c(map, null, fh2.a), new qh2(tf2)), z(tf2)));
        }
        return arrayList;
    }

    private List<ll2> s(Map<String, ll2> map, List<tf2> list) {
        if (list == null) {
            return null;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        yi2.i(list, new rh2(this, linkedHashMap, map));
        return new ArrayList(linkedHashMap.values());
    }

    private int t(qn2 qn2, nl2 nl2) {
        bf2 C0 = qn2.C0(nl2);
        C0.m(this.k);
        int i2 = 0;
        int b2 = xj2.b(this.c, ((Integer) C0.a.l.e(0)).intValue());
        if (C0.l.c.j()) {
            i2 = sj2.a(nl2.u());
        }
        return b2 + i2;
    }

    private int u(qn2 qn2, nl2 nl2) {
        bf2 C0 = qn2.C0(nl2);
        C0.m(this.k);
        if (C0.l.a()) {
            return t(qn2, nl2);
        }
        return 0;
    }

    public void D(bf2 bf2, bf2 bf22, qn2 qn2, nl2 nl2) {
        bf2 j2 = bf2.i().j(bf22);
        j2.m(this.k);
        of2 of2 = j2.a;
        G(bf2.m.d);
        B(of2, bf2.a.c, nl2.B());
        I(bf2, qn2, nl2);
        K(bf2.b);
        J(bf2.c);
    }

    public void F(bf2 bf2, qn2 qn2, nl2 nl2) {
        G(bf2.m.d);
        I(bf2, qn2, nl2);
        K(bf2.b);
        J(bf2.c);
    }

    public void L(nl2 nl2) {
        qj2.d(this.m.remove(nl2.B()), wh2.a);
        qj2.d(this.n.remove(nl2.B()), uh2.a);
        m(this.o.get(nl2.B()));
        m(this.p.get(nl2.B()));
        this.o.remove(nl2.B());
        this.p.remove(nl2.B());
    }

    public void M(qn2 qn2, nl2 nl2, nl2 nl22) {
        if (nl22.f.a.f.j() && nl2.f.a.f.g()) {
            if (!nl22.f.a.g.j() || !nl22.f.h.b.a.j()) {
                this.e.g();
            } else {
                this.e.h(nl22.f.h.b.e, 0.0f, (float) u(qn2, nl2));
            }
        }
    }

    public void N(ll2.b bVar) {
        this.g = bVar;
    }

    public void O(bf2 bf2) {
        this.k = bf2;
    }

    public void b(bf2 bf2, qn2 qn2, nl2 nl2) {
        bf2 i2 = bf2.i();
        i2.m(this.k);
        d(i2.m.d);
        a(i2.a, nl2);
        f(i2, qn2, nl2, bf2);
        j(i2.b);
        i(i2.c);
    }

    public void c(bf2 bf2) {
        bf2 i2 = bf2.i();
        i2.m(this.k);
        P(i2.a);
    }

    public void d(cf2 cf2) {
        cf2 a2 = cf2.a();
        a2.d(this.k.m.d);
        ((Activity) this.d.getContext()).setRequestedOrientation(a2.b());
    }

    public void h(qn2 qn2, nl2 nl2) {
        if (qn2.v0(nl2)) {
            e(qn2, nl2);
        }
        nl2.n();
    }

    public void k(yn2 yn2) {
        this.e = yn2;
        this.d = yn2.f();
    }

    public bf2 q() {
        return this.k;
    }

    public int v(bf2 bf2) {
        bf2.m(this.k);
        if (bf2.a.a()) {
            return 0;
        }
        return this.e.e();
    }

    public boolean w(View view) {
        ArrayList arrayList = new ArrayList((Collection) qj2.c(this.o.get(view), new ArrayList(), fh2.a));
        arrayList.add(this.n.get(view));
        arrayList.add(this.m.get(view));
        return this.h.a(yi2.d(arrayList, xh2.a));
    }

    public /* synthetic */ void y(Map map, Map map2, tf2 tf2) {
        String str = tf2.a;
        ll2 ll2 = (ll2) map.put(str, yi2.k(map2, str, new sh2(this, tf2)));
    }
}
