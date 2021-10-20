package defpackage;

import vigqyno.C0201;

/* renamed from: ph0  reason: default package */
/* compiled from: DownsampleUtil */
public class ph0 {
    public static float a(sd0 sd0, rd0 rd0, af0 af0) {
        z50.b(af0.D(af0));
        if (rd0 == null || rd0.b <= 0 || rd0.a <= 0 || af0.A() == 0 || af0.s() == 0) {
            return 1.0f;
        }
        int c = c(sd0, af0);
        boolean z = c == 90 || c == 270;
        int s = z ? af0.s() : af0.A();
        int A = z ? af0.A() : af0.s();
        float f = ((float) rd0.a) / ((float) s);
        float f2 = ((float) rd0.b) / ((float) A);
        float max = Math.max(f, f2);
        f60.v(C0201.m82(32581), C0201.m82(32582), Integer.valueOf(rd0.a), Integer.valueOf(rd0.b), Integer.valueOf(s), Integer.valueOf(A), Float.valueOf(f), Float.valueOf(f2), Float.valueOf(max));
        return max;
    }

    public static int b(sd0 sd0, rd0 rd0, af0 af0, int i) {
        int i2;
        if (!af0.D(af0)) {
            return 1;
        }
        float a = a(sd0, rd0, af0);
        if (af0.u() == nb0.a) {
            i2 = e(a);
        } else {
            i2 = d(a);
        }
        int max = Math.max(af0.s(), af0.A());
        float f = rd0 != null ? rd0.c : (float) i;
        while (((float) (max / i2)) > f) {
            i2 = af0.u() == nb0.a ? i2 * 2 : i2 + 1;
        }
        return i2;
    }

    private static int c(sd0 sd0, af0 af0) {
        boolean z = false;
        if (!sd0.g()) {
            return 0;
        }
        int x = af0.x();
        if (x == 0 || x == 90 || x == 180 || x == 270) {
            z = true;
        }
        z50.b(z);
        return x;
    }

    public static int d(float f) {
        if (f > 0.6666667f) {
            return 1;
        }
        int i = 2;
        while (true) {
            double d = (double) i;
            double pow = Math.pow(d, 2.0d);
            Double.isNaN(d);
            Double.isNaN(d);
            if ((1.0d / d) + ((1.0d / (pow - d)) * 0.3333333432674408d) <= ((double) f)) {
                return i - 1;
            }
            i++;
        }
    }

    public static int e(float f) {
        if (f > 0.6666667f) {
            return 1;
        }
        int i = 2;
        while (true) {
            int i2 = i * 2;
            double d = (double) i2;
            Double.isNaN(d);
            double d2 = 1.0d / d;
            if (d2 + (0.3333333432674408d * d2) <= ((double) f)) {
                return i;
            }
            i = i2;
        }
    }
}
