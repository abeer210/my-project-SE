package defpackage;

import android.graphics.Path;
import defpackage.qf;
import java.io.IOException;
import vigqyno.C0201;

/* renamed from: if  reason: invalid class name and default package */
/* compiled from: ShapeFillParser */
public class Cif {
    private static final qf.a a = qf.a.a(C0201.m82(21718), C0201.m82(21719), C0201.m82(21720), C0201.m82(21721), C0201.m82(21722), C0201.m82(21723));

    public static od a(qf qfVar, ea eaVar) throws IOException {
        String str = null;
        oc ocVar = null;
        rc rcVar = null;
        int i = 1;
        boolean z = false;
        boolean z2 = false;
        while (qfVar.o()) {
            int A = qfVar.A(a);
            if (A == 0) {
                str = qfVar.w();
            } else if (A == 1) {
                ocVar = he.c(qfVar, eaVar);
            } else if (A == 2) {
                rcVar = he.h(qfVar, eaVar);
            } else if (A == 3) {
                z = qfVar.p();
            } else if (A == 4) {
                i = qfVar.s();
            } else if (A != 5) {
                qfVar.B();
                qfVar.D();
            } else {
                z2 = qfVar.p();
            }
        }
        return new od(str, z, i == 1 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD, ocVar, rcVar, z2);
    }
}
