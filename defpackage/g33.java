package defpackage;

/* renamed from: g33  reason: default package */
/* compiled from: EnvelopedData */
public class g33 extends o03 {
    private m03 a;
    private o33 b;
    private x03 c;
    private f33 d;
    private x03 e;

    public g33(v03 v03) {
        this.a = (m03) v03.t(0);
        g03 t = v03.t(1);
        int i = 2;
        if (t instanceof b13) {
            this.b = o33.i((b13) t, false);
            t = v03.t(2);
            i = 3;
        }
        this.c = x03.r(t);
        int i2 = i + 1;
        this.d = f33.j(v03.t(i));
        if (v03.size() > i2) {
            this.e = x03.s((b13) v03.t(i2), false);
        }
    }

    public static g33 i(Object obj) {
        if (obj instanceof g33) {
            return (g33) obj;
        }
        if (obj != null) {
            return new g33(v03.q(obj));
        }
        return null;
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
        if (this.e != null) {
            h03.a(new j23(false, 1, this.e));
        }
        return new i13(h03);
    }

    public f33 g() {
        return this.d;
    }

    public o33 j() {
        return this.b;
    }

    public x03 k() {
        return this.c;
    }

    public x03 l() {
        return this.e;
    }
}
