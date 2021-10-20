package defpackage;

import android.graphics.PointF;
import defpackage.qf;
import java.io.IOException;
import java.util.ArrayList;
import vigqyno.C0201;

/* renamed from: ee  reason: default package */
/* compiled from: AnimatablePathValueParser */
public class ee {
    private static qf.a a = qf.a.a(C0201.m82(12605), C0201.m82(12606), C0201.m82(12607));

    public static sc a(qf qfVar, ea eaVar) throws IOException {
        ArrayList arrayList = new ArrayList();
        if (qfVar.y() == qf.b.BEGIN_ARRAY) {
            qfVar.c();
            while (qfVar.o()) {
                arrayList.add(af.a(qfVar, eaVar));
            }
            qfVar.k();
            ve.b(arrayList);
        } else {
            arrayList.add(new bg(te.e(qfVar, ag.e())));
        }
        return new sc(arrayList);
    }

    public static ad<PointF, PointF> b(qf qfVar, ea eaVar) throws IOException {
        qfVar.h();
        sc scVar = null;
        pc pcVar = null;
        pc pcVar2 = null;
        boolean z = false;
        while (qfVar.y() != qf.b.END_OBJECT) {
            int A = qfVar.A(a);
            if (A != 0) {
                if (A != 1) {
                    if (A != 2) {
                        qfVar.B();
                        qfVar.D();
                    } else if (qfVar.y() == qf.b.STRING) {
                        qfVar.D();
                    } else {
                        pcVar2 = he.e(qfVar, eaVar);
                    }
                } else if (qfVar.y() == qf.b.STRING) {
                    qfVar.D();
                } else {
                    pcVar = he.e(qfVar, eaVar);
                }
                z = true;
            } else {
                scVar = a(qfVar, eaVar);
            }
        }
        qfVar.m();
        if (z) {
            eaVar.a(C0201.m82(12608));
        }
        if (scVar != null) {
            return scVar;
        }
        return new wc(pcVar, pcVar2);
    }
}
