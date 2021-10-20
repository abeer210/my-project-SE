package com.google.android.play.core.assetpacks;

public final /* synthetic */ class s implements Runnable {
    private final v a;
    private final AssetPackState b;

    public s(v vVar, AssetPackState assetPackState) {
        this.a = vVar;
        this.b = assetPackState;
    }

    public final void run() {
        this.a.b(this.b);
    }
}
