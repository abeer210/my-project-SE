package defpackage;

import defpackage.qf;
import defpackage.rd;
import java.io.IOException;
import java.util.ArrayList;
import vigqyno.C0201;

/* renamed from: re  reason: default package */
/* compiled from: GradientStrokeParser */
public class re {
    private static qf.a a = qf.a.a(C0201.m82(2792), C0201.m82(2793), C0201.m82(2794), C0201.m82(2795), C0201.m82(2796), C0201.m82(2797), C0201.m82(2798), C0201.m82(2799), C0201.m82(2800), C0201.m82(2801), C0201.m82(2802), C0201.m82(2803));
    private static final qf.a b = qf.a.a(C0201.m82(2804), C0201.m82(2805));
    private static final qf.a c = qf.a.a(C0201.m82(2806), C0201.m82(2807));

    public static gd a(qf qfVar, ea eaVar) throws IOException {
        qc qcVar;
        ArrayList arrayList = new ArrayList();
        String str = null;
        hd hdVar = null;
        qc qcVar2 = null;
        rc rcVar = null;
        tc tcVar = null;
        tc tcVar2 = null;
        pc pcVar = null;
        rd.b bVar = null;
        rd.c cVar = null;
        float f = 0.0f;
        pc pcVar2 = null;
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
                        if (A != 0) {
                            qcVar = qcVar2;
                            if (A != 1) {
                                qfVar.B();
                                qfVar.D();
                            } else {
                                qcVar2 = he.g(qfVar, eaVar, i);
                            }
                        } else {
                            qcVar = qcVar2;
                            i = qfVar.s();
                        }
                        qcVar2 = qcVar;
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
                    pcVar = he.e(qfVar, eaVar);
                    break;
                case 7:
                    bVar = rd.b.values()[qfVar.s() - 1];
                    break;
                case 8:
                    cVar = rd.c.values()[qfVar.s() - 1];
                    break;
                case 9:
                    f = (float) qfVar.r();
                    break;
                case 10:
                    z = qfVar.p();
                    break;
                case 11:
                    qfVar.c();
                    while (qfVar.o()) {
                        qfVar.h();
                        String str2 = null;
                        pc pcVar3 = null;
                        while (qfVar.o()) {
                            int A2 = qfVar.A(c);
                            if (A2 != 0) {
                                if (A2 != 1) {
                                    qfVar.B();
                                    qfVar.D();
                                } else {
                                    pcVar3 = he.e(qfVar, eaVar);
                                }
                                pcVar2 = pcVar2;
                            } else {
                                str2 = qfVar.w();
                            }
                        }
                        qfVar.m();
                        if (str2.equals(C0201.m82(2808))) {
                            pcVar2 = pcVar3;
                        } else {
                            if (str2.equals(C0201.m82(2809)) || str2.equals(C0201.m82(2810))) {
                                eaVar.t(true);
                                arrayList.add(pcVar3);
                            }
                            pcVar2 = pcVar2;
                        }
                    }
                    qfVar.k();
                    if (arrayList.size() == 1) {
                        arrayList.add(arrayList.get(0));
                    }
                    pcVar2 = pcVar2;
                    break;
                default:
                    qfVar.B();
                    qfVar.D();
                    break;
            }
        }
        return new gd(str, hdVar, qcVar2, rcVar, tcVar, tcVar2, pcVar, bVar, cVar, f, arrayList, pcVar2, z);
    }
}
