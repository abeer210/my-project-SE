package defpackage;

import vigqyno.C0201;

/* renamed from: nw2  reason: default package */
/* compiled from: FunctionReference */
public class nw2 extends hw2 implements mw2, cx2 {
    public nw2(int i) {
    }

    @Override // defpackage.hw2
    public zw2 c() {
        qw2.a(this);
        return this;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof nw2) {
            nw2 nw2 = (nw2) obj;
            if (f() != null ? f().equals(nw2.f()) : nw2.f() == null) {
                if (!e().equals(nw2.e()) || !g().equals(nw2.g()) || !ow2.a(d(), nw2.d())) {
                    return false;
                }
                return true;
            }
            return false;
        } else if (obj instanceof cx2) {
            return obj.equals(b());
        } else {
            return false;
        }
    }

    public int hashCode() {
        return (((f() == null ? 0 : f().hashCode() * 31) + e().hashCode()) * 31) + g().hashCode();
    }

    public String toString() {
        zw2 b = b();
        if (b != this) {
            return b.toString();
        }
        if (C0201.m82(2659).equals(e())) {
            return C0201.m82(2660);
        }
        return C0201.m82(2661) + e() + C0201.m82(2662);
    }
}
