package defpackage;

import java.math.BigInteger;
import vigqyno.C0201;

/* renamed from: j83  reason: default package */
/* compiled from: XMSSPrivateKey */
public class j83 extends o03 {
    private final int a;
    private final byte[] b;
    private final byte[] c;
    private final byte[] d;
    private final byte[] e;
    private final byte[] f;

    public j83(int i, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        this.a = i;
        this.b = hb3.d(bArr);
        this.c = hb3.d(bArr2);
        this.d = hb3.d(bArr3);
        this.e = hb3.d(bArr4);
        this.f = hb3.d(bArr5);
    }

    public static j83 j(Object obj) {
        if (obj instanceof j83) {
            return (j83) obj;
        }
        if (obj != null) {
            return new j83(v03.q(obj));
        }
        return null;
    }

    @Override // defpackage.o03, defpackage.g03
    public u03 b() {
        h03 h03 = new h03();
        h03.a(new m03(0));
        h03 h032 = new h03();
        h032.a(new m03((long) this.a));
        h032.a(new a23(this.b));
        h032.a(new a23(this.c));
        h032.a(new a23(this.d));
        h032.a(new a23(this.e));
        h03.a(new e23(h032));
        h03.a(new j23(true, 0, new a23(this.f)));
        return new e23(h03);
    }

    public byte[] g() {
        return hb3.d(this.f);
    }

    public int i() {
        return this.a;
    }

    public byte[] k() {
        return hb3.d(this.d);
    }

    public byte[] l() {
        return hb3.d(this.e);
    }

    public byte[] o() {
        return hb3.d(this.c);
    }

    public byte[] p() {
        return hb3.d(this.b);
    }

    private j83(v03 v03) {
        if (!m03.q(v03.t(0)).s().equals(BigInteger.valueOf(0))) {
            throw new IllegalArgumentException(C0201.m82(3803));
        } else if (v03.size() == 2 || v03.size() == 3) {
            v03 q = v03.q(v03.t(1));
            this.a = m03.q(q.t(0)).s().intValue();
            this.b = hb3.d(q03.q(q.t(1)).s());
            this.c = hb3.d(q03.q(q.t(2)).s());
            this.d = hb3.d(q03.q(q.t(3)).s());
            this.e = hb3.d(q03.q(q.t(4)).s());
            if (v03.size() == 3) {
                this.f = hb3.d(q03.r(b13.q(v03.t(2)), true).s());
            } else {
                this.f = null;
            }
        } else {
            throw new IllegalArgumentException(C0201.m82(3802));
        }
    }
}
