package defpackage;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import android.os.Build;

/* renamed from: wx1  reason: default package */
/* compiled from: ShapeAppearancePathProvider */
public class wx1 {
    private final xx1[] a = new xx1[4];
    private final Matrix[] b = new Matrix[4];
    private final Matrix[] c = new Matrix[4];
    private final PointF d = new PointF();
    private final Path e = new Path();
    private final Path f = new Path();
    private final xx1 g = new xx1();
    private final float[] h = new float[2];
    private final float[] i = new float[2];
    private boolean j = true;

    /* renamed from: wx1$a */
    /* compiled from: ShapeAppearancePathProvider */
    public interface a {
        void a(xx1 xx1, Matrix matrix, int i);

        void b(xx1 xx1, Matrix matrix, int i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: wx1$b */
    /* compiled from: ShapeAppearancePathProvider */
    public static final class b {
        public final vx1 a;
        public final Path b;
        public final RectF c;
        public final a d;
        public final float e;

        public b(vx1 vx1, float f, RectF rectF, a aVar, Path path) {
            this.d = aVar;
            this.a = vx1;
            this.e = f;
            this.c = rectF;
            this.b = path;
        }
    }

    public wx1() {
        for (int i2 = 0; i2 < 4; i2++) {
            this.a[i2] = new xx1();
            this.b[i2] = new Matrix();
            this.c[i2] = new Matrix();
        }
    }

    private float a(int i2) {
        return (float) ((i2 + 1) * 90);
    }

    private void b(b bVar, int i2) {
        this.h[0] = this.a[i2].j();
        this.h[1] = this.a[i2].k();
        this.b[i2].mapPoints(this.h);
        if (i2 == 0) {
            Path path = bVar.b;
            float[] fArr = this.h;
            path.moveTo(fArr[0], fArr[1]);
        } else {
            Path path2 = bVar.b;
            float[] fArr2 = this.h;
            path2.lineTo(fArr2[0], fArr2[1]);
        }
        this.a[i2].d(this.b[i2], bVar.b);
        a aVar = bVar.d;
        if (aVar != null) {
            aVar.a(this.a[i2], this.b[i2], i2);
        }
    }

    private void c(b bVar, int i2) {
        int i3 = (i2 + 1) % 4;
        this.h[0] = this.a[i2].h();
        this.h[1] = this.a[i2].i();
        this.b[i2].mapPoints(this.h);
        this.i[0] = this.a[i3].j();
        this.i[1] = this.a[i3].k();
        this.b[i3].mapPoints(this.i);
        float[] fArr = this.h;
        float f2 = fArr[0];
        float[] fArr2 = this.i;
        float max = Math.max(((float) Math.hypot((double) (f2 - fArr2[0]), (double) (fArr[1] - fArr2[1]))) - 0.001f, 0.0f);
        float i4 = i(bVar.c, i2);
        this.g.m(0.0f, 0.0f);
        qx1 j2 = j(i2, bVar.a);
        j2.b(max, i4, bVar.e, this.g);
        Path path = new Path();
        this.g.d(this.c[i2], path);
        if (!this.j || Build.VERSION.SDK_INT < 19 || (!j2.a() && !k(path, i2) && !k(path, i3))) {
            this.g.d(this.c[i2], bVar.b);
        } else {
            path.op(path, this.f, Path.Op.DIFFERENCE);
            this.h[0] = this.g.j();
            this.h[1] = this.g.k();
            this.c[i2].mapPoints(this.h);
            Path path2 = this.e;
            float[] fArr3 = this.h;
            path2.moveTo(fArr3[0], fArr3[1]);
            this.g.d(this.c[i2], this.e);
        }
        a aVar = bVar.d;
        if (aVar != null) {
            aVar.b(this.g, this.c[i2], i2);
        }
    }

    private void f(int i2, RectF rectF, PointF pointF) {
        if (i2 == 1) {
            pointF.set(rectF.right, rectF.bottom);
        } else if (i2 == 2) {
            pointF.set(rectF.left, rectF.bottom);
        } else if (i2 != 3) {
            pointF.set(rectF.right, rectF.top);
        } else {
            pointF.set(rectF.left, rectF.top);
        }
    }

    private nx1 g(int i2, vx1 vx1) {
        if (i2 == 1) {
            return vx1.l();
        }
        if (i2 == 2) {
            return vx1.j();
        }
        if (i2 != 3) {
            return vx1.t();
        }
        return vx1.r();
    }

    private ox1 h(int i2, vx1 vx1) {
        if (i2 == 1) {
            return vx1.k();
        }
        if (i2 == 2) {
            return vx1.i();
        }
        if (i2 != 3) {
            return vx1.s();
        }
        return vx1.q();
    }

    private float i(RectF rectF, int i2) {
        float[] fArr = this.h;
        xx1[] xx1Arr = this.a;
        fArr[0] = xx1Arr[i2].c;
        fArr[1] = xx1Arr[i2].d;
        this.b[i2].mapPoints(fArr);
        if (i2 == 1 || i2 == 3) {
            return Math.abs(rectF.centerX() - this.h[0]);
        }
        return Math.abs(rectF.centerY() - this.h[1]);
    }

    private qx1 j(int i2, vx1 vx1) {
        if (i2 == 1) {
            return vx1.h();
        }
        if (i2 == 2) {
            return vx1.n();
        }
        if (i2 != 3) {
            return vx1.o();
        }
        return vx1.p();
    }

    private boolean k(Path path, int i2) {
        Path path2 = new Path();
        this.a[i2].d(this.b[i2], path2);
        RectF rectF = new RectF();
        path.computeBounds(rectF, true);
        path2.computeBounds(rectF, true);
        path.op(path2, Path.Op.INTERSECT);
        path.computeBounds(rectF, true);
        if (!rectF.isEmpty()) {
            return true;
        }
        if (rectF.width() <= 1.0f || rectF.height() <= 1.0f) {
            return false;
        }
        return true;
    }

    private void l(b bVar, int i2) {
        h(i2, bVar.a).b(this.a[i2], 90.0f, bVar.e, bVar.c, g(i2, bVar.a));
        float a2 = a(i2);
        this.b[i2].reset();
        f(i2, bVar.c, this.d);
        Matrix matrix = this.b[i2];
        PointF pointF = this.d;
        matrix.setTranslate(pointF.x, pointF.y);
        this.b[i2].preRotate(a2);
    }

    private void m(int i2) {
        this.h[0] = this.a[i2].h();
        this.h[1] = this.a[i2].i();
        this.b[i2].mapPoints(this.h);
        float a2 = a(i2);
        this.c[i2].reset();
        Matrix matrix = this.c[i2];
        float[] fArr = this.h;
        matrix.setTranslate(fArr[0], fArr[1]);
        this.c[i2].preRotate(a2);
    }

    public void d(vx1 vx1, float f2, RectF rectF, Path path) {
        e(vx1, f2, rectF, null, path);
    }

    public void e(vx1 vx1, float f2, RectF rectF, a aVar, Path path) {
        path.rewind();
        this.e.rewind();
        this.f.rewind();
        this.f.addRect(rectF, Path.Direction.CW);
        b bVar = new b(vx1, f2, rectF, aVar, path);
        for (int i2 = 0; i2 < 4; i2++) {
            l(bVar, i2);
            m(i2);
        }
        for (int i3 = 0; i3 < 4; i3++) {
            b(bVar, i3);
            c(bVar, i3);
        }
        path.close();
        this.e.close();
        if (Build.VERSION.SDK_INT >= 19 && !this.e.isEmpty()) {
            path.op(this.e, Path.Op.UNION);
        }
    }
}
