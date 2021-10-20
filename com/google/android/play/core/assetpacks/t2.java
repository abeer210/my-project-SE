package com.google.android.play.core.assetpacks;

import java.util.List;

public final /* synthetic */ class t2 implements q02 {
    private final b0 a;

    private t2(b0 b0Var) {
        this.a = b0Var;
    }

    public static q02 a(b0 b0Var) {
        return new t2(b0Var);
    }

    @Override // defpackage.q02
    public final void onSuccess(Object obj) {
        this.a.g((List) obj);
    }
}
