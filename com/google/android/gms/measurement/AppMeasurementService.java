package com.google.android.gms.measurement;

import android.app.Service;
import android.app.job.JobParameters;
import android.content.Intent;
import android.os.IBinder;
import com.google.android.gms.measurement.internal.c8;
import com.google.android.gms.measurement.internal.y7;

public final class AppMeasurementService extends Service implements c8 {
    private y7<AppMeasurementService> a;

    private final y7<AppMeasurementService> c() {
        if (this.a == null) {
            this.a = new y7<>(this);
        }
        return this.a;
    }

    @Override // com.google.android.gms.measurement.internal.c8
    public final boolean C(int i) {
        return stopSelfResult(i);
    }

    @Override // com.google.android.gms.measurement.internal.c8
    public final void a(Intent intent) {
        p4.c(intent);
    }

    @Override // com.google.android.gms.measurement.internal.c8
    public final void b(JobParameters jobParameters, boolean z) {
        throw new UnsupportedOperationException();
    }

    public final IBinder onBind(Intent intent) {
        return c().a(intent);
    }

    public final void onCreate() {
        super.onCreate();
        c().b();
    }

    public final void onDestroy() {
        c().c();
        super.onDestroy();
    }

    public final void onRebind(Intent intent) {
        c().d(intent);
    }

    public final int onStartCommand(Intent intent, int i, int i2) {
        return c().e(intent, i, i2);
    }

    public final boolean onUnbind(Intent intent) {
        return c().g(intent);
    }
}
