package defpackage;

import defpackage.t93;
import java.io.IOException;
import java.security.PrivateKey;
import vigqyno.C0201;

/* renamed from: pa3  reason: default package */
/* compiled from: BCXMSSPrivateKey */
public class pa3 implements PrivateKey {
    private final t93 a;
    private final p03 b;

    public pa3(e43 e43) throws IOException {
        g83 i = g83.i(e43.i().k());
        this.b = i.j().g();
        j83 j = j83.j(e43.j());
        try {
            t93.b bVar = new t93.b(new s93(i.g(), ra3.a(this.b)));
            bVar.l(j.i());
            bVar.p(j.p());
            bVar.o(j.o());
            bVar.m(j.k());
            bVar.n(j.l());
            if (j.g() != null) {
                bVar.k((y83) v93.f(j.g()));
            }
            this.a = bVar.j();
        } catch (ClassNotFoundException e) {
            throw new IOException(C0201.m82(10956) + e.getMessage());
        }
    }

    private j83 a() {
        byte[] b2 = this.a.b();
        int c = this.a.a().c();
        int d = this.a.a().d();
        int a2 = (int) v93.a(b2, 0, 4);
        if (v93.l(d, (long) a2)) {
            byte[] g = v93.g(b2, 4, c);
            int i = 4 + c;
            byte[] g2 = v93.g(b2, i, c);
            int i2 = i + c;
            byte[] g3 = v93.g(b2, i2, c);
            int i3 = i2 + c;
            byte[] g4 = v93.g(b2, i3, c);
            int i4 = i3 + c;
            return new j83(a2, g, g2, g3, g4, v93.g(b2, i4, b2.length - i4));
        }
        throw new IllegalArgumentException(C0201.m82(10957));
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof pa3)) {
            return false;
        }
        pa3 pa3 = (pa3) obj;
        if (!this.b.equals(pa3.b) || !hb3.a(this.a.b(), pa3.a.b())) {
            return false;
        }
        return true;
    }

    public String getAlgorithm() {
        return C0201.m82(10958);
    }

    public byte[] getEncoded() {
        try {
            return new e43(new o43(c83.g, new g83(this.a.a().d(), new o43(this.b))), a()).e();
        } catch (IOException unused) {
            return null;
        }
    }

    public String getFormat() {
        return C0201.m82(10959);
    }

    public int hashCode() {
        return this.b.hashCode() + (hb3.h(this.a.b()) * 37);
    }
}
