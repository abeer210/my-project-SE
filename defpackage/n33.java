package defpackage;

import vigqyno.C0201;

/* renamed from: n33  reason: default package */
/* compiled from: OriginatorIdentifierOrKey */
public class n33 extends o03 implements f03 {
    private g03 a;

    public n33(h33 h33) {
        this.a = h33;
    }

    public static n33 g(Object obj) {
        if (obj == null || (obj instanceof n33)) {
            return (n33) obj;
        }
        if ((obj instanceof h33) || (obj instanceof v03)) {
            return new n33(h33.g(obj));
        }
        if (obj instanceof b13) {
            b13 b13 = (b13) obj;
            if (b13.s() == 0) {
                return new n33(s43.i(b13, false));
            }
            if (b13.s() == 1) {
                return new n33(p33.i(b13, false));
            }
        }
        throw new IllegalArgumentException(C0201.m82(2718) + obj.getClass().getName());
    }

    public static n33 i(b13 b13, boolean z) {
        if (z) {
            return g(b13.r());
        }
        throw new IllegalArgumentException(C0201.m82(2719));
    }

    @Override // defpackage.o03, defpackage.g03
    public u03 b() {
        return this.a.b();
    }

    public h33 j() {
        g03 g03 = this.a;
        if (g03 instanceof h33) {
            return (h33) g03;
        }
        return null;
    }

    public p33 k() {
        g03 g03 = this.a;
        if (!(g03 instanceof b13) || ((b13) g03).s() != 1) {
            return null;
        }
        return p33.i((b13) this.a, false);
    }

    public s43 l() {
        g03 g03 = this.a;
        if (!(g03 instanceof b13) || ((b13) g03).s() != 0) {
            return null;
        }
        return s43.i((b13) this.a, false);
    }

    public n33(s43 s43) {
        this.a = new j23(false, 0, s43);
    }

    public n33(p33 p33) {
        this.a = new j23(false, 1, p33);
    }
}
