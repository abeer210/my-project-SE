package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import vigqyno.C0201;

public final class i7 implements Runnable {
    private final /* synthetic */ w6 a;
    private final /* synthetic */ a7 b;

    public i7(a7 a7Var, w6 w6Var) {
        this.b = a7Var;
        this.a = w6Var;
    }

    public final void run() {
        b3 W = a7.W(this.b);
        if (W == null) {
            this.b.e().E().d(C0201.m82(20703));
            return;
        }
        try {
            if (this.a == null) {
                W.j1(0, null, null, this.b.getContext().getPackageName());
            } else {
                W.j1(this.a.c, this.a.a, this.a.b, this.b.getContext().getPackageName());
            }
            a7.Z(this.b);
        } catch (RemoteException e) {
            this.b.e().E().a(C0201.m82(20704), e);
        }
    }
}
