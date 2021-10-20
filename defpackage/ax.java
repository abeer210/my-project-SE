package defpackage;

import java.util.Collections;

/* renamed from: ax  reason: default package */
/* compiled from: JpegCommentReader */
public class ax implements wp {
    @Override // defpackage.wp
    public void a(Iterable<byte[]> iterable, wr wrVar, yp ypVar) {
        for (byte[] bArr : iterable) {
            zw zwVar = new zw();
            wrVar.a(zwVar);
            zwVar.T(0, new yr(bArr, null));
        }
    }

    @Override // defpackage.wp
    public Iterable<yp> b() {
        return Collections.singletonList(yp.COM);
    }
}
