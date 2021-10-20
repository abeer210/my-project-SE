package com.google.android.gms.common.api.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.a.b;
import com.google.android.gms.common.api.internal.k;

/* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
public abstract class u<A extends a.b, L> {
    private final k.a<L> a;

    public u(k.a<L> aVar) {
        this.a = aVar;
    }

    public k.a<L> a() {
        return this.a;
    }

    public abstract void b(A a2, at1<Boolean> at1) throws RemoteException;
}
