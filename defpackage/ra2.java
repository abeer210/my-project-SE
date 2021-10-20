package defpackage;

/* renamed from: ra2  reason: default package */
/* compiled from: BitMatrixParser */
public final class ra2 {
    private final c72 a;
    private ab2 b;
    private xa2 c;
    private boolean d;

    public ra2(c72 c72) throws k62 {
        int g = c72.g();
        if (g < 21 || (g & 3) != 1) {
            throw k62.a();
        }
        this.a = c72;
    }

    private int a(int i, int i2, int i3) {
        return this.d ? this.a.d(i2, i) : this.a.d(i, i2) ? (i3 << 1) | 1 : i3 << 1;
    }

    public void b() {
        int i = 0;
        while (i < this.a.l()) {
            int i2 = i + 1;
            for (int i3 = i2; i3 < this.a.g(); i3++) {
                if (this.a.d(i, i3) != this.a.d(i3, i)) {
                    this.a.c(i3, i);
                    this.a.c(i, i3);
                }
            }
            i = i2;
        }
    }

    public byte[] c() throws k62 {
        xa2 d2 = d();
        ab2 e = e();
        ta2 ta2 = ta2.values()[d2.c()];
        int g = this.a.g();
        ta2.d(this.a, g);
        c72 a2 = e.a();
        byte[] bArr = new byte[e.h()];
        int i = g - 1;
        boolean z = true;
        int i2 = i;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        while (i2 > 0) {
            if (i2 == 6) {
                i2--;
            }
            for (int i6 = 0; i6 < g; i6++) {
                int i7 = z ? i - i6 : i6;
                for (int i8 = 0; i8 < 2; i8++) {
                    int i9 = i2 - i8;
                    if (!a2.d(i9, i7)) {
                        i4++;
                        i5 <<= 1;
                        if (this.a.d(i9, i7)) {
                            i5 |= 1;
                        }
                        if (i4 == 8) {
                            bArr[i3] = (byte) i5;
                            i3++;
                            i4 = 0;
                            i5 = 0;
                        }
                    }
                }
            }
            z = !z;
            i2 -= 2;
        }
        if (i3 == e.h()) {
            return bArr;
        }
        throw k62.a();
    }

    public xa2 d() throws k62 {
        xa2 xa2 = this.c;
        if (xa2 != null) {
            return xa2;
        }
        int i = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < 6; i3++) {
            i2 = a(i3, 8, i2);
        }
        int a2 = a(8, 7, a(8, 8, a(7, 8, i2)));
        for (int i4 = 5; i4 >= 0; i4--) {
            a2 = a(8, i4, a2);
        }
        int g = this.a.g();
        int i5 = g - 7;
        for (int i6 = g - 1; i6 >= i5; i6--) {
            i = a(8, i6, i);
        }
        for (int i7 = g - 8; i7 < g; i7++) {
            i = a(i7, 8, i);
        }
        xa2 a3 = xa2.a(a2, i);
        this.c = a3;
        if (a3 != null) {
            return a3;
        }
        throw k62.a();
    }

    public ab2 e() throws k62 {
        ab2 ab2 = this.b;
        if (ab2 != null) {
            return ab2;
        }
        int g = this.a.g();
        int i = (g - 17) / 4;
        if (i <= 6) {
            return ab2.i(i);
        }
        int i2 = g - 11;
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 5; i5 >= 0; i5--) {
            for (int i6 = g - 9; i6 >= i2; i6--) {
                i4 = a(i6, i5, i4);
            }
        }
        ab2 c2 = ab2.c(i4);
        if (c2 == null || c2.e() != g) {
            for (int i7 = 5; i7 >= 0; i7--) {
                for (int i8 = g - 9; i8 >= i2; i8--) {
                    i3 = a(i7, i8, i3);
                }
            }
            ab2 c3 = ab2.c(i3);
            if (c3 == null || c3.e() != g) {
                throw k62.a();
            }
            this.b = c3;
            return c3;
        }
        this.b = c2;
        return c2;
    }

    public void f() {
        if (this.c != null) {
            ta2.values()[this.c.c()].d(this.a, this.a.g());
        }
    }

    public void g(boolean z) {
        this.b = null;
        this.c = null;
        this.d = z;
    }
}
