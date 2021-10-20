package defpackage;

import java.math.BigInteger;

/* renamed from: u53  reason: default package */
/* compiled from: KeyTransRecipientId */
public class u53 extends b63 {
    private b53 a;

    private u53(b53 b53) {
        super(0);
        this.a = b53;
    }

    public j43 a() {
        return this.a.b();
    }

    public BigInteger b() {
        return this.a.c();
    }

    @Override // java.lang.Object
    public Object clone() {
        return new u53(this.a);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof u53)) {
            return false;
        }
        return this.a.equals(((u53) obj).a);
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    @Override // defpackage.lb3
    public boolean k(Object obj) {
        if (obj instanceof v53) {
            return ((v53) obj).c().equals(this);
        }
        return this.a.k(obj);
    }

    public u53(byte[] bArr) {
        this(null, null, bArr);
    }

    public u53(j43 j43, BigInteger bigInteger) {
        this(j43, bigInteger, null);
    }

    public u53(j43 j43, BigInteger bigInteger, byte[] bArr) {
        this(new b53(j43, bigInteger, bArr));
    }
}
