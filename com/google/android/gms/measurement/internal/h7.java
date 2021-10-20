package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import vigqyno.C0201;

public final class h7 implements Runnable {
    private final /* synthetic */ j a;
    private final /* synthetic */ String b;
    private final /* synthetic */ jh1 c;
    private final /* synthetic */ a7 d;

    public h7(a7 a7Var, j jVar, String str, jh1 jh1) {
        this.d = a7Var;
        this.a = jVar;
        this.b = str;
        this.c = jh1;
    }

    public final void run() {
        try {
            b3 W = a7.W(this.d);
            if (W == null) {
                this.d.e().E().d(C0201.m82(36839));
                return;
            }
            byte[] r3 = W.r3(this.a, this.b);
            a7.Z(this.d);
            this.d.m().H(this.c, r3);
        } catch (RemoteException e) {
            this.d.e().E().a(C0201.m82(36840), e);
        } finally {
            this.d.m().H(this.c, null);
        }
    }
}
