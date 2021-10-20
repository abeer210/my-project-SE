package defpackage;

import java.io.IOException;
import java.io.OutputStream;
import vigqyno.C0201;

/* renamed from: p23  reason: default package */
/* compiled from: DLOutputStream */
public class p23 extends s03 {
    public p23(OutputStream outputStream) {
        super(outputStream);
    }

    @Override // defpackage.s03
    public void j(g03 g03) throws IOException {
        if (g03 != null) {
            g03.b().p().i(this);
            return;
        }
        throw new IOException(C0201.m82(21304));
    }
}
