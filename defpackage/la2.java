package defpackage;

/* renamed from: la2  reason: default package */
/* compiled from: ErrorCorrection */
public final class la2 {
    private final ma2 a = ma2.f;

    private int[] b(na2 na2) throws i62 {
        int d = na2.d();
        int[] iArr = new int[d];
        int i = 0;
        for (int i2 = 1; i2 < this.a.e() && i < d; i2++) {
            if (na2.b(i2) == 0) {
                iArr[i] = this.a.g(i2);
                i++;
            }
        }
        if (i == d) {
            return iArr;
        }
        throw i62.a();
    }

    private int[] c(na2 na2, na2 na22, int[] iArr) {
        int d = na22.d();
        int[] iArr2 = new int[d];
        for (int i = 1; i <= d; i++) {
            iArr2[d - i] = this.a.i(i, na22.c(i));
        }
        na2 na23 = new na2(this.a, iArr2);
        int length = iArr.length;
        int[] iArr3 = new int[length];
        for (int i2 = 0; i2 < length; i2++) {
            int g = this.a.g(iArr[i2]);
            iArr3[i2] = this.a.i(this.a.j(0, na2.b(g)), this.a.g(na23.b(g)));
        }
        return iArr3;
    }

    private na2[] d(na2 na2, na2 na22, int i) throws i62 {
        if (na2.d() < na22.d()) {
            na22 = na2;
            na2 = na22;
        }
        na2 f = this.a.f();
        na2 d = this.a.d();
        while (true) {
            na22 = na2;
            na2 = na22;
            f = d;
            if (na2.d() < i / 2) {
                int c = f.c(0);
                if (c != 0) {
                    int g = this.a.g(c);
                    return new na2[]{f.f(g), na2.f(g)};
                }
                throw i62.a();
            } else if (!na2.e()) {
                na2 f2 = this.a.f();
                int g2 = this.a.g(na2.c(na2.d()));
                while (na22.d() >= na2.d() && !na22.e()) {
                    int d2 = na22.d() - na2.d();
                    int i2 = this.a.i(na22.c(na22.d()), g2);
                    f2 = f2.a(this.a.b(d2, i2));
                    na22 = na22.j(na2.h(d2, i2));
                }
                d = f2.g(f).j(f).i();
            } else {
                throw i62.a();
            }
        }
    }

    public int a(int[] iArr, int i, int[] iArr2) throws i62 {
        na2 na2 = new na2(this.a, iArr);
        int[] iArr3 = new int[i];
        boolean z = false;
        for (int i2 = i; i2 > 0; i2--) {
            int b = na2.b(this.a.c(i2));
            iArr3[i - i2] = b;
            if (b != 0) {
                z = true;
            }
        }
        if (!z) {
            return 0;
        }
        na2 d = this.a.d();
        if (iArr2 != null) {
            for (int i3 : iArr2) {
                int c = this.a.c((iArr.length - 1) - i3);
                ma2 ma2 = this.a;
                d = d.g(new na2(ma2, new int[]{ma2.j(0, c), 1}));
            }
        }
        na2[] d2 = d(this.a.b(i, 1), new na2(this.a, iArr3), i);
        na2 na22 = d2[0];
        na2 na23 = d2[1];
        int[] b2 = b(na22);
        int[] c2 = c(na23, na22, b2);
        for (int i4 = 0; i4 < b2.length; i4++) {
            int length = (iArr.length - 1) - this.a.h(b2[i4]);
            if (length >= 0) {
                iArr[length] = this.a.j(iArr[length], c2[i4]);
            } else {
                throw i62.a();
            }
        }
        return b2.length;
    }
}
