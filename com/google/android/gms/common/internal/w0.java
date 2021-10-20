package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import vigqyno.C0201;

/* compiled from: com.google.android.gms:play-services-basement@@17.1.0 */
public final class w0 extends i01 implements v0 {
    public w0(IBinder iBinder) {
        super(iBinder, C0201.m82(32818));
    }

    @Override // com.google.android.gms.common.internal.v0
    public final boolean h3(rq0 rq0, yq0 yq0) throws RemoteException {
        Parcel U3 = U3();
        j01.d(U3, rq0);
        j01.c(U3, yq0);
        Parcel V3 = V3(5, U3);
        boolean e = j01.e(V3);
        V3.recycle();
        return e;
    }
}
