package defpackage;

import vigqyno.C0201;

/* renamed from: bs  reason: default package */
/* compiled from: AdobeJpegDescriptor */
public class bs extends as<cs> {
    public bs(cs csVar) {
        super(csVar);
    }

    private String v() {
        return m(3, C0201.m82(6185), C0201.m82(6186), C0201.m82(6187));
    }

    private String w() {
        Integer l = ((cs) this.a).l(0);
        if (l == null) {
            return null;
        }
        return l.intValue() == 100 ? C0201.m82(6188) : Integer.toString(l.intValue());
    }

    @Override // defpackage.as
    public String f(int i) {
        if (i == 0) {
            return w();
        }
        if (i != 3) {
            return super.f(i);
        }
        return v();
    }
}
