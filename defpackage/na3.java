package defpackage;

import defpackage.n93;
import java.io.IOException;
import java.security.PrivateKey;
import vigqyno.C0201;

/* renamed from: na3  reason: default package */
/* compiled from: BCXMSSMTPrivateKey */
public class na3 implements PrivateKey {
    private final p03 a;
    private final n93 b;

    public na3(e43 e43) throws IOException {
        h83 i = h83.i(e43.i().k());
        this.a = i.k().g();
        j83 j = j83.j(e43.j());
        try {
            n93.b bVar = new n93.b(new m93(i.g(), i.j(), ra3.a(this.a)));
            bVar.l((long) j.i());
            bVar.p(j.p());
            bVar.o(j.o());
            bVar.m(j.k());
            bVar.n(j.l());
            if (j.g() != null) {
                bVar.k((z83) v93.f(j.g()));
            }
            this.b = bVar.j();
        } catch (ClassNotFoundException e) {
            throw new IOException(C0201.m82(26832) + e.getMessage());
        }
    }

    private i83 a() {
        byte[] b2 = this.b.b();
        int b3 = this.b.a().b();
        int c = this.b.a().c();
        int i = (c + 7) / 8;
        int a2 = (int) v93.a(b2, 0, i);
        if (v93.l(c, (long) a2)) {
            int i2 = i + 0;
            byte[] g = v93.g(b2, i2, b3);
            int i3 = i2 + b3;
            byte[] g2 = v93.g(b2, i3, b3);
            int i4 = i3 + b3;
            byte[] g3 = v93.g(b2, i4, b3);
            int i5 = i4 + b3;
            byte[] g4 = v93.g(b2, i5, b3);
            int i6 = i5 + b3;
            return new i83(a2, g, g2, g3, g4, v93.g(b2, i6, b2.length - i6));
        }
        throw new IllegalArgumentException(C0201.m82(26833));
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof na3)) {
            return false;
        }
        na3 na3 = (na3) obj;
        if (!this.a.equals(na3.a) || !hb3.a(this.b.b(), na3.b.b())) {
            return false;
        }
        return true;
    }

    public String getAlgorithm() {
        return C0201.m82(26834);
    }

    public byte[] getEncoded() {
        try {
            return new e43(new o43(c83.h, new h83(this.b.a().c(), this.b.a().d(), new o43(this.a))), a()).e();
        } catch (IOException unused) {
            return null;
        }
    }

    public String getFormat() {
        return C0201.m82(26835);
    }

    public int hashCode() {
        return this.a.hashCode() + (hb3.h(this.b.b()) * 37);
    }
}
