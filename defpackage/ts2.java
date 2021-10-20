package defpackage;

import java.io.IOException;

/* renamed from: ts2  reason: default package */
/* compiled from: RandomAccessSource */
public final class ts2 implements us2 {
    private final is2 a;

    public ts2(is2 is2) {
        this.a = is2;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.a.close();
    }

    @Override // defpackage.us2
    public long getPosition() throws IOException {
        return this.a.getPosition();
    }

    @Override // defpackage.us2
    public byte[] i(int i) throws IOException {
        return this.a.i(i);
    }

    @Override // defpackage.us2
    public boolean j() throws IOException {
        return this.a.j();
    }

    @Override // defpackage.us2
    public int peek() throws IOException {
        return this.a.peek();
    }

    @Override // defpackage.us2
    public int read() throws IOException {
        return this.a.read();
    }

    @Override // defpackage.us2
    public void unread(int i) throws IOException {
        this.a.h0(1);
    }

    @Override // defpackage.us2
    public int read(byte[] bArr) throws IOException {
        return this.a.read(bArr);
    }

    @Override // defpackage.us2
    public void unread(byte[] bArr) throws IOException {
        this.a.h0(bArr.length);
    }
}
