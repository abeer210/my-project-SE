package defpackage;

import java.io.ByteArrayOutputStream;
import java.math.BigInteger;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import vigqyno.C0188;
import vigqyno.C0201;

/* renamed from: fa2  reason: default package */
/* compiled from: DecodedBitStreamParser */
public final class fa2 {
    private static final char[] a = C0201.m82(9139).toCharArray();
    private static final char[] b = C0201.m82(9140).toCharArray();
    private static final BigInteger[] c;

    /* access modifiers changed from: package-private */
    /* renamed from: fa2$a */
    /* compiled from: DecodedBitStreamParser */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|1|2|3|4|5|6|7|8|9|10|11|12|14) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            int[] iArr = new int[b.values().length];
            a = iArr;
            iArr[b.ALPHA.ordinal()] = 1;
            a[b.LOWER.ordinal()] = 2;
            a[b.MIXED.ordinal()] = 3;
            a[b.PUNCT.ordinal()] = 4;
            a[b.ALPHA_SHIFT.ordinal()] = 5;
            try {
                a[b.PUNCT_SHIFT.ordinal()] = 6;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: fa2$b */
    /* compiled from: DecodedBitStreamParser */
    public enum b {
        ALPHA,
        LOWER,
        MIXED,
        PUNCT,
        ALPHA_SHIFT,
        PUNCT_SHIFT
    }

    static {
        BigInteger[] bigIntegerArr = new BigInteger[16];
        c = bigIntegerArr;
        bigIntegerArr[0] = BigInteger.ONE;
        BigInteger valueOf = BigInteger.valueOf(900);
        c[1] = valueOf;
        int i = 2;
        while (true) {
            BigInteger[] bigIntegerArr2 = c;
            if (i < bigIntegerArr2.length) {
                bigIntegerArr2[i] = bigIntegerArr2[i - 1].multiply(valueOf);
                i++;
            } else {
                return;
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0046 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0021 A[ADDED_TO_REGION, SYNTHETIC] */
    private static int a(int i, int[] iArr, Charset charset, int i2, StringBuilder sb) {
        int i3;
        int i4;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        long j = 900;
        int i5 = 6;
        if (i == 901) {
            int[] iArr2 = new int[6];
            int i6 = i2 + 1;
            int i7 = iArr[i2];
            boolean z = false;
            while (true) {
                i4 = 0;
                long j2 = 0;
                while (i6 < iArr[0] && !z) {
                    int i8 = i4 + 1;
                    iArr2[i4] = i7;
                    j2 = (j2 * j) + ((long) i7);
                    int i9 = i6 + 1;
                    i7 = iArr[i6];
                    if (i7 != 928) {
                        switch (i7) {
                            case C0188.f22 /*{ENCODED_INT: 900}*/:
                            case 901:
                            case 902:
                                break;
                            default:
                                switch (i7) {
                                    case 922:
                                    case 923:
                                    case 924:
                                        break;
                                    default:
                                        if (i8 % 5 != 0 || i8 <= 0) {
                                            i7 = i7;
                                            i6 = i9;
                                            i4 = i8;
                                            j = 900;
                                            i5 = 6;
                                        } else {
                                            int i10 = 0;
                                            while (i10 < i5) {
                                                byteArrayOutputStream.write((byte) ((int) (j2 >> ((5 - i10) * 8))));
                                                i10++;
                                                i7 = i7;
                                                i5 = 6;
                                            }
                                            i6 = i9;
                                            j = 900;
                                        }
                                }
                                break;
                        }
                    }
                    i6 = i9 - 1;
                    i7 = i7;
                    i4 = i8;
                    j = 900;
                    i5 = 6;
                    z = true;
                }
            }
            if (i6 == iArr[0] && i7 < 900) {
                iArr2[i4] = i7;
                i4++;
            }
            for (int i11 = 0; i11 < i4; i11++) {
                byteArrayOutputStream.write((byte) iArr2[i11]);
            }
            i3 = i6;
        } else if (i != 924) {
            i3 = i2;
        } else {
            i3 = i2;
            boolean z2 = false;
            while (true) {
                int i12 = 0;
                long j3 = 0;
                while (i3 < iArr[0] && !z2) {
                    int i13 = i3 + 1;
                    int i14 = iArr[i3];
                    if (i14 < 900) {
                        i12++;
                        j3 = (j3 * 900) + ((long) i14);
                    } else {
                        if (i14 != 928) {
                            switch (i14) {
                                default:
                                    switch (i14) {
                                    }
                                case C0188.f22 /*{ENCODED_INT: 900}*/:
                                case 901:
                                case 902:
                                    i3 = i13 - 1;
                                    z2 = true;
                                    break;
                            }
                            if (i12 % 5 == 0 && i12 > 0) {
                                for (int i15 = 0; i15 < 6; i15++) {
                                    byteArrayOutputStream.write((byte) ((int) (j3 >> ((5 - i15) * 8))));
                                }
                            }
                        }
                        i3 = i13 - 1;
                        z2 = true;
                        if (i12 % 5 == 0) {
                        }
                    }
                    i3 = i13;
                    if (i12 % 5 == 0) {
                    }
                }
            }
        }
        sb.append(new String(byteArrayOutputStream.toByteArray(), charset));
        return i3;
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x004e  */
    public static f72 b(int[] iArr, String str) throws k62 {
        int i;
        StringBuilder sb = new StringBuilder(iArr.length << 1);
        Charset charset = StandardCharsets.ISO_8859_1;
        int i2 = iArr[1];
        aa2 aa2 = new aa2();
        int i3 = 2;
        while (i3 < iArr[0]) {
            if (i2 != 913) {
                switch (i2) {
                    case C0188.f22 /*{ENCODED_INT: 900}*/:
                        i = g(iArr, i3, sb);
                        break;
                    case 901:
                        i = a(i2, iArr, charset, i3, sb);
                        break;
                    case 902:
                        i = f(iArr, i3, sb);
                        break;
                    default:
                        switch (i2) {
                            case 922:
                            case 923:
                                throw k62.a();
                            case 924:
                                break;
                            case 925:
                                i = i3 + 1;
                                break;
                            case 926:
                                i = i3 + 2;
                                break;
                            case 927:
                                i = i3 + 1;
                                charset = Charset.forName(e72.b(iArr[i3]).name());
                                break;
                            case 928:
                                i = d(iArr, i3, aa2);
                                break;
                            default:
                                i = g(iArr, i3 - 1, sb);
                                break;
                        }
                }
            } else {
                i = i3 + 1;
                sb.append((char) iArr[i3]);
            }
            if (i < iArr.length) {
                i3 = i + 1;
                i2 = iArr[i];
            } else {
                throw k62.a();
            }
        }
        if (sb.length() != 0) {
            f72 f72 = new f72(null, sb.toString(), null, str);
            f72.m(aa2);
            return f72;
        }
        throw k62.a();
    }

    private static String c(int[] iArr, int i) throws k62 {
        BigInteger bigInteger = BigInteger.ZERO;
        for (int i2 = 0; i2 < i; i2++) {
            bigInteger = bigInteger.add(c[(i - i2) - 1].multiply(BigInteger.valueOf((long) iArr[i2])));
        }
        String bigInteger2 = bigInteger.toString();
        if (bigInteger2.charAt(0) == '1') {
            return bigInteger2.substring(1);
        }
        throw k62.a();
    }

    public static int d(int[] iArr, int i, aa2 aa2) throws k62 {
        if (i + 2 <= iArr[0]) {
            int[] iArr2 = new int[2];
            int i2 = 0;
            while (i2 < 2) {
                iArr2[i2] = iArr[i];
                i2++;
                i++;
            }
            aa2.j(Integer.parseInt(c(iArr2, 2)));
            StringBuilder sb = new StringBuilder();
            int g = g(iArr, i, sb);
            aa2.d(sb.toString());
            int i3 = iArr[g] == 923 ? g + 1 : -1;
            while (g < iArr[0]) {
                int i4 = iArr[g];
                if (i4 == 922) {
                    g++;
                    aa2.g(true);
                } else if (i4 == 923) {
                    int i5 = g + 1;
                    switch (iArr[i5]) {
                        case 0:
                            StringBuilder sb2 = new StringBuilder();
                            g = g(iArr, i5 + 1, sb2);
                            aa2.e(sb2.toString());
                            continue;
                        case 1:
                            StringBuilder sb3 = new StringBuilder();
                            g = f(iArr, i5 + 1, sb3);
                            aa2.i(Integer.parseInt(sb3.toString()));
                            continue;
                        case 2:
                            StringBuilder sb4 = new StringBuilder();
                            g = f(iArr, i5 + 1, sb4);
                            aa2.l(Long.parseLong(sb4.toString()));
                            continue;
                        case 3:
                            StringBuilder sb5 = new StringBuilder();
                            g = g(iArr, i5 + 1, sb5);
                            aa2.k(sb5.toString());
                            continue;
                        case 4:
                            StringBuilder sb6 = new StringBuilder();
                            g = g(iArr, i5 + 1, sb6);
                            aa2.b(sb6.toString());
                            continue;
                        case 5:
                            StringBuilder sb7 = new StringBuilder();
                            g = f(iArr, i5 + 1, sb7);
                            aa2.f(Long.parseLong(sb7.toString()));
                            continue;
                        case 6:
                            StringBuilder sb8 = new StringBuilder();
                            g = f(iArr, i5 + 1, sb8);
                            aa2.c(Integer.parseInt(sb8.toString()));
                            continue;
                        default:
                            throw k62.a();
                    }
                } else {
                    throw k62.a();
                }
            }
            if (i3 != -1) {
                int i6 = g - i3;
                if (aa2.a()) {
                    i6--;
                }
                aa2.h(Arrays.copyOfRange(iArr, i3, i6 + i3));
            }
            return g;
        }
        throw k62.a();
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    private static void e(int[] iArr, int[] iArr2, int i, StringBuilder sb) {
        b bVar;
        int i2;
        b bVar2 = b.ALPHA;
        b bVar3 = bVar2;
        for (int i3 = 0; i3 < i; i3++) {
            int i4 = iArr[i3];
            char c2 = ' ';
            switch (a.a[bVar2.ordinal()]) {
                case 1:
                    if (i4 < 26) {
                        i2 = i4 + 65;
                        c2 = (char) i2;
                        break;
                    } else {
                        if (i4 == 900) {
                            bVar2 = b.ALPHA;
                        } else if (i4 != 913) {
                            switch (i4) {
                                case 27:
                                    bVar2 = b.LOWER;
                                    break;
                                case 28:
                                    bVar2 = b.MIXED;
                                    break;
                                case 29:
                                    bVar = b.PUNCT_SHIFT;
                                    c2 = 0;
                                    bVar3 = bVar2;
                                    bVar2 = bVar;
                                    break;
                            }
                        } else {
                            sb.append((char) iArr2[i3]);
                        }
                        c2 = 0;
                        break;
                    }
                    break;
                case 2:
                    if (i4 < 26) {
                        i2 = i4 + 97;
                        c2 = (char) i2;
                        break;
                    } else {
                        if (i4 == 900) {
                            bVar2 = b.ALPHA;
                        } else if (i4 != 913) {
                            switch (i4) {
                                case 27:
                                    bVar = b.ALPHA_SHIFT;
                                    c2 = 0;
                                    bVar3 = bVar2;
                                    bVar2 = bVar;
                                    break;
                                case 28:
                                    bVar2 = b.MIXED;
                                    break;
                                case 29:
                                    bVar = b.PUNCT_SHIFT;
                                    c2 = 0;
                                    bVar3 = bVar2;
                                    bVar2 = bVar;
                                    break;
                            }
                        } else {
                            sb.append((char) iArr2[i3]);
                        }
                        c2 = 0;
                        break;
                    }
                    break;
                case 3:
                    if (i4 < 25) {
                        c2 = b[i4];
                        break;
                    } else {
                        if (i4 == 900) {
                            bVar2 = b.ALPHA;
                        } else if (i4 != 913) {
                            switch (i4) {
                                case 25:
                                    bVar2 = b.PUNCT;
                                    break;
                                case 27:
                                    bVar2 = b.LOWER;
                                    break;
                                case 28:
                                    bVar2 = b.ALPHA;
                                    break;
                                case 29:
                                    bVar = b.PUNCT_SHIFT;
                                    c2 = 0;
                                    bVar3 = bVar2;
                                    bVar2 = bVar;
                                    break;
                            }
                        } else {
                            sb.append((char) iArr2[i3]);
                        }
                        c2 = 0;
                        break;
                    }
                    break;
                case 4:
                    if (i4 < 29) {
                        c2 = a[i4];
                        break;
                    } else {
                        if (i4 == 29) {
                            bVar2 = b.ALPHA;
                        } else if (i4 == 900) {
                            bVar2 = b.ALPHA;
                        } else if (i4 == 913) {
                            sb.append((char) iArr2[i3]);
                        }
                        c2 = 0;
                        break;
                    }
                case 5:
                    if (i4 < 26) {
                        c2 = (char) (i4 + 65);
                    } else if (i4 != 26) {
                        if (i4 == 900) {
                            bVar2 = b.ALPHA;
                            c2 = 0;
                            break;
                        }
                        bVar2 = bVar3;
                        c2 = 0;
                    }
                    bVar2 = bVar3;
                    break;
                case 6:
                    if (i4 < 29) {
                        c2 = a[i4];
                        bVar2 = bVar3;
                        break;
                    } else {
                        if (i4 == 29) {
                            bVar2 = b.ALPHA;
                        } else if (i4 != 900) {
                            if (i4 == 913) {
                                sb.append((char) iArr2[i3]);
                            }
                            bVar2 = bVar3;
                        } else {
                            bVar2 = b.ALPHA;
                        }
                        c2 = 0;
                        break;
                    }
                default:
                    c2 = 0;
                    break;
            }
            if (c2 != 0) {
                sb.append(c2);
            }
        }
    }

    private static int f(int[] iArr, int i, StringBuilder sb) throws k62 {
        int[] iArr2 = new int[15];
        boolean z = false;
        int i2 = 0;
        while (i < iArr[0] && !z) {
            int i3 = i + 1;
            int i4 = iArr[i];
            if (i3 == iArr[0]) {
                z = true;
            }
            if (i4 < 900) {
                iArr2[i2] = i4;
                i2++;
            } else {
                if (!(i4 == 900 || i4 == 901 || i4 == 928)) {
                    switch (i4) {
                    }
                }
                i3--;
                z = true;
            }
            if ((i2 % 15 == 0 || i4 == 902 || z) && i2 > 0) {
                sb.append(c(iArr2, i2));
                i2 = 0;
            }
            i = i3;
        }
        return i;
    }

    private static int g(int[] iArr, int i, StringBuilder sb) {
        int[] iArr2 = new int[((iArr[0] - i) << 1)];
        int[] iArr3 = new int[((iArr[0] - i) << 1)];
        boolean z = false;
        int i2 = 0;
        while (i < iArr[0] && !z) {
            int i3 = i + 1;
            int i4 = iArr[i];
            if (i4 < 900) {
                iArr2[i2] = i4 / 30;
                iArr2[i2 + 1] = i4 % 30;
                i2 += 2;
            } else if (i4 != 913) {
                if (i4 != 928) {
                    switch (i4) {
                        case C0188.f22 /*{ENCODED_INT: 900}*/:
                            iArr2[i2] = 900;
                            i2++;
                            break;
                        default:
                            switch (i4) {
                            }
                        case 901:
                        case 902:
                            i = i3 - 1;
                            z = true;
                            break;
                    }
                }
                i = i3 - 1;
                z = true;
            } else {
                iArr2[i2] = 913;
                i = i3 + 1;
                iArr3[i2] = iArr[i3];
                i2++;
            }
            i = i3;
        }
        e(iArr2, iArr3, i2, sb);
        return i;
    }
}
