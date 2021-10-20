package defpackage;

import java.io.IOException;
import java.util.Collections;
import vigqyno.C0201;

/* renamed from: sw  reason: default package */
/* compiled from: JfifReader */
public class sw implements wp {
    @Override // defpackage.wp
    public void a(Iterable<byte[]> iterable, wr wrVar, yp ypVar) {
        for (byte[] bArr : iterable) {
            if (bArr.length >= 4) {
                if (C0201.m82(7304).equals(new String(bArr, 0, 4))) {
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
        rw rwVar = new rw();
        wrVar.a(rwVar);
        try {
            rwVar.J(5, krVar.s(5));
            rwVar.J(7, krVar.u(7));
            rwVar.J(8, krVar.s(8));
            rwVar.J(10, krVar.s(10));
            rwVar.J(12, krVar.u(12));
            rwVar.J(13, krVar.u(13));
        } catch (IOException e) {
            rwVar.a(e.getMessage());
        }
    }
}
