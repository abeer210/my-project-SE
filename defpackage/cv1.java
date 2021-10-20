package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import vigqyno.C0201;

/* renamed from: cv1  reason: default package */
public final class cv1 extends yh1 implements av1 {
    public cv1(IBinder iBinder) {
        super(iBinder, C0201.m82(34852));
    }

    @Override // defpackage.av1
    public final yu1 Q2(yq0 yq0, wu1 wu1) throws RemoteException {
        yu1 yu1;
        Parcel U3 = U3();
        pi1.a(U3, yq0);
        pi1.b(U3, wu1);
        Parcel V3 = V3(1, U3);
        IBinder readStrongBinder = V3.readStrongBinder();
        if (readStrongBinder == null) {
            yu1 = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface(C0201.m82(34853));
            if (queryLocalInterface instanceof yu1) {
                yu1 = (yu1) queryLocalInterface;
            } else {
                yu1 = new zu1(readStrongBinder);
            }
        }
        V3.recycle();
        return yu1;
    }
}
