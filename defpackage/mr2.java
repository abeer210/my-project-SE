package defpackage;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import vigqyno.C0201;

/* renamed from: mr2  reason: default package */
/* compiled from: CryptFilter */
public final class mr2 extends pr2 {
    @Override // defpackage.pr2
    public or2 a(InputStream inputStream, OutputStream outputStream, vq2 vq2, int i) throws IOException {
        ar2 ar2 = (ar2) vq2.k0(ar2.b0);
        if (ar2 == null || ar2.equals(ar2.Q)) {
            new sr2().a(inputStream, outputStream, vq2, i);
            return new or2(vq2);
        }
        throw new IOException(C0201.m82(36759) + ar2.x());
    }
}
