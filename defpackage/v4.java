package defpackage;

import android.os.Binder;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Process;
import android.util.Log;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import vigqyno.C0201;

/* renamed from: v4  reason: default package */
/* compiled from: ModernAsyncTask */
public abstract class v4<Params, Progress, Result> {
    private static final ThreadFactory f = new a();
    private static final BlockingQueue<Runnable> g = new LinkedBlockingQueue(10);
    public static final Executor h = new ThreadPoolExecutor(5, 128, 1, TimeUnit.SECONDS, g, f);
    private static f i;
    private final h<Params, Result> a = new b();
    private final FutureTask<Result> b = new c(this.a);
    private volatile g c = g.PENDING;
    public final AtomicBoolean d = new AtomicBoolean();
    public final AtomicBoolean e = new AtomicBoolean();

    /* renamed from: v4$a */
    /* compiled from: ModernAsyncTask */
    static class a implements ThreadFactory {
        private final AtomicInteger a = new AtomicInteger(1);

        public Thread newThread(Runnable runnable) {
            return new Thread(runnable, C0201.m82(12088) + this.a.getAndIncrement());
        }
    }

    /* renamed from: v4$b */
    /* compiled from: ModernAsyncTask */
    class b extends h<Params, Result> {
        public b() {
        }

        @Override // java.util.concurrent.Callable
        public Result call() throws Exception {
            v4.this.e.set(true);
            Result result = null;
            try {
                Process.setThreadPriority(10);
                result = (Result) v4.this.b(this.a);
                Binder.flushPendingCommands();
                v4.this.l(result);
                return result;
            } catch (Throwable th) {
                v4.this.l(result);
                throw th;
            }
        }
    }

    /* renamed from: v4$c */
    /* compiled from: ModernAsyncTask */
    class c extends FutureTask<Result> {
        public c(Callable callable) {
            super(callable);
        }

        /* JADX DEBUG: Multi-variable search result rejected for r2v2, resolved type: v4 */
        /* JADX WARN: Multi-variable type inference failed */
        public void done() {
            String r0 = C0201.m82(11840);
            try {
                v4.this.m(get());
            } catch (InterruptedException e) {
                Log.w(C0201.m82(11841), e);
            } catch (ExecutionException e2) {
                throw new RuntimeException(r0, e2.getCause());
            } catch (CancellationException unused) {
                v4.this.m(null);
            } catch (Throwable th) {
                throw new RuntimeException(r0, th);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: v4$d */
    /* compiled from: ModernAsyncTask */
    public static /* synthetic */ class d {
        public static final /* synthetic */ int[] a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            int[] iArr = new int[g.values().length];
            a = iArr;
            iArr[g.RUNNING.ordinal()] = 1;
            a[g.FINISHED.ordinal()] = 2;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: v4$e */
    /* compiled from: ModernAsyncTask */
    public static class e<Data> {
        public final v4 a;
        public final Data[] b;

        public e(v4 v4Var, Data... dataArr) {
            this.a = v4Var;
            this.b = dataArr;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: v4$f */
    /* compiled from: ModernAsyncTask */
    public static class f extends Handler {
        public f() {
            super(Looper.getMainLooper());
        }

        public void handleMessage(Message message) {
            e eVar = (e) message.obj;
            int i = message.what;
            if (i == 1) {
                eVar.a.d(eVar.b[0]);
            } else if (i == 2) {
                eVar.a.k(eVar.b);
            }
        }
    }

    /* renamed from: v4$g */
    /* compiled from: ModernAsyncTask */
    public enum g {
        PENDING,
        RUNNING,
        FINISHED
    }

    /* access modifiers changed from: private */
    /* renamed from: v4$h */
    /* compiled from: ModernAsyncTask */
    public static abstract class h<Params, Result> implements Callable<Result> {
        public Params[] a;
    }

    private static Handler e() {
        f fVar;
        synchronized (v4.class) {
            if (i == null) {
                i = new f();
            }
            fVar = i;
        }
        return fVar;
    }

    public final boolean a(boolean z) {
        this.d.set(true);
        return this.b.cancel(z);
    }

    public abstract Result b(Params... paramsArr);

    public final v4<Params, Progress, Result> c(Executor executor, Params... paramsArr) {
        if (this.c != g.PENDING) {
            int i2 = d.a[this.c.ordinal()];
            if (i2 == 1) {
                throw new IllegalStateException(C0201.m82(8323));
            } else if (i2 != 2) {
                throw new IllegalStateException(C0201.m82(8321));
            } else {
                throw new IllegalStateException(C0201.m82(8322));
            }
        } else {
            this.c = g.RUNNING;
            j();
            this.a.a = paramsArr;
            executor.execute(this.b);
            return this;
        }
    }

    public void d(Result result) {
        if (f()) {
            h(result);
        } else {
            i(result);
        }
        this.c = g.FINISHED;
    }

    public final boolean f() {
        return this.d.get();
    }

    public void g() {
    }

    public void h(Result result) {
        g();
    }

    public void i(Result result) {
    }

    public void j() {
    }

    public void k(Progress... progressArr) {
    }

    public Result l(Result result) {
        e().obtainMessage(1, new e(this, result)).sendToTarget();
        return result;
    }

    public void m(Result result) {
        if (!this.e.get()) {
            l(result);
        }
    }
}
