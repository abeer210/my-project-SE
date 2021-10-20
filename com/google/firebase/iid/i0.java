package com.google.firebase.iid;

import android.util.Log;

public final class i0 implements Runnable {
    private final /* synthetic */ h0 a;
    private final /* synthetic */ j0 b;

    public i0(j0 j0Var, h0 h0Var) {
        this.b = j0Var;
        this.a = h0Var;
    }

    public final void run() {
        if (Log.isLoggable("EnhancedIntentService", 3)) {
            Log.d("EnhancedIntentService", "bg processing of the intent starting now");
        }
        this.b.a.e(this.a.a);
        this.a.a();
    }
}
