package defpackage;

import java.util.EnumMap;
import java.util.Map;
import vigqyno.C0201;

/* renamed from: r82  reason: default package */
/* compiled from: UPCEANExtension5Support */
public final class r82 {
    private static final int[] c = {24, 20, 18, 17, 12, 6, 3, 10, 9, 5};
    private final int[] a = new int[4];
    private final StringBuilder b = new StringBuilder();

    private int a(b72 b72, int[] iArr, StringBuilder sb) throws o62 {
        int[] iArr2 = this.a;
        iArr2[0] = 0;
        iArr2[1] = 0;
        iArr2[2] = 0;
        iArr2[3] = 0;
        int g = b72.g();
        int i = iArr[1];
        int i2 = 0;
        for (int i3 = 0; i3 < 5 && i < g; i3++) {
            int j = t82.j(b72, iArr2, i, t82.g);
            sb.append((char) ((j % 10) + 48));
            for (int i4 : iArr2) {
                i += i4;
            }
            if (j >= 10) {
                i2 |= 1 << (4 - i3);
            }
            if (i3 != 4) {
                i = b72.f(b72.e(i));
            }
        }
        if (sb.length() == 5) {
            if (d(sb.toString()) == c(i2)) {
                return i;
            }
            throw o62.a();
        }
        throw o62.a();
    }

    private static int c(int i) throws o62 {
        for (int i2 = 0; i2 < 10; i2++) {
            if (i == c[i2]) {
                return i2;
            }
        }
        throw o62.a();
    }

    private static int d(CharSequence charSequence) {
        int length = charSequence.length();
        int i = 0;
        for (int i2 = length - 2; i2 >= 0; i2 -= 2) {
            i += charSequence.charAt(i2) - '0';
        }
        int i3 = i * 3;
        for (int i4 = length - 1; i4 >= 0; i4 -= 2) {
            i3 += charSequence.charAt(i4) - '0';
        }
        return (i3 * 3) % 10;
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x004d, code lost:
        if (r6.equals(vigqyno.C0201.m82(21248)) != false) goto L_0x0051;
     */
    private static String e(String str) {
        String str2;
        char c2 = 0;
        char charAt = str.charAt(0);
        String r3 = C0201.m82(21245);
        if (charAt == '0') {
            r3 = C0201.m82(21252);
        } else if (charAt == '5') {
            r3 = C0201.m82(21251);
        } else if (charAt == '9') {
            switch (str.hashCode()) {
                case 54118329:
                    break;
                case 54395376:
                    if (str.equals(C0201.m82(21247))) {
                        c2 = 2;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 54395377:
                    if (str.equals(C0201.m82(21246))) {
                        c2 = 1;
                        break;
                    }
                    c2 = 65535;
                    break;
                default:
                    c2 = 65535;
                    break;
            }
            if (c2 == 0) {
                return null;
            }
            if (c2 == 1) {
                return C0201.m82(21250);
            }
            if (c2 == 2) {
                return C0201.m82(21249);
            }
        }
        int parseInt = Integer.parseInt(str.substring(1));
        String valueOf = String.valueOf(parseInt / 100);
        int i = parseInt % 100;
        if (i < 10) {
            str2 = C0201.m82(21253).concat(String.valueOf(i));
        } else {
            str2 = String.valueOf(i);
        }
        return r3 + valueOf + '.' + str2;
    }

    private static Map<u62, Object> f(String str) {
        String e;
        if (str.length() != 5 || (e = e(str)) == null) {
            return null;
        }
        EnumMap enumMap = new EnumMap(u62.class);
        enumMap.put((Object) u62.SUGGESTED_PRICE, (Object) e);
        return enumMap;
    }

    public t62 b(int i, b72 b72, int[] iArr) throws o62 {
        StringBuilder sb = this.b;
        sb.setLength(0);
        int a2 = a(b72, iArr, sb);
        String sb2 = sb.toString();
        Map<u62, Object> f = f(sb2);
        float f2 = (float) i;
        t62 t62 = new t62(sb2, null, new v62[]{new v62(((float) (iArr[0] + iArr[1])) / 2.0f, f2), new v62((float) a2, f2)}, f62.UPC_EAN_EXTENSION);
        if (f != null) {
            t62.g(f);
        }
        return t62;
    }
}
