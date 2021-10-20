package defpackage;

import defpackage.cg0;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import vigqyno.C0201;

/* renamed from: wg0  reason: default package */
/* compiled from: ResizeAndRotateProducer */
public class wg0 implements rg0<af0> {
    private final Executor a;
    private final r60 b;
    private final rg0<af0> c;
    private final boolean d;
    private final sh0 e;

    /* renamed from: wg0$a */
    /* compiled from: ResizeAndRotateProducer */
    private class a extends vf0<af0, af0> {
        public static final String a = null;
        public static final String b = null;
        private final boolean c;
        private final sh0 d;
        private final sg0 e;
        private boolean f = false;
        private final cg0 g;

        /* renamed from: wg0$a$a  reason: collision with other inner class name */
        /* compiled from: ResizeAndRotateProducer */
        class C0222a implements cg0.d {
            public C0222a(wg0 wg0) {
            }

            @Override // defpackage.cg0.d
            public void a(af0 af0, int i) {
                a aVar = a.this;
                rh0 createImageTranscoder = aVar.d.createImageTranscoder(af0.u(), a.this.c);
                z50.g(createImageTranscoder);
                aVar.w(af0, i, createImageTranscoder);
            }
        }

        /* renamed from: wg0$a$b */
        /* compiled from: ResizeAndRotateProducer */
        class b extends mf0 {
            public final /* synthetic */ sf0 a;

            public b(wg0 wg0, sf0 sf0) {
                this.a = sf0;
            }

            @Override // defpackage.tg0
            public void a() {
                a.this.g.c();
                a.this.f = true;
                this.a.b();
            }

            @Override // defpackage.mf0, defpackage.tg0
            public void b() {
                if (a.this.e.g()) {
                    a.this.g.h();
                }
            }
        }

        static {
            C0201.m83(a.class, 74);
        }

        public a(sf0<af0> sf0, sg0 sg0, boolean z, sh0 sh0) {
            super(sf0);
            this.e = sg0;
            Boolean n = sg0.c().n();
            this.c = n != null ? n.booleanValue() : z;
            this.d = sh0;
            this.g = new cg0(wg0.this.a, new C0222a(wg0.this), 100);
            this.e.d(new b(wg0.this, sf0));
        }

        private af0 A(af0 af0) {
            sd0 o = this.e.c().o();
            return (o.g() || !o.f()) ? af0 : y(af0, o.e());
        }

        private af0 B(af0 af0) {
            return (this.e.c().o().c() || af0.x() == 0 || af0.x() == -1) ? af0 : y(af0, 0);
        }

        /* JADX INFO: finally extract failed */
        /* access modifiers changed from: private */
        /* access modifiers changed from: public */
        private void w(af0 af0, int i, rh0 rh0) {
            ug0 f2 = this.e.f();
            String t = this.e.t();
            String str = a;
            f2.b(t, str);
            ih0 c2 = this.e.c();
            t60 a2 = wg0.this.b.a();
            try {
                qh0 c3 = rh0.c(af0, a2, c2.o(), c2.m(), null, 85);
                if (c3.a() != 2) {
                    Map<String, String> z = z(af0, c2.m(), c3, rh0.a());
                    v60 B = v60.B(a2.a());
                    try {
                        af0 af02 = new af0(B);
                        af02.T(nb0.a);
                        try {
                            af02.G();
                            this.e.f().i(this.e.t(), str, z);
                            if (c3.a() != 1) {
                                i |= 16;
                            }
                            p().d(af02, i);
                            af0.h(af02);
                            v60.s(B);
                        } catch (Throwable th) {
                            af0.h(af02);
                            throw th;
                        }
                    } catch (Throwable th2) {
                        v60.s(B);
                        throw th2;
                    }
                } else {
                    throw new RuntimeException(b);
                }
            } catch (Exception e2) {
                this.e.f().j(this.e.t(), str, e2, null);
                if (jf0.e(i)) {
                    p().a(e2);
                }
            } finally {
                a2.close();
            }
        }

        private void x(af0 af0, int i, ob0 ob0) {
            af0 af02;
            if (ob0 == nb0.a || ob0 == nb0.k) {
                af02 = B(af0);
            } else {
                af02 = A(af0);
            }
            p().d(af02, i);
        }

        private af0 y(af0 af0, int i) {
            af0 c2 = af0.c(af0);
            af0.close();
            if (c2 != null) {
                c2.U(i);
            }
            return c2;
        }

        private Map<String, String> z(af0 af0, rd0 rd0, qh0 qh0, String str) {
            String str2;
            if (!this.e.f().f(this.e.t())) {
                return null;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(af0.A());
            String r1 = C0201.m82(24184);
            sb.append(r1);
            sb.append(af0.s());
            String sb2 = sb.toString();
            if (rd0 != null) {
                str2 = rd0.a + r1 + rd0.b;
            } else {
                str2 = C0201.m82(24185);
            }
            HashMap hashMap = new HashMap();
            hashMap.put(C0201.m82(24186), String.valueOf(af0.u()));
            hashMap.put(C0201.m82(24187), sb2);
            hashMap.put(C0201.m82(24188), str2);
            hashMap.put(C0201.m82(24189), String.valueOf(this.g.f()));
            hashMap.put(C0201.m82(24190), str);
            hashMap.put(C0201.m82(24191), String.valueOf(qh0));
            return w50.a(hashMap);
        }

        /* renamed from: C */
        public void i(af0 af0, int i) {
            if (!this.f) {
                boolean e2 = jf0.e(i);
                if (af0 != null) {
                    ob0 u = af0.u();
                    ih0 c2 = this.e.c();
                    rh0 createImageTranscoder = this.d.createImageTranscoder(u, this.c);
                    z50.g(createImageTranscoder);
                    g70 h2 = wg0.h(c2, af0, createImageTranscoder);
                    if (!e2 && h2 == g70.UNSET) {
                        return;
                    }
                    if (h2 != g70.YES) {
                        x(af0, i, u);
                    } else if (this.g.k(af0, i)) {
                        if (e2 || this.e.g()) {
                            this.g.h();
                        }
                    }
                } else if (e2) {
                    p().d(null, 1);
                }
            }
        }
    }

    public wg0(Executor executor, r60 r60, rg0<af0> rg0, boolean z, sh0 sh0) {
        z50.g(executor);
        this.a = executor;
        z50.g(r60);
        this.b = r60;
        z50.g(rg0);
        this.c = rg0;
        z50.g(sh0);
        this.e = sh0;
        this.d = z;
    }

    private static boolean f(sd0 sd0, af0 af0) {
        return !sd0.c() && (th0.e(sd0, af0) != 0 || g(sd0, af0));
    }

    private static boolean g(sd0 sd0, af0 af0) {
        if (sd0.f() && !sd0.c()) {
            return th0.a.contains(Integer.valueOf(af0.p()));
        }
        af0.Q(0);
        return false;
    }

    /* access modifiers changed from: private */
    public static g70 h(ih0 ih0, af0 af0, rh0 rh0) {
        if (af0 == null || af0.u() == ob0.b) {
            return g70.UNSET;
        }
        if (!rh0.d(af0.u())) {
            return g70.NO;
        }
        return g70.b(f(ih0.o(), af0) || rh0.b(af0, ih0.o(), ih0.m()));
    }

    @Override // defpackage.rg0
    public void b(sf0<af0> sf0, sg0 sg0) {
        this.c.b(new a(sf0, sg0, this.d, this.e), sg0);
    }
}
