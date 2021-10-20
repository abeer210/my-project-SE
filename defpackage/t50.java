package defpackage;

import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* renamed from: t50  reason: default package */
/* compiled from: CountingOutputStream */
public class t50 extends FilterOutputStream {
    private long a = 0;

    public t50(OutputStream outputStream) {
        super(outputStream);
    }

    public long a() {
        return this.a;
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.io.FilterOutputStream, java.lang.AutoCloseable
    public void close() throws IOException {
        ((FilterOutputStream) this).out.close();
    }

    @Override // java.io.OutputStream, java.io.FilterOutputStream
    public void write(byte[] bArr, int i, int i2) throws IOException {
        ((FilterOutputStream) this).out.write(bArr, i, i2);
        this.a += (long) i2;
    }

    @Override // java.io.OutputStream, java.io.FilterOutputStream
    public void write(int i) throws IOException {
        ((FilterOutputStream) this).out.write(i);
        this.a++;
    }
}
