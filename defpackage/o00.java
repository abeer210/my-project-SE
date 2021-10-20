package defpackage;

import vigqyno.C0201;

/* renamed from: o00  reason: default package */
/* compiled from: PcxReader */
public class o00 {
    public void a(or orVar, wr wrVar) {
        orVar.s(false);
        n00 n00 = new n00();
        wrVar.a(n00);
        try {
            if (orVar.h() == 10) {
                n00.J(1, orVar.h());
                if (orVar.h() == 1) {
                    n00.J(2, orVar.r());
                    n00.J(3, orVar.p());
                    n00.J(4, orVar.p());
                    n00.J(5, orVar.p());
                    n00.J(6, orVar.p());
                    n00.J(7, orVar.p());
                    n00.J(8, orVar.p());
                    n00.C(9, orVar.d(48));
                    orVar.t(1);
                    n00.J(10, orVar.r());
                    n00.J(11, orVar.p());
                    int p = orVar.p();
                    if (p != 0) {
                        n00.J(12, p);
                    }
                    int p2 = orVar.p();
                    if (p2 != 0) {
                        n00.J(13, p2);
                    }
                    int p3 = orVar.p();
                    if (p3 != 0) {
                        n00.J(14, p3);
                        return;
                    }
                    return;
                }
                throw new mp(C0201.m82(28851));
            }
            throw new mp(C0201.m82(28852));
        } catch (Exception e) {
            n00.a(C0201.m82(28853) + e.getMessage());
        }
    }
}
