package defpackage;

import java.io.IOException;
import java.util.Enumeration;

/* renamed from: i13  reason: default package */
/* compiled from: BERSequence */
public class i13 extends v03 {
    public i13() {
    }

    @Override // defpackage.u03
    public void i(s03 s03) throws IOException {
        s03.c(48);
        s03.c(128);
        Enumeration u = u();
        while (u.hasMoreElements()) {
            s03.j((g03) u.nextElement());
        }
        s03.c(0);
        s03.c(0);
    }

    @Override // defpackage.u03
    public int j() throws IOException {
        Enumeration u = u();
        int i = 0;
        while (u.hasMoreElements()) {
            i += ((g03) u.nextElement()).b().j();
        }
        return i + 2 + 2;
    }

    public i13(g03 g03) {
        super(g03);
    }

    public i13(h03 h03) {
        super(h03);
    }
}
