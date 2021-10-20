package defpackage;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import vigqyno.C0201;

/* renamed from: a70  reason: default package */
/* compiled from: LimitedInputStream */
public class a70 extends FilterInputStream {
    private int a;
    private int b;

    public a70(InputStream inputStream, int i) {
        super(inputStream);
        if (inputStream == null) {
            throw null;
        } else if (i >= 0) {
            this.a = i;
            this.b = -1;
        } else {
            throw new IllegalArgumentException(C0201.m82(21622));
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int available() throws IOException {
        return Math.min(((FilterInputStream) this).in.available(), this.a);
    }

    public void mark(int i) {
        if (((FilterInputStream) this).in.markSupported()) {
            ((FilterInputStream) this).in.mark(i);
            this.b = this.a;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() throws IOException {
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
    public void reset() throws IOException {
        if (!((FilterInputStream) this).in.markSupported()) {
            throw new IOException(C0201.m82(21624));
        } else if (this.b != -1) {
            ((FilterInputStream) this).in.reset();
            this.a = this.b;
        } else {
            throw new IOException(C0201.m82(21623));
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public long skip(long j) throws IOException {
        long skip = ((FilterInputStream) this).in.skip(Math.min(j, (long) this.a));
        this.a = (int) (((long) this.a) - skip);
        return skip;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        int i3 = this.a;
        if (i3 == 0) {
            return -1;
        }
        int read = ((FilterInputStream) this).in.read(bArr, i, Math.min(i2, i3));
        if (read > 0) {
            this.a -= read;
        }
        return read;
    }
}
