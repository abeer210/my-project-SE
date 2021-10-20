package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import vigqyno.C0201;

/* renamed from: f0  reason: default package */
/* compiled from: DefaultTaskExecutor */
public class f0 extends g0 {
    private final Object a = new Object();
    private final ExecutorService b = Executors.newFixedThreadPool(2, new a(this));
    private volatile Handler c;

    /* renamed from: f0$a */
    /* compiled from: DefaultTaskExecutor */
    class a implements ThreadFactory {
        private final AtomicInteger a = new AtomicInteger(0);

        public a(f0 f0Var) {
        }

        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable);
            thread.setName(String.format(C0201.m82(14086), Integer.valueOf(this.a.getAndIncrement())));
            return thread;
        }
    }

    @Override // defpackage.g0
    public boolean a() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }

    @Override // defpackage.g0
    public void b(Runnable runnable) {
        if (this.c == null) {
            synchronized (this.a) {
                if (this.c == null) {
                    this.c = new Handler(Looper.getMainLooper());
                }
            }
        }
        this.c.post(runnable);
    }
}
