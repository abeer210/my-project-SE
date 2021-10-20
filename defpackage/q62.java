package defpackage;

import vigqyno.C0201;

/* renamed from: q62  reason: default package */
/* compiled from: RGBLuminanceSource */
public final class q62 extends m62 {
    private final byte[] c;
    private final int d;
    private final int e;
    private final int f = 0;
    private final int g = 0;

    public q62(int i, int i2, int[] iArr) {
        super(i, i2);
        this.d = i;
        this.e = i2;
        int i3 = i * i2;
        this.c = new byte[i3];
        for (int i4 = 0; i4 < i3; i4++) {
            int i5 = iArr[i4];
            this.c[i4] = (byte) (((((i5 >> 16) & 255) + ((i5 >> 7) & 510)) + (i5 & 255)) / 4);
        }
    }

    @Override // defpackage.m62
    public byte[] b() {
        int d2 = d();
        int a = a();
        if (d2 == this.d && a == this.e) {
            return this.c;
        }
        int i = d2 * a;
        byte[] bArr = new byte[i];
        int i2 = this.g;
        int i3 = this.d;
        int i4 = (i2 * i3) + this.f;
        if (d2 == i3) {
            System.arraycopy(this.c, i4, bArr, 0, i);
            return bArr;
        }
        for (int i5 = 0; i5 < a; i5++) {
            System.arraycopy(this.c, i4, bArr, i5 * d2, d2);
            i4 += this.d;
        }
        return bArr;
    }

    @Override // defpackage.m62
    public byte[] c(int i, byte[] bArr) {
        if (i < 0 || i >= a()) {
            throw new IllegalArgumentException(C0201.m82(28602).concat(String.valueOf(i)));
        }
        int d2 = d();
        if (bArr == null || bArr.length < d2) {
            bArr = new byte[d2];
        }
        System.arraycopy(this.c, ((i + this.g) * this.d) + this.f, bArr, 0, d2);
        return bArr;
    }
}
