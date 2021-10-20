package defpackage;

import android.util.Log;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import vigqyno.C0201;

/* renamed from: kr2  reason: default package */
/* compiled from: ASCIIHexFilter */
public final class kr2 extends pr2 {
    private static final int[] a = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, -1, -1, -1, -1, -1, -1, -1, 10, 11, 12, 13, 14, 15, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 10, 11, 12, 13, 14, 15};

    private boolean c(int i) {
        return i == 62;
    }

    private boolean d(int i) {
        return i == 0 || i == 9 || i == 10 || i == 12 || i == 13 || i == 32;
    }

    @Override // defpackage.pr2
    public or2 a(InputStream inputStream, OutputStream outputStream, vq2 vq2, int i) throws IOException {
        int i2;
        while (true) {
            int read = inputStream.read();
            if (read == -1) {
                break;
            }
            while (d(read)) {
                read = inputStream.read();
            }
            if (read == -1 || c(read)) {
                break;
            }
            int i3 = a[read];
            String r2 = C0201.m82(12955);
            String r3 = C0201.m82(12956);
            String r4 = C0201.m82(12957);
            if (i3 == -1) {
                Log.e(r4, r3 + read + r2 + ((char) read));
            }
            i2 = a[read] * 16;
            int read2 = inputStream.read();
            if (read2 == -1 || c(read2)) {
                outputStream.write(i2);
            } else {
                if (read2 >= 0) {
                    if (a[read2] == -1) {
                        Log.e(r4, r3 + read2 + r2 + ((char) read2));
                    }
                    i2 += a[read2];
                }
                outputStream.write(i2);
            }
        }
        outputStream.write(i2);
        outputStream.flush();
        return new or2(vq2);
    }
}
