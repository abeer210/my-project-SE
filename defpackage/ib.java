package defpackage;

import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import defpackage.nb;
import defpackage.sd;
import java.util.List;

/* renamed from: ib  reason: default package */
/* compiled from: RectangleContent */
public class ib implements nb.b, eb, gb {
    private final Path a = new Path();
    private final RectF b = new RectF();
    private final String c;
    private final boolean d;
    private final ga e;
    private final nb<?, PointF> f;
    private final nb<?, PointF> g;
    private final nb<?, Float> h;
    private va i = new va();
    private boolean j;

    public ib(ga gaVar, td tdVar, ld ldVar) {
        this.c = ldVar.c();
        this.d = ldVar.f();
        this.e = gaVar;
        this.f = ldVar.d().a();
        this.g = ldVar.e().a();
        this.h = ldVar.b().a();
        tdVar.j(this.f);
        tdVar.j(this.g);
        tdVar.j(this.h);
        this.f.a(this);
        this.g.a(this);
        this.h.a(this);
    }

    private void f() {
        this.j = false;
        this.e.invalidateSelf();
    }

    @Override // defpackage.gb
    public Path a() {
        float f2;
        if (this.j) {
            return this.a;
        }
        this.a.reset();
        if (this.d) {
            this.j = true;
            return this.a;
        }
        PointF h2 = this.g.h();
        float f3 = h2.x / 2.0f;
        float f4 = h2.y / 2.0f;
        nb<?, Float> nbVar = this.h;
        if (nbVar == null) {
            f2 = 0.0f;
        } else {
            f2 = ((pb) nbVar).o();
        }
        float min = Math.min(f3, f4);
        if (f2 > min) {
            f2 = min;
        }
        PointF h3 = this.f.h();
        this.a.moveTo(h3.x + f3, (h3.y - f4) + f2);
        this.a.lineTo(h3.x + f3, (h3.y + f4) - f2);
        if (f2 > 0.0f) {
            RectF rectF = this.b;
            float f5 = h3.x;
            float f6 = f2 * 2.0f;
            float f7 = h3.y;
            rectF.set((f5 + f3) - f6, (f7 + f4) - f6, f5 + f3, f7 + f4);
            this.a.arcTo(this.b, 0.0f, 90.0f, false);
        }
        this.a.lineTo((h3.x - f3) + f2, h3.y + f4);
        if (f2 > 0.0f) {
            RectF rectF2 = this.b;
            float f8 = h3.x;
            float f9 = h3.y;
            float f10 = f2 * 2.0f;
            rectF2.set(f8 - f3, (f9 + f4) - f10, (f8 - f3) + f10, f9 + f4);
            this.a.arcTo(this.b, 90.0f, 90.0f, false);
        }
        this.a.lineTo(h3.x - f3, (h3.y - f4) + f2);
        if (f2 > 0.0f) {
            RectF rectF3 = this.b;
            float f11 = h3.x;
            float f12 = h3.y;
            float f13 = f2 * 2.0f;
            rectF3.set(f11 - f3, f12 - f4, (f11 - f3) + f13, (f12 - f4) + f13);
            this.a.arcTo(this.b, 180.0f, 90.0f, false);
        }
        this.a.lineTo((h3.x + f3) - f2, h3.y - f4);
        if (f2 > 0.0f) {
            RectF rectF4 = this.b;
            float f14 = h3.x;
            float f15 = f2 * 2.0f;
            float f16 = h3.y;
            rectF4.set((f14 + f3) - f15, f16 - f4, f14 + f3, (f16 - f4) + f15);
            this.a.arcTo(this.b, 270.0f, 90.0f, false);
        }
        this.a.close();
        this.i.b(this.a);
        this.j = true;
        return this.a;
    }

    @Override // defpackage.nb.b
    public void b() {
        f();
    }

    @Override // defpackage.wa
    public void c(List<wa> list, List<wa> list2) {
        for (int i2 = 0; i2 < list.size(); i2++) {
            wa waVar = list.get(i2);
            if (waVar instanceof mb) {
                mb mbVar = (mb) waVar;
                if (mbVar.j() == sd.a.SIMULTANEOUSLY) {
                    this.i.a(mbVar);
                    mbVar.d(this);
                }
            }
        }
    }

    @Override // defpackage.kc
    public void d(jc jcVar, int i2, List<jc> list, jc jcVar2) {
        zf.l(jcVar, i2, list, jcVar2, this);
    }

    @Override // defpackage.wa
    public String getName() {
        return this.c;
    }

    @Override // defpackage.kc
    public <T> void h(T t, dg<T> dgVar) {
        if (t == la.h) {
            this.g.m(dgVar);
        } else if (t == la.j) {
            this.f.m(dgVar);
        } else if (t == la.i) {
            this.h.m(dgVar);
        }
    }
}
