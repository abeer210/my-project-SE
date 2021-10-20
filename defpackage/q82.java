package defpackage;

import java.util.EnumMap;
import java.util.Map;

/* renamed from: q82  reason: default package */
/* compiled from: UPCEANExtension2Support */
public final class q82 {
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
        for (int i3 = 0; i3 < 2 && i < g; i3++) {
            int j = t82.j(b72, iArr2, i, t82.g);
            sb.append((char) ((j % 10) + 48));
            for (int i4 : iArr2) {
                i += i4;
            }
            if (j >= 10) {
                i2 |= 1 << (1 - i3);
            }
            if (i3 != 1) {
                i = b72.f(b72.e(i));
            }
        }
        if (sb.length() != 2) {
            throw o62.a();
        } else if (Integer.parseInt(sb.toString()) % 4 == i2) {
            return i;
        } else {
            throw o62.a();
        }
    }

    private static Map<u62, Object> c(String str) {
        if (str.length() != 2) {
            return null;
        }
        EnumMap enumMap = new EnumMap(u62.class);
        enumMap.put((Object) u62.ISSUE_NUMBER, (Object) Integer.valueOf(str));
        return enumMap;
    }

    public t62 b(int i, b72 b72, int[] iArr) throws o62 {
        StringBuilder sb = this.b;
        sb.setLength(0);
        int a2 = a(b72, iArr, sb);
        String sb2 = sb.toString();
        Map<u62, Object> c = c(sb2);
        float f = (float) i;
        t62 t62 = new t62(sb2, null, new v62[]{new v62(((float) (iArr[0] + iArr[1])) / 2.0f, f), new v62((float) a2, f)}, f62.UPC_EAN_EXTENSION);
        if (c != null) {
            t62.g(c);
        }
        return t62;
    }
}
