package defpackage;

import vigqyno.C0201;

/* renamed from: p72  reason: default package */
/* compiled from: GenericGF */
public final class p72 {
    public static final p72 h = new p72(4201, 4096, 1);
    public static final p72 i = new p72(1033, 1024, 1);
    public static final p72 j = new p72(67, 64, 1);
    public static final p72 k = new p72(19, 16, 1);
    public static final p72 l = new p72(285, 256, 0);
    public static final p72 m;
    public static final p72 n;
    public static final p72 o = j;
    private final int[] a;
    private final int[] b;
    private final q72 c;
    private final q72 d;
    private final int e;
    private final int f;
    private final int g;

    static {
        p72 p72 = new p72(301, 256, 1);
        m = p72;
        n = p72;
    }

    public p72(int i2, int i3, int i4) {
        this.f = i2;
        this.e = i3;
        this.g = i4;
        this.a = new int[i3];
        this.b = new int[i3];
        int i5 = 1;
        for (int i6 = 0; i6 < i3; i6++) {
            this.a[i6] = i5;
            i5 <<= 1;
            if (i5 >= i3) {
                i5 = (i5 ^ i2) & (i3 - 1);
            }
        }
        for (int i7 = 0; i7 < i3 - 1; i7++) {
            this.b[this.a[i7]] = i7;
        }
        this.c = new q72(this, new int[]{0});
        this.d = new q72(this, new int[]{1});
    }

    public static int a(int i2, int i3) {
        return i2 ^ i3;
    }

    public q72 b(int i2, int i3) {
        if (i2 < 0) {
            throw new IllegalArgumentException();
        } else if (i3 == 0) {
            return this.c;
        } else {
            int[] iArr = new int[(i2 + 1)];
            iArr[0] = i3;
            return new q72(this, iArr);
        }
    }

    public int c(int i2) {
        return this.a[i2];
    }

    public int d() {
        return this.g;
    }

    public q72 e() {
        return this.d;
    }

    public int f() {
        return this.e;
    }

    public q72 g() {
        return this.c;
    }

    public int h(int i2) {
        if (i2 != 0) {
            return this.a[(this.e - this.b[i2]) - 1];
        }
        throw new ArithmeticException();
    }

    public int i(int i2) {
        if (i2 != 0) {
            return this.b[i2];
        }
        throw new IllegalArgumentException();
    }

    public int j(int i2, int i3) {
        if (i2 == 0 || i3 == 0) {
            return 0;
        }
        int[] iArr = this.a;
        int[] iArr2 = this.b;
        return iArr[(iArr2[i2] + iArr2[i3]) % (this.e - 1)];
    }

    public String toString() {
        return C0201.m82(36861) + Integer.toHexString(this.f) + ',' + this.e + ')';
    }
}
