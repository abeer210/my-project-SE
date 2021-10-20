package defpackage;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;

/* renamed from: lb  reason: default package */
/* compiled from: StrokeContent */
public class lb extends ua {
    private final td o;
    private final String p;
    private final boolean q;
    private final nb<Integer, Integer> r;
    private nb<ColorFilter, ColorFilter> s;

    public lb(ga gaVar, td tdVar, rd rdVar) {
        super(gaVar, tdVar, rdVar.b().b(), rdVar.e().b(), rdVar.g(), rdVar.i(), rdVar.j(), rdVar.f(), rdVar.d());
        this.o = tdVar;
        this.p = rdVar.h();
        this.q = rdVar.k();
        nb<Integer, Integer> a = rdVar.c().a();
        this.r = a;
        a.a(this);
        tdVar.j(this.r);
    }

    @Override // defpackage.ya, defpackage.ua
    public void g(Canvas canvas, Matrix matrix, int i) {
        if (!this.q) {
            this.i.setColor(((ob) this.r).o());
            nb<ColorFilter, ColorFilter> nbVar = this.s;
            if (nbVar != null) {
                this.i.setColorFilter(nbVar.h());
            }
            super.g(canvas, matrix, i);
        }
    }

    @Override // defpackage.wa
    public String getName() {
        return this.p;
    }

    @Override // defpackage.kc, defpackage.ua
    public <T> void h(T t, dg<T> dgVar) {
        super.h(t, dgVar);
        if (t == la.b) {
            this.r.m(dgVar);
        } else if (t == la.C) {
            nb<ColorFilter, ColorFilter> nbVar = this.s;
            if (nbVar != null) {
                this.o.D(nbVar);
            }
            if (dgVar == null) {
                this.s = null;
                return;
            }
            cc ccVar = new cc(dgVar);
            this.s = ccVar;
            ccVar.a(this);
            this.o.j(this.r);
        }
    }
}
