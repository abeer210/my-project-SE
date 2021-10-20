package defpackage;

import java.io.IOException;
import java.security.Key;
import java.security.PrivateKey;
import vigqyno.C0201;

/* renamed from: ja3  reason: default package */
/* compiled from: BCSphincs256PrivateKey */
public class ja3 implements PrivateKey, Key {
    private final p03 a;
    private final w83 b;

    public ja3(e43 e43) throws IOException {
        this.a = f83.g(e43.i().k()).i().g();
        this.b = new w83(q03.q(e43.j()).s());
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ja3)) {
            return false;
        }
        ja3 ja3 = (ja3) obj;
        if (!this.a.equals(ja3.a) || !hb3.a(this.b.a(), ja3.b.a())) {
            return false;
        }
        return true;
    }

    public final String getAlgorithm() {
        return C0201.m82(15171);
    }

    public byte[] getEncoded() {
        try {
            return new e43(new o43(c83.e, new f83(new o43(this.a))), new a23(this.b.a())).e();
        } catch (IOException unused) {
            return null;
        }
    }

    public String getFormat() {
        return C0201.m82(15172);
    }

    public int hashCode() {
        return this.a.hashCode() + (hb3.h(this.b.a()) * 37);
    }
}
