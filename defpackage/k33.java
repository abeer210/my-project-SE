package defpackage;

import vigqyno.C0201;

/* renamed from: k33  reason: default package */
/* compiled from: KeyAgreeRecipientIdentifier */
public class k33 extends o03 implements f03 {
    private h33 a;
    private w33 b;

    public k33(h33 h33) {
        this.a = h33;
        this.b = null;
    }

    public static k33 g(Object obj) {
        if (obj == null || (obj instanceof k33)) {
            return (k33) obj;
        }
        if (obj instanceof v03) {
            return new k33(h33.g(obj));
        }
        if (obj instanceof b13) {
            b13 b13 = (b13) obj;
            if (b13.s() == 0) {
                return new k33(w33.i(b13, false));
            }
        }
        throw new IllegalArgumentException(C0201.m82(25006) + obj.getClass().getName());
    }

    @Override // defpackage.o03, defpackage.g03
    public u03 b() {
        h33 h33 = this.a;
        if (h33 != null) {
            return h33.b();
        }
        return new j23(false, 0, this.b);
    }

    public h33 i() {
        return this.a;
    }

    public w33 j() {
        return this.b;
    }

    public k33(w33 w33) {
        this.a = null;
        this.b = w33;
    }
}
