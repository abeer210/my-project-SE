package defpackage;

import java.io.IOException;
import java.util.Enumeration;

/* renamed from: k13  reason: default package */
/* compiled from: BERSet */
public class k13 extends x03 {
    public k13() {
    }

    @Override // defpackage.u03
    public void i(s03 s03) throws IOException {
        s03.c(49);
        s03.c(128);
        Enumeration v = v();
        while (v.hasMoreElements()) {
            s03.j((g03) v.nextElement());
        }
        s03.c(0);
        s03.c(0);
    }

    @Override // defpackage.u03
    public int j() throws IOException {
        Enumeration v = v();
        int i = 0;
        while (v.hasMoreElements()) {
            i += ((g03) v.nextElement()).b().j();
        }
        return i + 2 + 2;
    }

    public k13(g03 g03) {
        super(g03);
    }

    public k13(h03 h03) {
        super(h03, false);
    }

    public k13(g03[] g03Arr) {
        super(g03Arr, false);
    }
}
