package defpackage;

import defpackage.is;
import java.text.DecimalFormat;
import vigqyno.C0201;

/* renamed from: hs  reason: default package */
/* compiled from: BmpHeaderDescriptor */
public class hs extends as<is> {
    public hs(is isVar) {
        super(isVar);
    }

    public static String v(long j) {
        double d = (double) j;
        Double.isNaN(d);
        return new DecimalFormat(C0201.m82(20789)).format(Double.valueOf(d / 65536.0d));
    }

    public static String w(Long l) {
        if (l == null) {
            return null;
        }
        return v(l.longValue());
    }

    public static String x(long j, int i) {
        return String.format(C0201.m82(20790) + i + C0201.m82(20791), Long.valueOf(j));
    }

    public static String y(Long l, int i) {
        if (l == null) {
            return null;
        }
        return x(l.longValue(), i);
    }

    public String A() {
        is.c W = ((is) this.a).W();
        if (W == null) {
            return null;
        }
        return W.toString();
    }

    public String B() {
        is.d X = ((is) this.a).X();
        if (X == null) {
            return null;
        }
        return X.toString();
    }

    public String C() {
        is.e Y = ((is) this.a).Y();
        if (Y != null) {
            return Y.toString();
        }
        Integer l = ((is) this.a).l(5);
        if (l == null) {
            return null;
        }
        return C0201.m82(20792) + Integer.toHexString(l.intValue());
    }

    public String D() {
        is.f Z = ((is) this.a).Z();
        if (Z == null) {
            return null;
        }
        return Z.toString();
    }

    public String E() {
        is.g a0 = ((is) this.a).a0();
        if (a0 == null) {
            return null;
        }
        return a0.toString();
    }

    @Override // defpackage.as
    public String f(int i) {
        if (i == -2) {
            return z();
        }
        if (i == 5) {
            return C();
        }
        switch (i) {
            case 10:
                return D();
            case 11:
                return A();
            case 12:
            case 13:
            case 14:
            case 15:
                return y(((is) this.a).m(i), 8);
            case 16:
                return B();
            case 17:
            case 18:
            case 19:
                return w(((is) this.a).m(i));
            case 20:
                return E();
            default:
                return super.f(i);
        }
    }

    public String z() {
        is.b V = ((is) this.a).V();
        if (V == null) {
            return null;
        }
        return V.toString();
    }
}
