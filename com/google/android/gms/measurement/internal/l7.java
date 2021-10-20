package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import android.text.TextUtils;
import vigqyno.C0201;

public final class l7 implements Runnable {
    private final /* synthetic */ boolean a;
    private final /* synthetic */ boolean b;
    private final /* synthetic */ g9 c;
    private final /* synthetic */ d9 d;
    private final /* synthetic */ g9 e;
    private final /* synthetic */ a7 f;

    public l7(a7 a7Var, boolean z, boolean z2, g9 g9Var, d9 d9Var, g9 g9Var2) {
        this.f = a7Var;
        this.a = z;
        this.b = z2;
        this.c = g9Var;
        this.d = d9Var;
        this.e = g9Var2;
    }

    public final void run() {
        b3 W = a7.W(this.f);
        if (W == null) {
            this.f.e().E().d(C0201.m82(29562));
            return;
        }
        if (this.a) {
            this.f.M(W, this.b ? null : this.c, this.d);
        } else {
            try {
                if (TextUtils.isEmpty(this.e.a)) {
                    W.q0(this.c, this.d);
                } else {
                    W.I(this.c);
                }
            } catch (RemoteException e2) {
                this.f.e().E().a(C0201.m82(29563), e2);
            }
        }
        a7.Z(this.f);
    }
}
