package com.facebook.imagepipeline.memory;

import java.io.IOException;
import vigqyno.C0201;

/* compiled from: MemoryPooledByteBufferOutputStream */
public class z extends t60 {
    private final v a;
    private v60<u> b;
    private int c;

    /* compiled from: MemoryPooledByteBufferOutputStream */
    public static class a extends RuntimeException {
        public a() {
            super(C0201.m82(27895));
        }
    }

    public z(v vVar) {
        this(vVar, vVar.y());
    }

    private void c() {
        if (!v60.z(this.b)) {
            throw new a();
        }
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable, defpackage.t60
    public void close() {
        v60.s(this.b);
        this.b = null;
        this.c = -1;
        super.close();
    }

    public void h(int i) {
        c();
        if (i > this.b.w().a()) {
            u uVar = (u) this.a.get(i);
            this.b.w().c(0, uVar, 0, this.c);
            this.b.close();
            this.b = v60.F(uVar, this.a);
        }
    }

    /* renamed from: k */
    public x a() {
        c();
        return new x(this.b, this.c);
    }

    @Override // defpackage.t60
    public int size() {
        return this.c;
    }

    @Override // java.io.OutputStream
    public void write(int i) throws IOException {
        write(new byte[]{(byte) i});
    }

    public z(v vVar, int i) {
        z50.b(i > 0);
        z50.g(vVar);
        v vVar2 = vVar;
        this.a = vVar2;
        this.c = 0;
        this.b = v60.F(vVar2.get(i), this.a);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i, int i2) throws IOException {
        if (i < 0 || i2 < 0 || i + i2 > bArr.length) {
            throw new ArrayIndexOutOfBoundsException(C0201.m82(22281) + bArr.length + C0201.m82(22282) + i + C0201.m82(22283) + i2);
        }
        c();
        h(this.c + i2);
        this.b.w().h(this.c, bArr, i, i2);
        this.c += i2;
    }
}
