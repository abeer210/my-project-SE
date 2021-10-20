package defpackage;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;

/* renamed from: cb  reason: default package */
/* compiled from: GradientStrokeContent */
public class cb extends ua {
    private final String o;
    private final boolean p;
    private final u0<LinearGradient> q = new u0<>();
    private final u0<RadialGradient> r = new u0<>();
    private final RectF s = new RectF();
    private final hd t;
    private final int u;
    private final nb<ed, ed> v;
    private final nb<PointF, PointF> w;
    private final nb<PointF, PointF> x;
    private cc y;

    public cb(ga gaVar, td tdVar, gd gdVar) {
        super(gaVar, tdVar, gdVar.b().b(), gdVar.g().b(), gdVar.i(), gdVar.k(), gdVar.m(), gdVar.h(), gdVar.c());
        this.o = gdVar.j();
        this.t = gdVar.f();
        this.p = gdVar.n();
        this.u = (int) (gaVar.n().d() / 32.0f);
        nb<ed, ed> a = gdVar.e().a();
        this.v = a;
        a.a(this);
        tdVar.j(this.v);
        nb<PointF, PointF> a2 = gdVar.l().a();
        this.w = a2;
        a2.a(this);
        tdVar.j(this.w);
        nb<PointF, PointF> a3 = gdVar.d().a();
        this.x = a3;
        a3.a(this);
        tdVar.j(this.x);
    }

    private int[] j(int[] iArr) {
        cc ccVar = this.y;
        if (ccVar != null) {
            Integer[] numArr = (Integer[]) ccVar.h();
            int i = 0;
            if (iArr.length == numArr.length) {
                while (i < iArr.length) {
                    iArr[i] = numArr[i].intValue();
                    i++;
                }
            } else {
                iArr = new int[numArr.length];
                while (i < numArr.length) {
                    iArr[i] = numArr[i].intValue();
                    i++;
                }
            }
        }
        return iArr;
    }

    private int k() {
        int round = Math.round(this.w.f() * ((float) this.u));
        int round2 = Math.round(this.x.f() * ((float) this.u));
        int round3 = Math.round(this.v.f() * ((float) this.u));
        int i = round != 0 ? 527 * round : 17;
        if (round2 != 0) {
            i = i * 31 * round2;
        }
        return round3 != 0 ? i * 31 * round3 : i;
    }

    private LinearGradient l() {
        long k = (long) k();
        LinearGradient g = this.q.g(k);
        if (g != null) {
            return g;
        }
        PointF h = this.w.h();
        PointF h2 = this.x.h();
        ed h3 = this.v.h();
        LinearGradient linearGradient = new LinearGradient(h.x, h.y, h2.x, h2.y, j(h3.a()), h3.b(), Shader.TileMode.CLAMP);
        this.q.m(k, linearGradient);
        return linearGradient;
    }

    private RadialGradient m() {
        long k = (long) k();
        RadialGradient g = this.r.g(k);
        if (g != null) {
            return g;
        }
        PointF h = this.w.h();
        PointF h2 = this.x.h();
        ed h3 = this.v.h();
        int[] j = j(h3.a());
        float[] b = h3.b();
        float f = h.x;
        float f2 = h.y;
        RadialGradient radialGradient = new RadialGradient(f, f2, (float) Math.hypot((double) (h2.x - f), (double) (h2.y - f2)), j, b, Shader.TileMode.CLAMP);
        this.r.m(k, radialGradient);
        return radialGradient;
    }

    @Override // defpackage.ya, defpackage.ua
    public void g(Canvas canvas, Matrix matrix, int i) {
        Shader shader;
        if (!this.p) {
            e(this.s, matrix, false);
            if (this.t == hd.LINEAR) {
                shader = l();
            } else {
                shader = m();
            }
            shader.setLocalMatrix(matrix);
            this.i.setShader(shader);
            super.g(canvas, matrix, i);
        }
    }

    @Override // defpackage.wa
    public String getName() {
        return this.o;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: java.lang.Integer[] */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.kc, defpackage.ua
    public <T> void h(T t2, dg<T> dgVar) {
        super.h(t2, dgVar);
        if (t2 == la.D) {
            cc ccVar = this.y;
            if (ccVar != null) {
                this.f.D(ccVar);
            }
            if (dgVar == null) {
                this.y = null;
                return;
            }
            cc ccVar2 = new cc(dgVar);
            this.y = ccVar2;
            ccVar2.a(this);
            this.f.j(this.y);
        }
    }
}
