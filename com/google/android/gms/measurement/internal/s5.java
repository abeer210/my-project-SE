package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.common.internal.u;
import vigqyno.C0201;

public final class s5 {
    public final Context a;
    public String b;
    public String c;
    public String d;
    public Boolean e;
    public long f;
    public qh1 g;
    public boolean h = true;

    public s5(Context context, qh1 qh1) {
        u.k(context);
        Context applicationContext = context.getApplicationContext();
        u.k(applicationContext);
        this.a = applicationContext;
        if (qh1 != null) {
            this.g = qh1;
            this.b = qh1.f;
            this.c = qh1.e;
            this.d = qh1.d;
            this.h = qh1.c;
            this.f = qh1.b;
            Bundle bundle = qh1.g;
            if (bundle != null) {
                this.e = Boolean.valueOf(bundle.getBoolean(C0201.m82(3606), true));
            }
        }
    }
}
