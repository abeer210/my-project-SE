package defpackage;

import vigqyno.C0201;

/* renamed from: ww  reason: default package */
/* compiled from: HuffmanTablesDescriptor */
public class ww extends as<xw> {
    public ww(xw xwVar) {
        super(xwVar);
    }

    @Override // defpackage.as
    public String f(int i) {
        if (i != 1) {
            return super.f(i);
        }
        return v();
    }

    public String v() {
        Integer l = ((xw) this.a).l(1);
        if (l == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(l);
        sb.append(l.intValue() == 1 ? C0201.m82(15943) : C0201.m82(15944));
        return sb.toString();
    }
}
