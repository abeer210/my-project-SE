package defpackage;

/* renamed from: rf0  reason: default package */
/* compiled from: BranchOnSeparateImagesProducer */
public class rf0 implements rg0<af0> {
    private final rg0<af0> a;
    private final rg0<af0> b;

    /* renamed from: rf0$b */
    /* compiled from: BranchOnSeparateImagesProducer */
    private class b extends vf0<af0, af0> {
        private sg0 c;

        @Override // defpackage.vf0, defpackage.jf0
        public void h(Throwable th) {
            rf0.this.b.b(p(), this.c);
        }

        /* renamed from: q */
        public void i(af0 af0, int i) {
            ih0 c2 = this.c.c();
            boolean e = jf0.e(i);
            boolean c3 = fh0.c(af0, c2.m());
            if (af0 != null && (c3 || c2.e())) {
                if (!e || !c3) {
                    p().d(af0, jf0.o(i, 1));
                } else {
                    p().d(af0, i);
                }
            }
            if (e && !c3) {
                af0.h(af0);
                rf0.this.b.b(p(), this.c);
            }
        }

        private b(sf0<af0> sf0, sg0 sg0) {
            super(sf0);
            this.c = sg0;
        }
    }

    public rf0(rg0<af0> rg0, rg0<af0> rg02) {
        this.a = rg0;
        this.b = rg02;
    }

    @Override // defpackage.rg0
    public void b(sf0<af0> sf0, sg0 sg0) {
        this.a.b(new b(sf0, sg0), sg0);
    }
}
