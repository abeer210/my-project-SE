package defpackage;

import defpackage.ab2;

/* renamed from: sa2  reason: default package */
/* compiled from: DataBlock */
public final class sa2 {
    private final int a;
    private final byte[] b;

    private sa2(int i, byte[] bArr) {
        this.a = i;
        this.b = bArr;
    }

    public static sa2[] b(byte[] bArr, ab2 ab2, wa2 wa2) {
        if (bArr.length == ab2.h()) {
            ab2.b f = ab2.f(wa2);
            ab2.a[] a2 = f.a();
            int i = 0;
            for (ab2.a aVar : a2) {
                i += aVar.a();
            }
            sa2[] sa2Arr = new sa2[i];
            int i2 = 0;
            for (ab2.a aVar2 : a2) {
                int i3 = 0;
                while (i3 < aVar2.a()) {
                    int b2 = aVar2.b();
                    sa2Arr[i2] = new sa2(b2, new byte[(f.b() + b2)]);
                    i3++;
                    i2++;
                }
            }
            int length = sa2Arr[0].b.length;
            int i4 = i - 1;
            while (i4 >= 0 && sa2Arr[i4].b.length != length) {
                i4--;
            }
            int i5 = i4 + 1;
            int b3 = length - f.b();
            int i6 = 0;
            for (int i7 = 0; i7 < b3; i7++) {
                int i8 = 0;
                while (i8 < i2) {
                    sa2Arr[i8].b[i7] = bArr[i6];
                    i8++;
                    i6++;
                }
            }
            int i9 = i5;
            while (i9 < i2) {
                sa2Arr[i9].b[b3] = bArr[i6];
                i9++;
                i6++;
            }
            int length2 = sa2Arr[0].b.length;
            while (b3 < length2) {
                int i10 = 0;
                while (i10 < i2) {
                    sa2Arr[i10].b[i10 < i5 ? b3 : b3 + 1] = bArr[i6];
                    i10++;
                    i6++;
                }
                b3++;
            }
            return sa2Arr;
        }
        throw new IllegalArgumentException();
    }

    public byte[] a() {
        return this.b;
    }

    public int c() {
        return this.a;
    }
}
