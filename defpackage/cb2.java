package defpackage;

import java.util.ArrayList;
import java.util.List;

/* renamed from: cb2  reason: default package */
/* compiled from: AlignmentPatternFinder */
public final class cb2 {
    private final c72 a;
    private final List<bb2> b = new ArrayList(5);
    private final int c;
    private final int d;
    private final int e;
    private final int f;
    private final float g;
    private final int[] h;
    private final w62 i;

    public cb2(c72 c72, int i2, int i3, int i4, int i5, float f2, w62 w62) {
        this.a = c72;
        this.c = i2;
        this.d = i3;
        this.e = i4;
        this.f = i5;
        this.g = f2;
        this.h = new int[3];
        this.i = w62;
    }

    private static float a(int[] iArr, int i2) {
        return ((float) (i2 - iArr[2])) - (((float) iArr[1]) / 2.0f);
    }

    private float b(int i2, int i3, int i4, int i5) {
        c72 c72 = this.a;
        int g2 = c72.g();
        int[] iArr = this.h;
        iArr[0] = 0;
        iArr[1] = 0;
        iArr[2] = 0;
        int i6 = i2;
        while (i6 >= 0 && c72.d(i3, i6) && iArr[1] <= i4) {
            iArr[1] = iArr[1] + 1;
            i6--;
        }
        if (i6 >= 0 && iArr[1] <= i4) {
            while (i6 >= 0 && !c72.d(i3, i6) && iArr[0] <= i4) {
                iArr[0] = iArr[0] + 1;
                i6--;
            }
            if (iArr[0] > i4) {
                return Float.NaN;
            }
            int i7 = i2 + 1;
            while (i7 < g2 && c72.d(i3, i7) && iArr[1] <= i4) {
                iArr[1] = iArr[1] + 1;
                i7++;
            }
            if (i7 != g2 && iArr[1] <= i4) {
                while (i7 < g2 && !c72.d(i3, i7) && iArr[2] <= i4) {
                    iArr[2] = iArr[2] + 1;
                    i7++;
                }
                if (iArr[2] <= i4 && Math.abs(((iArr[0] + iArr[1]) + iArr[2]) - i5) * 5 < i5 * 2 && d(iArr)) {
                    return a(iArr, i7);
                }
            }
        }
        return Float.NaN;
    }

    private boolean d(int[] iArr) {
        float f2 = this.g;
        float f3 = f2 / 2.0f;
        for (int i2 = 0; i2 < 3; i2++) {
            if (Math.abs(f2 - ((float) iArr[i2])) >= f3) {
                return false;
            }
        }
        return true;
    }

    private bb2 e(int[] iArr, int i2, int i3) {
        int i4 = iArr[0] + iArr[1] + iArr[2];
        float a2 = a(iArr, i3);
        float b2 = b(i2, (int) a2, iArr[1] * 2, i4);
        if (Float.isNaN(b2)) {
            return null;
        }
        float f2 = ((float) ((iArr[0] + iArr[1]) + iArr[2])) / 3.0f;
        for (bb2 bb2 : this.b) {
            if (bb2.f(f2, b2, a2)) {
                return bb2.g(b2, a2, f2);
            }
        }
        bb2 bb22 = new bb2(a2, b2, f2);
        this.b.add(bb22);
        w62 w62 = this.i;
        if (w62 == null) {
            return null;
        }
        w62.a(bb22);
        return null;
    }

    public bb2 c() throws o62 {
        bb2 e2;
        bb2 e3;
        int i2 = this.c;
        int i3 = this.f;
        int i4 = this.e + i2;
        int i5 = this.d + (i3 / 2);
        int[] iArr = new int[3];
        for (int i6 = 0; i6 < i3; i6++) {
            int i7 = ((i6 & 1) == 0 ? (i6 + 1) / 2 : -((i6 + 1) / 2)) + i5;
            iArr[0] = 0;
            iArr[1] = 0;
            iArr[2] = 0;
            int i8 = i2;
            while (i8 < i4 && !this.a.d(i8, i7)) {
                i8++;
            }
            int i9 = 0;
            while (i8 < i4) {
                if (!this.a.d(i8, i7)) {
                    if (i9 == 1) {
                        i9++;
                    }
                    iArr[i9] = iArr[i9] + 1;
                } else if (i9 == 1) {
                    iArr[1] = iArr[1] + 1;
                } else if (i9 != 2) {
                    i9++;
                    iArr[i9] = iArr[i9] + 1;
                } else if (d(iArr) && (e3 = e(iArr, i7, i8)) != null) {
                    return e3;
                } else {
                    iArr[0] = iArr[2];
                    iArr[1] = 1;
                    iArr[2] = 0;
                    i9 = 1;
                }
                i8++;
            }
            if (d(iArr) && (e2 = e(iArr, i7, i4)) != null) {
                return e2;
            }
        }
        if (!this.b.isEmpty()) {
            return this.b.get(0);
        }
        throw o62.a();
    }
}
