package defpackage;

import android.os.Parcel;
import android.os.RemoteException;
import vigqyno.C0201;

/* renamed from: lr1  reason: default package */
public abstract class lr1 extends i31 implements kr1 {
    public lr1() {
        super(C0201.m82(56));
    }

    @Override // defpackage.i31
    public final boolean i(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            yq0 V0 = V0(a41.U3(parcel.readStrongBinder()));
            parcel2.writeNoException();
            j31.c(parcel2, V0);
        } else if (i != 2) {
            return false;
        } else {
            yq0 G1 = G1(a41.U3(parcel.readStrongBinder()));
            parcel2.writeNoException();
            j31.c(parcel2, G1);
        }
        return true;
    }
}
