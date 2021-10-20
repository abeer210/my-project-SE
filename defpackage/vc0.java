package defpackage;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import vigqyno.C0201;

/* renamed from: vc0  reason: default package */
/* compiled from: BufferedDiskCache */
public class vc0 {
    private static final Class<?> h = vc0.class;
    private final b50 a;
    private final r60 b;
    private final u60 c;
    private final Executor d;
    private final Executor e;
    private final ld0 f = ld0.d();
    private final ed0 g;

    /* access modifiers changed from: package-private */
    /* renamed from: vc0$a */
    /* compiled from: BufferedDiskCache */
    public class a implements Callable<af0> {
        public final /* synthetic */ AtomicBoolean a;
        public final /* synthetic */ m40 b;

        public a(AtomicBoolean atomicBoolean, m40 m40) {
            this.a = atomicBoolean;
            this.b = m40;
        }

        /* JADX INFO: finally extract failed */
        /* renamed from: a */
        public af0 call() throws Exception {
            try {
                if (oh0.d()) {
                    oh0.a(C0201.m82(29387));
                }
                if (!this.a.get()) {
                    af0 c2 = vc0.this.f.c(this.b);
                    if (c2 != null) {
                        f60.q(vc0.h, C0201.m82(29388), this.b.b());
                        vc0.this.g.m(this.b);
                    } else {
                        f60.q(vc0.h, C0201.m82(29389), this.b.b());
                        vc0.this.g.j();
                        try {
                            q60 p = vc0.this.p(this.b);
                            if (p == null) {
                                if (oh0.d()) {
                                    oh0.b();
                                }
                                return null;
                            }
                            v60 B = v60.B(p);
                            try {
                                af0 af0 = new af0(B);
                                v60.s(B);
                                c2 = af0;
                            } catch (Throwable th) {
                                v60.s(B);
                                throw th;
                            }
                        } catch (Exception unused) {
                            if (oh0.d()) {
                                oh0.b();
                            }
                            return null;
                        }
                    }
                    if (!Thread.interrupted()) {
                        return c2;
                    }
                    f60.p(vc0.h, C0201.m82(29390));
                    if (c2 != null) {
                        c2.close();
                    }
                    throw new InterruptedException();
                }
                throw new CancellationException();
            } finally {
                if (oh0.d()) {
                    oh0.b();
                }
            }
        }
    }

    /* renamed from: vc0$b */
    /* compiled from: BufferedDiskCache */
    class b implements Runnable {
        public final /* synthetic */ m40 a;
        public final /* synthetic */ af0 b;

        public b(m40 m40, af0 af0) {
            this.a = m40;
            this.b = af0;
        }

        public void run() {
            try {
                if (oh0.d()) {
                    oh0.a(C0201.m82(29517));
                }
                vc0.this.r(this.a, this.b);
            } finally {
                vc0.this.f.h(this.a, this.b);
                af0.h(this.b);
                if (oh0.d()) {
                    oh0.b();
                }
            }
        }
    }

    /* renamed from: vc0$c */
    /* compiled from: BufferedDiskCache */
    class c implements Callable<Void> {
        public final /* synthetic */ m40 a;

        public c(m40 m40) {
            this.a = m40;
        }

        /* renamed from: a */
        public Void call() throws Exception {
            try {
                if (oh0.d()) {
                    oh0.a(C0201.m82(29483));
                }
                vc0.this.f.g(this.a);
                vc0.this.a.d(this.a);
            } finally {
                if (oh0.d()) {
                    oh0.b();
                }
            }
        }
    }

    /* renamed from: vc0$d */
    /* compiled from: BufferedDiskCache */
    class d implements Callable<Void> {
        public d() {
        }

        /* renamed from: a */
        public Void call() throws Exception {
            vc0.this.f.a();
            vc0.this.a.a();
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: vc0$e */
    /* compiled from: BufferedDiskCache */
    public class e implements s40 {
        public final /* synthetic */ af0 a;

        public e(af0 af0) {
            this.a = af0;
        }

        @Override // defpackage.s40
        public void a(OutputStream outputStream) throws IOException {
            vc0.this.c.a(this.a.w(), outputStream);
        }
    }

    public vc0(b50 b50, r60 r60, u60 u60, Executor executor, Executor executor2, ed0 ed0) {
        this.a = b50;
        this.b = r60;
        this.c = u60;
        this.d = executor;
        this.e = executor2;
        this.g = ed0;
    }

    private boolean h(m40 m40) {
        af0 c2 = this.f.c(m40);
        if (c2 != null) {
            c2.close();
            f60.q(h, C0201.m82(12255), m40.b());
            this.g.m(m40);
            return true;
        }
        f60.q(h, C0201.m82(12256), m40.b());
        this.g.j();
        try {
            return this.a.e(m40);
        } catch (Exception unused) {
            return false;
        }
    }

    private v7<af0> l(m40 m40, af0 af0) {
        f60.q(h, C0201.m82(12257), m40.b());
        this.g.m(m40);
        return v7.h(af0);
    }

    private v7<af0> n(m40 m40, AtomicBoolean atomicBoolean) {
        try {
            return v7.b(new a(atomicBoolean, m40), this.d);
        } catch (Exception e2) {
            f60.z(h, e2, C0201.m82(12258), m40.b());
            return v7.g(e2);
        }
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private q60 p(m40 m40) throws IOException {
        try {
            f60.q(h, C0201.m82(12259), m40.b());
            h40 b2 = this.a.b(m40);
            if (b2 == null) {
                f60.q(h, C0201.m82(12260), m40.b());
                this.g.h();
                return null;
            }
            f60.q(h, C0201.m82(12261), m40.b());
            this.g.d(m40);
            InputStream a2 = b2.a();
            try {
                q60 d2 = this.b.d(a2, (int) b2.size());
                a2.close();
                f60.q(h, C0201.m82(12262), m40.b());
                return d2;
            } catch (Throwable th) {
                a2.close();
                throw th;
            }
        } catch (IOException e2) {
            f60.z(h, e2, C0201.m82(12263), m40.b());
            this.g.f();
            throw e2;
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void r(m40 m40, af0 af0) {
        f60.q(h, C0201.m82(12264), m40.b());
        try {
            this.a.f(m40, new e(af0));
            f60.q(h, C0201.m82(12265), m40.b());
        } catch (IOException e2) {
            f60.z(h, e2, C0201.m82(12266), m40.b());
        }
    }

    public v7<Void> i() {
        this.f.a();
        try {
            return v7.b(new d(), this.e);
        } catch (Exception e2) {
            f60.z(h, e2, C0201.m82(12267), new Object[0]);
            return v7.g(e2);
        }
    }

    public boolean j(m40 m40) {
        return this.f.b(m40) || this.a.c(m40);
    }

    public boolean k(m40 m40) {
        if (j(m40)) {
            return true;
        }
        return h(m40);
    }

    public v7<af0> m(m40 m40, AtomicBoolean atomicBoolean) {
        try {
            if (oh0.d()) {
                oh0.a(C0201.m82(12268));
            }
            af0 c2 = this.f.c(m40);
            if (c2 != null) {
                return l(m40, c2);
            }
            v7<af0> n = n(m40, atomicBoolean);
            if (oh0.d()) {
                oh0.b();
            }
            return n;
        } finally {
            if (oh0.d()) {
                oh0.b();
            }
        }
    }

    public void o(m40 m40, af0 af0) {
        try {
            if (oh0.d()) {
                oh0.a(C0201.m82(12269));
            }
            z50.g(m40);
            z50.b(af0.F(af0));
            this.f.f(m40, af0);
            af0 c2 = af0.c(af0);
            try {
                this.e.execute(new b(m40, c2));
            } catch (Exception e2) {
                f60.z(h, e2, C0201.m82(12270), m40.b());
                this.f.h(m40, af0);
                af0.h(c2);
            }
        } finally {
            if (oh0.d()) {
                oh0.b();
            }
        }
    }

    public v7<Void> q(m40 m40) {
        z50.g(m40);
        this.f.g(m40);
        try {
            return v7.b(new c(m40), this.e);
        } catch (Exception e2) {
            f60.z(h, e2, C0201.m82(12271), m40.b());
            return v7.g(e2);
        }
    }
}
