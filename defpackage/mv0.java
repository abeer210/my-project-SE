package defpackage;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import vigqyno.C0201;

/* renamed from: mv0  reason: default package */
public final class mv0 {
    public static final Charset a = Charset.forName(C0201.m82(2355));
    public static final byte[] b;

    static {
        Charset.forName(C0201.m82(2356));
        byte[] bArr = new byte[0];
        b = bArr;
        ByteBuffer.wrap(bArr);
        byte[] bArr2 = b;
        ou0.b(bArr2, 0, bArr2.length, false);
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
        rw0 c = ((qw0) obj).c();
        c.t0((qw0) obj2);
        return c.s0();
    }

    public static <T> T e(T t, String str) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(str);
    }

    public static int f(boolean z) {
        return z ? 1231 : 1237;
    }

    public static boolean g(byte[] bArr) {
        return jy0.h(bArr);
    }

    public static String h(byte[] bArr) {
        return new String(bArr, a);
    }

    public static boolean i(qw0 qw0) {
        return false;
    }

    public static int j(long j) {
        return (int) (j ^ (j >>> 32));
    }
}
