package defpackage;

import java.text.DecimalFormat;
import vigqyno.C0201;

/* renamed from: ir  reason: default package */
/* compiled from: GeoLocation */
public final class ir {
    private final double a;
    private final double b;

    public ir(double d, double d2) {
        this.a = d;
        this.b = d2;
    }

    public static double[] a(double d) {
        int i = (int) d;
        double abs = Math.abs((d % 1.0d) * 60.0d);
        return new double[]{(double) i, (double) ((int) abs), (abs % 1.0d) * 60.0d};
    }

    public static String b(double d) {
        double[] a2 = a(d);
        DecimalFormat decimalFormat = new DecimalFormat(C0201.m82(22580));
        return String.format(C0201.m82(22581), decimalFormat.format(a2[0]), decimalFormat.format(a2[1]), decimalFormat.format(a2[2]));
    }

    public static Double c(mr mrVar, mr mrVar2, mr mrVar3, boolean z) {
        double abs = Math.abs(mrVar.doubleValue()) + (mrVar2.doubleValue() / 60.0d) + (mrVar3.doubleValue() / 3600.0d);
        if (Double.isNaN(abs)) {
            return null;
        }
        if (z) {
            abs *= -1.0d;
        }
        return Double.valueOf(abs);
    }

    public double d() {
        return this.a;
    }

    public double e() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ir.class != obj.getClass()) {
            return false;
        }
        ir irVar = (ir) obj;
        return Double.compare(irVar.a, this.a) == 0 && Double.compare(irVar.b, this.b) == 0;
    }

    public int hashCode() {
        double d = this.a;
        long j = 0;
        long doubleToLongBits = d != 0.0d ? Double.doubleToLongBits(d) : 0;
        int i = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
        double d2 = this.b;
        if (d2 != 0.0d) {
            j = Double.doubleToLongBits(d2);
        }
        return (i * 31) + ((int) (j ^ (j >>> 32)));
    }

    public String toString() {
        return this.a + C0201.m82(22582) + this.b;
    }
}
