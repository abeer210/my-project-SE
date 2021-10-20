package com.google.android.gms.common.api.internal;

import android.os.DeadObjectException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.internal.d;
import com.google.android.gms.common.api.internal.g;
import com.google.android.gms.common.api.m;
import vigqyno.C0201;

/* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
public final class i2<A extends d<? extends m, a.b>> extends s1 {
    private final A a;

    public i2(int i, A a2) {
        super(i);
        this.a = a2;
    }

    @Override // com.google.android.gms.common.api.internal.s1
    public final void b(Status status) {
        this.a.A(status);
    }

    @Override // com.google.android.gms.common.api.internal.s1
    public final void c(e3 e3Var, boolean z) {
        e3Var.b(this.a, z);
    }

    @Override // com.google.android.gms.common.api.internal.s1
    public final void d(RuntimeException runtimeException) {
        String simpleName = runtimeException.getClass().getSimpleName();
        String localizedMessage = runtimeException.getLocalizedMessage();
        StringBuilder sb = new StringBuilder(String.valueOf(simpleName).length() + 2 + String.valueOf(localizedMessage).length());
        sb.append(simpleName);
        sb.append(C0201.m82(146));
        sb.append(localizedMessage);
        this.a.A(new Status(10, sb.toString()));
    }

    @Override // com.google.android.gms.common.api.internal.s1
    public final void f(g.a<?> aVar) throws DeadObjectException {
        try {
            this.a.y(aVar.m());
        } catch (RuntimeException e) {
            d(e);
        }
    }
}
