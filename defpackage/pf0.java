package defpackage;

import defpackage.ih0;
import java.util.Map;
import vigqyno.C0201;

/* renamed from: pf0  reason: default package */
/* compiled from: BitmapMemoryCacheProducer */
public class pf0 implements rg0<v60<ye0>> {
    private final gd0<m40, ye0> a;
    private final wc0 b;
    private final rg0<v60<ye0>> c;

    /* access modifiers changed from: package-private */
    /* renamed from: pf0$a */
    /* compiled from: BitmapMemoryCacheProducer */
    public class a extends vf0<v60<ye0>, v60<ye0>> {
        public final /* synthetic */ m40 c;
        public final /* synthetic */ boolean d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(sf0 sf0, m40 m40, boolean z) {
            super(sf0);
            this.c = m40;
            this.d = z;
        }

        /* renamed from: q */
        public void i(v60<ye0> v60, int i) {
            v60 v602;
            try {
                if (oh0.d()) {
                    oh0.a(C0201.m82(24172));
                }
                boolean e2 = jf0.e(i);
                v60<ye0> v603 = null;
                if (v60 == null) {
                    if (e2) {
                        p().d(null, i);
                    }
                } else if (v60.w().m() || jf0.n(i, 8)) {
                    p().d(v60, i);
                    if (oh0.d()) {
                        oh0.b();
                    }
                } else {
                    if (!e2 && (v602 = pf0.this.a.get(this.c)) != null) {
                        try {
                            df0 h = v60.w().h();
                            df0 h2 = ((ye0) v602.w()).h();
                            if (h2.a() || h2.c() >= h.c()) {
                                p().d(v602, i);
                                v60.s(v602);
                                if (oh0.d()) {
                                    oh0.b();
                                    return;
                                }
                                return;
                            }
                        } finally {
                            v60.s(v602);
                        }
                    }
                    if (this.d) {
                        v603 = pf0.this.a.b(this.c, v60);
                    }
                    if (e2) {
                        try {
                            p().c(1.0f);
                        } catch (Throwable th) {
                            v60.s(v603);
                            throw th;
                        }
                    }
                    sf0 p = p();
                    if (v603 != null) {
                        v60 = v603;
                    }
                    p.d(v60, i);
                    v60.s(v603);
                    if (oh0.d()) {
                        oh0.b();
                    }
                }
            } finally {
                if (oh0.d()) {
                    oh0.b();
                }
            }
        }
    }

    public pf0(gd0<m40, ye0> gd0, wc0 wc0, rg0<v60<ye0>> rg0) {
        this.a = gd0;
        this.b = wc0;
        this.c = rg0;
    }

    @Override // defpackage.rg0
    public void b(sf0<v60<ye0>> sf0, sg0 sg0) {
        boolean d;
        try {
            if (oh0.d()) {
                oh0.a(C0201.m82(28224));
            }
            ug0 f = sg0.f();
            String t = sg0.t();
            f.b(t, d());
            m40 a2 = this.b.a(sg0.c(), sg0.a());
            v60<ye0> v60 = this.a.get(a2);
            String r5 = C0201.m82(28225);
            Map<String, String> map = null;
            if (v60 != null) {
                boolean a3 = v60.w().h().a();
                if (a3) {
                    f.i(t, d(), f.f(t) ? w50.b(r5, C0201.m82(28226)) : null);
                    f.e(t, d(), true);
                    sf0.c(1.0f);
                }
                jf0.l(a3);
                sf0.d(v60, a3 ? 1 : 0);
                v60.close();
                if (a3) {
                    if (!d) {
                        return;
                    }
                    return;
                }
            }
            int d2 = sg0.h().d();
            int d3 = ih0.b.BITMAP_MEMORY_CACHE.d();
            String r8 = C0201.m82(28227);
            if (d2 >= d3) {
                f.i(t, d(), f.f(t) ? w50.b(r5, r8) : null);
                f.e(t, d(), false);
                sf0.d(null, 1);
                if (oh0.d()) {
                    oh0.b();
                    return;
                }
                return;
            }
            sf0<v60<ye0>> e = e(sf0, a2, sg0.c().u());
            String d4 = d();
            if (f.f(t)) {
                map = w50.b(r5, r8);
            }
            f.i(t, d4, map);
            if (oh0.d()) {
                oh0.a(C0201.m82(28228));
            }
            this.c.b(e, sg0);
            if (oh0.d()) {
                oh0.b();
            }
            if (oh0.d()) {
                oh0.b();
            }
        } finally {
            if (oh0.d()) {
                oh0.b();
            }
        }
    }

    public String d() {
        return C0201.m82(28229);
    }

    public sf0<v60<ye0>> e(sf0<v60<ye0>> sf0, m40 m40, boolean z) {
        return new a(sf0, m40, z);
    }
}
