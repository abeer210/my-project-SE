package defpackage;

/* renamed from: m33  reason: default package */
/* compiled from: KeyTransRecipientInfo */
public class m33 extends o03 {
    private m03 a;
    private u33 b;
    private o43 c;
    private q03 d;

    public m33(v03 v03) {
        this.a = (m03) v03.t(0);
        this.b = u33.i(v03.t(1));
        this.c = o43.i(v03.t(2));
        this.d = (q03) v03.t(3);
    }

    public static m33 i(Object obj) {
        if (obj instanceof m33) {
            return (m33) obj;
        }
        if (obj != null) {
            return new m33(v03.q(obj));
        }
        return null;
    }

    @Override // defpackage.o03, defpackage.g03
    public u03 b() {
        h03 h03 = new h03();
        h03.a(this.a);
        h03.a(this.b);
        h03.a(this.c);
        h03.a(this.d);
        return new e23(h03);
    }

    public q03 g() {
        return this.d;
    }

    public o43 j() {
        return this.c;
    }

    public u33 k() {
        return this.b;
    }
}
