package defpackage;

import vigqyno.C0201;

/* renamed from: hz  reason: default package */
/* compiled from: Mp4HandlerFactory */
public class hz {
    public static Long b;
    public static Long c;
    public static Long d;
    public static Long e;
    public static String f;
    private zp a;

    public hz(zp zpVar) {
        this.a = zpVar;
    }

    public zp a(nz nzVar, wr wrVar) {
        String a2 = nzVar.a();
        if (a2.equals(C0201.m82(21348))) {
            return new f00(wrVar);
        }
        if (a2.equals(C0201.m82(21349))) {
            return new l00(wrVar);
        }
        if (a2.equals(C0201.m82(21350))) {
            return new yz(wrVar);
        }
        if (a2.equals(C0201.m82(21351))) {
            return new i00(wrVar);
        }
        if (a2.equals(C0201.m82(21352))) {
            return new c00(wrVar);
        }
        return this.a;
    }
}
