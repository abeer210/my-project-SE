package defpackage;

import java.math.BigInteger;

/* renamed from: b53  reason: default package */
/* compiled from: X509CertificateHolderSelector */
public class b53 implements lb3 {
    private byte[] a;
    private j43 b;
    private BigInteger c;

    public b53(j43 j43, BigInteger bigInteger, byte[] bArr) {
        this.b = j43;
        this.c = bigInteger;
        this.a = bArr;
    }

    private boolean a(Object obj, Object obj2) {
        if (obj != null) {
            return obj.equals(obj2);
        }
        return obj2 == null;
    }

    public j43 b() {
        return this.b;
    }

    public BigInteger c() {
        return this.c;
    }

    @Override // java.lang.Object
    public Object clone() {
        return new b53(this.b, this.c, this.a);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof b53)) {
            return false;
        }
        b53 b53 = (b53) obj;
        if (!hb3.a(this.a, b53.a) || !a(this.c, b53.c) || !a(this.b, b53.b)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        int h = hb3.h(this.a);
        BigInteger bigInteger = this.c;
        if (bigInteger != null) {
            h ^= bigInteger.hashCode();
        }
        j43 j43 = this.b;
        return j43 != null ? h ^ j43.hashCode() : h;
    }

    @Override // defpackage.lb3
    public boolean k(Object obj) {
        if (obj instanceof z43) {
            z43 z43 = (z43) obj;
            if (c() != null) {
                h33 h33 = new h33(z43.e());
                if (!h33.i().equals(this.b) || !h33.j().s().equals(this.c)) {
                    return false;
                }
                return true;
            } else if (this.a != null) {
                q43 a2 = z43.a(q43.d);
                if (a2 == null) {
                    return hb3.a(this.a, a53.a(z43.c()));
                }
                return hb3.a(this.a, q03.q(a2.l()).s());
            }
        } else if (obj instanceof byte[]) {
            return hb3.a(this.a, (byte[]) obj);
        }
        return false;
    }
}
