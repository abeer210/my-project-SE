package defpackage;

import defpackage.qf;
import java.io.IOException;
import java.util.ArrayList;
import vigqyno.C0201;

/* renamed from: ne  reason: default package */
/* compiled from: FontCharacterParser */
public class ne {
    private static final qf.a a = qf.a.a(C0201.m82(33394), C0201.m82(33395), C0201.m82(33396), C0201.m82(33397), C0201.m82(33398), C0201.m82(33399));
    private static final qf.a b = qf.a.a(C0201.m82(33400));

    public static ic a(qf qfVar, ea eaVar) throws IOException {
        ArrayList arrayList = new ArrayList();
        qfVar.h();
        String str = null;
        String str2 = null;
        double d = 0.0d;
        double d2 = 0.0d;
        char c = 0;
        while (qfVar.o()) {
            int A = qfVar.A(a);
            if (A == 0) {
                c = qfVar.w().charAt(0);
            } else if (A == 1) {
                d = qfVar.r();
            } else if (A == 2) {
                d2 = qfVar.r();
            } else if (A == 3) {
                str = qfVar.w();
            } else if (A == 4) {
                str2 = qfVar.w();
            } else if (A != 5) {
                qfVar.B();
                qfVar.D();
            } else {
                qfVar.h();
                while (qfVar.o()) {
                    if (qfVar.A(b) != 0) {
                        qfVar.B();
                        qfVar.D();
                    } else {
                        qfVar.c();
                        while (qfVar.o()) {
                            arrayList.add((pd) ke.a(qfVar, eaVar));
                        }
                        qfVar.k();
                    }
                }
                qfVar.m();
            }
        }
        qfVar.m();
        return new ic(arrayList, c, d, d2, str, str2);
    }
}
