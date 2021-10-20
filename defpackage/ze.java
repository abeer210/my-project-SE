package defpackage;

import defpackage.jd;
import defpackage.qf;
import java.io.IOException;
import vigqyno.C0201;

/* renamed from: ze  reason: default package */
/* compiled from: MergePathsParser */
public class ze {
    private static final qf.a a = qf.a.a(C0201.m82(21520), C0201.m82(21521), C0201.m82(21522));

    public static jd a(qf qfVar) throws IOException {
        String str = null;
        jd.a aVar = null;
        boolean z = false;
        while (qfVar.o()) {
            int A = qfVar.A(a);
            if (A == 0) {
                str = qfVar.w();
            } else if (A == 1) {
                aVar = jd.a.b(qfVar.s());
            } else if (A != 2) {
                qfVar.B();
                qfVar.D();
            } else {
                z = qfVar.p();
            }
        }
        return new jd(str, aVar, z);
    }
}
