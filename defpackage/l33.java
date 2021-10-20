package defpackage;

/* renamed from: l33  reason: default package */
/* compiled from: KeyAgreeRecipientInfo */
public class l33 extends o03 {
    private m03 a;
    private n33 b;
    private q03 c;
    private o43 d;
    private v03 e;

    public l33(v03 v03) {
        this.a = (m03) v03.t(0);
        this.b = n33.i((b13) v03.t(1), true);
        int i = 2;
        if (v03.t(2) instanceof b13) {
            this.c = q03.r((b13) v03.t(2), true);
            i = 3;
        }
        this.d = o43.i(v03.t(i));
        this.e = (v03) v03.t(i + 1);
    }

    public static l33 g(Object obj) {
        if (obj instanceof l33) {
            return (l33) obj;
        }
        if (obj != null) {
            return new l33(v03.q(obj));
        }
        return null;
    }

    public static l33 i(b13 b13, boolean z) {
        return g(v03.r(b13, z));
    }

    @Override // defpackage.o03, defpackage.g03
    public u03 b() {
        h03 h03 = new h03();
        h03.a(this.a);
        h03.a(new j23(true, 0, this.b));
        if (this.c != null) {
            h03.a(new j23(true, 1, this.c));
        }
        h03.a(this.d);
        h03.a(this.e);
        return new e23(h03);
    }

    public o43 j() {
        return this.d;
    }

    public n33 k() {
        return this.b;
    }

    public v03 l() {
        return this.e;
    }

    public q03 o() {
        return this.c;
    }
}
