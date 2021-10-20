package defpackage;

import android.os.Parcel;
import android.os.RemoteException;
import vigqyno.C0201;

/* renamed from: pq1  reason: default package */
public abstract class pq1 extends i31 implements oq1 {
    public pq1() {
        super(C0201.m82(13862));
    }

    @Override // defpackage.i31
    public final boolean i(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            x2(a41.U3(parcel.readStrongBinder()));
        } else if (i == 2) {
            f3(a41.U3(parcel.readStrongBinder()));
        } else if (i != 3) {
            return false;
        } else {
            b3(a41.U3(parcel.readStrongBinder()));
        }
        parcel2.writeNoException();
        return true;
    }
}
