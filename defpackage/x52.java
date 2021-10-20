package defpackage;

/* renamed from: x52  reason: default package */
/* compiled from: Bounds */
public class x52 {
    public final double a;
    public final double b;
    public final double c;
    public final double d;
    public final double e;
    public final double f;

    public x52(double d2, double d3, double d4, double d5) {
        this.a = d2;
        this.b = d4;
        this.c = d3;
        this.d = d5;
        this.e = (d2 + d3) / 2.0d;
        this.f = (d4 + d5) / 2.0d;
    }

    public boolean a(double d2, double d3) {
        return this.a <= d2 && d2 <= this.c && this.b <= d3 && d3 <= this.d;
    }

    public boolean b(x52 x52) {
        return x52.a >= this.a && x52.c <= this.c && x52.b >= this.b && x52.d <= this.d;
    }

    public boolean c(y52 y52) {
        return a(y52.a, y52.b);
    }

    public boolean d(double d2, double d3, double d4, double d5) {
        return d2 < this.c && this.a < d3 && d4 < this.d && this.b < d5;
    }

    public boolean e(x52 x52) {
        return d(x52.a, x52.c, x52.b, x52.d);
    }
}
