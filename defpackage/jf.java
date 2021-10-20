package defpackage;

import defpackage.qf;
import java.io.IOException;
import java.util.ArrayList;
import vigqyno.C0201;

/* renamed from: jf  reason: default package */
/* compiled from: ShapeGroupParser */
public class jf {
    private static qf.a a = qf.a.a(C0201.m82(24339), C0201.m82(24340), C0201.m82(24341));

    public static pd a(qf qfVar, ea eaVar) throws IOException {
        ArrayList arrayList = new ArrayList();
        String str = null;
        boolean z = false;
        while (qfVar.o()) {
            int A = qfVar.A(a);
            if (A == 0) {
                str = qfVar.w();
            } else if (A == 1) {
                z = qfVar.p();
            } else if (A != 2) {
                qfVar.D();
            } else {
                qfVar.c();
                while (qfVar.o()) {
                    dd a2 = ke.a(qfVar, eaVar);
                    if (a2 != null) {
                        arrayList.add(a2);
                    }
                }
                qfVar.k();
            }
        }
        return new pd(str, arrayList, z);
    }
}
