package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.u;
import java.lang.Thread;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import vigqyno.C0201;

public final class i4 extends k5 {
    private static final AtomicLong l = new AtomicLong(Long.MIN_VALUE);
    private l4 c;
    private l4 d;
    private final PriorityBlockingQueue<m4<?>> e = new PriorityBlockingQueue<>();
    private final BlockingQueue<m4<?>> f = new LinkedBlockingQueue();
    private final Thread.UncaughtExceptionHandler g = new k4(this, C0201.m82(21782));
    private final Thread.UncaughtExceptionHandler h = new k4(this, C0201.m82(21783));
    private final Object i = new Object();
    private final Semaphore j = new Semaphore(2);
    private volatile boolean k;

    public i4(o4 o4Var) {
        super(o4Var);
    }

    private final void x(m4<?> m4Var) {
        synchronized (this.i) {
            this.e.add(m4Var);
            if (this.c == null) {
                l4 l4Var = new l4(this, C0201.m82(21784), this.e);
                this.c = l4Var;
                l4Var.setUncaughtExceptionHandler(this.g);
                this.c.start();
            } else {
                this.c.b();
            }
        }
    }

    public final <V> Future<V> A(Callable<V> callable) throws IllegalStateException {
        p();
        u.k(callable);
        m4<?> m4Var = new m4<>(this, (Callable<?>) callable, true, C0201.m82(21785));
        if (Thread.currentThread() == this.c) {
            m4Var.run();
        } else {
            x(m4Var);
        }
        return m4Var;
    }

    public final void B(Runnable runnable) throws IllegalStateException {
        p();
        u.k(runnable);
        m4<?> m4Var = new m4<>(this, runnable, false, C0201.m82(21786));
        synchronized (this.i) {
            this.f.add(m4Var);
            if (this.d == null) {
                l4 l4Var = new l4(this, C0201.m82(21787), this.f);
                this.d = l4Var;
                l4Var.setUncaughtExceptionHandler(this.h);
                this.d.start();
            } else {
                this.d.b();
            }
        }
    }

    public final boolean G() {
        return Thread.currentThread() == this.c;
    }

    @Override // com.google.android.gms.measurement.internal.l5
    public final void i() {
        if (Thread.currentThread() != this.d) {
            throw new IllegalStateException(C0201.m82(21788));
        }
    }

    @Override // com.google.android.gms.measurement.internal.l5
    public final void j() {
        if (Thread.currentThread() != this.c) {
            throw new IllegalStateException(C0201.m82(21789));
        }
    }

    @Override // com.google.android.gms.measurement.internal.k5
    public final boolean r() {
        return false;
    }

    public final <T> T u(AtomicReference<T> atomicReference, long j2, String str, Runnable runnable) {
        synchronized (atomicReference) {
            c().y(runnable);
            try {
                atomicReference.wait(15000);
            } catch (InterruptedException unused) {
                m3 H = e().H();
                String r4 = C0201.m82(21791);
                String valueOf = String.valueOf(str);
                H.d(valueOf.length() != 0 ? r4.concat(valueOf) : new String(r4));
                return null;
            }
        }
        T t = atomicReference.get();
        if (t == null) {
            m3 H2 = e().H();
            String r42 = C0201.m82(21790);
            String valueOf2 = String.valueOf(str);
            H2.d(valueOf2.length() != 0 ? r42.concat(valueOf2) : new String(r42));
        }
        return t;
    }

    public final <V> Future<V> v(Callable<V> callable) throws IllegalStateException {
        p();
        u.k(callable);
        m4<?> m4Var = new m4<>(this, (Callable<?>) callable, false, C0201.m82(21792));
        if (Thread.currentThread() == this.c) {
            if (!this.e.isEmpty()) {
                e().H().d(C0201.m82(21793));
            }
            m4Var.run();
        } else {
            x(m4Var);
        }
        return m4Var;
    }

    public final void y(Runnable runnable) throws IllegalStateException {
        p();
        u.k(runnable);
        x(new m4<>(this, runnable, false, C0201.m82(21794)));
    }
}
