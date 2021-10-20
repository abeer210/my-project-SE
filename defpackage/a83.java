package defpackage;

/* renamed from: a83  reason: default package */
/* compiled from: McEliecePrivateKey */
public class a83 extends o03 {
    private int a;
    private int b;
    private byte[] c;
    private byte[] d;
    private byte[] e;
    private byte[] f;
    private byte[] g;

    public a83(int i, int i2, xa3 xa3, eb3 eb3, db3 db3, db3 db32, wa3 wa3) {
        this.a = i;
        this.b = i2;
        this.c = xa3.e();
        this.d = eb3.h();
        this.e = wa3.c();
        this.f = db3.a();
        this.g = db32.a();
    }

    public static a83 j(Object obj) {
        if (obj instanceof a83) {
            return (a83) obj;
        }
        if (obj != null) {
            return new a83(v03.q(obj));
        }
        return null;
    }

    @Override // defpackage.o03, defpackage.g03
    public u03 b() {
        h03 h03 = new h03();
        h03.a(new m03((long) this.a));
        h03.a(new m03((long) this.b));
        h03.a(new a23(this.c));
        h03.a(new a23(this.d));
        h03.a(new a23(this.f));
        h03.a(new a23(this.g));
        h03.a(new a23(this.e));
        return new e23(h03);
    }

    public xa3 g() {
        return new xa3(this.c);
    }

    public eb3 i() {
        return new eb3(g(), this.d);
    }

    public int k() {
        return this.b;
    }

    public int l() {
        return this.a;
    }

    public db3 o() {
        return new db3(this.f);
    }

    public db3 p() {
        return new db3(this.g);
    }

    public wa3 q() {
        return new wa3(this.e);
    }

    private a83(v03 v03) {
        this.a = ((m03) v03.t(0)).s().intValue();
        this.b = ((m03) v03.t(1)).s().intValue();
        this.c = ((q03) v03.t(2)).s();
        this.d = ((q03) v03.t(3)).s();
        this.f = ((q03) v03.t(4)).s();
        this.g = ((q03) v03.t(5)).s();
        this.e = ((q03) v03.t(6)).s();
    }
}
