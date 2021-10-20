package defpackage;

import vigqyno.C0201;

/* renamed from: dt  reason: default package */
/* compiled from: PanasonicRawDistortionDescriptor */
public class dt extends as<et> {
    public dt(et etVar) {
        super(etVar);
    }

    public String A() {
        Integer l = ((et) this.a).l(11);
        if (l == null) {
            return null;
        }
        return new mr((long) l.intValue(), 32678).toString();
    }

    public String B() {
        Integer l = ((et) this.a).l(5);
        if (l == null) {
            return null;
        }
        return Integer.toString(1 / ((l.intValue() / 32768) + 1));
    }

    @Override // defpackage.as
    public String f(int i) {
        if (i == 2) {
            return w();
        }
        if (i == 11) {
            return A();
        }
        if (i == 4) {
            return x();
        }
        if (i == 5) {
            return B();
        }
        if (i == 7) {
            return v();
        }
        if (i == 8) {
            return y();
        }
        if (i != 9) {
            return super.f(i);
        }
        return z();
    }

    public String v() {
        Integer l = ((et) this.a).l(7);
        if (l == null) {
            return null;
        }
        int intValue = l.intValue() & 15;
        if (intValue == 0) {
            return C0201.m82(10941);
        }
        if (intValue == 1) {
            return C0201.m82(10940);
        }
        return C0201.m82(10938) + l + C0201.m82(10939);
    }

    public String w() {
        Integer l = ((et) this.a).l(2);
        if (l == null) {
            return null;
        }
        return new mr((long) l.intValue(), 32678).toString();
    }

    public String x() {
        Integer l = ((et) this.a).l(4);
        if (l == null) {
            return null;
        }
        return new mr((long) l.intValue(), 32678).toString();
    }

    public String y() {
        Integer l = ((et) this.a).l(8);
        if (l == null) {
            return null;
        }
        return new mr((long) l.intValue(), 32678).toString();
    }

    public String z() {
        Integer l = ((et) this.a).l(9);
        if (l == null) {
            return null;
        }
        return new mr((long) l.intValue(), 32678).toString();
    }
}
