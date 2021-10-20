package com.google.android.play.core.assetpacks;

public final /* synthetic */ class c2 implements Runnable {
    private final b0 a;

    private c2(b0 b0Var) {
        this.a = b0Var;
    }

    public static Runnable a(b0 b0Var) {
        return new c2(b0Var);
    }

    public final void run() {
        this.a.p();
    }
}
