package defpackage;

import android.net.Uri;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;
import vigqyno.C0201;

/* renamed from: og0  reason: default package */
/* compiled from: PartialDiskCacheProducer */
public class og0 implements rg0<af0> {
    private final vc0 a;
    private final wc0 b;
    private final r60 c;
    private final k60 d;
    private final rg0<af0> e;

    /* access modifiers changed from: package-private */
    /* renamed from: og0$a */
    /* compiled from: PartialDiskCacheProducer */
    public class a implements t7<af0, Void> {
        public final /* synthetic */ ug0 a;
        public final /* synthetic */ String b;
        public final /* synthetic */ sf0 c;
        public final /* synthetic */ sg0 d;
        public final /* synthetic */ m40 e;

        public a(ug0 ug0, String str, sf0 sf0, sg0 sg0, m40 m40) {
            this.a = ug0;
            this.b = str;
            this.c = sf0;
            this.d = sg0;
            this.e = m40;
        }

        /* renamed from: b */
        public Void a(v7<af0> v7Var) throws Exception {
            boolean g = og0.g(v7Var);
            String r2 = C0201.m82(26774);
            if (g) {
                this.a.d(this.b, r2, null);
                this.c.b();
            } else if (v7Var.n()) {
                this.a.j(this.b, r2, v7Var.i(), null);
                og0.this.i(this.c, this.d, this.e, null);
            } else {
                af0 j = v7Var.j();
                if (j != null) {
                    ug0 ug0 = this.a;
                    String str = this.b;
                    ug0.i(str, r2, og0.f(ug0, str, true, j.z()));
                    nd0 e2 = nd0.e(j.z() - 1);
                    j.P(e2);
                    int z = j.z();
                    ih0 c2 = this.d.c();
                    if (e2.a(c2.b())) {
                        this.a.e(this.b, r2, true);
                        this.c.d(j, 9);
                    } else {
                        this.c.d(j, 8);
                        jh0 b2 = jh0.b(c2);
                        b2.t(nd0.b(z - 1));
                        og0.this.i(this.c, new xg0(b2.a(), this.d), this.e, j);
                    }
                } else {
                    ug0 ug02 = this.a;
                    String str2 = this.b;
                    ug02.i(str2, r2, og0.f(ug02, str2, false, 0));
                    og0.this.i(this.c, this.d, this.e, j);
                }
            }
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: og0$b */
    /* compiled from: PartialDiskCacheProducer */
    public class b extends mf0 {
        public final /* synthetic */ AtomicBoolean a;

        public b(og0 og0, AtomicBoolean atomicBoolean) {
            this.a = atomicBoolean;
        }

        @Override // defpackage.tg0
        public void a() {
            this.a.set(true);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: og0$c */
    /* compiled from: PartialDiskCacheProducer */
    public static class c extends vf0<af0, af0> {
        private final vc0 c;
        private final m40 d;
        private final r60 e;
        private final k60 f;
        private final af0 g;

        public /* synthetic */ c(sf0 sf0, vc0 vc0, m40 m40, r60 r60, k60 k60, af0 af0, a aVar) {
            this(sf0, vc0, m40, r60, k60, af0);
        }

        private void q(InputStream inputStream, OutputStream outputStream, int i) throws IOException {
            byte[] bArr = (byte[]) this.f.get(16384);
            int i2 = i;
            while (i2 > 0) {
                try {
                    int read = inputStream.read(bArr, 0, Math.min(16384, i2));
                    if (read < 0) {
                        break;
                    } else if (read > 0) {
                        outputStream.write(bArr, 0, read);
                        i2 -= read;
                    }
                } catch (Throwable th) {
                    this.f.a(bArr);
                    throw th;
                }
            }
            this.f.a(bArr);
            if (i2 > 0) {
                throw new IOException(String.format(null, C0201.m82(26853), Integer.valueOf(i), Integer.valueOf(i2)));
            }
        }

        private t60 r(af0 af0, af0 af02) throws IOException {
            t60 e2 = this.e.e(af02.z() + af02.n().a);
            q(af0.w(), e2, af02.n().a);
            q(af02.w(), e2, af02.z());
            return e2;
        }

        private void t(t60 t60) {
            af0 af0;
            Throwable th;
            v60 B = v60.B(t60.a());
            try {
                af0 = new af0(B);
                try {
                    af0.G();
                    p().d(af0, 1);
                    af0.h(af0);
                    v60.s(B);
                } catch (Throwable th2) {
                    th = th2;
                    af0.h(af0);
                    v60.s(B);
                    throw th;
                }
            } catch (Throwable th3) {
                af0 = null;
                th = th3;
                af0.h(af0);
                v60.s(B);
                throw th;
            }
        }

        /* renamed from: s */
        public void i(af0 af0, int i) {
            if (!jf0.f(i)) {
                if (this.g != null && af0.n() != null) {
                    try {
                        t(r(this.g, af0));
                    } catch (IOException e2) {
                        f60.j(C0201.m82(26854), C0201.m82(26855), e2);
                        p().a(e2);
                    } catch (Throwable th) {
                        af0.close();
                        this.g.close();
                        throw th;
                    }
                    af0.close();
                    this.g.close();
                    this.c.q(this.d);
                } else if (!jf0.n(i, 8) || !jf0.e(i) || af0.u() == ob0.b) {
                    p().d(af0, i);
                } else {
                    this.c.o(this.d, af0);
                    p().d(af0, i);
                }
            }
        }

        private c(sf0<af0> sf0, vc0 vc0, m40 m40, r60 r60, k60 k60, af0 af0) {
            super(sf0);
            this.c = vc0;
            this.d = m40;
            this.e = r60;
            this.f = k60;
            this.g = af0;
        }
    }

    public og0(vc0 vc0, wc0 wc0, r60 r60, k60 k60, rg0<af0> rg0) {
        this.a = vc0;
        this.b = wc0;
        this.c = r60;
        this.d = k60;
        this.e = rg0;
    }

    private static Uri e(ih0 ih0) {
        return ih0.q().buildUpon().appendQueryParameter(C0201.m82(36531), C0201.m82(36532)).build();
    }

    public static Map<String, String> f(ug0 ug0, String str, boolean z, int i) {
        if (!ug0.f(str)) {
            return null;
        }
        String r0 = C0201.m82(36533);
        if (!z) {
            return w50.b(r0, String.valueOf(z));
        }
        return w50.c(r0, String.valueOf(z), C0201.m82(36534), String.valueOf(i));
    }

    /* access modifiers changed from: private */
    public static boolean g(v7<?> v7Var) {
        return v7Var.l() || (v7Var.n() && (v7Var.i() instanceof CancellationException));
    }

    private t7<af0, Void> h(sf0<af0> sf0, sg0 sg0, m40 m40) {
        return new a(sg0.f(), sg0.t(), sf0, sg0, m40);
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void i(sf0<af0> sf0, sg0 sg0, m40 m40, af0 af0) {
        this.e.b(new c(sf0, this.a, m40, this.c, this.d, af0, null), sg0);
    }

    private void j(AtomicBoolean atomicBoolean, sg0 sg0) {
        sg0.d(new b(this, atomicBoolean));
    }

    @Override // defpackage.rg0
    public void b(sf0<af0> sf0, sg0 sg0) {
        ih0 c2 = sg0.c();
        if (!c2.t()) {
            this.e.b(sf0, sg0);
            return;
        }
        sg0.f().b(sg0.t(), C0201.m82(36535));
        m40 b2 = this.b.b(c2, e(c2), sg0.a());
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        this.a.m(b2, atomicBoolean).e(h(sf0, sg0, b2));
        j(atomicBoolean, sg0);
    }
}
