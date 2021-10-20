package com.google.android.gms.measurement.internal;

public final class e7 implements Runnable {
    private final /* synthetic */ jh1 a;
    private final /* synthetic */ String b;
    private final /* synthetic */ String c;
    private final /* synthetic */ boolean d;
    private final /* synthetic */ AppMeasurementDynamiteService e;

    public e7(AppMeasurementDynamiteService appMeasurementDynamiteService, jh1 jh1, String str, String str2, boolean z) {
        this.e = appMeasurementDynamiteService;
        this.a = jh1;
        this.b = str;
        this.c = str2;
        this.d = z;
    }

    public final void run() {
        this.e.a.N().K(this.a, this.b, this.c, this.d);
    }
}
