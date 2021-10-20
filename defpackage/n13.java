package defpackage;

import java.io.IOException;

/* renamed from: n13  reason: default package */
/* compiled from: BERTaggedObjectParser */
public class n13 implements g03, u23 {
    private boolean a;
    private int b;
    private z03 c;

    public n13(boolean z, int i, z03 z03) {
        this.a = z;
        this.b = i;
        this.c = z03;
    }

    @Override // defpackage.g03
    public u03 b() {
        try {
            return d();
        } catch (IOException e) {
            throw new t03(e.getMessage());
        }
    }

    @Override // defpackage.u23
    public u03 d() throws IOException {
        return this.c.c(this.a, this.b);
    }
}
