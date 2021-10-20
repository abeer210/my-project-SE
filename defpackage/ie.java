package defpackage;

import android.graphics.PointF;
import defpackage.qf;
import java.io.IOException;
import vigqyno.C0201;

/* renamed from: ie  reason: default package */
/* compiled from: CircleShapeParser */
public class ie {
    private static qf.a a = qf.a.a(C0201.m82(21752), C0201.m82(21753), C0201.m82(21754), C0201.m82(21755), C0201.m82(21756));

    public static cd a(qf qfVar, ea eaVar, int i) throws IOException {
        boolean z = i == 3;
        String str = null;
        ad<PointF, PointF> adVar = null;
        tc tcVar = null;
        boolean z2 = false;
        while (qfVar.o()) {
            int A = qfVar.A(a);
            if (A == 0) {
                str = qfVar.w();
            } else if (A == 1) {
                adVar = ee.b(qfVar, eaVar);
            } else if (A == 2) {
                tcVar = he.i(qfVar, eaVar);
            } else if (A == 3) {
                z2 = qfVar.p();
            } else if (A != 4) {
                qfVar.B();
                qfVar.D();
            } else {
                z = qfVar.s() == 3;
            }
        }
        return new cd(str, adVar, tcVar, z, z2);
    }
}
