package defpackage;

import java.io.IOException;
import java.security.PublicKey;
import vigqyno.C0201;

/* renamed from: x93  reason: default package */
/* compiled from: BCMcElieceCCA2PublicKey */
public class x93 implements PublicKey {
    private n83 a;

    public x93(n83 n83) {
        this.a = n83;
    }

    public wa3 a() {
        return this.a.b();
    }

    public int b() {
        return this.a.c();
    }

    public int c() {
        return this.a.d();
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof x93)) {
            return false;
        }
        x93 x93 = (x93) obj;
        if (this.a.c() == x93.b() && this.a.d() == x93.c() && this.a.b().equals(x93.a())) {
            return true;
        }
        return false;
    }

    public String getAlgorithm() {
        return C0201.m82(24797);
    }

    public byte[] getEncoded() {
        try {
            return new t43(new o43(c83.d), new z73(this.a.c(), this.a.d(), this.a.b(), ca3.a(this.a.a()))).e();
        } catch (IOException unused) {
            return null;
        }
    }

    public String getFormat() {
        return C0201.m82(24798);
    }

    public int hashCode() {
        return ((this.a.c() + (this.a.d() * 37)) * 37) + this.a.b().hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(C0201.m82(24799));
        sb.append(C0201.m82(24800));
        sb.append(this.a.c());
        String r1 = C0201.m82(24801);
        sb.append(r1);
        return (sb.toString() + C0201.m82(24802) + this.a.d() + r1) + C0201.m82(24803) + this.a.b().toString();
    }
}
