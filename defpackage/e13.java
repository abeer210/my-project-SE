package defpackage;

import java.io.IOException;

/* renamed from: e13  reason: default package */
/* compiled from: BERApplicationSpecificParser */
public class e13 implements g03, u23 {
    private final int a;
    private final z03 b;

    public e13(int i, z03 z03) {
        this.a = i;
        this.b = z03;
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
        return new d13(this.a, this.b.d());
    }
}
