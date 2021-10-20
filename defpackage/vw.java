package defpackage;

import java.io.IOException;
import java.util.Collections;
import vigqyno.C0201;

/* renamed from: vw  reason: default package */
/* compiled from: JfxxReader */
public class vw implements wp {
    @Override // defpackage.wp
    public void a(Iterable<byte[]> iterable, wr wrVar, yp ypVar) {
        for (byte[] bArr : iterable) {
            if (bArr.length >= 4) {
                if (C0201.m82(13695).equals(new String(bArr, 0, 4))) {
                    c(new br(bArr), wrVar);
                }
            }
        }
    }

    @Override // defpackage.wp
    public Iterable<yp> b() {
        return Collections.singletonList(yp.APP0);
    }

    public void c(kr krVar, wr wrVar) {
        uw uwVar = new uw();
        wrVar.a(uwVar);
        try {
            uwVar.J(5, krVar.u(5));
        } catch (IOException e) {
            uwVar.a(e.getMessage());
        }
    }
}
