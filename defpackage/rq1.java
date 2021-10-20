package defpackage;

import android.os.Parcel;
import android.os.RemoteException;
import defpackage.yq0;
import vigqyno.C0201;

/* renamed from: rq1  reason: default package */
public abstract class rq1 extends i31 implements qq1 {
    public rq1() {
        super(C0201.m82(37775));
    }

    @Override // defpackage.i31
    public final boolean i(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            return false;
        }
        H2(yq0.a.U3(parcel.readStrongBinder()));
        parcel2.writeNoException();
        return true;
    }
}
