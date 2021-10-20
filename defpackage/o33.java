package defpackage;

import vigqyno.C0201;

/* renamed from: o33  reason: default package */
/* compiled from: OriginatorInfo */
public class o33 extends o03 {
    private x03 a;
    private x03 b;

    private o33(v03 v03) {
        int size = v03.size();
        if (size == 0) {
            return;
        }
        if (size == 1) {
            b13 b13 = (b13) v03.t(0);
            int s = b13.s();
            if (s == 0) {
                this.a = x03.s(b13, false);
            } else if (s == 1) {
                this.b = x03.s(b13, false);
            } else {
                throw new IllegalArgumentException(C0201.m82(30722) + b13.s());
            }
        } else if (size == 2) {
            this.a = x03.s((b13) v03.t(0), false);
            this.b = x03.s((b13) v03.t(1), false);
        } else {
            throw new IllegalArgumentException(C0201.m82(30721));
        }
    }

    public static o33 g(Object obj) {
        if (obj instanceof o33) {
            return (o33) obj;
        }
        if (obj != null) {
            return new o33(v03.q(obj));
        }
        return null;
    }

    public static o33 i(b13 b13, boolean z) {
        return g(v03.r(b13, z));
    }

    @Override // defpackage.o03, defpackage.g03
    public u03 b() {
        h03 h03 = new h03();
        if (this.a != null) {
            h03.a(new j23(false, 0, this.a));
        }
        if (this.b != null) {
            h03.a(new j23(false, 1, this.b));
        }
        return new e23(h03);
    }
}
