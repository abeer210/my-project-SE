package defpackage;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import vigqyno.C0201;

/* renamed from: xo  reason: default package */
/* compiled from: ContentLengthInputStream */
public final class xo extends FilterInputStream {
    private final long a;
    private int b;

    private xo(InputStream inputStream, long j) {
        super(inputStream);
        this.a = j;
    }

    private int a(int i) throws IOException {
        if (i >= 0) {
            this.b += i;
        } else if (this.a - ((long) this.b) > 0) {
            throw new IOException(C0201.m82(17917) + this.a + C0201.m82(17918) + this.b);
        }
        return i;
    }

    public static InputStream c(InputStream inputStream, long j) {
        return new xo(inputStream, j);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int available() throws IOException {
        return (int) Math.max(this.a - ((long) this.b), (long) ((FilterInputStream) this).in.available());
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int read() throws IOException {
        int read;
        read = super.read();
        a(read >= 0 ? 1 : -1);
        return read;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int read(byte[] bArr, int i, int i2) throws IOException {
        int read;
        read = super.read(bArr, i, i2);
        a(read);
        return read;
    }
}
