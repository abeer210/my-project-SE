package com.google.android.play.core.assetpacks;

import android.os.RemoteException;
import java.util.List;
import vigqyno.C0201;

public final class e extends hy1 {
    public final /* synthetic */ List b;
    public final /* synthetic */ d12 c;
    public final /* synthetic */ q d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public e(q qVar, d12 d12, List list, d12 d122) {
        super(d12);
        this.d = qVar;
        this.b = list;
        this.c = d122;
    }

    @Override // defpackage.hy1
    public final void a() {
        try {
            ((pz1) this.d.c.f()).V2(this.d.a, q.f(this.b), q.u(), new l(this.d, this.c, (byte[]) null));
        } catch (RemoteException e) {
            q.f.d(e, C0201.m82(10812), this.b);
        }
    }
}
