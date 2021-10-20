package defpackage;

import defpackage.qf;
import defpackage.sd;
import java.io.IOException;
import vigqyno.C0201;

/* renamed from: mf  reason: default package */
/* compiled from: ShapeTrimPathParser */
public class mf {
    private static qf.a a = qf.a.a(C0201.m82(31038), C0201.m82(31039), C0201.m82(31040), C0201.m82(31041), C0201.m82(31042), C0201.m82(31043));

    public static sd a(qf qfVar, ea eaVar) throws IOException {
        String str = null;
        sd.a aVar = null;
        pc pcVar = null;
        pc pcVar2 = null;
        pc pcVar3 = null;
        boolean z = false;
        while (qfVar.o()) {
            int A = qfVar.A(a);
            if (A == 0) {
                pcVar = he.f(qfVar, eaVar, false);
            } else if (A == 1) {
                pcVar2 = he.f(qfVar, eaVar, false);
            } else if (A == 2) {
                pcVar3 = he.f(qfVar, eaVar, false);
            } else if (A == 3) {
                str = qfVar.w();
            } else if (A == 4) {
                aVar = sd.a.b(qfVar.s());
            } else if (A != 5) {
                qfVar.D();
            } else {
                z = qfVar.p();
            }
        }
        return new sd(str, aVar, pcVar, pcVar2, pcVar3, z);
    }
}
