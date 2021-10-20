package defpackage;

/* renamed from: g72  reason: default package */
/* compiled from: DefaultGridSampler */
public final class g72 extends j72 {
    @Override // defpackage.j72
    public c72 c(c72 c72, int i, int i2, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, float f11, float f12, float f13, float f14, float f15, float f16) throws o62 {
        return d(c72, i, i2, l72.b(f, f2, f3, f4, f5, f6, f7, f8, f9, f10, f11, f12, f13, f14, f15, f16));
    }

    @Override // defpackage.j72
    public c72 d(c72 c72, int i, int i2, l72 l72) throws o62 {
        if (i <= 0 || i2 <= 0) {
            throw o62.a();
        }
        c72 c722 = new c72(i, i2);
        int i3 = i * 2;
        float[] fArr = new float[i3];
        for (int i4 = 0; i4 < i2; i4++) {
            float f = ((float) i4) + 0.5f;
            for (int i5 = 0; i5 < i3; i5 += 2) {
                fArr[i5] = ((float) (i5 / 2)) + 0.5f;
                fArr[i5 + 1] = f;
            }
            l72.f(fArr);
            j72.a(c72, fArr);
            for (int i6 = 0; i6 < i3; i6 += 2) {
                try {
                    if (c72.d((int) fArr[i6], (int) fArr[i6 + 1])) {
                        c722.n(i6 / 2, i4);
                    }
                } catch (ArrayIndexOutOfBoundsException unused) {
                    throw o62.a();
                }
            }
        }
        return c722;
    }
}
