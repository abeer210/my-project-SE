package defpackage;

/* renamed from: m83  reason: default package */
/* compiled from: McElieceCCA2PrivateKeyParameters */
public class m83 extends l83 {
    private int b;
    private int c;
    private xa3 d;
    private eb3 e;
    private db3 f;
    private wa3 g;

    public m83(int i, int i2, xa3 xa3, eb3 eb3, db3 db3, String str) {
        this(i, i2, xa3, eb3, ya3.a(xa3, eb3), db3, str);
    }

    public xa3 b() {
        return this.d;
    }

    public eb3 c() {
        return this.e;
    }

    public wa3 d() {
        return this.g;
    }

    public int e() {
        return this.c;
    }

    public int f() {
        return this.b;
    }

    public db3 g() {
        return this.f;
    }

    public m83(int i, int i2, xa3 xa3, eb3 eb3, wa3 wa3, db3 db3, String str) {
        super(true, str);
        this.b = i;
        this.c = i2;
        this.d = xa3;
        this.e = eb3;
        this.g = wa3;
        this.f = db3;
        new gb3(xa3, eb3).c();
    }
}
