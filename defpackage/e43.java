package defpackage;

import java.io.IOException;
import java.util.Enumeration;
import vigqyno.C0201;

/* renamed from: e43  reason: default package */
/* compiled from: PrivateKeyInfo */
public class e43 extends o03 {
    private q03 a;
    private o43 b;
    private x03 c;

    public e43(o43 o43, g03 g03) throws IOException {
        this(o43, g03, null);
    }

    public static e43 g(Object obj) {
        if (obj instanceof e43) {
            return (e43) obj;
        }
        if (obj != null) {
            return new e43(v03.q(obj));
        }
        return null;
    }

    @Override // defpackage.o03, defpackage.g03
    public u03 b() {
        h03 h03 = new h03();
        h03.a(new m03(0));
        h03.a(this.b);
        h03.a(this.a);
        if (this.c != null) {
            h03.a(new j23(false, 0, this.c));
        }
        return new e23(h03);
    }

    public o43 i() {
        return this.b;
    }

    public g03 j() throws IOException {
        return u03.k(this.a.s());
    }

    public e43(o43 o43, g03 g03, x03 x03) throws IOException {
        this.a = new a23(g03.b().f(C0201.m82(26725)));
        this.b = o43;
        this.c = x03;
    }

    public e43(v03 v03) {
        Enumeration u = v03.u();
        if (((m03) u.nextElement()).s().intValue() == 0) {
            this.b = o43.i(u.nextElement());
            this.a = q03.q(u.nextElement());
            if (u.hasMoreElements()) {
                this.c = x03.s((b13) u.nextElement(), false);
                return;
            }
            return;
        }
        throw new IllegalArgumentException(C0201.m82(26726));
    }
}
