package defpackage;

import android.os.Handler;
import java.util.concurrent.Callable;
import java.util.concurrent.Delayed;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: l50  reason: default package */
/* compiled from: ScheduledFutureImpl */
public class l50<V> implements RunnableFuture<V>, ScheduledFuture<V> {
    private final FutureTask<V> a;

    public l50(Handler handler, Callable<V> callable) {
        this.a = new FutureTask<>(callable);
    }

    public int b(Delayed delayed) {
        throw new UnsupportedOperationException();
    }

    public boolean cancel(boolean z) {
        return this.a.cancel(z);
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(Object obj) {
        b((Delayed) obj);
        throw null;
    }

    @Override // java.util.concurrent.Future
    public V get() throws InterruptedException, ExecutionException {
        return this.a.get();
    }

    public long getDelay(TimeUnit timeUnit) {
        throw new UnsupportedOperationException();
    }

    public boolean isCancelled() {
        return this.a.isCancelled();
    }

    public boolean isDone() {
        return this.a.isDone();
    }

    public void run() {
        this.a.run();
    }

    @Override // java.util.concurrent.Future
    public V get(long j, TimeUnit timeUnit) throws InterruptedException, ExecutionException, TimeoutException {
        return this.a.get(j, timeUnit);
    }

    public l50(Handler handler, Runnable runnable, V v) {
        this.a = new FutureTask<>(runnable, v);
    }
}
