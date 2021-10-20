package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.f;
import com.google.android.gms.common.api.h;
import com.google.android.gms.common.api.j;
import com.google.android.gms.common.api.m;
import com.google.android.gms.common.api.n;
import com.google.android.gms.common.internal.o;
import com.google.android.gms.common.internal.u;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import vigqyno.C0201;

@KeepName
/* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
public abstract class BasePendingResult<R extends m> extends h<R> {
    public static final ThreadLocal<Boolean> p = new t2();
    private final Object a;
    private final a<R> b;
    private final WeakReference<f> c;
    private final CountDownLatch d;
    private final ArrayList<h.a> e;
    private n<? super R> f;
    private final AtomicReference<g2> g;
    private R h;
    private Status i;
    private volatile boolean j;
    private boolean k;
    private boolean l;
    private o m;
    @KeepName
    private b mResultGuardian;
    private volatile a2<R> n;
    private boolean o;

    /* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
    public static class a<R extends m> extends et0 {
        public a(Looper looper) {
            super(looper);
        }

        public final void a(n<? super R> nVar, R r) {
            BasePendingResult.l(nVar);
            sendMessage(obtainMessage(1, new Pair(nVar, r)));
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v2, resolved type: com.google.android.gms.common.api.n */
        /* JADX WARN: Multi-variable type inference failed */
        public void handleMessage(Message message) {
            int i = message.what;
            if (i == 1) {
                Pair pair = (Pair) message.obj;
                n nVar = (n) pair.first;
                m mVar = (m) pair.second;
                try {
                    nVar.a(mVar);
                } catch (RuntimeException e) {
                    BasePendingResult.p(mVar);
                    throw e;
                }
            } else if (i != 2) {
                StringBuilder sb = new StringBuilder(45);
                sb.append(C0201.m82(20091));
                sb.append(i);
                Log.wtf(C0201.m82(20092), sb.toString(), new Exception());
            } else {
                ((BasePendingResult) message.obj).q(Status.h);
            }
        }
    }

    /* access modifiers changed from: private */
    /* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
    public final class b {
        private b() {
        }

        public final void finalize() throws Throwable {
            BasePendingResult.p(BasePendingResult.this.h);
            super.finalize();
        }

        public /* synthetic */ b(BasePendingResult basePendingResult, t2 t2Var) {
            this();
        }
    }

    @Deprecated
    public BasePendingResult() {
        this.a = new Object();
        this.d = new CountDownLatch(1);
        this.e = new ArrayList<>();
        this.g = new AtomicReference<>();
        this.o = false;
        this.b = new a<>(Looper.getMainLooper());
        this.c = new WeakReference<>(null);
    }

    private final R g() {
        R r;
        synchronized (this.a) {
            u.o(!this.j, C0201.m82(32673));
            u.o(i(), C0201.m82(32674));
            r = this.h;
            this.h = null;
            this.f = null;
            this.j = true;
        }
        g2 andSet = this.g.getAndSet(null);
        if (andSet != null) {
            andSet.a(this);
        }
        return r;
    }

    /* access modifiers changed from: private */
    public static <R extends m> n<R> l(n<R> nVar) {
        return nVar;
    }

    private final void m(R r) {
        this.h = r;
        this.m = null;
        this.d.countDown();
        this.i = this.h.k();
        if (this.k) {
            this.f = null;
        } else if (this.f != null) {
            this.b.removeMessages(2);
            this.b.a(this.f, g());
        } else if (this.h instanceof j) {
            this.mResultGuardian = new b(this, null);
        }
        ArrayList<h.a> arrayList = this.e;
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            h.a aVar = arrayList.get(i2);
            i2++;
            aVar.a(this.i);
        }
        this.e.clear();
    }

    public static void p(m mVar) {
        if (mVar instanceof j) {
            try {
                ((j) mVar).release();
            } catch (RuntimeException e2) {
                String valueOf = String.valueOf(mVar);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 18);
                sb.append(C0201.m82(32675));
                sb.append(valueOf);
                Log.w(C0201.m82(32676), sb.toString(), e2);
            }
        }
    }

    @Override // com.google.android.gms.common.api.h
    public final void b(h.a aVar) {
        u.b(aVar != null, C0201.m82(32677));
        synchronized (this.a) {
            if (i()) {
                aVar.a(this.i);
            } else {
                this.e.add(aVar);
            }
        }
    }

    @Override // com.google.android.gms.common.api.h
    public final R c(long j2, TimeUnit timeUnit) {
        if (j2 > 0) {
            u.j(C0201.m82(32678));
        }
        boolean z = true;
        u.o(!this.j, C0201.m82(32679));
        if (this.n != null) {
            z = false;
        }
        u.o(z, C0201.m82(32680));
        try {
            if (!this.d.await(j2, timeUnit)) {
                q(Status.h);
            }
        } catch (InterruptedException unused) {
            q(Status.f);
        }
        u.o(i(), C0201.m82(32681));
        return g();
    }

    @Override // com.google.android.gms.common.api.h
    public final void d(n<? super R> nVar) {
        synchronized (this.a) {
            if (nVar == null) {
                this.f = null;
                return;
            }
            boolean z = true;
            u.o(!this.j, C0201.m82(32682));
            if (this.n != null) {
                z = false;
            }
            u.o(z, C0201.m82(32683));
            if (!h()) {
                if (i()) {
                    this.b.a(nVar, g());
                } else {
                    this.f = nVar;
                }
            }
        }
    }

    public void e() {
        synchronized (this.a) {
            if (!this.k) {
                if (!this.j) {
                    if (this.m != null) {
                        try {
                            this.m.cancel();
                        } catch (RemoteException unused) {
                        }
                    }
                    p(this.h);
                    this.k = true;
                    m(f(Status.i));
                }
            }
        }
    }

    public abstract R f(Status status);

    public boolean h() {
        boolean z;
        synchronized (this.a) {
            z = this.k;
        }
        return z;
    }

    public final boolean i() {
        return this.d.getCount() == 0;
    }

    public final void j(R r) {
        synchronized (this.a) {
            if (this.l || this.k) {
                p(r);
                return;
            }
            i();
            boolean z = true;
            u.o(!i(), C0201.m82(32684));
            if (this.j) {
                z = false;
            }
            u.o(z, C0201.m82(32685));
            m(r);
        }
    }

    public final void n(g2 g2Var) {
        this.g.set(g2Var);
    }

    public final void q(Status status) {
        synchronized (this.a) {
            if (!i()) {
                j(f(status));
                this.l = true;
            }
        }
    }

    public final Integer r() {
        return null;
    }

    public final boolean s() {
        boolean h2;
        synchronized (this.a) {
            if (this.c.get() == null || !this.o) {
                e();
            }
            h2 = h();
        }
        return h2;
    }

    public final void t() {
        this.o = this.o || p.get().booleanValue();
    }

    public BasePendingResult(f fVar) {
        this.a = new Object();
        this.d = new CountDownLatch(1);
        this.e = new ArrayList<>();
        this.g = new AtomicReference<>();
        this.o = false;
        this.b = new a<>(fVar != null ? fVar.m() : Looper.getMainLooper());
        this.c = new WeakReference<>(fVar);
    }
}
