package defpackage;

import android.os.Parcel;
import android.os.RemoteException;
import vigqyno.C0201;

/* renamed from: ur1  reason: default package */
public abstract class ur1 extends i31 implements tr1 {
    public ur1() {
        super(C0201.m82(20045));
    }

    @Override // defpackage.i31
    public final boolean i(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            return false;
        }
        F1(r31.U3(parcel.readStrongBinder()));
        parcel2.writeNoException();
        return true;
    }
}
