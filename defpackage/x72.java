package defpackage;

/* renamed from: x72  reason: default package */
/* compiled from: Decoder */
public final class x72 {
    private final r72 a = new r72(p72.m);

    private void a(byte[] bArr, int i) throws i62 {
        int length = bArr.length;
        int[] iArr = new int[length];
        for (int i2 = 0; i2 < length; i2++) {
            iArr[i2] = bArr[i2] & 255;
        }
        try {
            this.a.a(iArr, bArr.length - i);
            for (int i3 = 0; i3 < i; i3++) {
                bArr[i3] = (byte) iArr[i3];
            }
        } catch (s72 unused) {
            throw i62.a();
        }
    }

    public f72 b(c72 c72) throws k62, i62 {
        u72 u72 = new u72(c72);
        v72[] b = v72.b(u72.c(), u72.b());
        int i = 0;
        for (v72 v72 : b) {
            i += v72.c();
        }
        byte[] bArr = new byte[i];
        int length = b.length;
        for (int i2 = 0; i2 < length; i2++) {
            v72 v722 = b[i2];
            byte[] a2 = v722.a();
            int c = v722.c();
            a(a2, c);
            for (int i3 = 0; i3 < c; i3++) {
                bArr[(i3 * length) + i2] = a2[i3];
            }
        }
        return w72.a(bArr);
    }
}
