package defpackage;

import defpackage.ih0;

/* renamed from: xf0  reason: default package */
/* compiled from: DiskCacheWriteProducer */
public class xf0 implements rg0<af0> {
    private final vc0 a;
    private final vc0 b;
    private final wc0 c;
    private final rg0<af0> d;

    /* access modifiers changed from: private */
    /* renamed from: xf0$b */
    /* compiled from: DiskCacheWriteProducer */
    public static class b extends vf0<af0, af0> {
        private final sg0 c;
        private final vc0 d;
        private final vc0 e;
        private final wc0 f;

        /* renamed from: q */
        public void i(af0 af0, int i) {
            if (jf0.f(i) || af0 == null || jf0.m(i, 10) || af0.u() == ob0.b) {
                p().d(af0, i);
                return;
            }
            ih0 c2 = this.c.c();
            m40 d2 = this.f.d(c2, this.c.a());
            if (c2.c() == ih0.a.SMALL) {
                this.e.o(d2, af0);
            } else {
                this.d.o(d2, af0);
            }
            p().d(af0, i);
        }

        private b(sf0<af0> sf0, sg0 sg0, vc0 vc0, vc0 vc02, wc0 wc0) {
            super(sf0);
            this.c = sg0;
            this.d = vc0;
            this.e = vc02;
            this.f = wc0;
        }
    }

    public xf0(vc0 vc0, vc0 vc02, wc0 wc0, rg0<af0> rg0) {
        this.a = vc0;
        this.b = vc02;
        this.c = wc0;
        this.d = rg0;
    }

    private void c(sf0<af0> sf0, sg0 sg0) {
        if (sg0.h().d() >= ih0.b.DISK_CACHE.d()) {
            sf0.d(null, 1);
            return;
        }
        if (sg0.c().t()) {
            sf0 = new b(sf0, sg0, this.a, this.b, this.c);
        }
        this.d.b(sf0, sg0);
    }

    @Override // defpackage.rg0
    public void b(sf0<af0> sf0, sg0 sg0) {
        c(sf0, sg0);
    }
}
