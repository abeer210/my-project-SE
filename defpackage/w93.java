package defpackage;

import java.io.IOException;
import java.security.PrivateKey;
import vigqyno.C0201;

/* renamed from: w93  reason: default package */
/* compiled from: BCMcElieceCCA2PrivateKey */
public class w93 implements PrivateKey {
    private m83 a;

    public w93(m83 m83) {
        this.a = m83;
    }

    public xa3 a() {
        return this.a.b();
    }

    public eb3 b() {
        return this.a.c();
    }

    public wa3 c() {
        return this.a.d();
    }

    public int d() {
        return this.a.e();
    }

    public int e() {
        return this.a.f();
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof w93)) {
            return false;
        }
        w93 w93 = (w93) obj;
        if (e() != w93.e() || d() != w93.d() || !a().equals(w93.a()) || !b().equals(w93.b()) || !f().equals(w93.f()) || !c().equals(w93.c())) {
            return false;
        }
        return true;
    }

    public db3 f() {
        return this.a.g();
    }

    public String getAlgorithm() {
        return C0201.m82(27183);
    }

    public byte[] getEncoded() {
        try {
            return new e43(new o43(c83.d), new y73(e(), d(), a(), b(), f(), ca3.a(this.a.a()))).e();
        } catch (IOException unused) {
            return null;
        }
    }

    public String getFormat() {
        return C0201.m82(27184);
    }

    public int hashCode() {
        return (((((((((this.a.e() * 37) + this.a.f()) * 37) + this.a.b().hashCode()) * 37) + this.a.c().hashCode()) * 37) + this.a.g().hashCode()) * 37) + this.a.d().hashCode();
    }
}
