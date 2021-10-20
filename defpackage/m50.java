package defpackage;

import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: m50  reason: default package */
/* compiled from: StatefulRunnable */
public abstract class m50<T> implements Runnable {
    public final AtomicInteger a = new AtomicInteger(0);

    public void a() {
        if (this.a.compareAndSet(0, 2)) {
            d();
        }
    }

    public abstract void b(T t);

    public abstract T c() throws Exception;

    public abstract void d();

    public abstract void e(Exception exc);

    public abstract void f(T t);

    public final void run() {
        if (this.a.compareAndSet(0, 1)) {
            try {
                T c = c();
                this.a.set(3);
                try {
                    f(c);
                } finally {
                    b(c);
                }
            } catch (Exception e) {
                this.a.set(4);
                e(e);
            }
        }
    }
}
