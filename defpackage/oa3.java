package defpackage;

import defpackage.o93;
import java.io.IOException;
import java.security.PublicKey;
import vigqyno.C0201;

/* renamed from: oa3  reason: default package */
/* compiled from: BCXMSSMTPublicKey */
public class oa3 implements PublicKey {
    private final p03 a;
    private final o93 b;

    public oa3(t43 t43) throws IOException {
        h83 i = h83.i(t43.g().k());
        this.a = i.k().g();
        k83 g = k83.g(t43.k());
        o93.b bVar = new o93.b(new m93(i.g(), i.j(), ra3.a(this.a)));
        bVar.f(g.i());
        bVar.g(g.j());
        this.b = bVar.e();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof oa3)) {
            return false;
        }
        oa3 oa3 = (oa3) obj;
        if (!this.a.equals(oa3.a) || !hb3.a(this.b.d(), oa3.b.d())) {
            return false;
        }
        return true;
    }

    public final String getAlgorithm() {
        return C0201.m82(24283);
    }

    public byte[] getEncoded() {
        try {
            return new t43(new o43(c83.h, new h83(this.b.a().c(), this.b.a().d(), new o43(this.a))), new k83(this.b.b(), this.b.c())).e();
        } catch (IOException unused) {
            return null;
        }
    }

    public String getFormat() {
        return C0201.m82(24284);
    }

    public int hashCode() {
        return this.a.hashCode() + (hb3.h(this.b.d()) * 37);
    }
}
