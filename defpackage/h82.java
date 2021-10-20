package defpackage;

import java.util.Arrays;
import java.util.Map;
import vigqyno.C0188;
import vigqyno.C0201;

/* renamed from: h82  reason: default package */
/* compiled from: Code93Reader */
public final class h82 extends o82 {
    private static final char[] c = C0201.m82(18349).toCharArray();
    public static final int[] d;
    private static final int e;
    private final StringBuilder a = new StringBuilder(20);
    private final int[] b = new int[6];

    static {
        int[] iArr = {276, 328, 324, 322, 296, 292, 290, 336, 274, 266, 424, 420, 418, 404, 402, 394, 360, 356, 354, 308, 282, 344, 332, 326, C0188.f19, 278, 436, 434, 428, 422, 406, 410, 364, 358, 310, 314, 302, 468, 466, 458, 366, 374, 430, 294, 474, 470, 306, 350};
        d = iArr;
        e = iArr[47];
    }

    private static void h(CharSequence charSequence) throws i62 {
        int length = charSequence.length();
        i(charSequence, length - 2, 20);
        i(charSequence, length - 1, 15);
    }

    private static void i(CharSequence charSequence, int i, int i2) throws i62 {
        int i3 = 0;
        int i4 = 1;
        for (int i5 = i - 1; i5 >= 0; i5--) {
            i3 += C0201.m82(18350).indexOf(charSequence.charAt(i5)) * i4;
            i4++;
            if (i4 > i2) {
                i4 = 1;
            }
        }
        if (charSequence.charAt(i) != c[i3 % 47]) {
            throw i62.a();
        }
    }

    private static String j(CharSequence charSequence) throws k62 {
        char c2;
        int i;
        int length = charSequence.length();
        StringBuilder sb = new StringBuilder(length);
        int i2 = 0;
        while (i2 < length) {
            char charAt = charSequence.charAt(i2);
            if (charAt < 'a' || charAt > 'd') {
                sb.append(charAt);
            } else if (i2 < length - 1) {
                i2++;
                char charAt2 = charSequence.charAt(i2);
                switch (charAt) {
                    case 'a':
                        if (charAt2 >= 'A' && charAt2 <= 'Z') {
                            i = charAt2 - '@';
                            c2 = (char) i;
                            break;
                        } else {
                            throw k62.a();
                        }
                        break;
                    case 'b':
                        if (charAt2 >= 'A' && charAt2 <= 'E') {
                            i = charAt2 - '&';
                            c2 = (char) i;
                        } else if (charAt2 >= 'F' && charAt2 <= 'J') {
                            i = charAt2 - 11;
                            c2 = (char) i;
                        } else if (charAt2 < 'K' || charAt2 > 'O') {
                            if (charAt2 < 'P' || charAt2 > 'S') {
                                if (charAt2 >= 'T' && charAt2 <= 'Z') {
                                    c2 = 127;
                                    break;
                                } else {
                                    throw k62.a();
                                }
                            } else {
                                i = charAt2 + '+';
                                c2 = (char) i;
                                break;
                            }
                        } else {
                            i = charAt2 + 16;
                            c2 = (char) i;
                        }
                        break;
                    case 'c':
                        if (charAt2 >= 'A' && charAt2 <= 'O') {
                            i = charAt2 - ' ';
                            c2 = (char) i;
                            break;
                        } else if (charAt2 == 'Z') {
                            c2 = ':';
                            break;
                        } else {
                            throw k62.a();
                        }
                    case 'd':
                        if (charAt2 >= 'A' && charAt2 <= 'Z') {
                            i = charAt2 + ' ';
                            c2 = (char) i;
                            break;
                        } else {
                            throw k62.a();
                        }
                    default:
                        c2 = 0;
                        break;
                }
                sb.append(c2);
            } else {
                throw k62.a();
            }
            i2++;
        }
        return sb.toString();
    }

    private int[] k(b72 b72) throws o62 {
        int g = b72.g();
        int e2 = b72.e(0);
        Arrays.fill(this.b, 0);
        int[] iArr = this.b;
        int length = iArr.length;
        int i = e2;
        boolean z = false;
        int i2 = 0;
        while (e2 < g) {
            if (b72.c(e2) != z) {
                iArr[i2] = iArr[i2] + 1;
            } else {
                if (i2 != length - 1) {
                    i2++;
                } else if (m(iArr) == e) {
                    return new int[]{i, e2};
                } else {
                    i += iArr[0] + iArr[1];
                    int i3 = i2 - 1;
                    System.arraycopy(iArr, 2, iArr, 0, i3);
                    iArr[i3] = 0;
                    iArr[i2] = 0;
                    i2--;
                }
                iArr[i2] = 1;
                z = !z;
            }
            e2++;
        }
        throw o62.a();
    }

    private static char l(int i) throws o62 {
        int i2 = 0;
        while (true) {
            int[] iArr = d;
            if (i2 >= iArr.length) {
                throw o62.a();
            } else if (iArr[i2] == i) {
                return c[i2];
            } else {
                i2++;
            }
        }
    }

    private static int m(int[] iArr) {
        int i = 0;
        for (int i2 : iArr) {
            i += i2;
        }
        int length = iArr.length;
        int i3 = 0;
        for (int i4 = 0; i4 < length; i4++) {
            int round = Math.round((((float) iArr[i4]) * 9.0f) / ((float) i));
            if (round <= 0 || round > 4) {
                return -1;
            }
            if ((i4 & 1) == 0) {
                for (int i5 = 0; i5 < round; i5++) {
                    i3 = (i3 << 1) | 1;
                }
            } else {
                i3 <<= round;
            }
        }
        return i3;
    }

    @Override // defpackage.o82
    public t62 c(int i, b72 b72, Map<j62, ?> map) throws o62, i62, k62 {
        int[] k = k(b72);
        int e2 = b72.e(k[1]);
        int g = b72.g();
        int[] iArr = this.b;
        Arrays.fill(iArr, 0);
        StringBuilder sb = this.a;
        sb.setLength(0);
        while (true) {
            o82.f(b72, e2, iArr);
            int m = m(iArr);
            if (m >= 0) {
                char l = l(m);
                sb.append(l);
                int i2 = e2;
                for (int i3 : iArr) {
                    i2 += i3;
                }
                int e3 = b72.e(i2);
                if (l == '*') {
                    sb.deleteCharAt(sb.length() - 1);
                    int i4 = 0;
                    for (int i5 : iArr) {
                        i4 += i5;
                    }
                    if (e3 == g || !b72.c(e3)) {
                        throw o62.a();
                    } else if (sb.length() >= 2) {
                        h(sb);
                        sb.setLength(sb.length() - 2);
                        float f = (float) i;
                        return new t62(j(sb), null, new v62[]{new v62(((float) (k[1] + k[0])) / 2.0f, f), new v62(((float) e2) + (((float) i4) / 2.0f), f)}, f62.CODE_93);
                    } else {
                        throw o62.a();
                    }
                } else {
                    e2 = e3;
                }
            } else {
                throw o62.a();
            }
        }
    }
}
