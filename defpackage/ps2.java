package defpackage;

import java.io.IOException;
import java.io.InputStream;
import java.io.PushbackInputStream;

/* renamed from: ps2  reason: default package */
/* compiled from: InputStreamSource */
public final class ps2 implements us2 {
    private final PushbackInputStream a;
    private int b = 0;

    public ps2(InputStream inputStream) {
        this.a = new PushbackInputStream(inputStream, 32767);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.a.close();
    }

    @Override // defpackage.us2
    public long getPosition() throws IOException {
        return (long) this.b;
    }

    @Override // defpackage.us2
    public byte[] i(int i) throws IOException {
        byte[] bArr = new byte[i];
        int i2 = 0;
        while (i > 0) {
            int read = read(bArr, i2, i);
            i2 += read;
            i -= read;
            this.b += read;
        }
        return bArr;
    }

    @Override // defpackage.us2
    public boolean j() throws IOException {
        return peek() == -1;
    }

    @Override // defpackage.us2
    public int peek() throws IOException {
        int read = this.a.read();
        if (read != -1) {
            this.a.unread(read);
        }
        return read;
    }

    @Override // defpackage.us2
    public int read() throws IOException {
        int read = this.a.read();
        this.b++;
        return read;
    }

    @Override // defpackage.us2
    public void unread(int i) throws IOException {
        this.a.unread(i);
        this.b--;
    }

    @Override // defpackage.us2
    public int read(byte[] bArr) throws IOException {
        int read = this.a.read(bArr);
        this.b += read;
        return read;
    }

    @Override // defpackage.us2
    public void unread(byte[] bArr) throws IOException {
        this.a.unread(bArr);
        this.b -= bArr.length;
    }

    public int read(byte[] bArr, int i, int i2) throws IOException {
        int read = this.a.read(bArr, i, i2);
        this.b += read;
        return read;
    }
}
