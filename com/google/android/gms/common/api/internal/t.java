package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.b;

/* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
public class t {
    public static void a(Status status, at1<Void> at1) {
        b(status, null, at1);
    }

    public static <TResult> void b(Status status, TResult tresult, at1<TResult> at1) {
        if (status.s()) {
            at1.c(tresult);
        } else {
            at1.b(new b(status));
        }
    }

    @Deprecated
    public static zs1<Void> c(zs1<Boolean> zs1) {
        return zs1.h(new b2());
    }
}
