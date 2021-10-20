package defpackage;

import android.graphics.PointF;
import defpackage.qf;
import java.io.IOException;
import vigqyno.C0201;

/* renamed from: ge  reason: default package */
/* compiled from: AnimatableTransformParser */
public class ge {
    private static qf.a a = qf.a.a(C0201.m82(17354), C0201.m82(17355), C0201.m82(17356), C0201.m82(17357), C0201.m82(17358), C0201.m82(17359), C0201.m82(17360), C0201.m82(17361), C0201.m82(17362), C0201.m82(17363));
    private static qf.a b = qf.a.a(C0201.m82(17364));

    private static boolean a(sc scVar) {
        return scVar == null || (scVar.c() && scVar.b().get(0).b.equals(0.0f, 0.0f));
    }

    private static boolean b(ad<PointF, PointF> adVar) {
        if (adVar == null || (!(adVar instanceof wc) && adVar.c() && adVar.b().get(0).b.equals(0.0f, 0.0f))) {
            return true;
        }
        return false;
    }

    private static boolean c(pc pcVar) {
        return pcVar == null || (pcVar.c() && ((bg) pcVar.b().get(0)).b.floatValue() == 0.0f);
    }

    private static boolean d(uc ucVar) {
        return ucVar == null || (ucVar.c() && ((bg) ucVar.b().get(0)).b.a(1.0f, 1.0f));
    }

    private static boolean e(pc pcVar) {
        return pcVar == null || (pcVar.c() && ((bg) pcVar.b().get(0)).b.floatValue() == 0.0f);
    }

    private static boolean f(pc pcVar) {
        return pcVar == null || (pcVar.c() && ((bg) pcVar.b().get(0)).b.floatValue() == 0.0f);
    }

    public static zc g(qf qfVar, ea eaVar) throws IOException {
        boolean z = false;
        boolean z2 = qfVar.y() == qf.b.BEGIN_OBJECT;
        if (z2) {
            qfVar.h();
        }
        pc pcVar = null;
        sc scVar = null;
        ad<PointF, PointF> adVar = null;
        uc ucVar = null;
        pc pcVar2 = null;
        pc pcVar3 = null;
        rc rcVar = null;
        pc pcVar4 = null;
        pc pcVar5 = null;
        while (qfVar.o()) {
            switch (qfVar.A(a)) {
                case 0:
                    qfVar.h();
                    while (qfVar.o()) {
                        if (qfVar.A(b) != 0) {
                            qfVar.B();
                            qfVar.D();
                        } else {
                            scVar = ee.a(qfVar, eaVar);
                        }
                    }
                    qfVar.m();
                    break;
                case 1:
                    adVar = ee.b(qfVar, eaVar);
                    break;
                case 2:
                    ucVar = he.j(qfVar, eaVar);
                    break;
                case 3:
                    eaVar.a(C0201.m82(17365));
                case 4:
                    pc f = he.f(qfVar, eaVar, z);
                    if (!f.b().isEmpty()) {
                        if (((bg) f.b().get(0)).b == null) {
                            f.b().set(0, new bg(eaVar, Float.valueOf(0.0f), Float.valueOf(0.0f), null, 0.0f, Float.valueOf(eaVar.f())));
                            pcVar = f;
                            break;
                        }
                    } else {
                        f.b().add(new bg(eaVar, Float.valueOf(0.0f), Float.valueOf(0.0f), null, 0.0f, Float.valueOf(eaVar.f())));
                    }
                    pcVar = f;
                case 5:
                    rcVar = he.h(qfVar, eaVar);
                    continue;
                case 6:
                    pcVar4 = he.f(qfVar, eaVar, z);
                    continue;
                case 7:
                    pcVar5 = he.f(qfVar, eaVar, z);
                    continue;
                case 8:
                    pcVar2 = he.f(qfVar, eaVar, z);
                    continue;
                case 9:
                    pcVar3 = he.f(qfVar, eaVar, z);
                    continue;
                default:
                    qfVar.B();
                    qfVar.D();
                    break;
            }
            z = false;
        }
        if (z2) {
            qfVar.m();
        }
        sc scVar2 = a(scVar) ? null : scVar;
        ad<PointF, PointF> adVar2 = b(adVar) ? null : adVar;
        pc pcVar6 = c(pcVar) ? null : pcVar;
        if (d(ucVar)) {
            ucVar = null;
        }
        return new zc(scVar2, adVar2, ucVar, pcVar6, rcVar, pcVar4, pcVar5, f(pcVar2) ? null : pcVar2, e(pcVar3) ? null : pcVar3);
    }
}
