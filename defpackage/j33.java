package defpackage;

/* renamed from: j33  reason: default package */
/* compiled from: KEKRecipientInfo */
public class j33 extends o03 {
    private m03 a;
    private i33 b;
    private o43 c;
    private q03 d;

    public j33(v03 v03) {
        this.a = (m03) v03.t(0);
        this.b = i33.g(v03.t(1));
        this.c = o43.i(v03.t(2));
        this.d = (q03) v03.t(3);
    }

    public static j33 i(Object obj) {
        if (obj instanceof j33) {
            return (j33) obj;
        }
        if (obj != null) {
            return new j33(v03.q(obj));
        }
        return null;
    }

    public static j33 j(b13 b13, boolean z) {
        return i(v03.r(b13, z));
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

    public i33 k() {
        return this.b;
    }

    public o43 l() {
        return this.c;
    }
}
