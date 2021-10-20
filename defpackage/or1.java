package defpackage;

import android.os.Parcel;
import android.os.RemoteException;
import vigqyno.C0201;

/* renamed from: or1  reason: default package */
public abstract class or1 extends i31 implements nr1 {
    public or1() {
        super(C0201.m82(24143));
    }

    @Override // defpackage.i31
    public final boolean i(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            return false;
        }
        onCameraIdle();
        parcel2.writeNoException();
        return true;
    }
}
