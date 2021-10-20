package defpackage;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.maps.model.LatLng;
import vigqyno.C0201;

/* renamed from: fq1  reason: default package */
public abstract class fq1 extends i31 implements eq1 {
    public fq1() {
        super(C0201.m82(2061));
    }

    @Override // defpackage.i31
    public final boolean i(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            return false;
        }
        j((LatLng) j31.b(parcel, LatLng.CREATOR));
        parcel2.writeNoException();
        return true;
    }
}
