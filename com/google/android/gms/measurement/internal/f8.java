package com.google.android.gms.measurement.internal;

public final class f8 implements Runnable {
    private final /* synthetic */ jh1 a;
    private final /* synthetic */ j b;
    private final /* synthetic */ String c;
    private final /* synthetic */ AppMeasurementDynamiteService d;

    public f8(AppMeasurementDynamiteService appMeasurementDynamiteService, jh1 jh1, j jVar, String str) {
        this.d = appMeasurementDynamiteService;
        this.a = jh1;
        this.b = jVar;
        this.c = str;
    }

    public final void run() {
        this.d.a.N().I(this.a, this.b, this.c);
    }
}
