package com.google.android.play.core.assetpacks;

import android.content.ComponentName;
import android.content.Context;
import com.google.android.play.core.common.PlayCoreDialogWrapperActivity;
import vigqyno.C0201;

public final class c3 implements iz1<Object> {
    private final iz1<v2> a;
    private final iz1<Context> b;

    public c3(iz1<v2> iz1, iz1<Context> iz12) {
        this.a = iz1;
        this.b = iz12;
    }

    @Override // defpackage.iz1
    public final /* bridge */ /* synthetic */ Object a() {
        v2 a2 = this.a.a();
        Context b2 = ((e3) this.b).a();
        v2 v2Var = a2;
        ty1.a(b2.getPackageManager(), new ComponentName(b2.getPackageName(), C0201.m82(36326)), 4);
        PlayCoreDialogWrapperActivity.a(b2);
        ty1.g(v2Var);
        return v2Var;
    }
}
