package defpackage;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: wy1  reason: default package */
public abstract class wy1 implements Closeable {
    public abstract long a();

    public abstract InputStream c(long j, long j2) throws IOException;

    public synchronized InputStream h() throws IOException {
        return c(0, a());
    }
}
