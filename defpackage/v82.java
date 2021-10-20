package defpackage;

import vigqyno.C0188;

/* renamed from: v82  reason: default package */
/* compiled from: AbstractRSSReader */
public abstract class v82 extends o82 {
    private final int[] a = new int[4];
    private final int[] b;
    private final float[] c;
    private final float[] d;
    private final int[] e;
    private final int[] f;

    public v82() {
        int[] iArr = new int[8];
        this.b = iArr;
        this.c = new float[4];
        this.d = new float[4];
        this.e = new int[(iArr.length / 2)];
        this.f = new int[(iArr.length / 2)];
    }

    public static void h(int[] iArr, float[] fArr) {
        int i = 0;
        float f2 = fArr[0];
        for (int i2 = 1; i2 < iArr.length; i2++) {
            if (fArr[i2] < f2) {
                f2 = fArr[i2];
                i = i2;
            }
        }
        iArr[i] = iArr[i] - 1;
    }

    public static void o(int[] iArr, float[] fArr) {
        int i = 0;
        float f2 = fArr[0];
        for (int i2 = 1; i2 < iArr.length; i2++) {
            if (fArr[i2] > f2) {
                f2 = fArr[i2];
                i = i2;
            }
        }
        iArr[i] = iArr[i] + 1;
    }

    public static boolean p(int[] iArr) {
        int i = iArr[0] + iArr[1];
        float f2 = ((float) i) / ((float) ((iArr[2] + i) + iArr[3]));
        if (f2 >= 0.7916667f && f2 <= 0.89285713f) {
            int i2 = C0188.f24;
            int i3 = C0188.f23;
            for (int i4 : iArr) {
                if (i4 > i3) {
                    i3 = i4;
                }
                if (i4 < i2) {
                    i2 = i4;
                }
            }
            if (i3 < i2 * 10) {
                return true;
            }
        }
        return false;
    }

    public static int q(int[] iArr, int[][] iArr2) throws o62 {
        for (int i = 0; i < iArr2.length; i++) {
            if (o82.e(iArr, iArr2[i], 0.45f) < 0.2f) {
                return i;
            }
        }
        throw o62.a();
    }

    public final int[] i() {
        return this.b;
    }

    public final int[] j() {
        return this.a;
    }

    public final int[] k() {
        return this.f;
    }

    public final float[] l() {
        return this.d;
    }

    public final int[] m() {
        return this.e;
    }

    public final float[] n() {
        return this.c;
    }
}
