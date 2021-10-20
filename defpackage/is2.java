package defpackage;

import java.io.Closeable;
import java.io.IOException;

/* renamed from: is2  reason: default package */
/* compiled from: RandomAccessRead */
public interface is2 extends Closeable {
    long getPosition() throws IOException;

    void h0(int i) throws IOException;

    byte[] i(int i) throws IOException;

    boolean isClosed();

    boolean j() throws IOException;

    long length() throws IOException;

    int peek() throws IOException;

    int read() throws IOException;

    int read(byte[] bArr) throws IOException;

    int read(byte[] bArr, int i, int i2) throws IOException;

    void seek(long j) throws IOException;
}
