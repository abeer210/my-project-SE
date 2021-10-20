package defpackage;

import java.io.IOException;
import java.io.OutputStream;

/* renamed from: hs2  reason: default package */
/* compiled from: RandomAccessOutputStream */
public class hs2 extends OutputStream {
    private final js2 a;

    public hs2(js2 js2) {
        this.a = js2;
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i, int i2) throws IOException {
        this.a.write(bArr, i, i2);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) throws IOException {
        this.a.write(bArr);
    }

    @Override // java.io.OutputStream
    public void write(int i) throws IOException {
        this.a.write(i);
    }
}
