package defpackage;

import vigqyno.C0201;

/* renamed from: tw  reason: default package */
/* compiled from: JfxxDescriptor */
public class tw extends as<uw> {
    public tw(uw uwVar) {
        super(uwVar);
    }

    @Override // defpackage.as
    public String f(int i) {
        if (i != 5) {
            return super.f(i);
        }
        return v();
    }

    public String v() {
        Integer l = ((uw) this.a).l(5);
        if (l == null) {
            return null;
        }
        int intValue = l.intValue();
        if (intValue == 16) {
            return C0201.m82(9007);
        }
        if (intValue == 17) {
            return C0201.m82(9006);
        }
        if (intValue == 19) {
            return C0201.m82(9005);
        }
        return C0201.m82(9004) + l;
    }
}
