package defpackage;

import java.io.IOException;
import java.util.Enumeration;

/* renamed from: x23  reason: default package */
/* compiled from: LazyEncodedSequence */
public class x23 extends v03 {
    private byte[] b;

    public x23(byte[] bArr) throws IOException {
        this.b = bArr;
    }

    private void w() {
        w23 w23 = new w23(this.b);
        while (w23.hasMoreElements()) {
            this.a.addElement(w23.nextElement());
        }
        this.b = null;
    }

    @Override // defpackage.u03
    public void i(s03 s03) throws IOException {
        byte[] bArr = this.b;
        if (bArr != null) {
            s03.g(48, bArr);
        } else {
            super.p().i(s03);
        }
    }

    @Override // defpackage.u03
    public int j() throws IOException {
        byte[] bArr = this.b;
        if (bArr != null) {
            return a33.a(bArr.length) + 1 + this.b.length;
        }
        return super.p().j();
    }

    @Override // defpackage.v03, defpackage.u03
    public u03 o() {
        if (this.b != null) {
            w();
        }
        return super.o();
    }

    @Override // defpackage.v03, defpackage.u03
    public u03 p() {
        if (this.b != null) {
            w();
        }
        return super.p();
    }

    @Override // defpackage.v03
    public synchronized int size() {
        if (this.b != null) {
            w();
        }
        return super.size();
    }

    @Override // defpackage.v03
    public synchronized g03 t(int i) {
        if (this.b != null) {
            w();
        }
        return super.t(i);
    }

    @Override // defpackage.v03
    public synchronized Enumeration u() {
        if (this.b == null) {
            return super.u();
        }
        return new w23(this.b);
    }
}
