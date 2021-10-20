package defpackage;

import java.io.IOException;
import java.util.Enumeration;

/* renamed from: g23  reason: default package */
/* compiled from: DERSet */
public class g23 extends x03 {
    private int c = -1;

    public g23() {
    }

    private int z() throws IOException {
        if (this.c < 0) {
            int i = 0;
            Enumeration v = v();
            while (v.hasMoreElements()) {
                i += ((g03) v.nextElement()).b().o().j();
            }
            this.c = i;
        }
        return this.c;
    }

    @Override // defpackage.u03
    public void i(s03 s03) throws IOException {
        s03 a = s03.a();
        int z = z();
        s03.c(49);
        s03.i(z);
        Enumeration v = v();
        while (v.hasMoreElements()) {
            a.j((g03) v.nextElement());
        }
    }

    @Override // defpackage.u03
    public int j() throws IOException {
        int z = z();
        return a33.a(z) + 1 + z;
    }

    public g23(h03 h03, boolean z) {
        super(h03, z);
    }
}
