package defpackage;

import vigqyno.C0201;

/* renamed from: f33  reason: default package */
/* compiled from: EncryptedContentInfo */
public class f33 extends o03 {
    private p03 a;
    private o43 b;
    private q03 c;

    private f33(v03 v03) {
        if (v03.size() >= 2) {
            this.a = (p03) v03.t(0);
            this.b = o43.i(v03.t(1));
            if (v03.size() > 2) {
                this.c = q03.r((b13) v03.t(2), false);
                return;
            }
            return;
        }
        throw new IllegalArgumentException(C0201.m82(16692));
    }

    public static f33 j(Object obj) {
        if (obj instanceof f33) {
            return (f33) obj;
        }
        if (obj != null) {
            return new f33(v03.q(obj));
        }
        return null;
    }

    @Override // defpackage.o03, defpackage.g03
    public u03 b() {
        h03 h03 = new h03();
        h03.a(this.a);
        h03.a(this.b);
        q03 q03 = this.c;
        if (q03 != null) {
            h03.a(new m13(false, 0, q03));
        }
        return new i13(h03);
    }

    public o43 g() {
        return this.b;
    }

    public q03 i() {
        return this.c;
    }
}
