package defpackage;

import vigqyno.C0201;

/* renamed from: fu  reason: default package */
/* compiled from: NikonType1MakernoteDescriptor */
public class fu extends as<gu> {
    public fu(gu guVar) {
        super(guVar);
    }

    public String A() {
        return m(5, C0201.m82(15897), C0201.m82(15898), C0201.m82(15899), C0201.m82(15900), C0201.m82(15901));
    }

    public String B() {
        return l(3, 1, C0201.m82(15902), C0201.m82(15903), C0201.m82(15904), C0201.m82(15905), C0201.m82(15906), C0201.m82(15907));
    }

    public String C() {
        return m(7, C0201.m82(15908), C0201.m82(15909), C0201.m82(15910), C0201.m82(15911), C0201.m82(15912), C0201.m82(15913), C0201.m82(15914));
    }

    @Override // defpackage.as
    public String f(int i) {
        switch (i) {
            case 3:
                return B();
            case 4:
                return w();
            case 5:
                return A();
            case 6:
                return v();
            case 7:
                return C();
            case 8:
                return z();
            case 9:
            default:
                return super.f(i);
            case 10:
                return y();
            case 11:
                return x();
        }
    }

    public String v() {
        return m(6, C0201.m82(15915), null, C0201.m82(15916), null, C0201.m82(15917), C0201.m82(15918));
    }

    public String w() {
        return l(4, 1, C0201.m82(15919), C0201.m82(15920));
    }

    public String x() {
        return m(11, C0201.m82(15921), C0201.m82(15922));
    }

    public String y() {
        mr p = ((gu) this.a).p(10);
        if (p == null) {
            return null;
        }
        if (p.g() == 0) {
            return C0201.m82(15923);
        }
        return p.l(true) + C0201.m82(15924);
    }

    public String z() {
        mr p = ((gu) this.a).p(8);
        if (p == null) {
            return null;
        }
        return (p.g() == 1 && p.f() == 0) ? C0201.m82(15925) : p.l(true);
    }
}
