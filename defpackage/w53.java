package defpackage;

import java.math.BigInteger;

/* renamed from: w53  reason: default package */
/* compiled from: OriginatorId */
public class w53 implements lb3 {
    private byte[] a;
    private j43 b;
    private BigInteger c;

    public w53(byte[] bArr) {
        c(bArr);
    }

    private boolean a(Object obj, Object obj2) {
        if (obj != null) {
            return obj.equals(obj2);
        }
        return obj2 == null;
    }

    private void b(j43 j43, BigInteger bigInteger) {
        this.b = j43;
        this.c = bigInteger;
    }

    private void c(byte[] bArr) {
        this.a = bArr;
    }

    @Override // java.lang.Object
    public Object clone() {
        return new w53(this.b, this.c, this.a);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof w53)) {
            return false;
        }
        w53 w53 = (w53) obj;
        if (!hb3.a(this.a, w53.a) || !a(this.c, w53.c) || !a(this.b, w53.b)) {
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
        return false;
    }

    public w53(j43 j43, BigInteger bigInteger) {
        b(j43, bigInteger);
    }

    public w53(j43 j43, BigInteger bigInteger, byte[] bArr) {
        b(j43, bigInteger);
        c(bArr);
    }
}
