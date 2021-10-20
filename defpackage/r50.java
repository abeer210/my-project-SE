package defpackage;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import vigqyno.C0201;

/* renamed from: r50  reason: default package */
/* compiled from: ByteStreams */
public final class r50 {
    public static long a(InputStream inputStream, OutputStream outputStream) throws IOException {
        z50.g(inputStream);
        z50.g(outputStream);
        byte[] bArr = new byte[4096];
        long j = 0;
        while (true) {
            int read = inputStream.read(bArr);
            if (read == -1) {
                return j;
            }
            outputStream.write(bArr, 0, read);
            j += (long) read;
        }
    }

    public static int b(InputStream inputStream, byte[] bArr, int i, int i2) throws IOException {
        z50.g(inputStream);
        z50.g(bArr);
        if (i2 >= 0) {
            int i3 = 0;
            while (i3 < i2) {
                int read = inputStream.read(bArr, i + i3, i2 - i3);
                if (read == -1) {
                    break;
                }
                i3 += read;
            }
            return i3;
        }
        throw new IndexOutOfBoundsException(C0201.m82(18934));
    }
}
