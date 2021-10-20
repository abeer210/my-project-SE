package com.google.android.play.core.assetpacks;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public final class w0 extends OutputStream {
    private final x1 a = new x1();
    private final File b;
    private final l2 c;
    private long d;
    private long e;
    private FileOutputStream f;
    private r2 g;

    public w0(File file, l2 l2Var) {
        this.b = file;
        this.c = l2Var;
    }

    @Override // java.io.OutputStream
    public final void write(int i) throws IOException {
        write(new byte[]{(byte) i});
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) throws IOException {
        write(bArr, 0, bArr.length);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) throws IOException {
        int i3;
        while (i2 > 0) {
            if (this.d == 0 && this.e == 0) {
                int b2 = this.a.b(bArr, i, i2);
                if (b2 != -1) {
                    i += b2;
                    i2 -= b2;
                    r2 c2 = this.a.c();
                    this.g = c2;
                    if (c2.h()) {
                        this.d = 0;
                        this.c.k(this.g.i(), this.g.i().length);
                        this.e = (long) this.g.i().length;
                    } else if (!this.g.c() || this.g.b()) {
                        byte[] i4 = this.g.i();
                        this.c.k(i4, i4.length);
                        this.d = this.g.e();
                    } else {
                        this.c.f(this.g.i());
                        File file = new File(this.b, this.g.d());
                        file.getParentFile().mkdirs();
                        this.d = this.g.e();
                        this.f = new FileOutputStream(file);
                    }
                } else {
                    return;
                }
            }
            if (!this.g.b()) {
                if (this.g.h()) {
                    this.c.c(this.e, bArr, i, i2);
                    this.e += (long) i2;
                    i3 = i2;
                } else if (this.g.c()) {
                    i3 = (int) Math.min((long) i2, this.d);
                    this.f.write(bArr, i, i3);
                    long j = this.d - ((long) i3);
                    this.d = j;
                    if (j == 0) {
                        this.f.close();
                    }
                } else {
                    i3 = (int) Math.min((long) i2, this.d);
                    int length = this.g.i().length;
                    this.c.c((((long) length) + this.g.e()) - this.d, bArr, i, i3);
                    this.d -= (long) i3;
                }
                i += i3;
                i2 -= i3;
            }
        }
    }
}
