package defpackage;

/* renamed from: g83  reason: default package */
/* compiled from: XMSSKeyParams */
public class g83 extends o03 {
    private final m03 a;
    private final int b;
    private final o43 c;

    public g83(int i, o43 o43) {
        this.a = new m03(0);
        this.b = i;
        this.c = o43;
    }

    public static g83 i(Object obj) {
        if (obj instanceof g83) {
            return (g83) obj;
        }
        if (obj != null) {
            return new g83(v03.q(obj));
        }
        return null;
    }

    @Override // defpackage.o03, defpackage.g03
    public u03 b() {
        h03 h03 = new h03();
        h03.a(this.a);
        h03.a(new m03((long) this.b));
        h03.a(this.c);
        return new e23(h03);
    }

    public int g() {
        return this.b;
    }

    public o43 j() {
        return this.c;
    }

    private g83(v03 v03) {
        this.a = m03.q(v03.t(0));
        this.b = m03.q(v03.t(1)).s().intValue();
        this.c = o43.i(v03.t(2));
    }
}
