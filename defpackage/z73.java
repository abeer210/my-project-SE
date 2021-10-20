package defpackage;

/* renamed from: z73  reason: default package */
/* compiled from: McElieceCCA2PublicKey */
public class z73 extends o03 {
    private final int a;
    private final int b;
    private final wa3 c;
    private final o43 d;

    public z73(int i, int i2, wa3 wa3, o43 o43) {
        this.a = i;
        this.b = i2;
        this.c = new wa3(wa3.c());
        this.d = o43;
    }

    public static z73 j(Object obj) {
        if (obj instanceof z73) {
            return (z73) obj;
        }
        if (obj != null) {
            return new z73(v03.q(obj));
        }
        return null;
    }

    @Override // defpackage.o03, defpackage.g03
    public u03 b() {
        h03 h03 = new h03();
        h03.a(new m03((long) this.a));
        h03.a(new m03((long) this.b));
        h03.a(new a23(this.c.c()));
        h03.a(this.d);
        return new e23(h03);
    }

    public o43 g() {
        return this.d;
    }

    public wa3 i() {
        return this.c;
    }

    public int k() {
        return this.a;
    }

    public int l() {
        return this.b;
    }

    private z73(v03 v03) {
        this.a = ((m03) v03.t(0)).s().intValue();
        this.b = ((m03) v03.t(1)).s().intValue();
        this.c = new wa3(((q03) v03.t(2)).s());
        this.d = o43.i(v03.t(3));
    }
}
