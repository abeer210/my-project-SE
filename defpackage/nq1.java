package defpackage;

import android.os.Parcel;
import android.os.RemoteException;
import vigqyno.C0201;

/* renamed from: nq1  reason: default package */
public abstract class nq1 extends i31 implements mq1 {
    public nq1() {
        super(C0201.m82(28341));
    }

    @Override // defpackage.i31
    public final boolean i(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            return false;
        }
        boolean U1 = U1(a41.U3(parcel.readStrongBinder()));
        parcel2.writeNoException();
        j31.a(parcel2, U1);
        return true;
    }
}
