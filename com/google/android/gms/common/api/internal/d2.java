package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.f;
import com.google.android.gms.common.api.m;

/* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
public final class d2 implements Runnable {
    private final /* synthetic */ m a;
    private final /* synthetic */ a2 b;

    public d2(a2 a2Var, m mVar) {
        this.b = a2Var;
        this.a = mVar;
    }

    public final void run() {
        try {
            BasePendingResult.p.set(Boolean.TRUE);
            this.b.g.sendMessage(this.b.g.obtainMessage(0, this.b.a.b(this.a)));
            BasePendingResult.p.set(Boolean.FALSE);
            a2 a2Var = this.b;
            a2.c(this.a);
            f fVar = (f) this.b.f.get();
            if (fVar != null) {
                fVar.r(this.b);
            }
        } catch (RuntimeException e) {
            this.b.g.sendMessage(this.b.g.obtainMessage(1, e));
            BasePendingResult.p.set(Boolean.FALSE);
            a2 a2Var2 = this.b;
            a2.c(this.a);
            f fVar2 = (f) this.b.f.get();
            if (fVar2 != null) {
                fVar2.r(this.b);
            }
        } catch (Throwable th) {
            BasePendingResult.p.set(Boolean.FALSE);
            a2 a2Var3 = this.b;
            a2.c(this.a);
            f fVar3 = (f) this.b.f.get();
            if (fVar3 != null) {
                fVar3.r(this.b);
            }
            throw th;
        }
    }
}
