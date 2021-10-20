package com.google.android.gms.measurement.internal;

public final class e6 implements Runnable {
    private final /* synthetic */ jh1 a;
    private final /* synthetic */ AppMeasurementDynamiteService b;

    public e6(AppMeasurementDynamiteService appMeasurementDynamiteService, jh1 jh1) {
        this.b = appMeasurementDynamiteService;
        this.a = jh1;
    }

    public final void run() {
        this.b.a.N().C(this.a);
    }
}
