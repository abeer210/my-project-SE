package com.facebook.imagepipeline.memory;

import android.util.Log;
import java.io.Closeable;
import java.nio.ByteBuffer;
import vigqyno.C0201;

/* compiled from: BufferMemoryChunk */
public class i implements u, Closeable {
    private ByteBuffer a;
    private final int b;
    private final long c = ((long) System.identityHashCode(this));

    public i(int i) {
        this.a = ByteBuffer.allocateDirect(i);
        this.b = i;
    }

    private void k(int i, u uVar, int i2, int i3) {
        if (uVar instanceof i) {
            z50.i(!isClosed());
            z50.i(!uVar.isClosed());
            w.b(i, uVar.a(), i2, i3, this.b);
            this.a.position(i);
            uVar.g().position(i2);
            byte[] bArr = new byte[i3];
            this.a.get(bArr, 0, i3);
            uVar.g().put(bArr, 0, i3);
            return;
        }
        throw new IllegalArgumentException(C0201.m82(36525));
    }

    @Override // com.facebook.imagepipeline.memory.u
    public int a() {
        return this.b;
    }

    @Override // com.facebook.imagepipeline.memory.u
    public void c(int i, u uVar, int i2, int i3) {
        z50.g(uVar);
        if (uVar.getUniqueId() == getUniqueId()) {
            String r0 = C0201.m82(36526);
            Log.w(r0, C0201.m82(36527) + Long.toHexString(getUniqueId()) + C0201.m82(36528) + Long.toHexString(uVar.getUniqueId()) + C0201.m82(36529));
            z50.b(false);
        }
        if (uVar.getUniqueId() < getUniqueId()) {
            synchronized (uVar) {
                synchronized (this) {
                    k(i, uVar, i2, i3);
                }
            }
            return;
        }
        synchronized (this) {
            synchronized (uVar) {
                k(i, uVar, i2, i3);
            }
        }
    }

    @Override // java.io.Closeable, com.facebook.imagepipeline.memory.u, java.lang.AutoCloseable
    public synchronized void close() {
        this.a = null;
    }

    @Override // com.facebook.imagepipeline.memory.u
    public synchronized byte e(int i) {
        boolean z = true;
        z50.i(!isClosed());
        z50.b(i >= 0);
        if (i >= this.b) {
            z = false;
        }
        z50.b(z);
        return this.a.get(i);
    }

    @Override // com.facebook.imagepipeline.memory.u
    public synchronized int f(int i, byte[] bArr, int i2, int i3) {
        int a2;
        z50.g(bArr);
        z50.i(!isClosed());
        a2 = w.a(i, i3, this.b);
        w.b(i, bArr.length, i2, a2, this.b);
        this.a.position(i);
        this.a.get(bArr, i2, a2);
        return a2;
    }

    @Override // com.facebook.imagepipeline.memory.u
    public synchronized ByteBuffer g() {
        return this.a;
    }

    @Override // com.facebook.imagepipeline.memory.u
    public long getUniqueId() {
        return this.c;
    }

    @Override // com.facebook.imagepipeline.memory.u
    public synchronized int h(int i, byte[] bArr, int i2, int i3) {
        int a2;
        z50.g(bArr);
        z50.i(!isClosed());
        a2 = w.a(i, i3, this.b);
        w.b(i, bArr.length, i2, a2, this.b);
        this.a.position(i);
        this.a.put(bArr, i2, a2);
        return a2;
    }

    @Override // com.facebook.imagepipeline.memory.u
    public synchronized boolean isClosed() {
        return this.a == null;
    }

    @Override // com.facebook.imagepipeline.memory.u
    public long l() {
        throw new UnsupportedOperationException(C0201.m82(36530));
    }
}
