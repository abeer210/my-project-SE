package defpackage;

import java.io.IOException;

/* renamed from: a23  reason: default package */
/* compiled from: DEROctetString */
public class a23 extends q03 {
    public a23(byte[] bArr) {
        super(bArr);
    }

    @Override // defpackage.u03
    public void i(s03 s03) throws IOException {
        s03.g(4, this.a);
    }

    @Override // defpackage.u03
    public int j() {
        return a33.a(this.a.length) + 1 + this.a.length;
    }

    @Override // defpackage.u03
    public boolean l() {
        return false;
    }
}
