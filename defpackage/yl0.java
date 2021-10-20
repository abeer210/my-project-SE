package defpackage;

import android.graphics.RectF;
import defpackage.tm0;

/* renamed from: yl0  reason: default package */
/* compiled from: PagesLoader */
public class yl0 {
    private xl0 a;
    private int b;
    private float c;
    private float d;
    private float e;
    private float f;
    private float g;
    private float h;
    private final RectF i = new RectF(0.0f, 0.0f, 1.0f, 1.0f);
    private final int j;
    private final c k = new c();
    private final c l = new c();
    private final b m = new b();
    private final b n = new b();
    private final b o = new b();

    /* access modifiers changed from: private */
    /* renamed from: yl0$b */
    /* compiled from: PagesLoader */
    public class b {
        public int a;
        public int b;

        private b(yl0 yl0) {
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: yl0$c */
    /* compiled from: PagesLoader */
    public class c {
        public int a;
        public int b;
        public int c;

        private c(yl0 yl0) {
        }
    }

    public yl0(xl0 xl0) {
        this.a = xl0;
        this.j = ym0.a(xl0.getContext(), tm0.d);
    }

    private void a(b bVar) {
        float f2 = 1.0f / ((float) bVar.b);
        this.e = f2;
        float f3 = 1.0f / ((float) bVar.a);
        this.f = f3;
        float f4 = tm0.c;
        this.g = f4 / f2;
        this.h = f4 / f3;
    }

    private c b(c cVar, b bVar, float f2, float f3, boolean z) {
        float f4;
        float f5;
        float f6 = -vm0.d(f2, 0.0f);
        float f7 = -vm0.d(f3, 0.0f);
        float f8 = this.a.H() ? f7 : f6;
        xl0 xl0 = this.a;
        int j2 = xl0.g.j(f8, xl0.getZoom());
        cVar.a = j2;
        c(bVar, j2);
        xl0 xl02 = this.a;
        com.shockwave.pdfium.util.a q = xl02.g.q(cVar.a, xl02.getZoom());
        float a2 = q.a() / ((float) bVar.a);
        float b2 = q.b() / ((float) bVar.b);
        xl0 xl03 = this.a;
        float r = xl03.g.r(cVar.a, xl03.getZoom());
        if (this.a.H()) {
            xl0 xl04 = this.a;
            f4 = Math.abs(f7 - xl04.g.m(cVar.a, xl04.getZoom())) / a2;
            f5 = vm0.e(f6 - r, 0.0f) / b2;
        } else {
            xl0 xl05 = this.a;
            f4 = vm0.e(f7 - r, 0.0f) / a2;
            f5 = Math.abs(f6 - xl05.g.m(cVar.a, xl05.getZoom())) / b2;
        }
        if (z) {
            cVar.b = vm0.a(f4);
            cVar.c = vm0.a(f5);
        } else {
            cVar.b = vm0.b(f4);
            cVar.c = vm0.b(f5);
        }
        return cVar;
    }

    private void c(b bVar, int i2) {
        com.shockwave.pdfium.util.a n2 = this.a.g.n(i2);
        float a2 = (tm0.c * (1.0f / n2.a())) / this.a.getZoom();
        float b2 = (tm0.c * (1.0f / n2.b())) / this.a.getZoom();
        bVar.a = vm0.a(1.0f / a2);
        bVar.b = vm0.a(1.0f / b2);
    }

    private boolean d(int i2, int i3, int i4, float f2, float f3) {
        float f4 = ((float) i4) * f2;
        float f5 = ((float) i3) * f3;
        float f6 = this.g;
        float f7 = this.h;
        float f8 = f4 + f2 > 1.0f ? 1.0f - f4 : f2;
        float f9 = f5 + f3 > 1.0f ? 1.0f - f5 : f3;
        float f10 = f6 * f8;
        float f11 = f7 * f9;
        RectF rectF = new RectF(f4, f5, f8 + f4, f9 + f5);
        if (f10 <= 0.0f || f11 <= 0.0f) {
            return false;
        }
        if (!this.a.d.k(i2, rectF, this.b)) {
            xl0 xl0 = this.a;
            xl0.p.b(i2, f10, f11, rectF, false, this.b, xl0.D(), this.a.C());
        }
        this.b++;
        return true;
    }

    private int e(int i2, int i3, int i4, int i5, int i6, int i7) {
        int i8 = 0;
        while (i3 <= i4) {
            for (int i9 = i5; i9 <= i6; i9++) {
                if (d(i2, i3, i9, this.e, this.f)) {
                    i8++;
                }
                if (i8 >= i7) {
                    return i8;
                }
            }
            i3++;
        }
        return i8;
    }

    private int f(c cVar, c cVar2, b bVar, int i2) {
        a(bVar);
        return e(cVar.a, cVar.b, cVar2.b, cVar.c, cVar2.c, i2);
    }

    private int g(c cVar, b bVar, int i2) {
        a(bVar);
        if (this.a.H()) {
            return e(cVar.a, cVar.b, bVar.a - 1, 0, bVar.b - 1, i2);
        }
        return e(cVar.a, 0, bVar.a - 1, cVar.c, bVar.b - 1, i2);
    }

    private int h(c cVar, b bVar, int i2) {
        a(bVar);
        if (this.a.H()) {
            return e(cVar.a, 0, cVar.b, 0, bVar.b - 1, i2);
        }
        return e(cVar.a, 0, bVar.a - 1, 0, cVar.c, i2);
    }

    private void j(int i2) {
        com.shockwave.pdfium.util.a n2 = this.a.g.n(i2);
        float b2 = n2.b() * tm0.b;
        float a2 = n2.a() * tm0.b;
        if (!this.a.d.d(i2, this.i)) {
            xl0 xl0 = this.a;
            xl0.p.b(i2, b2, a2, this.i, true, 0, xl0.D(), this.a.C());
        }
    }

    private void k() {
        int i2;
        int i3;
        int l2;
        float zoom = ((float) this.j) * this.a.getZoom();
        float f2 = this.c;
        float f3 = (-f2) + zoom;
        float width = ((-f2) - ((float) this.a.getWidth())) - zoom;
        float f4 = this.d;
        b(this.k, this.m, f3, (-f4) + zoom, false);
        b(this.l, this.n, width, ((-f4) - ((float) this.a.getHeight())) - zoom, true);
        int i4 = this.k.a;
        while (true) {
            i2 = this.l.a;
            if (i4 > i2) {
                break;
            }
            j(i4);
            i4++;
        }
        int i5 = this.k.a;
        int i6 = (i2 - i5) + 1;
        int i7 = 0;
        while (i5 <= this.l.a && i7 < (i3 = tm0.a.a)) {
            c cVar = this.k;
            if (i5 != cVar.a || i6 <= 1) {
                c cVar2 = this.l;
                if (i5 == cVar2.a && i6 > 1) {
                    l2 = h(cVar2, this.n, tm0.a.a - i7);
                } else if (i6 == 1) {
                    l2 = f(this.k, this.l, this.m, tm0.a.a - i7);
                } else {
                    c(this.o, i5);
                    l2 = l(i5, this.o, tm0.a.a - i7);
                }
            } else {
                l2 = g(cVar, this.m, i3 - i7);
            }
            i7 += l2;
            i5++;
        }
    }

    private int l(int i2, b bVar, int i3) {
        a(bVar);
        return e(i2, 0, bVar.a - 1, 0, bVar.b - 1, i3);
    }

    public void i() {
        this.b = 1;
        this.c = -vm0.d(this.a.getCurrentXOffset(), 0.0f);
        this.d = -vm0.d(this.a.getCurrentYOffset(), 0.0f);
        k();
    }
}
