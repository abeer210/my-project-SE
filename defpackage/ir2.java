package defpackage;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* renamed from: ir2  reason: default package */
/* compiled from: ASCII85Filter */
public final class ir2 extends pr2 {
    @Override // defpackage.pr2
    public or2 a(InputStream inputStream, OutputStream outputStream, vq2 vq2, int i) throws IOException {
        Throwable th;
        jr2 jr2 = null;
        try {
            jr2 jr22 = new jr2(inputStream);
            try {
                byte[] bArr = new byte[1024];
                while (true) {
                    int read = jr22.read(bArr, 0, 1024);
                    if (read != -1) {
                        outputStream.write(bArr, 0, read);
                    } else {
                        outputStream.flush();
                        bs2.a(jr22);
                        return new or2(vq2);
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                jr2 = jr22;
                bs2.a(jr2);
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            bs2.a(jr2);
            throw th;
        }
    }
}
