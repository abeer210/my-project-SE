package com.google.android.gms.common.api.internal;

import android.os.DeadObjectException;
import android.os.RemoteException;
import android.os.TransactionTooLargeException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.g;
import com.google.android.gms.common.util.l;
import vigqyno.C0201;

public abstract class s1 {
    public s1(int i) {
    }

    public static Status a(RemoteException remoteException) {
        StringBuilder sb = new StringBuilder();
        if (l.b() && (remoteException instanceof TransactionTooLargeException)) {
            sb.append(C0201.m82(16143));
        }
        sb.append(remoteException.getLocalizedMessage());
        return new Status(8, sb.toString());
    }

    public abstract void b(Status status);

    public abstract void c(e3 e3Var, boolean z);

    public abstract void d(RuntimeException runtimeException);

    public abstract void f(g.a<?> aVar) throws DeadObjectException;
}
