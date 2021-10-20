package defpackage;

import java.io.IOException;
import java.util.Enumeration;

/* renamed from: r23  reason: default package */
/* compiled from: DLSet */
public class r23 extends x03 {
    private int c = -1;

    public r23() {
    }

    private int z() throws IOException {
        if (this.c < 0) {
            int i = 0;
            Enumeration v = v();
            while (v.hasMoreElements()) {
                i += ((g03) v.nextElement()).b().p().j();
            }
            this.c = i;
        }
        return this.c;
    }

    @Override // defpackage.u03
    public void i(s03 s03) throws IOException {
        s03 b = s03.b();
        int z = z();
        s03.c(49);
        s03.i(z);
        Enumeration v = v();
        while (v.hasMoreElements()) {
            b.j((g03) v.nextElement());
        }
    }

    @Override // defpackage.u03
    public int j() throws IOException {
        int z = z();
        return a33.a(z) + 1 + z;
    }

    public r23(g03 g03) {
        super(g03);
    }

    public r23(h03 h03) {
        super(h03, false);
    }

    public r23(g03[] g03Arr) {
        super(g03Arr, false);
    }
}
