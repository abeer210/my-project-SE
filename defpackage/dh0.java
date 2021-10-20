package defpackage;

/* renamed from: dh0  reason: default package */
/* compiled from: ThumbnailBranchProducer */
public class dh0 implements rg0<af0> {
    private final eh0<af0>[] a;

    /* access modifiers changed from: private */
    /* renamed from: dh0$a */
    /* compiled from: ThumbnailBranchProducer */
    public class a extends vf0<af0, af0> {
        private final sg0 c;
        private final int d;
        private final rd0 e;

        public a(sf0<af0> sf0, sg0 sg0, int i) {
            super(sf0);
            this.c = sg0;
            this.d = i;
            this.e = sg0.c().m();
        }

        @Override // defpackage.vf0, defpackage.jf0
        public void h(Throwable th) {
            if (!dh0.this.e(this.d + 1, p(), this.c)) {
                p().a(th);
            }
        }

        /* renamed from: q */
        public void i(af0 af0, int i) {
            if (af0 != null && (jf0.f(i) || fh0.c(af0, this.e))) {
                p().d(af0, i);
            } else if (jf0.e(i)) {
                af0.h(af0);
                if (!dh0.this.e(this.d + 1, p(), this.c)) {
                    p().d(null, 1);
                }
            }
        }
    }

    public dh0(eh0<af0>... eh0Arr) {
        z50.g(eh0Arr);
        eh0<af0>[] eh0Arr2 = eh0Arr;
        this.a = eh0Arr2;
        z50.e(0, eh0Arr2.length);
    }

    private int d(int i, rd0 rd0) {
        while (true) {
            eh0<af0>[] eh0Arr = this.a;
            if (i >= eh0Arr.length) {
                return -1;
            }
            if (eh0Arr[i].a(rd0)) {
                return i;
            }
            i++;
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private boolean e(int i, sf0<af0> sf0, sg0 sg0) {
        int d = d(i, sg0.c().m());
        if (d == -1) {
            return false;
        }
        this.a[d].b(new a(sf0, sg0, d), sg0);
        return true;
    }

    @Override // defpackage.rg0
    public void b(sf0<af0> sf0, sg0 sg0) {
        if (sg0.c().m() == null) {
            sf0.d(null, 1);
        } else if (!e(0, sf0, sg0)) {
            sf0.d(null, 1);
        }
    }
}
