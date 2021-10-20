package defpackage;

import vigqyno.C0201;

/* renamed from: v33  reason: default package */
/* compiled from: RecipientInfo */
public class v33 extends o03 implements f03 {
    public g03 a;

    public v33(u03 u03) {
        this.a = u03;
    }

    public static v33 i(Object obj) {
        if (obj == null || (obj instanceof v33)) {
            return (v33) obj;
        }
        if (obj instanceof v03) {
            return new v33((v03) obj);
        }
        if (obj instanceof b13) {
            return new v33((b13) obj);
        }
        throw new IllegalArgumentException(C0201.m82(25000) + obj.getClass().getName());
    }

    private j33 j(b13 b13) {
        if (b13.t()) {
            return j33.j(b13, true);
        }
        return j33.j(b13, false);
    }

    @Override // defpackage.o03, defpackage.g03
    public u03 b() {
        return this.a.b();
    }

    public g03 g() {
        g03 g03 = this.a;
        if (!(g03 instanceof b13)) {
            return m33.i(g03);
        }
        b13 b13 = (b13) g03;
        int s = b13.s();
        if (s == 1) {
            return l33.i(b13, false);
        }
        if (s == 2) {
            return j(b13);
        }
        if (s == 3) {
            return s33.j(b13, false);
        }
        if (s == 4) {
            return r33.i(b13, false);
        }
        throw new IllegalStateException(C0201.m82(25001));
    }
}
