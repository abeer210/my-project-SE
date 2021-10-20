package defpackage;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.channels.WritableByteChannel;

/* renamed from: by2  reason: default package */
/* compiled from: BufferedSink */
public interface by2 extends sy2, WritableByteChannel {
    by2 C(int i) throws IOException;

    by2 O(int i) throws IOException;

    by2 R0(dy2 dy2) throws IOException;

    by2 X() throws IOException;

    by2 c1(long j) throws IOException;

    ay2 d();

    OutputStream e1();

    @Override // defpackage.sy2, java.io.Flushable
    void flush() throws IOException;

    by2 l0(String str) throws IOException;

    by2 t() throws IOException;

    by2 v(int i) throws IOException;

    by2 v0(String str, int i, int i2) throws IOException;

    by2 write(byte[] bArr) throws IOException;

    by2 write(byte[] bArr, int i, int i2) throws IOException;

    long x0(ty2 ty2) throws IOException;

    by2 y0(long j) throws IOException;
}
