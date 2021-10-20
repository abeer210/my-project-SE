package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import java.util.concurrent.atomic.AtomicReference;
import vigqyno.C0201;

public final class c7 implements Runnable {
    private final /* synthetic */ AtomicReference a;
    private final /* synthetic */ d9 b;
    private final /* synthetic */ a7 c;

    public c7(a7 a7Var, AtomicReference atomicReference, d9 d9Var) {
        this.c = a7Var;
        this.a = atomicReference;
        this.b = d9Var;
    }

    public final void run() {
        synchronized (this.a) {
            try {
                b3 W = a7.W(this.c);
                if (W == null) {
                    this.c.e().E().d(C0201.m82(5654));
                    return;
                }
                this.a.set(W.G0(this.b));
                String str = (String) this.a.get();
                if (str != null) {
                    this.c.p().l0(str);
                    this.c.f().l.a(str);
                }
                a7.Z(this.c);
                this.a.notify();
            } catch (RemoteException e) {
                this.c.e().E().a(C0201.m82(5655), e);
            } finally {
                this.a.notify();
            }
        }
    }
}
