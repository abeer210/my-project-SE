package defpackage;

import vigqyno.C0201;

/* renamed from: p43  reason: default package */
/* compiled from: Certificate */
public class p43 extends o03 {
    public v03 a;
    public u43 b;

    private p43(v03 v03) {
        this.a = v03;
        if (v03.size() == 3) {
            this.b = u43.i(v03.t(0));
            o43.i(v03.t(1));
            r13.w(v03.t(2));
            return;
        }
        throw new IllegalArgumentException(C0201.m82(26675));
    }

    public static p43 g(Object obj) {
        if (obj instanceof p43) {
            return (p43) obj;
        }
        if (obj != null) {
            return new p43(v03.q(obj));
        }
        return null;
    }

    @Override // defpackage.o03, defpackage.g03
    public u03 b() {
        return this.a;
    }

    public j43 i() {
        return this.b.j();
    }

    public m03 j() {
        return this.b.k();
    }

    public t43 k() {
        return this.b.l();
    }

    public u43 l() {
        return this.b;
    }
}
