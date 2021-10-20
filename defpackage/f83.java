package defpackage;

/* renamed from: f83  reason: default package */
/* compiled from: SPHINCS256KeyParams */
public class f83 extends o03 {
    private final m03 a;
    private final o43 b;

    public f83(o43 o43) {
        this.a = new m03(0);
        this.b = o43;
    }

    public static final f83 g(Object obj) {
        if (obj instanceof f83) {
            return (f83) obj;
        }
        if (obj != null) {
            return new f83(v03.q(obj));
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

    public o43 i() {
        return this.b;
    }

    private f83(v03 v03) {
        this.a = m03.q(v03.t(0));
        this.b = o43.i(v03.t(1));
    }
}
