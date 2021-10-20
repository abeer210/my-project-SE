package defpackage;

import java.io.IOException;
import java.util.Arrays;

/* renamed from: gx  reason: default package */
/* compiled from: JpegReader */
public class gx implements wp {
    @Override // defpackage.wp
    public void a(Iterable<byte[]> iterable, wr wrVar, yp ypVar) {
        for (byte[] bArr : iterable) {
            c(bArr, wrVar, ypVar);
        }
    }

    @Override // defpackage.wp
    public Iterable<yp> b() {
        return Arrays.asList(yp.SOF0, yp.SOF1, yp.SOF2, yp.SOF3, yp.SOF5, yp.SOF6, yp.SOF7, yp.SOF9, yp.SOF10, yp.SOF11, yp.SOF13, yp.SOF14, yp.SOF15);
    }

    public void c(byte[] bArr, wr wrVar, yp ypVar) {
        ex exVar = new ex();
        wrVar.a(exVar);
        exVar.J(-3, ypVar.a - yp.SOF0.a);
        nr nrVar = new nr(bArr);
        try {
            exVar.J(0, nrVar.r());
            exVar.J(1, nrVar.p());
            exVar.J(3, nrVar.p());
            short r = nrVar.r();
            exVar.J(5, r);
            for (int i = 0; i < r; i++) {
                exVar.M(i + 6, new bx(nrVar.r(), nrVar.r(), nrVar.r()));
            }
        } catch (IOException e) {
            exVar.a(e.getMessage());
        }
    }
}
