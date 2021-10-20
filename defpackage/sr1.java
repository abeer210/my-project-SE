package defpackage;

import android.os.Parcel;
import android.os.RemoteException;
import vigqyno.C0201;

/* renamed from: sr1  reason: default package */
public abstract class sr1 extends i31 implements rr1 {
    public sr1() {
        super(C0201.m82(34065));
    }

    @Override // defpackage.i31
    public final boolean i(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            return false;
        }
        onCameraMoveStarted(parcel.readInt());
        parcel2.writeNoException();
        return true;
    }
}
