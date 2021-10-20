package defpackage;

import android.graphics.Bitmap;
import defpackage.cg0;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import vigqyno.C0201;

/* renamed from: uf0  reason: default package */
/* compiled from: DecodeProducer */
public class uf0 implements rg0<v60<ye0>> {
    private final k60 a;
    private final Executor b;
    private final qe0 c;
    private final se0 d;
    private final rg0<af0> e;
    private final boolean f;
    private final boolean g;
    private final boolean h;
    private final int i;
    private final ud0 j;

    /* renamed from: uf0$a */
    /* compiled from: DecodeProducer */
    private class a extends c {
        public a(uf0 uf0, sf0<v60<ye0>> sf0, sg0 sg0, boolean z, int i) {
            super(sf0, sg0, z, i);
        }

        @Override // defpackage.uf0.c
        public synchronized boolean E(af0 af0, int i) {
            if (jf0.f(i)) {
                return false;
            }
            return super.E(af0, i);
        }

        @Override // defpackage.uf0.c
        public int w(af0 af0) {
            return af0.z();
        }

        @Override // defpackage.uf0.c
        public df0 x() {
            return cf0.d(0, false, false);
        }
    }

    /* renamed from: uf0$b */
    /* compiled from: DecodeProducer */
    private class b extends c {
        private final te0 i;
        private final se0 j;
        private int k = 0;

        public b(uf0 uf0, sf0<v60<ye0>> sf0, sg0 sg0, te0 te0, se0 se0, boolean z, int i2) {
            super(sf0, sg0, z, i2);
            z50.g(te0);
            this.i = te0;
            z50.g(se0);
            this.j = se0;
        }

        @Override // defpackage.uf0.c
        public synchronized boolean E(af0 af0, int i2) {
            boolean E = super.E(af0, i2);
            if ((jf0.f(i2) || jf0.n(i2, 8)) && !jf0.n(i2, 4) && af0.F(af0) && af0.u() == nb0.a) {
                if (!this.i.g(af0)) {
                    return false;
                }
                int d = this.i.d();
                if (d <= this.k) {
                    return false;
                }
                if (d < this.j.b(this.k) && !this.i.e()) {
                    return false;
                }
                this.k = d;
            }
            return E;
        }

        @Override // defpackage.uf0.c
        public int w(af0 af0) {
            return this.i.c();
        }

        @Override // defpackage.uf0.c
        public df0 x() {
            return this.j.a(this.i.d());
        }
    }

    /* renamed from: uf0$c */
    /* compiled from: DecodeProducer */
    private abstract class c extends vf0<af0, v60<ye0>> {
        public static final String a = null;
        public static final String b = null;
        public static final String l = null;
        public static final String m = null;
        public static final String n = null;
        private final sg0 c;
        private final ug0 d;
        private final od0 e;
        private boolean f = false;
        private final cg0 g;

        /* renamed from: uf0$c$a */
        /* compiled from: DecodeProducer */
        class a implements cg0.d {
            public final /* synthetic */ sg0 a;
            public final /* synthetic */ int b;

            public a(uf0 uf0, sg0 sg0, int i) {
                this.a = sg0;
                this.b = i;
            }

            @Override // defpackage.cg0.d
            public void a(af0 af0, int i) {
                if (af0 != null) {
                    if (uf0.this.f || !jf0.n(i, 16)) {
                        ih0 c2 = this.a.c();
                        if (uf0.this.g || !h70.k(c2.q())) {
                            af0.V(ph0.b(c2.o(), c2.m(), af0, this.b));
                        }
                    }
                    c.this.u(af0, i);
                }
            }
        }

        /* renamed from: uf0$c$b */
        /* compiled from: DecodeProducer */
        class b extends mf0 {
            public final /* synthetic */ boolean a;

            public b(uf0 uf0, boolean z) {
                this.a = z;
            }

            @Override // defpackage.tg0
            public void a() {
                if (this.a) {
                    c.this.y();
                }
            }

            @Override // defpackage.mf0, defpackage.tg0
            public void b() {
                if (c.this.c.g()) {
                    c.this.g.h();
                }
            }
        }

        static {
            C0201.m83(c.class, 51);
        }

        public c(sf0<v60<ye0>> sf0, sg0 sg0, boolean z, int i) {
            super(sf0);
            this.c = sg0;
            this.d = sg0.f();
            this.e = sg0.c().d();
            this.g = new cg0(uf0.this.b, new a(uf0.this, sg0, i), this.e.a);
            this.c.d(new b(uf0.this, z));
        }

        private void A(ye0 ye0, int i) {
            v60 b2 = uf0.this.j.b(ye0);
            try {
                C(jf0.e(i));
                p().d(b2, i);
            } finally {
                v60.s(b2);
            }
        }

        private synchronized boolean B() {
            return this.f;
        }

        private void C(boolean z) {
            synchronized (this) {
                if (z) {
                    if (!this.f) {
                        p().c(1.0f);
                        this.f = true;
                        this.g.c();
                    }
                }
            }
        }

        /* access modifiers changed from: private */
        /* access modifiers changed from: public */
        /* JADX WARNING: Removed duplicated region for block: B:31:0x00b3 A[Catch:{ all -> 0x0148 }] */
        /* JADX WARNING: Removed duplicated region for block: B:42:0x00dd  */
        private void u(af0 af0, int i) {
            int i2;
            df0 df0;
            ye0 ye0;
            Exception e2;
            ye0 a2;
            int i3 = i;
            String str = b;
            if ((af0.u() == nb0.a || !jf0.f(i)) && !B() && af0.F(af0)) {
                ob0 u = af0.u();
                String str2 = l;
                String a3 = u != null ? u.a() : str2;
                StringBuilder sb = new StringBuilder();
                sb.append(af0.A());
                String str3 = n;
                sb.append(str3);
                sb.append(af0.s());
                String sb2 = sb.toString();
                String valueOf = String.valueOf(af0.y());
                boolean e3 = jf0.e(i);
                boolean z = e3 && !jf0.n(i3, 8);
                boolean n2 = jf0.n(i3, 4);
                rd0 m2 = this.c.c().m();
                if (m2 != null) {
                    str2 = m2.a + str3 + m2.b;
                }
                try {
                    long f2 = this.g.f();
                    String valueOf2 = String.valueOf(this.c.c().q());
                    if (!z) {
                        if (!n2) {
                            i2 = w(af0);
                            if (!z) {
                                if (!n2) {
                                    df0 = x();
                                    this.d.b(this.c.t(), str);
                                    a2 = uf0.this.c.a(af0, i2, df0, this.e);
                                    if (af0.y() != 1) {
                                        i3 |= 16;
                                    }
                                    this.d.i(this.c.t(), str, v(a2, f2, df0, e3, a3, sb2, str2, valueOf));
                                    A(a2, i3);
                                }
                            }
                            df0 = cf0.d;
                            this.d.b(this.c.t(), str);
                            a2 = uf0.this.c.a(af0, i2, df0, this.e);
                            try {
                                if (af0.y() != 1) {
                                }
                                this.d.i(this.c.t(), str, v(a2, f2, df0, e3, a3, sb2, str2, valueOf));
                                A(a2, i3);
                            } catch (Exception e4) {
                                e2 = e4;
                                ye0 = a2;
                                this.d.j(this.c.t(), str, e2, v(ye0, f2, df0, e3, a3, sb2, str2, valueOf));
                                z(e2);
                                af0.h(af0);
                            }
                        }
                    }
                    i2 = af0.z();
                    if (!z) {
                    }
                    df0 = cf0.d;
                    this.d.b(this.c.t(), str);
                    try {
                        a2 = uf0.this.c.a(af0, i2, df0, this.e);
                        if (af0.y() != 1) {
                        }
                        this.d.i(this.c.t(), str, v(a2, f2, df0, e3, a3, sb2, str2, valueOf));
                        A(a2, i3);
                    } catch (oe0 e5) {
                        af0 a4 = e5.a();
                        f60.C(a, m, e5.getMessage(), valueOf2, a4.r(10), Integer.valueOf(a4.z()));
                        throw e5;
                    } catch (Exception e6) {
                        e2 = e6;
                        ye0 = null;
                        this.d.j(this.c.t(), str, e2, v(ye0, f2, df0, e3, a3, sb2, str2, valueOf));
                        z(e2);
                        af0.h(af0);
                    }
                } finally {
                    af0.h(af0);
                }
            }
        }

        private Map<String, String> v(ye0 ye0, long j, df0 df0, boolean z, String str, String str2, String str3, String str4) {
            if (!this.d.f(this.c.t())) {
                return null;
            }
            String valueOf = String.valueOf(j);
            String valueOf2 = String.valueOf(df0.b());
            String valueOf3 = String.valueOf(z);
            boolean z2 = ye0 instanceof ze0;
            String r10 = C0201.m82(17218);
            String r11 = C0201.m82(17219);
            String r12 = C0201.m82(17220);
            String r13 = C0201.m82(17221);
            String r14 = C0201.m82(17222);
            String r15 = C0201.m82(17223);
            String r0 = C0201.m82(17224);
            if (z2) {
                Bitmap n2 = ((ze0) ye0).n();
                HashMap hashMap = new HashMap(8);
                hashMap.put(C0201.m82(17226), n2.getWidth() + C0201.m82(17225) + n2.getHeight());
                hashMap.put(r0, valueOf);
                hashMap.put(r15, valueOf2);
                hashMap.put(r14, valueOf3);
                hashMap.put(r13, str2);
                hashMap.put(r12, str);
                hashMap.put(r11, str3);
                hashMap.put(r10, str4);
                return w50.a(hashMap);
            }
            HashMap hashMap2 = new HashMap(7);
            hashMap2.put(r0, valueOf);
            hashMap2.put(r15, valueOf2);
            hashMap2.put(r14, valueOf3);
            hashMap2.put(r13, str2);
            hashMap2.put(r12, str);
            hashMap2.put(r11, str3);
            hashMap2.put(r10, str4);
            return w50.a(hashMap2);
        }

        /* access modifiers changed from: private */
        /* access modifiers changed from: public */
        private void y() {
            C(true);
            p().b();
        }

        private void z(Throwable th) {
            C(true);
            p().a(th);
        }

        /* renamed from: D */
        public void i(af0 af0, int i) {
            try {
                if (oh0.d()) {
                    oh0.a(C0201.m82(17227));
                }
                boolean e2 = jf0.e(i);
                if (e2 && !af0.F(af0)) {
                    z(new c70(C0201.m82(17228)));
                } else if (E(af0, i)) {
                    boolean n2 = jf0.n(i, 4);
                    if (e2 || n2 || this.c.g()) {
                        this.g.h();
                    }
                    if (oh0.d()) {
                        oh0.b();
                    }
                } else if (oh0.d()) {
                    oh0.b();
                }
            } finally {
                if (oh0.d()) {
                    oh0.b();
                }
            }
        }

        public boolean E(af0 af0, int i) {
            return this.g.k(af0, i);
        }

        @Override // defpackage.vf0, defpackage.jf0
        public void g() {
            y();
        }

        @Override // defpackage.vf0, defpackage.jf0
        public void h(Throwable th) {
            z(th);
        }

        @Override // defpackage.vf0, defpackage.jf0
        public void j(float f2) {
            super.j(f2 * 0.99f);
        }

        public abstract int w(af0 af0);

        public abstract df0 x();
    }

    public uf0(k60 k60, Executor executor, qe0 qe0, se0 se0, boolean z, boolean z2, boolean z3, rg0<af0> rg0, int i2, ud0 ud0) {
        z50.g(k60);
        this.a = k60;
        z50.g(executor);
        this.b = executor;
        z50.g(qe0);
        this.c = qe0;
        z50.g(se0);
        this.d = se0;
        this.f = z;
        this.g = z2;
        z50.g(rg0);
        this.e = rg0;
        this.h = z3;
        this.i = i2;
        this.j = ud0;
    }

    @Override // defpackage.rg0
    public void b(sf0<v60<ye0>> sf0, sg0 sg0) {
        sf0<af0> sf02;
        try {
            if (oh0.d()) {
                oh0.a(C0201.m82(27243));
            }
            if (!h70.k(sg0.c().q())) {
                sf02 = new a(this, sf0, sg0, this.h, this.i);
            } else {
                sf02 = new b(this, sf0, sg0, new te0(this.a), this.d, this.h, this.i);
            }
            this.e.b(sf02, sg0);
        } finally {
            if (oh0.d()) {
                oh0.b();
            }
        }
    }
}
