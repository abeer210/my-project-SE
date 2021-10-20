package defpackage;

import vigqyno.C0201;

/* renamed from: lt  reason: default package */
/* compiled from: PrintIMDescriptor */
public class lt extends as<mt> {
    public lt(mt mtVar) {
        super(mtVar);
    }

    @Override // defpackage.as
    public String f(int i) {
        if (i == 0) {
            return super.f(i);
        }
        Integer l = ((mt) this.a).l(i);
        if (l == null) {
            return null;
        }
        return String.format(C0201.m82(29521), l);
    }
}
