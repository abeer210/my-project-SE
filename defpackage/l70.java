package defpackage;

import android.util.Pair;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;

/* renamed from: l70  reason: default package */
/* compiled from: AbstractDataSource */
public abstract class l70<T> implements n70<T> {
    private c a = c.IN_PROGRESS;
    private boolean b = false;
    private T c = null;
    private Throwable d = null;
    private float e = 0.0f;
    private final ConcurrentLinkedQueue<Pair<p70<T>, Executor>> f = new ConcurrentLinkedQueue<>();

    /* access modifiers changed from: package-private */
    /* renamed from: l70$a */
    /* compiled from: AbstractDataSource */
    public class a implements Runnable {
        public final /* synthetic */ boolean a;
        public final /* synthetic */ p70 b;
        public final /* synthetic */ boolean c;

        public a(boolean z, p70 p70, boolean z2) {
            this.a = z;
            this.b = p70;
            this.c = z2;
        }

        public void run() {
            if (this.a) {
                this.b.b(l70.this);
            } else if (this.c) {
                this.b.a(l70.this);
            } else {
                this.b.c(l70.this);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l70$b */
    /* compiled from: AbstractDataSource */
    public class b implements Runnable {
        public final /* synthetic */ p70 a;

        public b(p70 p70) {
            this.a = p70;
        }

        public void run() {
            this.a.d(l70.this);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: l70$c */
    /* compiled from: AbstractDataSource */
    public enum c {
        IN_PROGRESS,
        SUCCESS,
        FAILURE
    }

    private void k(p70<T> p70, Executor executor, boolean z, boolean z2) {
        executor.execute(new a(z, p70, z2));
    }

    private void l() {
        boolean i = i();
        boolean t = t();
        Iterator<Pair<p70<T>, Executor>> it = this.f.iterator();
        while (it.hasNext()) {
            Pair<p70<T>, Executor> next = it.next();
            k((p70) next.first, (Executor) next.second, i, t);
        }
    }

    private synchronized boolean o(Throwable th) {
        if (!this.b) {
            if (this.a == c.IN_PROGRESS) {
                this.a = c.FAILURE;
                this.d = th;
                return true;
            }
        }
        return false;
    }

    private synchronized boolean q(float f2) {
        if (!this.b) {
            if (this.a == c.IN_PROGRESS) {
                if (f2 < this.e) {
                    return false;
                }
                this.e = f2;
                return true;
            }
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0027, code lost:
        if (r4 == null) goto L_0x002c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0029, code lost:
        h(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x002c, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0034, code lost:
        return false;
     */
    private boolean s(T t, boolean z) {
        Throwable th;
        T t2;
        T t3 = null;
        try {
            synchronized (this) {
                try {
                    if (!this.b) {
                        if (this.a == c.IN_PROGRESS) {
                            if (z) {
                                this.a = c.SUCCESS;
                                this.e = 1.0f;
                            }
                            if (this.c != t3) {
                                T t4 = this.c;
                                try {
                                    this.c = t3;
                                    t2 = t4;
                                } catch (Throwable th2) {
                                    th = th2;
                                    throw th;
                                }
                            } else {
                                t2 = t3;
                            }
                            try {
                            } catch (Throwable th3) {
                                th = th3;
                                throw th;
                            }
                        }
                    }
                } catch (Throwable th4) {
                    th = th4;
                    throw th;
                }
            }
        } finally {
            if (t3 != null) {
                h(t3);
            }
        }
    }

    private synchronized boolean t() {
        return j() && !b();
    }

    @Override // defpackage.n70
    public synchronized boolean a() {
        return this.c != null;
    }

    @Override // defpackage.n70
    public synchronized boolean b() {
        return this.a != c.IN_PROGRESS;
    }

    @Override // defpackage.n70
    public synchronized Throwable c() {
        return this.d;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0013, code lost:
        h(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001a, code lost:
        if (b() != false) goto L_0x001f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x001c, code lost:
        l();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x001f, code lost:
        monitor-enter(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
        r3.f.clear();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0025, code lost:
        monitor-exit(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0026, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0011, code lost:
        if (r1 == null) goto L_0x0016;
     */
    @Override // defpackage.n70
    public boolean close() {
        synchronized (this) {
            if (this.b) {
                return false;
            }
            this.b = true;
            T t = this.c;
            this.c = null;
        }
    }

    @Override // defpackage.n70
    public synchronized float d() {
        return this.e;
    }

    @Override // defpackage.n70
    public boolean e() {
        return false;
    }

    @Override // defpackage.n70
    public synchronized T f() {
        return this.c;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0033, code lost:
        if (r0 == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0035, code lost:
        k(r3, r4, i(), t());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:?, code lost:
        return;
     */
    @Override // defpackage.n70
    public void g(p70<T> p70, Executor executor) {
        boolean z;
        z50.g(p70);
        z50.g(executor);
        synchronized (this) {
            if (!this.b) {
                if (this.a == c.IN_PROGRESS) {
                    this.f.add(Pair.create(p70, executor));
                }
                if (!a() && !b()) {
                    if (!t()) {
                        z = false;
                    }
                }
                z = true;
            }
        }
    }

    public void h(T t) {
    }

    public synchronized boolean i() {
        return this.a == c.FAILURE;
    }

    public synchronized boolean j() {
        return this.b;
    }

    public void m() {
        Iterator<Pair<p70<T>, Executor>> it = this.f.iterator();
        while (it.hasNext()) {
            Pair<p70<T>, Executor> next = it.next();
            ((Executor) next.second).execute(new b((p70) next.first));
        }
    }

    public boolean n(Throwable th) {
        boolean o = o(th);
        if (o) {
            l();
        }
        return o;
    }

    public boolean p(float f2) {
        boolean q = q(f2);
        if (q) {
            m();
        }
        return q;
    }

    public boolean r(T t, boolean z) {
        boolean s = s(t, z);
        if (s) {
            l();
        }
        return s;
    }
}
