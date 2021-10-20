package defpackage;

import java.io.IOException;
import java.io.InputStream;
import vigqyno.C0188;

/* renamed from: gs2  reason: default package */
/* compiled from: RandomAccessInputStream */
public class gs2 extends InputStream {
    private final is2 a;
    private long b = 0;

    public gs2(is2 is2) {
        this.a = is2;
    }

    public void a() throws IOException {
        this.a.seek(this.b);
    }

    @Override // java.io.InputStream
    public int available() throws IOException {
        a();
        long length = this.a.length() - this.a.getPosition();
        return length > 2147483647L ? C0188.f24 : (int) length;
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        a();
        if (this.a.j()) {
            return -1;
        }
        int read = this.a.read();
        this.b++;
        return read;
    }

    @Override // java.io.InputStream
    public long skip(long j) throws IOException {
        a();
        this.a.seek(this.b + j);
        this.b += j;
        return j;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        a();
        if (this.a.j()) {
            return -1;
        }
        int read = this.a.read(bArr, i, i2);
        this.b += (long) read;
        return read;
    }
}
