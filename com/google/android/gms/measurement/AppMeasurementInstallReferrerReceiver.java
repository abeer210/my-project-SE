package com.google.android.gms.measurement;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.measurement.internal.e4;
import com.google.android.gms.measurement.internal.g4;

public final class AppMeasurementInstallReferrerReceiver extends BroadcastReceiver implements g4 {
    private e4 a;

    @Override // com.google.android.gms.measurement.internal.g4
    public final void a(Context context, Intent intent) {
    }

    @Override // com.google.android.gms.measurement.internal.g4
    public final BroadcastReceiver.PendingResult b() {
        return goAsync();
    }

    public final void onReceive(Context context, Intent intent) {
        if (this.a == null) {
            this.a = new e4(this);
        }
        this.a.a(context, intent);
    }
}
