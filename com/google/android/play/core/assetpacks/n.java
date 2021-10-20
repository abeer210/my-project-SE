package com.google.android.play.core.assetpacks;

import android.os.Bundle;
import java.util.List;

public final class n extends l<List<String>> {
    public final /* synthetic */ q c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public n(q qVar, d12<List<String>> d12) {
        super(qVar, d12);
        this.c = qVar;
    }

    @Override // com.google.android.play.core.assetpacks.l, defpackage.rz1
    public final void a(List<Bundle> list) {
        super.a(list);
        this.a.e(q.g(this.c, list));
    }
}
