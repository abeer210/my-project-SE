package com.google.android.gms.common.api.internal;

/* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
public abstract class p0 implements Runnable {
    private final /* synthetic */ f0 a;

    private p0(f0 f0Var) {
        this.a = f0Var;
    }

    public abstract void a();

    public void run() {
        this.a.b.lock();
        try {
            if (!Thread.interrupted()) {
                a();
                this.a.b.unlock();
            }
        } catch (RuntimeException e) {
            this.a.a.o(e);
        } finally {
            this.a.b.unlock();
        }
    }

    public /* synthetic */ p0(f0 f0Var, e0 e0Var) {
        this(f0Var);
    }
}
