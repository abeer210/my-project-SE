package defpackage;

import vigqyno.C0201;

/* renamed from: a72  reason: default package */
/* compiled from: Detector */
public final class a72 {
    private static final int[] g = {3808, 476, 2107, 1799};
    private final c72 a;
    private boolean b;
    private int c;
    private int d;
    private int e;
    private int f;

    /* access modifiers changed from: package-private */
    /* renamed from: a72$a */
    /* compiled from: Detector */
    public static final class a {
        private final int a;
        private final int b;

        public a(int i, int i2) {
            this.a = i;
            this.b = i2;
        }

        public int a() {
            return this.a;
        }

        public int b() {
            return this.b;
        }

        public v62 c() {
            return new v62((float) a(), (float) b());
        }

        public String toString() {
            return C0201.m82(15575) + this.a + ' ' + this.b + '>';
        }
    }

    public a72(c72 c72) {
        this.a = c72;
    }

    private static float b(v62 v62, v62 v622) {
        return n72.a(v62.c(), v62.d(), v622.c(), v622.d());
    }

    private static float c(a aVar, a aVar2) {
        return n72.b(aVar.a(), aVar.b(), aVar2.a(), aVar2.b());
    }

    private static v62[] d(v62[] v62Arr, int i, int i2) {
        float f2 = ((float) i2) / (((float) i) * 2.0f);
        float c2 = v62Arr[0].c() - v62Arr[2].c();
        float d2 = v62Arr[0].d() - v62Arr[2].d();
        float c3 = (v62Arr[0].c() + v62Arr[2].c()) / 2.0f;
        float d3 = (v62Arr[0].d() + v62Arr[2].d()) / 2.0f;
        float f3 = c2 * f2;
        float f4 = d2 * f2;
        v62 v62 = new v62(c3 + f3, d3 + f4);
        v62 v622 = new v62(c3 - f3, d3 - f4);
        float c4 = v62Arr[1].c() - v62Arr[3].c();
        float d4 = v62Arr[1].d() - v62Arr[3].d();
        float c5 = (v62Arr[1].c() + v62Arr[3].c()) / 2.0f;
        float d5 = (v62Arr[1].d() + v62Arr[3].d()) / 2.0f;
        float f5 = c4 * f2;
        float f6 = f2 * d4;
        return new v62[]{v62, new v62(c5 + f5, d5 + f6), v622, new v62(c5 - f5, d5 - f6)};
    }

    private void e(v62[] v62Arr) throws o62 {
        long j;
        long j2;
        if (!o(v62Arr[0]) || !o(v62Arr[1]) || !o(v62Arr[2]) || !o(v62Arr[3])) {
            throw o62.a();
        }
        int i = this.e * 2;
        int[] iArr = {r(v62Arr[0], v62Arr[1], i), r(v62Arr[1], v62Arr[2], i), r(v62Arr[2], v62Arr[3], i), r(v62Arr[3], v62Arr[0], i)};
        this.f = m(iArr, i);
        long j3 = 0;
        for (int i2 = 0; i2 < 4; i2++) {
            int i3 = iArr[(this.f + i2) % 4];
            if (this.b) {
                j2 = j3 << 7;
                j = (long) ((i3 >> 1) & 127);
            } else {
                j2 = j3 << 10;
                j = (long) (((i3 >> 2) & 992) + ((i3 >> 1) & 31));
            }
            j3 = j2 + j;
        }
        int h = h(j3, this.b);
        if (this.b) {
            this.c = (h >> 6) + 1;
            this.d = (h & 63) + 1;
            return;
        }
        this.c = (h >> 11) + 1;
        this.d = (h & 2047) + 1;
    }

    private v62[] f(a aVar) throws o62 {
        this.e = 1;
        a aVar2 = aVar;
        a aVar3 = aVar2;
        a aVar4 = aVar3;
        a aVar5 = aVar4;
        boolean z = true;
        while (this.e < 9) {
            a j = j(aVar2, z, 1, -1);
            a j2 = j(aVar3, z, 1, 1);
            a j3 = j(aVar4, z, -1, 1);
            a j4 = j(aVar5, z, -1, -1);
            if (this.e > 2) {
                double c2 = (double) ((c(j4, j) * ((float) this.e)) / (c(aVar5, aVar2) * ((float) (this.e + 2))));
                if (c2 < 0.75d || c2 > 1.25d || !p(j, j2, j3, j4)) {
                    break;
                }
            }
            z = !z;
            this.e++;
            aVar5 = j4;
            aVar2 = j;
            aVar3 = j2;
            aVar4 = j3;
        }
        int i = this.e;
        if (i == 5 || i == 7) {
            this.b = this.e == 5;
            v62[] v62Arr = {new v62(((float) aVar2.a()) + 0.5f, ((float) aVar2.b()) - 0.5f), new v62(((float) aVar3.a()) + 0.5f, ((float) aVar3.b()) + 0.5f), new v62(((float) aVar4.a()) - 0.5f, ((float) aVar4.b()) + 0.5f), new v62(((float) aVar5.a()) - 0.5f, ((float) aVar5.b()) - 0.5f)};
            int i2 = this.e;
            return d(v62Arr, (i2 * 2) - 3, i2 * 2);
        }
        throw o62.a();
    }

    private int g(a aVar, a aVar2) {
        float c2 = c(aVar, aVar2);
        float a2 = ((float) (aVar2.a() - aVar.a())) / c2;
        float b2 = ((float) (aVar2.b() - aVar.b())) / c2;
        float a3 = (float) aVar.a();
        float b3 = (float) aVar.b();
        boolean d2 = this.a.d(aVar.a(), aVar.b());
        int ceil = (int) Math.ceil((double) c2);
        boolean z = false;
        int i = 0;
        for (int i2 = 0; i2 < ceil; i2++) {
            a3 += a2;
            b3 += b2;
            if (this.a.d(n72.c(a3), n72.c(b3)) != d2) {
                i++;
            }
        }
        float f2 = ((float) i) / c2;
        if (f2 > 0.1f && f2 < 0.9f) {
            return 0;
        }
        if (f2 <= 0.1f) {
            z = true;
        }
        return z == d2 ? 1 : -1;
    }

    private static int h(long j, boolean z) throws o62 {
        int i;
        int i2;
        if (z) {
            i = 7;
            i2 = 2;
        } else {
            i = 10;
            i2 = 4;
        }
        int i3 = i - i2;
        int[] iArr = new int[i];
        for (int i4 = i - 1; i4 >= 0; i4--) {
            iArr[i4] = ((int) j) & 15;
            j >>= 4;
        }
        try {
            new r72(p72.k).a(iArr, i3);
            int i5 = 0;
            for (int i6 = 0; i6 < i2; i6++) {
                i5 = (i5 << 4) + iArr[i6];
            }
            return i5;
        } catch (s72 unused) {
            throw o62.a();
        }
    }

    private int i() {
        if (this.b) {
            return (this.c * 4) + 11;
        }
        int i = this.c;
        if (i <= 4) {
            return (i * 4) + 15;
        }
        return (i * 4) + ((((i - 4) / 8) + 1) * 2) + 15;
    }

    private a j(a aVar, boolean z, int i, int i2) {
        int a2 = aVar.a() + i;
        int b2 = aVar.b();
        while (true) {
            b2 += i2;
            if (!n(a2, b2) || this.a.d(a2, b2) != z) {
                int i3 = a2 - i;
                int i4 = b2 - i2;
            } else {
                a2 += i;
            }
        }
        int i32 = a2 - i;
        int i42 = b2 - i2;
        while (n(i32, i42) && this.a.d(i32, i42) == z) {
            i32 += i;
        }
        int i5 = i32 - i;
        while (n(i5, i42) && this.a.d(i5, i42) == z) {
            i42 += i2;
        }
        return new a(i5, i42 - i2);
    }

    private a k() {
        v62 v62;
        v62 v622;
        v62 v623;
        v62 v624;
        v62 v625;
        v62 v626;
        v62 v627;
        v62 v628;
        try {
            v62[] c2 = new o72(this.a).c();
            v623 = c2[0];
            v622 = c2[1];
            v62 = c2[2];
            v624 = c2[3];
        } catch (o62 unused) {
            int l = this.a.l() / 2;
            int g2 = this.a.g() / 2;
            int i = l + 7;
            int i2 = g2 - 7;
            v62 c3 = j(new a(i, i2), false, 1, -1).c();
            int i3 = g2 + 7;
            v62 c4 = j(new a(i, i3), false, 1, 1).c();
            int i4 = l - 7;
            v62 c5 = j(new a(i4, i3), false, -1, 1).c();
            v624 = j(new a(i4, i2), false, -1, -1).c();
            v62 = c5;
            v623 = c3;
            v622 = c4;
        }
        int c6 = n72.c((((v623.c() + v624.c()) + v622.c()) + v62.c()) / 4.0f);
        int c7 = n72.c((((v623.d() + v624.d()) + v622.d()) + v62.d()) / 4.0f);
        try {
            v62[] c8 = new o72(this.a, 15, c6, c7).c();
            v626 = c8[0];
            v625 = c8[1];
            v627 = c8[2];
            v628 = c8[3];
        } catch (o62 unused2) {
            int i5 = c6 + 7;
            int i6 = c7 - 7;
            v626 = j(new a(i5, i6), false, 1, -1).c();
            int i7 = c7 + 7;
            v625 = j(new a(i5, i7), false, 1, 1).c();
            int i8 = c6 - 7;
            v627 = j(new a(i8, i7), false, -1, 1).c();
            v628 = j(new a(i8, i6), false, -1, -1).c();
        }
        return new a(n72.c((((v626.c() + v628.c()) + v625.c()) + v627.c()) / 4.0f), n72.c((((v626.d() + v628.d()) + v625.d()) + v627.d()) / 4.0f));
    }

    private v62[] l(v62[] v62Arr) {
        return d(v62Arr, this.e * 2, i());
    }

    private static int m(int[] iArr, int i) throws o62 {
        int i2 = 0;
        for (int i3 : iArr) {
            i2 = (i2 << 3) + ((i3 >> (i - 2)) << 1) + (i3 & 1);
        }
        int i4 = ((i2 & 1) << 11) + (i2 >> 1);
        for (int i5 = 0; i5 < 4; i5++) {
            if (Integer.bitCount(g[i5] ^ i4) <= 2) {
                return i5;
            }
        }
        throw o62.a();
    }

    private boolean n(int i, int i2) {
        return i >= 0 && i < this.a.l() && i2 > 0 && i2 < this.a.g();
    }

    private boolean o(v62 v62) {
        return n(n72.c(v62.c()), n72.c(v62.d()));
    }

    private boolean p(a aVar, a aVar2, a aVar3, a aVar4) {
        a aVar5 = new a(aVar.a() - 3, aVar.b() + 3);
        a aVar6 = new a(aVar2.a() - 3, aVar2.b() - 3);
        a aVar7 = new a(aVar3.a() + 3, aVar3.b() - 3);
        a aVar8 = new a(aVar4.a() + 3, aVar4.b() + 3);
        int g2 = g(aVar8, aVar5);
        if (g2 != 0 && g(aVar5, aVar6) == g2 && g(aVar6, aVar7) == g2 && g(aVar7, aVar8) == g2) {
            return true;
        }
        return false;
    }

    private c72 q(c72 c72, v62 v62, v62 v622, v62 v623, v62 v624) throws o62 {
        j72 b2 = j72.b();
        int i = i();
        float f2 = ((float) i) / 2.0f;
        int i2 = this.e;
        float f3 = f2 - ((float) i2);
        float f4 = f2 + ((float) i2);
        return b2.c(c72, i, i, f3, f3, f4, f3, f4, f4, f3, f4, v62.c(), v62.d(), v622.c(), v622.d(), v623.c(), v623.d(), v624.c(), v624.d());
    }

    private int r(v62 v62, v62 v622, int i) {
        float b2 = b(v62, v622);
        float f2 = b2 / ((float) i);
        float c2 = v62.c();
        float d2 = v62.d();
        float c3 = ((v622.c() - v62.c()) * f2) / b2;
        float d3 = (f2 * (v622.d() - v62.d())) / b2;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            float f3 = (float) i3;
            if (this.a.d(n72.c((f3 * c3) + c2), n72.c((f3 * d3) + d2))) {
                i2 |= 1 << ((i - i3) - 1);
            }
        }
        return i2;
    }

    public x62 a(boolean z) throws o62 {
        v62[] f2 = f(k());
        if (z) {
            v62 v62 = f2[0];
            f2[0] = f2[2];
            f2[2] = v62;
        }
        e(f2);
        c72 c72 = this.a;
        int i = this.f;
        return new x62(q(c72, f2[i % 4], f2[(i + 1) % 4], f2[(i + 2) % 4], f2[(i + 3) % 4]), l(f2), this.b, this.d, this.c);
    }
}
