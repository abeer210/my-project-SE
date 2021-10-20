package defpackage;

import defpackage.qf;
import java.io.IOException;
import vigqyno.C0201;

/* renamed from: ff  reason: default package */
/* compiled from: RepeaterParser */
public class ff {
    private static qf.a a = qf.a.a(C0201.m82(14561), C0201.m82(14562), C0201.m82(14563), C0201.m82(14564), C0201.m82(14565));

    public static md a(qf qfVar, ea eaVar) throws IOException {
        String str = null;
        pc pcVar = null;
        pc pcVar2 = null;
        zc zcVar = null;
        boolean z = false;
        while (qfVar.o()) {
            int A = qfVar.A(a);
            if (A == 0) {
                str = qfVar.w();
            } else if (A == 1) {
                pcVar = he.f(qfVar, eaVar, false);
            } else if (A == 2) {
                pcVar2 = he.f(qfVar, eaVar, false);
            } else if (A == 3) {
                zcVar = ge.g(qfVar, eaVar);
            } else if (A != 4) {
                qfVar.D();
            } else {
                z = qfVar.p();
            }
        }
        return new md(str, pcVar, pcVar2, zcVar, z);
    }
}
