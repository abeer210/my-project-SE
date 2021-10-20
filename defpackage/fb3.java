package defpackage;

import vigqyno.C0201;

/* renamed from: fb3  reason: default package */
/* compiled from: PolynomialRingGF2 */
public final class fb3 {
    public static int a(int i) {
        int i2 = -1;
        while (i != 0) {
            i2++;
            i >>>= 1;
        }
        return i2;
    }

    public static int b(int i, int i2) {
        while (true) {
            i = i2;
            if (i == 0) {
                return i;
            }
            i2 = e(i, i);
        }
    }

    public static boolean c(int i) {
        if (i == 0) {
            return false;
        }
        int a = a(i) >>> 1;
        int i2 = 2;
        for (int i3 = 0; i3 < a; i3++) {
            i2 = d(i2, i2, i);
            if (b(i2 ^ 2, i) != 1) {
                return false;
            }
        }
        return true;
    }

    public static int d(int i, int i2, int i3) {
        int e = e(i, i3);
        int e2 = e(i2, i3);
        int i4 = 0;
        if (e2 != 0) {
            int a = 1 << a(i3);
            while (e != 0) {
                if (((byte) (e & 1)) == 1) {
                    i4 ^= e2;
                }
                e >>>= 1;
                e2 <<= 1;
                if (e2 >= a) {
                    e2 ^= i3;
                }
            }
        }
        return i4;
    }

    public static int e(int i, int i2) {
        if (i2 == 0) {
            System.err.println(C0201.m82(6237));
            return 0;
        }
        while (a(i) >= a(i2)) {
            i ^= i2 << (a(i) - a(i2));
        }
        return i;
    }
}
