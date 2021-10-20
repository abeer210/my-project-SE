package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import android.text.TextUtils;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicReference;
import vigqyno.C0201;

public final class o7 implements Runnable {
    private final /* synthetic */ AtomicReference a;
    private final /* synthetic */ String b;
    private final /* synthetic */ String c;
    private final /* synthetic */ String d;
    private final /* synthetic */ d9 e;
    private final /* synthetic */ a7 f;

    public o7(a7 a7Var, AtomicReference atomicReference, String str, String str2, String str3, d9 d9Var) {
        this.f = a7Var;
        this.a = atomicReference;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = d9Var;
    }

    public final void run() {
        synchronized (this.a) {
            try {
                b3 W = a7.W(this.f);
                if (W == null) {
                    this.f.e().E().c(C0201.m82(16159), k3.B(this.b), this.c, this.d);
                    this.a.set(Collections.emptyList());
                    return;
                }
                if (TextUtils.isEmpty(this.b)) {
                    this.a.set(W.q1(this.c, this.d, this.e));
                } else {
                    this.a.set(W.u2(this.b, this.c, this.d));
                }
                a7.Z(this.f);
                this.a.notify();
            } catch (RemoteException e2) {
                this.f.e().E().c(C0201.m82(16160), k3.B(this.b), this.c, e2);
                this.a.set(Collections.emptyList());
            } finally {
                this.a.notify();
            }
        }
    }
}
