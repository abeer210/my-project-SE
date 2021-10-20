package defpackage;

import android.content.res.Resources;
import android.graphics.ColorFilter;
import android.graphics.PointF;
import android.graphics.RectF;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import defpackage.w90;
import vigqyno.C0201;

/* renamed from: ba0  reason: default package */
/* compiled from: GenericDraweeHierarchy */
public class ba0 implements ka0 {
    private final Drawable a = new ColorDrawable(0);
    private final Resources b;
    private fa0 c;
    private final ea0 d;
    private final k90 e;
    private final l90 f;

    public ba0(ca0 ca0) {
        int i = 0;
        if (oh0.d()) {
            oh0.a(C0201.m82(36633));
        }
        this.b = ca0.p();
        this.c = ca0.s();
        this.f = new l90(this.a);
        int i2 = 1;
        int size = (ca0.j() != null ? ca0.j().size() : 1) + (ca0.m() != null ? 1 : 0);
        Drawable[] drawableArr = new Drawable[(size + 6)];
        drawableArr[0] = i(ca0.e(), null);
        drawableArr[1] = i(ca0.k(), ca0.l());
        drawableArr[2] = h(this.f, ca0.d(), ca0.c(), ca0.b());
        drawableArr[3] = i(ca0.n(), ca0.o());
        drawableArr[4] = i(ca0.q(), ca0.r());
        drawableArr[5] = i(ca0.h(), ca0.i());
        if (size > 0) {
            if (ca0.j() != null) {
                for (Drawable drawable : ca0.j()) {
                    drawableArr[i + 6] = i(drawable, null);
                    i++;
                }
                i2 = i;
            }
            if (ca0.m() != null) {
                drawableArr[i2 + 6] = i(ca0.m(), null);
            }
        }
        k90 k90 = new k90(drawableArr);
        this.e = k90;
        k90.r(ca0.g());
        ea0 ea0 = new ea0(ga0.e(this.e, this.c));
        this.d = ea0;
        ea0.mutate();
        t();
        if (oh0.d()) {
            oh0.b();
        }
    }

    private Drawable h(Drawable drawable, w90.c cVar, PointF pointF, ColorFilter colorFilter) {
        drawable.setColorFilter(colorFilter);
        return ga0.g(drawable, cVar, pointF);
    }

    private Drawable i(Drawable drawable, w90.c cVar) {
        return ga0.f(ga0.d(drawable, this.c, this.b), cVar);
    }

    private void j(int i) {
        if (i >= 0) {
            this.e.m(i);
        }
    }

    private void k() {
        l(1);
        l(2);
        l(3);
        l(4);
        l(5);
    }

    private void l(int i) {
        if (i >= 0) {
            this.e.n(i);
        }
    }

    private h90 o(int i) {
        h90 e2 = this.e.e(i);
        if (e2.l() instanceof m90) {
            e2 = (m90) e2.l();
        }
        return e2.l() instanceof v90 ? (v90) e2.l() : e2;
    }

    private v90 q(int i) {
        h90 o = o(i);
        if (o instanceof v90) {
            return (v90) o;
        }
        return ga0.k(o, w90.c.a);
    }

    private boolean r(int i) {
        return o(i) instanceof v90;
    }

    private void s() {
        this.f.g(this.a);
    }

    private void t() {
        k90 k90 = this.e;
        if (k90 != null) {
            k90.i();
            this.e.l();
            k();
            j(1);
            this.e.o();
            this.e.k();
        }
    }

    private void w(int i, Drawable drawable) {
        if (drawable == null) {
            this.e.g(i, null);
            return;
        }
        o(i).g(ga0.d(drawable, this.c, this.b));
    }

    private void z(float f2) {
        Drawable c2 = this.e.c(3);
        if (c2 != null) {
            if (f2 >= 0.999f) {
                if (c2 instanceof Animatable) {
                    ((Animatable) c2).stop();
                }
                l(3);
            } else {
                if (c2 instanceof Animatable) {
                    ((Animatable) c2).start();
                }
                j(3);
            }
            c2.setLevel(Math.round(f2 * 10000.0f));
        }
    }

    public void A(fa0 fa0) {
        this.c = fa0;
        ga0.j(this.d, fa0);
        for (int i = 0; i < this.e.f(); i++) {
            ga0.i(o(i), this.c, this.b);
        }
    }

    @Override // defpackage.ka0
    public void a() {
        s();
        t();
    }

    @Override // defpackage.ka0
    public void b(Drawable drawable) {
        this.d.r(drawable);
    }

    @Override // defpackage.ka0
    public void c(Throwable th) {
        this.e.i();
        k();
        if (this.e.c(4) != null) {
            j(4);
        } else {
            j(1);
        }
        this.e.k();
    }

    @Override // defpackage.ka0
    public void d(Throwable th) {
        this.e.i();
        k();
        if (this.e.c(5) != null) {
            j(5);
        } else {
            j(1);
        }
        this.e.k();
    }

    @Override // defpackage.ka0
    public void e(float f2, boolean z) {
        if (this.e.c(3) != null) {
            this.e.i();
            z(f2);
            if (z) {
                this.e.o();
            }
            this.e.k();
        }
    }

    @Override // defpackage.ja0
    public Drawable f() {
        return this.d;
    }

    @Override // defpackage.ka0
    public void g(Drawable drawable, float f2, boolean z) {
        Drawable d2 = ga0.d(drawable, this.c, this.b);
        d2.mutate();
        this.f.g(d2);
        this.e.i();
        k();
        j(2);
        z(f2);
        if (z) {
            this.e.o();
        }
        this.e.k();
    }

    public void m(RectF rectF) {
        this.f.o(rectF);
    }

    public w90.c n() {
        if (!r(2)) {
            return null;
        }
        return q(2).t();
    }

    public fa0 p() {
        return this.c;
    }

    public void u(w90.c cVar) {
        z50.g(cVar);
        q(2).v(cVar);
    }

    public void v(Drawable drawable) {
        w(0, drawable);
    }

    public void x(int i) {
        this.e.r(i);
    }

    public void y(Drawable drawable, w90.c cVar) {
        w(1, drawable);
        q(1).v(cVar);
    }
}
