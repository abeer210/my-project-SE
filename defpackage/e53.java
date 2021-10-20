package defpackage;

import defpackage.g53;
import vigqyno.C0201;

/* renamed from: e53  reason: default package */
/* compiled from: CMSEnvelopedData */
public class e53 {
    public d63 a;
    private o43 b;

    public e53(byte[] bArr) throws h53 {
        this(m53.b(bArr));
    }

    public d63 a() {
        return this.a;
    }

    public e53(e33 e33) throws h53 {
        String r0 = C0201.m82(33284);
        try {
            g33 i = g33.i(e33.g());
            if (i.j() != null) {
                i.j();
            }
            x03 k = i.k();
            f33 g = i.g();
            this.b = g.g();
            this.a = g53.a(k, this.b, new g53.a(this.b, new i53(g.i().s())));
            i.l();
        } catch (ClassCastException e) {
            throw new h53(r0, e);
        } catch (IllegalArgumentException e2) {
            throw new h53(r0, e2);
        }
    }
}
