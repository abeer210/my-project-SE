package com.google.android.play.core.assetpacks;

import android.os.Bundle;
import vigqyno.C0201;

public final class o extends l<Void> {
    public final /* synthetic */ q c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public o(q qVar, d12<Void> d12) {
        super(qVar, d12);
        this.c = qVar;
    }

    @Override // com.google.android.play.core.assetpacks.l, defpackage.rz1
    public final void a(Bundle bundle, Bundle bundle2) {
        super.a(bundle, bundle2);
        if (!this.c.e.compareAndSet(true, false)) {
            q.f.g(C0201.m82(10424), new Object[0]);
        }
        if (bundle.getBoolean(C0201.m82(10425))) {
            this.c.a();
        }
    }
}
