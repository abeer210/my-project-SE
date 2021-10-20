package defpackage;

import vigqyno.C0201;

/* renamed from: p62  reason: default package */
/* compiled from: PlanarYUVLuminanceSource */
public final class p62 extends m62 {
    private final byte[] c;
    private final int d;
    private final int e;
    private final int f;
    private final int g;

    public p62(byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, boolean z) {
        super(i5, i6);
        if (i3 + i5 > i || i4 + i6 > i2) {
            throw new IllegalArgumentException(C0201.m82(30493));
        }
        this.c = bArr;
        this.d = i;
        this.e = i2;
        this.f = i3;
        this.g = i4;
        if (z) {
            h(i5, i6);
        }
    }

    private void h(int i, int i2) {
        byte[] bArr = this.c;
        int i3 = (this.g * this.d) + this.f;
        int i4 = 0;
        while (i4 < i2) {
            int i5 = (i / 2) + i3;
            int i6 = (i3 + i) - 1;
            int i7 = i3;
            while (i7 < i5) {
                byte b = bArr[i7];
                bArr[i7] = bArr[i6];
                bArr[i6] = b;
                i7++;
                i6--;
            }
            i4++;
            i3 += this.d;
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
            throw new IllegalArgumentException(C0201.m82(30494).concat(String.valueOf(i)));
        }
        int d2 = d();
        if (bArr == null || bArr.length < d2) {
            bArr = new byte[d2];
        }
        System.arraycopy(this.c, ((i + this.g) * this.d) + this.f, bArr, 0, d2);
        return bArr;
    }
}
