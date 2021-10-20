package defpackage;

import java.util.List;
import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import vigqyno.C0201;

/* renamed from: i50  reason: default package */
/* compiled from: ConstrainedExecutorService */
public class i50 extends AbstractExecutorService {
    private static final Class<?> h = i50.class;
    private final String a;
    private final Executor b;
    private volatile int c;
    private final BlockingQueue<Runnable> d;
    private final b e;
    private final AtomicInteger f;
    private final AtomicInteger g;

    /* access modifiers changed from: private */
    /* renamed from: i50$b */
    /* compiled from: ConstrainedExecutorService */
    public class b implements Runnable {
        private b() {
        }

        public void run() {
            AtomicInteger atomicInteger;
            boolean isEmpty;
            String r0 = C0201.m82(15994);
            try {
                Runnable runnable = (Runnable) i50.this.d.poll();
                if (runnable != null) {
                    runnable.run();
                } else {
                    f60.q(i50.h, C0201.m82(15995), i50.this.a);
                }
                if (isEmpty) {
                    f60.r(i50.h, r0, i50.this.a, Integer.valueOf(atomicInteger.decrementAndGet()));
                }
            } finally {
                int decrementAndGet = i50.this.f.decrementAndGet();
                if (!i50.this.d.isEmpty()) {
                    i50.this.f();
                } else {
                    f60.r(i50.h, r0, i50.this.a, Integer.valueOf(decrementAndGet));
                }
            }
        }
    }

    public i50(String str, int i, Executor executor, BlockingQueue<Runnable> blockingQueue) {
        if (i > 0) {
            this.a = str;
            this.b = executor;
            this.c = i;
            this.d = blockingQueue;
            this.e = new b();
            this.f = new AtomicInteger(0);
            this.g = new AtomicInteger(0);
            return;
        }
        throw new IllegalArgumentException(C0201.m82(3796));
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void f() {
        int i = this.f.get();
        while (i < this.c) {
            int i2 = i + 1;
            if (this.f.compareAndSet(i, i2)) {
                f60.s(h, C0201.m82(3797), this.a, Integer.valueOf(i2), Integer.valueOf(this.c));
                this.b.execute(this.e);
                return;
            }
            f60.q(h, C0201.m82(3798), this.a);
            i = this.f.get();
        }
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean awaitTermination(long j, TimeUnit timeUnit) throws InterruptedException {
        throw new UnsupportedOperationException();
    }

    public void execute(Runnable runnable) {
        if (runnable == null) {
            throw new NullPointerException(C0201.m82(3801));
        } else if (this.d.offer(runnable)) {
            int size = this.d.size();
            int i = this.g.get();
            if (size > i && this.g.compareAndSet(i, size)) {
                f60.r(h, C0201.m82(3799), this.a, Integer.valueOf(size));
            }
            f();
        } else {
            throw new RejectedExecutionException(this.a + C0201.m82(3800) + this.d.size());
        }
    }

    public boolean isShutdown() {
        return false;
    }

    public boolean isTerminated() {
        return false;
    }

    public void shutdown() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.concurrent.ExecutorService
    public List<Runnable> shutdownNow() {
        throw new UnsupportedOperationException();
    }
}
