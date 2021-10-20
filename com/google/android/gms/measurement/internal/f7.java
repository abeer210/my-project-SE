package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import vigqyno.C0201;

public final class f7 implements Runnable {
    private final /* synthetic */ d9 a;
    private final /* synthetic */ boolean b;
    private final /* synthetic */ a7 c;

    public f7(a7 a7Var, d9 d9Var, boolean z) {
        this.c = a7Var;
        this.a = d9Var;
        this.b = z;
    }

    public final void run() {
        b3 W = a7.W(this.c);
        if (W == null) {
            this.c.e().E().d(C0201.m82(32690));
            return;
        }
        try {
            W.R1(this.a);
            if (this.b) {
                this.c.t().L();
            }
            this.c.M(W, null, this.a);
            a7.Z(this.c);
        } catch (RemoteException e) {
            this.c.e().E().a(C0201.m82(32691), e);
        }
    }
}
