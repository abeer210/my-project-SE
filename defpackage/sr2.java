package defpackage;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* renamed from: sr2  reason: default package */
/* compiled from: IdentityFilter */
public final class sr2 extends pr2 {
    @Override // defpackage.pr2
    public or2 a(InputStream inputStream, OutputStream outputStream, vq2 vq2, int i) throws IOException {
        byte[] bArr = new byte[1024];
        while (true) {
            int read = inputStream.read(bArr, 0, 1024);
            if (read != -1) {
                outputStream.write(bArr, 0, read);
            } else {
                outputStream.flush();
                return new or2(vq2);
            }
        }
    }
}
