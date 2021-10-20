package defpackage;

import vigqyno.C0201;

/* renamed from: nv  reason: default package */
/* compiled from: SigmaMakernoteDescriptor */
public class nv extends as<ov> {
    public nv(ov ovVar) {
        super(ovVar);
    }

    private String v() {
        String r = ((ov) this.a).r(8);
        if (r == null || r.length() == 0) {
            return null;
        }
        char charAt = r.charAt(0);
        if (charAt == 'A') {
            return C0201.m82(34100);
        }
        if (charAt == 'M') {
            return C0201.m82(34099);
        }
        if (charAt != 'P') {
            return charAt != 'S' ? r : C0201.m82(34097);
        }
        return C0201.m82(34098);
    }

    private String w() {
        String r = ((ov) this.a).r(9);
        if (r == null || r.length() == 0) {
            return null;
        }
        char charAt = r.charAt(0);
        if (charAt == '8') {
            return C0201.m82(34103);
        }
        if (charAt != 'A') {
            return charAt != 'C' ? r : C0201.m82(34101);
        }
        return C0201.m82(34102);
    }

    @Override // defpackage.as
    public String f(int i) {
        if (i == 8) {
            return v();
        }
        if (i != 9) {
            return super.f(i);
        }
        return w();
    }
}
