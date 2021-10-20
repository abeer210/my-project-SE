package defpackage;

import java.io.IOException;
import java.io.OutputStream;
import vigqyno.C0201;

/* renamed from: c23  reason: default package */
/* compiled from: DEROutputStream */
public class c23 extends s03 {
    public c23(OutputStream outputStream) {
        super(outputStream);
    }

    @Override // defpackage.s03
    public s03 a() {
        return this;
    }

    @Override // defpackage.s03
    public s03 b() {
        return this;
    }

    @Override // defpackage.s03
    public void j(g03 g03) throws IOException {
        if (g03 != null) {
            g03.b().o().i(this);
            return;
        }
        throw new IOException(C0201.m82(35344));
    }
}
