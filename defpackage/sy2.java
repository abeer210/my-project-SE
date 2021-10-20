package defpackage;

import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;

/* renamed from: sy2  reason: default package */
/* compiled from: Sink */
public interface sy2 extends Closeable, Flushable {
    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close() throws IOException;

    @Override // java.io.Flushable
    void flush() throws IOException;

    uy2 timeout();

    void write(ay2 ay2, long j) throws IOException;
}
