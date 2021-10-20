package defpackage;

import vigqyno.C0201;

/* renamed from: o43  reason: default package */
/* compiled from: AlgorithmIdentifier */
public class o43 extends o03 {
    private p03 a;
    private g03 b;

    public o43(p03 p03) {
        this.a = p03;
    }

    public static o43 i(Object obj) {
        if (obj instanceof o43) {
            return (o43) obj;
        }
        if (obj != null) {
            return new o43(v03.q(obj));
        }
        return null;
    }

    public static o43 j(b13 b13, boolean z) {
        return i(v03.r(b13, z));
    }

    @Override // defpackage.o03, defpackage.g03
    public u03 b() {
        h03 h03 = new h03();
        h03.a(this.a);
        g03 g03 = this.b;
        if (g03 != null) {
            h03.a(g03);
        }
        return new e23(h03);
    }

    public p03 g() {
        return this.a;
    }

    public g03 k() {
        return this.b;
    }

    public o43(p03 p03, g03 g03) {
        this.a = p03;
        this.b = g03;
    }

    private o43(v03 v03) {
        if (v03.size() < 1 || v03.size() > 2) {
            throw new IllegalArgumentException(C0201.m82(37139) + v03.size());
        }
        this.a = p03.v(v03.t(0));
        if (v03.size() == 2) {
            this.b = v03.t(1);
        } else {
            this.b = null;
        }
    }
}
