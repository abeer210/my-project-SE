package defpackage;

import java.text.DecimalFormat;
import vigqyno.C0201;

/* renamed from: c82  reason: default package */
/* compiled from: DecodedBitStreamParser */
public final class c82 {
    private static final String[] a = {C0201.m82(15032), C0201.m82(15033), C0201.m82(15034), C0201.m82(15035), "\u0000\u0001\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a￺￼￼\u001b￻\u001c\u001d\u001e\u001f ¢£¤¥¦§©­®¶￷ ￲￳￹￸", "\u0000\u0001\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%&'()*+,-./0123456789:;<=>?"};

    public static f72 a(byte[] bArr, int i) {
        String str;
        StringBuilder sb = new StringBuilder(144);
        if (i == 2 || i == 3) {
            if (i == 2) {
                int f = f(bArr);
                str = new DecimalFormat(C0201.m82(15036).substring(0, g(bArr))).format((long) f);
            } else {
                str = h(bArr);
            }
            DecimalFormat decimalFormat = new DecimalFormat(C0201.m82(15037));
            String format = decimalFormat.format((long) c(bArr));
            String format2 = decimalFormat.format((long) i(bArr));
            sb.append(e(bArr, 10, 84));
            if (sb.toString().startsWith(C0201.m82(15038))) {
                sb.insert(9, str + (char) 29 + format + (char) 29 + format2 + (char) 29);
            } else {
                sb.insert(0, str + (char) 29 + format + (char) 29 + format2 + (char) 29);
            }
        } else if (i == 4) {
            sb.append(e(bArr, 1, 93));
        } else if (i == 5) {
            sb.append(e(bArr, 1, 77));
        }
        return new f72(bArr, sb.toString(), null, String.valueOf(i));
    }

    private static int b(int i, byte[] bArr) {
        int i2 = i - 1;
        return ((1 << (5 - (i2 % 6))) & bArr[i2 / 6]) == 0 ? 0 : 1;
    }

    private static int c(byte[] bArr) {
        return d(bArr, new byte[]{53, 54, 43, 44, 45, 46, 47, 48, 37, 38});
    }

    private static int d(byte[] bArr, byte[] bArr2) {
        if (bArr2.length != 0) {
            int i = 0;
            for (int i2 = 0; i2 < bArr2.length; i2++) {
                i += b(bArr2[i2], bArr) << ((bArr2.length - i2) - 1);
            }
            return i;
        }
        throw new IllegalArgumentException();
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    private static String e(byte[] bArr, int i, int i2) {
        StringBuilder sb = new StringBuilder();
        int i3 = i;
        int i4 = 0;
        int i5 = -1;
        int i6 = 0;
        while (i3 < i + i2) {
            char charAt = a[i4].charAt(bArr[i3]);
            switch (charAt) {
                case 65520:
                case 65521:
                case 65522:
                case 65523:
                case 65524:
                    i6 = i4;
                    i4 = charAt - 65520;
                    i5 = 1;
                    break;
                case 65525:
                    i5 = 2;
                    i6 = i4;
                    i4 = 0;
                    break;
                case 65526:
                    i5 = 3;
                    i6 = i4;
                    i4 = 0;
                    break;
                case 65527:
                    i4 = 0;
                    i5 = -1;
                    break;
                case 65528:
                    i4 = 1;
                    i5 = -1;
                    break;
                case 65529:
                    i5 = -1;
                    break;
                case 65530:
                default:
                    sb.append(charAt);
                    break;
                case 65531:
                    int i7 = i3 + 1;
                    int i8 = i7 + 1;
                    int i9 = i8 + 1;
                    int i10 = i9 + 1;
                    i3 = i10 + 1;
                    sb.append(new DecimalFormat(C0201.m82(15039)).format((long) ((bArr[i7] << 24) + (bArr[i8] << 18) + (bArr[i9] << 12) + (bArr[i10] << 6) + bArr[i3])));
                    break;
            }
            int i11 = i5 - 1;
            if (i5 == 0) {
                i4 = i6;
            }
            i3++;
            i5 = i11;
        }
        while (sb.length() > 0 && sb.charAt(sb.length() - 1) == 65532) {
            sb.setLength(sb.length() - 1);
        }
        return sb.toString();
    }

    private static int f(byte[] bArr) {
        return d(bArr, new byte[]{33, 34, 35, 36, 25, 26, 27, 28, 29, 30, 19, 20, 21, 22, 23, 24, 13, 14, 15, 16, 17, 18, 7, 8, 9, 10, 11, 12, 1, 2});
    }

    private static int g(byte[] bArr) {
        return d(bArr, new byte[]{39, 40, 41, 42, 31, 32});
    }

    private static String h(byte[] bArr) {
        return String.valueOf(new char[]{a[0].charAt(d(bArr, new byte[]{39, 40, 41, 42, 31, 32})), a[0].charAt(d(bArr, new byte[]{33, 34, 35, 36, 25, 26})), a[0].charAt(d(bArr, new byte[]{27, 28, 29, 30, 19, 20})), a[0].charAt(d(bArr, new byte[]{21, 22, 23, 24, 13, 14})), a[0].charAt(d(bArr, new byte[]{15, 16, 17, 18, 7, 8})), a[0].charAt(d(bArr, new byte[]{9, 10, 11, 12, 1, 2}))});
    }

    private static int i(byte[] bArr) {
        return d(bArr, new byte[]{55, 56, 57, 58, 59, 60, 49, 50, 51, 52});
    }
}
