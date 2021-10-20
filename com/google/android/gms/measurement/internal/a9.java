package com.google.android.gms.measurement.internal;

public final class a9 implements Runnable {
    private final /* synthetic */ jh1 a;
    private final /* synthetic */ AppMeasurementDynamiteService b;

    public a9(AppMeasurementDynamiteService appMeasurementDynamiteService, jh1 jh1) {
        this.b = appMeasurementDynamiteService;
        this.a = jh1;
    }

    public final void run() {
        this.b.a.T().G(this.a, this.b.a.E());
    }
}
