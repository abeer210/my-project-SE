package defpackage;

import vigqyno.C0201;

/* renamed from: q72  reason: default package */
/* compiled from: GenericGFPoly */
public final class q72 {
    private final p72 a;
    private final int[] b;

    public q72(p72 p72, int[] iArr) {
        if (iArr.length != 0) {
            this.a = p72;
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

    public q72 a(q72 q72) {
        if (!this.a.equals(q72.a)) {
            throw new IllegalArgumentException(C0201.m82(25513));
        } else if (e()) {
            return q72;
        } else {
            if (q72.e()) {
                return this;
            }
            int[] iArr = this.b;
            int[] iArr2 = q72.b;
            if (iArr.length <= iArr2.length) {
                iArr = iArr2;
                iArr2 = iArr;
            }
            int[] iArr3 = new int[iArr.length];
            int length = iArr.length - iArr2.length;
            System.arraycopy(iArr, 0, iArr3, 0, length);
            for (int i = length; i < iArr.length; i++) {
                iArr3[i] = p72.a(iArr2[i - length], iArr[i]);
            }
            return new q72(this.a, iArr3);
        }
    }

    public int b(int i) {
        if (i == 0) {
            return c(0);
        }
        if (i == 1) {
            int i2 = 0;
            for (int i3 : this.b) {
                i2 = p72.a(i2, i3);
            }
            return i2;
        }
        int[] iArr = this.b;
        int i4 = iArr[0];
        int length = iArr.length;
        for (int i5 = 1; i5 < length; i5++) {
            i4 = p72.a(this.a.j(i, i4), this.b[i5]);
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

    public q72 f(int i) {
        if (i == 0) {
            return this.a.g();
        }
        if (i == 1) {
            return this;
        }
        int length = this.b.length;
        int[] iArr = new int[length];
        for (int i2 = 0; i2 < length; i2++) {
            iArr[i2] = this.a.j(this.b[i2], i);
        }
        return new q72(this.a, iArr);
    }

    public q72 g(q72 q72) {
        if (!this.a.equals(q72.a)) {
            throw new IllegalArgumentException(C0201.m82(25514));
        } else if (e() || q72.e()) {
            return this.a.g();
        } else {
            int[] iArr = this.b;
            int length = iArr.length;
            int[] iArr2 = q72.b;
            int length2 = iArr2.length;
            int[] iArr3 = new int[((length + length2) - 1)];
            for (int i = 0; i < length; i++) {
                int i2 = iArr[i];
                for (int i3 = 0; i3 < length2; i3++) {
                    int i4 = i + i3;
                    iArr3[i4] = p72.a(iArr3[i4], this.a.j(i2, iArr2[i3]));
                }
            }
            return new q72(this.a, iArr3);
        }
    }

    public q72 h(int i, int i2) {
        if (i < 0) {
            throw new IllegalArgumentException();
        } else if (i2 == 0) {
            return this.a.g();
        } else {
            int length = this.b.length;
            int[] iArr = new int[(i + length)];
            for (int i3 = 0; i3 < length; i3++) {
                iArr[i3] = this.a.j(this.b[i3], i2);
            }
            return new q72(this.a, iArr);
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(d() * 8);
        for (int d = d(); d >= 0; d--) {
            int c = c(d);
            if (c != 0) {
                if (c < 0) {
                    sb.append(C0201.m82(25515));
                    c = -c;
                } else if (sb.length() > 0) {
                    sb.append(C0201.m82(25516));
                }
                if (d == 0 || c != 1) {
                    int i = this.a.i(c);
                    if (i == 0) {
                        sb.append('1');
                    } else if (i == 1) {
                        sb.append('a');
                    } else {
                        sb.append(C0201.m82(25517));
                        sb.append(i);
                    }
                }
                if (d != 0) {
                    if (d == 1) {
                        sb.append('x');
                    } else {
                        sb.append(C0201.m82(25518));
                        sb.append(d);
                    }
                }
            }
        }
        return sb.toString();
    }
}
