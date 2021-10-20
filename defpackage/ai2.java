package defpackage;

import android.content.Context;
import android.graphics.Typeface;
import com.reactnativenavigation.views.d;
import defpackage.ig;
import java.util.List;
import vigqyno.C0201;

/* renamed from: ai2  reason: default package */
/* compiled from: BottomTabPresenter */
public class ai2 {
    private final Context a;
    private kj2 b;
    private bf2 c;
    private final dm2 d;
    private mj2<d> e = new mj2<>();
    private final List<nl2> f;
    private final int g;

    public ai2(Context context, List<nl2> list, kj2 kj2, bf2 bf2) {
        this.f = list;
        this.a = context;
        this.d = new dm2(list);
        this.b = kj2;
        this.c = bf2;
        this.g = xj2.b(context, 6);
    }

    private void a(int i, ke2 ke2) {
        if (this.e != null) {
            ig.b bVar = new ig.b();
            bVar.e((String) ke2.i.e(C0201.m82(24619)));
            bVar.c((Integer) ke2.j.e(null));
            bVar.a(((Boolean) ke2.k.e(Boolean.FALSE)).booleanValue());
            this.e.a(new zg2(bVar, i));
        }
    }

    private void b(int i, ne2 ne2) {
        if (!ne2.c.g()) {
            ig.b bVar = new ig.b();
            bVar.e(C0201.m82(24620));
            bVar.c((Integer) ne2.a.e(null));
            bVar.d(((Integer) ne2.b.e(Integer.valueOf(this.g))).intValue());
            bVar.a(((Boolean) ne2.d.e(Boolean.FALSE)).booleanValue());
            this.e.a(new ah2(bVar, i));
        }
    }

    private boolean e(hg2 hg2) {
        return hg2.f() && hg2.a();
    }

    private void n(int i, ke2 ke2) {
        if (this.e != null && ke2.i.f()) {
            ig.b bVar = new ig.b();
            if (ke2.i.f()) {
                bVar.e((String) ke2.i.d());
            }
            if (ke2.j.f()) {
                bVar.c((Integer) ke2.j.d());
            }
            if (ke2.j.f()) {
                bVar.c((Integer) ke2.j.d());
            }
            if (ke2.k.f()) {
                bVar.a(((Boolean) ke2.k.d()).booleanValue());
            }
            this.e.a(new ch2(bVar, i));
        }
    }

    private void p(int i, ne2 ne2) {
        if (this.e != null) {
            ig.b bVar = new ig.b();
            if (ne2.a.f()) {
                bVar.c((Integer) ne2.a.d());
            }
            bVar.d(ne2.c.g() ? 0 : ((Integer) ne2.b.e(Integer.valueOf(this.g))).intValue());
            if (ne2.d.f()) {
                bVar.a(((Boolean) ne2.d.d()).booleanValue());
            }
            ig b2 = bVar.b();
            if (b2.l()) {
                this.e.a(new bh2(b2, i));
            }
        }
    }

    private boolean s(ke2 ke2) {
        return ke2.l.c.f() && !ke2.i.f();
    }

    public void c() {
        this.e.a(new dh2(this));
    }

    public void d(d dVar) {
        this.e.b(dVar);
    }

    public /* synthetic */ void h(d dVar) {
        for (int i = 0; i < this.f.size(); i++) {
            ke2 ke2 = this.f.get(i).Z(this.c).d;
            dVar.S(i, ke2.p);
            Float f2 = null;
            if (ke2.g.a()) {
                dVar.J(i, (Integer) ke2.g.e(null));
            }
            if (ke2.f.a()) {
                dVar.K(i, (Integer) ke2.f.e(null));
            }
            dVar.O(i, (Integer) ke2.c.e(null));
            dVar.Q(i, (Integer) ke2.b.e(null));
            dVar.R(i, ke2.m.f() ? Float.valueOf((float) ((Integer) ke2.m.d()).intValue()) : null);
            if (ke2.n.f()) {
                f2 = Float.valueOf((float) ((Integer) ke2.n.d()).intValue());
            }
            dVar.P(i, f2);
            if (ke2.h.f()) {
                dVar.N(i, (String) ke2.h.d());
            }
            if (s(ke2)) {
                b(i, ke2.l);
            } else {
                a(i, ke2);
            }
        }
    }

    public /* synthetic */ void j(nl2 nl2, bf2 bf2, d dVar) {
        int a2 = this.d.a(nl2.x());
        if (a2 >= 0) {
            ke2 ke2 = bf2.d;
            Typeface typeface = ke2.p;
            if (typeface != null) {
                dVar.S(a2, typeface);
            }
            if (e(ke2.g)) {
                dVar.J(a2, (Integer) ke2.g.d());
            }
            if (e(ke2.f)) {
                dVar.K(a2, (Integer) ke2.f.d());
            }
            if (ke2.c.f()) {
                dVar.O(a2, (Integer) ke2.c.d());
            }
            if (ke2.b.f()) {
                dVar.Q(a2, (Integer) ke2.b.d());
            }
            if (ke2.a.f()) {
                dVar.e0(a2, (String) ke2.a.d());
            }
            if (ke2.d.f()) {
                this.b.g(this.a, (String) ke2.d.d(), new yh2(this, dVar, a2));
            }
            if (ke2.e.f()) {
                this.b.g(this.a, (String) ke2.e.d(), new zh2(this, dVar, a2));
            }
            if (ke2.h.f()) {
                dVar.N(a2, (String) ke2.h.d());
            }
            if (s(ke2)) {
                p(a2, ke2.l);
            } else {
                n(a2, ke2);
            }
        }
    }

    public /* synthetic */ void l(bf2 bf2, d dVar) {
        dVar.Z();
        yi2.i(this.f, new yg2(this, bf2));
        dVar.a0();
    }

    /* renamed from: o */
    public void m(bf2 bf2, nl2 nl2) {
        this.e.a(new eh2(this, nl2, bf2));
    }

    public void q(bf2 bf2) {
        this.e.a(new xg2(this, bf2));
    }

    public void r(bf2 bf2) {
        this.c = bf2;
    }
}
