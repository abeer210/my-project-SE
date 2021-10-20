package defpackage;

import java.io.IOException;
import java.security.PublicKey;
import vigqyno.C0201;

/* renamed from: z93  reason: default package */
/* compiled from: BCMcEliecePublicKey */
public class z93 implements PublicKey {
    private r83 a;

    public z93(r83 r83) {
        this.a = r83;
    }

    public wa3 a() {
        return this.a.a();
    }

    public int b() {
        return this.a.b();
    }

    public int c() {
        return this.a.c();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof z93)) {
            return false;
        }
        z93 z93 = (z93) obj;
        if (this.a.b() == z93.b() && this.a.c() == z93.c() && this.a.a().equals(z93.a())) {
            return true;
        }
        return false;
    }

    public String getAlgorithm() {
        return C0201.m82(9879);
    }

    public byte[] getEncoded() {
        try {
            return new t43(new o43(c83.c), new b83(this.a.b(), this.a.c(), this.a.a())).e();
        } catch (IOException unused) {
            return null;
        }
    }

    public String getFormat() {
        return C0201.m82(9880);
    }

    public int hashCode() {
        return ((this.a.b() + (this.a.c() * 37)) * 37) + this.a.a().hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(C0201.m82(9881));
        sb.append(C0201.m82(9882));
        sb.append(this.a.b());
        String r1 = C0201.m82(9883);
        sb.append(r1);
        return (sb.toString() + C0201.m82(9884) + this.a.c() + r1) + C0201.m82(9885) + this.a.a();
    }
}
