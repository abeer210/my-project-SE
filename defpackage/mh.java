package defpackage;

import android.os.Process;
import com.bumptech.glide.load.g;
import defpackage.bi;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import vigqyno.C0201;

/* renamed from: mh  reason: default package */
/* compiled from: ActiveResources */
public final class mh {
    private final boolean a;
    private final Executor b;
    public final Map<g, d> c;
    private final ReferenceQueue<bi<?>> d;
    private bi.a e;
    private volatile boolean f;
    private volatile c g;

    /* renamed from: mh$a */
    /* compiled from: ActiveResources */
    class a implements ThreadFactory {

        /* renamed from: mh$a$a  reason: collision with other inner class name */
        /* compiled from: ActiveResources */
        class RunnableC0152a implements Runnable {
            public final /* synthetic */ Runnable a;

            public RunnableC0152a(a aVar, Runnable runnable) {
                this.a = runnable;
            }

            public void run() {
                Process.setThreadPriority(10);
                this.a.run();
            }
        }

        public Thread newThread(Runnable runnable) {
            return new Thread(new RunnableC0152a(this, runnable), C0201.m82(28534));
        }
    }

    /* renamed from: mh$b */
    /* compiled from: ActiveResources */
    class b implements Runnable {
        public b() {
        }

        public void run() {
            mh.this.b();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: mh$c */
    /* compiled from: ActiveResources */
    public interface c {
        void a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: mh$d */
    /* compiled from: ActiveResources */
    public static final class d extends WeakReference<bi<?>> {
        public final g a;
        public final boolean b;
        public hi<?> c;

        public d(g gVar, bi<?> biVar, ReferenceQueue<? super bi<?>> referenceQueue, boolean z) {
            super(biVar, referenceQueue);
            hi<?> hiVar;
            ep.d(gVar);
            this.a = gVar;
            if (!biVar.e() || !z) {
                hiVar = null;
            } else {
                hi<?> d = biVar.d();
                ep.d(d);
                hiVar = d;
            }
            this.c = hiVar;
            this.b = biVar.e();
        }

        public void a() {
            this.c = null;
            clear();
        }
    }

    public mh(boolean z) {
        this(z, Executors.newSingleThreadExecutor(new a()));
    }

    public synchronized void a(g gVar, bi<?> biVar) {
        d put = this.c.put(gVar, new d(gVar, biVar, this.d, this.a));
        if (put != null) {
            put.a();
        }
    }

    public void b() {
        while (!this.f) {
            try {
                c((d) this.d.remove());
                c cVar = this.g;
                if (cVar != null) {
                    cVar.a();
                }
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        }
    }

    public void c(d dVar) {
        synchronized (this) {
            this.c.remove(dVar.a);
            if (dVar.b) {
                if (dVar.c != null) {
                    this.e.d(dVar.a, new bi<>(dVar.c, true, false, dVar.a, this.e));
                }
            }
        }
    }

    public synchronized void d(g gVar) {
        d remove = this.c.remove(gVar);
        if (remove != null) {
            remove.a();
        }
    }

    public synchronized bi<?> e(g gVar) {
        d dVar = this.c.get(gVar);
        if (dVar == null) {
            return null;
        }
        bi<?> biVar = (bi) dVar.get();
        if (biVar == null) {
            c(dVar);
        }
        return biVar;
    }

    public void f(bi.a aVar) {
        synchronized (aVar) {
            synchronized (this) {
                this.e = aVar;
            }
        }
    }

    public mh(boolean z, Executor executor) {
        this.c = new HashMap();
        this.d = new ReferenceQueue<>();
        this.a = z;
        this.b = executor;
        executor.execute(new b());
    }
}
