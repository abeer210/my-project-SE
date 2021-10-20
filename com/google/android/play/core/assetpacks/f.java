package com.google.android.play.core.assetpacks;

import android.os.RemoteException;
import java.util.Map;
import vigqyno.C0201;

public final class f extends hy1 {
    public final /* synthetic */ Map b;
    public final /* synthetic */ d12 c;
    public final /* synthetic */ q d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public f(q qVar, d12 d12, Map map, d12 d122) {
        super(d12);
        this.d = qVar;
        this.b = map;
        this.c = d122;
    }

    @Override // defpackage.hy1
    public final void a() {
        try {
            ((pz1) this.d.c.f()).v1(this.d.a, q.l(this.b), new n(this.d, this.c));
        } catch (RemoteException e) {
            q.f.d(e, C0201.m82(10736), new Object[0]);
            this.c.d(new RuntimeException(e));
        }
    }
}
