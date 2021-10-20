package com.google.android.play.core.assetpacks;

import android.os.RemoteException;
import vigqyno.C0201;

public final class i extends hy1 {
    public final /* synthetic */ int b;
    public final /* synthetic */ d12 c;
    public final /* synthetic */ q d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public i(q qVar, d12 d12, int i, d12 d122) {
        super(d12);
        this.d = qVar;
        this.b = i;
        this.c = d122;
    }

    @Override // defpackage.hy1
    public final void a() {
        try {
            ((pz1) this.d.c.f()).d2(this.d.a, q.o(this.b), q.u(), new l(this.d, this.c, (int[]) null));
        } catch (RemoteException e) {
            q.f.d(e, C0201.m82(10200), new Object[0]);
        }
    }
}
