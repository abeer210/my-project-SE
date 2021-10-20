package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import defpackage.nb;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;
import vigqyno.C0201;

/* renamed from: jb  reason: default package */
/* compiled from: RepeaterContent */
public class jb implements ya, gb, db, nb.b, eb {
    private final Matrix a = new Matrix();
    private final Path b = new Path();
    private final ga c;
    private final td d;
    private final String e;
    private final boolean f;
    private final nb<Float, Float> g;
    private final nb<Float, Float> h;
    private final bc i;
    private xa j;

    public jb(ga gaVar, td tdVar, md mdVar) {
        this.c = gaVar;
        this.d = tdVar;
        this.e = mdVar.c();
        this.f = mdVar.f();
        nb<Float, Float> a2 = mdVar.b().a();
        this.g = a2;
        tdVar.j(a2);
        this.g.a(this);
        nb<Float, Float> a3 = mdVar.d().a();
        this.h = a3;
        tdVar.j(a3);
        this.h.a(this);
        bc b2 = mdVar.e().b();
        this.i = b2;
        b2.a(tdVar);
        this.i.b(this);
    }

    @Override // defpackage.gb
    public Path a() {
        Path a2 = this.j.a();
        this.b.reset();
        float floatValue = this.g.h().floatValue();
        float floatValue2 = this.h.h().floatValue();
        for (int i2 = ((int) floatValue) - 1; i2 >= 0; i2--) {
            this.a.set(this.i.g(((float) i2) + floatValue2));
            this.b.addPath(a2, this.a);
        }
        return this.b;
    }

    @Override // defpackage.nb.b
    public void b() {
        this.c.invalidateSelf();
    }

    @Override // defpackage.wa
    public void c(List<wa> list, List<wa> list2) {
        this.j.c(list, list2);
    }

    @Override // defpackage.kc
    public void d(jc jcVar, int i2, List<jc> list, jc jcVar2) {
        zf.l(jcVar, i2, list, jcVar2, this);
    }

    @Override // defpackage.ya
    public void e(RectF rectF, Matrix matrix, boolean z) {
        this.j.e(rectF, matrix, z);
    }

    /* JADX WARNING: Removed duplicated region for block: B:3:0x0005 A[LOOP:0: B:3:0x0005->B:6:0x000f, LOOP_START] */
    @Override // defpackage.db
    public void f(ListIterator<wa> listIterator) {
        if (this.j == null) {
            while (listIterator.hasPrevious() && listIterator.previous() != this) {
            }
            ArrayList arrayList = new ArrayList();
            while (listIterator.hasPrevious()) {
                arrayList.add(listIterator.previous());
                listIterator.remove();
            }
            Collections.reverse(arrayList);
            this.j = new xa(this.c, this.d, C0201.m82(24166), this.f, arrayList, null);
        }
    }

    @Override // defpackage.ya
    public void g(Canvas canvas, Matrix matrix, int i2) {
        float floatValue = this.g.h().floatValue();
        float floatValue2 = this.h.h().floatValue();
        float floatValue3 = this.i.i().h().floatValue() / 100.0f;
        float floatValue4 = this.i.e().h().floatValue() / 100.0f;
        for (int i3 = ((int) floatValue) - 1; i3 >= 0; i3--) {
            this.a.set(matrix);
            float f2 = (float) i3;
            this.a.preConcat(this.i.g(f2 + floatValue2));
            this.j.g(canvas, this.a, (int) (((float) i2) * zf.j(floatValue3, floatValue4, f2 / floatValue)));
        }
    }

    @Override // defpackage.wa
    public String getName() {
        return this.e;
    }

    @Override // defpackage.kc
    public <T> void h(T t, dg<T> dgVar) {
        if (!this.i.c(t, dgVar)) {
            if (t == la.q) {
                this.g.m(dgVar);
            } else if (t == la.r) {
                this.h.m(dgVar);
            }
        }
    }
}
