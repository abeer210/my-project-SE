package defpackage;

/* renamed from: b83  reason: default package */
/* compiled from: McEliecePublicKey */
public class b83 extends o03 {
    private final int a;
    private final int b;
    private final wa3 c;

    public b83(int i, int i2, wa3 wa3) {
        this.a = i;
        this.b = i2;
        this.c = new wa3(wa3);
    }

    public static b83 i(Object obj) {
        if (obj instanceof b83) {
            return (b83) obj;
        }
        if (obj != null) {
            return new b83(v03.q(obj));
        }
        return null;
    }

    @Override // defpackage.o03, defpackage.g03
    public u03 b() {
        h03 h03 = new h03();
        h03.a(new m03((long) this.a));
        h03.a(new m03((long) this.b));
        h03.a(new a23(this.c.c()));
        return new e23(h03);
    }

    public wa3 g() {
        return new wa3(this.c);
    }

    public int j() {
        return this.a;
    }

    public int k() {
        return this.b;
    }

    private b83(v03 v03) {
        this.a = ((m03) v03.t(0)).s().intValue();
        this.b = ((m03) v03.t(1)).s().intValue();
        this.c = new wa3(((q03) v03.t(2)).s());
    }
}
