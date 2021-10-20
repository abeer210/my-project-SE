package defpackage;

import com.reactnativenavigation.views.l;

/* renamed from: li2  reason: default package */
/* compiled from: SideMenuPresenter */
public class li2 {
    private l a;

    private void b(hf2 hf2) {
        this.a.S(!hf2.a.c.j(), 3);
        this.a.S(!hf2.b.c.j(), 5);
    }

    private void f(hf2 hf2) {
        if (hf2.a.c.g()) {
            this.a.S(1, 3);
        } else if (hf2.a.c.i()) {
            this.a.S(0, 3);
        }
        if (hf2.b.c.g()) {
            this.a.S(1, 5);
        } else if (hf2.b.c.i()) {
            this.a.S(0, 5);
        }
    }

    private void h(hf2 hf2) {
        if (hf2.a.a.i()) {
            this.a.K(3, ((Boolean) hf2.a.b.e(Boolean.TRUE)).booleanValue());
        } else if (hf2.a.a.g()) {
            this.a.e(3, ((Boolean) hf2.a.b.e(Boolean.TRUE)).booleanValue());
        }
        if (hf2.b.a.i()) {
            this.a.K(5, ((Boolean) hf2.b.b.e(Boolean.TRUE)).booleanValue());
        } else if (hf2.b.a.g()) {
            this.a.e(5, ((Boolean) hf2.b.b.e(Boolean.TRUE)).booleanValue());
        }
        hf2.a.a.b();
        hf2.b.a.b();
    }

    public void a(bf2 bf2) {
        b(bf2.i);
        h(bf2.i);
    }

    public void c(bf2 bf2) {
        b(bf2.i);
    }

    public void d(l lVar) {
        this.a = lVar;
    }

    public boolean e() {
        if (this.a.C(3)) {
            this.a.d(3);
            return true;
        } else if (!this.a.C(5)) {
            return false;
        } else {
            this.a.d(5);
            return true;
        }
    }

    public void g(hf2 hf2) {
        f(hf2);
        h(hf2);
    }
}
