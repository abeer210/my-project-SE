package defpackage;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* renamed from: tb3  reason: default package */
/* compiled from: TeeInputStream */
public class tb3 extends InputStream {
    private final InputStream a;
    private final OutputStream b;

    public tb3(InputStream inputStream, OutputStream outputStream) {
        this.a = inputStream;
        this.b = outputStream;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.io.InputStream
    public void close() throws IOException {
        this.a.close();
        this.b.close();
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        int read = this.a.read(bArr, i, i2);
        if (read > 0) {
            this.b.write(bArr, i, read);
        }
        return read;
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        int read = this.a.read();
        if (read >= 0) {
            this.b.write(read);
        }
        return read;
    }
}
