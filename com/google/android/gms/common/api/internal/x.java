package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.h;

/* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
public final class x implements h.a {
    private final /* synthetic */ BasePendingResult a;
    private final /* synthetic */ e3 b;

    public x(e3 e3Var, BasePendingResult basePendingResult) {
        this.b = e3Var;
        this.a = basePendingResult;
    }

    @Override // com.google.android.gms.common.api.h.a
    public final void a(Status status) {
        e3.a(this.b).remove(this.a);
    }
}
