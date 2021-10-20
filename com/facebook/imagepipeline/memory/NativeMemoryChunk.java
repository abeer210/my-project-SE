package com.facebook.imagepipeline.memory;

import android.util.Log;
import com.facebook.imagepipeline.nativecode.a;
import java.io.Closeable;
import java.nio.ByteBuffer;
import vigqyno.C0201;

@u50
public class NativeMemoryChunk implements u, Closeable {
    private final long a;
    private final int b;
    private boolean c;

    static {
        a.a();
    }

    public NativeMemoryChunk(int i) {
        z50.b(i > 0);
        this.b = i;
        this.a = nativeAllocate(i);
        this.c = false;
    }

    private void k(int i, u uVar, int i2, int i3) {
        if (uVar instanceof NativeMemoryChunk) {
            z50.i(!isClosed());
            z50.i(!uVar.isClosed());
            w.b(i, uVar.a(), i2, i3, this.b);
            nativeMemcpy(uVar.l() + ((long) i2), this.a + ((long) i), i3);
            return;
        }
        throw new IllegalArgumentException(C0201.m82(32972));
    }

    @u50
    private static native long nativeAllocate(int i);

    @u50
    private static native void nativeCopyFromByteArray(long j, byte[] bArr, int i, int i2);

    @u50
    private static native void nativeCopyToByteArray(long j, byte[] bArr, int i, int i2);

    @u50
    private static native void nativeFree(long j);

    @u50
    private static native void nativeMemcpy(long j, long j2, int i);

    @u50
    private static native byte nativeReadByte(long j);

    @Override // com.facebook.imagepipeline.memory.u
    public int a() {
        return this.b;
    }

    @Override // com.facebook.imagepipeline.memory.u
    public void c(int i, u uVar, int i2, int i3) {
        z50.g(uVar);
        if (uVar.getUniqueId() == getUniqueId()) {
            String r0 = C0201.m82(32973);
            Log.w(r0, C0201.m82(32974) + Integer.toHexString(System.identityHashCode(this)) + C0201.m82(32975) + Integer.toHexString(System.identityHashCode(uVar)) + C0201.m82(32976) + Long.toHexString(this.a));
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
        if (!this.c) {
            this.c = true;
            nativeFree(this.a);
        }
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
        return nativeReadByte(this.a + ((long) i));
    }

    @Override // com.facebook.imagepipeline.memory.u
    public synchronized int f(int i, byte[] bArr, int i2, int i3) {
        int a2;
        z50.g(bArr);
        z50.i(!isClosed());
        a2 = w.a(i, i3, this.b);
        w.b(i, bArr.length, i2, a2, this.b);
        nativeCopyToByteArray(this.a + ((long) i), bArr, i2, a2);
        return a2;
    }

    @Override // java.lang.Object
    public void finalize() throws Throwable {
        if (!isClosed()) {
            Log.w(C0201.m82(32979), C0201.m82(32977) + Integer.toHexString(System.identityHashCode(this)) + C0201.m82(32978));
            try {
                close();
            } finally {
                super.finalize();
            }
        }
    }

    @Override // com.facebook.imagepipeline.memory.u
    public ByteBuffer g() {
        return null;
    }

    @Override // com.facebook.imagepipeline.memory.u
    public long getUniqueId() {
        return this.a;
    }

    @Override // com.facebook.imagepipeline.memory.u
    public synchronized int h(int i, byte[] bArr, int i2, int i3) {
        int a2;
        z50.g(bArr);
        z50.i(!isClosed());
        a2 = w.a(i, i3, this.b);
        w.b(i, bArr.length, i2, a2, this.b);
        nativeCopyFromByteArray(this.a + ((long) i), bArr, i2, a2);
        return a2;
    }

    @Override // com.facebook.imagepipeline.memory.u
    public synchronized boolean isClosed() {
        return this.c;
    }

    @Override // com.facebook.imagepipeline.memory.u
    public long l() {
        return this.a;
    }

    public NativeMemoryChunk() {
        this.b = 0;
        this.a = 0;
        this.c = true;
    }
}
