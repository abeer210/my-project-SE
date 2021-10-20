package defpackage;

/* renamed from: y73  reason: default package */
/* compiled from: McElieceCCA2PrivateKey */
public class y73 extends o03 {
    private int a;
    private int b;
    private byte[] c;
    private byte[] d;
    private byte[] e;
    private o43 f;

    public y73(int i, int i2, xa3 xa3, eb3 eb3, db3 db3, o43 o43) {
        this.a = i;
        this.b = i2;
        this.c = xa3.e();
        this.d = eb3.h();
        this.e = db3.a();
        this.f = o43;
    }

    public static y73 k(Object obj) {
        if (obj instanceof y73) {
            return (y73) obj;
        }
        if (obj != null) {
            return new y73(v03.q(obj));
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
        h03.a(new a23(this.e));
        h03.a(this.f);
        return new e23(h03);
    }

    public o43 g() {
        return this.f;
    }

    public xa3 i() {
        return new xa3(this.c);
    }

    public eb3 j() {
        return new eb3(i(), this.d);
    }

    public int l() {
        return this.b;
    }

    public int o() {
        return this.a;
    }

    public db3 p() {
        return new db3(this.e);
    }

    private y73(v03 v03) {
        this.a = ((m03) v03.t(0)).s().intValue();
        this.b = ((m03) v03.t(1)).s().intValue();
        this.c = ((q03) v03.t(2)).s();
        this.d = ((q03) v03.t(3)).s();
        this.e = ((q03) v03.t(4)).s();
        this.f = o43.i(v03.t(5));
    }
}
