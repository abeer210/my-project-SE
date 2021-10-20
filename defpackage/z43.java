package defpackage;

import java.io.IOException;
import vigqyno.C0201;

/* renamed from: z43  reason: default package */
/* compiled from: X509CertificateHolder */
public class z43 {
    private p43 a;
    private r43 b;

    public z43(byte[] bArr) throws IOException {
        this(d(bArr));
    }

    private static p43 d(byte[] bArr) throws IOException {
        String r0 = C0201.m82(36992);
        try {
            return p43.g(u03.k(bArr));
        } catch (ClassCastException e) {
            throw new y43(r0 + e.getMessage(), e);
        } catch (IllegalArgumentException e2) {
            throw new y43(r0 + e2.getMessage(), e2);
        }
    }

    public q43 a(p03 p03) {
        r43 r43 = this.b;
        if (r43 != null) {
            return r43.g(p03);
        }
        return null;
    }

    public j43 b() {
        return j43.g(this.a.i());
    }

    public t43 c() {
        return this.a.k();
    }

    public p43 e() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof z43)) {
            return false;
        }
        return this.a.equals(((z43) obj).a);
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public z43(p43 p43) {
        this.a = p43;
        this.b = p43.l().g();
    }
}
