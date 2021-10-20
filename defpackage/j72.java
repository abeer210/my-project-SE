package defpackage;

/* renamed from: j72  reason: default package */
/* compiled from: GridSampler */
public abstract class j72 {
    private static j72 a = new g72();

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0034  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0075  */
    public static void a(c72 c72, float[] fArr) throws o62 {
        int l = c72.l();
        int g = c72.g();
        boolean z = true;
        for (int i = 0; i < fArr.length && z; i += 2) {
            int i2 = (int) fArr[i];
            int i3 = i + 1;
            int i4 = (int) fArr[i3];
            if (i2 < -1 || i2 > l || i4 < -1 || i4 > g) {
                throw o62.a();
            }
            if (i2 == -1) {
                fArr[i] = 0.0f;
            } else if (i2 == l) {
                fArr[i] = (float) (l - 1);
            } else {
                z = false;
                if (i4 != -1) {
                    fArr[i3] = 0.0f;
                } else if (i4 == g) {
                    fArr[i3] = (float) (g - 1);
                }
                z = true;
            }
            z = true;
            if (i4 != -1) {
            }
            z = true;
        }
        boolean z2 = true;
        for (int length = fArr.length - 2; length >= 0 && z2; length -= 2) {
            int i5 = (int) fArr[length];
            int i6 = length + 1;
            int i7 = (int) fArr[i6];
            if (i5 < -1 || i5 > l || i7 < -1 || i7 > g) {
                throw o62.a();
            }
            if (i5 == -1) {
                fArr[length] = 0.0f;
            } else if (i5 == l) {
                fArr[length] = (float) (l - 1);
            } else {
                z2 = false;
                if (i7 != -1) {
                    fArr[i6] = 0.0f;
                } else if (i7 == g) {
                    fArr[i6] = (float) (g - 1);
                }
                z2 = true;
            }
            z2 = true;
            if (i7 != -1) {
            }
            z2 = true;
        }
    }

    public static j72 b() {
        return a;
    }

    public abstract c72 c(c72 c72, int i, int i2, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, float f11, float f12, float f13, float f14, float f15, float f16) throws o62;

    public abstract c72 d(c72 c72, int i, int i2, l72 l72) throws o62;
}
