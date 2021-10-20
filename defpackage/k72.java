package defpackage;

import java.lang.reflect.Array;

/* renamed from: k72  reason: default package */
/* compiled from: HybridBinarizer */
public final class k72 extends i72 {
    private c72 e;

    public k72(m62 m62) {
        super(m62);
    }

    private static int[][] i(byte[] bArr, int i, int i2, int i3, int i4) {
        int i5 = 8;
        int i6 = i4 - 8;
        int i7 = i3 - 8;
        int[] iArr = new int[2];
        iArr[1] = i;
        iArr[0] = i2;
        int[][] iArr2 = (int[][]) Array.newInstance(int.class, iArr);
        int i8 = 0;
        while (i8 < i2) {
            int i9 = i8 << 3;
            if (i9 > i6) {
                i9 = i6;
            }
            int i10 = 0;
            while (i10 < i) {
                int i11 = i10 << 3;
                if (i11 > i7) {
                    i11 = i7;
                }
                int i12 = (i9 * i3) + i11;
                int i13 = 255;
                int i14 = 0;
                int i15 = 0;
                int i16 = 0;
                while (i14 < i5) {
                    int i17 = i16;
                    int i18 = 0;
                    while (i18 < i5) {
                        int i19 = bArr[i12 + i18] & 255;
                        i15 += i19;
                        if (i19 < i13) {
                            i13 = i19;
                        }
                        if (i19 > i17) {
                            i17 = i19;
                        }
                        i18++;
                        i5 = 8;
                    }
                    if (i17 - i13 <= 24) {
                        i14++;
                        i12 += i3;
                        i16 = i17;
                        i5 = 8;
                    }
                    while (true) {
                        i14++;
                        i12 += i3;
                        if (i14 >= 8) {
                            break;
                        }
                        int i20 = 0;
                        for (int i21 = 8; i20 < i21; i21 = 8) {
                            i15 += bArr[i12 + i20] & 255;
                            i20++;
                        }
                    }
                    i14++;
                    i12 += i3;
                    i16 = i17;
                    i5 = 8;
                }
                int i22 = i15 >> 6;
                if (i16 - i13 <= 24) {
                    i22 = i13 / 2;
                    if (i8 > 0 && i10 > 0) {
                        int i23 = i8 - 1;
                        int i24 = i10 - 1;
                        int i25 = ((iArr2[i23][i10] + (iArr2[i8][i24] * 2)) + iArr2[i23][i24]) / 4;
                        if (i13 < i25) {
                            i22 = i25;
                        }
                        iArr2[i8][i10] = i22;
                        i10++;
                        i5 = 8;
                    }
                }
                iArr2[i8][i10] = i22;
                i10++;
                i5 = 8;
            }
            i8++;
            i5 = 8;
        }
        return iArr2;
    }

    private static void j(byte[] bArr, int i, int i2, int i3, int i4, int[][] iArr, c72 c72) {
        int i5 = i4 - 8;
        int i6 = i3 - 8;
        for (int i7 = 0; i7 < i2; i7++) {
            int i8 = i7 << 3;
            int i9 = i8 > i5 ? i5 : i8;
            int k = k(i7, 2, i2 - 3);
            for (int i10 = 0; i10 < i; i10++) {
                int i11 = i10 << 3;
                int i12 = i11 > i6 ? i6 : i11;
                int k2 = k(i10, 2, i - 3);
                int i13 = 0;
                for (int i14 = -2; i14 <= 2; i14++) {
                    int[] iArr2 = iArr[k + i14];
                    i13 += iArr2[k2 - 2] + iArr2[k2 - 1] + iArr2[k2] + iArr2[k2 + 1] + iArr2[k2 + 2];
                }
                l(bArr, i12, i9, i13 / 25, i3, c72);
            }
        }
    }

    private static int k(int i, int i2, int i3) {
        return i < i2 ? i2 : i > i3 ? i3 : i;
    }

    private static void l(byte[] bArr, int i, int i2, int i3, int i4, c72 c72) {
        int i5 = (i2 * i4) + i;
        int i6 = 0;
        while (i6 < 8) {
            for (int i7 = 0; i7 < 8; i7++) {
                if ((bArr[i5 + i7] & 255) <= i3) {
                    c72.n(i + i7, i2 + i6);
                }
            }
            i6++;
            i5 += i4;
        }
    }

    @Override // defpackage.g62
    public g62 a(m62 m62) {
        return new k72(m62);
    }

    @Override // defpackage.g62, defpackage.i72
    public c72 b() throws o62 {
        c72 c72 = this.e;
        if (c72 != null) {
            return c72;
        }
        m62 e2 = e();
        int d = e2.d();
        int a = e2.a();
        if (d < 40 || a < 40) {
            this.e = super.b();
        } else {
            byte[] b = e2.b();
            int i = d >> 3;
            if ((d & 7) != 0) {
                i++;
            }
            int i2 = a >> 3;
            if ((a & 7) != 0) {
                i2++;
            }
            int[][] i3 = i(b, i, i2, d, a);
            c72 c722 = new c72(d, a);
            j(b, i, i2, d, a, i3, c722);
            this.e = c722;
        }
        return this.e;
    }
}
