package defpackage;

import com.bumptech.glide.load.g;
import defpackage.bi;
import defpackage.gp;
import defpackage.th;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import vigqyno.C0201;

/* renamed from: xh  reason: default package */
/* compiled from: EngineJob */
public class xh<R> implements th.b<R>, gp.f {
    private static final c B = new c();
    private volatile boolean A;
    public final e a;
    private final ip b;
    private final bi.a c;
    private final androidx.core.util.e<xh<?>> d;
    private final c e;
    private final yh f;
    private final kj g;
    private final kj h;
    private final kj i;
    private final kj j;
    private final AtomicInteger k;
    private g l;
    private boolean m;
    private boolean n;
    private boolean o;
    private boolean p;
    private hi<?> q;
    public com.bumptech.glide.load.a u;
    private boolean v;
    public ci w;
    private boolean x;
    public bi<?> y;
    private th<R> z;

    /* access modifiers changed from: private */
    /* renamed from: xh$a */
    /* compiled from: EngineJob */
    public class a implements Runnable {
        private final bo a;

        public a(bo boVar) {
            this.a = boVar;
        }

        public void run() {
            synchronized (this.a.i()) {
                synchronized (xh.this) {
                    if (xh.this.a.b(this.a)) {
                        xh.this.e(this.a);
                    }
                    xh.this.i();
                }
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: xh$b */
    /* compiled from: EngineJob */
    public class b implements Runnable {
        private final bo a;

        public b(bo boVar) {
            this.a = boVar;
        }

        public void run() {
            synchronized (this.a.i()) {
                synchronized (xh.this) {
                    if (xh.this.a.b(this.a)) {
                        xh.this.y.c();
                        xh.this.g(this.a);
                        xh.this.r(this.a);
                    }
                    xh.this.i();
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: xh$c */
    /* compiled from: EngineJob */
    public static class c {
        public <R> bi<R> a(hi<R> hiVar, boolean z, g gVar, bi.a aVar) {
            return new bi<>(hiVar, z, true, gVar, aVar);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: xh$d */
    /* compiled from: EngineJob */
    public static final class d {
        public final bo a;
        public final Executor b;

        public d(bo boVar, Executor executor) {
            this.a = boVar;
            this.b = executor;
        }

        public boolean equals(Object obj) {
            if (obj instanceof d) {
                return this.a.equals(((d) obj).a);
            }
            return false;
        }

        public int hashCode() {
            return this.a.hashCode();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: xh$e */
    /* compiled from: EngineJob */
    public static final class e implements Iterable<d> {
        private final List<d> a;

        public e() {
            this(new ArrayList(2));
        }

        private static d d(bo boVar) {
            return new d(boVar, zo.a());
        }

        public void a(bo boVar, Executor executor) {
            this.a.add(new d(boVar, executor));
        }

        public boolean b(bo boVar) {
            return this.a.contains(d(boVar));
        }

        public e c() {
            return new e(new ArrayList(this.a));
        }

        public void clear() {
            this.a.clear();
        }

        public void e(bo boVar) {
            this.a.remove(d(boVar));
        }

        public boolean isEmpty() {
            return this.a.isEmpty();
        }

        @Override // java.lang.Iterable
        public Iterator<d> iterator() {
            return this.a.iterator();
        }

        public int size() {
            return this.a.size();
        }

        public e(List<d> list) {
            this.a = list;
        }
    }

    public xh(kj kjVar, kj kjVar2, kj kjVar3, kj kjVar4, yh yhVar, bi.a aVar, androidx.core.util.e<xh<?>> eVar) {
        this(kjVar, kjVar2, kjVar3, kjVar4, yhVar, aVar, eVar, B);
    }

    private kj j() {
        if (this.n) {
            return this.i;
        }
        return this.o ? this.j : this.h;
    }

    private boolean m() {
        return this.x || this.v || this.A;
    }

    private synchronized void q() {
        if (this.l != null) {
            this.a.clear();
            this.l = null;
            this.y = null;
            this.q = null;
            this.x = false;
            this.A = false;
            this.v = false;
            this.z.I(false);
            this.z = null;
            this.w = null;
            this.u = null;
            this.d.a(this);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @Override // defpackage.th.b
    public void a(ci ciVar) {
        synchronized (this) {
            this.w = ciVar;
        }
        n();
    }

    public synchronized void b(bo boVar, Executor executor) {
        this.b.c();
        this.a.a(boVar, executor);
        boolean z2 = true;
        if (this.v) {
            k(1);
            executor.execute(new b(boVar));
        } else if (this.x) {
            k(1);
            executor.execute(new a(boVar));
        } else {
            if (this.A) {
                z2 = false;
            }
            ep.a(z2, C0201.m82(17314));
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: hi<R> */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.th.b
    public void c(hi<R> hiVar, com.bumptech.glide.load.a aVar) {
        synchronized (this) {
            this.q = hiVar;
            this.u = aVar;
        }
        o();
    }

    @Override // defpackage.th.b
    public void d(th<?> thVar) {
        j().execute(thVar);
    }

    public void e(bo boVar) {
        try {
            boVar.a(this.w);
        } catch (Throwable th) {
            throw new nh(th);
        }
    }

    @Override // defpackage.gp.f
    public ip f() {
        return this.b;
    }

    public void g(bo boVar) {
        try {
            boVar.c(this.y, this.u);
        } catch (Throwable th) {
            throw new nh(th);
        }
    }

    public void h() {
        if (!m()) {
            this.A = true;
            this.z.g();
            this.f.c(this, this.l);
        }
    }

    public void i() {
        bi<?> biVar;
        synchronized (this) {
            this.b.c();
            ep.a(m(), C0201.m82(17315));
            int decrementAndGet = this.k.decrementAndGet();
            ep.a(decrementAndGet >= 0, C0201.m82(17316));
            if (decrementAndGet == 0) {
                biVar = this.y;
                q();
            } else {
                biVar = null;
            }
        }
        if (biVar != null) {
            biVar.f();
        }
    }

    public synchronized void k(int i2) {
        ep.a(m(), C0201.m82(17317));
        if (this.k.getAndAdd(i2) == 0 && this.y != null) {
            this.y.c();
        }
    }

    public synchronized xh<R> l(g gVar, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.l = gVar;
        this.m = z2;
        this.n = z3;
        this.o = z4;
        this.p = z5;
        return this;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002f, code lost:
        r5.f.b(r5, r1, null);
        r0 = r2.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x003d, code lost:
        if (r0.hasNext() == false) goto L_0x0052;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003f, code lost:
        r1 = r0.next();
        r1.b.execute(new defpackage.xh.a(r5, r1.a));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0052, code lost:
        i();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0055, code lost:
        return;
     */
    public void n() {
        synchronized (this) {
            this.b.c();
            if (this.A) {
                q();
            } else if (this.a.isEmpty()) {
                throw new IllegalStateException(C0201.m82(17319));
            } else if (!this.x) {
                this.x = true;
                g gVar = this.l;
                e c2 = this.a.c();
                k(c2.size() + 1);
            } else {
                throw new IllegalStateException(C0201.m82(17318));
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0046, code lost:
        r6.f.b(r6, r0, r2);
        r0 = r1.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0053, code lost:
        if (r0.hasNext() == false) goto L_0x0068;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0055, code lost:
        r1 = r0.next();
        r1.b.execute(new defpackage.xh.b(r6, r1.a));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0068, code lost:
        i();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x006b, code lost:
        return;
     */
    public void o() {
        synchronized (this) {
            this.b.c();
            if (this.A) {
                this.q.recycle();
                q();
            } else if (this.a.isEmpty()) {
                throw new IllegalStateException(C0201.m82(17321));
            } else if (!this.v) {
                this.y = this.e.a(this.q, this.m, this.l, this.c);
                this.v = true;
                e c2 = this.a.c();
                k(c2.size() + 1);
                g gVar = this.l;
                bi<?> biVar = this.y;
            } else {
                throw new IllegalStateException(C0201.m82(17320));
            }
        }
    }

    public boolean p() {
        return this.p;
    }

    public synchronized void r(bo boVar) {
        boolean z2;
        this.b.c();
        this.a.e(boVar);
        if (this.a.isEmpty()) {
            h();
            if (!this.v) {
                if (!this.x) {
                    z2 = false;
                    if (z2 && this.k.get() == 0) {
                        q();
                    }
                }
            }
            z2 = true;
            q();
        }
    }

    public synchronized void s(th<R> thVar) {
        this.z = thVar;
        (thVar.O() ? this.g : j()).execute(thVar);
    }

    public xh(kj kjVar, kj kjVar2, kj kjVar3, kj kjVar4, yh yhVar, bi.a aVar, androidx.core.util.e<xh<?>> eVar, c cVar) {
        this.a = new e();
        this.b = ip.a();
        this.k = new AtomicInteger();
        this.g = kjVar;
        this.h = kjVar2;
        this.i = kjVar3;
        this.j = kjVar4;
        this.f = yhVar;
        this.c = aVar;
        this.d = eVar;
        this.e = cVar;
    }
}
