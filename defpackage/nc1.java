package defpackage;

import java.nio.ByteBuffer;
import vigqyno.C0201;

/* renamed from: nc1  reason: default package */
public final class nc1 {
    private static final oc1 a;

    static {
        oc1 oc1;
        if (!(kc1.L() && kc1.M()) || v71.b()) {
            oc1 = new sc1();
        } else {
            oc1 = new uc1();
        }
        a = oc1;
    }

    public static int a(CharSequence charSequence) {
        int length = charSequence.length();
        int i = 0;
        int i2 = 0;
        while (i2 < length && charSequence.charAt(i2) < 128) {
            i2++;
        }
        int i3 = length;
        while (true) {
            if (i2 >= length) {
                break;
            }
            char charAt = charSequence.charAt(i2);
            if (charAt < 2048) {
                i3 += (127 - charAt) >>> 31;
                i2++;
            } else {
                int length2 = charSequence.length();
                while (i2 < length2) {
                    char charAt2 = charSequence.charAt(i2);
                    if (charAt2 < 2048) {
                        i += (127 - charAt2) >>> 31;
                    } else {
                        i += 2;
                        if (55296 <= charAt2 && charAt2 <= 57343) {
                            if (Character.codePointAt(charSequence, i2) >= 65536) {
                                i2++;
                            } else {
                                throw new rc1(i2, length2);
                            }
                        }
                    }
                    i2++;
                }
                i3 += i;
            }
        }
        if (i3 >= length) {
            return i3;
        }
        StringBuilder sb = new StringBuilder(54);
        sb.append(C0201.m82(30416));
        sb.append(((long) i3) + 4294967296L);
        throw new IllegalArgumentException(sb.toString());
    }

    public static int b(CharSequence charSequence, byte[] bArr, int i, int i2) {
        return a.b(charSequence, bArr, i, i2);
    }

    public static void c(CharSequence charSequence, ByteBuffer byteBuffer) {
        oc1 oc1 = a;
        if (byteBuffer.hasArray()) {
            int arrayOffset = byteBuffer.arrayOffset();
            byteBuffer.position(b(charSequence, byteBuffer.array(), byteBuffer.position() + arrayOffset, byteBuffer.remaining()) - arrayOffset);
        } else if (byteBuffer.isDirect()) {
            oc1.c(charSequence, byteBuffer);
        } else {
            oc1.d(charSequence, byteBuffer);
        }
    }

    /* access modifiers changed from: private */
    public static int d(int i, int i2, int i3) {
        if (i > -12 || i2 > -65 || i3 > -65) {
            return -1;
        }
        return (i ^ (i2 << 8)) ^ (i3 << 16);
    }

    /* access modifiers changed from: private */
    public static int e(int i) {
        if (i > -12) {
            return -1;
        }
        return i;
    }

    public static boolean h(byte[] bArr, int i, int i2) {
        return a.e(bArr, i, i2);
    }

    /* access modifiers changed from: private */
    public static int i(byte[] bArr, int i, int i2) {
        byte b = bArr[i - 1];
        int i3 = i2 - i;
        if (i3 == 0) {
            return e(b);
        }
        if (i3 == 1) {
            return m(b, bArr[i]);
        }
        if (i3 == 2) {
            return d(b, bArr[i], bArr[i + 1]);
        }
        throw new AssertionError();
    }

    public static String j(byte[] bArr, int i, int i2) throws v91 {
        return a.f(bArr, i, i2);
    }

    public static boolean k(byte[] bArr) {
        return a.e(bArr, 0, bArr.length);
    }

    /* access modifiers changed from: private */
    public static int m(int i, int i2) {
        if (i > -12 || i2 > -65) {
            return -1;
        }
        return i ^ (i2 << 8);
    }
}
