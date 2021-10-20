package defpackage;

import java.math.BigInteger;

/* renamed from: r53  reason: default package */
/* compiled from: KeyAgreeRecipientId */
public class r53 extends b63 {
    private b53 a;

    private r53(b53 b53) {
        super(2);
        this.a = b53;
    }

    @Override // java.lang.Object
    public Object clone() {
        return new r53(this.a);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof r53)) {
            return false;
        }
        return this.a.equals(((r53) obj).a);
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    @Override // defpackage.lb3
    public boolean k(Object obj) {
        if (obj instanceof s53) {
            return ((s53) obj).c().equals(this);
        }
        return this.a.k(obj);
    }

    public r53(byte[] bArr) {
        this(null, null, bArr);
    }

    public r53(j43 j43, BigInteger bigInteger) {
        this(j43, bigInteger, null);
    }

    public r53(j43 j43, BigInteger bigInteger, byte[] bArr) {
        this(new b53(j43, bigInteger, bArr));
    }
}
