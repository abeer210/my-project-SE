package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/* renamed from: oa2  reason: default package */
/* compiled from: Detector */
public final class oa2 {
    private static final int[] a = {0, 4, 1, 5};
    private static final int[] b = {6, 2, 7, 3};
    private static final int[] c = {8, 1, 1, 1, 1, 1, 1, 3};
    private static final int[] d = {7, 1, 1, 3, 1, 1, 1, 2, 1};

    private static void a(v62[] v62Arr, v62[] v62Arr2, int[] iArr) {
        for (int i = 0; i < iArr.length; i++) {
            v62Arr[iArr[i]] = v62Arr2[i];
        }
    }

    public static pa2 b(h62 h62, Map<j62, ?> map, boolean z) throws o62 {
        c72 a2 = h62.a();
        List<v62[]> c2 = c(z, a2);
        if (c2.isEmpty()) {
            a2 = a2.clone();
            a2.m();
            c2 = c(z, a2);
        }
        return new pa2(a2, c2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0027, code lost:
        if (r4.hasNext() == false) goto L_0x004f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0029, code lost:
        r5 = (defpackage.v62[]) r4.next();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0031, code lost:
        if (r5[1] == null) goto L_0x003f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0033, code lost:
        r3 = (int) java.lang.Math.max((float) r3, r5[1].d());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0041, code lost:
        if (r5[3] == null) goto L_0x0023;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0043, code lost:
        r3 = java.lang.Math.max(r3, (int) r5[3].d());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001d, code lost:
        if (r5 == false) goto L_0x007c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001f, code lost:
        r4 = r0.iterator();
     */
    private static List<v62[]> c(boolean z, c72 c72) {
        int i;
        float f;
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        loop0:
        while (true) {
            int i3 = 0;
            boolean z2 = false;
            while (true) {
                if (i2 >= c72.g()) {
                    break loop0;
                }
                v62[] f2 = f(c72, i2, i3);
                if (f2[0] != null || f2[3] != null) {
                    arrayList.add(f2);
                    if (!z) {
                        break loop0;
                    }
                    if (f2[2] != null) {
                        i = (int) f2[2].c();
                        f = f2[2].d();
                    } else {
                        i = (int) f2[4].c();
                        f = f2[4].d();
                    }
                    i2 = (int) f;
                    i3 = i;
                    z2 = true;
                } else {
                    break;
                }
            }
            i2 += 5;
        }
        return arrayList;
    }

    private static int[] d(c72 c72, int i, int i2, int i3, boolean z, int[] iArr, int[] iArr2) {
        Arrays.fill(iArr2, 0, iArr2.length, 0);
        int i4 = 0;
        while (c72.d(i, i2) && i > 0) {
            int i5 = i4 + 1;
            if (i4 >= 3) {
                break;
            }
            i--;
            i4 = i5;
        }
        int length = iArr.length;
        boolean z2 = z;
        int i6 = 0;
        int i7 = i;
        while (i < i3) {
            if (c72.d(i, i2) != z2) {
                iArr2[i6] = iArr2[i6] + 1;
            } else {
                if (i6 != length - 1) {
                    i6++;
                } else if (g(iArr2, iArr, 0.8f) < 0.42f) {
                    return new int[]{i7, i};
                } else {
                    i7 += iArr2[0] + iArr2[1];
                    int i8 = i6 - 1;
                    System.arraycopy(iArr2, 2, iArr2, 0, i8);
                    iArr2[i8] = 0;
                    iArr2[i6] = 0;
                    i6--;
                }
                iArr2[i6] = 1;
                z2 = !z2;
            }
            i++;
        }
        if (i6 != length - 1 || g(iArr2, iArr, 0.8f) >= 0.42f) {
            return null;
        }
        return new int[]{i7, i - 1};
    }

    private static v62[] e(c72 c72, int i, int i2, int i3, int i4, int[] iArr) {
        boolean z;
        int i5;
        int i6;
        int i7;
        v62[] v62Arr = new v62[4];
        int[] iArr2 = new int[iArr.length];
        int i8 = i3;
        while (true) {
            if (i8 >= i) {
                z = false;
                break;
            }
            int[] d2 = d(c72, i4, i8, i2, false, iArr, iArr2);
            if (d2 != null) {
                int[] iArr3 = d2;
                int i9 = i8;
                while (true) {
                    if (i9 <= 0) {
                        i7 = i9;
                        break;
                    }
                    int i10 = i9 - 1;
                    int[] d3 = d(c72, i4, i10, i2, false, iArr, iArr2);
                    if (d3 == null) {
                        i7 = i10 + 1;
                        break;
                    }
                    iArr3 = d3;
                    i9 = i10;
                }
                float f = (float) i7;
                v62Arr[0] = new v62((float) iArr3[0], f);
                v62Arr[1] = new v62((float) iArr3[1], f);
                i8 = i7;
                z = true;
            } else {
                i8 += 5;
            }
        }
        int i11 = i8 + 1;
        if (z) {
            int[] iArr4 = {(int) v62Arr[0].c(), (int) v62Arr[1].c()};
            int i12 = i11;
            int i13 = 0;
            while (true) {
                if (i12 >= i) {
                    i5 = i13;
                    i6 = i12;
                    break;
                }
                i5 = i13;
                i6 = i12;
                int[] d4 = d(c72, iArr4[0], i12, i2, false, iArr, iArr2);
                if (d4 == null || Math.abs(iArr4[0] - d4[0]) >= 5 || Math.abs(iArr4[1] - d4[1]) >= 5) {
                    if (i5 > 25) {
                        break;
                    }
                    i13 = i5 + 1;
                } else {
                    iArr4 = d4;
                    i13 = 0;
                }
                i12 = i6 + 1;
            }
            i11 = i6 - (i5 + 1);
            float f2 = (float) i11;
            v62Arr[2] = new v62((float) iArr4[0], f2);
            v62Arr[3] = new v62((float) iArr4[1], f2);
        }
        if (i11 - i8 < 10) {
            Arrays.fill(v62Arr, (Object) null);
        }
        return v62Arr;
    }

    private static v62[] f(c72 c72, int i, int i2) {
        int g = c72.g();
        int l = c72.l();
        v62[] v62Arr = new v62[8];
        a(v62Arr, e(c72, g, l, i, i2, c), a);
        if (v62Arr[4] != null) {
            i2 = (int) v62Arr[4].c();
            i = (int) v62Arr[4].d();
        }
        a(v62Arr, e(c72, g, l, i, i2, d), b);
        return v62Arr;
    }

    private static float g(int[] iArr, int[] iArr2, float f) {
        int length = iArr.length;
        int i = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3++) {
            i += iArr[i3];
            i2 += iArr2[i3];
        }
        if (i < i2) {
            return Float.POSITIVE_INFINITY;
        }
        float f2 = (float) i;
        float f3 = f2 / ((float) i2);
        float f4 = f * f3;
        float f5 = 0.0f;
        for (int i4 = 0; i4 < length; i4++) {
            int i5 = iArr[i4];
            float f6 = ((float) iArr2[i4]) * f3;
            float f7 = (float) i5;
            float f8 = f7 > f6 ? f7 - f6 : f6 - f7;
            if (f8 > f4) {
                return Float.POSITIVE_INFINITY;
            }
            f5 += f8;
        }
        return f5 / f2;
    }
}
