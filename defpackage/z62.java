package defpackage;

import java.util.Arrays;
import vigqyno.C0201;

/* renamed from: z62  reason: default package */
/* compiled from: Decoder */
public final class z62 {
    private static final String[] b = {C0201.m82(2940), C0201.m82(2941), C0201.m82(2942), C0201.m82(2943), C0201.m82(2944), C0201.m82(2945), C0201.m82(2946), C0201.m82(2947), C0201.m82(2948), C0201.m82(2949), C0201.m82(2950), C0201.m82(2951), C0201.m82(2952), C0201.m82(2953), C0201.m82(2954), C0201.m82(2955), C0201.m82(2956), C0201.m82(2957), C0201.m82(2958), C0201.m82(2959), C0201.m82(2960), C0201.m82(2961), C0201.m82(2962), C0201.m82(2963), C0201.m82(2964), C0201.m82(2965), C0201.m82(2966), C0201.m82(2967), C0201.m82(2968), C0201.m82(2969), C0201.m82(2970), C0201.m82(2971)};
    private static final String[] c = {C0201.m82(2972), C0201.m82(2973), C0201.m82(2974), C0201.m82(2975), C0201.m82(2976), C0201.m82(2977), C0201.m82(2978), C0201.m82(2979), C0201.m82(2980), C0201.m82(2981), C0201.m82(2982), C0201.m82(2983), C0201.m82(2984), C0201.m82(2985), C0201.m82(2986), C0201.m82(2987), C0201.m82(2988), C0201.m82(2989), C0201.m82(2990), C0201.m82(2991), C0201.m82(2992), C0201.m82(2993), C0201.m82(2994), C0201.m82(2995), C0201.m82(2996), C0201.m82(2997), C0201.m82(2998), C0201.m82(2999), C0201.m82(3000), C0201.m82(3001), C0201.m82(3002), C0201.m82(3003)};
    private static final String[] d = {C0201.m82(3004), C0201.m82(3005), C0201.m82(3006), C0201.m82(3007), C0201.m82(3008), C0201.m82(3009), C0201.m82(3010), C0201.m82(3011), C0201.m82(3012), C0201.m82(3013), C0201.m82(3014), C0201.m82(3015), C0201.m82(3016), C0201.m82(3017), C0201.m82(3018), C0201.m82(3019), C0201.m82(3020), C0201.m82(3021), C0201.m82(3022), C0201.m82(3023), C0201.m82(3024), C0201.m82(3025), C0201.m82(3026), C0201.m82(3027), C0201.m82(3028), C0201.m82(3029), C0201.m82(3030), C0201.m82(3031), C0201.m82(3032), C0201.m82(3033), C0201.m82(3034), C0201.m82(3035)};
    private static final String[] e = {C0201.m82(3036), C0201.m82(3037), C0201.m82(3038), C0201.m82(3039), C0201.m82(3040), C0201.m82(3041), C0201.m82(3042), C0201.m82(3043), C0201.m82(3044), C0201.m82(3045), C0201.m82(3046), C0201.m82(3047), C0201.m82(3048), C0201.m82(3049), C0201.m82(3050), C0201.m82(3051), C0201.m82(3052), C0201.m82(3053), C0201.m82(3054), C0201.m82(3055), C0201.m82(3056), C0201.m82(3057), C0201.m82(3058), C0201.m82(3059), C0201.m82(3060), C0201.m82(3061), C0201.m82(3062), C0201.m82(3063), C0201.m82(3064), C0201.m82(3065), C0201.m82(3066), C0201.m82(3067)};
    private static final String[] f = {C0201.m82(3068), C0201.m82(3069), C0201.m82(3070), C0201.m82(3071), C0201.m82(3072), C0201.m82(3073), C0201.m82(3074), C0201.m82(3075), C0201.m82(3076), C0201.m82(3077), C0201.m82(3078), C0201.m82(3079), C0201.m82(3080), C0201.m82(3081), C0201.m82(3082), C0201.m82(3083)};
    private x62 a;

    /* access modifiers changed from: package-private */
    /* renamed from: z62$a */
    /* compiled from: Decoder */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|12) */
        /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            int[] iArr = new int[b.values().length];
            a = iArr;
            iArr[b.UPPER.ordinal()] = 1;
            a[b.LOWER.ordinal()] = 2;
            a[b.MIXED.ordinal()] = 3;
            a[b.PUNCT.ordinal()] = 4;
            a[b.DIGIT.ordinal()] = 5;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: z62$b */
    /* compiled from: Decoder */
    public enum b {
        UPPER,
        LOWER,
        MIXED,
        DIGIT,
        PUNCT,
        BINARY
    }

    public static byte[] a(boolean[] zArr) {
        int length = (zArr.length + 7) / 8;
        byte[] bArr = new byte[length];
        for (int i = 0; i < length; i++) {
            bArr[i] = h(zArr, i << 3);
        }
        return bArr;
    }

    private boolean[] b(boolean[] zArr) throws k62 {
        p72 p72;
        int i = 8;
        if (this.a.d() <= 2) {
            i = 6;
            p72 = p72.j;
        } else if (this.a.d() <= 8) {
            p72 = p72.n;
        } else if (this.a.d() <= 22) {
            i = 10;
            p72 = p72.i;
        } else {
            i = 12;
            p72 = p72.h;
        }
        int c2 = this.a.c();
        int length = zArr.length / i;
        if (length >= c2) {
            int length2 = zArr.length % i;
            int[] iArr = new int[length];
            int i2 = 0;
            while (i2 < length) {
                iArr[i2] = i(zArr, length2, i);
                i2++;
                length2 += i;
            }
            try {
                new r72(p72).a(iArr, length - c2);
                int i3 = (1 << i) - 1;
                int i4 = 0;
                for (int i5 = 0; i5 < c2; i5++) {
                    int i6 = iArr[i5];
                    if (i6 == 0 || i6 == i3) {
                        throw k62.a();
                    }
                    if (i6 == 1 || i6 == i3 - 1) {
                        i4++;
                    }
                }
                boolean[] zArr2 = new boolean[((c2 * i) - i4)];
                int i7 = 0;
                for (int i8 = 0; i8 < c2; i8++) {
                    int i9 = iArr[i8];
                    if (i9 == 1 || i9 == i3 - 1) {
                        Arrays.fill(zArr2, i7, (i7 + i) - 1, i9 > 1);
                        i7 += i - 1;
                    } else {
                        int i10 = i - 1;
                        while (i10 >= 0) {
                            int i11 = i7 + 1;
                            zArr2[i7] = ((1 << i10) & i9) != 0;
                            i10--;
                            i7 = i11;
                        }
                    }
                }
                return zArr2;
            } catch (s72 e2) {
                throw k62.b(e2);
            }
        } else {
            throw k62.a();
        }
    }

    private boolean[] d(c72 c72) {
        boolean e2 = this.a.e();
        int d2 = this.a.d();
        int i = (e2 ? 11 : 14) + (d2 << 2);
        int[] iArr = new int[i];
        boolean[] zArr = new boolean[j(d2, e2)];
        int i2 = 2;
        if (e2) {
            for (int i3 = 0; i3 < i; i3++) {
                iArr[i3] = i3;
            }
        } else {
            int i4 = i / 2;
            int i5 = ((i + 1) + (((i4 - 1) / 15) * 2)) / 2;
            for (int i6 = 0; i6 < i4; i6++) {
                int i7 = (i6 / 15) + i6;
                iArr[(i4 - i6) - 1] = (i5 - i7) - 1;
                iArr[i4 + i6] = i7 + i5 + 1;
            }
        }
        int i8 = 0;
        int i9 = 0;
        while (i8 < d2) {
            int i10 = ((d2 - i8) << i2) + (e2 ? 9 : 12);
            int i11 = i8 << 1;
            int i12 = (i - 1) - i11;
            int i13 = 0;
            while (i13 < i10) {
                int i14 = i13 << 1;
                int i15 = 0;
                while (i15 < i2) {
                    int i16 = i11 + i15;
                    int i17 = i11 + i13;
                    zArr[i9 + i14 + i15] = c72.d(iArr[i16], iArr[i17]);
                    int i18 = i12 - i15;
                    zArr[(i10 * 2) + i9 + i14 + i15] = c72.d(iArr[i17], iArr[i18]);
                    int i19 = i12 - i13;
                    zArr[(i10 * 4) + i9 + i14 + i15] = c72.d(iArr[i18], iArr[i19]);
                    zArr[(i10 * 6) + i9 + i14 + i15] = c72.d(iArr[i19], iArr[i16]);
                    i15++;
                    d2 = d2;
                    e2 = e2;
                    i2 = 2;
                }
                i13++;
                i2 = 2;
            }
            i9 += i10 << 3;
            i8++;
            i2 = 2;
        }
        return zArr;
    }

    private static String e(b bVar, int i) {
        int i2 = a.a[bVar.ordinal()];
        if (i2 == 1) {
            return b[i];
        }
        if (i2 == 2) {
            return c[i];
        }
        if (i2 == 3) {
            return d[i];
        }
        if (i2 == 4) {
            return e[i];
        }
        if (i2 == 5) {
            return f[i];
        }
        throw new IllegalStateException(C0201.m82(3084));
    }

    private static String f(boolean[] zArr) {
        int length = zArr.length;
        b bVar = b.UPPER;
        StringBuilder sb = new StringBuilder(20);
        b bVar2 = bVar;
        int i = 0;
        while (i < length) {
            if (bVar == b.BINARY) {
                if (length - i < 5) {
                    break;
                }
                int i2 = i(zArr, i, 5);
                i += 5;
                if (i2 == 0) {
                    if (length - i < 11) {
                        break;
                    }
                    i2 = i(zArr, i, 11) + 31;
                    i += 11;
                }
                int i3 = 0;
                while (true) {
                    if (i3 >= i2) {
                        break;
                    } else if (length - i < 8) {
                        i = length;
                        break;
                    } else {
                        sb.append((char) i(zArr, i, 8));
                        i += 8;
                        i3++;
                    }
                }
            } else {
                int i4 = bVar == b.DIGIT ? 4 : 5;
                if (length - i < i4) {
                    break;
                }
                int i5 = i(zArr, i, i4);
                i += i4;
                String e2 = e(bVar, i5);
                if (e2.startsWith(C0201.m82(3085))) {
                    bVar2 = g(e2.charAt(5));
                    if (e2.charAt(6) != 'L') {
                        bVar2 = bVar;
                        bVar = bVar2;
                    }
                } else {
                    sb.append(e2);
                }
            }
            bVar = bVar2;
        }
        return sb.toString();
    }

    private static b g(char c2) {
        if (c2 == 'B') {
            return b.BINARY;
        }
        if (c2 == 'D') {
            return b.DIGIT;
        }
        if (c2 == 'P') {
            return b.PUNCT;
        }
        if (c2 == 'L') {
            return b.LOWER;
        }
        if (c2 != 'M') {
            return b.UPPER;
        }
        return b.MIXED;
    }

    private static byte h(boolean[] zArr, int i) {
        int i2;
        int length = zArr.length - i;
        if (length >= 8) {
            i2 = i(zArr, i, 8);
        } else {
            i2 = i(zArr, i, length) << (8 - length);
        }
        return (byte) i2;
    }

    private static int i(boolean[] zArr, int i, int i2) {
        int i3 = 0;
        for (int i4 = i; i4 < i + i2; i4++) {
            i3 <<= 1;
            if (zArr[i4]) {
                i3 |= 1;
            }
        }
        return i3;
    }

    private static int j(int i, boolean z) {
        return ((z ? 88 : 112) + (i << 4)) * i;
    }

    public f72 c(x62 x62) throws k62 {
        this.a = x62;
        boolean[] b2 = b(d(x62.a()));
        f72 f72 = new f72(a(b2), f(b2), null, null);
        f72.l(b2.length);
        return f72;
    }
}
