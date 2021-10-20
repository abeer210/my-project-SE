package defpackage;

import java.util.Map;

/* renamed from: l82  reason: default package */
/* compiled from: ITFReader */
public final class l82 extends o82 {
    private static final int[] b = {6, 8, 10, 12, 14};
    private static final int[] c = {1, 1, 1, 1};
    private static final int[][] d = {new int[]{1, 1, 2}, new int[]{1, 1, 3}};
    private static final int[][] e = {new int[]{1, 1, 2, 2, 1}, new int[]{2, 1, 1, 1, 2}, new int[]{1, 2, 1, 1, 2}, new int[]{2, 2, 1, 1, 1}, new int[]{1, 1, 2, 1, 2}, new int[]{2, 1, 2, 1, 1}, new int[]{1, 2, 2, 1, 1}, new int[]{1, 1, 1, 2, 2}, new int[]{2, 1, 1, 2, 1}, new int[]{1, 2, 1, 2, 1}, new int[]{1, 1, 3, 3, 1}, new int[]{3, 1, 1, 1, 3}, new int[]{1, 3, 1, 1, 3}, new int[]{3, 3, 1, 1, 1}, new int[]{1, 1, 3, 1, 3}, new int[]{3, 1, 3, 1, 1}, new int[]{1, 3, 3, 1, 1}, new int[]{1, 1, 1, 3, 3}, new int[]{3, 1, 1, 3, 1}, new int[]{1, 3, 1, 3, 1}};
    private int a = -1;

    private static int h(int[] iArr) throws o62 {
        int length = e.length;
        float f = 0.38f;
        int i = -1;
        for (int i2 = 0; i2 < length; i2++) {
            float e2 = o82.e(iArr, e[i2], 0.5f);
            if (e2 < f) {
                i = i2;
                f = e2;
            } else if (e2 == f) {
                i = -1;
            }
        }
        if (i >= 0) {
            return i % 10;
        }
        throw o62.a();
    }

    private int[] i(b72 b72) throws o62 {
        int[] iArr;
        int i;
        b72.l();
        try {
            try {
                iArr = l(b72, m(b72), d[0]);
            } catch (o62 unused) {
                iArr = l(b72, i, d[1]);
            }
            n(b72, iArr[0]);
            int i2 = iArr[0];
            iArr[0] = b72.g() - iArr[1];
            iArr[1] = b72.g() - i2;
            return iArr;
        } finally {
            b72.l();
        }
    }

    private static void j(b72 b72, int i, int i2, StringBuilder sb) throws o62 {
        int[] iArr = new int[10];
        int[] iArr2 = new int[5];
        int[] iArr3 = new int[5];
        while (i < i2) {
            o82.f(b72, i, iArr);
            for (int i3 = 0; i3 < 5; i3++) {
                int i4 = i3 * 2;
                iArr2[i3] = iArr[i4];
                iArr3[i3] = iArr[i4 + 1];
            }
            sb.append((char) (h(iArr2) + 48));
            sb.append((char) (h(iArr3) + 48));
            for (int i5 = 0; i5 < 10; i5++) {
                i += iArr[i5];
            }
        }
    }

    private int[] k(b72 b72) throws o62 {
        int[] l = l(b72, m(b72), c);
        this.a = (l[1] - l[0]) / 4;
        n(b72, l[0]);
        return l;
    }

    private static int[] l(b72 b72, int i, int[] iArr) throws o62 {
        int length = iArr.length;
        int[] iArr2 = new int[length];
        int g = b72.g();
        int i2 = i;
        boolean z = false;
        int i3 = 0;
        while (i < g) {
            if (b72.c(i) != z) {
                iArr2[i3] = iArr2[i3] + 1;
            } else {
                if (i3 != length - 1) {
                    i3++;
                } else if (o82.e(iArr2, iArr, 0.5f) < 0.38f) {
                    return new int[]{i2, i};
                } else {
                    i2 += iArr2[0] + iArr2[1];
                    int i4 = i3 - 1;
                    System.arraycopy(iArr2, 2, iArr2, 0, i4);
                    iArr2[i4] = 0;
                    iArr2[i3] = 0;
                    i3--;
                }
                iArr2[i3] = 1;
                z = !z;
            }
            i++;
        }
        throw o62.a();
    }

    private static int m(b72 b72) throws o62 {
        int g = b72.g();
        int e2 = b72.e(0);
        if (e2 != g) {
            return e2;
        }
        throw o62.a();
    }

    private void n(b72 b72, int i) throws o62 {
        int i2 = this.a * 10;
        if (i2 >= i) {
            i2 = i;
        }
        int i3 = i - 1;
        while (i2 > 0 && i3 >= 0 && !b72.c(i3)) {
            i2--;
            i3--;
        }
        if (i2 != 0) {
            throw o62.a();
        }
    }

    @Override // defpackage.o82
    public t62 c(int i, b72 b72, Map<j62, ?> map) throws k62, o62 {
        boolean z;
        int[] k = k(b72);
        int[] i2 = i(b72);
        StringBuilder sb = new StringBuilder(20);
        j(b72, k[1], i2[0], sb);
        String sb2 = sb.toString();
        int[] iArr = map != null ? (int[]) map.get(j62.ALLOWED_LENGTHS) : null;
        if (iArr == null) {
            iArr = b;
        }
        int length = sb2.length();
        int length2 = iArr.length;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            if (i3 >= length2) {
                z = false;
                break;
            }
            int i5 = iArr[i3];
            if (length == i5) {
                z = true;
                break;
            }
            if (i5 > i4) {
                i4 = i5;
            }
            i3++;
        }
        if (!z && length > i4) {
            z = true;
        }
        if (z) {
            float f = (float) i;
            return new t62(sb2, null, new v62[]{new v62((float) k[1], f), new v62((float) i2[0], f)}, f62.ITF);
        }
        throw k62.a();
    }
}
