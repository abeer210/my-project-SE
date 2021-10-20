package defpackage;

import android.view.ViewGroup;
import com.aurelhubert.ahbottomnavigation.q;
import com.reactnativenavigation.views.d;
import java.util.List;

/* renamed from: bi2  reason: default package */
/* compiled from: BottomTabsPresenter */
public class bi2 {
    private final dm2 a;
    private final List<nl2> b;
    private bf2 c;
    private d d;
    private xd2 e;
    private hm2 f;

    public bi2(List<nl2> list, bf2 bf2) {
        this.b = list;
        this.c = bf2;
        this.a = new dm2(list);
    }

    private void b(bf2 bf2) {
        int a2;
        int intValue;
        le2 le2 = bf2.e;
        ie2 ie2 = bf2.h;
        this.d.setLayoutDirection(bf2.m.e);
        this.d.setPreferLargeIcons(((Boolean) bf2.e.e.e(Boolean.FALSE)).booleanValue());
        this.d.setTitleState(le2.j.d(h()));
        this.d.setBackgroundColor(((Integer) le2.a.e(-1)).intValue());
        if (le2.f.f() && (intValue = ((Integer) le2.f.d()).intValue()) >= 0) {
            le2.f.b();
            this.f.g(intValue);
        }
        if (le2.i.f()) {
            this.d.setTag(le2.i.d());
        }
        if (le2.h.f() && (a2 = this.a.a((String) le2.h.d())) >= 0) {
            le2.h.b();
            this.f.g(a2);
        }
        if (le2.b.j()) {
            if (le2.d.j()) {
                this.e.c(ie2);
            } else {
                this.d.H(false);
            }
        }
        if (le2.b.g()) {
            if (le2.d.j()) {
                this.e.b(ie2);
            } else {
                this.d.q(false);
            }
        }
        if (le2.g.f()) {
            this.d.T(true, ((Double) le2.g.d()).floatValue());
        }
    }

    private void d(int i) {
        this.b.get(i).k();
    }

    private q.f h() {
        for (int i = 0; i < this.d.getItemsCount(); i++) {
            if (this.d.n(i).f()) {
                return q.f.SHOW_WHEN_ACTIVE;
            }
        }
        return q.f.ALWAYS_SHOW;
    }

    private void i(bf2 bf2, nl2 nl2) {
        int a2;
        int intValue;
        le2 le2 = bf2.e;
        ie2 ie2 = bf2.h;
        if (bf2.m.e.e()) {
            this.d.setLayoutDirection(bf2.m.e);
        }
        if (le2.e.f()) {
            this.d.setPreferLargeIcons(((Boolean) le2.e.d()).booleanValue());
        }
        if (le2.j.e()) {
            this.d.setTitleState(le2.j.f());
        }
        if (le2.a.f()) {
            this.d.setBackgroundColor(((Integer) le2.a.d()).intValue());
        }
        if (le2.f.f() && (intValue = ((Integer) le2.f.d()).intValue()) >= 0) {
            this.f.g(intValue);
        }
        if (le2.i.f()) {
            this.d.setTag(le2.i.d());
        }
        if (le2.h.f() && (a2 = this.a.a((String) le2.h.d())) >= 0) {
            this.f.g(a2);
        }
        if (nl2.G()) {
            if (le2.b.i()) {
                if (le2.d.j()) {
                    this.e.c(ie2);
                } else {
                    this.d.H(false);
                }
            }
            if (!le2.b.g()) {
                return;
            }
            if (le2.d.j()) {
                this.e.b(ie2);
            } else {
                this.d.q(false);
            }
        }
    }

    private void k(int i) {
        this.b.get(i).k();
    }

    public void a(int i) {
        ((ViewGroup.MarginLayoutParams) this.d.getLayoutParams()).bottomMargin = i;
        this.d.requestLayout();
    }

    public void c(bf2 bf2, nl2 nl2) {
        int a2 = this.a.a(nl2.x());
        if (a2 >= 0) {
            bf2 i = bf2.i();
            i.m(this.c);
            b(i);
            d(a2);
        }
    }

    public void e(bf2 bf2) {
        bf2 i = bf2.i();
        i.m(this.c);
        b(i);
    }

    public void f(d dVar, hm2 hm2, xd2 xd2) {
        this.d = dVar;
        this.f = hm2;
        this.e = xd2;
    }

    public int g(bf2 bf2) {
        bf2.m(this.c);
        if (bf2.e.b()) {
            return 0;
        }
        return this.d.getHeight();
    }

    public void j(bf2 bf2, nl2 nl2) {
        i(bf2, nl2);
        int a2 = this.a.a(nl2.x());
        if (a2 >= 0) {
            k(a2);
        }
    }

    public void l(bf2 bf2, nl2 nl2) {
        i(bf2, nl2);
    }

    public void m(bf2 bf2) {
        this.c = bf2;
    }
}
