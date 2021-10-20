package defpackage;

import java.io.IOException;

/* renamed from: c03  reason: default package */
/* compiled from: ASN1ApplicationSpecific */
public abstract class c03 extends u03 {
    public final boolean a;
    public final int b;
    public final byte[] c;

    public c03(boolean z, int i, byte[] bArr) {
        this.a = z;
        this.b = i;
        this.c = hb3.d(bArr);
    }

    @Override // defpackage.u03
    public boolean g(u03 u03) {
        if (!(u03 instanceof c03)) {
            return false;
        }
        c03 c03 = (c03) u03;
        if (this.a == c03.a && this.b == c03.b && hb3.a(this.c, c03.c)) {
            return true;
        }
        return false;
    }

    @Override // defpackage.o03
    public int hashCode() {
        boolean z = this.a;
        return ((z ? 1 : 0) ^ this.b) ^ hb3.h(this.c);
    }

    @Override // defpackage.u03
    public void i(s03 s03) throws IOException {
        s03.f(this.a ? 96 : 64, this.b, this.c);
    }

    @Override // defpackage.u03
    public int j() throws IOException {
        return a33.b(this.b) + a33.a(this.c.length) + this.c.length;
    }

    @Override // defpackage.u03
    public boolean l() {
        return this.a;
    }

    public int q() {
        return this.b;
    }
}
