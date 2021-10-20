package defpackage;

import java.io.IOException;
import vigqyno.C0201;

/* renamed from: lw  reason: default package */
/* compiled from: IcoReader */
public class lw {
    public void a(or orVar, wr wrVar) {
        String r0 = C0201.m82(30311);
        orVar.s(false);
        try {
            if (orVar.p() != 0) {
                kw kwVar = new kw();
                kwVar.a(C0201.m82(30312));
                wrVar.a(kwVar);
                return;
            }
            int p = orVar.p();
            if (p == 1 || p == 2) {
                int p2 = orVar.p();
                if (p2 == 0) {
                    kw kwVar2 = new kw();
                    kwVar2.a(C0201.m82(30315));
                    wrVar.a(kwVar2);
                    return;
                }
                for (int i = 0; i < p2; i++) {
                    kw kwVar3 = new kw();
                    try {
                        kwVar3.J(1, p);
                        kwVar3.J(2, orVar.r());
                        kwVar3.J(3, orVar.r());
                        kwVar3.J(4, orVar.r());
                        orVar.r();
                        if (p == 1) {
                            kwVar3.J(5, orVar.p());
                            kwVar3.J(7, orVar.p());
                        } else {
                            kwVar3.J(6, orVar.p());
                            kwVar3.J(8, orVar.p());
                        }
                        kwVar3.L(9, orVar.q());
                        kwVar3.L(10, orVar.q());
                    } catch (IOException e) {
                        kwVar3.a(r0 + e.getMessage());
                    }
                    wrVar.a(kwVar3);
                }
                return;
            }
            kw kwVar4 = new kw();
            kwVar4.a(C0201.m82(30313) + p + C0201.m82(30314));
            wrVar.a(kwVar4);
        } catch (IOException e2) {
            kw kwVar5 = new kw();
            kwVar5.a(r0 + e2.getMessage());
            wrVar.a(kwVar5);
        }
    }
}
