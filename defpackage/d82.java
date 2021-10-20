package defpackage;

import java.util.Map;

/* renamed from: d82  reason: default package */
/* compiled from: Decoder */
public final class d82 {
    private final r72 a = new r72(p72.o);

    private void a(byte[] bArr, int i, int i2, int i3, int i4) throws i62 {
        int i5 = i2 + i3;
        int i6 = i4 == 0 ? 1 : 2;
        int[] iArr = new int[(i5 / i6)];
        for (int i7 = 0; i7 < i5; i7++) {
            if (i4 == 0 || i7 % 2 == i4 - 1) {
                iArr[i7 / i6] = bArr[i7 + i] & 255;
            }
        }
        try {
            this.a.a(iArr, i3 / i6);
            for (int i8 = 0; i8 < i2; i8++) {
                if (i4 == 0 || i8 % 2 == i4 - 1) {
                    bArr[i8 + i] = (byte) iArr[i8 / i6];
                }
            }
        } catch (s72 unused) {
            throw i62.a();
        }
    }

    public f72 b(c72 c72, Map<j62, ?> map) throws k62, i62 {
        byte[] bArr;
        byte[] a2 = new b82(c72).a();
        a(a2, 0, 10, 10, 0);
        int i = a2[0] & 15;
        if (i == 2 || i == 3 || i == 4) {
            a(a2, 20, 84, 40, 1);
            a(a2, 20, 84, 40, 2);
            bArr = new byte[94];
        } else if (i == 5) {
            a(a2, 20, 68, 56, 1);
            a(a2, 20, 68, 56, 2);
            bArr = new byte[78];
        } else {
            throw k62.a();
        }
        System.arraycopy(a2, 0, bArr, 0, 10);
        System.arraycopy(a2, 20, bArr, 10, bArr.length - 10);
        return c82.a(bArr, i);
    }
}
