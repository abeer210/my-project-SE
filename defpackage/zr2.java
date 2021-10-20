package defpackage;

import vigqyno.C0201;

/* renamed from: zr2  reason: default package */
/* compiled from: PackedBitArray */
public final class zr2 {
    private int a;
    private byte[] b;

    public zr2(int i) {
        this.a = i;
        this.b = new byte[((i + 7) / 8)];
    }

    private int a(int i) {
        return i % 8;
    }

    private int b(int i) {
        return i / 8;
    }

    public static String i(byte[] bArr) {
        return j(bArr, 0, bArr.length);
    }

    public static String j(byte[] bArr, int i, int i2) {
        StringBuffer stringBuffer = new StringBuffer();
        int i3 = i2 + i;
        while (i < i3) {
            for (int i4 = 0; i4 < 8; i4++) {
                stringBuffer.append(((1 << i4) & bArr[i]) != 0 ? '1' : '0');
            }
            i++;
        }
        return stringBuffer.toString();
    }

    public void c() {
        d(0, e());
    }

    public void d(int i, int i2) {
        if (i2 != 0) {
            int i3 = i % 8;
            int b2 = b(i);
            int i4 = i + i2;
            int b3 = b(i4);
            int i5 = i4 % 8;
            if (b2 == b3) {
                byte[] bArr = this.b;
                bArr[b2] = (byte) ((((1 << i5) - (1 << i3)) ^ -1) & bArr[b2]);
                return;
            }
            byte[] bArr2 = this.b;
            bArr2[b2] = (byte) (((255 << i3) ^ -1) & bArr2[b2]);
            for (int i6 = b2 + 1; i6 < b3; i6++) {
                this.b[i6] = 0;
            }
            if (i5 > 0) {
                byte[] bArr3 = this.b;
                bArr3[b3] = (byte) (((255 >> (8 - i5)) ^ -1) & bArr3[b3]);
            }
        }
    }

    public int e() {
        return this.a;
    }

    public int f() {
        return this.b.length;
    }

    public byte[] g() {
        return this.b;
    }

    public void h(int i, int i2) {
        if (i2 != 0) {
            int a2 = a(i);
            int b2 = b(i);
            int i3 = i + i2;
            if (i3 <= e()) {
                int b3 = b(i3);
                int a3 = a(i3);
                if (b2 == b3) {
                    byte[] bArr = this.b;
                    bArr[b2] = (byte) (((1 << a3) - (1 << a2)) | bArr[b2]);
                    return;
                }
                byte[] bArr2 = this.b;
                bArr2[b2] = (byte) ((255 << a2) | bArr2[b2]);
                for (int i4 = b2 + 1; i4 < b3; i4++) {
                    this.b[i4] = -1;
                }
                if (a3 > 0) {
                    byte[] bArr3 = this.b;
                    bArr3[b3] = (byte) ((255 >> (8 - a3)) | bArr3[b3]);
                    return;
                }
                return;
            }
            throw new IndexOutOfBoundsException(C0201.m82(23987));
        }
    }

    public String toString() {
        return i(this.b).substring(0, this.a);
    }
}
