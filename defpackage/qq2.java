package defpackage;

import java.io.IOException;
import java.io.InputStream;
import vigqyno.C0201;

/* renamed from: qq2  reason: default package */
/* compiled from: MemoryCacheImageInputStream */
public class qq2 extends pq2 {
    private InputStream g;
    private rq2 h = new rq2();

    public qq2(InputStream inputStream) {
        if (inputStream != null) {
            this.g = inputStream;
            return;
        }
        throw new IllegalArgumentException(C0201.m82(2047));
    }

    @Override // defpackage.pq2
    public void b() throws IOException {
        super.b();
        this.h.b();
    }

    @Override // defpackage.pq2
    public int f() throws IOException {
        this.d = 0;
        if (this.b >= this.h.f()) {
            int f = (int) ((this.b - this.h.f()) + 1);
            if (this.h.a(this.g, f) < f) {
                return -1;
            }
        }
        int c = this.h.c(this.b);
        if (c >= 0) {
            this.b++;
        }
        return c;
    }

    @Override // defpackage.pq2
    public int g(byte[] bArr, int i, int i2) throws IOException {
        this.d = 0;
        if (this.b >= this.h.f()) {
            this.h.a(this.g, (int) ((this.b - this.h.f()) + ((long) i2)));
        }
        int d = this.h.d(bArr, i, i2, this.b);
        if (d > 0) {
            this.b += (long) d;
        }
        return d;
    }
}
