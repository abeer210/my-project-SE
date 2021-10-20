package com.google.android.gms.measurement.internal;

import android.app.job.JobParameters;

public final /* synthetic */ class a8 implements Runnable {
    private final y7 a;
    private final k3 b;
    private final JobParameters c;

    public a8(y7 y7Var, k3 k3Var, JobParameters jobParameters) {
        this.a = y7Var;
        this.b = k3Var;
        this.c = jobParameters;
    }

    public final void run() {
        this.a.i(this.b, this.c);
    }
}
