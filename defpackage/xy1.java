package defpackage;

import java.io.IOException;
import java.io.InputStream;

/* renamed from: xy1  reason: default package */
public final class xy1 extends wy1 {
    private final wy1 a;
    private final long b;
    private final long c;

    public xy1(wy1 wy1, long j, long j2) {
        this.a = wy1;
        long k = k(j);
        this.b = k;
        this.c = k(k + j2);
    }

    private final long k(long j) {
        if (j < 0) {
            return 0;
        }
        return j > this.a.a() ? this.a.a() : j;
    }

    @Override // defpackage.wy1
    public final long a() {
        return this.c - this.b;
    }

    @Override // defpackage.wy1
    public final InputStream c(long j, long j2) throws IOException {
        long k = k(this.b);
        return this.a.c(k, k(j2 + k) - k);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
    }
}
