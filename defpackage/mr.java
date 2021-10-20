package defpackage;

import java.io.Serializable;
import vigqyno.C0201;

/* renamed from: mr  reason: default package */
/* compiled from: Rational */
public class mr extends Number implements Comparable<mr>, Serializable {
    private final long a;
    private final long b;

    public mr(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    private static long b(long j, long j2) {
        if (j < 0) {
            j = -j;
        }
        if (j2 < 0) {
            j2 = -j2;
        }
        while (j != 0 && j2 != 0) {
            if (j > j2) {
                j %= j2;
            } else {
                j2 %= j;
            }
        }
        return j == 0 ? j2 : j;
    }

    public final byte byteValue() {
        return (byte) ((int) doubleValue());
    }

    /* renamed from: d */
    public int compareTo(mr mrVar) {
        return Double.compare(doubleValue(), mrVar.doubleValue());
    }

    public double doubleValue() {
        long j = this.a;
        if (j == 0) {
            return 0.0d;
        }
        double d = (double) j;
        double d2 = (double) this.b;
        Double.isNaN(d);
        Double.isNaN(d2);
        return d / d2;
    }

    public boolean e(mr mrVar) {
        return mrVar.doubleValue() == doubleValue();
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof mr) || doubleValue() != ((mr) obj).doubleValue()) {
            return false;
        }
        return true;
    }

    public final long f() {
        return this.b;
    }

    public float floatValue() {
        long j = this.a;
        if (j == 0) {
            return 0.0f;
        }
        return ((float) j) / ((float) this.b);
    }

    public final long g() {
        return this.a;
    }

    public mr h() {
        return new mr(this.b, this.a);
    }

    public int hashCode() {
        return (((int) this.b) * 23) + ((int) this.a);
    }

    public mr i() {
        long b2 = b(this.a, this.b);
        return new mr(this.a / b2, this.b / b2);
    }

    public final int intValue() {
        return (int) doubleValue();
    }

    public boolean j() {
        long j = this.b;
        return j == 1 || (j != 0 && this.a % j == 0) || (this.b == 0 && this.a == 0);
    }

    public boolean k() {
        return this.a == 0 || this.b == 0;
    }

    public String l(boolean z) {
        if (this.b == 0 && this.a != 0) {
            return toString();
        }
        if (j()) {
            return Integer.toString(intValue());
        }
        long j = this.a;
        if (j != 1) {
            long j2 = this.b;
            if (j2 % j == 0) {
                return new mr(1, j2 / j).l(z);
            }
        }
        mr i = i();
        if (z) {
            String d = Double.toString(i.doubleValue());
            if (d.length() < 5) {
                return d;
            }
        }
        return i.toString();
    }

    public final long longValue() {
        return (long) doubleValue();
    }

    public final short shortValue() {
        return (short) ((int) doubleValue());
    }

    public String toString() {
        return this.a + C0201.m82(31765) + this.b;
    }
}
