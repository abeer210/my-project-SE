package defpackage;

import java.io.IOException;

/* renamed from: l13  reason: default package */
/* compiled from: BERSetParser */
public class l13 implements y03 {
    private z03 a;

    public l13(z03 z03) {
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
        return new k13(this.a.d());
    }
}
