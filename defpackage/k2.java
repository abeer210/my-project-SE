package defpackage;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import vigqyno.C0201;

/* renamed from: k2  reason: default package */
/* compiled from: SelfDestructiveThread */
public class k2 {
    public static final String i = null;
    private final Object a = new Object();
    private HandlerThread b;
    private Handler c;
    private int d;
    private Handler.Callback e = new a();
    private final int f;
    private final int g;
    private final String h;

    /* renamed from: k2$a */
    /* compiled from: SelfDestructiveThread */
    class a implements Handler.Callback {
        public a() {
        }

        public boolean handleMessage(Message message) {
            int i = message.what;
            if (i == 0) {
                k2.this.a();
                return true;
            } else if (i != 1) {
                return true;
            } else {
                k2.this.b((Runnable) message.obj);
                return true;
            }
        }
    }

    /* renamed from: k2$b */
    /* compiled from: SelfDestructiveThread */
    class b implements Runnable {
        public final /* synthetic */ Callable a;
        public final /* synthetic */ Handler b;
        public final /* synthetic */ d c;

        /* renamed from: k2$b$a */
        /* compiled from: SelfDestructiveThread */
        class a implements Runnable {
            public final /* synthetic */ Object a;

            public a(Object obj) {
                this.a = obj;
            }

            public void run() {
                b.this.c.a(this.a);
            }
        }

        public b(k2 k2Var, Callable callable, Handler handler, d dVar) {
            this.a = callable;
            this.b = handler;
            this.c = dVar;
        }

        public void run() {
            Object obj;
            try {
                obj = this.a.call();
            } catch (Exception unused) {
                obj = null;
            }
            this.b.post(new a(obj));
        }
    }

    /* renamed from: k2$c */
    /* compiled from: SelfDestructiveThread */
    class c implements Runnable {
        public final /* synthetic */ AtomicReference a;
        public final /* synthetic */ Callable b;
        public final /* synthetic */ ReentrantLock c;
        public final /* synthetic */ AtomicBoolean d;
        public final /* synthetic */ Condition e;

        public c(k2 k2Var, AtomicReference atomicReference, Callable callable, ReentrantLock reentrantLock, AtomicBoolean atomicBoolean, Condition condition) {
            this.a = atomicReference;
            this.b = callable;
            this.c = reentrantLock;
            this.d = atomicBoolean;
            this.e = condition;
        }

        public void run() {
            try {
                this.a.set(this.b.call());
            } catch (Exception unused) {
            }
            this.c.lock();
            try {
                this.d.set(false);
                this.e.signal();
            } finally {
                this.c.unlock();
            }
        }
    }

    /* renamed from: k2$d */
    /* compiled from: SelfDestructiveThread */
    public interface d<T> {
        void a(T t);
    }

    static {
        C0201.m83(k2.class, 69);
    }

    public k2(String str, int i2, int i3) {
        this.h = str;
        this.g = i2;
        this.f = i3;
        this.d = 0;
    }

    private void c(Runnable runnable) {
        synchronized (this.a) {
            if (this.b == null) {
                HandlerThread handlerThread = new HandlerThread(this.h, this.g);
                this.b = handlerThread;
                handlerThread.start();
                this.c = new Handler(this.b.getLooper(), this.e);
                this.d++;
            }
            this.c.removeMessages(0);
            this.c.sendMessage(this.c.obtainMessage(1, runnable));
        }
    }

    public void a() {
        synchronized (this.a) {
            if (!this.c.hasMessages(1)) {
                this.b.quit();
                this.b = null;
                this.c = null;
            }
        }
    }

    public void b(Runnable runnable) {
        runnable.run();
        synchronized (this.a) {
            this.c.removeMessages(0);
            this.c.sendMessageDelayed(this.c.obtainMessage(0), (long) this.f);
        }
    }

    public <T> void d(Callable<T> callable, d<T> dVar) {
        c(new b(this, callable, new Handler(), dVar));
    }

    public <T> T e(Callable<T> callable, int i2) throws InterruptedException {
        ReentrantLock reentrantLock = new ReentrantLock();
        Condition newCondition = reentrantLock.newCondition();
        AtomicReference atomicReference = new AtomicReference();
        AtomicBoolean atomicBoolean = new AtomicBoolean(true);
        c(new c(this, atomicReference, callable, reentrantLock, atomicBoolean, newCondition));
        reentrantLock.lock();
        try {
            if (!atomicBoolean.get()) {
                return (T) atomicReference.get();
            }
            long nanos = TimeUnit.MILLISECONDS.toNanos((long) i2);
            do {
                try {
                    nanos = newCondition.awaitNanos(nanos);
                } catch (InterruptedException unused) {
                }
                if (!atomicBoolean.get()) {
                    T t = (T) atomicReference.get();
                    reentrantLock.unlock();
                    return t;
                }
            } while (nanos > 0);
            throw new InterruptedException(i);
        } finally {
            reentrantLock.unlock();
        }
    }
}
