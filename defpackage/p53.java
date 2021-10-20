package defpackage;

import java.io.IOException;

/* renamed from: p53  reason: default package */
/* compiled from: KEKRecipientInformation */
public class p53 extends c63 {
    private j33 g;

    public p53(j33 j33, o43 o43, k53 k53, c53 c53) {
        super(j33.l(), o43, k53, c53);
        this.g = j33;
        this.a = new o53(j33.k().i().s());
    }

    @Override // defpackage.c63
    public e63 d(a63 a63) throws h53, IOException {
        return ((n53) a63).a(this.b, this.c, this.g.g().s());
    }
}
