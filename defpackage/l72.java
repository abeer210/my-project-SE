package defpackage;

/* renamed from: l72  reason: default package */
/* compiled from: PerspectiveTransform */
public final class l72 {
    private final float a;
    private final float b;
    private final float c;
    private final float d;
    private final float e;
    private final float f;
    private final float g;
    private final float h;
    private final float i;

    private l72(float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10) {
        this.a = f2;
        this.b = f5;
        this.c = f8;
        this.d = f3;
        this.e = f6;
        this.f = f9;
        this.g = f4;
        this.h = f7;
        this.i = f10;
    }

    public static l72 b(float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17) {
        return d(f10, f11, f12, f13, f14, f15, f16, f17).e(c(f2, f3, f4, f5, f6, f7, f8, f9));
    }

    public static l72 c(float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9) {
        return d(f2, f3, f4, f5, f6, f7, f8, f9).a();
    }

    public static l72 d(float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9) {
        float f10 = ((f2 - f4) + f6) - f8;
        float f11 = ((f3 - f5) + f7) - f9;
        if (f10 == 0.0f && f11 == 0.0f) {
            return new l72(f4 - f2, f6 - f4, f2, f5 - f3, f7 - f5, f3, 0.0f, 0.0f, 1.0f);
        }
        float f12 = f4 - f6;
        float f13 = f8 - f6;
        float f14 = f5 - f7;
        float f15 = f9 - f7;
        float f16 = (f12 * f15) - (f13 * f14);
        float f17 = ((f15 * f10) - (f13 * f11)) / f16;
        float f18 = ((f12 * f11) - (f10 * f14)) / f16;
        return new l72((f17 * f4) + (f4 - f2), (f18 * f8) + (f8 - f2), f2, (f5 - f3) + (f17 * f5), (f9 - f3) + (f18 * f9), f3, f17, f18, 1.0f);
    }

    public l72 a() {
        float f2 = this.e;
        float f3 = this.i;
        float f4 = this.f;
        float f5 = this.h;
        float f6 = (f2 * f3) - (f4 * f5);
        float f7 = this.g;
        float f8 = this.d;
        float f9 = (f4 * f7) - (f8 * f3);
        float f10 = (f8 * f5) - (f2 * f7);
        float f11 = this.c;
        float f12 = this.b;
        float f13 = (f11 * f5) - (f12 * f3);
        float f14 = this.a;
        return new l72(f6, f9, f10, f13, (f3 * f14) - (f11 * f7), (f7 * f12) - (f5 * f14), (f12 * f4) - (f11 * f2), (f11 * f8) - (f4 * f14), (f14 * f2) - (f12 * f8));
    }

    public l72 e(l72 l72) {
        float f2 = this.a;
        float f3 = l72.a;
        float f4 = this.d;
        float f5 = l72.b;
        float f6 = this.g;
        float f7 = l72.c;
        float f8 = (f2 * f3) + (f4 * f5) + (f6 * f7);
        float f9 = l72.d;
        float f10 = l72.e;
        float f11 = l72.f;
        float f12 = (f2 * f9) + (f4 * f10) + (f6 * f11);
        float f13 = l72.g;
        float f14 = l72.h;
        float f15 = l72.i;
        float f16 = (f2 * f13) + (f4 * f14) + (f6 * f15);
        float f17 = this.b;
        float f18 = this.e;
        float f19 = this.h;
        float f20 = (f19 * f15) + (f17 * f13) + (f18 * f14);
        float f21 = this.c;
        float f22 = this.f;
        float f23 = (f3 * f21) + (f5 * f22);
        float f24 = this.i;
        return new l72(f8, f12, f16, (f17 * f3) + (f18 * f5) + (f19 * f7), (f17 * f9) + (f18 * f10) + (f19 * f11), f20, (f7 * f24) + f23, (f9 * f21) + (f10 * f22) + (f11 * f24), (f21 * f13) + (f22 * f14) + (f24 * f15));
    }

    public void f(float[] fArr) {
        int length = fArr.length;
        float f2 = this.a;
        float f3 = this.b;
        float f4 = this.c;
        float f5 = this.d;
        float f6 = this.e;
        float f7 = this.f;
        float f8 = this.g;
        float f9 = this.h;
        float f10 = this.i;
        for (int i2 = 0; i2 < length; i2 += 2) {
            float f11 = fArr[i2];
            int i3 = i2 + 1;
            float f12 = fArr[i3];
            float f13 = (f4 * f11) + (f7 * f12) + f10;
            fArr[i2] = (((f2 * f11) + (f5 * f12)) + f8) / f13;
            fArr[i3] = (((f11 * f3) + (f12 * f6)) + f9) / f13;
        }
    }
}
