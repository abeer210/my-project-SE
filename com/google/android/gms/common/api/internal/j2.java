package com.google.android.gms.common.api.internal;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.b;
import com.google.android.gms.common.api.internal.g;

/* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
public abstract class j2<T> extends v0 {
    public final at1<T> a;

    public j2(int i, at1<T> at1) {
        super(i);
        this.a = at1;
    }

    @Override // com.google.android.gms.common.api.internal.s1
    public void b(Status status) {
        this.a.d(new b(status));
    }

    @Override // com.google.android.gms.common.api.internal.s1
    public void d(RuntimeException runtimeException) {
        this.a.d(runtimeException);
    }

    @Override // com.google.android.gms.common.api.internal.s1
    public final void f(g.a<?> aVar) throws DeadObjectException {
        try {
            i(aVar);
        } catch (DeadObjectException e) {
            b(s1.a(e));
            throw e;
        } catch (RemoteException e2) {
            b(s1.a(e2));
        } catch (RuntimeException e3) {
            d(e3);
        }
    }

    public abstract void i(g.a<?> aVar) throws RemoteException;
}
