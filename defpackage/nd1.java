package defpackage;

import java.io.IOException;

/* renamed from: nd1  reason: default package */
public final class nd1 {
    public static final byte[] a = new byte[0];

    public static final int a(bd1 bd1, int i) throws IOException {
        int a2 = bd1.a();
        bd1.f(i);
        int i2 = 1;
        while (bd1.i() == i) {
            bd1.f(i);
            i2++;
        }
        bd1.p(a2, i);
        return i2;
    }
}
