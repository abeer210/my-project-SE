package defpackage;

import android.os.Parcel;
import android.os.RemoteException;
import vigqyno.C0201;

/* renamed from: wq1  reason: default package */
public abstract class wq1 extends i31 implements vq1 {
    public wq1() {
        super(C0201.m82(2775));
    }

    @Override // defpackage.i31
    public final boolean i(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            return false;
        }
        e3(d41.U3(parcel.readStrongBinder()));
        parcel2.writeNoException();
        return true;
    }
}
