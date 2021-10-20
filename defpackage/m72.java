package defpackage;

import java.nio.charset.Charset;
import java.util.Map;
import vigqyno.C0201;

/* renamed from: m72  reason: default package */
/* compiled from: StringUtils */
public final class m72 {
    private static final String a;
    private static final boolean b;

    static {
        boolean z;
        String name = Charset.defaultCharset().name();
        a = name;
        if (!C0201.m82(19817).equalsIgnoreCase(name)) {
            if (!C0201.m82(19818).equalsIgnoreCase(a)) {
                z = false;
                b = z;
            }
        }
        z = true;
        b = z;
    }

    public static String a(byte[] bArr, Map<j62, ?> map) {
        byte[] bArr2 = bArr;
        if (map != null && map.containsKey(j62.CHARACTER_SET)) {
            return map.get(j62.CHARACTER_SET).toString();
        }
        int length = bArr2.length;
        boolean z = true;
        int i = 0;
        boolean z2 = bArr2.length > 3 && bArr2[0] == -17 && bArr2[1] == -69 && bArr2[2] == -65;
        int i2 = 0;
        boolean z3 = true;
        boolean z4 = true;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        while (i3 < length && (z || z3 || z4)) {
            int i13 = bArr2[i3] & 255;
            if (z4) {
                if (i4 > 0) {
                    if ((i13 & 128) != 0) {
                        i4--;
                    }
                } else if ((i13 & 128) != 0) {
                    if ((i13 & 64) != 0) {
                        i4++;
                        if ((i13 & 32) == 0) {
                            i6++;
                        } else {
                            i4++;
                            if ((i13 & 16) == 0) {
                                i7++;
                            } else {
                                i4++;
                                if ((i13 & 8) == 0) {
                                    i8++;
                                }
                            }
                        }
                    }
                }
                z4 = false;
            }
            if (z) {
                if (i13 > 127 && i13 < 160) {
                    z = false;
                } else if (i13 > 159 && (i13 < 192 || i13 == 215 || i13 == 247)) {
                    i10++;
                }
            }
            if (z3) {
                if (i5 > 0) {
                    if (i13 >= 64 && i13 != 127 && i13 <= 252) {
                        i5--;
                    }
                } else if (!(i13 == 128 || i13 == 160 || i13 > 239)) {
                    if (i13 <= 160 || i13 >= 224) {
                        if (i13 > 127) {
                            i5++;
                            int i14 = i11 + 1;
                            if (i14 > i) {
                                i = i14;
                                i11 = i;
                            } else {
                                i11 = i14;
                            }
                        } else {
                            i11 = 0;
                        }
                        i12 = 0;
                    } else {
                        i2++;
                        int i15 = i12 + 1;
                        if (i15 > i9) {
                            i9 = i15;
                            i12 = i9;
                        } else {
                            i12 = i15;
                        }
                        i11 = 0;
                    }
                }
                z3 = false;
            }
            i3++;
            bArr2 = bArr;
        }
        if (z4 && i4 > 0) {
            z4 = false;
        }
        if (z3 && i5 > 0) {
            z3 = false;
        }
        String r0 = C0201.m82(19819);
        if (z4 && (z2 || i6 + i7 + i8 > 0)) {
            return r0;
        }
        String r2 = C0201.m82(19820);
        if (z3 && (b || i9 >= 3 || i >= 3)) {
            return r2;
        }
        String r4 = C0201.m82(19821);
        if (z && z3) {
            return (!(i9 == 2 && i2 == 2) && i10 * 10 < length) ? r4 : r2;
        }
        if (z) {
            return r4;
        }
        if (z3) {
            return r2;
        }
        if (z4) {
            return r0;
        }
        return a;
    }
}
