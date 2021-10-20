package defpackage;

import java.math.BigInteger;

/* renamed from: ab3  reason: default package */
/* compiled from: IntegerFunctions */
public final class ab3 {
    static {
        BigInteger.valueOf(0);
        BigInteger.valueOf(1);
        BigInteger.valueOf(2);
        BigInteger.valueOf(4);
    }

    public static int a(int i) {
        if (i == 0) {
            return 1;
        }
        if (i < 0) {
            i = -i;
        }
        int i2 = 0;
        while (i > 0) {
            i2++;
            i >>>= 8;
        }
        return i2;
    }
}
