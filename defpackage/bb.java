package defpackage;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import defpackage.nb;
import java.util.ArrayList;
import java.util.List;
import vigqyno.C0201;

/* renamed from: bb  reason: default package */
/* compiled from: GradientFillContent */
public class bb implements ya, nb.b, eb {
    private final String a;
    private final boolean b;
    private final td c;
    private final u0<LinearGradient> d = new u0<>();
    private final u0<RadialGradient> e = new u0<>();
    private final Path f = new Path();
    private final Paint g = new ta(1);
    private final RectF h = new RectF();
    private final List<gb> i = new ArrayList();
    private final hd j;
    private final nb<ed, ed> k;
    private final nb<Integer, Integer> l;
    private final nb<PointF, PointF> m;
    private final nb<PointF, PointF> n;
    private nb<ColorFilter, ColorFilter> o;
    private cc p;
    private final ga q;
    private final int r;

    public bb(ga gaVar, td tdVar, fd fdVar) {
        this.c = tdVar;
        this.a = fdVar.f();
        this.b = fdVar.i();
        this.q = gaVar;
        this.j = fdVar.e();
        this.f.setFillType(fdVar.c());
        this.r = (int) (gaVar.n().d() / 32.0f);
        nb<ed, ed> a2 = fdVar.d().a();
        this.k = a2;
        a2.a(this);
        tdVar.j(this.k);
        nb<Integer, Integer> a3 = fdVar.g().a();
        this.l = a3;
        a3.a(this);
        tdVar.j(this.l);
        nb<PointF, PointF> a4 = fdVar.h().a();
        this.m = a4;
        a4.a(this);
        tdVar.j(this.m);
        nb<PointF, PointF> a5 = fdVar.b().a();
        this.n = a5;
        a5.a(this);
        tdVar.j(this.n);
    }

    private int[] f(int[] iArr) {
        cc ccVar = this.p;
        if (ccVar != null) {
            Integer[] numArr = (Integer[]) ccVar.h();
            int i2 = 0;
            if (iArr.length == numArr.length) {
                while (i2 < iArr.length) {
                    iArr[i2] = numArr[i2].intValue();
                    i2++;
                }
            } else {
                iArr = new int[numArr.length];
                while (i2 < numArr.length) {
                    iArr[i2] = numArr[i2].intValue();
                    i2++;
                }
            }
        }
        return iArr;
    }

    private int i() {
        int round = Math.round(this.m.f() * ((float) this.r));
        int round2 = Math.round(this.n.f() * ((float) this.r));
        int round3 = Math.round(this.k.f() * ((float) this.r));
        int i2 = round != 0 ? 527 * round : 17;
        if (round2 != 0) {
            i2 = i2 * 31 * round2;
        }
        return round3 != 0 ? i2 * 31 * round3 : i2;
    }

    private LinearGradient j() {
        long i2 = (long) i();
        LinearGradient g2 = this.d.g(i2);
        if (g2 != null) {
            return g2;
        }
        PointF h2 = this.m.h();
        PointF h3 = this.n.h();
        ed h4 = this.k.h();
        LinearGradient linearGradient = new LinearGradient(h2.x, h2.y, h3.x, h3.y, f(h4.a()), h4.b(), Shader.TileMode.CLAMP);
        this.d.m(i2, linearGradient);
        return linearGradient;
    }

    private RadialGradient k() {
        long i2 = (long) i();
        RadialGradient g2 = this.e.g(i2);
        if (g2 != null) {
            return g2;
        }
        PointF h2 = this.m.h();
        PointF h3 = this.n.h();
        ed h4 = this.k.h();
        int[] f2 = f(h4.a());
        float[] b2 = h4.b();
        float f3 = h2.x;
        float f4 = h2.y;
        float hypot = (float) Math.hypot((double) (h3.x - f3), (double) (h3.y - f4));
        RadialGradient radialGradient = new RadialGradient(f3, f4, hypot <= 0.0f ? 0.001f : hypot, f2, b2, Shader.TileMode.CLAMP);
        this.e.m(i2, radialGradient);
        return radialGradient;
    }

    @Override // defpackage.nb.b
    public void b() {
        this.q.invalidateSelf();
    }

    @Override // defpackage.wa
    public void c(List<wa> list, List<wa> list2) {
        for (int i2 = 0; i2 < list2.size(); i2++) {
            wa waVar = list2.get(i2);
            if (waVar instanceof gb) {
                this.i.add((gb) waVar);
            }
        }
    }

    @Override // defpackage.kc
    public void d(jc jcVar, int i2, List<jc> list, jc jcVar2) {
        zf.l(jcVar, i2, list, jcVar2, this);
    }

    @Override // defpackage.ya
    public void e(RectF rectF, Matrix matrix, boolean z) {
        this.f.reset();
        for (int i2 = 0; i2 < this.i.size(); i2++) {
            this.f.addPath(this.i.get(i2).a(), matrix);
        }
        this.f.computeBounds(rectF, false);
        rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
    }

    @Override // defpackage.ya
    public void g(Canvas canvas, Matrix matrix, int i2) {
        Shader shader;
        if (!this.b) {
            String r0 = C0201.m82(4916);
            ca.a(r0);
            this.f.reset();
            for (int i3 = 0; i3 < this.i.size(); i3++) {
                this.f.addPath(this.i.get(i3).a(), matrix);
            }
            this.f.computeBounds(this.h, false);
            if (this.j == hd.LINEAR) {
                shader = j();
            } else {
                shader = k();
            }
            shader.setLocalMatrix(matrix);
            this.g.setShader(shader);
            nb<ColorFilter, ColorFilter> nbVar = this.o;
            if (nbVar != null) {
                this.g.setColorFilter(nbVar.h());
            }
            this.g.setAlpha(zf.c((int) ((((((float) i2) / 255.0f) * ((float) this.l.h().intValue())) / 100.0f) * 255.0f), 0, 255));
            canvas.drawPath(this.f, this.g);
            ca.b(r0);
        }
    }

    @Override // defpackage.wa
    public String getName() {
        return this.a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v2, resolved type: java.lang.Integer[] */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.kc
    public <T> void h(T t, dg<T> dgVar) {
        if (t == la.d) {
            this.l.m(dgVar);
        } else if (t == la.C) {
            nb<ColorFilter, ColorFilter> nbVar = this.o;
            if (nbVar != null) {
                this.c.D(nbVar);
            }
            if (dgVar == null) {
                this.o = null;
                return;
            }
            cc ccVar = new cc(dgVar);
            this.o = ccVar;
            ccVar.a(this);
            this.c.j(this.o);
        } else if (t == la.D) {
            cc ccVar2 = this.p;
            if (ccVar2 != null) {
                this.c.D(ccVar2);
            }
            if (dgVar == null) {
                this.p = null;
                return;
            }
            cc ccVar3 = new cc(dgVar);
            this.p = ccVar3;
            ccVar3.a(this);
            this.c.j(this.p);
        }
    }
}
