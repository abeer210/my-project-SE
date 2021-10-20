package defpackage;

/* renamed from: id1  reason: default package */
public final class id1 implements Cloneable {
    private static final hd1 d = new hd1();
    private int[] a;
    private hd1[] b;
    private int c;

    public id1() {
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

    private final int g(int i) {
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

    public final boolean b() {
        return this.c == 0;
    }

    public final int c() {
        return this.c;
    }

    @Override // java.lang.Object
    public final /* synthetic */ Object clone() throws CloneNotSupportedException {
        int i = this.c;
        id1 id1 = new id1(i);
        System.arraycopy(this.a, 0, id1.a, 0, i);
        for (int i2 = 0; i2 < i; i2++) {
            hd1[] hd1Arr = this.b;
            if (hd1Arr[i2] != null) {
                id1.b[i2] = (hd1) hd1Arr[i2].clone();
            }
        }
        id1.c = i;
        return id1;
    }

    public final void d(int i, hd1 hd1) {
        int g = g(i);
        if (g >= 0) {
            this.b[g] = hd1;
            return;
        }
        int i2 = g ^ -1;
        if (i2 < this.c) {
            hd1[] hd1Arr = this.b;
            if (hd1Arr[i2] == d) {
                this.a[i2] = i;
                hd1Arr[i2] = hd1;
                return;
            }
        }
        int i3 = this.c;
        if (i3 >= this.a.length) {
            int a2 = a(i3 + 1);
            int[] iArr = new int[a2];
            hd1[] hd1Arr2 = new hd1[a2];
            int[] iArr2 = this.a;
            System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            hd1[] hd1Arr3 = this.b;
            System.arraycopy(hd1Arr3, 0, hd1Arr2, 0, hd1Arr3.length);
            this.a = iArr;
            this.b = hd1Arr2;
        }
        int i4 = this.c;
        if (i4 - i2 != 0) {
            int[] iArr3 = this.a;
            int i5 = i2 + 1;
            System.arraycopy(iArr3, i2, iArr3, i5, i4 - i2);
            hd1[] hd1Arr4 = this.b;
            System.arraycopy(hd1Arr4, i2, hd1Arr4, i5, this.c - i2);
        }
        this.a[i2] = i;
        this.b[i2] = hd1;
        this.c++;
    }

    public final hd1 e(int i) {
        int g = g(i);
        if (g < 0) {
            return null;
        }
        hd1[] hd1Arr = this.b;
        if (hd1Arr[g] == d) {
            return null;
        }
        return hd1Arr[g];
    }

    public final boolean equals(Object obj) {
        boolean z;
        boolean z2;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof id1)) {
            return false;
        }
        id1 id1 = (id1) obj;
        int i = this.c;
        if (i != id1.c) {
            return false;
        }
        int[] iArr = this.a;
        int[] iArr2 = id1.a;
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
            hd1[] hd1Arr = this.b;
            hd1[] hd1Arr2 = id1.b;
            int i3 = this.c;
            int i4 = 0;
            while (true) {
                if (i4 >= i3) {
                    z2 = true;
                    break;
                } else if (!hd1Arr[i4].equals(hd1Arr2[i4])) {
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

    public final hd1 f(int i) {
        return this.b[i];
    }

    public final int hashCode() {
        int i = 17;
        for (int i2 = 0; i2 < this.c; i2++) {
            i = (((i * 31) + this.a[i2]) * 31) + this.b[i2].hashCode();
        }
        return i;
    }

    private id1(int i) {
        int a2 = a(i);
        this.a = new int[a2];
        this.b = new hd1[a2];
        this.c = 0;
    }
}
