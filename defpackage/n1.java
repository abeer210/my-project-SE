package defpackage;

import android.graphics.Color;
import vigqyno.C0201;

/* renamed from: n1  reason: default package */
/* compiled from: ColorUtils */
public final class n1 {
    private static final ThreadLocal<double[]> a = new ThreadLocal<>();

    public static int a(double d, double d2, double d3) {
        double[] m = m();
        b(d, d2, d3, m);
        return e(m[0], m[1], m[2]);
    }

    public static void b(double d, double d2, double d3, double[] dArr) {
        double d4 = (d + 16.0d) / 116.0d;
        double d5 = (d2 / 500.0d) + d4;
        double d6 = d4 - (d3 / 200.0d);
        double pow = Math.pow(d5, 3.0d);
        if (pow <= 0.008856d) {
            pow = ((d5 * 116.0d) - 16.0d) / 903.3d;
        }
        double pow2 = d > 7.9996247999999985d ? Math.pow(d4, 3.0d) : d / 903.3d;
        double pow3 = Math.pow(d6, 3.0d);
        if (pow3 <= 0.008856d) {
            pow3 = ((d6 * 116.0d) - 16.0d) / 903.3d;
        }
        dArr[0] = pow * 95.047d;
        dArr[1] = pow2 * 100.0d;
        dArr[2] = pow3 * 108.883d;
    }

    public static void c(int i, int i2, int i3, double[] dArr) {
        d(i, i2, i3, dArr);
        f(dArr[0], dArr[1], dArr[2], dArr);
    }

    public static void d(int i, int i2, int i3, double[] dArr) {
        double d;
        double d2;
        double d3;
        if (dArr.length == 3) {
            double d4 = (double) i;
            Double.isNaN(d4);
            double d5 = d4 / 255.0d;
            if (d5 < 0.04045d) {
                d = d5 / 12.92d;
            } else {
                d = Math.pow((d5 + 0.055d) / 1.055d, 2.4d);
            }
            double d6 = (double) i2;
            Double.isNaN(d6);
            double d7 = d6 / 255.0d;
            if (d7 < 0.04045d) {
                d2 = d7 / 12.92d;
            } else {
                d2 = Math.pow((d7 + 0.055d) / 1.055d, 2.4d);
            }
            double d8 = (double) i3;
            Double.isNaN(d8);
            double d9 = d8 / 255.0d;
            if (d9 < 0.04045d) {
                d3 = d9 / 12.92d;
            } else {
                d3 = Math.pow((d9 + 0.055d) / 1.055d, 2.4d);
            }
            dArr[0] = ((0.4124d * d) + (0.3576d * d2) + (0.1805d * d3)) * 100.0d;
            dArr[1] = ((0.2126d * d) + (0.7152d * d2) + (0.0722d * d3)) * 100.0d;
            dArr[2] = ((d * 0.0193d) + (d2 * 0.1192d) + (d3 * 0.9505d)) * 100.0d;
            return;
        }
        throw new IllegalArgumentException(C0201.m82(29416));
    }

    public static int e(double d, double d2, double d3) {
        double d4 = (((3.2406d * d) + (-1.5372d * d2)) + (-0.4986d * d3)) / 100.0d;
        double d5 = (((-0.9689d * d) + (1.8758d * d2)) + (0.0415d * d3)) / 100.0d;
        double d6 = (((0.0557d * d) + (-0.204d * d2)) + (1.057d * d3)) / 100.0d;
        return Color.rgb(l((int) Math.round((d4 > 0.0031308d ? (Math.pow(d4, 0.4166666666666667d) * 1.055d) - 0.055d : d4 * 12.92d) * 255.0d), 0, 255), l((int) Math.round((d5 > 0.0031308d ? (Math.pow(d5, 0.4166666666666667d) * 1.055d) - 0.055d : d5 * 12.92d) * 255.0d), 0, 255), l((int) Math.round((d6 > 0.0031308d ? (Math.pow(d6, 0.4166666666666667d) * 1.055d) - 0.055d : d6 * 12.92d) * 255.0d), 0, 255));
    }

    public static void f(double d, double d2, double d3, double[] dArr) {
        if (dArr.length == 3) {
            double n = n(d / 95.047d);
            double n2 = n(d2 / 100.0d);
            double n3 = n(d3 / 108.883d);
            dArr[0] = Math.max(0.0d, (116.0d * n2) - 16.0d);
            dArr[1] = (n - n2) * 500.0d;
            dArr[2] = (n2 - n3) * 200.0d;
            return;
        }
        throw new IllegalArgumentException(C0201.m82(29417));
    }

    public static void g(double[] dArr, double[] dArr2, double d, double[] dArr3) {
        if (dArr3.length == 3) {
            double d2 = 1.0d - d;
            dArr3[0] = (dArr[0] * d2) + (dArr2[0] * d);
            dArr3[1] = (dArr[1] * d2) + (dArr2[1] * d);
            dArr3[2] = (dArr[2] * d2) + (dArr2[2] * d);
            return;
        }
        throw new IllegalArgumentException(C0201.m82(29418));
    }

    public static void h(int i, double[] dArr) {
        c(Color.red(i), Color.green(i), Color.blue(i), dArr);
    }

    private static int i(int i, int i2) {
        return 255 - (((255 - i2) * (255 - i)) / 255);
    }

    public static int j(int i, int i2) {
        int alpha = Color.alpha(i2);
        int alpha2 = Color.alpha(i);
        int i3 = i(alpha2, alpha);
        return Color.argb(i3, k(Color.red(i), alpha2, Color.red(i2), alpha, i3), k(Color.green(i), alpha2, Color.green(i2), alpha, i3), k(Color.blue(i), alpha2, Color.blue(i2), alpha, i3));
    }

    private static int k(int i, int i2, int i3, int i4, int i5) {
        if (i5 == 0) {
            return 0;
        }
        return (((i * 255) * i2) + ((i3 * i4) * (255 - i2))) / (i5 * 255);
    }

    private static int l(int i, int i2, int i3) {
        return i < i2 ? i2 : i > i3 ? i3 : i;
    }

    private static double[] m() {
        double[] dArr = a.get();
        if (dArr != null) {
            return dArr;
        }
        double[] dArr2 = new double[3];
        a.set(dArr2);
        return dArr2;
    }

    private static double n(double d) {
        return d > 0.008856d ? Math.pow(d, 0.3333333333333333d) : ((d * 903.3d) + 16.0d) / 116.0d;
    }

    public static int o(int i, int i2) {
        if (i2 >= 0 && i2 <= 255) {
            return (i & 16777215) | (i2 << 24);
        }
        throw new IllegalArgumentException(C0201.m82(29419));
    }
}
