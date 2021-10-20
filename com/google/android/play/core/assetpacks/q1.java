package com.google.android.play.core.assetpacks;

public final /* synthetic */ class q1 implements Runnable {
    private final t1 a;
    private final int b;
    private final String c;

    public q1(t1 t1Var, int i, String str) {
        this.a = t1Var;
        this.b = i;
        this.c = str;
    }

    public final void run() {
        this.a.i(this.b, this.c);
    }
}
