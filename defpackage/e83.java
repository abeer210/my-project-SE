package defpackage;

/* renamed from: e83  reason: default package */
/* compiled from: RainbowPublicKey */
public class e83 extends o03 {
    private m03 a;
    private p03 b;
    private m03 c;
    private byte[][] d;
    private byte[][] e;
    private byte[] f;

    private e83(v03 v03) {
        if (v03.t(0) instanceof m03) {
            this.a = m03.q(v03.t(0));
        } else {
            this.b = p03.v(v03.t(0));
        }
        this.c = m03.q(v03.t(1));
        v03 q = v03.q(v03.t(2));
        this.d = new byte[q.size()][];
        for (int i = 0; i < q.size(); i++) {
            this.d[i] = q03.q(q.t(i)).s();
        }
        v03 v032 = (v03) v03.t(3);
        this.e = new byte[v032.size()][];
        for (int i2 = 0; i2 < v032.size(); i2++) {
            this.e[i2] = q03.q(v032.t(i2)).s();
        }
        this.f = q03.q(((v03) v03.t(4)).t(0)).s();
    }

    public static e83 l(Object obj) {
        if (obj instanceof e83) {
            return (e83) obj;
        }
        if (obj != null) {
            return new e83(v03.q(obj));
        }
        return null;
    }

    @Override // defpackage.o03, defpackage.g03
    public u03 b() {
        h03 h03 = new h03();
        m03 m03 = this.a;
        if (m03 != null) {
            h03.a(m03);
        } else {
            h03.a(this.b);
        }
        h03.a(this.c);
        h03 h032 = new h03();
        int i = 0;
        int i2 = 0;
        while (true) {
            byte[][] bArr = this.d;
            if (i2 >= bArr.length) {
                break;
            }
            h032.a(new a23(bArr[i2]));
            i2++;
        }
        h03.a(new e23(h032));
        h03 h033 = new h03();
        while (true) {
            byte[][] bArr2 = this.e;
            if (i < bArr2.length) {
                h033.a(new a23(bArr2[i]));
                i++;
            } else {
                h03.a(new e23(h033));
                h03 h034 = new h03();
                h034.a(new a23(this.f));
                h03.a(new e23(h034));
                return new e23(h03);
            }
        }
    }

    public short[][] g() {
        return v83.d(this.d);
    }

    public short[] i() {
        return v83.b(this.f);
    }

    public short[][] j() {
        return v83.d(this.e);
    }

    public int k() {
        return this.c.s().intValue();
    }

    public e83(int i, short[][] sArr, short[][] sArr2, short[] sArr3) {
        this.a = new m03(0);
        this.c = new m03((long) i);
        this.d = v83.c(sArr);
        this.e = v83.c(sArr2);
        this.f = v83.a(sArr3);
    }
}
