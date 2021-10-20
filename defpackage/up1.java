package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import vigqyno.C0201;

/* renamed from: up1  reason: default package */
public interface up1 extends IInterface {

    /* renamed from: up1$a */
    public static abstract class a extends i31 implements up1 {
        public a() {
            super(C0201.m82(36317));
        }

        @Override // defpackage.i31
        public final boolean i(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            cq1 cq1;
            if (i == 1) {
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder == null) {
                    cq1 = null;
                } else {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface(C0201.m82(36318));
                    if (queryLocalInterface instanceof cq1) {
                        cq1 = (cq1) queryLocalInterface;
                    } else {
                        cq1 = new dq1(readStrongBinder);
                    }
                }
                U0(cq1);
            } else if (i != 2) {
                return false;
            } else {
                deactivate();
            }
            parcel2.writeNoException();
            return true;
        }
    }

    void U0(cq1 cq1) throws RemoteException;

    void deactivate() throws RemoteException;
}
