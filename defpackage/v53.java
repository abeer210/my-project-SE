package defpackage;

/* renamed from: v53  reason: default package */
/* compiled from: KeyTransRecipientInformation */
public class v53 extends c63 {
    private m33 g;

    public v53(m33 m33, o43 o43, k53 k53, c53 c53) {
        super(m33.j(), o43, k53, c53);
        this.g = m33;
        u33 k = m33.k();
        if (k.j()) {
            this.a = new u53(q03.q(k.g()).s());
            return;
        }
        h33 g2 = h33.g(k.g());
        this.a = new u53(g2.i(), g2.j().s());
    }

    @Override // defpackage.c63
    public e63 d(a63 a63) throws h53 {
        return ((t53) a63).a(this.b, this.c, this.g.g().s());
    }
}
