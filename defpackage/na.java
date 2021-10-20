package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;
import vigqyno.C0201;

/* renamed from: na  reason: default package */
/* compiled from: LottieTask */
public class na<T> {
    public static Executor e = Executors.newCachedThreadPool();
    private final Set<ia<T>> a;
    private final Set<ia<Throwable>> b;
    private final Handler c;
    private volatile ma<T> d;

    /* access modifiers changed from: package-private */
    /* renamed from: na$a */
    /* compiled from: LottieTask */
    public class a implements Runnable {
        public a() {
        }

        public void run() {
            if (na.this.d != null) {
                ma maVar = na.this.d;
                if (maVar.b() != null) {
                    na.this.i(maVar.b());
                } else {
                    na.this.g(maVar.a());
                }
            }
        }
    }

    /* renamed from: na$b */
    /* compiled from: LottieTask */
    private class b extends FutureTask<ma<T>> {
        public b(Callable<ma<T>> callable) {
            super(callable);
        }

        public void done() {
            if (!isCancelled()) {
                try {
                    na.this.l((ma) get());
                } catch (InterruptedException | ExecutionException e) {
                    na.this.l(new ma(e));
                }
            }
        }
    }

    public na(Callable<ma<T>> callable) {
        this(callable, false);
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private synchronized void g(Throwable th) {
        ArrayList<ia> arrayList = new ArrayList(this.b);
        if (arrayList.isEmpty()) {
            wf.d(C0201.m82(33006), th);
            return;
        }
        for (ia iaVar : arrayList) {
            iaVar.onResult(th);
        }
    }

    private void h() {
        this.c.post(new a());
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private synchronized void i(T t) {
        for (ia iaVar : new ArrayList(this.a)) {
            iaVar.onResult(t);
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void l(ma<T> maVar) {
        if (this.d == null) {
            this.d = maVar;
            h();
            return;
        }
        throw new IllegalStateException(C0201.m82(33007));
    }

    public synchronized na<T> e(ia<Throwable> iaVar) {
        if (!(this.d == null || this.d.a() == null)) {
            iaVar.onResult(this.d.a());
        }
        this.b.add(iaVar);
        return this;
    }

    public synchronized na<T> f(ia<T> iaVar) {
        if (!(this.d == null || this.d.b() == null)) {
            iaVar.onResult(this.d.b());
        }
        this.a.add(iaVar);
        return this;
    }

    public synchronized na<T> j(ia<Throwable> iaVar) {
        this.b.remove(iaVar);
        return this;
    }

    public synchronized na<T> k(ia<T> iaVar) {
        this.a.remove(iaVar);
        return this;
    }

    public na(Callable<ma<T>> callable, boolean z) {
        this.a = new LinkedHashSet(1);
        this.b = new LinkedHashSet(1);
        this.c = new Handler(Looper.getMainLooper());
        this.d = null;
        if (z) {
            try {
                l(callable.call());
            } catch (Throwable th) {
                l(new ma<>(th));
            }
        } else {
            e.execute(new b(callable));
        }
    }
}
