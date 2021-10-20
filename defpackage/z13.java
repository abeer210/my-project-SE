package defpackage;

import java.io.IOException;

/* renamed from: z13  reason: default package */
/* compiled from: DERNumericString */
public class z13 extends u03 implements a13 {
    private final byte[] a;

    public z13(byte[] bArr) {
        this.a = bArr;
    }

    @Override // defpackage.a13
    public String c() {
        return mb3.b(this.a);
    }

    @Override // defpackage.u03
    public boolean g(u03 u03) {
        if (!(u03 instanceof z13)) {
            return false;
        }
        return hb3.a(this.a, ((z13) u03).a);
    }

    @Override // defpackage.o03
    public int hashCode() {
        return hb3.h(this.a);
    }

    @Override // defpackage.u03
    public void i(s03 s03) throws IOException {
        s03.g(18, this.a);
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
