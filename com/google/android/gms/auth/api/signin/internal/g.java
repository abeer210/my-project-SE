package com.google.android.gms.auth.api.signin.internal;

import android.content.Context;
import android.util.Log;
import com.google.android.gms.common.api.f;
import com.google.android.gms.common.api.internal.p;
import java.util.Set;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;
import vigqyno.C0201;

public final class g extends s4<Void> implements p {
    private Semaphore p = new Semaphore(0);
    private Set<f> q;

    public g(Context context, Set<f> set) {
        super(context);
        this.q = set;
    }

    /* access modifiers changed from: private */
    /* renamed from: J */
    public final Void G() {
        int i = 0;
        for (f fVar : this.q) {
            if (fVar.n(this)) {
                i++;
            }
        }
        try {
            this.p.tryAcquire(i, 5, TimeUnit.SECONDS);
            return null;
        } catch (InterruptedException e) {
            Log.i(C0201.m82(36584), C0201.m82(36585), e);
            Thread.currentThread().interrupt();
            return null;
        }
    }

    @Override // com.google.android.gms.common.api.internal.p
    public final void a() {
        this.p.release();
    }

    @Override // defpackage.u4
    public final void s() {
        this.p.drainPermits();
        i();
    }
}
