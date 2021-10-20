package defpackage;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.text.DecimalFormat;
import vigqyno.C0201;

/* renamed from: gw  reason: default package */
/* compiled from: IccDescriptor */
public class gw extends as<hw> {
    public static final String b = null;
    public static final String c = null;
    public static final String d = null;
    public static final String e = null;
    public static final String f = null;
    public static final String g = null;
    public static final String h = null;
    public static final String i = null;
    public static final String j = null;
    public static final String k = null;
    public static final String l = null;
    public static final String m = null;
    public static final String n = null;
    public static final String o = null;
    public static final String p = null;
    public static final String q = null;
    public static final String r = null;
    public static final String s = null;
    public static final String t = null;
    public static final String u = null;
    public static final String v = null;
    public static final String w = null;
    public static final String x = null;
    public static final String y = null;
    public static final String z = null;

    static {
        C0201.m83(gw.class, 56);
    }

    public gw(hw hwVar) {
        super(hwVar);
    }

    private String A() {
        return m(64, C0201.m82(18393), C0201.m82(18394), C0201.m82(18395), C0201.m82(18396));
    }

    private String B(int i2) {
        String str;
        String str2;
        String str3;
        try {
            byte[] e2 = ((hw) this.a).e(i2);
            if (e2 == null) {
                return ((hw) this.a).r(i2);
            }
            br brVar = new br(e2);
            int i3 = 0;
            int h2 = brVar.h(0);
            String str4 = o;
            String str5 = z;
            String str6 = b;
            switch (h2) {
                case 1482250784:
                    StringBuilder sb = new StringBuilder();
                    DecimalFormat decimalFormat = new DecimalFormat(u);
                    int length = (e2.length - 8) / 12;
                    while (i3 < length) {
                        int i4 = (i3 * 12) + 8;
                        float o2 = brVar.o(i4);
                        float o3 = brVar.o(i4 + 4);
                        float o4 = brVar.o(i4 + 8);
                        if (i3 > 0) {
                            sb.append(str6);
                        }
                        sb.append(str5);
                        sb.append(decimalFormat.format((double) o2));
                        sb.append(str6);
                        sb.append(decimalFormat.format((double) o3));
                        sb.append(str6);
                        sb.append(decimalFormat.format((double) o4));
                        sb.append(str4);
                        i3++;
                    }
                    return sb.toString();
                case 1668641398:
                    int h3 = brVar.h(8);
                    StringBuilder sb2 = new StringBuilder();
                    for (int i5 = 0; i5 < h3; i5++) {
                        if (i5 != 0) {
                            sb2.append(str6);
                        }
                        double s2 = (double) ((float) brVar.s((i5 * 2) + 12));
                        Double.isNaN(s2);
                        sb2.append(v(s2 / 65535.0d, 7, false));
                    }
                    return sb2.toString();
                case 1684370275:
                    return new String(e2, 12, brVar.h(8) - 1);
                case 1835360627:
                    int h4 = brVar.h(8);
                    float o5 = brVar.o(12);
                    float o6 = brVar.o(16);
                    float o7 = brVar.o(20);
                    int h5 = brVar.h(24);
                    float o8 = brVar.o(28);
                    int h6 = brVar.h(32);
                    String str7 = p;
                    String str8 = c;
                    if (h4 == 0) {
                        str = str7;
                    } else if (h4 == 1) {
                        str = e;
                    } else if (h4 != 2) {
                        str = String.format(str8, Integer.valueOf(h4));
                    } else {
                        str = i;
                    }
                    if (h5 != 0) {
                        if (h5 == 1) {
                            str7 = g;
                        } else if (h5 != 2) {
                            str7 = String.format(str8, Integer.valueOf(h4));
                        } else {
                            str7 = v;
                        }
                    }
                    switch (h6) {
                        case 0:
                            str2 = l;
                            break;
                        case 1:
                            str2 = x;
                            break;
                        case 2:
                            str2 = q;
                            break;
                        case 3:
                            str2 = y;
                            break;
                        case 4:
                            str2 = w;
                            break;
                        case 5:
                            str2 = k;
                            break;
                        case 6:
                            str2 = m;
                            break;
                        case 7:
                            str2 = s;
                            break;
                        case 8:
                            str2 = f;
                            break;
                        default:
                            str2 = String.format(str8, Integer.valueOf(h6));
                            break;
                    }
                    DecimalFormat decimalFormat2 = new DecimalFormat(h);
                    return String.format(r, str, decimalFormat2.format((double) o5), decimalFormat2.format((double) o6), decimalFormat2.format((double) o7), str7, Integer.valueOf(Math.round(o8 * 100.0f)), str2);
                case 1835824483:
                    int h7 = brVar.h(8);
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(h7);
                    while (i3 < h7) {
                        int i6 = (i3 * 12) + 16;
                        String e3 = iw.e(brVar.h(i6));
                        int h8 = brVar.h(i6 + 4);
                        int h9 = brVar.h(i6 + 8);
                        try {
                            str3 = new String(e2, h9, h8, t);
                        } catch (UnsupportedEncodingException unused) {
                            str3 = new String(e2, h9, h8);
                        }
                        sb3.append(j);
                        sb3.append(e3);
                        sb3.append(str5);
                        sb3.append(str3);
                        sb3.append(str4);
                        i3++;
                    }
                    return sb3.toString();
                case 1936287520:
                    return iw.e(brVar.h(8));
                case 1952807028:
                    try {
                        return new String(e2, 8, (e2.length - 8) - 1, n);
                    } catch (UnsupportedEncodingException unused2) {
                        return new String(e2, 8, (e2.length - 8) - 1);
                    }
                default:
                    return String.format(d, iw.e(h2), Integer.valueOf(h2), Integer.valueOf(e2.length));
            }
        } catch (IOException unused3) {
            return null;
        }
    }

    public static String v(double d2, int i2, boolean z2) {
        int i3 = i2;
        String r3 = C0201.m82(18397);
        boolean z3 = true;
        if (i3 < 1) {
            return r3 + Math.round(d2);
        }
        long abs = Math.abs((long) d2);
        double abs2 = Math.abs(d2);
        double d3 = (double) abs;
        Double.isNaN(d3);
        long round = (long) ((int) Math.round((abs2 - d3) * Math.pow(10.0d, (double) i3)));
        String str = r3;
        long j2 = round;
        while (i3 > 0) {
            byte abs3 = (byte) ((int) Math.abs(j2 % 10));
            j2 /= 10;
            if (str.length() > 0 || z2 || abs3 != 0 || i3 == 1) {
                str = ((int) abs3) + str;
            }
            i3--;
        }
        long j3 = abs + j2;
        if (d2 >= 0.0d || (j3 == 0 && round == 0)) {
            z3 = false;
        }
        StringBuilder sb = new StringBuilder();
        if (z3) {
            r3 = C0201.m82(18398);
        }
        sb.append(r3);
        sb.append(j3);
        sb.append(C0201.m82(18399));
        sb.append(str);
        return sb.toString();
    }

    private static int w(String str) throws IOException {
        return new br(str.getBytes()).h(0);
    }

    private String x() {
        String r2 = ((hw) this.a).r(40);
        if (r2 == null) {
            return null;
        }
        try {
            switch (w(r2)) {
                case 1095782476:
                    return C0201.m82(18405);
                case 1297303124:
                    return C0201.m82(18404);
                case 1397180704:
                    return C0201.m82(18403);
                case 1398099543:
                    return C0201.m82(18402);
                case 1413959252:
                    return C0201.m82(18401);
                default:
                    return String.format(C0201.m82(18400), r2);
            }
        } catch (IOException unused) {
            return r2;
        }
    }

    private String y() {
        String r2 = ((hw) this.a).r(12);
        if (r2 == null) {
            return null;
        }
        try {
            switch (w(r2)) {
                case 1633842036:
                    return C0201.m82(18413);
                case 1818848875:
                    return C0201.m82(18412);
                case 1835955314:
                    return C0201.m82(18411);
                case 1852662636:
                    return C0201.m82(18410);
                case 1886549106:
                    return C0201.m82(18409);
                case 1935896178:
                    return C0201.m82(18408);
                case 1936744803:
                    return C0201.m82(18407);
                default:
                    return String.format(C0201.m82(18406), r2);
            }
        } catch (IOException unused) {
            return r2;
        }
    }

    private String z() {
        Integer l2 = ((hw) this.a).l(8);
        if (l2 == null) {
            return null;
        }
        return String.format(C0201.m82(18414), Integer.valueOf((l2.intValue() & -16777216) >> 24), Integer.valueOf((l2.intValue() & 15728640) >> 20), Integer.valueOf((l2.intValue() & 983040) >> 16));
    }

    @Override // defpackage.as
    public String f(int i2) {
        if (i2 == 8) {
            return z();
        }
        if (i2 == 12) {
            return y();
        }
        if (i2 == 40) {
            return x();
        }
        if (i2 == 64) {
            return A();
        }
        if (i2 <= 538976288 || i2 >= 2054847098) {
            return super.f(i2);
        }
        return B(i2);
    }
}
