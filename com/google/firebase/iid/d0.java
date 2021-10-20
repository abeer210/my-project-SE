package com.google.firebase.iid;

import android.content.Intent;

public final class d0 implements Runnable {
    private final /* synthetic */ Intent a;
    private final /* synthetic */ Intent b;
    private final /* synthetic */ f0 c;

    public d0(f0 f0Var, Intent intent, Intent intent2) {
        this.c = f0Var;
        this.a = intent;
        this.b = intent2;
    }

    public final void run() {
        this.c.e(this.a);
        this.c.a(this.b);
    }
}
