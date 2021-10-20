package defpackage;

import java.io.IOException;

/* renamed from: kp1  reason: default package */
public final class kp1 {
    public static final int[] a = new int[0];
    public static final String[] b = new String[0];
    public static final byte[] c = new byte[0];

    public static final int a(yo1 yo1, int i) throws IOException {
        int a2 = yo1.a();
        yo1.f(i);
        int i2 = 1;
        while (yo1.l() == i) {
            yo1.f(i);
            i2++;
        }
        yo1.u(a2, i);
        return i2;
    }
}
