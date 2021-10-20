package com.google.android.play.core.assetpacks;

import android.os.Bundle;
import vigqyno.C0201;

public final class p extends l<Void> {
    public final int c;
    public final String d;
    public final int e;
    public final /* synthetic */ q f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public p(q qVar, d12<Void> d12, int i, String str, int i2) {
        super(qVar, d12);
        this.f = qVar;
        this.c = i;
        this.d = str;
        this.e = i2;
    }

    @Override // com.google.android.play.core.assetpacks.l, defpackage.rz1
    public final void a(Bundle bundle) {
        this.f.c.b();
        int i = bundle.getInt(C0201.m82(10427));
        q.f.e(C0201.m82(10428), Integer.valueOf(i));
        int i2 = this.e;
        if (i2 > 0) {
            this.f.h(this.c, this.d, i2 - 1);
        }
    }
}
