package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import vigqyno.C0201;

/* renamed from: ih1  reason: default package */
public abstract class ih1 extends g41 implements jh1 {
    public ih1() {
        super(C0201.m82(3483));
    }

    @Override // defpackage.g41
    public final boolean i(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            return false;
        }
        q2((Bundle) m71.b(parcel, Bundle.CREATOR));
        parcel2.writeNoException();
        return true;
    }
}
