package com.google.android.gms.measurement.internal;

import android.content.Context;
import com.google.android.gms.common.internal.u;

public final class s8 {
    public final Context a;

    public s8(Context context) {
        u.k(context);
        Context applicationContext = context.getApplicationContext();
        u.k(applicationContext);
        this.a = applicationContext;
    }
}
