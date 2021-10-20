package defpackage;

import java.io.IOException;

/* renamed from: f23  reason: default package */
/* compiled from: DERSequenceParser */
public class f23 implements w03 {
    private z03 a;

    public f23(z03 z03) {
        this.a = z03;
    }

    @Override // defpackage.g03
    public u03 b() {
        try {
            return d();
        } catch (IOException e) {
            throw new IllegalStateException(e.getMessage());
        }
    }

    @Override // defpackage.u23
    public u03 d() throws IOException {
        return new e23(this.a.d());
    }
}
