package defpackage;

import java.security.Key;
import java.security.PrivateKey;
import java.util.HashMap;
import java.util.Map;
import vigqyno.C0201;

/* renamed from: k63  reason: default package */
/* compiled from: JceKeyTransRecipient */
public abstract class k63 implements t53 {
    private PrivateKey a;
    public h63 b;
    public h63 c;
    public Map d = new HashMap();
    public boolean e = false;
    public boolean f;

    public k63(PrivateKey privateKey) {
        h63 h63 = new h63(new g63());
        this.b = h63;
        this.c = h63;
        this.a = privateKey;
    }

    public Key g(o43 o43, o43 o432, byte[] bArr) throws h53 {
        v73 b2 = this.b.b(o43, this.a);
        b2.d(this.f);
        if (!this.d.isEmpty()) {
            for (p03 p03 : this.d.keySet()) {
                b2.c(p03, (String) this.d.get(p03));
            }
        }
        try {
            Key g = this.b.g(o432.g(), b2.b(o432, bArr));
            if (this.e) {
                this.b.h(o432, g);
            }
            return g;
        } catch (t73 e2) {
            throw new h53(C0201.m82(27629) + e2.getMessage(), e2);
        }
    }

    public k63 h(String str) {
        h63 h63 = new h63(new l63(str));
        this.b = h63;
        this.c = h63;
        return this;
    }
}
