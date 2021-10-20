package com.google.android.play.core.assetpacks;

import android.os.RemoteException;
import vigqyno.C0201;

public final class j extends hy1 {
    public final /* synthetic */ int b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String d;
    public final /* synthetic */ int e;
    public final /* synthetic */ d12 f;
    public final /* synthetic */ q g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public j(q qVar, d12 d12, int i, String str, String str2, int i2, d12 d122) {
        super(d12);
        this.g = qVar;
        this.b = i;
        this.c = str;
        this.d = str2;
        this.e = i2;
        this.f = d122;
    }

    @Override // defpackage.hy1
    public final void a() {
        try {
            ((pz1) this.g.c.f()).G2(this.g.a, q.q(this.b, this.c, this.d, this.e), q.u(), new m(this.g, this.f));
        } catch (RemoteException e2) {
            q.f.e(C0201.m82(10121), this.c, this.d, Integer.valueOf(this.e), Integer.valueOf(this.b));
            this.f.d(new RuntimeException(e2));
        }
    }
}
