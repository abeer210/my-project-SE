package defpackage;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;
import java.util.SimpleTimeZone;
import vigqyno.C0188;
import vigqyno.C0201;

/* renamed from: b9  reason: default package */
public final class b9 {
    public static s8 a(String str) throws t8 {
        h9 h9Var = new h9();
        b(str, h9Var);
        return h9Var;
    }

    /* JADX WARNING: Removed duplicated region for block: B:128:0x0281 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x0282  */
    public static s8 b(String str, s8 s8Var) throws t8 {
        int i;
        int i2;
        int i3;
        if (str == null) {
            throw new t8(C0201.m82(2211), 4);
        } else if (str.length() == 0) {
            return s8Var;
        } else {
            f9 f9Var = new f9(str);
            int i4 = 0;
            if (f9Var.b(0) == '-') {
                f9Var.f();
            }
            int c = f9Var.c(C0201.m82(2191), 9999);
            if (!f9Var.d() || f9Var.a() == '-') {
                if (f9Var.b(0) == '-') {
                    c = -c;
                }
                s8Var.setYear(c);
                if (!f9Var.d()) {
                    return s8Var;
                }
                f9Var.f();
                int c2 = f9Var.c(C0201.m82(2193), 12);
                if (!f9Var.d() || f9Var.a() == '-') {
                    s8Var.setMonth(c2);
                    if (!f9Var.d()) {
                        return s8Var;
                    }
                    f9Var.f();
                    int c3 = f9Var.c(C0201.m82(2195), 31);
                    if (!f9Var.d() || f9Var.a() == 'T') {
                        s8Var.V(c3);
                        if (!f9Var.d()) {
                            return s8Var;
                        }
                        f9Var.f();
                        s8Var.z(f9Var.c(C0201.m82(2197), 23));
                        if (!f9Var.d()) {
                            return s8Var;
                        }
                        if (f9Var.a() == ':') {
                            f9Var.f();
                            int c4 = f9Var.c(C0201.m82(2198), 59);
                            if (!f9Var.d() || f9Var.a() == ':' || f9Var.a() == 'Z' || f9Var.a() == '+' || f9Var.a() == '-') {
                                s8Var.D(c4);
                            } else {
                                throw new t8(C0201.m82(2199), 5);
                            }
                        }
                        if (!f9Var.d()) {
                            return s8Var;
                        }
                        if (f9Var.d() && f9Var.a() == ':') {
                            f9Var.f();
                            int c5 = f9Var.c(C0201.m82(2200), 59);
                            if (!f9Var.d() || f9Var.a() == '.' || f9Var.a() == 'Z' || f9Var.a() == '+' || f9Var.a() == '-') {
                                s8Var.U0(c5);
                                if (f9Var.a() == '.') {
                                    f9Var.f();
                                    int e = f9Var.e();
                                    int c6 = f9Var.c(C0201.m82(2202), 999999999);
                                    if (!f9Var.d() || f9Var.a() == 'Z' || f9Var.a() == '+' || f9Var.a() == '-') {
                                        int e2 = f9Var.e() - e;
                                        while (e2 > 9) {
                                            c6 /= 10;
                                            e2--;
                                        }
                                        while (e2 < 9) {
                                            c6 *= 10;
                                            e2++;
                                        }
                                        s8Var.d0(c6);
                                    } else {
                                        throw new t8(C0201.m82(2203), 5);
                                    }
                                }
                            } else {
                                throw new t8(C0201.m82(2201), 5);
                            }
                        } else if (!(f9Var.a() == 'Z' || f9Var.a() == '+' || f9Var.a() == '-')) {
                            throw new t8(C0201.m82(2204), 5);
                        }
                        if (!f9Var.d()) {
                            return s8Var;
                        }
                        if (f9Var.a() == 'Z') {
                            f9Var.f();
                        } else if (f9Var.d()) {
                            if (f9Var.a() == '+') {
                                i3 = 1;
                            } else if (f9Var.a() == '-') {
                                i3 = -1;
                            } else {
                                throw new t8(C0201.m82(2208), 5);
                            }
                            f9Var.f();
                            int c7 = f9Var.c(C0201.m82(2205), 23);
                            if (!f9Var.d()) {
                                i4 = c7;
                                i = i3;
                                i2 = 0;
                            } else if (f9Var.a() == ':') {
                                f9Var.f();
                                i2 = f9Var.c(C0201.m82(2206), 59);
                                i4 = c7;
                                i = i3;
                            } else {
                                throw new t8(C0201.m82(2207), 5);
                            }
                            s8Var.setTimeZone(new SimpleTimeZone(((i4 * 3600 * C0188.f18) + (i2 * 60 * C0188.f18)) * i, C0201.m82(2209)));
                            if (f9Var.d()) {
                                return s8Var;
                            }
                            throw new t8(C0201.m82(2210), 5);
                        }
                        i2 = 0;
                        i = 0;
                        s8Var.setTimeZone(new SimpleTimeZone(((i4 * 3600 * C0188.f18) + (i2 * 60 * C0188.f18)) * i, C0201.m82(2209)));
                        if (f9Var.d()) {
                        }
                    } else {
                        throw new t8(C0201.m82(2196), 5);
                    }
                } else {
                    throw new t8(C0201.m82(2194), 5);
                }
            } else {
                throw new t8(C0201.m82(2192), 5);
            }
        }
    }

    public static String c(s8 s8Var) {
        StringBuffer stringBuffer = new StringBuffer();
        if (s8Var.h1()) {
            DecimalFormat decimalFormat = new DecimalFormat(C0201.m82(2212), new DecimalFormatSymbols(Locale.ENGLISH));
            stringBuffer.append(decimalFormat.format((long) s8Var.getYear()));
            if (s8Var.getMonth() == 0) {
                return stringBuffer.toString();
            }
            decimalFormat.applyPattern(C0201.m82(2213));
            stringBuffer.append(decimalFormat.format((long) s8Var.getMonth()));
            if (s8Var.getDay() == 0) {
                return stringBuffer.toString();
            }
            stringBuffer.append(decimalFormat.format((long) s8Var.getDay()));
            if (s8Var.T()) {
                stringBuffer.append('T');
                decimalFormat.applyPattern(C0201.m82(2214));
                stringBuffer.append(decimalFormat.format((long) s8Var.getHour()));
                stringBuffer.append(':');
                stringBuffer.append(decimalFormat.format((long) s8Var.getMinute()));
                if (!(s8Var.getSecond() == 0 && s8Var.G() == 0)) {
                    double second = (double) s8Var.getSecond();
                    double G = (double) s8Var.G();
                    Double.isNaN(G);
                    Double.isNaN(second);
                    decimalFormat.applyPattern(C0201.m82(2215));
                    stringBuffer.append(decimalFormat.format(second + (G / 1.0E9d)));
                }
                if (s8Var.P()) {
                    int offset = s8Var.getTimeZone().getOffset(s8Var.Q().getTimeInMillis());
                    if (offset == 0) {
                        stringBuffer.append('Z');
                    } else {
                        int i = offset / 3600000;
                        int abs = Math.abs((offset % 3600000) / 60000);
                        decimalFormat.applyPattern(C0201.m82(2216));
                        stringBuffer.append(decimalFormat.format((long) i));
                        decimalFormat.applyPattern(C0201.m82(2217));
                        stringBuffer.append(decimalFormat.format((long) abs));
                    }
                }
            }
        }
        return stringBuffer.toString();
    }
}
