package defpackage;

/* renamed from: dp1  reason: default package */
public final class dp1 implements Cloneable {
    private static final ep1 d = new ep1();
    private int[] a;
    private ep1[] b;
    private int c;

    public dp1() {
        this(10);
    }

    private static int a(int i) {
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
        return i2 / 4;
    }

    private final int f(int i) {
        int i2 = this.c - 1;
        int i3 = 0;
        while (i3 <= i2) {
            int i4 = (i3 + i2) >>> 1;
            int i5 = this.a[i4];
            if (i5 < i) {
                i3 = i4 + 1;
            } else if (i5 <= i) {
                return i4;
            } else {
                i2 = i4 - 1;
            }
        }
        return i3 ^ -1;
    }

    public final int b() {
        return this.c;
    }

    public final void c(int i, ep1 ep1) {
        int f = f(i);
        if (f >= 0) {
            this.b[f] = ep1;
            return;
        }
        int i2 = f ^ -1;
        if (i2 < this.c) {
            ep1[] ep1Arr = this.b;
            if (ep1Arr[i2] == d) {
                this.a[i2] = i;
                ep1Arr[i2] = ep1;
                return;
            }
        }
        int i3 = this.c;
        if (i3 >= this.a.length) {
            int a2 = a(i3 + 1);
            int[] iArr = new int[a2];
            ep1[] ep1Arr2 = new ep1[a2];
            int[] iArr2 = this.a;
            System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            ep1[] ep1Arr3 = this.b;
            System.arraycopy(ep1Arr3, 0, ep1Arr2, 0, ep1Arr3.length);
            this.a = iArr;
            this.b = ep1Arr2;
        }
        int i4 = this.c;
        if (i4 - i2 != 0) {
            int[] iArr3 = this.a;
            int i5 = i2 + 1;
            System.arraycopy(iArr3, i2, iArr3, i5, i4 - i2);
            ep1[] ep1Arr4 = this.b;
            System.arraycopy(ep1Arr4, i2, ep1Arr4, i5, this.c - i2);
        }
        this.a[i2] = i;
        this.b[i2] = ep1;
        this.c++;
    }

    @Override // java.lang.Object
    public final /* synthetic */ Object clone() throws CloneNotSupportedException {
        int i = this.c;
        dp1 dp1 = new dp1(i);
        System.arraycopy(this.a, 0, dp1.a, 0, i);
        for (int i2 = 0; i2 < i; i2++) {
            ep1[] ep1Arr = this.b;
            if (ep1Arr[i2] != null) {
                dp1.b[i2] = (ep1) ep1Arr[i2].clone();
            }
        }
        dp1.c = i;
        return dp1;
    }

    public final ep1 d(int i) {
        int f = f(i);
        if (f < 0) {
            return null;
        }
        ep1[] ep1Arr = this.b;
        if (ep1Arr[f] == d) {
            return null;
        }
        return ep1Arr[f];
    }

    public final ep1 e(int i) {
        return this.b[i];
    }

    public final boolean equals(Object obj) {
        boolean z;
        boolean z2;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof dp1)) {
            return false;
        }
        dp1 dp1 = (dp1) obj;
        int i = this.c;
        if (i != dp1.c) {
            return false;
        }
        int[] iArr = this.a;
        int[] iArr2 = dp1.a;
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
            ep1[] ep1Arr = this.b;
            ep1[] ep1Arr2 = dp1.b;
            int i3 = this.c;
            int i4 = 0;
            while (true) {
                if (i4 >= i3) {
                    z2 = true;
                    break;
                } else if (!ep1Arr[i4].equals(ep1Arr2[i4])) {
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

    private dp1(int i) {
        int a2 = a(i);
        this.a = new int[a2];
        this.b = new ep1[a2];
        this.c = 0;
    }
}
