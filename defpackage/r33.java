package defpackage;

/* renamed from: r33  reason: default package */
/* compiled from: OtherRecipientInfo */
public class r33 extends o03 {
    private p03 a;
    private g03 b;

    public r33(v03 v03) {
        this.a = p03.v(v03.t(0));
        this.b = v03.t(1);
    }

    public static r33 g(Object obj) {
        if (obj instanceof r33) {
            return (r33) obj;
        }
        if (obj != null) {
            return new r33(v03.q(obj));
        }
        return null;
    }

    public static r33 i(b13 b13, boolean z) {
        return g(v03.r(b13, z));
    }

    @Override // defpackage.o03, defpackage.g03
    public u03 b() {
        h03 h03 = new h03();
        h03.a(this.a);
        h03.a(this.b);
        return new e23(h03);
    }
}
