package com.google.android.gms.vision.clearcut;

public final class a implements Runnable {
    private final /* synthetic */ int a;
    private final /* synthetic */ oj1 b;
    private final /* synthetic */ DynamiteClearcutLogger c;

    public a(DynamiteClearcutLogger dynamiteClearcutLogger, int i, oj1 oj1) {
        this.c = dynamiteClearcutLogger;
        this.a = i;
        this.b = oj1;
    }

    public final void run() {
        DynamiteClearcutLogger.zza(this.c).zzb(this.a, this.b);
    }
}
