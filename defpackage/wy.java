package defpackage;

import vigqyno.C0201;

/* renamed from: wy  reason: default package */
/* compiled from: QuickTimeVideoDescriptor */
public class wy extends ix {
    public wy(xy xyVar) {
        super(xyVar);
    }

    private String A() {
        Integer l = ((kx) this.a).l(11);
        if (l == null) {
            return null;
        }
        int intValue = l.intValue();
        if (intValue == 0) {
            return C0201.m82(16079);
        }
        if (intValue == 32) {
            return C0201.m82(16078);
        }
        if (intValue == 36) {
            return C0201.m82(16077);
        }
        if (intValue == 64) {
            return C0201.m82(16076);
        }
        switch (intValue) {
            case 256:
                return C0201.m82(16075);
            case 257:
                return C0201.m82(16074);
            case 258:
                return C0201.m82(16073);
            case 259:
                return C0201.m82(16072);
            case 260:
                return C0201.m82(16071);
            default:
                return C0201.m82(16069) + l + C0201.m82(16070);
        }
    }

    private String B(int i) {
        String r = ((kx) this.a).r(i);
        if (r == null) {
            return null;
        }
        return r + C0201.m82(16080);
    }

    private String y(int i) {
        Integer l = ((kx) this.a).l(i);
        if (l == null) {
            return null;
        }
        int intValue = l.intValue();
        if (intValue == -1) {
            return ((kx) this.a).l(9).intValue() < 16 ? C0201.m82(16084) : C0201.m82(16085);
        }
        if (intValue == 0) {
            return C0201.m82(16083);
        }
        return C0201.m82(16081) + l + C0201.m82(16082);
    }

    private String z(int i) {
        Integer l = ((kx) this.a).l(i);
        if (l == null) {
            return null;
        }
        int intValue = l.intValue();
        if (intValue == 34 || intValue == 36 || intValue == 40) {
            StringBuilder sb = new StringBuilder();
            sb.append(l.intValue() - 32);
            sb.append(C0201.m82(16088));
            return sb.toString();
        }
        return C0201.m82(16086) + l + C0201.m82(16087);
    }

    @Override // defpackage.as, defpackage.ix
    public String f(int i) {
        if (i == 4 || i == 5) {
            return B(i);
        }
        if (i == 9) {
            return z(i);
        }
        if (i == 11) {
            return A();
        }
        if (i != 13) {
            return super.f(i);
        }
        return y(i);
    }
}
