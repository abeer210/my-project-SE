package defpackage;

import android.os.Process;
import android.os.StrictMode;
import android.text.TextUtils;
import android.util.Log;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import vigqyno.C0188;
import vigqyno.C0201;

/* renamed from: kj  reason: default package */
/* compiled from: GlideExecutor */
public final class kj implements ExecutorService {
    private static final long b = TimeUnit.SECONDS.toMillis(10);
    private static volatile int c;
    private final ExecutorService a;

    /* renamed from: kj$a */
    /* compiled from: GlideExecutor */
    public static final class a {
        private final boolean a;
        private int b;
        private int c;
        private c d = c.b;
        private String e;
        private long f;

        public a(boolean z) {
            this.a = z;
        }

        public kj a() {
            if (!TextUtils.isEmpty(this.e)) {
                ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(this.b, this.c, this.f, TimeUnit.MILLISECONDS, new PriorityBlockingQueue(), new b(this.e, this.d, this.a));
                if (this.f != 0) {
                    threadPoolExecutor.allowCoreThreadTimeOut(true);
                }
                return new kj(threadPoolExecutor);
            }
            throw new IllegalArgumentException(C0201.m82(21959) + this.e);
        }

        public a b(String str) {
            this.e = str;
            return this;
        }

        public a c(int i) {
            this.b = i;
            this.c = i;
            return this;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: kj$b */
    /* compiled from: GlideExecutor */
    public static final class b implements ThreadFactory {
        private final String a;
        public final c b;
        public final boolean c;
        private int d;

        /* renamed from: kj$b$a */
        /* compiled from: GlideExecutor */
        class a extends Thread {
            public a(Runnable runnable, String str) {
                super(runnable, str);
            }

            public void run() {
                Process.setThreadPriority(9);
                if (b.this.c) {
                    StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder().detectNetwork().penaltyDeath().build());
                }
                try {
                    super.run();
                } catch (Throwable th) {
                    b.this.b.a(th);
                }
            }
        }

        public b(String str, c cVar, boolean z) {
            this.a = str;
            this.b = cVar;
            this.c = z;
        }

        public synchronized Thread newThread(Runnable runnable) {
            a aVar;
            aVar = new a(runnable, C0201.m82(22187) + this.a + C0201.m82(22188) + this.d);
            this.d = this.d + 1;
            return aVar;
        }
    }

    /* renamed from: kj$c */
    /* compiled from: GlideExecutor */
    public interface c {
        public static final c a = new a();
        public static final c b = a;

        /* renamed from: kj$c$a */
        /* compiled from: GlideExecutor */
        class a implements c {
            @Override // defpackage.kj.c
            public void a(Throwable th) {
                if (th != null) {
                    String r1 = C0201.m82(62);
                    if (Log.isLoggable(r1, 6)) {
                        Log.e(r1, C0201.m82(63), th);
                    }
                }
            }
        }

        void a(Throwable th);
    }

    public kj(ExecutorService executorService) {
        this.a = executorService;
    }

    public static int a() {
        if (c == 0) {
            c = Math.min(4, lj.a());
        }
        return c;
    }

    public static a b() {
        int i = a() >= 4 ? 2 : 1;
        a aVar = new a(true);
        aVar.c(i);
        aVar.b(C0201.m82(27385));
        return aVar;
    }

    public static kj c() {
        return b().a();
    }

    public static a d() {
        a aVar = new a(true);
        aVar.c(1);
        aVar.b(C0201.m82(27386));
        return aVar;
    }

    public static kj e() {
        return d().a();
    }

    public static a f() {
        a aVar = new a(false);
        aVar.c(a());
        aVar.b(C0201.m82(27387));
        return aVar;
    }

    public static kj g() {
        return f().a();
    }

    public static kj h() {
        return new kj(new ThreadPoolExecutor(0, (int) C0188.f24, b, TimeUnit.MILLISECONDS, new SynchronousQueue(), new b(C0201.m82(27388), c.b, false)));
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean awaitTermination(long j, TimeUnit timeUnit) throws InterruptedException {
        return this.a.awaitTermination(j, timeUnit);
    }

    public void execute(Runnable runnable) {
        this.a.execute(runnable);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection) throws InterruptedException {
        return this.a.invokeAll(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> T invokeAny(Collection<? extends Callable<T>> collection) throws InterruptedException, ExecutionException {
        return (T) this.a.invokeAny(collection);
    }

    public boolean isShutdown() {
        return this.a.isShutdown();
    }

    public boolean isTerminated() {
        return this.a.isTerminated();
    }

    public void shutdown() {
        this.a.shutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public List<Runnable> shutdownNow() {
        return this.a.shutdownNow();
    }

    @Override // java.util.concurrent.ExecutorService
    public Future<?> submit(Runnable runnable) {
        return this.a.submit(runnable);
    }

    public String toString() {
        return this.a.toString();
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection, long j, TimeUnit timeUnit) throws InterruptedException {
        return this.a.invokeAll(collection, j, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> T invokeAny(Collection<? extends Callable<T>> collection, long j, TimeUnit timeUnit) throws InterruptedException, ExecutionException, TimeoutException {
        return (T) this.a.invokeAny(collection, j, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> Future<T> submit(Runnable runnable, T t) {
        return this.a.submit(runnable, t);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> Future<T> submit(Callable<T> callable) {
        return this.a.submit(callable);
    }
}
