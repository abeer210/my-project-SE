package defpackage;

import java.util.Arrays;
import java.util.Map;

/* renamed from: t82  reason: default package */
/* compiled from: UPCEANReader */
public abstract class t82 extends o82 {
    public static final int[] d = {1, 1, 1};
    public static final int[] e = {1, 1, 1, 1, 1};
    public static final int[][] f;
    public static final int[][] g;
    private final StringBuilder a = new StringBuilder(20);
    private final s82 b = new s82();
    private final k82 c = new k82();

    static {
        int[][] iArr = {new int[]{3, 2, 1, 1}, new int[]{2, 2, 2, 1}, new int[]{2, 1, 2, 2}, new int[]{1, 4, 1, 1}, new int[]{1, 1, 3, 2}, new int[]{1, 2, 3, 1}, new int[]{1, 1, 1, 4}, new int[]{1, 3, 1, 2}, new int[]{1, 2, 1, 3}, new int[]{3, 1, 1, 2}};
        f = iArr;
        int[][] iArr2 = new int[20][];
        g = iArr2;
        System.arraycopy(iArr, 0, iArr2, 0, 10);
        for (int i = 10; i < 20; i++) {
            int[] iArr3 = f[i - 10];
            int[] iArr4 = new int[iArr3.length];
            for (int i2 = 0; i2 < iArr3.length; i2++) {
                iArr4[i2] = iArr3[(iArr3.length - i2) - 1];
            }
            g[i] = iArr4;
        }
    }

    public static boolean i(CharSequence charSequence) throws k62 {
        int length = charSequence.length();
        if (length == 0) {
            return false;
        }
        int i = length - 1;
        return r(charSequence.subSequence(0, i)) == Character.digit(charSequence.charAt(i), 10);
    }

    public static int j(b72 b72, int[] iArr, int i, int[][] iArr2) throws o62 {
        o82.f(b72, i, iArr);
        int length = iArr2.length;
        float f2 = 0.48f;
        int i2 = -1;
        for (int i3 = 0; i3 < length; i3++) {
            float e2 = o82.e(iArr, iArr2[i3], 0.7f);
            if (e2 < f2) {
                i2 = i3;
                f2 = e2;
            }
        }
        if (i2 >= 0) {
            return i2;
        }
        throw o62.a();
    }

    public static int[] n(b72 b72, int i, boolean z, int[] iArr) throws o62 {
        return o(b72, i, z, iArr, new int[iArr.length]);
    }

    private static int[] o(b72 b72, int i, boolean z, int[] iArr, int[] iArr2) throws o62 {
        int g2 = b72.g();
        int f2 = z ? b72.f(i) : b72.e(i);
        int length = iArr.length;
        boolean z2 = z;
        int i2 = 0;
        int i3 = f2;
        while (f2 < g2) {
            if (b72.c(f2) != z2) {
                iArr2[i2] = iArr2[i2] + 1;
            } else {
                if (i2 != length - 1) {
                    i2++;
                } else if (o82.e(iArr2, iArr, 0.7f) < 0.48f) {
                    return new int[]{i3, f2};
                } else {
                    i3 += iArr2[0] + iArr2[1];
                    int i4 = i2 - 1;
                    System.arraycopy(iArr2, 2, iArr2, 0, i4);
                    iArr2[i4] = 0;
                    iArr2[i2] = 0;
                    i2--;
                }
                iArr2[i2] = 1;
                z2 = !z2;
            }
            f2++;
        }
        throw o62.a();
    }

    public static int[] p(b72 b72) throws o62 {
        int[] iArr = new int[d.length];
        int[] iArr2 = null;
        boolean z = false;
        int i = 0;
        while (!z) {
            Arrays.fill(iArr, 0, d.length, 0);
            iArr2 = o(b72, i, false, d, iArr);
            int i2 = iArr2[0];
            int i3 = iArr2[1];
            int i4 = i2 - (i3 - i2);
            if (i4 >= 0) {
                z = b72.i(i4, i2, false);
            }
            i = i3;
        }
        return iArr2;
    }

    public static int r(CharSequence charSequence) throws k62 {
        int length = charSequence.length();
        int i = 0;
        for (int i2 = length - 1; i2 >= 0; i2 -= 2) {
            int charAt = charSequence.charAt(i2) - '0';
            if (charAt < 0 || charAt > 9) {
                throw k62.a();
            }
            i += charAt;
        }
        int i3 = i * 3;
        for (int i4 = length - 2; i4 >= 0; i4 -= 2) {
            int charAt2 = charSequence.charAt(i4) - '0';
            if (charAt2 < 0 || charAt2 > 9) {
                throw k62.a();
            }
            i3 += charAt2;
        }
        return (1000 - i3) % 10;
    }

    @Override // defpackage.o82
    public t62 c(int i, b72 b72, Map<j62, ?> map) throws o62, i62, k62 {
        return m(i, b72, p(b72), map);
    }

    public boolean h(String str) throws k62 {
        return i(str);
    }

    public int[] k(b72 b72, int i) throws o62 {
        return n(b72, i, false, d);
    }

    public abstract int l(b72 b72, int[] iArr, StringBuilder sb) throws o62;

    public t62 m(int i, b72 b72, int[] iArr, Map<j62, ?> map) throws o62, i62, k62 {
        w62 w62;
        int i2;
        String c2;
        int[] iArr2 = null;
        if (map == null) {
            w62 = null;
        } else {
            w62 = (w62) map.get(j62.NEED_RESULT_POINT_CALLBACK);
        }
        boolean z = true;
        if (w62 != null) {
            w62.a(new v62(((float) (iArr[0] + iArr[1])) / 2.0f, (float) i));
        }
        StringBuilder sb = this.a;
        sb.setLength(0);
        int l = l(b72, iArr, sb);
        if (w62 != null) {
            w62.a(new v62((float) l, (float) i));
        }
        int[] k = k(b72, l);
        if (w62 != null) {
            w62.a(new v62(((float) (k[0] + k[1])) / 2.0f, (float) i));
        }
        int i3 = k[1];
        int i4 = (i3 - k[0]) + i3;
        if (i4 >= b72.g() || !b72.i(i3, i4, false)) {
            throw o62.a();
        }
        String sb2 = sb.toString();
        if (sb2.length() < 8) {
            throw k62.a();
        } else if (h(sb2)) {
            f62 q = q();
            float f2 = (float) i;
            t62 t62 = new t62(sb2, null, new v62[]{new v62(((float) (iArr[1] + iArr[0])) / 2.0f, f2), new v62(((float) (k[1] + k[0])) / 2.0f, f2)}, q);
            try {
                t62 a2 = this.b.a(i, b72, k[1]);
                t62.h(u62.UPC_EAN_EXTENSION, a2.f());
                t62.g(a2.d());
                t62.a(a2.e());
                i2 = a2.f().length();
            } catch (s62 unused) {
                i2 = 0;
            }
            if (map != null) {
                iArr2 = (int[]) map.get(j62.ALLOWED_EAN_EXTENSIONS);
            }
            if (iArr2 != null) {
                int length = iArr2.length;
                int i5 = 0;
                while (true) {
                    if (i5 >= length) {
                        z = false;
                        break;
                    } else if (i2 == iArr2[i5]) {
                        break;
                    } else {
                        i5++;
                    }
                }
                if (!z) {
                    throw o62.a();
                }
            }
            if ((q == f62.EAN_13 || q == f62.UPC_A) && (c2 = this.c.c(sb2)) != null) {
                t62.h(u62.POSSIBLE_COUNTRY, c2);
            }
            return t62;
        } else {
            throw i62.a();
        }
    }

    public abstract f62 q();
}
