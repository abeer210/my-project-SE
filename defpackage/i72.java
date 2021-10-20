package defpackage;

/* renamed from: i72  reason: default package */
/* compiled from: GlobalHistogramBinarizer */
public class i72 extends g62 {
    private static final byte[] d = new byte[0];
    private byte[] b = d;
    private final int[] c = new int[32];

    public i72(m62 m62) {
        super(m62);
    }

    private static int g(int[] iArr) throws o62 {
        int length = iArr.length;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < length; i4++) {
            if (iArr[i4] > i) {
                i = iArr[i4];
                i3 = i4;
            }
            if (iArr[i4] > i2) {
                i2 = iArr[i4];
            }
        }
        int i5 = 0;
        int i6 = 0;
        for (int i7 = 0; i7 < length; i7++) {
            int i8 = i7 - i3;
            int i9 = iArr[i7] * i8 * i8;
            if (i9 > i6) {
                i5 = i7;
                i6 = i9;
            }
        }
        if (i3 <= i5) {
            i3 = i5;
            i5 = i3;
        }
        if (i3 - i5 > length / 16) {
            int i10 = i3 - 1;
            int i11 = i10;
            int i12 = -1;
            while (i10 > i5) {
                int i13 = i10 - i5;
                int i14 = i13 * i13 * (i3 - i10) * (i2 - iArr[i10]);
                if (i14 > i12) {
                    i11 = i10;
                    i12 = i14;
                }
                i10--;
            }
            return i11 << 3;
        }
        throw o62.a();
    }

    private void h(int i) {
        if (this.b.length < i) {
            this.b = new byte[i];
        }
        for (int i2 = 0; i2 < 32; i2++) {
            this.c[i2] = 0;
        }
    }

    @Override // defpackage.g62
    public c72 b() throws o62 {
        m62 e = e();
        int d2 = e.d();
        int a = e.a();
        c72 c72 = new c72(d2, a);
        h(d2);
        int[] iArr = this.c;
        for (int i = 1; i < 5; i++) {
            byte[] c2 = e.c((a * i) / 5, this.b);
            int i2 = (d2 << 2) / 5;
            for (int i3 = d2 / 5; i3 < i2; i3++) {
                int i4 = (c2[i3] & 255) >> 3;
                iArr[i4] = iArr[i4] + 1;
            }
        }
        int g = g(iArr);
        byte[] b2 = e.b();
        for (int i5 = 0; i5 < a; i5++) {
            int i6 = i5 * d2;
            for (int i7 = 0; i7 < d2; i7++) {
                if ((b2[i6 + i7] & 255) < g) {
                    c72.n(i7, i5);
                }
            }
        }
        return c72;
    }

    @Override // defpackage.g62
    public b72 c(int i, b72 b72) throws o62 {
        m62 e = e();
        int d2 = e.d();
        if (b72 == null || b72.g() < d2) {
            b72 = new b72(d2);
        } else {
            b72.a();
        }
        h(d2);
        byte[] c2 = e.c(i, this.b);
        int[] iArr = this.c;
        for (int i2 = 0; i2 < d2; i2++) {
            int i3 = (c2[i2] & 255) >> 3;
            iArr[i3] = iArr[i3] + 1;
        }
        int g = g(iArr);
        if (d2 < 3) {
            for (int i4 = 0; i4 < d2; i4++) {
                if ((c2[i4] & 255) < g) {
                    b72.m(i4);
                }
            }
        } else {
            int i5 = c2[1] & 255;
            int i6 = 1;
            int i7 = c2[0] & 255;
            int i8 = i5;
            while (i6 < d2 - 1) {
                int i9 = i6 + 1;
                int i10 = c2[i9] & 255;
                if ((((i8 << 2) - i7) - i10) / 2 < g) {
                    b72.m(i6);
                }
                i7 = i8;
                i6 = i9;
                i8 = i10;
            }
        }
        return b72;
    }
}
