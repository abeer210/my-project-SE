package defpackage;

import java.io.Closeable;
import java.io.IOException;

/* renamed from: us2  reason: default package */
/* compiled from: SequentialSource */
public interface us2 extends Closeable {
    long getPosition() throws IOException;

    byte[] i(int i) throws IOException;

    boolean j() throws IOException;

    int peek() throws IOException;

    int read() throws IOException;

    int read(byte[] bArr) throws IOException;

    void unread(int i) throws IOException;

    void unread(byte[] bArr) throws IOException;
}
