package defpackage;

import defpackage.tr;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Array;
import java.math.RoundingMode;
import java.nio.charset.Charset;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import vigqyno.C0201;

/* renamed from: as  reason: default package */
/* compiled from: TagDescriptor */
public class as<T extends tr> {
    public final T a;

    public as(T t) {
        this.a = t;
    }

    public static String a(int[] iArr, int i) {
        if (iArr == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        int i2 = 0;
        while (i2 < 4 && i2 < iArr.length) {
            if (i2 == i) {
                sb.append('.');
            }
            char c = (char) iArr[i2];
            if (c < '0') {
                c = (char) (c + '0');
            }
            if (i2 != 0 || c != '0') {
                sb.append(c);
            }
            i2++;
        }
        return sb.toString();
    }

    public static String h(double d) {
        DecimalFormat decimalFormat = new DecimalFormat(C0201.m82(3908));
        decimalFormat.setRoundingMode(RoundingMode.HALF_UP);
        return C0201.m82(3909) + decimalFormat.format(d);
    }

    public static String i(double d) {
        DecimalFormat decimalFormat = new DecimalFormat(C0201.m82(3910));
        decimalFormat.setRoundingMode(RoundingMode.HALF_UP);
        return decimalFormat.format(d) + C0201.m82(3911);
    }

    public String b(int i) {
        byte[] e = this.a.e(i);
        if (e == null) {
            return null;
        }
        int length = e.length;
        int i2 = 0;
        while (true) {
            if (i2 >= e.length) {
                break;
            }
            int i3 = e[i2] & 255;
            if (i3 == 0 || i3 > 127) {
                length = i2;
            } else {
                i2++;
            }
        }
        return new String(e, 0, length);
    }

    public String c(int i, Object... objArr) {
        Integer l = this.a.l(i);
        if (l == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; objArr.length > i2; i2++) {
            Object obj = objArr[i2];
            if (obj != null) {
                char c = (l.intValue() & 1) == 1 ? (char) 1 : 0;
                if (obj instanceof String[]) {
                    arrayList.add(((String[]) obj)[c]);
                } else if (c != 0 && (obj instanceof String)) {
                    arrayList.add((String) obj);
                }
            }
            l = Integer.valueOf(l.intValue() >> 1);
        }
        return rr.a(arrayList, C0201.m82(3912));
    }

    public String d(int i) {
        byte[] e = this.a.e(i);
        if (e == null) {
            return null;
        }
        Object[] objArr = new Object[2];
        objArr[0] = Integer.valueOf(e.length);
        objArr[1] = e.length == 1 ? C0201.m82(3913) : C0201.m82(3914);
        return String.format(C0201.m82(3915), objArr);
    }

    public String e(int i, int i2) {
        mr p = this.a.p(i);
        if (p == null) {
            return null;
        }
        return String.format(C0201.m82(3916) + i2 + C0201.m82(3917), Double.valueOf(p.doubleValue()));
    }

    public String f(int i) {
        int length;
        Object o = this.a.o(i);
        if (o == null) {
            return null;
        }
        if (o.getClass().isArray() && (length = Array.getLength(o)) > 16) {
            return String.format(C0201.m82(3918), Integer.valueOf(length));
        }
        if (o instanceof Date) {
            return new SimpleDateFormat(C0201.m82(3919)).format((Date) o).replaceAll(C0201.m82(3920), C0201.m82(3921));
        }
        return this.a.r(i);
    }

    public String g(int i) {
        Long m = this.a.m(i);
        if (m == null) {
            return null;
        }
        return new Date(m.longValue()).toString();
    }

    public String j(int i, String str) {
        Integer l = this.a.l(i);
        if (l == null) {
            return null;
        }
        return String.format(str, l);
    }

    public String k(int i, String str) {
        String r = this.a.r(i);
        if (r == null) {
            return null;
        }
        return String.format(str, r);
    }

    public String l(int i, int i2, String... strArr) {
        String str;
        Long m = this.a.m(i);
        if (m == null) {
            return null;
        }
        long longValue = m.longValue() - ((long) i2);
        if (longValue >= 0 && longValue < ((long) strArr.length) && (str = strArr[(int) longValue]) != null) {
            return str;
        }
        return C0201.m82(3922) + m + C0201.m82(3923);
    }

    public String m(int i, String... strArr) {
        return l(i, 0, strArr);
    }

    public String n(int i) {
        mr[] q = this.a.q(i);
        if (q == null || q.length != 4) {
            return null;
        }
        if (q[0].k() && q[2].k()) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        boolean e = q[0].e(q[1]);
        String r5 = C0201.m82(3924);
        if (e) {
            sb.append(q[0].l(true));
            sb.append(r5);
        } else {
            sb.append(q[0].l(true));
            sb.append('-');
            sb.append(q[1].l(true));
            sb.append(r5);
        }
        if (!q[2].k()) {
            sb.append(' ');
            DecimalFormat decimalFormat = new DecimalFormat(C0201.m82(3925));
            decimalFormat.setRoundingMode(RoundingMode.HALF_UP);
            if (q[2].e(q[3])) {
                sb.append(h(q[2].doubleValue()));
            } else {
                sb.append(C0201.m82(3926));
                sb.append(decimalFormat.format(q[2].doubleValue()));
                sb.append('-');
                sb.append(decimalFormat.format(q[3].doubleValue()));
            }
        }
        return sb.toString();
    }

    public String o(short s) {
        if (s == 0) {
            return C0201.m82(3948);
        }
        if (s == 1) {
            return C0201.m82(3947);
        }
        if (s == 2) {
            return C0201.m82(3946);
        }
        if (s == 3) {
            return C0201.m82(3945);
        }
        if (s == 4) {
            return C0201.m82(3944);
        }
        if (s == 255) {
            return C0201.m82(3943);
        }
        switch (s) {
            case 9:
                return C0201.m82(3942);
            case 10:
                return C0201.m82(3941);
            case 11:
                return C0201.m82(3940);
            case 12:
                return C0201.m82(3939);
            case 13:
                return C0201.m82(3938);
            case 14:
                return C0201.m82(3937);
            case 15:
                return C0201.m82(3936);
            case 16:
                return C0201.m82(3935);
            case 17:
                return C0201.m82(3934);
            case 18:
                return C0201.m82(3933);
            case 19:
                return C0201.m82(3932);
            case 20:
                return C0201.m82(3931);
            case 21:
                return C0201.m82(3930);
            case 22:
                return C0201.m82(3929);
            case 23:
                return C0201.m82(3928);
            case 24:
                return C0201.m82(3927);
            default:
                return f(s);
        }
    }

    public String p(int i) {
        return l(i, 1, C0201.m82(3949), C0201.m82(3950), C0201.m82(3951), C0201.m82(3952), C0201.m82(3953), C0201.m82(3954), C0201.m82(3955), C0201.m82(3956));
    }

    public String q(int i) {
        mr p = this.a.p(i);
        if (p != null) {
            return p.l(true);
        }
        Double h = this.a.h(i);
        if (h != null) {
            return new DecimalFormat(C0201.m82(3957)).format(h);
        }
        return null;
    }

    public String r(int i) {
        Float i2 = this.a.i(i);
        if (i2 == null) {
            return null;
        }
        float floatValue = i2.floatValue();
        String r2 = C0201.m82(3958);
        if (floatValue <= 1.0f) {
            double floatValue2 = (double) i2.floatValue();
            double log = Math.log(2.0d);
            Double.isNaN(floatValue2);
            double exp = (double) ((float) (1.0d / Math.exp(floatValue2 * log)));
            Double.isNaN(exp);
            DecimalFormat decimalFormat = new DecimalFormat(C0201.m82(3959));
            decimalFormat.setRoundingMode(RoundingMode.HALF_UP);
            return decimalFormat.format((double) (((float) Math.round(exp * 10.0d)) / 10.0f)) + r2;
        }
        double floatValue3 = (double) i2.floatValue();
        double log2 = Math.log(2.0d);
        Double.isNaN(floatValue3);
        int exp2 = (int) Math.exp(floatValue3 * log2);
        return C0201.m82(3960) + exp2 + r2;
    }

    public String s(int i) {
        mr p = this.a.p(i);
        if (p == null) {
            return null;
        }
        return p.l(true);
    }

    public String t(int i, Charset charset) {
        byte[] e = this.a.e(i);
        if (e == null) {
            return null;
        }
        try {
            return new String(e, charset.name()).trim();
        } catch (UnsupportedEncodingException unused) {
            return null;
        }
    }

    public String u(int i, int i2) {
        int[] k = this.a.k(i);
        if (k == null) {
            return null;
        }
        return a(k, i2);
    }
}
