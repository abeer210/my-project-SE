package defpackage;

import defpackage.ih0;
import java.util.Map;
import vigqyno.C0201;

/* renamed from: zf0  reason: default package */
/* compiled from: EncodedMemoryCacheProducer */
public class zf0 implements rg0<af0> {
    private final gd0<m40, q60> a;
    private final wc0 b;
    private final rg0<af0> c;

    /* renamed from: zf0$a */
    /* compiled from: EncodedMemoryCacheProducer */
    private static class a extends vf0<af0, af0> {
        private final gd0<m40, q60> c;
        private final m40 d;
        private final boolean e;

        public a(sf0<af0> sf0, gd0<m40, q60> gd0, m40 m40, boolean z) {
            super(sf0);
            this.c = gd0;
            this.d = m40;
            this.e = z;
        }

        /* JADX INFO: finally extract failed */
        /* renamed from: q */
        public void i(af0 af0, int i) {
            try {
                if (oh0.d()) {
                    oh0.a(C0201.m82(19874));
                }
                if (!jf0.f(i) && af0 != null && !jf0.m(i, 10)) {
                    if (af0.u() != ob0.b) {
                        v60<q60> m = af0.m();
                        if (m != null) {
                            v60<q60> v60 = null;
                            try {
                                if (this.e) {
                                    v60 = this.c.b(this.d, m);
                                }
                                if (v60 != null) {
                                    try {
                                        af0 af02 = new af0(v60);
                                        af02.k(af0);
                                        try {
                                            p().c(1.0f);
                                            p().d(af02, i);
                                            af0.h(af02);
                                            if (oh0.d()) {
                                                oh0.b();
                                                return;
                                            }
                                            return;
                                        } catch (Throwable th) {
                                            af0.h(af02);
                                            throw th;
                                        }
                                    } finally {
                                        v60.s(v60);
                                    }
                                }
                            } finally {
                                v60.s(m);
                            }
                        }
                        p().d(af0, i);
                        if (oh0.d()) {
                            oh0.b();
                            return;
                        }
                        return;
                    }
                }
                p().d(af0, i);
            } finally {
                if (oh0.d()) {
                    oh0.b();
                }
            }
        }
    }

    public zf0(gd0<m40, q60> gd0, wc0 wc0, rg0<af0> rg0) {
        this.a = gd0;
        this.b = wc0;
        this.c = rg0;
    }

    /* JADX INFO: finally extract failed */
    @Override // defpackage.rg0
    public void b(sf0<af0> sf0, sg0 sg0) {
        String r0 = C0201.m82(30530);
        try {
            if (oh0.d()) {
                oh0.a(C0201.m82(30531));
            }
            String t = sg0.t();
            ug0 f = sg0.f();
            f.b(t, r0);
            m40 d = this.b.d(sg0.c(), sg0.a());
            v60<q60> v60 = this.a.get(d);
            String r6 = C0201.m82(30532);
            Map<String, String> map = null;
            if (v60 != null) {
                try {
                    af0 af0 = new af0(v60);
                    try {
                        if (f.f(t)) {
                            map = w50.b(r6, C0201.m82(30533));
                        }
                        f.i(t, r0, map);
                        f.e(t, r0, true);
                        sf0.c(1.0f);
                        sf0.d(af0, 1);
                        af0.h(af0);
                        v60.s(v60);
                    } catch (Throwable th) {
                        af0.h(af0);
                        throw th;
                    }
                } catch (Throwable th2) {
                    v60.s(v60);
                    throw th2;
                }
            } else {
                int d2 = sg0.h().d();
                int d3 = ih0.b.ENCODED_MEMORY_CACHE.d();
                String r10 = C0201.m82(30534);
                if (d2 >= d3) {
                    f.i(t, r0, f.f(t) ? w50.b(r6, r10) : null);
                    f.e(t, r0, false);
                    sf0.d(null, 1);
                    v60.s(v60);
                    if (oh0.d()) {
                        oh0.b();
                        return;
                    }
                    return;
                }
                a aVar = new a(sf0, this.a, d, sg0.c().u());
                if (f.f(t)) {
                    map = w50.b(r6, r10);
                }
                f.i(t, r0, map);
                this.c.b(aVar, sg0);
                v60.s(v60);
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
