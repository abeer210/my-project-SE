package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import vigqyno.C0201;

public final class j7 implements Runnable {
    private final /* synthetic */ d9 a;
    private final /* synthetic */ a7 b;

    public j7(a7 a7Var, d9 d9Var) {
        this.b = a7Var;
        this.a = d9Var;
    }

    public final void run() {
        b3 W = a7.W(this.b);
        if (W == null) {
            this.b.e().E().d(C0201.m82(24912));
            return;
        }
        try {
            W.t2(this.a);
            a7.Z(this.b);
        } catch (RemoteException e) {
            this.b.e().E().a(C0201.m82(24913), e);
        }
    }
}
