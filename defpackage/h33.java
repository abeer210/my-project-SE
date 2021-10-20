package defpackage;

/* renamed from: h33  reason: default package */
/* compiled from: IssuerAndSerialNumber */
public class h33 extends o03 {
    private j43 a;
    private m03 b;

    public h33(v03 v03) {
        this.a = j43.g(v03.t(0));
        this.b = (m03) v03.t(1);
    }

    public static h33 g(Object obj) {
        if (obj instanceof h33) {
            return (h33) obj;
        }
        if (obj != null) {
            return new h33(v03.q(obj));
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

    public j43 i() {
        return this.a;
    }

    public m03 j() {
        return this.b;
    }

    public h33(p43 p43) {
        this.a = p43.i();
        this.b = p43.j();
    }
}
