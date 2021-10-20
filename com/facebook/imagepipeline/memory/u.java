package com.facebook.imagepipeline.memory;

import java.nio.ByteBuffer;

/* compiled from: MemoryChunk */
public interface u {
    int a();

    void c(int i, u uVar, int i2, int i3);

    void close();

    byte e(int i);

    int f(int i, byte[] bArr, int i2, int i3);

    ByteBuffer g();

    long getUniqueId();

    int h(int i, byte[] bArr, int i2, int i3);

    boolean isClosed();

    long l() throws UnsupportedOperationException;
}
