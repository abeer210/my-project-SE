package defpackage;

import java.io.IOException;
import vigqyno.C0201;

/* renamed from: sq  reason: default package */
/* compiled from: RiffReader */
public class sq {
    public void a(or orVar, int i, qq qqVar) throws IOException {
        while (orVar.l() < ((long) i)) {
            String str = new String(orVar.d(4));
            int f = orVar.f();
            if (!str.equals(C0201.m82(6139)) && !str.equals(C0201.m82(6140))) {
                if (qqVar.c(str)) {
                    qqVar.a(str, orVar.d(f));
                } else {
                    orVar.t((long) f);
                }
                if (f % 2 == 1) {
                    orVar.t(1);
                }
            } else if (qqVar.b(new String(orVar.d(4)))) {
                a(orVar, f - 4, qqVar);
            } else {
                orVar.t((long) (f - 4));
            }
        }
    }

    public void b(or orVar, qq qqVar) throws rq, IOException {
        orVar.s(false);
        String m = orVar.m(4);
        if (m.equals(C0201.m82(6141))) {
            int f = orVar.f() - 4;
            if (qqVar.d(orVar.m(4))) {
                a(orVar, f, qqVar);
                return;
            }
            return;
        }
        throw new rq(C0201.m82(6142) + m);
    }
}
