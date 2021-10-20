package com.google.android.gms.measurement.internal;

import android.os.Bundle;

public final class b6 implements Runnable {
    private final /* synthetic */ Bundle a;
    private final /* synthetic */ v5 b;

    public b6(v5 v5Var, Bundle bundle) {
        this.b = v5Var;
        this.a = bundle;
    }

    public final void run() {
        this.b.p0(this.a);
    }
}
