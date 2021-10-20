package defpackage;

import vigqyno.C0201;

/* renamed from: eb3  reason: default package */
/* compiled from: PolynomialGF2mSmallM */
public class eb3 {
    private xa3 a;
    private int b;
    private int[] c;

    public eb3(xa3 xa3, int i) {
        this.a = xa3;
        this.b = i;
        int[] iArr = new int[(i + 1)];
        this.c = iArr;
        iArr[i] = 1;
    }

    private int[] a(int[] iArr, int[] iArr2) {
        int[] iArr3;
        if (iArr.length < iArr2.length) {
            iArr3 = new int[iArr2.length];
            System.arraycopy(iArr2, 0, iArr3, 0, iArr2.length);
        } else {
            iArr3 = new int[iArr.length];
            System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            iArr = iArr2;
        }
        for (int length = iArr.length - 1; length >= 0; length--) {
            iArr3[length] = this.a.a(iArr3[length], iArr[length]);
        }
        return iArr3;
    }

    private static int c(int[] iArr) {
        int length = iArr.length - 1;
        while (length >= 0 && iArr[length] == 0) {
            length--;
        }
        return length;
    }

    private void d() {
        this.b = this.c.length - 1;
        while (true) {
            int i = this.b;
            if (i >= 0 && this.c[i] == 0) {
                this.b = i - 1;
            } else {
                return;
            }
        }
    }

    private static int i(int[] iArr) {
        int c2 = c(iArr);
        if (c2 == -1) {
            return 0;
        }
        return iArr[c2];
    }

    private static boolean j(int[] iArr, int[] iArr2) {
        int c2 = c(iArr);
        if (c2 != c(iArr2)) {
            return false;
        }
        for (int i = 0; i <= c2; i++) {
            if (iArr[i] != iArr2[i]) {
                return false;
            }
        }
        return true;
    }

    private int[] l(int[] iArr, int[] iArr2) {
        int c2 = c(iArr2);
        if (c2 != -1) {
            int length = iArr.length;
            int[] iArr3 = new int[length];
            int f = this.a.f(i(iArr2));
            System.arraycopy(iArr, 0, iArr3, 0, length);
            while (c2 <= c(iArr3)) {
                iArr3 = a(o(p(iArr2, c(iArr3) - c2), this.a.h(i(iArr3), f)), iArr3);
            }
            return iArr3;
        }
        throw new ArithmeticException(C0201.m82(19293));
    }

    private int[] o(int[] iArr, int i) {
        int c2 = c(iArr);
        if (c2 == -1 || i == 0) {
            return new int[1];
        }
        if (i == 1) {
            return za3.a(iArr);
        }
        int[] iArr2 = new int[(c2 + 1)];
        while (c2 >= 0) {
            iArr2[c2] = this.a.h(iArr[c2], i);
            c2--;
        }
        return iArr2;
    }

    private static int[] p(int[] iArr, int i) {
        int c2 = c(iArr);
        if (c2 == -1) {
            return new int[1];
        }
        int[] iArr2 = new int[(c2 + i + 1)];
        System.arraycopy(iArr, 0, iArr2, i, c2 + 1);
        return iArr2;
    }

    private static int[] q(int[] iArr) {
        int c2 = c(iArr);
        if (c2 == -1) {
            return new int[1];
        }
        int i = c2 + 1;
        if (iArr.length == i) {
            return za3.a(iArr);
        }
        int[] iArr2 = new int[i];
        System.arraycopy(iArr, 0, iArr2, 0, i);
        return iArr2;
    }

    public void b(eb3 eb3) {
        this.c = a(this.c, eb3.c);
        d();
    }

    public int e(int i) {
        int[] iArr = this.c;
        int i2 = this.b;
        int i3 = iArr[i2];
        for (int i4 = i2 - 1; i4 >= 0; i4--) {
            i3 = this.a.h(i3, i) ^ this.c[i4];
        }
        return i3;
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof eb3)) {
            eb3 eb3 = (eb3) obj;
            if (!this.a.equals(eb3.a) || this.b != eb3.b || !j(this.c, eb3.c)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public int f(int i) {
        if (i < 0 || i > this.b) {
            return 0;
        }
        return this.c[i];
    }

    public int g() {
        int[] iArr = this.c;
        int length = iArr.length - 1;
        if (iArr[length] == 0) {
            return -1;
        }
        return length;
    }

    public byte[] h() {
        int i = 8;
        int i2 = 1;
        while (this.a.d() > i) {
            i2++;
            i += 8;
        }
        byte[] bArr = new byte[(this.c.length * i2)];
        int i3 = 0;
        for (int i4 = 0; i4 < this.c.length; i4++) {
            int i5 = 0;
            while (i5 < i) {
                bArr[i3] = (byte) (this.c[i4] >>> i5);
                i5 += 8;
                i3++;
            }
        }
        return bArr;
    }

    public int hashCode() {
        int hashCode = this.a.hashCode();
        int i = 0;
        while (true) {
            int[] iArr = this.c;
            if (i >= iArr.length) {
                return hashCode;
            }
            hashCode = (hashCode * 31) + iArr[i];
            i++;
        }
    }

    public eb3 k(eb3 eb3) {
        return new eb3(this.a, l(this.c, eb3.c));
    }

    public void m(int i) {
        if (this.a.g(i)) {
            this.c = o(this.c, i);
            d();
            return;
        }
        throw new ArithmeticException(C0201.m82(19294));
    }

    public eb3 n(int i) {
        if (this.a.g(i)) {
            return new eb3(this.a, o(this.c, i));
        }
        throw new ArithmeticException(C0201.m82(19295));
    }

    public String toString() {
        String str = C0201.m82(19296) + this.a.toString() + C0201.m82(19297);
        for (int i = 0; i < this.c.length; i++) {
            str = str + this.a.b(this.c[i]) + C0201.m82(19298) + i + C0201.m82(19299);
        }
        return str + C0201.m82(19300);
    }

    public eb3(xa3 xa3, int[] iArr) {
        this.a = xa3;
        this.c = q(iArr);
        d();
    }

    public eb3(xa3 xa3, byte[] bArr) {
        this.a = xa3;
        int i = 8;
        int i2 = 1;
        while (xa3.d() > i) {
            i2++;
            i += 8;
        }
        int length = bArr.length % i2;
        String r3 = C0201.m82(19292);
        if (length == 0) {
            this.c = new int[(bArr.length / i2)];
            int i3 = 0;
            int i4 = 0;
            while (true) {
                int[] iArr = this.c;
                if (i3 < iArr.length) {
                    int i5 = 0;
                    while (i5 < i) {
                        int[] iArr2 = this.c;
                        iArr2[i3] = ((bArr[i4] & 255) << i5) ^ iArr2[i3];
                        i5 += 8;
                        i4++;
                    }
                    if (this.a.g(this.c[i3])) {
                        i3++;
                    } else {
                        throw new IllegalArgumentException(r3);
                    }
                } else if (iArr.length == 1 || iArr[iArr.length - 1] != 0) {
                    d();
                    return;
                } else {
                    throw new IllegalArgumentException(r3);
                }
            }
        } else {
            throw new IllegalArgumentException(r3);
        }
    }

    public eb3(eb3 eb3) {
        this.a = eb3.a;
        this.b = eb3.b;
        this.c = za3.a(eb3.c);
    }
}
