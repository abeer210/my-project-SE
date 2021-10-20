package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.RemoteException;
import vigqyno.C0201;

public final class p7 implements Runnable {
    private final /* synthetic */ String a;
    private final /* synthetic */ String b;
    private final /* synthetic */ boolean c;
    private final /* synthetic */ d9 d;
    private final /* synthetic */ jh1 e;
    private final /* synthetic */ a7 f;

    public p7(a7 a7Var, String str, String str2, boolean z, d9 d9Var, jh1 jh1) {
        this.f = a7Var;
        this.a = str;
        this.b = str2;
        this.c = z;
        this.d = d9Var;
        this.e = jh1;
    }

    public final void run() {
        String r0 = C0201.m82(19761);
        Bundle bundle = new Bundle();
        try {
            b3 W = a7.W(this.f);
            if (W == null) {
                this.f.e().E().b(r0, this.a, this.b);
                return;
            }
            Bundle j0 = y8.j0(W.O1(this.a, this.b, this.c, this.d));
            a7.Z(this.f);
            this.f.m().E(this.e, j0);
        } catch (RemoteException e2) {
            this.f.e().E().b(r0, this.a, e2);
        } finally {
            this.f.m().E(this.e, bundle);
        }
    }
}
