package com.google.android.gms.measurement.internal;

public final class b9 implements Runnable {
    private final /* synthetic */ jh1 a;
    private final /* synthetic */ String b;
    private final /* synthetic */ String c;
    private final /* synthetic */ AppMeasurementDynamiteService d;

    public b9(AppMeasurementDynamiteService appMeasurementDynamiteService, jh1 jh1, String str, String str2) {
        this.d = appMeasurementDynamiteService;
        this.a = jh1;
        this.b = str;
        this.c = str2;
    }

    public final void run() {
        this.d.a.N().J(this.a, this.b, this.c);
    }
}
