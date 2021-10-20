package defpackage;

import android.graphics.PointF;
import defpackage.qf;
import java.io.IOException;
import vigqyno.C0201;

/* renamed from: ef  reason: default package */
/* compiled from: RectangleShapeParser */
public class ef {
    private static qf.a a = qf.a.a(C0201.m82(12500), C0201.m82(12501), C0201.m82(12502), C0201.m82(12503), C0201.m82(12504));

    public static ld a(qf qfVar, ea eaVar) throws IOException {
        String str = null;
        ad<PointF, PointF> adVar = null;
        tc tcVar = null;
        pc pcVar = null;
        boolean z = false;
        while (qfVar.o()) {
            int A = qfVar.A(a);
            if (A == 0) {
                str = qfVar.w();
            } else if (A == 1) {
                adVar = ee.b(qfVar, eaVar);
            } else if (A == 2) {
                tcVar = he.i(qfVar, eaVar);
            } else if (A == 3) {
                pcVar = he.e(qfVar, eaVar);
            } else if (A != 4) {
                qfVar.D();
            } else {
                z = qfVar.p();
            }
        }
        return new ld(str, adVar, tcVar, pcVar, z);
    }
}
