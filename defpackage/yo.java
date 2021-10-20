package defpackage;

import java.io.IOException;
import java.io.InputStream;
import java.util.Queue;

/* renamed from: yo  reason: default package */
/* compiled from: ExceptionCatchingInputStream */
public class yo extends InputStream {
    private static final Queue<yo> c = fp.e(0);
    private InputStream a;
    private IOException b;

    public static yo c(InputStream inputStream) {
        yo poll;
        synchronized (c) {
            poll = c.poll();
        }
        if (poll == null) {
            poll = new yo();
        }
        poll.k(inputStream);
        return poll;
    }

    public IOException a() {
        return this.b;
    }

    @Override // java.io.InputStream
    public int available() throws IOException {
        return this.a.available();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.io.InputStream
    public void close() throws IOException {
        this.a.close();
    }

    public void h() {
        this.b = null;
        this.a = null;
        synchronized (c) {
            c.offer(this);
        }
    }

    public void k(InputStream inputStream) {
        this.a = inputStream;
    }

    public void mark(int i) {
        this.a.mark(i);
    }

    public boolean markSupported() {
        return this.a.markSupported();
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) {
        try {
            return this.a.read(bArr);
        } catch (IOException e) {
            this.b = e;
            return -1;
        }
    }

    @Override // java.io.InputStream
    public synchronized void reset() throws IOException {
        this.a.reset();
    }

    @Override // java.io.InputStream
    public long skip(long j) {
        try {
            return this.a.skip(j);
        } catch (IOException e) {
            this.b = e;
            return 0;
        }
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) {
        try {
            return this.a.read(bArr, i, i2);
        } catch (IOException e) {
            this.b = e;
            return -1;
        }
    }

    @Override // java.io.InputStream
    public int read() {
        try {
            return this.a.read();
        } catch (IOException e) {
            this.b = e;
            return -1;
        }
    }
}
