package defpackage;

import vigqyno.C0201;

/* renamed from: w33  reason: default package */
/* compiled from: RecipientKeyIdentifier */
public class w33 extends o03 {
    private q03 a;
    private k03 b;
    private q33 c;

    public w33(v03 v03) {
        this.a = q03.q(v03.t(0));
        int size = v03.size();
        if (size == 1) {
            return;
        }
        if (size != 2) {
            if (size == 3) {
                this.b = k03.t(v03.t(1));
                this.c = q33.g(v03.t(2));
                return;
            }
            throw new IllegalArgumentException(C0201.m82(17764));
        } else if (v03.t(1) instanceof k03) {
            this.b = k03.t(v03.t(1));
        } else {
            this.c = q33.g(v03.t(2));
        }
    }

    public static w33 g(Object obj) {
        if (obj instanceof w33) {
            return (w33) obj;
        }
        if (obj != null) {
            return new w33(v03.q(obj));
        }
        return null;
    }

    public static w33 i(b13 b13, boolean z) {
        return g(v03.r(b13, z));
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

    public q03 j() {
        return this.a;
    }
}
