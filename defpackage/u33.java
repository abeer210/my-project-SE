package defpackage;

import vigqyno.C0201;

/* renamed from: u33  reason: default package */
/* compiled from: RecipientIdentifier */
public class u33 extends o03 implements f03 {
    private g03 a;

    public u33(h33 h33) {
        this.a = h33;
    }

    public static u33 i(Object obj) {
        if (obj == null || (obj instanceof u33)) {
            return (u33) obj;
        }
        if (obj instanceof h33) {
            return new u33((h33) obj);
        }
        if (obj instanceof q03) {
            return new u33((q03) obj);
        }
        if (obj instanceof u03) {
            return new u33((u03) obj);
        }
        throw new IllegalArgumentException(C0201.m82(27807) + obj.getClass().getName());
    }

    @Override // defpackage.o03, defpackage.g03
    public u03 b() {
        return this.a.b();
    }

    public g03 g() {
        g03 g03 = this.a;
        if (g03 instanceof b13) {
            return q03.r((b13) g03, false);
        }
        return h33.g(g03);
    }

    public boolean j() {
        return this.a instanceof b13;
    }

    public u33(q03 q03) {
        this.a = new j23(false, 0, q03);
    }

    public u33(u03 u03) {
        this.a = u03;
    }
}
