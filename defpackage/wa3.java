package defpackage;

import java.lang.reflect.Array;
import vigqyno.C0201;

/* renamed from: wa3  reason: default package */
/* compiled from: GF2Matrix */
public class wa3 extends cb3 {
    private int[][] c;
    private int d;

    public wa3(byte[] bArr) {
        int length = bArr.length;
        String r1 = C0201.m82(194);
        if (length >= 9) {
            this.a = bb3.e(bArr, 0);
            int e = bb3.e(bArr, 4);
            this.b = e;
            int i = this.a;
            int i2 = ((e + 7) >>> 3) * i;
            if (i > 0) {
                int i3 = 8;
                if (i2 == bArr.length - 8) {
                    int i4 = (e + 31) >>> 5;
                    this.d = i4;
                    int[] iArr = new int[2];
                    iArr[1] = i4;
                    iArr[0] = i;
                    this.c = (int[][]) Array.newInstance(int.class, iArr);
                    int i5 = this.b;
                    int i6 = i5 >> 5;
                    int i7 = i5 & 31;
                    for (int i8 = 0; i8 < this.a; i8++) {
                        int i9 = 0;
                        while (i9 < i6) {
                            this.c[i8][i9] = bb3.e(bArr, i3);
                            i9++;
                            i3 += 4;
                        }
                        int i10 = 0;
                        while (i10 < i7) {
                            int[] iArr2 = this.c[i8];
                            iArr2[i6] = ((bArr[i3] & 255) << i10) ^ iArr2[i6];
                            i10 += 8;
                            i3++;
                        }
                    }
                    return;
                }
            }
            throw new ArithmeticException(r1);
        }
        throw new ArithmeticException(r1);
    }

    public byte[] c() {
        int i = this.a;
        int i2 = 8;
        byte[] bArr = new byte[((((this.b + 7) >>> 3) * i) + 8)];
        bb3.a(i, bArr, 0);
        bb3.a(this.b, bArr, 4);
        int i3 = this.b;
        int i4 = i3 >>> 5;
        int i5 = i3 & 31;
        for (int i6 = 0; i6 < this.a; i6++) {
            int i7 = 0;
            while (i7 < i4) {
                bb3.a(this.c[i6][i7], bArr, i2);
                i7++;
                i2 += 4;
            }
            int i8 = 0;
            while (i8 < i5) {
                bArr[i2] = (byte) ((this.c[i6][i4] >>> i8) & 255);
                i8 += 8;
                i2++;
            }
        }
        return bArr;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof wa3)) {
            return false;
        }
        wa3 wa3 = (wa3) obj;
        if (!(this.a == wa3.a && this.b == wa3.b && this.d == wa3.d)) {
            return false;
        }
        for (int i = 0; i < this.a; i++) {
            if (!za3.b(this.c[i], wa3.c[i])) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int i = (((this.a * 31) + this.b) * 31) + this.d;
        for (int i2 = 0; i2 < this.a; i2++) {
            i = (i * 31) + this.c[i2].hashCode();
        }
        return i;
    }

    public String toString() {
        int i = this.b & 31;
        int i2 = i == 0 ? this.d : this.d - 1;
        StringBuffer stringBuffer = new StringBuffer();
        for (int i3 = 0; i3 < this.a; i3++) {
            stringBuffer.append(i3 + C0201.m82(195));
            for (int i4 = 0; i4 < i2; i4++) {
                int i5 = this.c[i3][i4];
                for (int i6 = 0; i6 < 32; i6++) {
                    if (((i5 >>> i6) & 1) == 0) {
                        stringBuffer.append('0');
                    } else {
                        stringBuffer.append('1');
                    }
                }
                stringBuffer.append(' ');
            }
            int i7 = this.c[i3][this.d - 1];
            for (int i8 = 0; i8 < i; i8++) {
                if (((i7 >>> i8) & 1) == 0) {
                    stringBuffer.append('0');
                } else {
                    stringBuffer.append('1');
                }
            }
            stringBuffer.append('\n');
        }
        return stringBuffer.toString();
    }

    public wa3(int i, int[][] iArr) {
        if (iArr[0].length == ((i + 31) >> 5)) {
            this.b = i;
            this.a = iArr.length;
            this.d = iArr[0].length;
            int i2 = i & 31;
            int i3 = i2 == 0 ? -1 : (1 << i2) - 1;
            for (int i4 = 0; i4 < this.a; i4++) {
                int[] iArr2 = iArr[i4];
                int i5 = this.d - 1;
                iArr2[i5] = iArr2[i5] & i3;
            }
            this.c = iArr;
            return;
        }
        throw new ArithmeticException(C0201.m82(193));
    }

    public wa3(wa3 wa3) {
        this.b = wa3.a();
        this.a = wa3.b();
        this.d = wa3.d;
        this.c = new int[wa3.c.length][];
        int i = 0;
        while (true) {
            int[][] iArr = this.c;
            if (i < iArr.length) {
                iArr[i] = za3.a(wa3.c[i]);
                i++;
            } else {
                return;
            }
        }
    }
}
