package defpackage;

/* renamed from: az0  reason: default package */
public final class az0 implements Cloneable {
    private int[] a;
    private bz0[] b;
    private int c;

    static {
        new bz0();
    }

    public az0() {
        this(10);
    }

    private az0(int i) {
        int i2 = i << 2;
        int i3 = 4;
        while (true) {
            if (i3 >= 32) {
                break;
            }
            int i4 = (1 << i3) - 12;
            if (i2 <= i4) {
                i2 = i4;
                break;
            }
            i3++;
        }
        int i5 = i2 / 4;
        this.a = new int[i5];
        this.b = new bz0[i5];
        this.c = 0;
    }

    public final boolean a() {
        return this.c == 0;
    }

    public final int b() {
        return this.c;
    }

    public final bz0 c(int i) {
        return this.b[i];
    }

    @Override // java.lang.Object
    public final /* synthetic */ Object clone() throws CloneNotSupportedException {
        int i = this.c;
        az0 az0 = new az0(i);
        System.arraycopy(this.a, 0, az0.a, 0, i);
        for (int i2 = 0; i2 < i; i2++) {
            bz0[] bz0Arr = this.b;
            if (bz0Arr[i2] != null) {
                az0.b[i2] = (bz0) bz0Arr[i2].clone();
            }
        }
        az0.c = i;
        return az0;
    }

    public final boolean equals(Object obj) {
        boolean z;
        boolean z2;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof az0)) {
            return false;
        }
        az0 az0 = (az0) obj;
        int i = this.c;
        if (i != az0.c) {
            return false;
        }
        int[] iArr = this.a;
        int[] iArr2 = az0.a;
        int i2 = 0;
        while (true) {
            if (i2 >= i) {
                z = true;
                break;
            } else if (iArr[i2] != iArr2[i2]) {
                z = false;
                break;
            } else {
                i2++;
            }
        }
        if (z) {
            bz0[] bz0Arr = this.b;
            bz0[] bz0Arr2 = az0.b;
            int i3 = this.c;
            int i4 = 0;
            while (true) {
                if (i4 >= i3) {
                    z2 = true;
                    break;
                } else if (!bz0Arr[i4].equals(bz0Arr2[i4])) {
                    z2 = false;
                    break;
                } else {
                    i4++;
                }
            }
            if (z2) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = 17;
        for (int i2 = 0; i2 < this.c; i2++) {
            i = (((i * 31) + this.a[i2]) * 31) + this.b[i2].hashCode();
        }
        return i;
    }
}
