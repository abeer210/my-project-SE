package com.google.android.gms.common.api.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import vigqyno.C0201;

/* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
public final class m1 extends BroadcastReceiver {
    private Context a;
    private final l1 b;

    public m1(l1 l1Var) {
        this.b = l1Var;
    }

    public final synchronized void a() {
        if (this.a != null) {
            this.a.unregisterReceiver(this);
        }
        this.a = null;
    }

    public final void b(Context context) {
        this.a = context;
    }

    public final void onReceive(Context context, Intent intent) {
        Uri data = intent.getData();
        if (C0201.m82(30912).equals(data != null ? data.getSchemeSpecificPart() : null)) {
            this.b.a();
            a();
        }
    }
}
