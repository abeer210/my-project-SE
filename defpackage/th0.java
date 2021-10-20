package defpackage;

import android.graphics.Matrix;
import vigqyno.C0201;

/* renamed from: th0  reason: default package */
/* compiled from: JpegTranscoderUtils */
public class th0 {
    public static final v50<Integer> a = v50.a(2, 7, 4, 5);

    public static int a(int i) {
        return Math.max(1, 8 / i);
    }

    public static float b(rd0 rd0, int i, int i2) {
        if (rd0 == null) {
            return 1.0f;
        }
        float f = (float) i;
        float f2 = (float) i2;
        float max = Math.max(((float) rd0.a) / f, ((float) rd0.b) / f2);
        float f3 = rd0.c;
        if (f * max > f3) {
            max = f3 / f;
        }
        float f4 = rd0.c;
        return f2 * max > f4 ? f4 / f2 : max;
    }

    private static int c(af0 af0) {
        int x = af0.x();
        if (x == 90 || x == 180 || x == 270) {
            return af0.x();
        }
        return 0;
    }

    public static int d(sd0 sd0, af0 af0) {
        int indexOf = a.indexOf(Integer.valueOf(af0.p()));
        if (indexOf >= 0) {
            int i = 0;
            if (!sd0.g()) {
                i = sd0.e();
            }
            v50<Integer> v50 = a;
            return v50.get((indexOf + (i / 90)) % v50.size()).intValue();
        }
        throw new IllegalArgumentException(C0201.m82(3482));
    }

    public static int e(sd0 sd0, af0 af0) {
        if (!sd0.f()) {
            return 0;
        }
        int c = c(af0);
        if (sd0.g()) {
            return c;
        }
        return (c + sd0.e()) % 360;
    }

    public static int f(sd0 sd0, rd0 rd0, af0 af0, boolean z) {
        if (!z || rd0 == null) {
            return 8;
        }
        int e = e(sd0, af0);
        boolean z2 = false;
        int d = a.contains(Integer.valueOf(af0.p())) ? d(sd0, af0) : 0;
        if (e == 90 || e == 270 || d == 5 || d == 7) {
            z2 = true;
        }
        int k = k(b(rd0, z2 ? af0.s() : af0.A(), z2 ? af0.A() : af0.s()), rd0.d);
        if (k > 8) {
            return 8;
        }
        if (k < 1) {
            return 1;
        }
        return k;
    }

    public static Matrix g(af0 af0, sd0 sd0) {
        if (a.contains(Integer.valueOf(af0.p()))) {
            return h(d(sd0, af0));
        }
        int e = e(sd0, af0);
        if (e == 0) {
            return null;
        }
        Matrix matrix = new Matrix();
        matrix.setRotate((float) e);
        return matrix;
    }

    private static Matrix h(int i) {
        Matrix matrix = new Matrix();
        if (i == 2) {
            matrix.setScale(-1.0f, 1.0f);
        } else if (i == 7) {
            matrix.setRotate(-90.0f);
            matrix.postScale(-1.0f, 1.0f);
        } else if (i == 4) {
            matrix.setRotate(180.0f);
            matrix.postScale(-1.0f, 1.0f);
        } else if (i != 5) {
            return null;
        } else {
            matrix.setRotate(90.0f);
            matrix.postScale(-1.0f, 1.0f);
        }
        return matrix;
    }

    public static boolean i(int i) {
        switch (i) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
                return true;
            default:
                return false;
        }
    }

    public static boolean j(int i) {
        return i >= 0 && i <= 270 && i % 90 == 0;
    }

    public static int k(float f, float f2) {
        return (int) (f2 + (f * 8.0f));
    }
}
