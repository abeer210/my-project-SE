package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import vigqyno.C0201;

public final class d7 implements Runnable {
    private final /* synthetic */ d9 a;
    private final /* synthetic */ a7 b;

    public d7(a7 a7Var, d9 d9Var) {
        this.b = a7Var;
        this.a = d9Var;
    }

    public final void run() {
        b3 W = a7.W(this.b);
        if (W == null) {
            this.b.e().E().d(C0201.m82(8607));
            return;
        }
        try {
            W.n1(this.a);
        } catch (RemoteException e) {
            this.b.e().E().a(C0201.m82(8608), e);
        }
        a7.Z(this.b);
    }
}
