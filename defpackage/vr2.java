package defpackage;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* renamed from: vr2  reason: default package */
/* compiled from: RunLengthDecodeFilter */
public final class vr2 extends pr2 {
    @Override // defpackage.pr2
    public or2 a(InputStream inputStream, OutputStream outputStream, vq2 vq2, int i) throws IOException {
        byte[] bArr = new byte[128];
        while (true) {
            int read = inputStream.read();
            if (read != -1 && read != 128) {
                if (read <= 127) {
                    int i2 = read + 1;
                    while (i2 > 0) {
                        int read2 = inputStream.read(bArr, 0, i2);
                        outputStream.write(bArr, 0, read2);
                        i2 -= read2;
                    }
                } else {
                    int read3 = inputStream.read();
                    for (int i3 = 0; i3 < 257 - read; i3++) {
                        outputStream.write(read3);
                    }
                }
            }
        }
        return new or2(vq2);
    }
}
