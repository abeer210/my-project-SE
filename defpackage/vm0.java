package defpackage;

/* renamed from: vm0  reason: default package */
/* compiled from: MathUtils */
public class vm0 {
    public static int a(float f) {
        double d = (double) f;
        Double.isNaN(d);
        return ((int) (d + 16384.999999999996d)) - 16384;
    }

    public static int b(float f) {
        double d = (double) f;
        Double.isNaN(d);
        return ((int) (d + 16384.0d)) - 16384;
    }

    public static float c(float f, float f2, float f3) {
        return f <= f2 ? f2 : f >= f3 ? f3 : f;
    }

    public static float d(float f, float f2) {
        return f > f2 ? f2 : f;
    }

    public static float e(float f, float f2) {
        return f < f2 ? f2 : f;
    }
}
