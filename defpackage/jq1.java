package defpackage;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.maps.model.LatLng;
import vigqyno.C0201;

/* renamed from: jq1  reason: default package */
public abstract class jq1 extends i31 implements iq1 {
    public jq1() {
        super(C0201.m82(12253));
    }

    @Override // defpackage.i31
    public final boolean i(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            return false;
        }
        h((LatLng) j31.b(parcel, LatLng.CREATOR));
        parcel2.writeNoException();
        return true;
    }
}
