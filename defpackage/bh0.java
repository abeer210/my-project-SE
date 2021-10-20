package defpackage;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.concurrent.Executor;

/* renamed from: bh0  reason: default package */
/* compiled from: ThreadHandoffProducerQueue */
public class bh0 {
    private boolean a = false;
    private final Deque<Runnable> b;
    private final Executor c;

    public bh0(Executor executor) {
        z50.g(executor);
        this.c = executor;
        this.b = new ArrayDeque();
    }

    public synchronized void a(Runnable runnable) {
        if (this.a) {
            this.b.add(runnable);
        } else {
            this.c.execute(runnable);
        }
    }

    public synchronized void b(Runnable runnable) {
        this.b.remove(runnable);
    }
}
