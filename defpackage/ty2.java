package defpackage;

import java.io.Closeable;
import java.io.IOException;

/* renamed from: ty2  reason: default package */
/* compiled from: Source */
public interface ty2 extends Closeable {
    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close() throws IOException;

    long read(ay2 ay2, long j) throws IOException;

    uy2 timeout();
}
