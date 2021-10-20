package defpackage;

import vigqyno.C0201;

/* renamed from: u72  reason: default package */
/* compiled from: BitMatrixParser */
public final class u72 {
    private final c72 a;
    private final c72 b;
    private final y72 c;

    public u72(c72 c72) throws k62 {
        int g = c72.g();
        if (g < 8 || g > 144 || (g & 1) != 0) {
            throw k62.a();
        }
        this.c = j(c72);
        c72 a2 = a(c72);
        this.a = a2;
        this.b = new c72(a2.l(), this.a.g());
    }

    private c72 a(c72 c72) {
        int f = this.c.f();
        int e = this.c.e();
        if (c72.g() == f) {
            int c2 = this.c.c();
            int b2 = this.c.b();
            int i = f / c2;
            int i2 = e / b2;
            c72 c722 = new c72(i2 * b2, i * c2);
            for (int i3 = 0; i3 < i; i3++) {
                int i4 = i3 * c2;
                for (int i5 = 0; i5 < i2; i5++) {
                    int i6 = i5 * b2;
                    for (int i7 = 0; i7 < c2; i7++) {
                        int i8 = ((c2 + 2) * i3) + 1 + i7;
                        int i9 = i4 + i7;
                        for (int i10 = 0; i10 < b2; i10++) {
                            if (c72.d(((b2 + 2) * i5) + 1 + i10, i8)) {
                                c722.n(i6 + i10, i9);
                            }
                        }
                    }
                }
            }
            return c722;
        }
        throw new IllegalArgumentException(C0201.m82(35475));
    }

    private int d(int i, int i2) {
        int i3 = i - 1;
        int i4 = (h(i3, 0, i, i2) ? 1 : 0) << 1;
        if (h(i3, 1, i, i2)) {
            i4 |= 1;
        }
        int i5 = i4 << 1;
        if (h(i3, 2, i, i2)) {
            i5 |= 1;
        }
        int i6 = i5 << 1;
        if (h(0, i2 - 2, i, i2)) {
            i6 |= 1;
        }
        int i7 = i6 << 1;
        int i8 = i2 - 1;
        if (h(0, i8, i, i2)) {
            i7 |= 1;
        }
        int i9 = i7 << 1;
        if (h(1, i8, i, i2)) {
            i9 |= 1;
        }
        int i10 = i9 << 1;
        if (h(2, i8, i, i2)) {
            i10 |= 1;
        }
        int i11 = i10 << 1;
        return h(3, i8, i, i2) ? i11 | 1 : i11;
    }

    private int e(int i, int i2) {
        int i3 = (h(i + -3, 0, i, i2) ? 1 : 0) << 1;
        if (h(i - 2, 0, i, i2)) {
            i3 |= 1;
        }
        int i4 = i3 << 1;
        if (h(i - 1, 0, i, i2)) {
            i4 |= 1;
        }
        int i5 = i4 << 1;
        if (h(0, i2 - 4, i, i2)) {
            i5 |= 1;
        }
        int i6 = i5 << 1;
        if (h(0, i2 - 3, i, i2)) {
            i6 |= 1;
        }
        int i7 = i6 << 1;
        if (h(0, i2 - 2, i, i2)) {
            i7 |= 1;
        }
        int i8 = i7 << 1;
        int i9 = i2 - 1;
        if (h(0, i9, i, i2)) {
            i8 |= 1;
        }
        int i10 = i8 << 1;
        return h(1, i9, i, i2) ? i10 | 1 : i10;
    }

    private int f(int i, int i2) {
        int i3 = i - 1;
        int i4 = (h(i3, 0, i, i2) ? 1 : 0) << 1;
        int i5 = i2 - 1;
        if (h(i3, i5, i, i2)) {
            i4 |= 1;
        }
        int i6 = i4 << 1;
        int i7 = i2 - 3;
        if (h(0, i7, i, i2)) {
            i6 |= 1;
        }
        int i8 = i6 << 1;
        int i9 = i2 - 2;
        if (h(0, i9, i, i2)) {
            i8 |= 1;
        }
        int i10 = i8 << 1;
        if (h(0, i5, i, i2)) {
            i10 |= 1;
        }
        int i11 = i10 << 1;
        if (h(1, i7, i, i2)) {
            i11 |= 1;
        }
        int i12 = i11 << 1;
        if (h(1, i9, i, i2)) {
            i12 |= 1;
        }
        int i13 = i12 << 1;
        return h(1, i5, i, i2) ? i13 | 1 : i13;
    }

    private int g(int i, int i2) {
        int i3 = (h(i + -3, 0, i, i2) ? 1 : 0) << 1;
        if (h(i - 2, 0, i, i2)) {
            i3 |= 1;
        }
        int i4 = i3 << 1;
        if (h(i - 1, 0, i, i2)) {
            i4 |= 1;
        }
        int i5 = i4 << 1;
        if (h(0, i2 - 2, i, i2)) {
            i5 |= 1;
        }
        int i6 = i5 << 1;
        int i7 = i2 - 1;
        if (h(0, i7, i, i2)) {
            i6 |= 1;
        }
        int i8 = i6 << 1;
        if (h(1, i7, i, i2)) {
            i8 |= 1;
        }
        int i9 = i8 << 1;
        if (h(2, i7, i, i2)) {
            i9 |= 1;
        }
        int i10 = i9 << 1;
        return h(3, i7, i, i2) ? i10 | 1 : i10;
    }

    private boolean h(int i, int i2, int i3, int i4) {
        if (i < 0) {
            i += i3;
            i2 += 4 - ((i3 + 4) & 7);
        }
        if (i2 < 0) {
            i2 += i4;
            i += 4 - ((i4 + 4) & 7);
        }
        this.b.n(i2, i);
        return this.a.d(i2, i);
    }

    private int i(int i, int i2, int i3, int i4) {
        int i5 = i - 2;
        int i6 = i2 - 2;
        int i7 = (h(i5, i6, i3, i4) ? 1 : 0) << 1;
        int i8 = i2 - 1;
        if (h(i5, i8, i3, i4)) {
            i7 |= 1;
        }
        int i9 = i7 << 1;
        int i10 = i - 1;
        if (h(i10, i6, i3, i4)) {
            i9 |= 1;
        }
        int i11 = i9 << 1;
        if (h(i10, i8, i3, i4)) {
            i11 |= 1;
        }
        int i12 = i11 << 1;
        if (h(i10, i2, i3, i4)) {
            i12 |= 1;
        }
        int i13 = i12 << 1;
        if (h(i, i6, i3, i4)) {
            i13 |= 1;
        }
        int i14 = i13 << 1;
        if (h(i, i8, i3, i4)) {
            i14 |= 1;
        }
        int i15 = i14 << 1;
        return h(i, i2, i3, i4) ? i15 | 1 : i15;
    }

    private static y72 j(c72 c72) throws k62 {
        return y72.h(c72.g(), c72.l());
    }

    public y72 b() {
        return this.c;
    }

    public byte[] c() throws k62 {
        byte[] bArr = new byte[this.c.g()];
        int g = this.a.g();
        int l = this.a.l();
        int i = 0;
        boolean z = false;
        int i2 = 0;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        int i3 = 4;
        while (true) {
            if (i3 == g && i == 0 && !z) {
                bArr[i2] = (byte) d(g, l);
                i3 -= 2;
                i += 2;
                i2++;
                z = true;
            } else {
                int i4 = g - 2;
                if (i3 == i4 && i == 0 && (l & 3) != 0 && !z2) {
                    bArr[i2] = (byte) e(g, l);
                    i3 -= 2;
                    i += 2;
                    i2++;
                    z2 = true;
                } else if (i3 == g + 4 && i == 2 && (l & 7) == 0 && !z3) {
                    bArr[i2] = (byte) f(g, l);
                    i3 -= 2;
                    i += 2;
                    i2++;
                    z3 = true;
                } else if (i3 == i4 && i == 0 && (l & 7) == 4 && !z4) {
                    bArr[i2] = (byte) g(g, l);
                    i3 -= 2;
                    i += 2;
                    i2++;
                    z4 = true;
                } else {
                    do {
                        if (i3 < g && i >= 0 && !this.b.d(i, i3)) {
                            bArr[i2] = (byte) i(i3, i, g, l);
                            i2++;
                        }
                        i3 -= 2;
                        i += 2;
                        if (i3 < 0) {
                            break;
                        }
                    } while (i < l);
                    int i5 = i3 + 1;
                    int i6 = i + 3;
                    do {
                        if (i5 >= 0 && i6 < l && !this.b.d(i6, i5)) {
                            bArr[i2] = (byte) i(i5, i6, g, l);
                            i2++;
                        }
                        i5 += 2;
                        i6 -= 2;
                        if (i5 >= g) {
                            break;
                        }
                    } while (i6 >= 0);
                    i3 = i5 + 3;
                    i = i6 + 1;
                }
            }
            if (i3 >= g && i >= l) {
                break;
            }
        }
        if (i2 == this.c.g()) {
            return bArr;
        }
        throw k62.a();
    }
}
