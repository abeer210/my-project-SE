package com.google.android.play.core.assetpacks;

import android.os.RemoteException;
import vigqyno.C0201;

public final class k extends hy1 {
    public final /* synthetic */ d12 b;
    public final /* synthetic */ q c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public k(q qVar, d12 d12, d12 d122) {
        super(d12);
        this.c = qVar;
        this.b = d122;
    }

    @Override // defpackage.hy1
    public final void a() {
        try {
            ((pz1) this.c.d.f()).Q0(this.c.a, q.u(), new o(this.c, this.b));
        } catch (RemoteException e) {
            q.f.d(e, C0201.m82(10262), new Object[0]);
        }
    }
}
