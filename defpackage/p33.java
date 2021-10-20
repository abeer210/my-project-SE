package defpackage;

/* renamed from: p33  reason: default package */
/* compiled from: OriginatorPublicKey */
public class p33 extends o03 {
    private o43 a;
    private r13 b;

    public p33(v03 v03) {
        this.a = o43.i(v03.t(0));
        this.b = (r13) v03.t(1);
    }

    public static p33 g(Object obj) {
        if (obj instanceof p33) {
            return (p33) obj;
        }
        if (obj != null) {
            return new p33(v03.q(obj));
        }
        return null;
    }

    public static p33 i(b13 b13, boolean z) {
        return g(v03.r(b13, z));
    }

    @Override // defpackage.o03, defpackage.g03
    public u03 b() {
        h03 h03 = new h03();
        h03.a(this.a);
        h03.a(this.b);
        return new e23(h03);
    }

    public r13 j() {
        return this.b;
    }
}
