package com.google.firebase.iid;

import android.content.Intent;
import android.util.Log;

public final /* synthetic */ class g0 implements Runnable {
    private final h0 a;
    private final Intent b;

    public g0(h0 h0Var, Intent intent) {
        this.a = h0Var;
        this.b = intent;
    }

    public final void run() {
        h0 h0Var = this.a;
        String action = this.b.getAction();
        StringBuilder sb = new StringBuilder(String.valueOf(action).length() + 61);
        sb.append("Service took too long to process intent: ");
        sb.append(action);
        sb.append(" App may get closed.");
        Log.w("EnhancedIntentService", sb.toString());
        h0Var.a();
    }
}
