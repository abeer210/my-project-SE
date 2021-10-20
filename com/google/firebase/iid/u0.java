package com.google.firebase.iid;

import android.os.Bundle;

public final /* synthetic */ class u0 implements Runnable {
    private final v0 a;
    private final Bundle b;
    private final at1 c;

    public u0(v0 v0Var, Bundle bundle, at1 at1) {
        this.a = v0Var;
        this.b = bundle;
        this.c = at1;
    }

    public final void run() {
        this.a.k(this.b, this.c);
    }
}
