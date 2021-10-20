package defpackage;

import java.io.IOException;
import java.util.Collections;
import vigqyno.C0201;

/* renamed from: vs  reason: default package */
/* compiled from: ExifReader */
public class vs implements wp {
    @Override // defpackage.wp
    public void a(Iterable<byte[]> iterable, wr wrVar, yp ypVar) {
        for (byte[] bArr : iterable) {
            if (bArr.length >= 6 && new String(bArr, 0, 6).equals("Exif\u0000\u0000")) {
                d(new br(bArr), wrVar, 6);
            }
        }
    }

    @Override // defpackage.wp
    public Iterable<yp> b() {
        return Collections.singletonList(yp.APP1);
    }

    public void c(kr krVar, wr wrVar) {
        d(krVar, wrVar, 0);
    }

    public void d(kr krVar, wr wrVar, int i) {
        e(krVar, wrVar, i, null);
    }

    public void e(kr krVar, wr wrVar, int i, tr trVar) {
        String r0 = C0201.m82(13422);
        at atVar = new at(wrVar, trVar);
        try {
            new xq().d(krVar, atVar, i);
        } catch (wq e) {
            atVar.c(r0 + e.getMessage());
            e.printStackTrace(System.err);
        } catch (IOException e2) {
            atVar.c(r0 + e2.getMessage());
            e2.printStackTrace(System.err);
        }
    }
}
