package defpackage;

import vigqyno.C0201;

/* renamed from: e33  reason: default package */
/* compiled from: ContentInfo */
public class e33 extends o03 implements d33 {
    private p03 a;
    private g03 b;

    public e33(v03 v03) {
        if (v03.size() < 1 || v03.size() > 2) {
            throw new IllegalArgumentException(C0201.m82(28942) + v03.size());
        }
        this.a = (p03) v03.t(0);
        if (v03.size() > 1) {
            b13 b13 = (b13) v03.t(1);
            if (!b13.t() || b13.s() != 0) {
                throw new IllegalArgumentException(C0201.m82(28941));
            }
            this.b = b13.r();
        }
    }

    public static e33 i(Object obj) {
        if (obj instanceof e33) {
            return (e33) obj;
        }
        if (obj != null) {
            return new e33(v03.q(obj));
        }
        return null;
    }

    @Override // defpackage.o03, defpackage.g03
    public u03 b() {
        h03 h03 = new h03();
        h03.a(this.a);
        g03 g03 = this.b;
        if (g03 != null) {
            h03.a(new m13(0, g03));
        }
        return new i13(h03);
    }

    public g03 g() {
        return this.b;
    }
}
