package defpackage;

import android.location.Location;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import vigqyno.C0201;

/* renamed from: dq1  reason: default package */
public final class dq1 extends z21 implements cq1 {
    public dq1(IBinder iBinder) {
        super(iBinder, C0201.m82(15896));
    }

    @Override // defpackage.cq1
    public final void p1(Location location) throws RemoteException {
        Parcel U3 = U3();
        j31.d(U3, location);
        W3(2, U3);
    }
}
