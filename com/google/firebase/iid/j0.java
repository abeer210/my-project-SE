package com.google.firebase.iid;

import android.os.Binder;
import android.os.Process;
import android.util.Log;

public final class j0 extends Binder {
    private final f0 a;

    public j0(f0 f0Var) {
        this.a = f0Var;
    }

    public final void b(h0 h0Var) {
        if (Binder.getCallingUid() == Process.myUid()) {
            if (Log.isLoggable("EnhancedIntentService", 3)) {
                Log.d("EnhancedIntentService", "service received new intent via bind strategy");
            }
            if (this.a.d(h0Var.a)) {
                h0Var.a();
                return;
            }
            if (Log.isLoggable("EnhancedIntentService", 3)) {
                Log.d("EnhancedIntentService", "intent being queued for bg execution");
            }
            this.a.a.execute(new i0(this, h0Var));
            return;
        }
        throw new SecurityException("Binding only allowed within app");
    }
}
