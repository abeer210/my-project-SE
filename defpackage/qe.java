package defpackage;

import android.graphics.Path;
import defpackage.qf;
import java.io.IOException;
import vigqyno.C0201;

/* renamed from: qe  reason: default package */
/* compiled from: GradientFillParser */
public class qe {
    private static final qf.a a = qf.a.a(C0201.m82(1058), C0201.m82(1059), C0201.m82(1060), C0201.m82(1061), C0201.m82(1062), C0201.m82(1063), C0201.m82(1064), C0201.m82(1065));
    private static final qf.a b = qf.a.a(C0201.m82(1066), C0201.m82(1067));

    public static fd a(qf qfVar, ea eaVar) throws IOException {
        Path.FillType fillType = Path.FillType.WINDING;
        String str = null;
        hd hdVar = null;
        qc qcVar = null;
        rc rcVar = null;
        tc tcVar = null;
        tc tcVar2 = null;
        boolean z = false;
        while (qfVar.o()) {
            switch (qfVar.A(a)) {
                case 0:
                    str = qfVar.w();
                    break;
                case 1:
                    int i = -1;
                    qfVar.h();
                    while (qfVar.o()) {
                        int A = qfVar.A(b);
                        if (A == 0) {
                            i = qfVar.s();
                        } else if (A != 1) {
                            qfVar.B();
                            qfVar.D();
                        } else {
                            qcVar = he.g(qfVar, eaVar, i);
                        }
                    }
                    qfVar.m();
                    break;
                case 2:
                    rcVar = he.h(qfVar, eaVar);
                    break;
                case 3:
                    hdVar = qfVar.s() == 1 ? hd.LINEAR : hd.RADIAL;
                    break;
                case 4:
                    tcVar = he.i(qfVar, eaVar);
                    break;
                case 5:
                    tcVar2 = he.i(qfVar, eaVar);
                    break;
                case 6:
                    fillType = qfVar.s() == 1 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD;
                    break;
                case 7:
                    z = qfVar.p();
                    break;
                default:
                    qfVar.B();
                    qfVar.D();
                    break;
            }
        }
        return new fd(str, hdVar, fillType, qcVar, rcVar, tcVar, tcVar2, null, null, z);
    }
}
