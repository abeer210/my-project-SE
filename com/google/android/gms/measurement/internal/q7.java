package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import android.text.TextUtils;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicReference;
import vigqyno.C0201;

public final class q7 implements Runnable {
    private final /* synthetic */ AtomicReference a;
    private final /* synthetic */ String b;
    private final /* synthetic */ String c;
    private final /* synthetic */ String d;
    private final /* synthetic */ boolean e;
    private final /* synthetic */ d9 f;
    private final /* synthetic */ a7 g;

    public q7(a7 a7Var, AtomicReference atomicReference, String str, String str2, String str3, boolean z, d9 d9Var) {
        this.g = a7Var;
        this.a = atomicReference;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = z;
        this.f = d9Var;
    }

    public final void run() {
        synchronized (this.a) {
            try {
                b3 W = a7.W(this.g);
                if (W == null) {
                    this.g.e().E().c(C0201.m82(1973), k3.B(this.b), this.c, this.d);
                    this.a.set(Collections.emptyList());
                    return;
                }
                if (TextUtils.isEmpty(this.b)) {
                    this.a.set(W.O1(this.c, this.d, this.e, this.f));
                } else {
                    this.a.set(W.k0(this.b, this.c, this.d, this.e));
                }
                a7.Z(this.g);
                this.a.notify();
            } catch (RemoteException e2) {
                this.g.e().E().c(C0201.m82(1974), k3.B(this.b), this.c, e2);
                this.a.set(Collections.emptyList());
            } finally {
                this.a.notify();
            }
        }
    }
}
