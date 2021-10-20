package defpackage;

import android.os.Parcel;
import android.os.RemoteException;
import vigqyno.C0201;

/* renamed from: zp1  reason: default package */
public abstract class zp1 extends i31 implements vr1 {
    public zp1() {
        super(C0201.m82(19273));
    }

    @Override // defpackage.i31
    public final boolean i(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            onIndoorBuildingFocused();
        } else if (i != 2) {
            return false;
        } else {
            N2(u31.U3(parcel.readStrongBinder()));
        }
        parcel2.writeNoException();
        return true;
    }
}
