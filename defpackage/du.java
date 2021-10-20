package defpackage;

import vigqyno.C0201;

/* renamed from: du  reason: default package */
/* compiled from: LeicaType5MakernoteDescriptor */
public class du extends as<eu> {
    public du(eu euVar) {
        super(euVar);
    }

    @Override // defpackage.as
    public String f(int i) {
        if (i != 1037) {
            return super.f(i);
        }
        return v();
    }

    public String v() {
        byte[] e = ((eu) this.a).e(1037);
        if (e == null || e.length < 4) {
            return null;
        }
        String format = String.format(C0201.m82(10833), Byte.valueOf(e[0]), Byte.valueOf(e[1]), Byte.valueOf(e[2]), Byte.valueOf(e[3]));
        if (format.equals(C0201.m82(10834))) {
            return C0201.m82(10835);
        }
        if (format.equals(C0201.m82(10836))) {
            return C0201.m82(10837);
        }
        if (format.equals(C0201.m82(10838))) {
            return C0201.m82(10839);
        }
        if (format.equals(C0201.m82(10840))) {
            return C0201.m82(10841);
        }
        if (format.equals(C0201.m82(10842))) {
            return C0201.m82(10843);
        }
        return String.format(C0201.m82(10844), format);
    }
}
