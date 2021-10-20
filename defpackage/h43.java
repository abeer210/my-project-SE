package defpackage;

import vigqyno.C0201;

/* renamed from: h43  reason: default package */
/* compiled from: AttributeTypeAndValue */
public class h43 extends o03 {
    private p03 a;
    private g03 b;

    private h43(v03 v03) {
        this.a = (p03) v03.t(0);
        this.b = v03.t(1);
    }

    public static h43 g(Object obj) {
        if (obj instanceof h43) {
            return (h43) obj;
        }
        if (obj != null) {
            return new h43(v03.q(obj));
        }
        throw new IllegalArgumentException(C0201.m82(9400));
    }

    @Override // defpackage.o03, defpackage.g03
    public u03 b() {
        h03 h03 = new h03();
        h03.a(this.a);
        h03.a(this.b);
        return new e23(h03);
    }

    public p03 i() {
        return this.a;
    }

    public g03 j() {
        return this.b;
    }
}
