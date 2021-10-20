package defpackage;

import defpackage.qf;
import java.io.IOException;
import vigqyno.C0201;

/* renamed from: oe  reason: default package */
/* compiled from: FontParser */
public class oe {
    private static final qf.a a = qf.a.a(C0201.m82(35339), C0201.m82(35340), C0201.m82(35341), C0201.m82(35342));

    public static hc a(qf qfVar) throws IOException {
        qfVar.h();
        String str = null;
        String str2 = null;
        String str3 = null;
        float f = 0.0f;
        while (qfVar.o()) {
            int A = qfVar.A(a);
            if (A == 0) {
                str = qfVar.w();
            } else if (A == 1) {
                str2 = qfVar.w();
            } else if (A == 2) {
                str3 = qfVar.w();
            } else if (A != 3) {
                qfVar.B();
                qfVar.D();
            } else {
                f = (float) qfVar.r();
            }
        }
        qfVar.m();
        return new hc(str, str2, str3, f);
    }
}
