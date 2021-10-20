package defpackage;

import java.lang.reflect.Array;

/* renamed from: ja2  reason: default package */
/* compiled from: PDF417CodewordDecoder */
public final class ja2 {
    private static final float[][] a;

    static {
        int i;
        int length = y92.b.length;
        int[] iArr = new int[2];
        iArr[1] = 8;
        iArr[0] = length;
        a = (float[][]) Array.newInstance(float.class, iArr);
        int i2 = 0;
        while (true) {
            int[] iArr2 = y92.b;
            if (i2 < iArr2.length) {
                int i3 = iArr2[i2];
                int i4 = i3 & 1;
                int i5 = 0;
                while (i5 < 8) {
                    float f = 0.0f;
                    while (true) {
                        i = i3 & 1;
                        if (i != i4) {
                            break;
                        }
                        f += 1.0f;
                        i3 >>= 1;
                    }
                    a[i2][(8 - i5) - 1] = f / 17.0f;
                    i5++;
                    i4 = i;
                }
                i2++;
            } else {
                return;
            }
        }
    }

    private static int a(int[] iArr) {
        long j = 0;
        for (int i = 0; i < iArr.length; i++) {
            for (int i2 = 0; i2 < iArr[i]; i2++) {
                int i3 = 1;
                long j2 = j << 1;
                if (i % 2 != 0) {
                    i3 = 0;
                }
                j = j2 | ((long) i3);
            }
        }
        return (int) j;
    }

    private static int b(int[] iArr) {
        int d = n72.d(iArr);
        float[] fArr = new float[8];
        if (d > 1) {
            for (int i = 0; i < 8; i++) {
                fArr[i] = ((float) iArr[i]) / ((float) d);
            }
        }
        float f = Float.MAX_VALUE;
        int i2 = -1;
        int i3 = 0;
        while (true) {
            float[][] fArr2 = a;
            if (i3 >= fArr2.length) {
                return i2;
            }
            float f2 = 0.0f;
            float[] fArr3 = fArr2[i3];
            for (int i4 = 0; i4 < 8; i4++) {
                float f3 = fArr3[i4] - fArr[i4];
                f2 += f3 * f3;
                if (f2 >= f) {
                    break;
                }
            }
            if (f2 < f) {
                i2 = y92.b[i3];
                f = f2;
            }
            i3++;
        }
    }

    private static int c(int[] iArr) {
        int a2 = a(iArr);
        if (y92.a(a2) == -1) {
            return -1;
        }
        return a2;
    }

    public static int d(int[] iArr) {
        int c = c(e(iArr));
        if (c != -1) {
            return c;
        }
        return b(iArr);
    }

    private static int[] e(int[] iArr) {
        float d = (float) n72.d(iArr);
        int[] iArr2 = new int[8];
        int i = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < 17; i3++) {
            if (((float) (iArr[i2] + i)) <= (d / 34.0f) + ((((float) i3) * d) / 17.0f)) {
                i += iArr[i2];
                i2++;
            }
            iArr2[i2] = iArr2[i2] + 1;
        }
        return iArr2;
    }
}
