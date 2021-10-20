package com.facebook.imagepipeline.memory;

import defpackage.q60;
import java.nio.ByteBuffer;

/* compiled from: MemoryPooledByteBuffer */
public class x implements q60 {
    private final int a;
    public v60<u> b;

    public x(v60<u> v60, int i) {
        z50.g(v60);
        z50.b(i >= 0 && i <= v60.w().a());
        this.b = v60.clone();
        this.a = i;
    }

    public synchronized void a() {
        if (isClosed()) {
            throw new q60.a();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        v60.s(this.b);
        this.b = null;
    }

    @Override // defpackage.q60
    public synchronized byte e(int i) {
        a();
        boolean z = true;
        z50.b(i >= 0);
        if (i >= this.a) {
            z = false;
        }
        z50.b(z);
        return this.b.w().e(i);
    }

    @Override // defpackage.q60
    public synchronized int f(int i, byte[] bArr, int i2, int i3) {
        a();
        z50.b(i + i3 <= this.a);
        return this.b.w().f(i, bArr, i2, i3);
    }

    @Override // defpackage.q60
    public synchronized ByteBuffer g() {
        return this.b.w().g();
    }

    @Override // defpackage.q60
    public synchronized boolean isClosed() {
        return !v60.z(this.b);
    }

    @Override // defpackage.q60
    public synchronized long l() throws UnsupportedOperationException {
        a();
        return this.b.w().l();
    }

    @Override // defpackage.q60
    public synchronized int size() {
        a();
        return this.a;
    }
}
