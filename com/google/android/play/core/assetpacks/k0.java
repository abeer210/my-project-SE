package com.google.android.play.core.assetpacks;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import vigqyno.C0201;

public final class k0 extends FilterInputStream {
    private final x1 a = new x1();
    private byte[] b = new byte[4096];
    private long c;
    private boolean d = false;
    private boolean e = false;

    public k0(InputStream inputStream) {
        super(inputStream);
    }

    private final int a(byte[] bArr, int i, int i2) throws IOException {
        return Math.max(0, super.read(bArr, i, i2));
    }

    private final boolean h(int i) throws IOException {
        int a2 = a(this.b, 0, i);
        if (a2 != i) {
            int i2 = i - a2;
            if (a(this.b, a2, i2) != i2) {
                this.a.b(this.b, 0, a2);
                return false;
            }
        }
        this.a.b(this.b, 0, i);
        return true;
    }

    public final r2 c() throws IOException {
        byte[] bArr;
        if (this.c > 0) {
            do {
                bArr = this.b;
            } while (read(bArr, 0, bArr.length) != -1);
        }
        if (this.d || this.e) {
            return new r2(null, -1, -1, false, false, null);
        }
        if (!h(30)) {
            this.d = true;
            return this.a.c();
        }
        r2 c2 = this.a.c();
        if (c2.h()) {
            this.e = true;
            return c2;
        } else if (c2.e() != 4294967295L) {
            int d2 = this.a.d() - 30;
            long j = (long) d2;
            int length = this.b.length;
            if (j > ((long) length)) {
                do {
                    length += length;
                } while (((long) length) < j);
                this.b = Arrays.copyOf(this.b, length);
            }
            if (!h(d2)) {
                this.d = true;
                return this.a.c();
            }
            r2 c3 = this.a.c();
            this.c = c3.e();
            return c3;
        } else {
            throw new t0(C0201.m82(19316));
        }
    }

    public final boolean k() {
        return this.d;
    }

    public final boolean m() {
        return this.e;
    }

    public final long n() {
        return this.c;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        long j = this.c;
        if (j <= 0 || this.d) {
            return -1;
        }
        int a2 = a(bArr, i, (int) Math.min(j, (long) i2));
        this.c -= (long) a2;
        if (a2 != 0) {
            return a2;
        }
        this.d = true;
        return 0;
    }
}
