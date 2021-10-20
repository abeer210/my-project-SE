package defpackage;

import java.io.Closeable;
import java.nio.ByteBuffer;
import vigqyno.C0201;

/* renamed from: q60  reason: default package */
/* compiled from: PooledByteBuffer */
public interface q60 extends Closeable {

    /* renamed from: q60$a */
    /* compiled from: PooledByteBuffer */
    public static class a extends RuntimeException {
        public a() {
            super(C0201.m82(34145));
        }
    }

    byte e(int i);

    int f(int i, byte[] bArr, int i2, int i3);

    ByteBuffer g();

    boolean isClosed();

    long l();

    int size();
}
