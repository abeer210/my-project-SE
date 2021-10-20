package defpackage;

import java.io.Closeable;
import java.io.IOException;

/* renamed from: js2  reason: default package */
/* compiled from: RandomAccessWrite */
public interface js2 extends Closeable {
    void write(int i) throws IOException;

    void write(byte[] bArr) throws IOException;

    void write(byte[] bArr, int i, int i2) throws IOException;
}
