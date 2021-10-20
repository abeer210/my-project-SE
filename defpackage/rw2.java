package defpackage;

import vigqyno.C0201;

/* renamed from: rw2  reason: default package */
/* compiled from: ReflectionFactory */
public class rw2 {
    public cx2 a(nw2 nw2) {
        return nw2;
    }

    public ax2 b(Class cls) {
        return new jw2(cls);
    }

    public String c(mw2 mw2) {
        String obj = mw2.getClass().getGenericInterfaces()[0].toString();
        return obj.startsWith(C0201.m82(13736)) ? obj.substring(21) : obj;
    }

    public String d(pw2 pw2) {
        return c(pw2);
    }
}
