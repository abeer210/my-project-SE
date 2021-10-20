package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import vigqyno.C0201;

/* renamed from: lq1  reason: default package */
public abstract class lq1 extends i31 implements kq1 {
    public lq1() {
        super(C0201.m82(2869));
    }

    @Override // defpackage.i31
    public final boolean i(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        tp1 tp1;
        if (i != 1) {
            return false;
        }
        IBinder readStrongBinder = parcel.readStrongBinder();
        if (readStrongBinder == null) {
            tp1 = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface(C0201.m82(2870));
            if (queryLocalInterface instanceof tp1) {
                tp1 = (tp1) queryLocalInterface;
            } else {
                tp1 = new jr1(readStrongBinder);
            }
        }
        W2(tp1);
        parcel2.writeNoException();
        return true;
    }
}
