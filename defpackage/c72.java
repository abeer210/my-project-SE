package defpackage;

import java.util.Arrays;
import vigqyno.C0201;

/* renamed from: c72  reason: default package */
/* compiled from: BitMatrix */
public final class c72 implements Cloneable {
    private final int a;
    private final int b;
    private final int c;
    private final int[] d;

    public c72(int i) {
        this(i, i);
    }

    private String a(String str, String str2, String str3) {
        StringBuilder sb = new StringBuilder(this.b * (this.a + 1));
        for (int i = 0; i < this.b; i++) {
            for (int i2 = 0; i2 < this.a; i2++) {
                sb.append(d(i2, i) ? str : str2);
            }
            sb.append(str3);
        }
        return sb.toString();
    }

    /* renamed from: b */
    public c72 clone() {
        return new c72(this.a, this.b, this.c, (int[]) this.d.clone());
    }

    public void c(int i, int i2) {
        int i3 = (i2 * this.c) + (i / 32);
        int[] iArr = this.d;
        iArr[i3] = (1 << (i & 31)) ^ iArr[i3];
    }

    public boolean d(int i, int i2) {
        return ((this.d[(i2 * this.c) + (i / 32)] >>> (i & 31)) & 1) != 0;
    }

    public int[] e() {
        int length = this.d.length - 1;
        while (length >= 0 && this.d[length] == 0) {
            length--;
        }
        if (length < 0) {
            return null;
        }
        int i = this.c;
        int i2 = length / i;
        int i3 = (length % i) << 5;
        int i4 = 31;
        while ((this.d[length] >>> i4) == 0) {
            i4--;
        }
        return new int[]{i3 + i4, i2};
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof c72)) {
            return false;
        }
        c72 c72 = (c72) obj;
        if (this.a == c72.a && this.b == c72.b && this.c == c72.c && Arrays.equals(this.d, c72.d)) {
            return true;
        }
        return false;
    }

    public int[] f() {
        int i = this.a;
        int i2 = this.b;
        int i3 = -1;
        int i4 = -1;
        for (int i5 = 0; i5 < this.b; i5++) {
            int i6 = 0;
            while (true) {
                int i7 = this.c;
                if (i6 >= i7) {
                    break;
                }
                int i8 = this.d[(i7 * i5) + i6];
                if (i8 != 0) {
                    if (i5 < i2) {
                        i2 = i5;
                    }
                    if (i5 > i4) {
                        i4 = i5;
                    }
                    int i9 = i6 << 5;
                    if (i9 < i) {
                        int i10 = 0;
                        while ((i8 << (31 - i10)) == 0) {
                            i10++;
                        }
                        int i11 = i10 + i9;
                        if (i11 < i) {
                            i = i11;
                        }
                    }
                    if (i9 + 31 > i3) {
                        int i12 = 31;
                        while ((i8 >>> i12) == 0) {
                            i12--;
                        }
                        int i13 = i9 + i12;
                        if (i13 > i3) {
                            i3 = i13;
                        }
                    }
                }
                i6++;
            }
        }
        if (i3 < i || i4 < i2) {
            return null;
        }
        return new int[]{i, i2, (i3 - i) + 1, (i4 - i2) + 1};
    }

    public int g() {
        return this.b;
    }

    public int hashCode() {
        int i = this.a;
        return (((((((i * 31) + i) * 31) + this.b) * 31) + this.c) * 31) + Arrays.hashCode(this.d);
    }

    public b72 i(int i, b72 b72) {
        if (b72 == null || b72.g() < this.a) {
            b72 = new b72(this.a);
        } else {
            b72.a();
        }
        int i2 = i * this.c;
        for (int i3 = 0; i3 < this.c; i3++) {
            b72.n(i3 << 5, this.d[i2 + i3]);
        }
        return b72;
    }

    public int[] j() {
        int i = 0;
        while (true) {
            int[] iArr = this.d;
            if (i >= iArr.length || iArr[i] != 0) {
                int[] iArr2 = this.d;
            } else {
                i++;
            }
        }
        int[] iArr22 = this.d;
        if (i == iArr22.length) {
            return null;
        }
        int i2 = this.c;
        int i3 = i / i2;
        int i4 = (i % i2) << 5;
        int i5 = iArr22[i];
        int i6 = 0;
        while ((i5 << (31 - i6)) == 0) {
            i6++;
        }
        return new int[]{i4 + i6, i3};
    }

    public int l() {
        return this.a;
    }

    public void m() {
        int l = l();
        int g = g();
        b72 b72 = new b72(l);
        b72 b722 = new b72(l);
        for (int i = 0; i < (g + 1) / 2; i++) {
            b72 = i(i, b72);
            int i2 = (g - 1) - i;
            b722 = i(i2, b722);
            b72.l();
            b722.l();
            q(i, b722);
            q(i2, b72);
        }
    }

    public void n(int i, int i2) {
        int i3 = (i2 * this.c) + (i / 32);
        int[] iArr = this.d;
        iArr[i3] = (1 << (i & 31)) | iArr[i3];
    }

    public void o(int i, int i2, int i3, int i4) {
        if (i2 < 0 || i < 0) {
            throw new IllegalArgumentException(C0201.m82(7664));
        } else if (i4 <= 0 || i3 <= 0) {
            throw new IllegalArgumentException(C0201.m82(7663));
        } else {
            int i5 = i3 + i;
            int i6 = i4 + i2;
            if (i6 > this.b || i5 > this.a) {
                throw new IllegalArgumentException(C0201.m82(7662));
            }
            while (i2 < i6) {
                int i7 = this.c * i2;
                for (int i8 = i; i8 < i5; i8++) {
                    int[] iArr = this.d;
                    int i9 = (i8 / 32) + i7;
                    iArr[i9] = iArr[i9] | (1 << (i8 & 31));
                }
                i2++;
            }
        }
    }

    public void q(int i, b72 b72) {
        int[] d2 = b72.d();
        int[] iArr = this.d;
        int i2 = this.c;
        System.arraycopy(d2, 0, iArr, i * i2, i2);
    }

    public String s(String str, String str2) {
        return a(str, str2, C0201.m82(7665));
    }

    public String toString() {
        return s(C0201.m82(7666), C0201.m82(7667));
    }

    public c72(int i, int i2) {
        if (i <= 0 || i2 <= 0) {
            throw new IllegalArgumentException(C0201.m82(7661));
        }
        this.a = i;
        this.b = i2;
        int i3 = (i + 31) / 32;
        this.c = i3;
        this.d = new int[(i3 * i2)];
    }

    private c72(int i, int i2, int i3, int[] iArr) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = iArr;
    }
}
