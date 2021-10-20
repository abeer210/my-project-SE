package defpackage;

import vigqyno.C0201;

/* renamed from: na2  reason: default package */
/* compiled from: ModulusPoly */
public final class na2 {
    private final ma2 a;
    private final int[] b;

    public na2(ma2 ma2, int[] iArr) {
        if (iArr.length != 0) {
            this.a = ma2;
            int length = iArr.length;
            if (length <= 1 || iArr[0] != 0) {
                this.b = iArr;
                return;
            }
            int i = 1;
            while (i < length && iArr[i] == 0) {
                i++;
            }
            if (i == length) {
                this.b = new int[]{0};
                return;
            }
            int[] iArr2 = new int[(length - i)];
            this.b = iArr2;
            System.arraycopy(iArr, i, iArr2, 0, iArr2.length);
            return;
        }
        throw new IllegalArgumentException();
    }

    public na2 a(na2 na2) {
        if (!this.a.equals(na2.a)) {
            throw new IllegalArgumentException(C0201.m82(26867));
        } else if (e()) {
            return na2;
        } else {
            if (na2.e()) {
                return this;
            }
            int[] iArr = this.b;
            int[] iArr2 = na2.b;
            if (iArr.length <= iArr2.length) {
                iArr = iArr2;
                iArr2 = iArr;
            }
            int[] iArr3 = new int[iArr.length];
            int length = iArr.length - iArr2.length;
            System.arraycopy(iArr, 0, iArr3, 0, length);
            for (int i = length; i < iArr.length; i++) {
                iArr3[i] = this.a.a(iArr2[i - length], iArr[i]);
            }
            return new na2(this.a, iArr3);
        }
    }

    public int b(int i) {
        if (i == 0) {
            return c(0);
        }
        if (i == 1) {
            int i2 = 0;
            for (int i3 : this.b) {
                i2 = this.a.a(i2, i3);
            }
            return i2;
        }
        int[] iArr = this.b;
        int i4 = iArr[0];
        int length = iArr.length;
        for (int i5 = 1; i5 < length; i5++) {
            ma2 ma2 = this.a;
            i4 = ma2.a(ma2.i(i, i4), this.b[i5]);
        }
        return i4;
    }

    public int c(int i) {
        int[] iArr = this.b;
        return iArr[(iArr.length - 1) - i];
    }

    public int d() {
        return this.b.length - 1;
    }

    public boolean e() {
        return this.b[0] == 0;
    }

    public na2 f(int i) {
        if (i == 0) {
            return this.a.f();
        }
        if (i == 1) {
            return this;
        }
        int length = this.b.length;
        int[] iArr = new int[length];
        for (int i2 = 0; i2 < length; i2++) {
            iArr[i2] = this.a.i(this.b[i2], i);
        }
        return new na2(this.a, iArr);
    }

    public na2 g(na2 na2) {
        if (!this.a.equals(na2.a)) {
            throw new IllegalArgumentException(C0201.m82(26868));
        } else if (e() || na2.e()) {
            return this.a.f();
        } else {
            int[] iArr = this.b;
            int length = iArr.length;
            int[] iArr2 = na2.b;
            int length2 = iArr2.length;
            int[] iArr3 = new int[((length + length2) - 1)];
            for (int i = 0; i < length; i++) {
                int i2 = iArr[i];
                for (int i3 = 0; i3 < length2; i3++) {
                    int i4 = i + i3;
                    ma2 ma2 = this.a;
                    iArr3[i4] = ma2.a(iArr3[i4], ma2.i(i2, iArr2[i3]));
                }
            }
            return new na2(this.a, iArr3);
        }
    }

    public na2 h(int i, int i2) {
        if (i < 0) {
            throw new IllegalArgumentException();
        } else if (i2 == 0) {
            return this.a.f();
        } else {
            int length = this.b.length;
            int[] iArr = new int[(i + length)];
            for (int i3 = 0; i3 < length; i3++) {
                iArr[i3] = this.a.i(this.b[i3], i2);
            }
            return new na2(this.a, iArr);
        }
    }

    public na2 i() {
        int length = this.b.length;
        int[] iArr = new int[length];
        for (int i = 0; i < length; i++) {
            iArr[i] = this.a.j(0, this.b[i]);
        }
        return new na2(this.a, iArr);
    }

    public na2 j(na2 na2) {
        if (!this.a.equals(na2.a)) {
            throw new IllegalArgumentException(C0201.m82(26869));
        } else if (na2.e()) {
            return this;
        } else {
            return a(na2.i());
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(d() * 8);
        for (int d = d(); d >= 0; d--) {
            int c = c(d);
            if (c != 0) {
                if (c < 0) {
                    sb.append(C0201.m82(26870));
                    c = -c;
                } else if (sb.length() > 0) {
                    sb.append(C0201.m82(26871));
                }
                if (d == 0 || c != 1) {
                    sb.append(c);
                }
                if (d != 0) {
                    if (d == 1) {
                        sb.append('x');
                    } else {
                        sb.append(C0201.m82(26872));
                        sb.append(d);
                    }
                }
            }
        }
        return sb.toString();
    }
}
