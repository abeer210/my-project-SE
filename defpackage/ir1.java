package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.maps.GoogleMapOptions;
import vigqyno.C0201;

/* renamed from: ir1  reason: default package */
public final class ir1 extends z21 implements hr1 {
    public ir1(IBinder iBinder) {
        super(iBinder, C0201.m82(21916));
    }

    @Override // defpackage.hr1
    public final sp1 J2() throws RemoteException {
        sp1 sp1;
        Parcel V3 = V3(4, U3());
        IBinder readStrongBinder = V3.readStrongBinder();
        if (readStrongBinder == null) {
            sp1 = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface(C0201.m82(21917));
            if (queryLocalInterface instanceof sp1) {
                sp1 = (sp1) queryLocalInterface;
            } else {
                sp1 = new sq1(readStrongBinder);
            }
        }
        V3.recycle();
        return sp1;
    }

    @Override // defpackage.hr1
    public final vp1 K0(yq0 yq0, GoogleMapOptions googleMapOptions) throws RemoteException {
        vp1 vp1;
        Parcel U3 = U3();
        j31.c(U3, yq0);
        j31.d(U3, googleMapOptions);
        Parcel V3 = V3(3, U3);
        IBinder readStrongBinder = V3.readStrongBinder();
        if (readStrongBinder == null) {
            vp1 = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface(C0201.m82(21918));
            if (queryLocalInterface instanceof vp1) {
                vp1 = (vp1) queryLocalInterface;
            } else {
                vp1 = new mr1(readStrongBinder);
            }
        }
        V3.recycle();
        return vp1;
    }

    @Override // defpackage.hr1
    public final k31 S0() throws RemoteException {
        Parcel V3 = V3(5, U3());
        k31 U3 = l31.U3(V3.readStrongBinder());
        V3.recycle();
        return U3;
    }

    @Override // defpackage.hr1
    public final void a3(yq0 yq0, int i) throws RemoteException {
        Parcel U3 = U3();
        j31.c(U3, yq0);
        U3.writeInt(i);
        W3(6, U3);
    }
}
