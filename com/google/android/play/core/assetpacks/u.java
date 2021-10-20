package com.google.android.play.core.assetpacks;

import android.os.Bundle;

public final /* synthetic */ class u implements Runnable {
    private final v a;
    private final Bundle b;

    public u(v vVar, Bundle bundle) {
        this.a = vVar;
        this.b = bundle;
    }

    public final void run() {
        this.a.f(this.b);
    }
}
