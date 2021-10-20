package defpackage;

import android.os.Handler;
import java.util.List;
import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: k50  reason: default package */
/* compiled from: HandlerExecutorServiceImpl */
public class k50 extends AbstractExecutorService implements ScheduledExecutorService {
    private final Handler a;

    public k50(Handler handler) {
        this.a = handler;
    }

    public boolean a() {
        return Thread.currentThread() == this.a.getLooper().getThread();
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean awaitTermination(long j, TimeUnit timeUnit) throws InterruptedException {
        throw new UnsupportedOperationException();
    }

    /* renamed from: b */
    public <T> l50<T> newTaskFor(Runnable runnable, T t) {
        return new l50<>(this.a, runnable, t);
    }

    /* renamed from: c */
    public <T> l50<T> newTaskFor(Callable<T> callable) {
        return new l50<>(this.a, callable);
    }

    /* renamed from: d */
    public ScheduledFuture<?> submit(Runnable runnable) {
        return submit(runnable, null);
    }

    /* renamed from: e */
    public <T> ScheduledFuture<T> submit(Runnable runnable, T t) {
        if (runnable != null) {
            l50<T> b = newTaskFor(runnable, t);
            execute(b);
            return b;
        }
        throw null;
    }

    public void execute(Runnable runnable) {
        this.a.post(runnable);
    }

    /* renamed from: f */
    public <T> ScheduledFuture<T> submit(Callable<T> callable) {
        if (callable != null) {
            l50<T> c = newTaskFor(callable);
            execute(c);
            return c;
        }
        throw null;
    }

    public boolean isShutdown() {
        return false;
    }

    public boolean isTerminated() {
        return false;
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public ScheduledFuture<?> schedule(Runnable runnable, long j, TimeUnit timeUnit) {
        l50 b = newTaskFor(runnable, null);
        this.a.postDelayed(b, timeUnit.toMillis(j));
        return b;
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public ScheduledFuture<?> scheduleAtFixedRate(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public ScheduledFuture<?> scheduleWithFixedDelay(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        throw new UnsupportedOperationException();
    }

    public void shutdown() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.concurrent.ExecutorService
    public List<Runnable> shutdownNow() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public <V> ScheduledFuture<V> schedule(Callable<V> callable, long j, TimeUnit timeUnit) {
        l50 c = newTaskFor(callable);
        this.a.postDelayed(c, timeUnit.toMillis(j));
        return c;
    }
}
