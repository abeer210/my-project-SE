package defpackage;

import java.io.IOException;
import java.io.OutputStream;

/* renamed from: t60  reason: default package */
/* compiled from: PooledByteBufferOutputStream */
public abstract class t60 extends OutputStream {
    public abstract q60 a();

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        try {
            super.close();
        } catch (IOException e) {
            e60.a(e);
            throw null;
        }
    }

    public abstract int size();
}
