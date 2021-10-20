package defpackage;

import android.os.Parcel;
import android.os.RemoteException;
import vigqyno.C0201;

/* renamed from: yq1  reason: default package */
public abstract class yq1 extends i31 implements xq1 {
    public yq1() {
        super(C0201.m82(28928));
    }

    @Override // defpackage.i31
    public final boolean i(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            return false;
        }
        x0(a31.U3(parcel.readStrongBinder()));
        parcel2.writeNoException();
        return true;
    }
}
