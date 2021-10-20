package defpackage;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;

/* renamed from: fb2  reason: default package */
/* compiled from: FinderPatternFinder */
public class fb2 {
    private final c72 a;
    private final List<eb2> b = new ArrayList();
    private boolean c;
    private final int[] d = new int[5];
    private final w62 e;

    /* access modifiers changed from: private */
    /* renamed from: fb2$b */
    /* compiled from: FinderPatternFinder */
    public static final class b implements Serializable, Comparator<eb2> {
        private final float a;

        /* renamed from: a */
        public int compare(eb2 eb2, eb2 eb22) {
            int compare = Integer.compare(eb22.h(), eb2.h());
            return compare == 0 ? Float.compare(Math.abs(eb2.i() - this.a), Math.abs(eb22.i() - this.a)) : compare;
        }

        private b(float f) {
            this.a = f;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: fb2$c */
    /* compiled from: FinderPatternFinder */
    public static final class c implements Serializable, Comparator<eb2> {
        private final float a;

        /* renamed from: a */
        public int compare(eb2 eb2, eb2 eb22) {
            return Float.compare(Math.abs(eb22.i() - this.a), Math.abs(eb2.i() - this.a));
        }

        private c(float f) {
            this.a = f;
        }
    }

    public fb2(c72 c72, w62 w62) {
        this.a = c72;
        this.e = w62;
    }

    private static float a(int[] iArr, int i) {
        return ((float) ((i - iArr[4]) - iArr[3])) - (((float) iArr[2]) / 2.0f);
    }

    private boolean c(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int[] j = j();
        int i6 = 0;
        while (i >= i6 && i2 >= i6 && this.a.d(i2 - i6, i - i6)) {
            j[2] = j[2] + 1;
            i6++;
        }
        if (j[2] == 0) {
            return false;
        }
        while (i >= i6 && i2 >= i6 && !this.a.d(i2 - i6, i - i6)) {
            j[1] = j[1] + 1;
            i6++;
        }
        if (j[1] == 0) {
            return false;
        }
        while (i >= i6 && i2 >= i6 && this.a.d(i2 - i6, i - i6)) {
            j[0] = j[0] + 1;
            i6++;
        }
        if (j[0] == 0) {
            return false;
        }
        int g = this.a.g();
        int l = this.a.l();
        int i7 = 1;
        while (true) {
            int i8 = i + i7;
            if (i8 < g && (i5 = i2 + i7) < l && this.a.d(i5, i8)) {
                j[2] = j[2] + 1;
                i7++;
            }
        }
        while (true) {
            int i9 = i + i7;
            if (i9 < g && (i4 = i2 + i7) < l && !this.a.d(i4, i9)) {
                j[3] = j[3] + 1;
                i7++;
            }
        }
        if (j[3] == 0) {
            return false;
        }
        while (true) {
            int i10 = i + i7;
            if (i10 < g && (i3 = i2 + i7) < l && this.a.d(i3, i10)) {
                j[4] = j[4] + 1;
                i7++;
            }
        }
        if (j[4] == 0) {
            return false;
        }
        return i(j);
    }

    private float d(int i, int i2, int i3, int i4) {
        c72 c72 = this.a;
        int l = c72.l();
        int[] j = j();
        int i5 = i;
        while (i5 >= 0 && c72.d(i5, i2)) {
            j[2] = j[2] + 1;
            i5--;
        }
        if (i5 < 0) {
            return Float.NaN;
        }
        while (i5 >= 0 && !c72.d(i5, i2) && j[1] <= i3) {
            j[1] = j[1] + 1;
            i5--;
        }
        if (i5 >= 0 && j[1] <= i3) {
            while (i5 >= 0 && c72.d(i5, i2) && j[0] <= i3) {
                j[0] = j[0] + 1;
                i5--;
            }
            if (j[0] > i3) {
                return Float.NaN;
            }
            int i6 = i + 1;
            while (i6 < l && c72.d(i6, i2)) {
                j[2] = j[2] + 1;
                i6++;
            }
            if (i6 == l) {
                return Float.NaN;
            }
            while (i6 < l && !c72.d(i6, i2) && j[3] < i3) {
                j[3] = j[3] + 1;
                i6++;
            }
            if (i6 != l && j[3] < i3) {
                while (i6 < l && c72.d(i6, i2) && j[4] < i3) {
                    j[4] = j[4] + 1;
                    i6++;
                }
                if (j[4] < i3 && Math.abs(((((j[0] + j[1]) + j[2]) + j[3]) + j[4]) - i4) * 5 < i4 && h(j)) {
                    return a(j, i6);
                }
            }
        }
        return Float.NaN;
    }

    private float e(int i, int i2, int i3, int i4) {
        c72 c72 = this.a;
        int g = c72.g();
        int[] j = j();
        int i5 = i;
        while (i5 >= 0 && c72.d(i2, i5)) {
            j[2] = j[2] + 1;
            i5--;
        }
        if (i5 < 0) {
            return Float.NaN;
        }
        while (i5 >= 0 && !c72.d(i2, i5) && j[1] <= i3) {
            j[1] = j[1] + 1;
            i5--;
        }
        if (i5 >= 0 && j[1] <= i3) {
            while (i5 >= 0 && c72.d(i2, i5) && j[0] <= i3) {
                j[0] = j[0] + 1;
                i5--;
            }
            if (j[0] > i3) {
                return Float.NaN;
            }
            int i6 = i + 1;
            while (i6 < g && c72.d(i2, i6)) {
                j[2] = j[2] + 1;
                i6++;
            }
            if (i6 == g) {
                return Float.NaN;
            }
            while (i6 < g && !c72.d(i2, i6) && j[3] < i3) {
                j[3] = j[3] + 1;
                i6++;
            }
            if (i6 != g && j[3] < i3) {
                while (i6 < g && c72.d(i2, i6) && j[4] < i3) {
                    j[4] = j[4] + 1;
                    i6++;
                }
                if (j[4] < i3 && Math.abs(((((j[0] + j[1]) + j[2]) + j[3]) + j[4]) - i4) * 5 < i4 * 2 && h(j)) {
                    return a(j, i6);
                }
            }
        }
        return Float.NaN;
    }

    private int g() {
        if (this.b.size() <= 1) {
            return 0;
        }
        eb2 eb2 = null;
        for (eb2 eb22 : this.b) {
            if (eb22.h() >= 2) {
                if (eb2 == null) {
                    eb2 = eb22;
                } else {
                    this.c = true;
                    return ((int) (Math.abs(eb2.c() - eb22.c()) - Math.abs(eb2.d() - eb22.d()))) / 2;
                }
            }
        }
        return 0;
    }

    public static boolean h(int[] iArr) {
        int i = 0;
        for (int i2 = 0; i2 < 5; i2++) {
            int i3 = iArr[i2];
            if (i3 == 0) {
                return false;
            }
            i += i3;
        }
        if (i < 7) {
            return false;
        }
        float f = ((float) i) / 7.0f;
        float f2 = f / 2.0f;
        if (Math.abs(f - ((float) iArr[0])) >= f2 || Math.abs(f - ((float) iArr[1])) >= f2 || Math.abs((f * 3.0f) - ((float) iArr[2])) >= 3.0f * f2 || Math.abs(f - ((float) iArr[3])) >= f2 || Math.abs(f - ((float) iArr[4])) >= f2) {
            return false;
        }
        return true;
    }

    public static boolean i(int[] iArr) {
        int i = 0;
        for (int i2 = 0; i2 < 5; i2++) {
            int i3 = iArr[i2];
            if (i3 == 0) {
                return false;
            }
            i += i3;
        }
        if (i < 7) {
            return false;
        }
        float f = ((float) i) / 7.0f;
        float f2 = f / 1.333f;
        if (Math.abs(f - ((float) iArr[0])) >= f2 || Math.abs(f - ((float) iArr[1])) >= f2 || Math.abs((f * 3.0f) - ((float) iArr[2])) >= 3.0f * f2 || Math.abs(f - ((float) iArr[3])) >= f2 || Math.abs(f - ((float) iArr[4])) >= f2) {
            return false;
        }
        return true;
    }

    private int[] j() {
        b(this.d);
        return this.d;
    }

    private boolean l() {
        int size = this.b.size();
        float f = 0.0f;
        int i = 0;
        float f2 = 0.0f;
        for (eb2 eb2 : this.b) {
            if (eb2.h() >= 2) {
                i++;
                f2 += eb2.i();
            }
        }
        if (i < 3) {
            return false;
        }
        float f3 = f2 / ((float) size);
        for (eb2 eb22 : this.b) {
            f += Math.abs(eb22.i() - f3);
        }
        if (f <= f2 * 0.05f) {
            return true;
        }
        return false;
    }

    private eb2[] m() throws o62 {
        int size = this.b.size();
        if (size >= 3) {
            float f = 0.0f;
            if (size > 3) {
                float f2 = 0.0f;
                float f3 = 0.0f;
                for (eb2 eb2 : this.b) {
                    float i = eb2.i();
                    f2 += i;
                    f3 += i * i;
                }
                float f4 = (float) size;
                float f5 = f2 / f4;
                float sqrt = (float) Math.sqrt((double) ((f3 / f4) - (f5 * f5)));
                Collections.sort(this.b, new c(f5));
                float max = Math.max(0.2f * f5, sqrt);
                int i2 = 0;
                while (i2 < this.b.size() && this.b.size() > 3) {
                    if (Math.abs(this.b.get(i2).i() - f5) > max) {
                        this.b.remove(i2);
                        i2--;
                    }
                    i2++;
                }
            }
            if (this.b.size() > 3) {
                for (eb2 eb22 : this.b) {
                    f += eb22.i();
                }
                Collections.sort(this.b, new b(f / ((float) this.b.size())));
                List<eb2> list = this.b;
                list.subList(3, list.size()).clear();
            }
            return new eb2[]{this.b.get(0), this.b.get(1), this.b.get(2)};
        }
        throw o62.a();
    }

    public final void b(int[] iArr) {
        for (int i = 0; i < iArr.length; i++) {
            iArr[i] = 0;
        }
    }

    public final gb2 f(Map<j62, ?> map) throws o62 {
        boolean z = map != null && map.containsKey(j62.TRY_HARDER);
        int g = this.a.g();
        int l = this.a.l();
        int i = (g * 3) / 388;
        if (i < 3 || z) {
            i = 3;
        }
        int[] iArr = new int[5];
        int i2 = i - 1;
        boolean z2 = false;
        while (i2 < g && !z2) {
            b(iArr);
            int i3 = 0;
            int i4 = 0;
            while (i3 < l) {
                if (this.a.d(i3, i2)) {
                    if ((i4 & 1) == 1) {
                        i4++;
                    }
                    iArr[i4] = iArr[i4] + 1;
                } else if ((i4 & 1) != 0) {
                    iArr[i4] = iArr[i4] + 1;
                } else if (i4 == 4) {
                    if (!h(iArr)) {
                        n(iArr);
                    } else if (k(iArr, i2, i3)) {
                        if (this.c) {
                            z2 = l();
                        } else {
                            int g2 = g();
                            if (g2 > iArr[2]) {
                                i2 += (g2 - iArr[2]) - 2;
                                i3 = l - 1;
                            }
                        }
                        b(iArr);
                        i = 2;
                        i4 = 0;
                    } else {
                        n(iArr);
                    }
                    i4 = 3;
                } else {
                    i4++;
                    iArr[i4] = iArr[i4] + 1;
                }
                i3++;
            }
            if (h(iArr) && k(iArr, i2, l)) {
                i = iArr[0];
                if (this.c) {
                    z2 = l();
                }
            }
            i2 += i;
        }
        eb2[] m = m();
        v62.e(m);
        return new gb2(m);
    }

    public final boolean k(int[] iArr, int i, int i2) {
        boolean z = false;
        int i3 = iArr[0] + iArr[1] + iArr[2] + iArr[3] + iArr[4];
        int a2 = (int) a(iArr, i2);
        float e2 = e(i, a2, iArr[2], i3);
        if (!Float.isNaN(e2)) {
            int i4 = (int) e2;
            float d2 = d(a2, i4, iArr[2], i3);
            if (!Float.isNaN(d2) && c(i4, (int) d2)) {
                float f = ((float) i3) / 7.0f;
                int i5 = 0;
                while (true) {
                    if (i5 >= this.b.size()) {
                        break;
                    }
                    eb2 eb2 = this.b.get(i5);
                    if (eb2.f(f, e2, d2)) {
                        this.b.set(i5, eb2.g(e2, d2, f));
                        z = true;
                        break;
                    }
                    i5++;
                }
                if (!z) {
                    eb2 eb22 = new eb2(d2, e2, f);
                    this.b.add(eb22);
                    w62 w62 = this.e;
                    if (w62 != null) {
                        w62.a(eb22);
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final void n(int[] iArr) {
        iArr[0] = iArr[2];
        iArr[1] = iArr[3];
        iArr[2] = iArr[4];
        iArr[3] = 1;
        iArr[4] = 0;
    }
}
