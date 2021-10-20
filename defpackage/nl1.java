package defpackage;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import vigqyno.C0201;

/* renamed from: nl1  reason: default package */
public final class nl1 {
    public static final Charset a = Charset.forName(C0201.m82(11619));
    public static final byte[] b;

    static {
        Charset.forName(C0201.m82(11620));
        byte[] bArr = new byte[0];
        b = bArr;
        ByteBuffer.wrap(bArr);
        kk1.F(b);
    }

    public static <T> T a(T t) {
        if (t != null) {
            return t;
        }
        throw null;
    }

    public static int b(byte[] bArr) {
        int length = bArr.length;
        int c = c(length, bArr, 0, length);
        if (c == 0) {
            return 1;
        }
        return c;
    }

    public static int c(int i, byte[] bArr, int i2, int i3) {
        for (int i4 = i2; i4 < i2 + i3; i4++) {
            i = (i * 31) + bArr[i4];
        }
        return i;
    }

    public static Object d(Object obj, Object obj2) {
        um1 c = ((tm1) obj).c();
        c.r((tm1) obj2);
        return c.p();
    }

    public static <T> T e(T t, String str) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(str);
    }

    public static boolean f(tm1 tm1) {
        return false;
    }

    public static boolean g(byte[] bArr) {
        return jo1.k(bArr);
    }

    public static int h(boolean z) {
        return z ? 1231 : 1237;
    }

    public static String i(byte[] bArr) {
        return new String(bArr, a);
    }

    public static int j(long j) {
        return (int) (j ^ (j >>> 32));
    }
}
