package com.google.android.gms.common.api.internal;

import android.os.IBinder;
import com.google.android.gms.common.api.t;
import java.lang.ref.WeakReference;
import java.util.NoSuchElementException;

/* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
public final class h2 implements IBinder.DeathRecipient, g2 {
    private final WeakReference<BasePendingResult<?>> a;
    private final WeakReference<t> b;
    private final WeakReference<IBinder> c;

    private h2(BasePendingResult<?> basePendingResult, t tVar, IBinder iBinder) {
        this.b = new WeakReference<>(tVar);
        this.a = new WeakReference<>(basePendingResult);
        this.c = new WeakReference<>(iBinder);
    }

    private final void b() {
        BasePendingResult<?> basePendingResult = this.a.get();
        t tVar = this.b.get();
        if (!(tVar == null || basePendingResult == null)) {
            tVar.a(basePendingResult.r().intValue());
        }
        IBinder iBinder = this.c.get();
        if (iBinder != null) {
            try {
                iBinder.unlinkToDeath(this, 0);
            } catch (NoSuchElementException unused) {
            }
        }
    }

    @Override // com.google.android.gms.common.api.internal.g2
    public final void a(BasePendingResult<?> basePendingResult) {
        b();
    }

    public final void binderDied() {
        b();
    }

    public /* synthetic */ h2(BasePendingResult basePendingResult, t tVar, IBinder iBinder, e2 e2Var) {
        this(basePendingResult, null, iBinder);
    }
}
