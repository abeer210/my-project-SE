package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.List;

/* renamed from: xx1  reason: default package */
/* compiled from: ShapePath */
public class xx1 {
    @Deprecated
    public float a;
    @Deprecated
    public float b;
    @Deprecated
    public float c;
    @Deprecated
    public float d;
    @Deprecated
    public float e;
    @Deprecated
    public float f;
    private final List<f> g = new ArrayList();
    private final List<g> h = new ArrayList();

    /* access modifiers changed from: package-private */
    /* renamed from: xx1$a */
    /* compiled from: ShapePath */
    public class a extends g {
        public final /* synthetic */ List b;
        public final /* synthetic */ Matrix c;

        public a(xx1 xx1, List list, Matrix matrix) {
            this.b = list;
            this.c = matrix;
        }

        @Override // defpackage.xx1.g
        public void a(Matrix matrix, jx1 jx1, int i, Canvas canvas) {
            for (g gVar : this.b) {
                gVar.a(this.c, jx1, i, canvas);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: xx1$b */
    /* compiled from: ShapePath */
    public static class b extends g {
        private final d b;

        public b(d dVar) {
            this.b = dVar;
        }

        @Override // defpackage.xx1.g
        public void a(Matrix matrix, jx1 jx1, int i, Canvas canvas) {
            jx1.a(canvas, matrix, new RectF(this.b.k(), this.b.o(), this.b.l(), this.b.j()), i, this.b.m(), this.b.n());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: xx1$c */
    /* compiled from: ShapePath */
    public static class c extends g {
        private final e b;
        private final float c;
        private final float d;

        public c(e eVar, float f, float f2) {
            this.b = eVar;
            this.c = f;
            this.d = f2;
        }

        @Override // defpackage.xx1.g
        public void a(Matrix matrix, jx1 jx1, int i, Canvas canvas) {
            RectF rectF = new RectF(0.0f, 0.0f, (float) Math.hypot((double) (this.b.c - this.d), (double) (this.b.b - this.c)), 0.0f);
            Matrix matrix2 = new Matrix(matrix);
            matrix2.preTranslate(this.c, this.d);
            matrix2.preRotate(c());
            jx1.b(canvas, matrix2, rectF, i);
        }

        public float c() {
            return (float) Math.toDegrees(Math.atan((double) ((this.b.c - this.d) / (this.b.b - this.c))));
        }
    }

    /* renamed from: xx1$d */
    /* compiled from: ShapePath */
    public static class d extends f {
        private static final RectF h = new RectF();
        @Deprecated
        public float b;
        @Deprecated
        public float c;
        @Deprecated
        public float d;
        @Deprecated
        public float e;
        @Deprecated
        public float f;
        @Deprecated
        public float g;

        public d(float f2, float f3, float f4, float f5) {
            q(f2);
            u(f3);
            r(f4);
            p(f5);
        }

        /* access modifiers changed from: private */
        /* access modifiers changed from: public */
        private float j() {
            return this.e;
        }

        /* access modifiers changed from: private */
        /* access modifiers changed from: public */
        private float k() {
            return this.b;
        }

        /* access modifiers changed from: private */
        /* access modifiers changed from: public */
        private float l() {
            return this.d;
        }

        /* access modifiers changed from: private */
        /* access modifiers changed from: public */
        private float m() {
            return this.f;
        }

        /* access modifiers changed from: private */
        /* access modifiers changed from: public */
        private float n() {
            return this.g;
        }

        /* access modifiers changed from: private */
        /* access modifiers changed from: public */
        private float o() {
            return this.c;
        }

        private void p(float f2) {
            this.e = f2;
        }

        private void q(float f2) {
            this.b = f2;
        }

        private void r(float f2) {
            this.d = f2;
        }

        /* access modifiers changed from: private */
        /* access modifiers changed from: public */
        private void s(float f2) {
            this.f = f2;
        }

        /* access modifiers changed from: private */
        /* access modifiers changed from: public */
        private void t(float f2) {
            this.g = f2;
        }

        private void u(float f2) {
            this.c = f2;
        }

        @Override // defpackage.xx1.f
        public void a(Matrix matrix, Path path) {
            Matrix matrix2 = this.a;
            matrix.invert(matrix2);
            path.transform(matrix2);
            h.set(k(), o(), l(), j());
            path.arcTo(h, m(), n(), false);
            path.transform(matrix);
        }
    }

    /* renamed from: xx1$e */
    /* compiled from: ShapePath */
    public static class e extends f {
        private float b;
        private float c;

        @Override // defpackage.xx1.f
        public void a(Matrix matrix, Path path) {
            Matrix matrix2 = this.a;
            matrix.invert(matrix2);
            path.transform(matrix2);
            path.lineTo(this.b, this.c);
            path.transform(matrix);
        }
    }

    /* renamed from: xx1$f */
    /* compiled from: ShapePath */
    public static abstract class f {
        public final Matrix a = new Matrix();

        public abstract void a(Matrix matrix, Path path);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: xx1$g */
    /* compiled from: ShapePath */
    public static abstract class g {
        public static final Matrix a = new Matrix();

        public abstract void a(Matrix matrix, jx1 jx1, int i, Canvas canvas);

        public final void b(jx1 jx1, int i, Canvas canvas) {
            a(a, jx1, i, canvas);
        }
    }

    public xx1() {
        m(0.0f, 0.0f);
    }

    private void b(float f2) {
        if (f() != f2) {
            float f3 = ((f2 - f()) + 360.0f) % 360.0f;
            if (f3 <= 180.0f) {
                d dVar = new d(h(), i(), h(), i());
                dVar.s(f());
                dVar.t(f3);
                this.h.add(new b(dVar));
                o(f2);
            }
        }
    }

    private void c(g gVar, float f2, float f3) {
        b(f2);
        this.h.add(gVar);
        o(f3);
    }

    private float f() {
        return this.e;
    }

    private float g() {
        return this.f;
    }

    private void o(float f2) {
        this.e = f2;
    }

    private void p(float f2) {
        this.f = f2;
    }

    private void q(float f2) {
        this.c = f2;
    }

    private void r(float f2) {
        this.d = f2;
    }

    private void s(float f2) {
        this.a = f2;
    }

    private void t(float f2) {
        this.b = f2;
    }

    public void a(float f2, float f3, float f4, float f5, float f6, float f7) {
        d dVar = new d(f2, f3, f4, f5);
        dVar.s(f6);
        dVar.t(f7);
        this.g.add(dVar);
        b bVar = new b(dVar);
        float f8 = f6 + f7;
        boolean z = f7 < 0.0f;
        if (z) {
            f6 = (f6 + 180.0f) % 360.0f;
        }
        c(bVar, f6, z ? (180.0f + f8) % 360.0f : f8);
        double d2 = (double) f8;
        q(((f2 + f4) * 0.5f) + (((f4 - f2) / 2.0f) * ((float) Math.cos(Math.toRadians(d2)))));
        r(((f3 + f5) * 0.5f) + (((f5 - f3) / 2.0f) * ((float) Math.sin(Math.toRadians(d2)))));
    }

    public void d(Matrix matrix, Path path) {
        int size = this.g.size();
        for (int i = 0; i < size; i++) {
            this.g.get(i).a(matrix, path);
        }
    }

    public g e(Matrix matrix) {
        b(g());
        return new a(this, new ArrayList(this.h), matrix);
    }

    public float h() {
        return this.c;
    }

    public float i() {
        return this.d;
    }

    public float j() {
        return this.a;
    }

    public float k() {
        return this.b;
    }

    public void l(float f2, float f3) {
        e eVar = new e();
        eVar.b = f2;
        eVar.c = f3;
        this.g.add(eVar);
        c cVar = new c(eVar, h(), i());
        c(cVar, cVar.c() + 270.0f, cVar.c() + 270.0f);
        q(f2);
        r(f3);
    }

    public void m(float f2, float f3) {
        n(f2, f3, 270.0f, 0.0f);
    }

    public void n(float f2, float f3, float f4, float f5) {
        s(f2);
        t(f3);
        q(f2);
        r(f3);
        o(f4);
        p((f4 + f5) % 360.0f);
        this.g.clear();
        this.h.clear();
    }
}
