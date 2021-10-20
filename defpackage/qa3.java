package defpackage;

import defpackage.u93;
import java.io.IOException;
import java.security.PublicKey;
import vigqyno.C0201;

/* renamed from: qa3  reason: default package */
/* compiled from: BCXMSSPublicKey */
public class qa3 implements PublicKey {
    private final u93 a;
    private final p03 b;

    public qa3(t43 t43) throws IOException {
        g83 i = g83.i(t43.g().k());
        this.b = i.j().g();
        k83 g = k83.g(t43.k());
        u93.b bVar = new u93.b(new s93(i.g(), ra3.a(this.b)));
        bVar.f(g.i());
        bVar.g(g.j());
        this.a = bVar.e();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof qa3)) {
            return false;
        }
        qa3 qa3 = (qa3) obj;
        if (!this.b.equals(qa3.b) || !hb3.a(this.a.d(), qa3.a.d())) {
            return false;
        }
        return true;
    }

    public final String getAlgorithm() {
        return C0201.m82(9079);
    }

    public byte[] getEncoded() {
        try {
            return new t43(new o43(c83.g, new g83(this.a.a().d(), new o43(this.b))), new k83(this.a.b(), this.a.c())).e();
        } catch (IOException unused) {
            return null;
        }
    }

    public String getFormat() {
        return C0201.m82(9080);
    }

    public int hashCode() {
        return this.b.hashCode() + (hb3.h(this.a.d()) * 37);
    }
}
