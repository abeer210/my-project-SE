package com.google.android.material.bottomappbar;

/* compiled from: BottomAppBarTopEdgeTreatment */
public class a extends qx1 implements Cloneable {
    private float a;
    private float b;
    private float c;
    private float d;
    private float e;

    @Override // defpackage.qx1
    public void b(float f, float f2, float f3, xx1 xx1) {
        float f4 = this.c;
        if (f4 == 0.0f) {
            xx1.l(f, 0.0f);
            return;
        }
        float f5 = ((this.b * 2.0f) + f4) / 2.0f;
        float f6 = f3 * this.a;
        float f7 = f2 + this.e;
        float f8 = (this.d * f3) + ((1.0f - f3) * f5);
        if (f8 / f5 >= 1.0f) {
            xx1.l(f, 0.0f);
            return;
        }
        float f9 = f5 + f6;
        float f10 = f8 + f6;
        float sqrt = (float) Math.sqrt((double) ((f9 * f9) - (f10 * f10)));
        float f11 = f7 - sqrt;
        float f12 = f7 + sqrt;
        float degrees = (float) Math.toDegrees(Math.atan((double) (sqrt / f10)));
        float f13 = 90.0f - degrees;
        xx1.l(f11, 0.0f);
        float f14 = f6 * 2.0f;
        xx1.a(f11 - f6, 0.0f, f11 + f6, f14, 270.0f, degrees);
        xx1.a(f7 - f5, (-f5) - f8, f7 + f5, f5 - f8, 180.0f - f13, (f13 * 2.0f) - 180.0f);
        xx1.a(f12 - f6, 0.0f, f12 + f6, f14, 270.0f - degrees, degrees);
        xx1.l(f, 0.0f);
    }

    public float c() {
        return this.d;
    }

    public float d() {
        return this.b;
    }

    public float e() {
        return this.a;
    }

    public float f() {
        return this.c;
    }

    public void g(float f) {
        this.d = f;
    }

    public void i(float f) {
        this.b = f;
    }

    public void j(float f) {
        this.a = f;
    }

    public void l(float f) {
        this.c = f;
    }

    public void m(float f) {
        this.e = f;
    }
}
