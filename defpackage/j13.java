package defpackage;

import java.io.IOException;

/* renamed from: j13  reason: default package */
/* compiled from: BERSequenceParser */
public class j13 implements w03 {
    private z03 a;

    public j13(z03 z03) {
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
        return new i13(this.a.d());
    }
}
