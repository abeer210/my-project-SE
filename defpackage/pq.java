package defpackage;

import java.io.IOException;
import java.io.InputStream;
import vigqyno.C0201;

/* renamed from: pq  reason: default package */
/* compiled from: RafMetadataReader */
public class pq {
    public static wr a(InputStream inputStream) throws up, IOException {
        if (inputStream.markSupported()) {
            inputStream.mark(512);
            byte[] bArr = new byte[512];
            int read = inputStream.read(bArr);
            if (read != -1) {
                inputStream.reset();
                int i = 0;
                while (true) {
                    if (i >= read - 2) {
                        break;
                    } else if (bArr[i] == -1 && bArr[i + 1] == -40 && bArr[i + 2] == -1) {
                        long j = (long) i;
                        if (inputStream.skip(j) != j) {
                            throw new IOException(C0201.m82(37879));
                        }
                    } else {
                        i++;
                    }
                }
                return tp.c(inputStream);
            }
            throw new IOException(C0201.m82(37880));
        }
        throw new IOException(C0201.m82(37881));
    }
}
