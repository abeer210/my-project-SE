package defpackage;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import defpackage.nb;
import java.util.ArrayList;
import java.util.List;
import vigqyno.C0201;

/* renamed from: ab  reason: default package */
/* compiled from: FillContent */
public class ab implements ya, nb.b, eb {
    private final Path a = new Path();
    private final Paint b = new ta(1);
    private final td c;
    private final String d;
    private final boolean e;
    private final List<gb> f = new ArrayList();
    private final nb<Integer, Integer> g;
    private final nb<Integer, Integer> h;
    private nb<ColorFilter, ColorFilter> i;
    private final ga j;

    public ab(ga gaVar, td tdVar, od odVar) {
        this.c = tdVar;
        this.d = odVar.d();
        this.e = odVar.f();
        this.j = gaVar;
        if (odVar.b() == null || odVar.e() == null) {
            this.g = null;
            this.h = null;
            return;
        }
        this.a.setFillType(odVar.c());
        nb<Integer, Integer> a2 = odVar.b().a();
        this.g = a2;
        a2.a(this);
        tdVar.j(this.g);
        nb<Integer, Integer> a3 = odVar.e().a();
        this.h = a3;
        a3.a(this);
        tdVar.j(this.h);
    }

    @Override // defpackage.nb.b
    public void b() {
        this.j.invalidateSelf();
    }

    @Override // defpackage.wa
    public void c(List<wa> list, List<wa> list2) {
        for (int i2 = 0; i2 < list2.size(); i2++) {
            wa waVar = list2.get(i2);
            if (waVar instanceof gb) {
                this.f.add((gb) waVar);
            }
        }
    }

    @Override // defpackage.kc
    public void d(jc jcVar, int i2, List<jc> list, jc jcVar2) {
        zf.l(jcVar, i2, list, jcVar2, this);
    }

    @Override // defpackage.ya
    public void e(RectF rectF, Matrix matrix, boolean z) {
        this.a.reset();
        for (int i2 = 0; i2 < this.f.size(); i2++) {
            this.a.addPath(this.f.get(i2).a(), matrix);
        }
        this.a.computeBounds(rectF, false);
        rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
    }

    @Override // defpackage.ya
    public void g(Canvas canvas, Matrix matrix, int i2) {
        if (!this.e) {
            String r0 = C0201.m82(2576);
            ca.a(r0);
            this.b.setColor(((ob) this.g).o());
            this.b.setAlpha(zf.c((int) ((((((float) i2) / 255.0f) * ((float) this.h.h().intValue())) / 100.0f) * 255.0f), 0, 255));
            nb<ColorFilter, ColorFilter> nbVar = this.i;
            if (nbVar != null) {
                this.b.setColorFilter(nbVar.h());
            }
            this.a.reset();
            for (int i3 = 0; i3 < this.f.size(); i3++) {
                this.a.addPath(this.f.get(i3).a(), matrix);
            }
            canvas.drawPath(this.a, this.b);
            ca.b(r0);
        }
    }

    @Override // defpackage.wa
    public String getName() {
        return this.d;
    }

    @Override // defpackage.kc
    public <T> void h(T t, dg<T> dgVar) {
        if (t == la.a) {
            this.g.m(dgVar);
        } else if (t == la.d) {
            this.h.m(dgVar);
        } else if (t == la.C) {
            nb<ColorFilter, ColorFilter> nbVar = this.i;
            if (nbVar != null) {
                this.c.D(nbVar);
            }
            if (dgVar == null) {
                this.i = null;
                return;
            }
            cc ccVar = new cc(dgVar);
            this.i = ccVar;
            ccVar.a(this);
            this.c.j(this.i);
        }
    }
}
