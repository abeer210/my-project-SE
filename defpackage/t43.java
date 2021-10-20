package defpackage;

import java.io.IOException;
import java.util.Enumeration;
import vigqyno.C0201;

/* renamed from: t43  reason: default package */
/* compiled from: SubjectPublicKeyInfo */
public class t43 extends o03 {
    private o43 a;
    private r13 b;

    public t43(o43 o43, g03 g03) throws IOException {
        this.b = new r13(g03);
        this.a = o43;
    }

    public static t43 i(Object obj) {
        if (obj instanceof t43) {
            return (t43) obj;
        }
        if (obj != null) {
            return new t43(v03.q(obj));
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

    public o43 g() {
        return this.a;
    }

    public r13 j() {
        return this.b;
    }

    public u03 k() throws IOException {
        return new l03(this.b.t()).s();
    }

    public t43(o43 o43, byte[] bArr) {
        this.b = new r13(bArr);
        this.a = o43;
    }

    public t43(v03 v03) {
        if (v03.size() == 2) {
            Enumeration u = v03.u();
            this.a = o43.i(u.nextElement());
            this.b = r13.w(u.nextElement());
            return;
        }
        throw new IllegalArgumentException(C0201.m82(35634) + v03.size());
    }
}
