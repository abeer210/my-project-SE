package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import vigqyno.C0201;

/* renamed from: xp0  reason: default package */
/* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
public final class xp0 extends xs0 implements yp0 {
    public xp0(IBinder iBinder) {
        super(iBinder, C0201.m82(32969));
    }

    @Override // defpackage.yp0
    public final void o3(wp0 wp0) throws RemoteException {
        Parcel U3 = U3();
        ys0.c(U3, wp0);
        W3(1, U3);
    }
}
