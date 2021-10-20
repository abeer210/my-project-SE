package defpackage;

import java.io.IOException;

/* renamed from: j23  reason: default package */
/* compiled from: DERTaggedObject */
public class j23 extends b13 {
    private static final byte[] e = new byte[0];

    public j23(boolean z, int i, g03 g03) {
        super(z, i, g03);
    }

    @Override // defpackage.u03
    public void i(s03 s03) throws IOException {
        int i = 160;
        if (!this.b) {
            u03 o = this.d.b().o();
            if (this.c) {
                s03.k(160, this.a);
                s03.i(o.j());
                s03.j(o);
                return;
            }
            if (!o.l()) {
                i = 128;
            }
            s03.k(i, this.a);
            s03.h(o);
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
        int j = this.d.b().o().j();
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
        return this.d.b().o().l();
    }
}
