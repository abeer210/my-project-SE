package defpackage;

import java.io.IOException;
import vigqyno.C0201;

/* renamed from: q43  reason: default package */
/* compiled from: Extension */
public class q43 extends o03 {
    public static final p03 d = new p03(C0201.m82(24014)).w();
    private p03 a;
    private boolean b;
    private q03 c;

    static {
        new p03(C0201.m82(24013)).w();
        new p03(C0201.m82(24015)).w();
        new p03(C0201.m82(24016)).w();
        new p03(C0201.m82(24017)).w();
        new p03(C0201.m82(24018)).w();
        new p03(C0201.m82(24019)).w();
        new p03(C0201.m82(24020)).w();
        new p03(C0201.m82(24021)).w();
        new p03(C0201.m82(24022)).w();
        new p03(C0201.m82(24023)).w();
        new p03(C0201.m82(24024)).w();
        new p03(C0201.m82(24025)).w();
        new p03(C0201.m82(24026)).w();
        new p03(C0201.m82(24027)).w();
        new p03(C0201.m82(24028)).w();
        new p03(C0201.m82(24029)).w();
        new p03(C0201.m82(24030)).w();
        new p03(C0201.m82(24031)).w();
        new p03(C0201.m82(24032)).w();
        new p03(C0201.m82(24033)).w();
        new p03(C0201.m82(24034)).w();
        new p03(C0201.m82(24035)).w();
        new p03(C0201.m82(24036)).w();
        new p03(C0201.m82(24037)).w();
        new p03(C0201.m82(24038)).w();
        new p03(C0201.m82(24039)).w();
        new p03(C0201.m82(24040)).w();
        new p03(C0201.m82(24041)).w();
        new p03(C0201.m82(24042)).w();
        new p03(C0201.m82(24043)).w();
        new p03(C0201.m82(24044)).w();
    }

    private q43(v03 v03) {
        if (v03.size() == 2) {
            this.a = p03.v(v03.t(0));
            this.b = false;
            this.c = q03.q(v03.t(1));
        } else if (v03.size() == 3) {
            this.a = p03.v(v03.t(0));
            this.b = e03.r(v03.t(1)).t();
            this.c = q03.q(v03.t(2));
        } else {
            throw new IllegalArgumentException(C0201.m82(24045) + v03.size());
        }
    }

    private static u03 g(q43 q43) throws IllegalArgumentException {
        try {
            return u03.k(q43.j().s());
        } catch (IOException e) {
            throw new IllegalArgumentException(C0201.m82(24046) + e);
        }
    }

    public static q43 k(Object obj) {
        if (obj instanceof q43) {
            return (q43) obj;
        }
        if (obj != null) {
            return new q43(v03.q(obj));
        }
        return null;
    }

    @Override // defpackage.o03, defpackage.g03
    public u03 b() {
        h03 h03 = new h03();
        h03.a(this.a);
        if (this.b) {
            h03.a(e03.s(true));
        }
        h03.a(this.c);
        return new e23(h03);
    }

    @Override // defpackage.o03
    public boolean equals(Object obj) {
        if (!(obj instanceof q43)) {
            return false;
        }
        q43 q43 = (q43) obj;
        if (!q43.i().equals(i()) || !q43.j().equals(j()) || q43.o() != o()) {
            return false;
        }
        return true;
    }

    @Override // defpackage.o03
    public int hashCode() {
        if (o()) {
            return j().hashCode() ^ i().hashCode();
        }
        return (j().hashCode() ^ i().hashCode()) ^ -1;
    }

    public p03 i() {
        return this.a;
    }

    public q03 j() {
        return this.c;
    }

    public g03 l() {
        return g(this);
    }

    public boolean o() {
        return this.b;
    }
}
