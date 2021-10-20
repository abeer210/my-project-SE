package defpackage;

import android.graphics.PointF;
import defpackage.kd;
import defpackage.qf;
import java.io.IOException;
import vigqyno.C0201;

/* renamed from: df  reason: default package */
/* compiled from: PolystarShapeParser */
public class df {
    private static final qf.a a = qf.a.a(C0201.m82(10111), C0201.m82(10112), C0201.m82(10113), C0201.m82(10114), C0201.m82(10115), C0201.m82(10116), C0201.m82(10117), C0201.m82(10118), C0201.m82(10119), C0201.m82(10120));

    public static kd a(qf qfVar, ea eaVar) throws IOException {
        String str = null;
        kd.a aVar = null;
        pc pcVar = null;
        ad<PointF, PointF> adVar = null;
        pc pcVar2 = null;
        pc pcVar3 = null;
        pc pcVar4 = null;
        pc pcVar5 = null;
        pc pcVar6 = null;
        boolean z = false;
        while (qfVar.o()) {
            switch (qfVar.A(a)) {
                case 0:
                    str = qfVar.w();
                    break;
                case 1:
                    aVar = kd.a.b(qfVar.s());
                    break;
                case 2:
                    pcVar = he.f(qfVar, eaVar, false);
                    break;
                case 3:
                    adVar = ee.b(qfVar, eaVar);
                    break;
                case 4:
                    pcVar2 = he.f(qfVar, eaVar, false);
                    break;
                case 5:
                    pcVar4 = he.e(qfVar, eaVar);
                    break;
                case 6:
                    pcVar6 = he.f(qfVar, eaVar, false);
                    break;
                case 7:
                    pcVar3 = he.e(qfVar, eaVar);
                    break;
                case 8:
                    pcVar5 = he.f(qfVar, eaVar, false);
                    break;
                case 9:
                    z = qfVar.p();
                    break;
                default:
                    qfVar.B();
                    qfVar.D();
                    break;
            }
        }
        return new kd(str, aVar, pcVar, adVar, pcVar2, pcVar3, pcVar4, pcVar5, pcVar6, z);
    }
}
