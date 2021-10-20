package defpackage;

/* renamed from: s33  reason: default package */
/* compiled from: PasswordRecipientInfo */
public class s33 extends o03 {
    private m03 a;
    private o43 b;
    private o43 c;
    private q03 d;

    public s33(v03 v03) {
        this.a = (m03) v03.t(0);
        if (v03.t(1) instanceof b13) {
            this.b = o43.j((b13) v03.t(1), false);
            this.c = o43.i(v03.t(2));
            this.d = (q03) v03.t(3);
            return;
        }
        this.c = o43.i(v03.t(1));
        this.d = (q03) v03.t(2);
    }

    public static s33 i(Object obj) {
        if (obj instanceof s33) {
            return (s33) obj;
        }
        if (obj != null) {
            return new s33(v03.q(obj));
        }
        return null;
    }

    public static s33 j(b13 b13, boolean z) {
        return i(v03.r(b13, z));
    }

    @Override // defpackage.o03, defpackage.g03
    public u03 b() {
        h03 h03 = new h03();
        h03.a(this.a);
        if (this.b != null) {
            h03.a(new j23(false, 0, this.b));
        }
        h03.a(this.c);
        h03.a(this.d);
        return new e23(h03);
    }

    public q03 g() {
        return this.d;
    }

    public o43 k() {
        return this.b;
    }

    public o43 l() {
        return this.c;
    }
}
