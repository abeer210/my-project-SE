package defpackage;

import com.facebook.imagepipeline.nativecode.e;
import com.facebook.imagepipeline.nativecode.f;
import java.io.InputStream;
import java.util.concurrent.Executor;
import vigqyno.C0201;

/* renamed from: gh0  reason: default package */
/* compiled from: WebpTranscodeProducer */
public class gh0 implements rg0<af0> {
    private final Executor a;
    private final r60 b;
    private final rg0<af0> c;

    /* access modifiers changed from: package-private */
    /* renamed from: gh0$a */
    /* compiled from: WebpTranscodeProducer */
    public class a extends yg0<af0> {
        public final /* synthetic */ af0 f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(sf0 sf0, ug0 ug0, String str, String str2, af0 af0) {
            super(sf0, ug0, str, str2);
            this.f = af0;
        }

        @Override // defpackage.yg0, defpackage.m50
        public void d() {
            af0.h(this.f);
            super.d();
        }

        @Override // defpackage.yg0, defpackage.m50
        public void e(Exception exc) {
            af0.h(this.f);
            super.e(exc);
        }

        /* renamed from: j */
        public void b(af0 af0) {
            af0.h(af0);
        }

        /* JADX INFO: finally extract failed */
        /* renamed from: k */
        public af0 c() throws Exception {
            t60 a = gh0.this.b.a();
            try {
                gh0.g(this.f, a);
                v60 B = v60.B(a.a());
                try {
                    af0 af0 = new af0(B);
                    af0.k(this.f);
                    v60.s(B);
                    return af0;
                } catch (Throwable th) {
                    v60.s(B);
                    throw th;
                }
            } finally {
                a.close();
            }
        }

        /* renamed from: l */
        public void f(af0 af0) {
            af0.h(this.f);
            super.f(af0);
        }
    }

    /* renamed from: gh0$b */
    /* compiled from: WebpTranscodeProducer */
    private class b extends vf0<af0, af0> {
        private final sg0 c;
        private g70 d = g70.UNSET;

        public b(sf0<af0> sf0, sg0 sg0) {
            super(sf0);
            this.c = sg0;
        }

        /* renamed from: q */
        public void i(af0 af0, int i) {
            if (this.d == g70.UNSET && af0 != null) {
                this.d = gh0.h(af0);
            }
            if (this.d == g70.NO) {
                p().d(af0, i);
            } else if (!jf0.e(i)) {
            } else {
                if (this.d != g70.YES || af0 == null) {
                    p().d(af0, i);
                } else {
                    gh0.this.i(af0, p(), this.c);
                }
            }
        }
    }

    public gh0(Executor executor, r60 r60, rg0<af0> rg0) {
        z50.g(executor);
        this.a = executor;
        z50.g(r60);
        this.b = r60;
        z50.g(rg0);
        this.c = rg0;
    }

    /* access modifiers changed from: private */
    public static void g(af0 af0, t60 t60) throws Exception {
        InputStream w = af0.w();
        ob0 c2 = pb0.c(w);
        if (c2 == nb0.f || c2 == nb0.h) {
            f.a().a(w, t60, 80);
            af0.T(nb0.a);
        } else if (c2 == nb0.g || c2 == nb0.i) {
            f.a().b(w, t60);
            af0.T(nb0.b);
        } else {
            throw new IllegalArgumentException(C0201.m82(18000));
        }
    }

    /* access modifiers changed from: private */
    public static g70 h(af0 af0) {
        z50.g(af0);
        ob0 c2 = pb0.c(af0.w());
        if (nb0.a(c2)) {
            e a2 = f.a();
            if (a2 == null) {
                return g70.NO;
            }
            return g70.b(!a2.c(c2));
        } else if (c2 == ob0.b) {
            return g70.UNSET;
        } else {
            return g70.NO;
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void i(af0 af0, sf0<af0> sf0, sg0 sg0) {
        z50.g(af0);
        af0 c2 = af0.c(af0);
        this.a.execute(new a(sf0, sg0.f(), C0201.m82(18001), sg0.t(), c2));
    }

    @Override // defpackage.rg0
    public void b(sf0<af0> sf0, sg0 sg0) {
        this.c.b(new b(sf0, sg0), sg0);
    }
}
