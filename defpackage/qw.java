package defpackage;

import vigqyno.C0201;

/* renamed from: qw  reason: default package */
/* compiled from: JfifDescriptor */
public class qw extends as<rw> {
    public qw(rw rwVar) {
        super(rwVar);
    }

    @Override // defpackage.as
    public String f(int i) {
        if (i == 5) {
            return y();
        }
        if (i == 10) {
            return x();
        }
        if (i == 7) {
            return v();
        }
        if (i != 8) {
            return super.f(i);
        }
        return w();
    }

    public String v() {
        Integer l = ((rw) this.a).l(7);
        if (l == null) {
            return null;
        }
        int intValue = l.intValue();
        if (intValue == 0) {
            return C0201.m82(2255);
        }
        if (intValue != 1) {
            return intValue != 2 ? C0201.m82(2252) : C0201.m82(2253);
        }
        return C0201.m82(2254);
    }

    public String w() {
        Integer l = ((rw) this.a).l(8);
        if (l == null) {
            return null;
        }
        Object[] objArr = new Object[2];
        objArr[0] = l;
        objArr[1] = l.intValue() == 1 ? C0201.m82(2256) : C0201.m82(2257);
        return String.format(C0201.m82(2258), objArr);
    }

    public String x() {
        Integer l = ((rw) this.a).l(10);
        if (l == null) {
            return null;
        }
        Object[] objArr = new Object[2];
        objArr[0] = l;
        objArr[1] = l.intValue() == 1 ? C0201.m82(2259) : C0201.m82(2260);
        return String.format(C0201.m82(2261), objArr);
    }

    public String y() {
        Integer l = ((rw) this.a).l(5);
        if (l == null) {
            return null;
        }
        return String.format(C0201.m82(2262), Integer.valueOf((l.intValue() & 65280) >> 8), Integer.valueOf(l.intValue() & 255));
    }
}
