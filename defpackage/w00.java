package defpackage;

import vigqyno.C0201;

/* renamed from: w00  reason: default package */
/* compiled from: PsdHeaderDescriptor */
public class w00 extends as<x00> {
    public w00(x00 x00) {
        super(x00);
    }

    @Override // defpackage.as
    public String f(int i) {
        if (i == 1) {
            return w();
        }
        if (i == 2) {
            return y();
        }
        if (i == 3) {
            return z();
        }
        if (i == 4) {
            return v();
        }
        if (i != 5) {
            return super.f(i);
        }
        return x();
    }

    public String v() {
        Integer l = ((x00) this.a).l(4);
        if (l == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(l);
        sb.append(C0201.m82(5471));
        sb.append(l.intValue() == 1 ? C0201.m82(5472) : C0201.m82(5473));
        sb.append(C0201.m82(5474));
        return sb.toString();
    }

    public String w() {
        Integer l = ((x00) this.a).l(1);
        if (l == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(l);
        sb.append(C0201.m82(5475));
        sb.append(l.intValue() == 1 ? C0201.m82(5476) : C0201.m82(5477));
        return sb.toString();
    }

    public String x() {
        return m(5, C0201.m82(5478), C0201.m82(5479), C0201.m82(5480), C0201.m82(5481), C0201.m82(5482), null, null, C0201.m82(5483), C0201.m82(5484), C0201.m82(5485));
    }

    public String y() {
        Integer l = ((x00) this.a).l(2);
        if (l == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(l);
        sb.append(C0201.m82(5486));
        sb.append(l.intValue() == 1 ? C0201.m82(5487) : C0201.m82(5488));
        return sb.toString();
    }

    public String z() {
        try {
            Integer l = ((x00) this.a).l(3);
            if (l == null) {
                return null;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(l);
            sb.append(C0201.m82(5489));
            sb.append(l.intValue() == 1 ? C0201.m82(5490) : C0201.m82(5491));
            return sb.toString();
        } catch (Exception unused) {
            return null;
        }
    }
}
