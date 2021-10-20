package defpackage;

import java.math.BigInteger;
import vigqyno.C0201;

/* renamed from: k83  reason: default package */
/* compiled from: XMSSPublicKey */
public class k83 extends o03 {
    private final byte[] a;
    private final byte[] b;

    public k83(byte[] bArr, byte[] bArr2) {
        this.a = hb3.d(bArr);
        this.b = hb3.d(bArr2);
    }

    public static k83 g(Object obj) {
        if (obj instanceof k83) {
            return (k83) obj;
        }
        if (obj != null) {
            return new k83(v03.q(obj));
        }
        return null;
    }

    @Override // defpackage.o03, defpackage.g03
    public u03 b() {
        h03 h03 = new h03();
        h03.a(new m03(0));
        h03.a(new a23(this.a));
        h03.a(new a23(this.b));
        return new e23(h03);
    }

    public byte[] i() {
        return hb3.d(this.a);
    }

    public byte[] j() {
        return hb3.d(this.b);
    }

    private k83(v03 v03) {
        if (m03.q(v03.t(0)).s().equals(BigInteger.valueOf(0))) {
            this.a = hb3.d(q03.q(v03.t(1)).s());
            this.b = hb3.d(q03.q(v03.t(2)).s());
            return;
        }
        throw new IllegalArgumentException(C0201.m82(31388));
    }
}
