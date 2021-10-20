package com.google.android.gms.common.api.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.a.b;
import com.google.android.gms.common.api.internal.k;

/* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
public abstract class n<A extends a.b, L> {
    private final k<L> a;
    private final xo0[] b = null;
    private final boolean c = false;

    public n(k<L> kVar) {
        this.a = kVar;
    }

    public void a() {
        this.a.a();
    }

    public k.a<L> b() {
        return this.a.b();
    }

    public xo0[] c() {
        return this.b;
    }

    public abstract void d(A a2, at1<Void> at1) throws RemoteException;

    public final boolean e() {
        return this.c;
    }
}
