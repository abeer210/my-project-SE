package defpackage;

import java.util.Arrays;
import java.util.Map;
import vigqyno.C0188;
import vigqyno.C0201;

/* renamed from: g82  reason: default package */
/* compiled from: Code39Reader */
public final class g82 extends o82 {
    public static final int[] e = {52, 289, 97, 352, 49, 304, 112, 37, 292, 100, 265, 73, 328, 25, 280, 88, 13, 268, 76, 28, 259, 67, 322, 19, 274, 82, 7, 262, 70, 22, 385, 193, 448, 145, C0188.f25, 208, 133, 388, 196, 168, 162, 138, 42};
    private final boolean a;
    private final boolean b;
    private final StringBuilder c;
    private final int[] d;

    public g82() {
        this(false);
    }

    private static String h(CharSequence charSequence) throws k62 {
        char c2;
        int i;
        int length = charSequence.length();
        StringBuilder sb = new StringBuilder(length);
        int i2 = 0;
        while (i2 < length) {
            char charAt = charSequence.charAt(i2);
            if (charAt == '+' || charAt == '$' || charAt == '%' || charAt == '/') {
                i2++;
                char charAt2 = charSequence.charAt(i2);
                if (charAt != '$') {
                    if (charAt != '%') {
                        if (charAt != '+') {
                            if (charAt == '/') {
                                if (charAt2 >= 'A' && charAt2 <= 'O') {
                                    i = charAt2 - ' ';
                                } else if (charAt2 == 'Z') {
                                    c2 = ':';
                                    sb.append(c2);
                                } else {
                                    throw k62.a();
                                }
                            }
                        } else if (charAt2 < 'A' || charAt2 > 'Z') {
                            throw k62.a();
                        } else {
                            i = charAt2 + ' ';
                        }
                    } else if (charAt2 >= 'A' && charAt2 <= 'E') {
                        i = charAt2 - '&';
                    } else if (charAt2 >= 'F' && charAt2 <= 'J') {
                        i = charAt2 - 11;
                    } else if (charAt2 >= 'K' && charAt2 <= 'O') {
                        i = charAt2 + 16;
                    } else if (charAt2 >= 'P' && charAt2 <= 'T') {
                        i = charAt2 + '+';
                    } else if (charAt2 != 'U') {
                        if (charAt2 == 'V') {
                            c2 = '@';
                        } else if (charAt2 == 'W') {
                            c2 = '`';
                        } else if (charAt2 == 'X' || charAt2 == 'Y' || charAt2 == 'Z') {
                            c2 = 127;
                        } else {
                            throw k62.a();
                        }
                        sb.append(c2);
                    }
                    c2 = 0;
                    sb.append(c2);
                } else if (charAt2 < 'A' || charAt2 > 'Z') {
                    throw k62.a();
                } else {
                    i = charAt2 - '@';
                }
                c2 = (char) i;
                sb.append(c2);
            } else {
                sb.append(charAt);
            }
            i2++;
        }
        return sb.toString();
    }

    private static int[] i(b72 b72, int[] iArr) throws o62 {
        int g = b72.g();
        int e2 = b72.e(0);
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
                } else if (k(iArr) != 148 || !b72.i(Math.max(0, i - ((e2 - i) / 2)), i, false)) {
                    i += iArr[0] + iArr[1];
                    int i3 = i2 - 1;
                    System.arraycopy(iArr, 2, iArr, 0, i3);
                    iArr[i3] = 0;
                    iArr[i2] = 0;
                    i2--;
                } else {
                    return new int[]{i, e2};
                }
                iArr[i2] = 1;
                z = !z;
            }
            e2++;
        }
        throw o62.a();
    }

    private static char j(int i) throws o62 {
        int i2 = 0;
        while (true) {
            int[] iArr = e;
            if (i2 < iArr.length) {
                if (iArr[i2] == i) {
                    return C0201.m82(21111).charAt(i2);
                }
                i2++;
            } else if (i == 148) {
                return '*';
            } else {
                throw o62.a();
            }
        }
    }

    private static int k(int[] iArr) {
        int length = iArr.length;
        int i = 0;
        while (true) {
            int i2 = C0188.f24;
            for (int i3 : iArr) {
                if (i3 < i2 && i3 > i) {
                    i2 = i3;
                }
            }
            int i4 = 0;
            int i5 = 0;
            int i6 = 0;
            for (int i7 = 0; i7 < length; i7++) {
                int i8 = iArr[i7];
                if (i8 > i2) {
                    i5 |= 1 << ((length - 1) - i7);
                    i4++;
                    i6 += i8;
                }
            }
            if (i4 == 3) {
                for (int i9 = 0; i9 < length && i4 > 0; i9++) {
                    int i10 = iArr[i9];
                    if (i10 > i2) {
                        i4--;
                        if ((i10 << 1) >= i6) {
                            return -1;
                        }
                    }
                }
                return i5;
            } else if (i4 <= 3) {
                return -1;
            } else {
                i = i2;
            }
        }
    }

    @Override // defpackage.o82
    public t62 c(int i, b72 b72, Map<j62, ?> map) throws o62, i62, k62 {
        String str;
        String r6;
        int[] iArr = this.d;
        Arrays.fill(iArr, 0);
        StringBuilder sb = this.c;
        sb.setLength(0);
        int[] i2 = i(b72, iArr);
        int e2 = b72.e(i2[1]);
        int g = b72.g();
        while (true) {
            o82.f(b72, e2, iArr);
            int k = k(iArr);
            if (k >= 0) {
                char j = j(k);
                sb.append(j);
                int i3 = e2;
                for (int i4 : iArr) {
                    i3 += i4;
                }
                int e3 = b72.e(i3);
                if (j == '*') {
                    sb.setLength(sb.length() - 1);
                    int i5 = 0;
                    for (int i6 : iArr) {
                        i5 += i6;
                    }
                    int i7 = (e3 - e2) - i5;
                    if (e3 == g || (i7 << 1) >= i5) {
                        if (this.a) {
                            int length = sb.length() - 1;
                            int i8 = 0;
                            int i9 = 0;
                            while (true) {
                                r6 = C0201.m82(21112);
                                if (i8 >= length) {
                                    break;
                                }
                                i9 += r6.indexOf(this.c.charAt(i8));
                                i8++;
                            }
                            if (sb.charAt(length) == r6.charAt(i9 % 43)) {
                                sb.setLength(length);
                            } else {
                                throw i62.a();
                            }
                        }
                        if (sb.length() != 0) {
                            if (this.b) {
                                str = h(sb);
                            } else {
                                str = sb.toString();
                            }
                            float f = (float) i;
                            return new t62(str, null, new v62[]{new v62(((float) (i2[1] + i2[0])) / 2.0f, f), new v62(((float) e2) + (((float) i5) / 2.0f), f)}, f62.CODE_39);
                        }
                        throw o62.a();
                    }
                    throw o62.a();
                }
                e2 = e3;
            } else {
                throw o62.a();
            }
        }
    }

    public g82(boolean z) {
        this(z, false);
    }

    public g82(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
        this.c = new StringBuilder(20);
        this.d = new int[9];
    }
}
