package defpackage;

import android.os.Parcel;
import android.os.RemoteException;
import vigqyno.C0201;

/* renamed from: hq1  reason: default package */
public abstract class hq1 extends i31 implements gq1 {
    public hq1() {
        super(C0201.m82(27576));
    }

    @Override // defpackage.i31
    public final boolean i(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            return false;
        }
        onMapLoaded();
        parcel2.writeNoException();
        return true;
    }
}
