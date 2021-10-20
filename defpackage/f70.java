package defpackage;

import java.io.IOException;
import java.io.InputStream;

/* renamed from: f70  reason: default package */
/* compiled from: StreamUtil */
public class f70 {
    public static long a(InputStream inputStream, long j) throws IOException {
        z50.g(inputStream);
        z50.b(j >= 0);
        long j2 = j;
        while (j2 > 0) {
            long skip = inputStream.skip(j2);
            if (skip <= 0) {
                if (inputStream.read() == -1) {
                    return j - j2;
                }
                skip = 1;
            }
            j2 -= skip;
        }
        return j;
    }
}
