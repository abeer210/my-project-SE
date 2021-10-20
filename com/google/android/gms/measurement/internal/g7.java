package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import vigqyno.C0201;

public final class g7 implements Runnable {
    private final /* synthetic */ d9 a;
    private final /* synthetic */ jh1 b;
    private final /* synthetic */ a7 c;

    public g7(a7 a7Var, d9 d9Var, jh1 jh1) {
        this.c = a7Var;
        this.a = d9Var;
        this.b = jh1;
    }

    public final void run() {
        String r0 = C0201.m82(34572);
        try {
            b3 W = a7.W(this.c);
            if (W == null) {
                this.c.e().E().d(r0);
                return;
            }
            String G0 = W.G0(this.a);
            if (G0 != null) {
                this.c.p().l0(G0);
                this.c.f().l.a(G0);
            }
            a7.Z(this.c);
            this.c.m().T(this.b, G0);
        } catch (RemoteException e) {
            this.c.e().E().a(r0, e);
        } finally {
            this.c.m().T(this.b, null);
        }
    }
}
