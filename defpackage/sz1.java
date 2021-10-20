package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import vigqyno.C0201;

/* renamed from: sz1  reason: default package */
public abstract class sz1 extends lz1 implements tz1 {
    public sz1() {
        super(C0201.m82(13434));
    }

    @Override // defpackage.lz1
    public final boolean i(int i, Parcel parcel) throws RemoteException {
        vz1 vz1 = null;
        String r2 = C0201.m82(13435);
        if (i == 2) {
            Bundle bundle = (Bundle) mz1.a(parcel, Bundle.CREATOR);
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder != null) {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface(r2);
                vz1 = queryLocalInterface instanceof vz1 ? (vz1) queryLocalInterface : new uz1(readStrongBinder);
            }
            m0(bundle, vz1);
            return true;
        } else if (i != 3) {
            return false;
        } else {
            Bundle bundle2 = (Bundle) mz1.a(parcel, Bundle.CREATOR);
            IBinder readStrongBinder2 = parcel.readStrongBinder();
            if (readStrongBinder2 != null) {
                IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface(r2);
                vz1 = queryLocalInterface2 instanceof vz1 ? (vz1) queryLocalInterface2 : new uz1(readStrongBinder2);
            }
            T0(vz1);
            return true;
        }
    }
}
