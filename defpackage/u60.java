package defpackage;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* renamed from: u60  reason: default package */
/* compiled from: PooledByteStreams */
public class u60 {
    private final int a;
    private final k60 b;

    public u60(k60 k60) {
        this(k60, 16384);
    }

    public long a(InputStream inputStream, OutputStream outputStream) throws IOException {
        byte[] bArr = (byte[]) this.b.get(this.a);
        long j = 0;
        while (true) {
            try {
                int read = inputStream.read(bArr, 0, this.a);
                if (read == -1) {
                    return j;
                }
                outputStream.write(bArr, 0, read);
                j += (long) read;
            } finally {
                this.b.a(bArr);
            }
        }
    }

    public u60(k60 k60, int i) {
        z50.b(i > 0);
        this.a = i;
        this.b = k60;
    }
}
