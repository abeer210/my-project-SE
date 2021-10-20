package com.google.android.gms.measurement;

import android.annotation.TargetApi;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.Intent;
import com.google.android.gms.measurement.internal.c8;
import com.google.android.gms.measurement.internal.y7;

@TargetApi(24)
public final class AppMeasurementJobService extends JobService implements c8 {
    private y7<AppMeasurementJobService> a;

    private final y7<AppMeasurementJobService> c() {
        if (this.a == null) {
            this.a = new y7<>(this);
        }
        return this.a;
    }

    @Override // com.google.android.gms.measurement.internal.c8
    public final boolean C(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.measurement.internal.c8
    public final void a(Intent intent) {
    }

    @Override // com.google.android.gms.measurement.internal.c8
    @TargetApi(24)
    public final void b(JobParameters jobParameters, boolean z) {
        jobFinished(jobParameters, false);
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

    public final boolean onStartJob(JobParameters jobParameters) {
        return c().f(jobParameters);
    }

    public final boolean onStopJob(JobParameters jobParameters) {
        return false;
    }

    public final boolean onUnbind(Intent intent) {
        return c().g(intent);
    }
}
