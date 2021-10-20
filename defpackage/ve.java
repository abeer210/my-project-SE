package defpackage;

import defpackage.qf;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import vigqyno.C0201;

/* renamed from: ve  reason: default package */
/* compiled from: KeyframesParser */
public class ve {
    public static qf.a a = qf.a.a(C0201.m82(12198));

    public static <T> List<bg<T>> a(qf qfVar, ea eaVar, float f, nf<T> nfVar) throws IOException {
        ArrayList arrayList = new ArrayList();
        if (qfVar.y() == qf.b.STRING) {
            eaVar.a(C0201.m82(12199));
            return arrayList;
        }
        qfVar.h();
        while (qfVar.o()) {
            if (qfVar.A(a) != 0) {
                qfVar.D();
            } else if (qfVar.y() == qf.b.BEGIN_ARRAY) {
                qfVar.c();
                if (qfVar.y() == qf.b.NUMBER) {
                    arrayList.add(ue.b(qfVar, eaVar, f, nfVar, false));
                } else {
                    while (qfVar.o()) {
                        arrayList.add(ue.b(qfVar, eaVar, f, nfVar, true));
                    }
                }
                qfVar.k();
            } else {
                arrayList.add(ue.b(qfVar, eaVar, f, nfVar, false));
            }
        }
        qfVar.m();
        b(arrayList);
        return arrayList;
    }

    public static <T> void b(List<? extends bg<T>> list) {
        int i;
        T t;
        int size = list.size();
        int i2 = 0;
        while (true) {
            i = size - 1;
            if (i2 >= i) {
                break;
            }
            bg bgVar = (bg) list.get(i2);
            i2++;
            bg bgVar2 = (bg) list.get(i2);
            bgVar.f = Float.valueOf(bgVar2.e);
            if (bgVar.c == null && (t = bgVar2.b) != null) {
                bgVar.c = t;
                if (bgVar instanceof ub) {
                    ((ub) bgVar).i();
                }
            }
        }
        bg bgVar3 = (bg) list.get(i);
        if ((bgVar3.b == null || bgVar3.c == null) && list.size() > 1) {
            list.remove(bgVar3);
        }
    }
}
