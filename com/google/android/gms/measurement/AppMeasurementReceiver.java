package com.google.android.gms.measurement;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.measurement.internal.e4;
import com.google.android.gms.measurement.internal.g4;

public final class AppMeasurementReceiver extends p4 implements g4 {
    private e4 c;

    @Override // com.google.android.gms.measurement.internal.g4
    public final void a(Context context, Intent intent) {
        p4.d(context, intent);
    }

    @Override // com.google.android.gms.measurement.internal.g4
    public final BroadcastReceiver.PendingResult b() {
        return goAsync();
    }

    public final void onReceive(Context context, Intent intent) {
        if (this.c == null) {
            this.c = new e4(this);
        }
        this.c.a(context, intent);
    }
}
