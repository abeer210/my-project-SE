package com.google.android.play.core.assetpacks;

import android.os.RemoteException;
import vigqyno.C0201;

public final class h extends hy1 {
    public final /* synthetic */ int b;
    public final /* synthetic */ String c;
    public final /* synthetic */ d12 d;
    public final /* synthetic */ int e;
    public final /* synthetic */ q f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public h(q qVar, d12 d12, int i, String str, d12 d122, int i2) {
        super(d12);
        this.f = qVar;
        this.b = i;
        this.c = str;
        this.d = d122;
        this.e = i2;
    }

    @Override // defpackage.hy1
    public final void a() {
        try {
            ((pz1) this.f.c.f()).y1(this.f.a, q.p(this.b, this.c), q.u(), new p(this.f, this.d, this.b, this.c, this.e));
        } catch (RemoteException e2) {
            q.f.d(e2, C0201.m82(10829), new Object[0]);
        }
    }
}
