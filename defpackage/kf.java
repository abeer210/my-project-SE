package defpackage;

import defpackage.qf;
import java.io.IOException;
import vigqyno.C0201;

/* renamed from: kf  reason: default package */
/* compiled from: ShapePathParser */
public class kf {
    public static qf.a a = qf.a.a(C0201.m82(27028), C0201.m82(27029), C0201.m82(27030), C0201.m82(27031));

    public static qd a(qf qfVar, ea eaVar) throws IOException {
        int i = 0;
        String str = null;
        vc vcVar = null;
        boolean z = false;
        while (qfVar.o()) {
            int A = qfVar.A(a);
            if (A == 0) {
                str = qfVar.w();
            } else if (A == 1) {
                i = qfVar.s();
            } else if (A == 2) {
                vcVar = he.k(qfVar, eaVar);
            } else if (A != 3) {
                qfVar.D();
            } else {
                z = qfVar.p();
            }
        }
        return new qd(str, i, vcVar, z);
    }
}
