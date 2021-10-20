package defpackage;

import java.util.Arrays;
import vigqyno.C0201;

/* renamed from: ry2  reason: default package */
/* compiled from: SegmentedByteString */
public final class ry2 extends dy2 {
    public final transient byte[][] f;
    public final transient int[] g;

    public ry2(ay2 ay2, int i) {
        super(null);
        vy2.b(ay2.b, 0, (long) i);
        py2 py2 = ay2.a;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i3 < i) {
            int i5 = py2.c;
            int i6 = py2.b;
            if (i5 != i6) {
                i3 += i5 - i6;
                i4++;
                py2 = py2.f;
            } else {
                throw new AssertionError(C0201.m82(18444));
            }
        }
        this.f = new byte[i4][];
        this.g = new int[(i4 * 2)];
        py2 py22 = ay2.a;
        int i7 = 0;
        while (i2 < i) {
            this.f[i7] = py22.a;
            i2 += py22.c - py22.b;
            if (i2 > i) {
                i2 = i;
            }
            int[] iArr = this.g;
            iArr[i7] = i2;
            iArr[this.f.length + i7] = py22.b;
            py22.d = true;
            i7++;
            py22 = py22.f;
        }
    }

    private int L(int i) {
        int binarySearch = Arrays.binarySearch(this.g, 0, this.f.length, i + 1);
        return binarySearch >= 0 ? binarySearch : binarySearch ^ -1;
    }

    private dy2 M() {
        return new dy2(I());
    }

    @Override // defpackage.dy2
    public int A() {
        return this.g[this.f.length - 1];
    }

    @Override // defpackage.dy2
    public dy2 E(int i, int i2) {
        return M().E(i, i2);
    }

    @Override // defpackage.dy2
    public dy2 H() {
        return M().H();
    }

    @Override // defpackage.dy2
    public byte[] I() {
        int[] iArr = this.g;
        byte[][] bArr = this.f;
        byte[] bArr2 = new byte[iArr[bArr.length - 1]];
        int length = bArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int[] iArr2 = this.g;
            int i3 = iArr2[length + i];
            int i4 = iArr2[i];
            System.arraycopy(this.f[i], i3, bArr2, i2, i4 - i2);
            i++;
            i2 = i4;
        }
        return bArr2;
    }

    @Override // defpackage.dy2
    public String J() {
        return M().J();
    }

    @Override // defpackage.dy2
    public void K(ay2 ay2) {
        int length = this.f.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int[] iArr = this.g;
            int i3 = iArr[length + i];
            int i4 = iArr[i];
            py2 py2 = new py2(this.f[i], i3, (i3 + i4) - i2, true, false);
            py2 py22 = ay2.a;
            if (py22 == null) {
                py2.g = py2;
                py2.f = py2;
                ay2.a = py2;
            } else {
                py22.g.c(py2);
            }
            i++;
            i2 = i4;
        }
        ay2.b += (long) i2;
    }

    @Override // defpackage.dy2
    public String b() {
        return M().b();
    }

    @Override // defpackage.dy2
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dy2) {
            dy2 dy2 = (dy2) obj;
            if (dy2.A() != A() || !r(0, dy2, 0, A())) {
                return false;
            }
            return true;
        }
        return false;
    }

    @Override // defpackage.dy2
    public int hashCode() {
        int i = this.b;
        if (i != 0) {
            return i;
        }
        int length = this.f.length;
        int i2 = 0;
        int i3 = 0;
        int i4 = 1;
        while (i2 < length) {
            byte[] bArr = this.f[i2];
            int[] iArr = this.g;
            int i5 = iArr[length + i2];
            int i6 = iArr[i2];
            int i7 = (i6 - i3) + i5;
            while (i5 < i7) {
                i4 = (i4 * 31) + bArr[i5];
                i5++;
            }
            i2++;
            i3 = i6;
        }
        this.b = i4;
        return i4;
    }

    @Override // defpackage.dy2
    public byte l(int i) {
        int i2;
        vy2.b((long) this.g[this.f.length - 1], (long) i, 1);
        int L = L(i);
        if (L == 0) {
            i2 = 0;
        } else {
            i2 = this.g[L - 1];
        }
        int[] iArr = this.g;
        byte[][] bArr = this.f;
        return bArr[L][(i - i2) + iArr[bArr.length + L]];
    }

    @Override // defpackage.dy2
    public String m() {
        return M().m();
    }

    @Override // defpackage.dy2
    public byte[] n() {
        return I();
    }

    @Override // defpackage.dy2
    public dy2 p() {
        return M().p();
    }

    @Override // defpackage.dy2
    public boolean r(int i, dy2 dy2, int i2, int i3) {
        int i4;
        if (i < 0 || i > A() - i3) {
            return false;
        }
        int L = L(i);
        while (i3 > 0) {
            if (L == 0) {
                i4 = 0;
            } else {
                i4 = this.g[L - 1];
            }
            int min = Math.min(i3, ((this.g[L] - i4) + i4) - i);
            int[] iArr = this.g;
            byte[][] bArr = this.f;
            if (!dy2.t(i2, bArr[L], (i - i4) + iArr[bArr.length + L], min)) {
                return false;
            }
            i += min;
            i2 += min;
            i3 -= min;
            L++;
        }
        return true;
    }

    @Override // defpackage.dy2
    public boolean t(int i, byte[] bArr, int i2, int i3) {
        int i4;
        if (i < 0 || i > A() - i3 || i2 < 0 || i2 > bArr.length - i3) {
            return false;
        }
        int L = L(i);
        while (i3 > 0) {
            if (L == 0) {
                i4 = 0;
            } else {
                i4 = this.g[L - 1];
            }
            int min = Math.min(i3, ((this.g[L] - i4) + i4) - i);
            int[] iArr = this.g;
            byte[][] bArr2 = this.f;
            if (!vy2.a(bArr2[L], (i - i4) + iArr[bArr2.length + L], bArr, i2, min)) {
                return false;
            }
            i += min;
            i2 += min;
            i3 -= min;
            L++;
        }
        return true;
    }

    @Override // defpackage.dy2
    public String toString() {
        return M().toString();
    }

    @Override // defpackage.dy2
    public dy2 v() {
        return M().v();
    }

    @Override // defpackage.dy2
    public dy2 x() {
        return M().x();
    }
}
