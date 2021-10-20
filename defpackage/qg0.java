package defpackage;

import android.graphics.Bitmap;
import java.util.Map;
import java.util.concurrent.Executor;
import vigqyno.C0201;

/* renamed from: qg0  reason: default package */
/* compiled from: PostprocessorProducer */
public class qg0 implements rg0<v60<ye0>> {
    private final rg0<v60<ye0>> a;
    private final oc0 b;
    private final Executor c;

    /* renamed from: qg0$b */
    /* compiled from: PostprocessorProducer */
    private class b extends vf0<v60<ye0>, v60<ye0>> {
        private final ug0 c;
        private final String d;
        private final kh0 e;
        private boolean f;
        private v60<ye0> g = null;
        private int h = 0;
        private boolean i = false;
        private boolean j = false;

        /* renamed from: qg0$b$a */
        /* compiled from: PostprocessorProducer */
        class a extends mf0 {
            public a(qg0 qg0) {
            }

            @Override // defpackage.tg0
            public void a() {
                b.this.C();
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: qg0$b$b  reason: collision with other inner class name */
        /* compiled from: PostprocessorProducer */
        public class RunnableC0167b implements Runnable {
            public RunnableC0167b() {
            }

            public void run() {
                v60 v60;
                int i;
                synchronized (b.this) {
                    v60 = b.this.g;
                    i = b.this.h;
                    b.this.g = null;
                    b.this.i = false;
                }
                if (v60.z(v60)) {
                    try {
                        b.this.z(v60, i);
                    } finally {
                        v60.s(v60);
                    }
                }
                b.this.x();
            }
        }

        public b(sf0<v60<ye0>> sf0, ug0 ug0, String str, kh0 kh0, sg0 sg0) {
            super(sf0);
            this.c = ug0;
            this.d = str;
            this.e = kh0;
            sg0.d(new a(qg0.this));
        }

        private Map<String, String> A(ug0 ug0, String str, kh0 kh0) {
            if (!ug0.f(str)) {
                return null;
            }
            return w50.b(C0201.m82(33334), kh0.getName());
        }

        private synchronized boolean B() {
            return this.f;
        }

        /* access modifiers changed from: private */
        /* access modifiers changed from: public */
        private void C() {
            if (y()) {
                p().b();
            }
        }

        private void D(Throwable th) {
            if (y()) {
                p().a(th);
            }
        }

        private void E(v60<ye0> v60, int i2) {
            boolean e2 = jf0.e(i2);
            if ((!e2 && !B()) || (e2 && y())) {
                p().d(v60, i2);
            }
        }

        private v60<ye0> G(ye0 ye0) {
            ze0 ze0 = (ze0) ye0;
            v60<Bitmap> b = this.e.b(ze0.n(), qg0.this.b);
            try {
                return v60.B(new ze0(b, ye0.h(), ze0.w(), ze0.u()));
            } finally {
                v60.s(b);
            }
        }

        private synchronized boolean H() {
            if (this.f || !this.i || this.j || !v60.z(this.g)) {
                return false;
            }
            this.j = true;
            return true;
        }

        private boolean I(ye0 ye0) {
            return ye0 instanceof ze0;
        }

        private void J() {
            qg0.this.c.execute(new RunnableC0167b());
        }

        /* JADX WARNING: Code restructure failed: missing block: B:10:0x001e, code lost:
            J();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:14:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:15:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:8:0x0019, code lost:
            defpackage.v60.s(r0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:9:0x001c, code lost:
            if (r2 == false) goto L_?;
         */
        private void K(v60<ye0> v60, int i2) {
            synchronized (this) {
                if (!this.f) {
                    v60<ye0> v602 = this.g;
                    this.g = v60.n(v60);
                    this.h = i2;
                    this.i = true;
                    boolean H = H();
                }
            }
        }

        /* access modifiers changed from: private */
        /* access modifiers changed from: public */
        private void x() {
            boolean H;
            synchronized (this) {
                this.j = false;
                H = H();
            }
            if (H) {
                J();
            }
        }

        private boolean y() {
            synchronized (this) {
                if (this.f) {
                    return false;
                }
                v60<ye0> v60 = this.g;
                this.g = null;
                this.f = true;
                v60.s(v60);
                return true;
            }
        }

        /* access modifiers changed from: private */
        /* access modifiers changed from: public */
        private void z(v60<ye0> v60, int i2) {
            z50.b(v60.z(v60));
            if (!I(v60.w())) {
                E(v60, i2);
                return;
            }
            ug0 ug0 = this.c;
            String str = this.d;
            String r2 = C0201.m82(33335);
            ug0.b(str, r2);
            try {
                v60<ye0> G = G(v60.w());
                try {
                    this.c.i(this.d, r2, A(this.c, this.d, this.e));
                    E(G, i2);
                } finally {
                    v60.s(G);
                }
            } catch (Exception e2) {
                this.c.j(this.d, r2, e2, A(this.c, this.d, this.e));
                D(e2);
                v60.s(null);
            }
        }

        /* renamed from: F */
        public void i(v60<ye0> v60, int i2) {
            if (v60.z(v60)) {
                K(v60, i2);
            } else if (jf0.e(i2)) {
                E(null, i2);
            }
        }

        @Override // defpackage.vf0, defpackage.jf0
        public void g() {
            C();
        }

        @Override // defpackage.vf0, defpackage.jf0
        public void h(Throwable th) {
            D(th);
        }
    }

    /* renamed from: qg0$c */
    /* compiled from: PostprocessorProducer */
    class c extends vf0<v60<ye0>, v60<ye0>> implements mh0 {
        private boolean c;
        private v60<ye0> d;

        /* renamed from: qg0$c$a */
        /* compiled from: PostprocessorProducer */
        class a extends mf0 {
            public a(qg0 qg0) {
            }

            @Override // defpackage.tg0
            public void a() {
                if (c.this.r()) {
                    c.this.p().b();
                }
            }
        }

        /* access modifiers changed from: private */
        /* access modifiers changed from: public */
        private boolean r() {
            synchronized (this) {
                if (this.c) {
                    return false;
                }
                v60<ye0> v60 = this.d;
                this.d = null;
                this.c = true;
                v60.s(v60);
                return true;
            }
        }

        private void t(v60<ye0> v60) {
            synchronized (this) {
                if (!this.c) {
                    v60<ye0> v602 = this.d;
                    this.d = v60.n(v60);
                    v60.s(v602);
                }
            }
        }

        private void u() {
            synchronized (this) {
                if (!this.c) {
                    v60 n = v60.n(this.d);
                    try {
                        p().d(n, 0);
                    } finally {
                        v60.s(n);
                    }
                }
            }
        }

        @Override // defpackage.vf0, defpackage.jf0
        public void g() {
            if (r()) {
                p().b();
            }
        }

        @Override // defpackage.vf0, defpackage.jf0
        public void h(Throwable th) {
            if (r()) {
                p().a(th);
            }
        }

        /* renamed from: s */
        public void i(v60<ye0> v60, int i) {
            if (!jf0.f(i)) {
                t(v60);
                u();
            }
        }

        private c(qg0 qg0, b bVar, lh0 lh0, sg0 sg0) {
            super(bVar);
            this.c = false;
            this.d = null;
            lh0.a(this);
            sg0.d(new a(qg0));
        }
    }

    /* renamed from: qg0$d */
    /* compiled from: PostprocessorProducer */
    class d extends vf0<v60<ye0>, v60<ye0>> {
        /* renamed from: q */
        public void i(v60<ye0> v60, int i) {
            if (!jf0.f(i)) {
                p().d(v60, i);
            }
        }

        private d(qg0 qg0, b bVar) {
            super(bVar);
        }
    }

    public qg0(rg0<v60<ye0>> rg0, oc0 oc0, Executor executor) {
        z50.g(rg0);
        this.a = rg0;
        this.b = oc0;
        z50.g(executor);
        this.c = executor;
    }

    @Override // defpackage.rg0
    public void b(sf0<v60<ye0>> sf0, sg0 sg0) {
        sf0<v60<ye0>> sf02;
        ug0 f = sg0.f();
        kh0 g = sg0.c().g();
        b bVar = new b(sf0, f, sg0.t(), g, sg0);
        if (g instanceof lh0) {
            sf02 = new c(bVar, (lh0) g, sg0);
        } else {
            sf02 = new d(bVar);
        }
        this.a.b(sf02, sg0);
    }
}
