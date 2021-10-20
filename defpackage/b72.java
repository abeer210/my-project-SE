package defpackage;

import java.util.Arrays;

/* renamed from: b72  reason: default package */
/* compiled from: BitArray */
public final class b72 implements Cloneable {
    private int[] a;
    private int b;

    public b72() {
        this.b = 0;
        this.a = new int[1];
    }

    private static int[] j(int i) {
        return new int[((i + 31) / 32)];
    }

    public void a() {
        int length = this.a.length;
        for (int i = 0; i < length; i++) {
            this.a[i] = 0;
        }
    }

    /* renamed from: b */
    public b72 clone() {
        return new b72((int[]) this.a.clone(), this.b);
    }

    public boolean c(int i) {
        return ((1 << (i & 31)) & this.a[i / 32]) != 0;
    }

    public int[] d() {
        return this.a;
    }

    public int e(int i) {
        int i2 = this.b;
        if (i >= i2) {
            return i2;
        }
        int i3 = i / 32;
        int i4 = (((1 << (i & 31)) - 1) ^ -1) & this.a[i3];
        while (i4 == 0) {
            i3++;
            int[] iArr = this.a;
            if (i3 == iArr.length) {
                return this.b;
            }
            i4 = iArr[i3];
        }
        int numberOfTrailingZeros = (i3 << 5) + Integer.numberOfTrailingZeros(i4);
        int i5 = this.b;
        return numberOfTrailingZeros > i5 ? i5 : numberOfTrailingZeros;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof b72)) {
            return false;
        }
        b72 b72 = (b72) obj;
        if (this.b != b72.b || !Arrays.equals(this.a, b72.a)) {
            return false;
        }
        return true;
    }

    public int f(int i) {
        int i2 = this.b;
        if (i >= i2) {
            return i2;
        }
        int i3 = i / 32;
        int i4 = (((1 << (i & 31)) - 1) ^ -1) & (this.a[i3] ^ -1);
        while (i4 == 0) {
            i3++;
            int[] iArr = this.a;
            if (i3 == iArr.length) {
                return this.b;
            }
            i4 = iArr[i3] ^ -1;
        }
        int numberOfTrailingZeros = (i3 << 5) + Integer.numberOfTrailingZeros(i4);
        int i5 = this.b;
        return numberOfTrailingZeros > i5 ? i5 : numberOfTrailingZeros;
    }

    public int g() {
        return this.b;
    }

    public int hashCode() {
        return (this.b * 31) + Arrays.hashCode(this.a);
    }

    public boolean i(int i, int i2, boolean z) {
        if (i2 < i || i < 0 || i2 > this.b) {
            throw new IllegalArgumentException();
        } else if (i2 == i) {
            return true;
        } else {
            int i3 = i2 - 1;
            int i4 = i / 32;
            int i5 = i3 / 32;
            int i6 = i4;
            while (i6 <= i5) {
                int i7 = 31;
                int i8 = i6 > i4 ? 0 : i & 31;
                if (i6 >= i5) {
                    i7 = 31 & i3;
                }
                int i9 = (2 << i7) - (1 << i8);
                int i10 = this.a[i6] & i9;
                if (!z) {
                    i9 = 0;
                }
                if (i10 != i9) {
                    return false;
                }
                i6++;
            }
            return true;
        }
    }

    public void l() {
        int[] iArr = new int[this.a.length];
        int i = (this.b - 1) / 32;
        int i2 = i + 1;
        for (int i3 = 0; i3 < i2; i3++) {
            long j = (long) this.a[i3];
            long j2 = ((j & 1431655765) << 1) | ((j >> 1) & 1431655765);
            long j3 = ((j2 & 858993459) << 2) | ((j2 >> 2) & 858993459);
            long j4 = ((j3 & 252645135) << 4) | ((j3 >> 4) & 252645135);
            long j5 = ((j4 & 16711935) << 8) | ((j4 >> 8) & 16711935);
            iArr[i - i3] = (int) (((j5 & 65535) << 16) | ((j5 >> 16) & 65535));
        }
        int i4 = this.b;
        int i5 = i2 << 5;
        if (i4 != i5) {
            int i6 = i5 - i4;
            int i7 = iArr[0] >>> i6;
            for (int i8 = 1; i8 < i2; i8++) {
                int i9 = iArr[i8];
                iArr[i8 - 1] = i7 | (i9 << (32 - i6));
                i7 = i9 >>> i6;
            }
            iArr[i2 - 1] = i7;
        }
        this.a = iArr;
    }

    public void m(int i) {
        int[] iArr = this.a;
        int i2 = i / 32;
        iArr[i2] = (1 << (i & 31)) | iArr[i2];
    }

    public void n(int i, int i2) {
        this.a[i / 32] = i2;
    }

    public String toString() {
        int i = this.b;
        StringBuilder sb = new StringBuilder(i + (i / 8) + 1);
        for (int i2 = 0; i2 < this.b; i2++) {
            if ((i2 & 7) == 0) {
                sb.append(' ');
            }
            sb.append(c(i2) ? 'X' : '.');
        }
        return sb.toString();
    }

    public b72(int i) {
        this.b = i;
        this.a = j(i);
    }

    public b72(int[] iArr, int i) {
        this.a = iArr;
        this.b = i;
    }
}
