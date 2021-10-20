package defpackage;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import vigqyno.C0201;

/* renamed from: v01  reason: default package */
public final class v01 extends FilterInputStream {
    private long a;
    private long b = -1;

    public v01(InputStream inputStream, long j) {
        super(inputStream);
        r01.a(inputStream);
        this.a = 1048576;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int available() throws IOException {
        return (int) Math.min((long) ((FilterInputStream) this).in.available(), this.a);
    }

    public final synchronized void mark(int i) {
        ((FilterInputStream) this).in.mark(i);
        this.b = this.a;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        if (this.a == 0) {
            return -1;
        }
        int read = ((FilterInputStream) this).in.read();
        if (read != -1) {
            this.a--;
        }
        return read;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void reset() throws IOException {
        if (!((FilterInputStream) this).in.markSupported()) {
            throw new IOException(C0201.m82(17658));
        } else if (this.b != -1) {
            ((FilterInputStream) this).in.reset();
            this.a = this.b;
        } else {
            throw new IOException(C0201.m82(17657));
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j) throws IOException {
        long skip = ((FilterInputStream) this).in.skip(Math.min(j, this.a));
        this.a -= skip;
        return skip;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        long j = this.a;
        if (j == 0) {
            return -1;
        }
        int read = ((FilterInputStream) this).in.read(bArr, i, (int) Math.min((long) i2, j));
        if (read != -1) {
            this.a -= (long) read;
        }
        return read;
    }
}
