package com.google.android.gms.common.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.k;

/* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
public class b {
    public static com.google.android.gms.common.api.b a(Status status) {
        if (status.r()) {
            return new k(status);
        }
        return new com.google.android.gms.common.api.b(status);
    }
}
