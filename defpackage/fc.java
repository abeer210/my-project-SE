package defpackage;

import android.graphics.PointF;

/* renamed from: fc  reason: default package */
/* compiled from: CubicCurveData */
public class fc {
    private final PointF a;
    private final PointF b;
    private final PointF c;

    public fc() {
        this.a = new PointF();
        this.b = new PointF();
        this.c = new PointF();
    }

    public PointF a() {
        return this.a;
    }

    public PointF b() {
        return this.b;
    }

    public PointF c() {
        return this.c;
    }

    public void d(float f, float f2) {
        this.a.set(f, f2);
    }

    public void e(float f, float f2) {
        this.b.set(f, f2);
    }

    public void f(float f, float f2) {
        this.c.set(f, f2);
    }

    public fc(PointF pointF, PointF pointF2, PointF pointF3) {
        this.a = pointF;
        this.b = pointF2;
        this.c = pointF3;
    }
}
