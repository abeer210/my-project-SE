package defpackage;

import java.io.IOException;
import vigqyno.C0201;

/* renamed from: br  reason: default package */
/* compiled from: ByteArrayReader */
public class br extends kr {
    private final byte[] b;
    private final int c;

    public br(byte[] bArr) {
        this(bArr, 0);
    }

    @Override // defpackage.kr
    public byte b(int i) throws IOException {
        x(i, 1);
        return this.b[i + this.c];
    }

    @Override // defpackage.kr
    public byte[] c(int i, int i2) throws IOException {
        x(i, i2);
        byte[] bArr = new byte[i2];
        System.arraycopy(this.b, i + this.c, bArr, 0, i2);
        return bArr;
    }

    @Override // defpackage.kr
    public long k() {
        return (long) (this.b.length - this.c);
    }

    @Override // defpackage.kr
    public void x(int i, int i2) throws IOException {
        if (!y(i, i2)) {
            throw new ar(z(i), i2, (long) this.b.length);
        }
    }

    public boolean y(int i, int i2) throws IOException {
        return i2 >= 0 && i >= 0 && (((long) i) + ((long) i2)) - 1 < k();
    }

    public int z(int i) {
        return i + this.c;
    }

    public br(byte[] bArr, int i) {
        if (bArr == null) {
            throw null;
        } else if (i >= 0) {
            this.b = bArr;
            this.c = i;
        } else {
            throw new IllegalArgumentException(C0201.m82(6298));
        }
    }
}
