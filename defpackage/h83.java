package defpackage;

/* renamed from: h83  reason: default package */
/* compiled from: XMSSMTKeyParams */
public class h83 extends o03 {
    private final m03 a;
    private final int b;
    private final int c;
    private final o43 d;

    public h83(int i, int i2, o43 o43) {
        this.a = new m03(0);
        this.b = i;
        this.c = i2;
        this.d = o43;
    }

    public static h83 i(Object obj) {
        if (obj instanceof h83) {
            return (h83) obj;
        }
        if (obj != null) {
            return new h83(v03.q(obj));
        }
        return null;
    }

    @Override // defpackage.o03, defpackage.g03
    public u03 b() {
        h03 h03 = new h03();
        h03.a(this.a);
        h03.a(new m03((long) this.b));
        h03.a(new m03((long) this.c));
        h03.a(this.d);
        return new e23(h03);
    }

    public int g() {
        return this.b;
    }

    public int j() {
        return this.c;
    }

    public o43 k() {
        return this.d;
    }

    private h83(v03 v03) {
        this.a = m03.q(v03.t(0));
        this.b = m03.q(v03.t(1)).s().intValue();
        this.c = m03.q(v03.t(2)).s().intValue();
        this.d = o43.i(v03.t(3));
    }
}
