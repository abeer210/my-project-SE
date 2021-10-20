package defpackage;

/* renamed from: q33  reason: default package */
/* compiled from: OtherKeyAttribute */
public class q33 extends o03 {
    private p03 a;
    private g03 b;

    public q33(v03 v03) {
        this.a = (p03) v03.t(0);
        this.b = v03.t(1);
    }

    public static q33 g(Object obj) {
        if (obj instanceof q33) {
            return (q33) obj;
        }
        if (obj != null) {
            return new q33(v03.q(obj));
        }
        return null;
    }

    @Override // defpackage.o03, defpackage.g03
    public u03 b() {
        h03 h03 = new h03();
        h03.a(this.a);
        h03.a(this.b);
        return new e23(h03);
    }
}
