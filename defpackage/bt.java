package defpackage;

import java.text.DecimalFormat;
import vigqyno.C0201;

/* renamed from: bt  reason: default package */
/* compiled from: GpsDescriptor */
public class bt extends as<ct> {
    public bt(ct ctVar) {
        super(ctVar);
    }

    private String H() {
        return u(0, 1);
    }

    public String A(int i) {
        String r = ((ct) this.a).r(i);
        if (r == null) {
            return null;
        }
        String trim = r.trim();
        if (C0201.m82(7170).equalsIgnoreCase(trim)) {
            return C0201.m82(7171);
        }
        if (C0201.m82(7172).equalsIgnoreCase(trim)) {
            return C0201.m82(7173);
        }
        return C0201.m82(7174) + trim + C0201.m82(7175);
    }

    public String B() {
        ir W = ((ct) this.a).W();
        if (W == null) {
            return null;
        }
        return ir.b(W.d());
    }

    public String C() {
        ir W = ((ct) this.a).W();
        if (W == null) {
            return null;
        }
        return ir.b(W.e());
    }

    public String D() {
        String r = ((ct) this.a).r(10);
        if (r == null) {
            return null;
        }
        String trim = r.trim();
        if (C0201.m82(7176).equalsIgnoreCase(trim)) {
            return C0201.m82(7177);
        }
        if (C0201.m82(7178).equalsIgnoreCase(trim)) {
            return C0201.m82(7179);
        }
        return C0201.m82(7180) + trim + C0201.m82(7181);
    }

    public String E() {
        String r = ((ct) this.a).r(12);
        if (r == null) {
            return null;
        }
        String trim = r.trim();
        if (C0201.m82(7182).equalsIgnoreCase(trim)) {
            return C0201.m82(7183);
        }
        if (C0201.m82(7184).equalsIgnoreCase(trim)) {
            return C0201.m82(7185);
        }
        if (C0201.m82(7186).equalsIgnoreCase(trim)) {
            return C0201.m82(7187);
        }
        return C0201.m82(7188) + trim + C0201.m82(7189);
    }

    public String F() {
        String r = ((ct) this.a).r(9);
        if (r == null) {
            return null;
        }
        String trim = r.trim();
        if (C0201.m82(7190).equalsIgnoreCase(trim)) {
            return C0201.m82(7191);
        }
        if (C0201.m82(7192).equalsIgnoreCase(trim)) {
            return C0201.m82(7193);
        }
        return C0201.m82(7194) + trim + C0201.m82(7195);
    }

    public String G() {
        mr[] q = ((ct) this.a).q(7);
        DecimalFormat decimalFormat = new DecimalFormat(C0201.m82(7196));
        if (q == null) {
            return null;
        }
        return String.format(C0201.m82(7197), Integer.valueOf(q[0].intValue()), Integer.valueOf(q[1].intValue()), decimalFormat.format(q[2].doubleValue()));
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0036  */
    @Override // defpackage.as
    public String f(int i) {
        if (i == 0) {
            return H();
        }
        if (i == 2) {
            return B();
        }
        if (i == 12) {
            return E();
        }
        if (i == 30) {
            return y();
        }
        if (i == 4) {
            return C();
        }
        if (i == 5) {
            return w();
        }
        if (i == 6) {
            return v();
        }
        if (i == 7) {
            return G();
        }
        if (i == 9) {
            return F();
        }
        if (i == 10) {
            return D();
        }
        switch (i) {
            case 14:
            case 16:
                return A(i);
            case 15:
            case 17:
                return z(i);
            default:
                switch (i) {
                    case 23:
                        break;
                    case 24:
                        break;
                    case 25:
                        return x();
                    default:
                        return super.f(i);
                }
        }
    }

    public String v() {
        mr p = ((ct) this.a).p(6);
        if (p == null) {
            return null;
        }
        return p.intValue() + C0201.m82(7198);
    }

    public String w() {
        return m(5, C0201.m82(7199), C0201.m82(7200));
    }

    public String x() {
        String r = ((ct) this.a).r(25);
        if (r == null) {
            return null;
        }
        String trim = r.trim();
        if (C0201.m82(7201).equalsIgnoreCase(trim)) {
            return C0201.m82(7202);
        }
        if (C0201.m82(7203).equalsIgnoreCase(trim)) {
            return C0201.m82(7204);
        }
        if (C0201.m82(7205).equalsIgnoreCase(trim)) {
            return C0201.m82(7206);
        }
        return C0201.m82(7207) + trim + C0201.m82(7208);
    }

    public String y() {
        return m(30, C0201.m82(7209), C0201.m82(7210));
    }

    public String z(int i) {
        mr p = ((ct) this.a).p(i);
        String format = p != null ? new DecimalFormat(C0201.m82(7211)).format(p.doubleValue()) : ((ct) this.a).r(i);
        if (format == null || format.trim().length() == 0) {
            return null;
        }
        return format.trim() + C0201.m82(7212);
    }
}
