package defpackage;

import java.io.IOException;

/* renamed from: x13  reason: default package */
/* compiled from: DERIA5String */
public class x13 extends u03 implements a13 {
    private final byte[] a;

    public x13(byte[] bArr) {
        this.a = bArr;
    }

    @Override // defpackage.a13
    public String c() {
        return mb3.b(this.a);
    }

    @Override // defpackage.u03
    public boolean g(u03 u03) {
        if (!(u03 instanceof x13)) {
            return false;
        }
        return hb3.a(this.a, ((x13) u03).a);
    }

    @Override // defpackage.o03
    public int hashCode() {
        return hb3.h(this.a);
    }

    @Override // defpackage.u03
    public void i(s03 s03) throws IOException {
        s03.g(22, this.a);
    }

    @Override // defpackage.u03
    public int j() {
        return a33.a(this.a.length) + 1 + this.a.length;
    }

    @Override // defpackage.u03
    public boolean l() {
        return false;
    }

    public String toString() {
        return c();
    }
}
