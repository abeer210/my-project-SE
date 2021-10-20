package com.google.android.gms.measurement.internal;

public final class i5 implements Runnable {
    private final /* synthetic */ String a;
    private final /* synthetic */ String b;
    private final /* synthetic */ String c;
    private final /* synthetic */ long d;
    private final /* synthetic */ p4 e;

    public i5(p4 p4Var, String str, String str2, String str3, long j) {
        this.e = p4Var;
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = j;
    }

    public final void run() {
        String str = this.a;
        if (str == null) {
            this.e.a.g0().O().M(this.b, null);
            return;
        }
        this.e.a.g0().O().M(this.b, new w6(this.c, str, this.d));
    }
}
