package defpackage;

/* renamed from: ou0  reason: default package */
public abstract class ou0 {
    private ou0() {
    }

    public static long a(long j) {
        return (-(j & 1)) ^ (j >>> 1);
    }

    public static ou0 b(byte[] bArr, int i, int i2, boolean z) {
        qu0 qu0 = new qu0(bArr, 0, i2, false);
        try {
            qu0.e(i2);
            return qu0;
        } catch (qv0 e) {
            throw new IllegalArgumentException(e);
        }
    }

    public static int c(int i) {
        return (-(i & 1)) ^ (i >>> 1);
    }
}
