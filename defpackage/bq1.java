package defpackage;

import android.os.Parcel;
import android.os.RemoteException;
import vigqyno.C0201;

/* renamed from: bq1  reason: default package */
public abstract class bq1 extends i31 implements aq1 {
    public bq1() {
        super(C0201.m82(30761));
    }

    @Override // defpackage.i31
    public final boolean i(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            return false;
        }
        D3(a41.U3(parcel.readStrongBinder()));
        parcel2.writeNoException();
        return true;
    }
}
