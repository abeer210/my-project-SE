package defpackage;

import java.io.IOException;
import java.util.Enumeration;

/* renamed from: e23  reason: default package */
/* compiled from: DERSequence */
public class e23 extends v03 {
    private int b = -1;

    public e23() {
    }

    private int w() throws IOException {
        if (this.b < 0) {
            int i = 0;
            Enumeration u = u();
            while (u.hasMoreElements()) {
                i += ((g03) u.nextElement()).b().o().j();
            }
            this.b = i;
        }
        return this.b;
    }

    @Override // defpackage.u03
    public void i(s03 s03) throws IOException {
        s03 a = s03.a();
        int w = w();
        s03.c(48);
        s03.i(w);
        Enumeration u = u();
        while (u.hasMoreElements()) {
            a.j((g03) u.nextElement());
        }
    }

    @Override // defpackage.u03
    public int j() throws IOException {
        int w = w();
        return a33.a(w) + 1 + w;
    }

    public e23(h03 h03) {
        super(h03);
    }

    public e23(g03[] g03Arr) {
        super(g03Arr);
    }
}
