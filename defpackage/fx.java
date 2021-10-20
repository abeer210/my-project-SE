package defpackage;

import java.io.IOException;
import java.util.Collections;
import vigqyno.C0201;

/* renamed from: fx  reason: default package */
/* compiled from: JpegDnlReader */
public class fx implements wp {
    @Override // defpackage.wp
    public void a(Iterable<byte[]> iterable, wr wrVar, yp ypVar) {
        for (byte[] bArr : iterable) {
            c(bArr, wrVar, ypVar);
        }
    }

    @Override // defpackage.wp
    public Iterable<yp> b() {
        return Collections.singletonList(yp.DNL);
    }

    public void c(byte[] bArr, wr wrVar, yp ypVar) {
        ex exVar = (ex) wrVar.e(ex.class);
        if (exVar == null) {
            ur urVar = new ur();
            wrVar.a(urVar);
            urVar.a(C0201.m82(16104));
            return;
        }
        nr nrVar = new nr(bArr);
        try {
            Integer l = exVar.l(1);
            if (l == null || l.intValue() == 0) {
                exVar.J(1, nrVar.p());
            }
        } catch (IOException e) {
            exVar.a(e.getMessage());
        }
    }
}
