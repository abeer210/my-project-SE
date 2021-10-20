package defpackage;

import vigqyno.C0201;

/* renamed from: j00  reason: default package */
/* compiled from: Mp4VideoDescriptor */
public class j00 extends as<k00> {
    public j00(k00 k00) {
        super(k00);
    }

    private String v() {
        Integer l = ((k00) this.a).l(113);
        if (l == null) {
            return null;
        }
        int intValue = l.intValue();
        if (intValue == -1) {
            Integer l2 = ((k00) this.a).l(109);
            String r1 = C0201.m82(24973);
            return (l2 != null && l2.intValue() < 16) ? C0201.m82(24974) : r1;
        } else if (intValue == 0) {
            return C0201.m82(24972);
        } else {
            return C0201.m82(24970) + l + C0201.m82(24971);
        }
    }

    private String w() {
        Integer l = ((k00) this.a).l(109);
        if (l == null) {
            return null;
        }
        int intValue = l.intValue();
        if (intValue == 34 || intValue == 36 || intValue == 40) {
            StringBuilder sb = new StringBuilder();
            sb.append(l.intValue() - 32);
            sb.append(C0201.m82(24977));
            return sb.toString();
        }
        return C0201.m82(24975) + l + C0201.m82(24976);
    }

    private String x() {
        Integer l = ((k00) this.a).l(111);
        if (l == null) {
            return null;
        }
        int intValue = l.intValue();
        if (intValue == 0) {
            return C0201.m82(24988);
        }
        if (intValue == 32) {
            return C0201.m82(24987);
        }
        if (intValue == 36) {
            return C0201.m82(24986);
        }
        if (intValue == 64) {
            return C0201.m82(24985);
        }
        switch (intValue) {
            case 256:
                return C0201.m82(24984);
            case 257:
                return C0201.m82(24983);
            case 258:
                return C0201.m82(24982);
            case 259:
                return C0201.m82(24981);
            case 260:
                return C0201.m82(24980);
            default:
                return C0201.m82(24978) + l + C0201.m82(24979);
        }
    }

    private String y(int i) {
        String r = ((k00) this.a).r(i);
        if (r == null) {
            return null;
        }
        return r + C0201.m82(24989);
    }

    @Override // defpackage.as
    public String f(int i) {
        if (i == 104 || i == 105) {
            return y(i);
        }
        if (i == 109) {
            return w();
        }
        if (i == 111) {
            return x();
        }
        if (i != 113) {
            return super.f(i);
        }
        return v();
    }
}
