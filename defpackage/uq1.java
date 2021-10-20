package defpackage;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.maps.model.r;
import vigqyno.C0201;

/* renamed from: uq1  reason: default package */
public abstract class uq1 extends i31 implements tq1 {
    public uq1() {
        super(C0201.m82(17916));
    }

    @Override // defpackage.i31
    public final boolean i(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            return false;
        }
        p0((r) j31.b(parcel, r.CREATOR));
        parcel2.writeNoException();
        return true;
    }
}
