package defpackage;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.DashPathEffect;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.RectF;
import defpackage.nb;
import defpackage.sd;
import java.util.ArrayList;
import java.util.List;
import vigqyno.C0201;

/* renamed from: ua  reason: default package */
/* compiled from: BaseStrokeContent */
public abstract class ua implements nb.b, eb, ya {
    private final PathMeasure a = new PathMeasure();
    private final Path b = new Path();
    private final Path c = new Path();
    private final RectF d = new RectF();
    private final ga e;
    public final td f;
    private final List<b> g = new ArrayList();
    private final float[] h;
    public final Paint i;
    private final nb<?, Float> j;
    private final nb<?, Integer> k;
    private final List<nb<?, Float>> l;
    private final nb<?, Float> m;
    private nb<ColorFilter, ColorFilter> n;

    /* access modifiers changed from: private */
    /* renamed from: ua$b */
    /* compiled from: BaseStrokeContent */
    public static final class b {
        private final List<gb> a;
        private final mb b;

        private b(mb mbVar) {
            this.a = new ArrayList();
            this.b = mbVar;
        }
    }

    public ua(ga gaVar, td tdVar, Paint.Cap cap, Paint.Join join, float f2, rc rcVar, pc pcVar, List<pc> list, pc pcVar2) {
        ta taVar = new ta(1);
        this.i = taVar;
        this.e = gaVar;
        this.f = tdVar;
        taVar.setStyle(Paint.Style.STROKE);
        this.i.setStrokeCap(cap);
        this.i.setStrokeJoin(join);
        this.i.setStrokeMiter(f2);
        this.k = rcVar.a();
        this.j = pcVar.a();
        if (pcVar2 == null) {
            this.m = null;
        } else {
            this.m = pcVar2.a();
        }
        this.l = new ArrayList(list.size());
        this.h = new float[list.size()];
        for (int i2 = 0; i2 < list.size(); i2++) {
            this.l.add(list.get(i2).a());
        }
        tdVar.j(this.k);
        tdVar.j(this.j);
        for (int i3 = 0; i3 < this.l.size(); i3++) {
            tdVar.j(this.l.get(i3));
        }
        nb<?, Float> nbVar = this.m;
        if (nbVar != null) {
            tdVar.j(nbVar);
        }
        this.k.a(this);
        this.j.a(this);
        for (int i4 = 0; i4 < list.size(); i4++) {
            this.l.get(i4).a(this);
        }
        nb<?, Float> nbVar2 = this.m;
        if (nbVar2 != null) {
            nbVar2.a(this);
        }
    }

    private void f(Matrix matrix) {
        String r0 = C0201.m82(9757);
        ca.a(r0);
        if (this.l.isEmpty()) {
            ca.b(r0);
            return;
        }
        float g2 = ag.g(matrix);
        for (int i2 = 0; i2 < this.l.size(); i2++) {
            this.h[i2] = this.l.get(i2).h().floatValue();
            if (i2 % 2 == 0) {
                float[] fArr = this.h;
                if (fArr[i2] < 1.0f) {
                    fArr[i2] = 1.0f;
                }
            } else {
                float[] fArr2 = this.h;
                if (fArr2[i2] < 0.1f) {
                    fArr2[i2] = 0.1f;
                }
            }
            float[] fArr3 = this.h;
            fArr3[i2] = fArr3[i2] * g2;
        }
        nb<?, Float> nbVar = this.m;
        this.i.setPathEffect(new DashPathEffect(this.h, nbVar == null ? 0.0f : g2 * nbVar.h().floatValue()));
        ca.b(r0);
    }

    private void i(Canvas canvas, b bVar, Matrix matrix) {
        String r0 = C0201.m82(9758);
        ca.a(r0);
        if (bVar.b == null) {
            ca.b(r0);
            return;
        }
        this.b.reset();
        for (int size = bVar.a.size() - 1; size >= 0; size--) {
            this.b.addPath(((gb) bVar.a.get(size)).a(), matrix);
        }
        this.a.setPath(this.b, false);
        float length = this.a.getLength();
        while (this.a.nextContour()) {
            length += this.a.getLength();
        }
        float floatValue = (bVar.b.h().h().floatValue() * length) / 360.0f;
        float floatValue2 = ((bVar.b.i().h().floatValue() * length) / 100.0f) + floatValue;
        float floatValue3 = ((bVar.b.f().h().floatValue() * length) / 100.0f) + floatValue;
        float f2 = 0.0f;
        for (int size2 = bVar.a.size() - 1; size2 >= 0; size2--) {
            this.c.set(((gb) bVar.a.get(size2)).a());
            this.c.transform(matrix);
            this.a.setPath(this.c, false);
            float length2 = this.a.getLength();
            float f3 = 1.0f;
            if (floatValue3 > length) {
                float f4 = floatValue3 - length;
                if (f4 < f2 + length2 && f2 < f4) {
                    ag.a(this.c, floatValue2 > length ? (floatValue2 - length) / length2 : 0.0f, Math.min(f4 / length2, 1.0f), 0.0f);
                    canvas.drawPath(this.c, this.i);
                    f2 += length2;
                }
            }
            float f5 = f2 + length2;
            if (f5 >= floatValue2 && f2 <= floatValue3) {
                if (f5 > floatValue3 || floatValue2 >= f2) {
                    float f6 = floatValue2 < f2 ? 0.0f : (floatValue2 - f2) / length2;
                    if (floatValue3 <= f5) {
                        f3 = (floatValue3 - f2) / length2;
                    }
                    ag.a(this.c, f6, f3, 0.0f);
                    canvas.drawPath(this.c, this.i);
                } else {
                    canvas.drawPath(this.c, this.i);
                }
            }
            f2 += length2;
        }
        ca.b(r0);
    }

    @Override // defpackage.nb.b
    public void b() {
        this.e.invalidateSelf();
    }

    @Override // defpackage.wa
    public void c(List<wa> list, List<wa> list2) {
        mb mbVar = null;
        for (int size = list.size() - 1; size >= 0; size--) {
            wa waVar = list.get(size);
            if (waVar instanceof mb) {
                mb mbVar2 = (mb) waVar;
                if (mbVar2.j() == sd.a.INDIVIDUALLY) {
                    mbVar = mbVar2;
                }
            }
        }
        if (mbVar != null) {
            mbVar.d(this);
        }
        b bVar = null;
        for (int size2 = list2.size() - 1; size2 >= 0; size2--) {
            wa waVar2 = list2.get(size2);
            if (waVar2 instanceof mb) {
                mb mbVar3 = (mb) waVar2;
                if (mbVar3.j() == sd.a.INDIVIDUALLY) {
                    if (bVar != null) {
                        this.g.add(bVar);
                    }
                    bVar = new b(mbVar3);
                    mbVar3.d(this);
                }
            }
            if (waVar2 instanceof gb) {
                if (bVar == null) {
                    bVar = new b(mbVar);
                }
                bVar.a.add((gb) waVar2);
            }
        }
        if (bVar != null) {
            this.g.add(bVar);
        }
    }

    @Override // defpackage.kc
    public void d(jc jcVar, int i2, List<jc> list, jc jcVar2) {
        zf.l(jcVar, i2, list, jcVar2, this);
    }

    @Override // defpackage.ya
    public void e(RectF rectF, Matrix matrix, boolean z) {
        String r9 = C0201.m82(9759);
        ca.a(r9);
        this.b.reset();
        for (int i2 = 0; i2 < this.g.size(); i2++) {
            b bVar = this.g.get(i2);
            for (int i3 = 0; i3 < bVar.a.size(); i3++) {
                this.b.addPath(((gb) bVar.a.get(i3)).a(), matrix);
            }
        }
        this.b.computeBounds(this.d, false);
        float o = ((pb) this.j).o();
        RectF rectF2 = this.d;
        float f2 = o / 2.0f;
        rectF2.set(rectF2.left - f2, rectF2.top - f2, rectF2.right + f2, rectF2.bottom + f2);
        rectF.set(this.d);
        rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
        ca.b(r9);
    }

    @Override // defpackage.ya
    public void g(Canvas canvas, Matrix matrix, int i2) {
        String r0 = C0201.m82(9760);
        ca.a(r0);
        if (ag.h(matrix)) {
            ca.b(r0);
            return;
        }
        this.i.setAlpha(zf.c((int) ((((((float) i2) / 255.0f) * ((float) ((rb) this.k).o())) / 100.0f) * 255.0f), 0, 255));
        this.i.setStrokeWidth(((pb) this.j).o() * ag.g(matrix));
        if (this.i.getStrokeWidth() <= 0.0f) {
            ca.b(r0);
            return;
        }
        f(matrix);
        nb<ColorFilter, ColorFilter> nbVar = this.n;
        if (nbVar != null) {
            this.i.setColorFilter(nbVar.h());
        }
        for (int i3 = 0; i3 < this.g.size(); i3++) {
            b bVar = this.g.get(i3);
            if (bVar.b != null) {
                i(canvas, bVar, matrix);
            } else {
                String r1 = C0201.m82(9761);
                ca.a(r1);
                this.b.reset();
                for (int size = bVar.a.size() - 1; size >= 0; size--) {
                    this.b.addPath(((gb) bVar.a.get(size)).a(), matrix);
                }
                ca.b(r1);
                String r9 = C0201.m82(9762);
                ca.a(r9);
                canvas.drawPath(this.b, this.i);
                ca.b(r9);
            }
        }
        ca.b(r0);
    }

    @Override // defpackage.kc
    public <T> void h(T t, dg<T> dgVar) {
        if (t == la.d) {
            this.k.m(dgVar);
        } else if (t == la.o) {
            this.j.m(dgVar);
        } else if (t == la.C) {
            nb<ColorFilter, ColorFilter> nbVar = this.n;
            if (nbVar != null) {
                this.f.D(nbVar);
            }
            if (dgVar == null) {
                this.n = null;
                return;
            }
            cc ccVar = new cc(dgVar);
            this.n = ccVar;
            ccVar.a(this);
            this.f.j(this.n);
        }
    }
}
