package com.google.firebase.iid;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.util.Log;

public final class e0 extends BroadcastReceiver {
    private a0 a;

    public e0(a0 a0Var) {
        this.a = a0Var;
    }

    public final void a() {
        if (FirebaseInstanceId.B()) {
            Log.d("FirebaseInstanceId", "Connectivity change received registered");
        }
        this.a.a().registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
    }

    public final void onReceive(Context context, Intent intent) {
        a0 a0Var = this.a;
        if (a0Var != null && a0Var.c()) {
            if (FirebaseInstanceId.B()) {
                Log.d("FirebaseInstanceId", "Connectivity changed. Starting background sync.");
            }
            FirebaseInstanceId.n(this.a, 0);
            this.a.a().unregisterReceiver(this);
            this.a = null;
        }
    }
}
