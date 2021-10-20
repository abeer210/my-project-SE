package defpackage;

import vigqyno.C0201;

/* renamed from: cx  reason: default package */
/* compiled from: JpegDescriptor */
public class cx extends as<ex> {
    public cx(ex exVar) {
        super(exVar);
    }

    @Override // defpackage.as
    public String f(int i) {
        if (i == -3) {
            return x();
        }
        if (i == 3) {
            return z();
        }
        if (i == 0) {
            return w();
        }
        if (i == 1) {
            return y();
        }
        switch (i) {
            case 6:
                return v(0);
            case 7:
                return v(1);
            case 8:
                return v(2);
            case 9:
                return v(3);
            default:
                return super.f(i);
        }
    }

    public String v(int i) {
        bx V = ((ex) this.a).V(i);
        if (V == null) {
            return null;
        }
        return V.a() + C0201.m82(9121) + V;
    }

    public String w() {
        String r = ((ex) this.a).r(0);
        if (r == null) {
            return null;
        }
        return r + C0201.m82(9122);
    }

    public String x() {
        return m(-3, C0201.m82(9123), C0201.m82(9124), C0201.m82(9125), C0201.m82(9126), null, C0201.m82(9127), C0201.m82(9128), C0201.m82(9129), C0201.m82(9130), C0201.m82(9131), C0201.m82(9132), C0201.m82(9133), null, C0201.m82(9134), C0201.m82(9135), C0201.m82(9136));
    }

    public String y() {
        String r = ((ex) this.a).r(1);
        if (r == null) {
            return null;
        }
        return r + C0201.m82(9137);
    }

    public String z() {
        String r = ((ex) this.a).r(3);
        if (r == null) {
            return null;
        }
        return r + C0201.m82(9138);
    }
}
