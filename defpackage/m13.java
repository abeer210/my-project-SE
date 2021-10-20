package defpackage;

import java.io.IOException;
import java.util.Enumeration;
import vigqyno.C0201;

/* renamed from: m13  reason: default package */
/* compiled from: BERTaggedObject */
public class m13 extends b13 {
    public m13(int i, g03 g03) {
        super(true, i, g03);
    }

    @Override // defpackage.u03
    public void i(s03 s03) throws IOException {
        Enumeration enumeration;
        s03.k(160, this.a);
        s03.c(128);
        if (!this.b) {
            if (!this.c) {
                g03 g03 = this.d;
                if (g03 instanceof q03) {
                    if (g03 instanceof g13) {
                        enumeration = ((g13) g03).w();
                    } else {
                        enumeration = new g13(((q03) g03).s()).w();
                    }
                } else if (g03 instanceof v03) {
                    enumeration = ((v03) g03).u();
                } else if (g03 instanceof x03) {
                    enumeration = ((x03) g03).v();
                } else {
                    throw new j03(C0201.m82(1330) + this.d.getClass().getName());
                }
                while (enumeration.hasMoreElements()) {
                    s03.j((g03) enumeration.nextElement());
                }
            } else {
                s03.j(this.d);
            }
        }
        s03.c(0);
        s03.c(0);
    }

    @Override // defpackage.u03
    public int j() throws IOException {
        int b;
        if (this.b) {
            return a33.b(this.a) + 1;
        }
        int j = this.d.b().j();
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

    public m13(boolean z, int i, g03 g03) {
        super(z, i, g03);
    }
}
