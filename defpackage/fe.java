package defpackage;

import defpackage.qf;
import java.io.IOException;
import vigqyno.C0201;

/* renamed from: fe  reason: default package */
/* compiled from: AnimatableTextPropertiesParser */
public class fe {
    private static qf.a a = qf.a.a(C0201.m82(14971));
    private static qf.a b = qf.a.a(C0201.m82(14972), C0201.m82(14973), C0201.m82(14974), C0201.m82(14975));

    public static yc a(qf qfVar, ea eaVar) throws IOException {
        qfVar.h();
        yc ycVar = null;
        while (qfVar.o()) {
            if (qfVar.A(a) != 0) {
                qfVar.B();
                qfVar.D();
            } else {
                ycVar = b(qfVar, eaVar);
            }
        }
        qfVar.m();
        return ycVar == null ? new yc(null, null, null, null) : ycVar;
    }

    private static yc b(qf qfVar, ea eaVar) throws IOException {
        qfVar.h();
        oc ocVar = null;
        oc ocVar2 = null;
        pc pcVar = null;
        pc pcVar2 = null;
        while (qfVar.o()) {
            int A = qfVar.A(b);
            if (A == 0) {
                ocVar = he.c(qfVar, eaVar);
            } else if (A == 1) {
                ocVar2 = he.c(qfVar, eaVar);
            } else if (A == 2) {
                pcVar = he.e(qfVar, eaVar);
            } else if (A != 3) {
                qfVar.B();
                qfVar.D();
            } else {
                pcVar2 = he.e(qfVar, eaVar);
            }
        }
        qfVar.m();
        return new yc(ocVar, ocVar2, pcVar, pcVar2);
    }
}
