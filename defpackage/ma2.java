package defpackage;

/* renamed from: ma2  reason: default package */
/* compiled from: ModulusGF */
public final class ma2 {
    public static final ma2 f = new ma2(929, 3);
    private final int[] a;
    private final int[] b;
    private final na2 c;
    private final na2 d;
    private final int e;

    private ma2(int i, int i2) {
        this.e = i;
        this.a = new int[i];
        this.b = new int[i];
        int i3 = 1;
        for (int i4 = 0; i4 < i; i4++) {
            this.a[i4] = i3;
            i3 = (i3 * i2) % i;
        }
        for (int i5 = 0; i5 < i - 1; i5++) {
            this.b[this.a[i5]] = i5;
        }
        this.c = new na2(this, new int[]{0});
        this.d = new na2(this, new int[]{1});
    }

    public int a(int i, int i2) {
        return (i + i2) % this.e;
    }

    public na2 b(int i, int i2) {
        if (i < 0) {
            throw new IllegalArgumentException();
        } else if (i2 == 0) {
            return this.c;
        } else {
            int[] iArr = new int[(i + 1)];
            iArr[0] = i2;
            return new na2(this, iArr);
        }
    }

    public int c(int i) {
        return this.a[i];
    }

    public na2 d() {
        return this.d;
    }

    public int e() {
        return this.e;
    }

    public na2 f() {
        return this.c;
    }

    public int g(int i) {
        if (i != 0) {
            return this.a[(this.e - this.b[i]) - 1];
        }
        throw new ArithmeticException();
    }

    public int h(int i) {
        if (i != 0) {
            return this.b[i];
        }
        throw new IllegalArgumentException();
    }

    public int i(int i, int i2) {
        if (i == 0 || i2 == 0) {
            return 0;
        }
        int[] iArr = this.a;
        int[] iArr2 = this.b;
        return iArr[(iArr2[i] + iArr2[i2]) % (this.e - 1)];
    }

    public int j(int i, int i2) {
        int i3 = this.e;
        return ((i + i3) - i2) % i3;
    }
}
