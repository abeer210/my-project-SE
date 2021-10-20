package defpackage;

import java.util.Map;
import vigqyno.C0201;

/* renamed from: pg0  reason: default package */
/* compiled from: PostprocessedBitmapMemoryCacheProducer */
public class pg0 implements rg0<v60<ye0>> {
    private final gd0<m40, ye0> a;
    private final wc0 b;
    private final rg0<v60<ye0>> c;

    /* renamed from: pg0$a */
    /* compiled from: PostprocessedBitmapMemoryCacheProducer */
    public static class a extends vf0<v60<ye0>, v60<ye0>> {
        private final m40 c;
        private final boolean d;
        private final gd0<m40, ye0> e;
        private final boolean f;

        public a(sf0<v60<ye0>> sf0, m40 m40, boolean z, gd0<m40, ye0> gd0, boolean z2) {
            super(sf0);
            this.c = m40;
            this.d = z;
            this.e = gd0;
            this.f = z2;
        }

        /* renamed from: q */
        public void i(v60<ye0> v60, int i) {
            v60<ye0> v602 = null;
            if (v60 == null) {
                if (jf0.e(i)) {
                    p().d(v602, i);
                }
            } else if (!jf0.f(i) || this.d) {
                if (this.f) {
                    v602 = this.e.b(this.c, v60);
                }
                try {
                    p().c(1.0f);
                    sf0 p = p();
                    if (v602 != null) {
                        v60 = v602;
                    }
                    p.d(v60, i);
                } finally {
                    v60.s(v602);
                }
            }
        }
    }

    public pg0(gd0<m40, ye0> gd0, wc0 wc0, rg0<v60<ye0>> rg0) {
        this.a = gd0;
        this.b = wc0;
        this.c = rg0;
    }

    @Override // defpackage.rg0
    public void b(sf0<v60<ye0>> sf0, sg0 sg0) {
        ug0 f = sg0.f();
        String t = sg0.t();
        ih0 c2 = sg0.c();
        Object a2 = sg0.a();
        kh0 g = c2.g();
        if (g == null || g.c() == null) {
            this.c.b(sf0, sg0);
            return;
        }
        f.b(t, c());
        m40 c3 = this.b.c(c2, a2);
        v60<ye0> v60 = this.a.get(c3);
        String r3 = C0201.m82(26601);
        Map<String, String> map = null;
        if (v60 != null) {
            String c4 = c();
            if (f.f(t)) {
                map = w50.b(r3, C0201.m82(26602));
            }
            f.i(t, c4, map);
            f.e(t, C0201.m82(26603), true);
            sf0.c(1.0f);
            sf0.d(v60, 1);
            v60.close();
            return;
        }
        a aVar = new a(sf0, c3, g instanceof lh0, this.a, sg0.c().u());
        String c5 = c();
        if (f.f(t)) {
            map = w50.b(r3, C0201.m82(26604));
        }
        f.i(t, c5, map);
        this.c.b(aVar, sg0);
    }

    public String c() {
        return C0201.m82(26605);
    }
}
