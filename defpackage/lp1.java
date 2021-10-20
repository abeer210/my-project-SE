package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import vigqyno.C0201;

/* renamed from: lp1  reason: default package */
public final class lp1 extends yh1 implements no1 {
    public lp1(IBinder iBinder) {
        super(iBinder, C0201.m82(34978));
    }

    @Override // defpackage.no1
    public final nm1 X1(yq0 yq0, pj1 pj1) throws RemoteException {
        nm1 nm1;
        Parcel U3 = U3();
        pi1.a(U3, yq0);
        pi1.b(U3, pj1);
        Parcel V3 = V3(1, U3);
        IBinder readStrongBinder = V3.readStrongBinder();
        if (readStrongBinder == null) {
            nm1 = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface(C0201.m82(34979));
            if (queryLocalInterface instanceof nm1) {
                nm1 = (nm1) queryLocalInterface;
            } else {
                nm1 = new mn1(readStrongBinder);
            }
        }
        V3.recycle();
        return nm1;
    }
}
