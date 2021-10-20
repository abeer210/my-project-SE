package defpackage;

import vigqyno.C0201;

/* renamed from: gb3  reason: default package */
/* compiled from: PolynomialRingGF2m */
public class gb3 {
    private xa3 a;
    private eb3 b;
    public eb3[] c;
    public eb3[] d;

    public gb3(xa3 xa3, eb3 eb3) {
        this.a = xa3;
        this.b = eb3;
        b();
        a();
    }

    private void a() {
        int f;
        int g = this.b.g();
        eb3[] eb3Arr = new eb3[g];
        int i = g - 1;
        for (int i2 = i; i2 >= 0; i2--) {
            eb3Arr[i2] = new eb3(this.c[i2]);
        }
        this.d = new eb3[g];
        while (i >= 0) {
            this.d[i] = new eb3(this.a, i);
            i--;
        }
        for (int i3 = 0; i3 < g; i3++) {
            if (eb3Arr[i3].f(i3) == 0) {
                int i4 = i3 + 1;
                boolean z = false;
                while (i4 < g) {
                    if (eb3Arr[i4].f(i3) != 0) {
                        d(eb3Arr, i3, i4);
                        d(this.d, i3, i4);
                        i4 = g;
                        z = true;
                    }
                    i4++;
                }
                if (!z) {
                    throw new ArithmeticException(C0201.m82(3998));
                }
            }
            int f2 = this.a.f(eb3Arr[i3].f(i3));
            eb3Arr[i3].m(f2);
            this.d[i3].m(f2);
            for (int i5 = 0; i5 < g; i5++) {
                if (!(i5 == i3 || (f = eb3Arr[i5].f(i3)) == 0)) {
                    eb3 n = eb3Arr[i3].n(f);
                    eb3 n2 = this.d[i3].n(f);
                    eb3Arr[i5].b(n);
                    this.d[i5].b(n2);
                }
            }
        }
    }

    private void b() {
        int i;
        int g = this.b.g();
        this.c = new eb3[g];
        int i2 = 0;
        while (true) {
            i = g >> 1;
            if (i2 >= i) {
                break;
            }
            int i3 = i2 << 1;
            int[] iArr = new int[(i3 + 1)];
            iArr[i3] = 1;
            this.c[i2] = new eb3(this.a, iArr);
            i2++;
        }
        while (i < g) {
            int i4 = i << 1;
            int[] iArr2 = new int[(i4 + 1)];
            iArr2[i4] = 1;
            this.c[i] = new eb3(this.a, iArr2).k(this.b);
            i++;
        }
    }

    private static void d(eb3[] eb3Arr, int i, int i2) {
        eb3 eb3 = eb3Arr[i];
        eb3Arr[i] = eb3Arr[i2];
        eb3Arr[i2] = eb3;
    }

    public eb3[] c() {
        return this.d;
    }
}
