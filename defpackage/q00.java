package defpackage;

import java.io.IOException;
import java.util.Collections;
import vigqyno.C0201;

/* renamed from: q00  reason: default package */
/* compiled from: DuckyReader */
public class q00 implements wp {
    @Override // defpackage.wp
    public void a(Iterable<byte[]> iterable, wr wrVar, yp ypVar) {
        for (byte[] bArr : iterable) {
            if (bArr.length >= 5) {
                if (C0201.m82(13739).equals(new String(bArr, 0, 5))) {
                    c(new nr(bArr, 5), wrVar);
                }
            }
        }
    }

    @Override // defpackage.wp
    public Iterable<yp> b() {
        return Collections.singletonList(yp.APPC);
    }

    public void c(or orVar, wr wrVar) {
        p00 p00 = new p00();
        wrVar.a(p00);
        while (true) {
            try {
                int p = orVar.p();
                if (p != 0) {
                    int p2 = orVar.p();
                    if (p != 1) {
                        if (p == 2 || p == 3) {
                            orVar.t(4);
                            p00.T(p, orVar.o(p2 - 4, fr.d));
                        } else {
                            p00.C(p, orVar.d(p2));
                        }
                    } else if (p2 != 4) {
                        p00.a(C0201.m82(13740));
                        return;
                    } else {
                        p00.J(p, orVar.f());
                    }
                } else {
                    return;
                }
            } catch (IOException e) {
                p00.a(e.getMessage());
                return;
            }
        }
    }
}
