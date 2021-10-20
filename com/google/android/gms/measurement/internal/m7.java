package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import android.text.TextUtils;
import vigqyno.C0201;

public final class m7 implements Runnable {
    private final /* synthetic */ boolean a;
    private final /* synthetic */ boolean b;
    private final /* synthetic */ j c;
    private final /* synthetic */ d9 d;
    private final /* synthetic */ String e;
    private final /* synthetic */ a7 f;

    public m7(a7 a7Var, boolean z, boolean z2, j jVar, d9 d9Var, String str) {
        this.f = a7Var;
        this.a = z;
        this.b = z2;
        this.c = jVar;
        this.d = d9Var;
        this.e = str;
    }

    public final void run() {
        b3 W = a7.W(this.f);
        if (W == null) {
            this.f.e().E().d(C0201.m82(12368));
            return;
        }
        if (this.a) {
            this.f.M(W, this.b ? null : this.c, this.d);
        } else {
            try {
                if (TextUtils.isEmpty(this.e)) {
                    W.p3(this.c, this.d);
                } else {
                    W.K(this.c, this.e, this.f.e().O());
                }
            } catch (RemoteException e2) {
                this.f.e().E().a(C0201.m82(12369), e2);
            }
        }
        a7.Z(this.f);
    }
}
