package com.google.android.gms.measurement.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.os.Bundle;
import vigqyno.C0201;

public final class h4 implements Runnable {
    private final /* synthetic */ o4 a;
    private final /* synthetic */ long b;
    private final /* synthetic */ Bundle c;
    private final /* synthetic */ Context d;
    private final /* synthetic */ k3 e;
    private final /* synthetic */ BroadcastReceiver.PendingResult f;

    public h4(e4 e4Var, o4 o4Var, long j, Bundle bundle, Context context, k3 k3Var, BroadcastReceiver.PendingResult pendingResult) {
        this.a = o4Var;
        this.b = j;
        this.c = bundle;
        this.d = context;
        this.e = k3Var;
        this.f = pendingResult;
    }

    public final void run() {
        long a2 = this.a.q().j.a();
        long j = this.b;
        if (a2 > 0 && (j >= a2 || j <= 0)) {
            j = a2 - 1;
        }
        if (j > 0) {
            this.c.putLong(C0201.m82(38828), j);
        }
        this.c.putString(C0201.m82(38829), C0201.m82(38830));
        o4.g(this.d, null).L().I(C0201.m82(38831), C0201.m82(38832), this.c);
        this.e.M().d(C0201.m82(38833));
        BroadcastReceiver.PendingResult pendingResult = this.f;
        if (pendingResult != null) {
            pendingResult.finish();
        }
    }
}
