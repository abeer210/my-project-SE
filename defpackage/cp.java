package defpackage;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import vigqyno.C0188;

/* renamed from: cp  reason: default package */
/* compiled from: MarkEnforcingInputStream */
public class cp extends FilterInputStream {
    private int a = C0188.f23;

    public cp(InputStream inputStream) {
        super(inputStream);
    }

    private long a(long j) {
        int i = this.a;
        if (i == 0) {
            return -1;
        }
        return (i == Integer.MIN_VALUE || j <= ((long) i)) ? j : (long) i;
    }

    private void c(long j) {
        int i = this.a;
        if (i != Integer.MIN_VALUE && j != -1) {
            this.a = (int) (((long) i) - j);
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int available() throws IOException {
        int i = this.a;
        if (i == Integer.MIN_VALUE) {
            return super.available();
        }
        return Math.min(i, super.available());
    }

    public synchronized void mark(int i) {
        super.mark(i);
        this.a = i;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() throws IOException {
        if (a(1) == -1) {
            return -1;
        }
        int read = super.read();
        c(1);
        return read;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void reset() throws IOException {
        super.reset();
        this.a = C0188.f23;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public long skip(long j) throws IOException {
        long a2 = a(j);
        if (a2 == -1) {
            return 0;
        }
        long skip = super.skip(a2);
        c(skip);
        return skip;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        int a2 = (int) a((long) i2);
        if (a2 == -1) {
            return -1;
        }
        int read = super.read(bArr, i, a2);
        c((long) read);
        return read;
    }
}
