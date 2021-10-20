package defpackage;

import defpackage.y72;

/* renamed from: v72  reason: default package */
/* compiled from: DataBlock */
public final class v72 {
    private final int a;
    private final byte[] b;

    private v72(int i, byte[] bArr) {
        this.a = i;
        this.b = bArr;
    }

    public static v72[] b(byte[] bArr, y72 y72) {
        y72.c d = y72.d();
        y72.b[] a2 = d.a();
        int i = 0;
        for (y72.b bVar : a2) {
            i += bVar.a();
        }
        v72[] v72Arr = new v72[i];
        int i2 = 0;
        for (y72.b bVar2 : a2) {
            int i3 = 0;
            while (i3 < bVar2.a()) {
                int b2 = bVar2.b();
                v72Arr[i2] = new v72(b2, new byte[(d.b() + b2)]);
                i3++;
                i2++;
            }
        }
        int length = v72Arr[0].b.length - d.b();
        int i4 = length - 1;
        int i5 = 0;
        for (int i6 = 0; i6 < i4; i6++) {
            int i7 = 0;
            while (i7 < i2) {
                v72Arr[i7].b[i6] = bArr[i5];
                i7++;
                i5++;
            }
        }
        boolean z = y72.i() == 24;
        int i8 = z ? 8 : i2;
        int i9 = 0;
        while (i9 < i8) {
            v72Arr[i9].b[i4] = bArr[i5];
            i9++;
            i5++;
        }
        int length2 = v72Arr[0].b.length;
        while (length < length2) {
            int i10 = 0;
            while (i10 < i2) {
                int i11 = z ? (i10 + 8) % i2 : i10;
                v72Arr[i11].b[(!z || i11 <= 7) ? length : length - 1] = bArr[i5];
                i10++;
                i5++;
            }
            length++;
        }
        if (i5 == bArr.length) {
            return v72Arr;
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
