package defpackage;

import java.io.IOException;

/* renamed from: o23  reason: default package */
/* compiled from: DLBitString */
public class o23 extends d03 {
    public o23(byte[] bArr, int i) {
        super(bArr, i);
    }

    @Override // defpackage.u03
    public void i(s03 s03) throws IOException {
        byte[] bArr = this.a;
        int length = bArr.length + 1;
        byte[] bArr2 = new byte[length];
        bArr2[0] = (byte) u();
        System.arraycopy(bArr, 0, bArr2, 1, length - 1);
        s03.g(3, bArr2);
    }

    @Override // defpackage.u03
    public int j() {
        return a33.a(this.a.length + 1) + 1 + this.a.length + 1;
    }

    @Override // defpackage.u03
    public boolean l() {
        return false;
    }
}
