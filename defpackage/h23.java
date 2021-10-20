package defpackage;

import java.io.IOException;

/* renamed from: h23  reason: default package */
/* compiled from: DERSetParser */
public class h23 implements y03 {
    private z03 a;

    public h23(z03 z03) {
        this.a = z03;
    }

    @Override // defpackage.g03
    public u03 b() {
        try {
            return d();
        } catch (IOException e) {
            throw new t03(e.getMessage(), e);
        }
    }

    @Override // defpackage.u23
    public u03 d() throws IOException {
        return new g23(this.a.d(), false);
    }
}
