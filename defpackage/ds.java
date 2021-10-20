package defpackage;

import java.io.IOException;
import java.util.Collections;
import vigqyno.C0201;

/* renamed from: ds  reason: default package */
/* compiled from: AdobeJpegReader */
public class ds implements wp {
    @Override // defpackage.wp
    public void a(Iterable<byte[]> iterable, wr wrVar, yp ypVar) {
        for (byte[] bArr : iterable) {
            if (bArr.length == 12) {
                if (C0201.m82(10875).equalsIgnoreCase(new String(bArr, 0, 5))) {
                    c(new nr(bArr), wrVar);
                }
            }
        }
    }

    @Override // defpackage.wp
    public Iterable<yp> b() {
        return Collections.singletonList(yp.APPE);
    }

    public void c(or orVar, wr wrVar) {
        cs csVar = new cs();
        wrVar.a(csVar);
        try {
            orVar.s(false);
            if (!orVar.m(5).equals(C0201.m82(10876))) {
                csVar.a(C0201.m82(10877));
                return;
            }
            csVar.J(0, orVar.p());
            csVar.J(1, orVar.p());
            csVar.J(2, orVar.p());
            csVar.J(3, orVar.h());
        } catch (IOException e) {
            csVar.a(C0201.m82(10878) + e.getMessage());
        }
    }
}
