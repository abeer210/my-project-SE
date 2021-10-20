package defpackage;

/* renamed from: i42  reason: default package */
/* compiled from: MathUtil */
public class i42 {
    public static double a(double d) {
        return Math.asin(Math.sqrt(d)) * 2.0d;
    }

    public static double b(double d) {
        double sin = Math.sin(d * 0.5d);
        return sin * sin;
    }

    public static double c(double d, double d2, double d3) {
        return b(d - d2) + (b(d3) * Math.cos(d) * Math.cos(d2));
    }
}
