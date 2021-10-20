package defpackage;

import defpackage.qf;
import java.io.IOException;
import vigqyno.C0201;

/* renamed from: ke  reason: default package */
/* compiled from: ContentModelParser */
public class ke {
    private static qf.a a = qf.a.a(C0201.m82(27056), C0201.m82(27057));

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00c2, code lost:
        if (r2.equals(vigqyno.C0201.m82(27066)) != false) goto L_0x0102;
     */
    public static dd a(qf qfVar, ea eaVar) throws IOException {
        dd ddVar;
        String str;
        qfVar.h();
        char c = 2;
        int i = 2;
        while (true) {
            ddVar = null;
            if (!qfVar.o()) {
                str = null;
                break;
            }
            int A = qfVar.A(a);
            if (A == 0) {
                str = qfVar.w();
                break;
            } else if (A != 1) {
                qfVar.B();
                qfVar.D();
            } else {
                i = qfVar.s();
            }
        }
        if (str == null) {
            return null;
        }
        switch (str.hashCode()) {
            case 3239:
                if (str.equals(C0201.m82(27070))) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            case 3270:
                if (str.equals(C0201.m82(27069))) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 3295:
                if (str.equals(C0201.m82(27068))) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case 3307:
                if (str.equals(C0201.m82(27067))) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 3308:
                break;
            case 3488:
                if (str.equals(C0201.m82(27065))) {
                    c = 11;
                    break;
                }
                c = 65535;
                break;
            case 3633:
                if (str.equals(C0201.m82(27064))) {
                    c = '\b';
                    break;
                }
                c = 65535;
                break;
            case 3646:
                if (str.equals(C0201.m82(27063))) {
                    c = '\f';
                    break;
                }
                c = 65535;
                break;
            case 3669:
                if (str.equals(C0201.m82(27062))) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case 3679:
                if (str.equals(C0201.m82(27061))) {
                    c = '\n';
                    break;
                }
                c = 65535;
                break;
            case 3681:
                if (str.equals(C0201.m82(27060))) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 3705:
                if (str.equals(C0201.m82(27059))) {
                    c = '\t';
                    break;
                }
                c = 65535;
                break;
            case 3710:
                if (str.equals(C0201.m82(27058))) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        switch (c) {
            case 0:
                ddVar = jf.a(qfVar, eaVar);
                break;
            case 1:
                ddVar = lf.a(qfVar, eaVar);
                break;
            case 2:
                ddVar = re.a(qfVar, eaVar);
                break;
            case 3:
                ddVar = Cif.a(qfVar, eaVar);
                break;
            case 4:
                ddVar = qe.a(qfVar, eaVar);
                break;
            case 5:
                ddVar = ge.g(qfVar, eaVar);
                break;
            case 6:
                ddVar = kf.a(qfVar, eaVar);
                break;
            case 7:
                ddVar = ie.a(qfVar, eaVar, i);
                break;
            case '\b':
                ddVar = ef.a(qfVar, eaVar);
                break;
            case '\t':
                ddVar = mf.a(qfVar, eaVar);
                break;
            case '\n':
                ddVar = df.a(qfVar, eaVar);
                break;
            case 11:
                ddVar = ze.a(qfVar);
                eaVar.a(C0201.m82(27072));
                break;
            case '\f':
                ddVar = ff.a(qfVar, eaVar);
                break;
            default:
                wf.c(C0201.m82(27071) + str);
                break;
        }
        while (qfVar.o()) {
            qfVar.D();
        }
        qfVar.m();
        return ddVar;
    }
}
