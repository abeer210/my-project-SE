package com.google.android.play.core.assetpacks;

import android.content.Intent;

public final /* synthetic */ class s1 implements Runnable {
    private final t1 a;
    private final Intent b;

    public s1(t1 t1Var, Intent intent) {
        this.a = t1Var;
        this.b = intent;
    }

    public final void run() {
        this.a.h(this.b);
    }
}
