package defpackage;

import vigqyno.C0201;

/* renamed from: i33  reason: default package */
/* compiled from: KEKIdentifier */
public class i33 extends o03 {
    private q03 a;
    private k03 b;
    private q33 c;

    private i33(v03 v03) {
        this.a = (q03) v03.t(0);
        int size = v03.size();
        if (size == 1) {
            return;
        }
        if (size != 2) {
            if (size == 3) {
                this.b = (k03) v03.t(1);
                this.c = q33.g(v03.t(2));
                return;
            }
            throw new IllegalArgumentException(C0201.m82(38825));
        } else if (v03.t(1) instanceof k03) {
            this.b = (k03) v03.t(1);
        } else {
            this.c = q33.g(v03.t(1));
        }
    }

    public static i33 g(Object obj) {
        if (obj == null || (obj instanceof i33)) {
            return (i33) obj;
        }
        if (obj instanceof v03) {
            return new i33((v03) obj);
        }
        throw new IllegalArgumentException(C0201.m82(38826) + obj.getClass().getName());
    }

    @Override // defpackage.o03, defpackage.g03
    public u03 b() {
        h03 h03 = new h03();
        h03.a(this.a);
        k03 k03 = this.b;
        if (k03 != null) {
            h03.a(k03);
        }
        q33 q33 = this.c;
        if (q33 != null) {
            h03.a(q33);
        }
        return new e23(h03);
    }

    public q03 i() {
        return this.a;
    }
}
