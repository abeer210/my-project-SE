package defpackage;

import vigqyno.C0201;

/* renamed from: v62  reason: default package */
/* compiled from: ResultPoint */
public class v62 {
    private final float a;
    private final float b;

    public v62(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    private static float a(v62 v62, v62 v622, v62 v623) {
        float f = v622.a;
        float f2 = v622.b;
        return ((v623.a - f) * (v62.b - f2)) - ((v623.b - f2) * (v62.a - f));
    }

    public static float b(v62 v62, v62 v622) {
        return n72.a(v62.a, v62.b, v622.a, v622.b);
    }

    public static void e(v62[] v62Arr) {
        v62 v62;
        v62 v622;
        v62 v623;
        float b2 = b(v62Arr[0], v62Arr[1]);
        float b3 = b(v62Arr[1], v62Arr[2]);
        float b4 = b(v62Arr[0], v62Arr[2]);
        if (b3 >= b2 && b3 >= b4) {
            v623 = v62Arr[0];
            v622 = v62Arr[1];
            v62 = v62Arr[2];
        } else if (b4 < b3 || b4 < b2) {
            v623 = v62Arr[2];
            v622 = v62Arr[0];
            v62 = v62Arr[1];
        } else {
            v623 = v62Arr[1];
            v622 = v62Arr[0];
            v62 = v62Arr[2];
        }
        if (a(v622, v623, v62) < 0.0f) {
            v62 = v622;
            v622 = v62;
        }
        v62Arr[0] = v622;
        v62Arr[1] = v623;
        v62Arr[2] = v62;
    }

    public final float c() {
        return this.a;
    }

    public final float d() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof v62) {
            v62 v62 = (v62) obj;
            if (this.a == v62.a && this.b == v62.b) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return (Float.floatToIntBits(this.a) * 31) + Float.floatToIntBits(this.b);
    }

    public final String toString() {
        return C0201.m82(27628) + this.a + ',' + this.b + ')';
    }
}
