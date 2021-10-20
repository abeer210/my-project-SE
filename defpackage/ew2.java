package defpackage;

import vigqyno.C0201;

/* renamed from: ew2  reason: default package */
/* compiled from: progressionUtil.kt */
public final class ew2 {
    private static final int a(int i, int i2, int i3) {
        return c(c(i, i3) - c(i2, i3), i3);
    }

    public static final int b(int i, int i2, int i3) {
        if (i3 > 0) {
            if (i >= i2) {
                return i2;
            }
            return i2 - a(i2, i, i3);
        } else if (i3 < 0) {
            return i <= i2 ? i2 : i2 + a(i, i2, -i3);
        } else {
            throw new IllegalArgumentException(C0201.m82(28110));
        }
    }

    private static final int c(int i, int i2) {
        int i3 = i % i2;
        return i3 >= 0 ? i3 : i3 + i2;
    }
}
