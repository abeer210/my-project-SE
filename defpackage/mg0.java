package defpackage;

import android.os.SystemClock;
import defpackage.ng0;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;
import vigqyno.C0201;

/* renamed from: mg0  reason: default package */
/* compiled from: NetworkFetchProducer */
public class mg0 implements rg0<af0> {
    private final r60 a;
    private final k60 b;
    private final ng0 c;

    /* renamed from: mg0$a */
    /* compiled from: NetworkFetchProducer */
    class a implements ng0.a {
        public final /* synthetic */ ag0 a;

        public a(ag0 ag0) {
            this.a = ag0;
        }

        @Override // defpackage.ng0.a
        public void a(Throwable th) {
            mg0.this.k(this.a, th);
        }

        @Override // defpackage.ng0.a
        public void b() {
            mg0.this.j(this.a);
        }

        @Override // defpackage.ng0.a
        public void c(InputStream inputStream, int i) throws IOException {
            if (oh0.d()) {
                oh0.a(C0201.m82(15439));
            }
            mg0.this.l(this.a, inputStream, i);
            if (oh0.d()) {
                oh0.b();
            }
        }
    }

    public mg0(r60 r60, k60 k60, ng0 ng0) {
        this.a = r60;
        this.b = k60;
        this.c = ng0;
    }

    public static float e(int i, int i2) {
        if (i2 > 0) {
            return ((float) i) / ((float) i2);
        }
        double d = (double) (-i);
        Double.isNaN(d);
        return 1.0f - ((float) Math.exp(d / 50000.0d));
    }

    private Map<String, String> f(ag0 ag0, int i) {
        if (!ag0.e().f(ag0.c())) {
            return null;
        }
        return this.c.c(ag0, i);
    }

    public static void i(t60 t60, int i, nd0 nd0, sf0<af0> sf0) {
        Throwable th;
        v60 B = v60.B(t60.a());
        af0 af0 = null;
        try {
            af0 af02 = new af0(B);
            try {
                af02.P(nd0);
                af02.G();
                sf0.d(af02, i);
                af0.h(af02);
                v60.s(B);
            } catch (Throwable th2) {
                th = th2;
                af0 = af02;
                af0.h(af0);
                v60.s(B);
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            af0.h(af0);
            v60.s(B);
            throw th;
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void j(ag0 ag0) {
        ag0.e().d(ag0.c(), C0201.m82(7513), null);
        ag0.a().b();
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void k(ag0 ag0, Throwable th) {
        ug0 e = ag0.e();
        String c2 = ag0.c();
        String r2 = C0201.m82(7514);
        e.j(c2, r2, th, null);
        ag0.e().e(ag0.c(), r2, false);
        ag0.a().a(th);
    }

    private boolean m(ag0 ag0) {
        if (!ag0.b().g()) {
            return false;
        }
        return this.c.b(ag0);
    }

    @Override // defpackage.rg0
    public void b(sf0<af0> sf0, sg0 sg0) {
        sg0.f().b(sg0.t(), C0201.m82(7515));
        ag0 e = this.c.e(sf0, sg0);
        this.c.d(e, new a(e));
    }

    public void g(t60 t60, ag0 ag0) {
        Map<String, String> f = f(ag0, t60.size());
        ug0 e = ag0.e();
        String c2 = ag0.c();
        String r3 = C0201.m82(7516);
        e.i(c2, r3, f);
        e.e(ag0.c(), r3, true);
        i(t60, ag0.f() | 1, ag0.g(), ag0.a());
    }

    public void h(t60 t60, ag0 ag0) {
        long uptimeMillis = SystemClock.uptimeMillis();
        if (m(ag0) && uptimeMillis - ag0.d() >= 100) {
            ag0.i(uptimeMillis);
            ag0.e().h(ag0.c(), C0201.m82(7517), C0201.m82(7518));
            i(t60, ag0.f(), ag0.g(), ag0.a());
        }
    }

    public void l(ag0 ag0, InputStream inputStream, int i) throws IOException {
        t60 t60;
        if (i > 0) {
            t60 = this.a.e(i);
        } else {
            t60 = this.a.a();
        }
        byte[] bArr = (byte[]) this.b.get(16384);
        while (true) {
            try {
                int read = inputStream.read(bArr);
                if (read < 0) {
                    this.c.a(ag0, t60.size());
                    g(t60, ag0);
                    return;
                } else if (read > 0) {
                    t60.write(bArr, 0, read);
                    h(t60, ag0);
                    ag0.a().c(e(t60.size(), i));
                }
            } finally {
                this.b.a(bArr);
                t60.close();
            }
        }
    }
}
