package defpackage;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import vigqyno.C0201;

/* renamed from: m91  reason: default package */
public final class m91 {
    public static final Charset a = Charset.forName(C0201.m82(24324));
    public static final byte[] b;

    static {
        Charset.forName(C0201.m82(24325));
        byte[] bArr = new byte[0];
        b = bArr;
        ByteBuffer.wrap(bArr);
        byte[] bArr2 = b;
        o81.d(bArr2, 0, bArr2.length, false);
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
        va1 f = ((wa1) obj).f();
        f.q0((wa1) obj2);
        return f.u0();
    }

    public static <T> T e(T t, String str) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(str);
    }

    public static int f(long j) {
        return (int) (j ^ (j >>> 32));
    }

    public static boolean g(wa1 wa1) {
        return false;
    }

    public static boolean h(byte[] bArr) {
        return nc1.k(bArr);
    }

    public static String i(byte[] bArr) {
        return new String(bArr, a);
    }

    public static int j(boolean z) {
        return z ? 1231 : 1237;
    }
}
