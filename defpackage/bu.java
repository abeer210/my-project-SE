package defpackage;

import vigqyno.C0188;
import vigqyno.C0201;

/* renamed from: bu  reason: default package */
/* compiled from: LeicaMakernoteDescriptor */
public class bu extends as<cu> {
    public bu(cu cuVar) {
        super(cuVar);
    }

    private String A() {
        return l(768, 1, C0201.m82(6372), C0201.m82(6373), C0201.m82(6374), C0201.m82(6375));
    }

    private String B() {
        return m(772, C0201.m82(6376), C0201.m82(6377), C0201.m82(6378), C0201.m82(6379), C0201.m82(6380), C0201.m82(6381), C0201.m82(6382));
    }

    private String v() {
        return s(787);
    }

    private String w() {
        return j(C0188.f20, C0201.m82(6383));
    }

    private String x() {
        return s(785);
    }

    private String y() {
        return s(786);
    }

    private String z() {
        return l(768, 1, C0201.m82(6384), C0201.m82(6385));
    }

    @Override // defpackage.as
    public String f(int i) {
        if (i == 768) {
            return z();
        }
        if (i == 770) {
            return A();
        }
        if (i == 772) {
            return B();
        }
        if (i == 800) {
            return w();
        }
        switch (i) {
            case 785:
                return x();
            case 786:
                return y();
            case 787:
                return v();
            default:
                switch (i) {
                    case 802:
                    case 803:
                    case 804:
                        return s(i);
                    default:
                        return super.f(i);
                }
        }
    }
}
