package defpackage;

import java.io.IOException;
import java.util.List;
import vigqyno.C0201;

/* renamed from: s53  reason: default package */
/* compiled from: KeyAgreeRecipientInformation */
public class s53 extends c63 {
    private l33 g;
    private q03 h;

    public s53(l33 l33, b63 b63, q03 q03, o43 o43, k53 k53, c53 c53) {
        super(l33.j(), o43, k53, c53);
        this.g = l33;
        this.a = b63;
        this.h = q03;
    }

    private t43 e(w53 w53) throws h53 {
        throw new h53(C0201.m82(6238));
    }

    private t43 f(o43 o43, p33 p33) {
        return new t43(o43, p33.j().s());
    }

    private t43 g(o43 o43, n33 n33) throws h53, IOException {
        w53 w53;
        p33 k = n33.k();
        if (k != null) {
            return f(o43, k);
        }
        h33 j = n33.j();
        if (j != null) {
            w53 = new w53(j.i(), j.j().s());
        } else {
            w53 = new w53(n33.l().j());
        }
        e(w53);
        throw null;
    }

    public static void h(List list, l33 l33, o43 o43, k53 k53, c53 c53) {
        r53 r53;
        v03 l = l33.l();
        for (int i = 0; i < l.size(); i++) {
            t33 j = t33.j(l.t(i));
            k33 i2 = j.i();
            h33 i3 = i2.i();
            if (i3 != null) {
                r53 = new r53(i3.i(), i3.j().s());
            } else {
                r53 = new r53(i2.j().j().s());
            }
            list.add(new s53(l33, r53, j.g(), o43, k53, c53));
        }
    }

    @Override // defpackage.c63
    public e63 d(a63 a63) throws h53, IOException {
        q53 q53 = (q53) a63;
        return q53.b(this.b, this.c, g(q53.e(), this.g.k()), this.g.o(), this.h.s());
    }
}
