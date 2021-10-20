package defpackage;

import vigqyno.C0201;

/* renamed from: vu  reason: default package */
/* compiled from: OlympusRawDevelopmentMakernoteDescriptor */
public class vu extends as<wu> {
    public vu(wu wuVar) {
        super(wuVar);
    }

    public String A() {
        return u(0, 4);
    }

    @Override // defpackage.as
    public String f(int i) {
        if (i == 0) {
            return A();
        }
        switch (i) {
            case 264:
                return v();
            case 265:
                return x();
            case 266:
                return y();
            case 267:
                return w();
            case 268:
                return z();
            default:
                return super.f(i);
        }
    }

    public String v() {
        return m(264, C0201.m82(13543), C0201.m82(13544), C0201.m82(13545));
    }

    public String w() {
        Integer l = ((wu) this.a).l(267);
        if (l == null) {
            return null;
        }
        int intValue = l.intValue();
        if (intValue == 0) {
            return C0201.m82(13550);
        }
        if (intValue == 1) {
            return C0201.m82(13549);
        }
        if (intValue == 6 || intValue == 8) {
            return C0201.m82(13548);
        }
        return C0201.m82(13546) + l + C0201.m82(13547);
    }

    public String x() {
        return m(265, C0201.m82(13551), C0201.m82(13552), C0201.m82(13553), C0201.m82(13554));
    }

    public String y() {
        Integer l = ((wu) this.a).l(266);
        if (l == null) {
            return null;
        }
        if (l.intValue() == 0) {
            return C0201.m82(13555);
        }
        StringBuilder sb = new StringBuilder();
        int intValue = l.intValue();
        if ((intValue & 1) != 0) {
            sb.append(C0201.m82(13556));
        }
        if (((intValue >> 1) & 1) != 0) {
            sb.append(C0201.m82(13557));
        }
        if (((intValue >> 2) & 1) != 0) {
            sb.append(C0201.m82(13558));
        }
        return sb.substring(0, sb.length() - 2);
    }

    public String z() {
        Integer l = ((wu) this.a).l(268);
        if (l == null) {
            return null;
        }
        if (l.intValue() == 0) {
            return C0201.m82(13559);
        }
        StringBuilder sb = new StringBuilder();
        int intValue = l.intValue();
        if ((intValue & 1) != 0) {
            sb.append(C0201.m82(13560));
        }
        if (((intValue >> 1) & 1) != 0) {
            sb.append(C0201.m82(13561));
        }
        if (((intValue >> 2) & 1) != 0) {
            sb.append(C0201.m82(13562));
        }
        if (((intValue >> 3) & 1) != 0) {
            sb.append(C0201.m82(13563));
        }
        if (((intValue >> 4) & 1) != 0) {
            sb.append(C0201.m82(13564));
        }
        if (((intValue >> 5) & 1) != 0) {
            sb.append(C0201.m82(13565));
        }
        if (((intValue >> 6) & 1) != 0) {
            sb.append(C0201.m82(13566));
        }
        if (((intValue >> 7) & 1) != 0) {
            sb.append(C0201.m82(13567));
        }
        return sb.substring(0, sb.length() - 2);
    }
}
