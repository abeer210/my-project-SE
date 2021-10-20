package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.maps.model.z;
import vigqyno.C0201;

/* renamed from: g31  reason: default package */
public abstract class g31 extends i31 implements f31 {
    public g31() {
        super(C0201.m82(13934));
    }

    public static f31 U3(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface(C0201.m82(13935));
        if (queryLocalInterface instanceof f31) {
            return (f31) queryLocalInterface;
        }
        return new h31(iBinder);
    }

    @Override // defpackage.i31
    public final boolean i(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            return false;
        }
        z tile = getTile(parcel.readInt(), parcel.readInt(), parcel.readInt());
        parcel2.writeNoException();
        j31.f(parcel2, tile);
        return true;
    }
}
