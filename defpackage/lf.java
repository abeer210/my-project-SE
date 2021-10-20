package defpackage;

import defpackage.qf;
import defpackage.rd;
import java.io.IOException;
import java.util.ArrayList;
import vigqyno.C0201;

/* renamed from: lf  reason: default package */
/* compiled from: ShapeStrokeParser */
public class lf {
    private static qf.a a = qf.a.a(C0201.m82(28952), C0201.m82(28953), C0201.m82(28954), C0201.m82(28955), C0201.m82(28956), C0201.m82(28957), C0201.m82(28958), C0201.m82(28959), C0201.m82(28960));
    private static final qf.a b = qf.a.a(C0201.m82(28961), C0201.m82(28962));

    /* JADX WARNING: Removed duplicated region for block: B:35:0x009c  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00ad  */
    public static rd a(qf qfVar, ea eaVar) throws IOException {
        char c;
        ArrayList arrayList = new ArrayList();
        String str = null;
        pc pcVar = null;
        oc ocVar = null;
        rc rcVar = null;
        pc pcVar2 = null;
        rd.b bVar = null;
        rd.c cVar = null;
        float f = 0.0f;
        boolean z = false;
        while (qfVar.o()) {
            int i = 1;
            switch (qfVar.A(a)) {
                case 0:
                    str = qfVar.w();
                    break;
                case 1:
                    ocVar = he.c(qfVar, eaVar);
                    break;
                case 2:
                    pcVar2 = he.e(qfVar, eaVar);
                    break;
                case 3:
                    rcVar = he.h(qfVar, eaVar);
                    break;
                case 4:
                    bVar = rd.b.values()[qfVar.s() - 1];
                    break;
                case 5:
                    cVar = rd.c.values()[qfVar.s() - 1];
                    break;
                case 6:
                    f = (float) qfVar.r();
                    break;
                case 7:
                    z = qfVar.p();
                    break;
                case 8:
                    qfVar.c();
                    while (qfVar.o()) {
                        qfVar.h();
                        String str2 = null;
                        pc pcVar3 = null;
                        while (qfVar.o()) {
                            int A = qfVar.A(b);
                            if (A == 0) {
                                str2 = qfVar.w();
                            } else if (A != i) {
                                qfVar.B();
                                qfVar.D();
                            } else {
                                pcVar3 = he.e(qfVar, eaVar);
                            }
                        }
                        qfVar.m();
                        int hashCode = str2.hashCode();
                        if (hashCode != 100) {
                            if (hashCode != 103) {
                                if (hashCode == 111 && str2.equals(C0201.m82(28963))) {
                                    c = 0;
                                    if (c != 0) {
                                        pcVar = pcVar3;
                                    } else if (c == 1 || c == 2) {
                                        eaVar.t(true);
                                        arrayList.add(pcVar3);
                                    }
                                    i = 1;
                                }
                            } else if (str2.equals(C0201.m82(28964))) {
                                c = 2;
                                if (c != 0) {
                                }
                                i = 1;
                            }
                        } else if (str2.equals(C0201.m82(28965))) {
                            c = 1;
                            if (c != 0) {
                            }
                            i = 1;
                        }
                        c = 65535;
                        if (c != 0) {
                        }
                        i = 1;
                    }
                    qfVar.k();
                    if (arrayList.size() != 1) {
                        break;
                    } else {
                        arrayList.add(arrayList.get(0));
                        break;
                    }
                default:
                    qfVar.D();
                    break;
            }
        }
        return new rd(str, pcVar, arrayList, ocVar, rcVar, pcVar2, bVar, cVar, f, z);
    }
}
