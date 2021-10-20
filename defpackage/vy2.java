package defpackage;

import java.nio.charset.Charset;
import vigqyno.C0201;

/* renamed from: vy2  reason: default package */
/* compiled from: Util */
public final class vy2 {
    public static final Charset a = Charset.forName(C0201.m82(29315));

    public static boolean a(byte[] bArr, int i, byte[] bArr2, int i2, int i3) {
        for (int i4 = 0; i4 < i3; i4++) {
            if (bArr[i4 + i] != bArr2[i4 + i2]) {
                return false;
            }
        }
        return true;
    }

    public static void b(long j, long j2, long j3) {
        if ((j2 | j3) < 0 || j2 > j || j - j2 < j3) {
            throw new ArrayIndexOutOfBoundsException(String.format(C0201.m82(29316), Long.valueOf(j), Long.valueOf(j2), Long.valueOf(j3)));
        }
    }

    public static int c(int i) {
        return ((i & 255) << 24) | ((-16777216 & i) >>> 24) | ((16711680 & i) >>> 8) | ((65280 & i) << 8);
    }

    public static short d(short s) {
        int i = s & 65535;
        return (short) (((i & 255) << 8) | ((65280 & i) >>> 8));
    }

    public static void e(Throwable th) {
        f(th);
        throw null;
    }

    private static <T extends Throwable> void f(Throwable th) throws Throwable {
        throw th;
    }
}
