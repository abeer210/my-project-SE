package com.google.android.play.core.assetpacks;

import android.os.Bundle;

public final /* synthetic */ class t implements Runnable {
    private final v a;
    private final Bundle b;
    private final AssetPackState c;

    public t(v vVar, Bundle bundle, AssetPackState assetPackState) {
        this.a = vVar;
        this.b = bundle;
        this.c = assetPackState;
    }

    public final void run() {
        this.a.g(this.b, this.c);
    }
}
