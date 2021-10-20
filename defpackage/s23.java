package defpackage;

import java.io.IOException;

/* renamed from: s23  reason: default package */
/* compiled from: DLTaggedObject */
public class s23 extends b13 {
    private static final byte[] e = new byte[0];

    public s23(boolean z, int i, g03 g03) {
        super(z, i, g03);
    }

    @Override // defpackage.u03
    public void i(s03 s03) throws IOException {
        int i = 160;
        if (!this.b) {
            u03 p = this.d.b().p();
            if (this.c) {
                s03.k(160, this.a);
                s03.i(p.j());
                s03.j(p);
                return;
            }
            if (!p.l()) {
                i = 128;
            }
            s03.k(i, this.a);
            s03.h(p);
            return;
        }
        s03.f(160, this.a, e);
    }

    @Override // defpackage.u03
    public int j() throws IOException {
        int b;
        if (this.b) {
            return a33.b(this.a) + 1;
        }
        int j = this.d.b().p().j();
        if (this.c) {
            b = a33.b(this.a) + a33.a(j);
        } else {
            j--;
            b = a33.b(this.a);
        }
        return b + j;
    }

    @Override // defpackage.u03
    public boolean l() {
        if (this.b || this.c) {
            return true;
        }
        return this.d.b().p().l();
    }
}
