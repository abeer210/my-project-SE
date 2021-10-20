package defpackage;

/* renamed from: jb3  reason: default package */
/* compiled from: Pack */
public abstract class jb3 {
    public static int a(byte[] bArr, int i) {
        int i2 = i + 1;
        int i3 = i2 + 1;
        return (bArr[i3 + 1] & 255) | (bArr[i] << 24) | ((bArr[i2] & 255) << 16) | ((bArr[i3] & 255) << 8);
    }

    public static long b(byte[] bArr, int i) {
        int a = a(bArr, i);
        return (((long) a(bArr, i + 4)) & 4294967295L) | ((((long) a) & 4294967295L) << 32);
    }

    public static void c(int i, byte[] bArr, int i2) {
        bArr[i2] = (byte) (i >>> 24);
        int i3 = i2 + 1;
        bArr[i3] = (byte) (i >>> 16);
        int i4 = i3 + 1;
        bArr[i4] = (byte) (i >>> 8);
        bArr[i4 + 1] = (byte) i;
    }

    public static void d(int i, byte[] bArr, int i2) {
        bArr[i2] = (byte) i;
        int i3 = i2 + 1;
        bArr[i3] = (byte) (i >>> 8);
        int i4 = i3 + 1;
        bArr[i4] = (byte) (i >>> 16);
        bArr[i4 + 1] = (byte) (i >>> 24);
    }

    public static int e(byte[] bArr, int i) {
        int i2 = i + 1;
        int i3 = i2 + 1;
        return (bArr[i3 + 1] << 24) | (bArr[i] & 255) | ((bArr[i2] & 255) << 8) | ((bArr[i3] & 255) << 16);
    }

    public static long f(byte[] bArr, int i) {
        return ((((long) e(bArr, i + 4)) & 4294967295L) << 32) | (4294967295L & ((long) e(bArr, i)));
    }

    public static short g(byte[] bArr, int i) {
        return (short) (((bArr[i + 1] & 255) << 8) | (bArr[i] & 255));
    }

    public static void h(long j, byte[] bArr, int i) {
        c((int) (j >>> 32), bArr, i);
        c((int) (j & 4294967295L), bArr, i + 4);
    }

    public static void i(long j, byte[] bArr, int i) {
        d((int) (4294967295L & j), bArr, i);
        d((int) (j >>> 32), bArr, i + 4);
    }

    public static void j(long[] jArr, int i, int i2, byte[] bArr, int i3) {
        for (int i4 = 0; i4 < i2; i4++) {
            i(jArr[i + i4], bArr, i3);
            i3 += 8;
        }
    }

    public static void k(short s, byte[] bArr, int i) {
        bArr[i] = (byte) s;
        bArr[i + 1] = (byte) (s >>> 8);
    }
}
