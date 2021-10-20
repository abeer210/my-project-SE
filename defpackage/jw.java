package defpackage;

import vigqyno.C0201;

/* renamed from: jw  reason: default package */
/* compiled from: IcoDescriptor */
public class jw extends as<kw> {
    public jw(kw kwVar) {
        super(kwVar);
    }

    @Override // defpackage.as
    public String f(int i) {
        if (i == 1) {
            return x();
        }
        if (i == 2) {
            return y();
        }
        if (i == 3) {
            return w();
        }
        if (i != 4) {
            return super.f(i);
        }
        return v();
    }

    public String v() {
        Integer l = ((kw) this.a).l(4);
        if (l == null) {
            return null;
        }
        if (l.intValue() == 0) {
            return C0201.m82(26590);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(l);
        sb.append(C0201.m82(26591));
        sb.append(l.intValue() == 1 ? C0201.m82(26592) : C0201.m82(26593));
        return sb.toString();
    }

    public String w() {
        Integer l = ((kw) this.a).l(3);
        if (l == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(l.intValue() == 0 ? 256 : l.intValue());
        sb.append(C0201.m82(26594));
        return sb.toString();
    }

    public String x() {
        return l(1, 1, C0201.m82(26595), C0201.m82(26596));
    }

    public String y() {
        Integer l = ((kw) this.a).l(2);
        if (l == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(l.intValue() == 0 ? 256 : l.intValue());
        sb.append(C0201.m82(26597));
        return sb.toString();
    }
}
