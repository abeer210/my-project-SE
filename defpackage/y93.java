package defpackage;

import java.io.IOException;
import java.security.PrivateKey;
import vigqyno.C0201;

/* renamed from: y93  reason: default package */
/* compiled from: BCMcEliecePrivateKey */
public class y93 implements PrivateKey {
    private q83 a;

    public y93(q83 q83) {
        this.a = q83;
    }

    public xa3 a() {
        return this.a.a();
    }

    public eb3 b() {
        return this.a.b();
    }

    public int c() {
        return this.a.c();
    }

    public int d() {
        return this.a.d();
    }

    public db3 e() {
        return this.a.e();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof y93)) {
            return false;
        }
        y93 y93 = (y93) obj;
        if (d() != y93.d() || c() != y93.c() || !a().equals(y93.a()) || !b().equals(y93.b()) || !g().equals(y93.g()) || !e().equals(y93.e()) || !f().equals(y93.f())) {
            return false;
        }
        return true;
    }

    public db3 f() {
        return this.a.f();
    }

    public wa3 g() {
        return this.a.g();
    }

    public String getAlgorithm() {
        return C0201.m82(12618);
    }

    public byte[] getEncoded() {
        try {
            return new e43(new o43(c83.c), new a83(this.a.d(), this.a.c(), this.a.a(), this.a.b(), this.a.e(), this.a.f(), this.a.g())).e();
        } catch (IOException unused) {
            return null;
        }
    }

    public String getFormat() {
        return C0201.m82(12619);
    }

    public int hashCode() {
        return (((((((((((this.a.c() * 37) + this.a.d()) * 37) + this.a.a().hashCode()) * 37) + this.a.b().hashCode()) * 37) + this.a.e().hashCode()) * 37) + this.a.f().hashCode()) * 37) + this.a.g().hashCode();
    }
}
