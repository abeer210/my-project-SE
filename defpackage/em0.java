package defpackage;

import android.view.MotionEvent;

/* renamed from: em0  reason: default package */
/* compiled from: Callbacks */
public class em0 {
    private hm0 a;
    private gm0 b;
    private km0 c;
    private mm0 d;
    private jm0 e;
    private lm0 f;
    private fm0 g;
    private fm0 h;
    private nm0 i;
    private im0 j;
    private dm0 k;

    public void a(om0 om0) {
        dm0 dm0 = this.k;
        if (dm0 != null) {
            dm0.a(om0);
        }
    }

    public void b(int i2) {
        hm0 hm0 = this.a;
        if (hm0 != null) {
            hm0.e(i2);
        }
    }

    public void c(MotionEvent motionEvent) {
        im0 im0 = this.j;
        if (im0 != null) {
            im0.onLongPress(motionEvent);
        }
    }

    public void d(int i2, int i3) {
        jm0 jm0 = this.e;
        if (jm0 != null) {
            jm0.c(i2, i3);
        }
    }

    public boolean e(int i2, Throwable th) {
        km0 km0 = this.c;
        if (km0 == null) {
            return false;
        }
        km0.a(i2, th);
        return true;
    }

    public void f(int i2, float f2) {
        lm0 lm0 = this.f;
        if (lm0 != null) {
            lm0.d(i2, f2);
        }
    }

    public void g(int i2) {
        mm0 mm0 = this.d;
        if (mm0 != null) {
            mm0.a(i2);
        }
    }

    public boolean h(MotionEvent motionEvent) {
        nm0 nm0 = this.i;
        return nm0 != null && nm0.b(motionEvent);
    }

    public fm0 i() {
        return this.g;
    }

    public fm0 j() {
        return this.h;
    }

    public gm0 k() {
        return this.b;
    }

    public void l(dm0 dm0) {
        this.k = dm0;
    }

    public void m(fm0 fm0) {
        this.g = fm0;
    }

    public void n(fm0 fm0) {
        this.h = fm0;
    }

    public void o(gm0 gm0) {
        this.b = gm0;
    }

    public void p(hm0 hm0) {
        this.a = hm0;
    }

    public void q(im0 im0) {
        this.j = im0;
    }

    public void r(jm0 jm0) {
        this.e = jm0;
    }

    public void s(km0 km0) {
        this.c = km0;
    }

    public void t(lm0 lm0) {
        this.f = lm0;
    }

    public void u(mm0 mm0) {
        this.d = mm0;
    }

    public void v(nm0 nm0) {
        this.i = nm0;
    }
}
