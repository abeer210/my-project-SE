package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import vigqyno.C0201;

/* renamed from: ci1  reason: default package */
public final class ci1 extends yh1 implements bi1 {
    public ci1(IBinder iBinder) {
        super(iBinder, C0201.m82(9664));
    }

    @Override // defpackage.bi1
    public final zh1 f2(yq0 yq0, ki1 ki1) throws RemoteException {
        zh1 zh1;
        Parcel U3 = U3();
        pi1.a(U3, yq0);
        pi1.b(U3, ki1);
        Parcel V3 = V3(1, U3);
        IBinder readStrongBinder = V3.readStrongBinder();
        if (readStrongBinder == null) {
            zh1 = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface(C0201.m82(9665));
            if (queryLocalInterface instanceof zh1) {
                zh1 = (zh1) queryLocalInterface;
            } else {
                zh1 = new ai1(readStrongBinder);
            }
        }
        V3.recycle();
        return zh1;
    }
}
