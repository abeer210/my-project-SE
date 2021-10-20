package defpackage;

/* renamed from: ko1  reason: default package */
public final class ko1 {
    /* access modifiers changed from: private */
    public static void a(byte b, byte b2, byte b3, byte b4, char[] cArr, int i) throws sl1 {
        if (l(b2) || (((b << 28) + (b2 + 112)) >> 30) != 0 || l(b3) || l(b4)) {
            throw sl1.i();
        }
        int i2 = ((b & 7) << 18) | ((b2 & 63) << 12) | ((b3 & 63) << 6) | (b4 & 63);
        cArr[i] = (char) ((i2 >>> 10) + 55232);
        cArr[i + 1] = (char) ((i2 & 1023) + 56320);
    }

    /* access modifiers changed from: private */
    public static void b(byte b, byte b2, byte b3, char[] cArr, int i) throws sl1 {
        if (l(b2) || ((b == -32 && b2 < -96) || ((b == -19 && b2 >= -96) || l(b3)))) {
            throw sl1.i();
        }
        cArr[i] = (char) (((b & 15) << 12) | ((b2 & 63) << 6) | (b3 & 63));
    }

    /* access modifiers changed from: private */
    public static void c(byte b, byte b2, char[] cArr, int i) throws sl1 {
        if (b < -62 || l(b2)) {
            throw sl1.i();
        }
        cArr[i] = (char) (((b & 31) << 6) | (b2 & 63));
    }

    /* access modifiers changed from: private */
    public static void d(byte b, char[] cArr, int i) {
        cArr[i] = (char) b;
    }

    /* access modifiers changed from: private */
    public static boolean i(byte b) {
        return b >= 0;
    }

    /* access modifiers changed from: private */
    public static boolean j(byte b) {
        return b < -32;
    }

    /* access modifiers changed from: private */
    public static boolean k(byte b) {
        return b < -16;
    }

    private static boolean l(byte b) {
        return b > -65;
    }
}
