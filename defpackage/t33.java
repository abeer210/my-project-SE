package defpackage;

/* renamed from: t33  reason: default package */
/* compiled from: RecipientEncryptedKey */
public class t33 extends o03 {
    private k33 a;
    private q03 b;

    private t33(v03 v03) {
        this.a = k33.g(v03.t(0));
        this.b = (q03) v03.t(1);
    }

    public static t33 j(Object obj) {
        if (obj instanceof t33) {
            return (t33) obj;
        }
        if (obj != null) {
            return new t33(v03.q(obj));
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

    public q03 g() {
        return this.b;
    }

    public k33 i() {
        return this.a;
    }
}
