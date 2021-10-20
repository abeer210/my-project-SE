package com.horcrux.svg;

import android.graphics.Path;
import android.graphics.RectF;
import java.util.ArrayList;
import vigqyno.C0201;

/* compiled from: PathParser */
public class r {
    public static float a;
    private static int b;
    private static int c;
    private static String d;
    private static Path e;
    public static ArrayList<q> f;
    private static float g;
    private static float h;
    private static float i;
    private static float j;
    private static float k;
    private static float l;
    private static boolean m;

    private static void A(float f2, float f3, float f4, float f5) {
        i = f2;
        j = f3;
        e((g * 2.0f) - i, (h * 2.0f) - j, f2, f3, f4, f5);
    }

    private static void B(float f2, float f3) {
        C(f2 + g, f3 + h);
    }

    private static void C(float f2, float f3) {
        u((g * 2.0f) - i, (h * 2.0f) - j, f2, f3);
    }

    private static void a(float f2, float f3, float f4, boolean z, boolean z2, float f5, float f6) {
        b(f2, f3, f4, z, z2, f5 + g, f6 + h);
    }

    private static void b(float f2, float f3, float f4, boolean z, boolean z2, float f5, float f6) {
        float f7;
        float f8;
        float f9;
        float f10 = g;
        float f11 = h;
        float abs = Math.abs(f3 == 0.0f ? f2 == 0.0f ? f6 - f11 : f2 : f3);
        float abs2 = Math.abs(f2 == 0.0f ? f5 - f10 : f2);
        if (abs2 == 0.0f || abs == 0.0f || (f5 == f10 && f6 == f11)) {
            l(f5, f6);
            return;
        }
        float radians = (float) Math.toRadians((double) f4);
        double d2 = (double) radians;
        float cos = (float) Math.cos(d2);
        float sin = (float) Math.sin(d2);
        float f12 = f5 - f10;
        float f13 = f6 - f11;
        float f14 = ((cos * f12) / 2.0f) + ((sin * f13) / 2.0f);
        float f15 = -sin;
        float f16 = ((f15 * f12) / 2.0f) + ((cos * f13) / 2.0f);
        float f17 = abs2 * abs2;
        float f18 = f17 * abs * abs;
        float f19 = abs * abs * f14 * f14;
        float f20 = f17 * f16 * f16;
        float f21 = (f18 - f20) - f19;
        if (f21 < 0.0f) {
            f7 = f15;
            float sqrt = (float) Math.sqrt((double) (1.0f - (f21 / f18)));
            abs2 *= sqrt;
            abs *= sqrt;
            f8 = f12 / 2.0f;
            f9 = f13 / 2.0f;
        } else {
            f7 = f15;
            float sqrt2 = (float) Math.sqrt((double) (f21 / (f20 + f19)));
            if (z == z2) {
                sqrt2 = -sqrt2;
            }
            float f22 = (((-sqrt2) * f16) * abs2) / abs;
            float f23 = ((sqrt2 * f14) * abs) / abs2;
            f8 = ((cos * f22) - (sin * f23)) + (f12 / 2.0f);
            f9 = (f13 / 2.0f) + (f22 * sin) + (f23 * cos);
        }
        float f24 = cos / abs2;
        float f25 = sin / abs2;
        float f26 = f7 / abs;
        float f27 = cos / abs;
        float f28 = -f8;
        float f29 = -f9;
        float atan2 = (float) Math.atan2((double) ((f26 * f28) + (f27 * f29)), (double) ((f28 * f24) + (f29 * f25)));
        float f30 = f12 - f8;
        float f31 = f13 - f9;
        float atan22 = (float) Math.atan2((double) ((f26 * f30) + (f27 * f31)), (double) ((f24 * f30) + (f25 * f31)));
        float f32 = f8 + f10;
        float f33 = f9 + f11;
        float f34 = f12 + f10;
        float f35 = f13 + f11;
        w();
        i = f34;
        g = f34;
        j = f35;
        h = f35;
        if (abs2 == abs && radians == 0.0f) {
            float degrees = (float) Math.toDegrees((double) atan2);
            float abs3 = Math.abs((degrees - ((float) Math.toDegrees((double) atan22))) % 360.0f);
            if (!z ? abs3 > 180.0f : abs3 < 180.0f) {
                abs3 = 360.0f - abs3;
            }
            if (!z2) {
                abs3 = -abs3;
            }
            float f36 = a;
            e.arcTo(new RectF((f32 - abs2) * f36, (f33 - abs2) * f36, (f32 + abs2) * f36, (f33 + abs2) * f36), degrees, abs3);
            f.add(new q(f.kCGPathElementAddCurveToPoint, new u[]{new u((double) f34, (double) f35)}));
            return;
        }
        c(f32, f33, abs2, abs, atan2, atan22, z2, radians);
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0071 A[LOOP:0: B:10:0x006f->B:11:0x0071, LOOP_END] */
    private static void c(float f2, float f3, float f4, float f5, float f6, float f7, boolean z, float f8) {
        int ceil;
        int i2;
        double d2;
        float f9 = f6;
        double d3 = (double) f8;
        float cos = (float) Math.cos(d3);
        float sin = (float) Math.sin(d3);
        float f10 = cos * f4;
        float f11 = (-sin) * f5;
        float f12 = sin * f4;
        float f13 = cos * f5;
        float f14 = f7 - f9;
        if (f14 >= 0.0f || !z) {
            if (f14 > 0.0f && !z) {
                double d4 = (double) f14;
                Double.isNaN(d4);
                d2 = d4 - 6.283185307179586d;
            }
            double d5 = (double) f14;
            Double.isNaN(d5);
            ceil = (int) Math.ceil(Math.abs(v(d5 / 1.5707963267948966d)));
            float f15 = f14 / ((float) ceil);
            float tan = (float) (Math.tan((double) (f15 / 4.0f)) * 1.3333333333333333d);
            double d6 = (double) f9;
            float cos2 = (float) Math.cos(d6);
            float sin2 = (float) Math.sin(d6);
            i2 = 0;
            while (i2 < ceil) {
                float f16 = cos2 - (tan * sin2);
                float f17 = sin2 + (cos2 * tan);
                float f18 = f9 + f15;
                double d7 = (double) f18;
                float cos3 = (float) Math.cos(d7);
                float sin3 = (float) Math.sin(d7);
                float f19 = (tan * sin3) + cos3;
                float f20 = sin3 - (tan * cos3);
                float f21 = f2 + (f10 * f16) + (f11 * f17);
                float f22 = f3 + (f16 * f12) + (f17 * f13);
                float f23 = f2 + (f10 * f19) + (f11 * f20);
                float f24 = f3 + (f19 * f12) + (f20 * f13);
                float f25 = f2 + (f10 * cos3) + (f11 * sin3);
                float f26 = f3 + (f12 * cos3) + (f13 * sin3);
                Path path = e;
                float f27 = a;
                path.cubicTo(f21 * f27, f22 * f27, f23 * f27, f24 * f27, f25 * f27, f26 * f27);
                f.add(new q(f.kCGPathElementAddCurveToPoint, new u[]{new u((double) f21, (double) f22), new u((double) f23, (double) f24), new u((double) f25, (double) f26)}));
                i2++;
                f9 = f18;
                f15 = f15;
                f12 = f12;
                cos2 = cos3;
                f10 = f10;
                f13 = f13;
                f11 = f11;
                ceil = ceil;
                tan = tan;
                sin2 = sin3;
            }
        }
        double d8 = (double) f14;
        Double.isNaN(d8);
        d2 = d8 + 6.283185307179586d;
        f14 = (float) d2;
        double d52 = (double) f14;
        Double.isNaN(d52);
        ceil = (int) Math.ceil(Math.abs(v(d52 / 1.5707963267948966d)));
        float f152 = f14 / ((float) ceil);
        float tan2 = (float) (Math.tan((double) (f152 / 4.0f)) * 1.3333333333333333d);
        double d62 = (double) f9;
        float cos22 = (float) Math.cos(d62);
        float sin22 = (float) Math.sin(d62);
        i2 = 0;
        while (i2 < ceil) {
        }
    }

    private static void d() {
        if (m) {
            g = k;
            h = l;
            m = false;
            e.close();
            f.add(new q(f.kCGPathElementCloseSubpath, new u[]{new u((double) g, (double) h)}));
        }
    }

    private static void e(float f2, float f3, float f4, float f5, float f6, float f7) {
        w();
        g = f6;
        h = f7;
        Path path = e;
        float f8 = a;
        path.cubicTo(f2 * f8, f3 * f8, f4 * f8, f5 * f8, f6 * f8, f7 * f8);
        f.add(new q(f.kCGPathElementAddCurveToPoint, new u[]{new u((double) f2, (double) f3), new u((double) f4, (double) f5), new u((double) f6, (double) f7)}));
    }

    private static void f(float f2, float f3, float f4, float f5, float f6, float f7) {
        float f8 = g;
        float f9 = h;
        g(f2 + f8, f3 + f9, f4 + f8, f5 + f9, f6 + f8, f7 + f9);
    }

    private static void g(float f2, float f3, float f4, float f5, float f6, float f7) {
        i = f4;
        j = f5;
        e(f2, f3, f4, f5, f6, f7);
    }

    private static boolean h(char c2) {
        return Character.isUpperCase(c2);
    }

    private static boolean i(char c2) {
        switch (c2) {
            case 'A':
            case 'C':
            case 'H':
            case 'L':
            case 'M':
            case 'Q':
            case 'S':
            case 'T':
            case 'V':
            case 'Z':
            case 'a':
            case 'c':
            case 'h':
            case 'l':
            case 'm':
            case 'q':
            case 's':
            case 't':
            case 'v':
            case 'z':
                return true;
            default:
                return false;
        }
    }

    private static boolean j(char c2) {
        return (c2 >= '0' && c2 <= '9') || c2 == '.' || c2 == '-' || c2 == '+';
    }

    private static void k(float f2, float f3) {
        l(f2 + g, f3 + h);
    }

    private static void l(float f2, float f3) {
        w();
        g = f2;
        i = f2;
        h = f3;
        j = f3;
        Path path = e;
        float f4 = a;
        path.lineTo(f2 * f4, f4 * f3);
        f.add(new q(f.kCGPathElementAddLineToPoint, new u[]{new u((double) f2, (double) f3)}));
    }

    private static void m(float f2, float f3) {
        n(f2 + g, f3 + h);
    }

    private static void n(float f2, float f3) {
        g = f2;
        i = f2;
        k = f2;
        h = f3;
        j = f3;
        l = f3;
        Path path = e;
        float f4 = a;
        path.moveTo(f2 * f4, f4 * f3);
        f.add(new q(f.kCGPathElementMoveToPoint, new u[]{new u((double) f2, (double) f3)}));
    }

    /* JADX WARNING: Removed duplicated region for block: B:36:0x009d  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00a6  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00b3  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00c8  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00dd  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00ea  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00f7  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0100  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x011d  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x013e  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0143  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x014e  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x015b  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x016f  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0183  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x018f  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x019b  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x01a5  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x01c1  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x01e2  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0097 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x002c A[SYNTHETIC] */
    public static Path o(String str) {
        f = new ArrayList<>();
        e = new Path();
        c = str.length();
        d = str;
        b = 0;
        g = 0.0f;
        h = 0.0f;
        i = 0.0f;
        j = 0.0f;
        k = 0.0f;
        l = 0.0f;
        m = false;
        char c2 = ' ';
        while (b < c) {
            y();
            if (b >= c) {
                return e;
            }
            boolean z = true;
            boolean z2 = c2 != ' ';
            char charAt = d.charAt(b);
            String r9 = C0201.m82(26750);
            if (z2 || charAt == 'M' || charAt == 'm') {
                if (i(charAt)) {
                    b++;
                    c2 = charAt;
                } else if (!j(charAt) || !z2) {
                    throw new Error(r9);
                } else if (c2 == 'Z' || c2 == 'z') {
                    throw new Error(r9);
                } else if (c2 == 'M' || c2 == 'm') {
                    c2 = h(c2) ? 'L' : 'l';
                    boolean h2 = h(c2);
                    switch (c2) {
                        case 'A':
                            b(q(), q(), q(), p(), p(), q(), q());
                            break;
                        case 'C':
                            g(q(), q(), q(), q(), q(), q());
                            break;
                        case 'H':
                            l(q(), h);
                            break;
                        case 'L':
                            l(q(), q());
                            break;
                        case 'M':
                            n(q(), q());
                            break;
                        case 'Q':
                            u(q(), q(), q(), q());
                            break;
                        case 'S':
                            A(q(), q(), q(), q());
                            break;
                        case 'T':
                            C(q(), q());
                            break;
                        case 'V':
                            l(g, q());
                            break;
                        case 'Z':
                        case 'z':
                            d();
                            break;
                        case 'a':
                            a(q(), q(), q(), p(), p(), q(), q());
                            break;
                        case 'c':
                            f(q(), q(), q(), q(), q(), q());
                            break;
                        case 'h':
                            k(q(), 0.0f);
                            break;
                        case 'l':
                            k(q(), q());
                            break;
                        case 'm':
                            m(q(), q());
                            break;
                        case 'q':
                            t(q(), q(), q(), q());
                            break;
                        case 's':
                            z(q(), q(), q(), q());
                            break;
                        case 't':
                            B(q(), q());
                            break;
                        case 'v':
                            k(0.0f, q());
                            break;
                        default:
                            throw new Error(r9);
                    }
                    if (z) {
                        c2 = h2 ? 'M' : 'm';
                    }
                }
                z = false;
                boolean h22 = h(c2);
                switch (c2) {
                    case 'A':
                        break;
                    case 'C':
                        break;
                    case 'H':
                        break;
                    case 'L':
                        break;
                    case 'M':
                        break;
                    case 'Q':
                        break;
                    case 'S':
                        break;
                    case 'T':
                        break;
                    case 'V':
                        break;
                    case 'Z':
                    case 'z':
                        break;
                    case 'a':
                        break;
                    case 'c':
                        break;
                    case 'h':
                        break;
                    case 'l':
                        break;
                    case 'm':
                        break;
                    case 'q':
                        break;
                    case 's':
                        break;
                    case 't':
                        break;
                    case 'v':
                        break;
                }
                if (z) {
                }
            } else {
                throw new Error(r9);
            }
        }
        return e;
    }

    private static boolean p() {
        y();
        char charAt = d.charAt(b);
        if (charAt == '0' || charAt == '1') {
            int i2 = b + 1;
            b = i2;
            if (i2 < c && d.charAt(i2) == ',') {
                b++;
            }
            y();
            if (charAt == '1') {
                return true;
            }
            return false;
        }
        throw new Error(C0201.m82(26751));
    }

    private static float q() {
        if (b != c) {
            float s = s();
            y();
            r();
            return s;
        }
        throw new Error(C0201.m82(26752));
    }

    private static void r() {
        int i2 = b;
        if (i2 < c && d.charAt(i2) == ',') {
            b++;
        }
    }

    private static float s() {
        char charAt;
        y();
        int i2 = b;
        int i3 = c;
        String r2 = C0201.m82(26753);
        if (i2 != i3) {
            char charAt2 = d.charAt(i2);
            if (charAt2 == '-' || charAt2 == '+') {
                int i4 = b + 1;
                b = i4;
                charAt2 = d.charAt(i4);
            }
            if (charAt2 >= '0' && charAt2 <= '9') {
                x();
                int i5 = b;
                if (i5 < c) {
                    charAt2 = d.charAt(i5);
                }
            } else if (charAt2 != '.') {
                throw new Error(r2);
            }
            if (charAt2 == '.') {
                b++;
                x();
                int i6 = b;
                if (i6 < c) {
                    charAt2 = d.charAt(i6);
                }
            }
            if (charAt2 == 'e' || charAt2 == 'E') {
                int i7 = b;
                if (!(i7 + 1 >= c || (charAt = d.charAt(i7 + 1)) == 'm' || charAt == 'x')) {
                    int i8 = b + 1;
                    b = i8;
                    char charAt3 = d.charAt(i8);
                    if (charAt3 == '+' || charAt3 == '-') {
                        b++;
                        x();
                    } else if (charAt3 < '0' || charAt3 > '9') {
                        throw new Error(r2);
                    } else {
                        x();
                    }
                }
            }
            float parseFloat = Float.parseFloat(d.substring(i2, b));
            if (!Float.isInfinite(parseFloat) && !Float.isNaN(parseFloat)) {
                return parseFloat;
            }
            throw new Error(r2);
        }
        throw new Error(r2);
    }

    private static void t(float f2, float f3, float f4, float f5) {
        float f6 = g;
        float f7 = h;
        u(f2 + f6, f3 + f7, f4 + f6, f5 + f7);
    }

    private static void u(float f2, float f3, float f4, float f5) {
        i = f2;
        j = f3;
        float f6 = f2 * 2.0f;
        float f7 = f3 * 2.0f;
        float f8 = (g + f6) / 3.0f;
        float f9 = (h + f7) / 3.0f;
        e(f8, f9, (f4 + f6) / 3.0f, (f5 + f7) / 3.0f, f4, f5);
    }

    private static double v(double d2) {
        double pow = Math.pow(10.0d, 4.0d);
        double round = (double) Math.round(d2 * pow);
        Double.isNaN(round);
        return round / pow;
    }

    private static void w() {
        if (!m) {
            k = g;
            l = h;
            m = true;
        }
    }

    private static void x() {
        while (true) {
            int i2 = b;
            if (i2 < c && Character.isDigit(d.charAt(i2))) {
                b++;
            } else {
                return;
            }
        }
    }

    private static void y() {
        while (true) {
            int i2 = b;
            if (i2 < c && Character.isWhitespace(d.charAt(i2))) {
                b++;
            } else {
                return;
            }
        }
    }

    private static void z(float f2, float f3, float f4, float f5) {
        float f6 = g;
        float f7 = h;
        A(f2 + f6, f3 + f7, f4 + f6, f5 + f7);
    }
}
