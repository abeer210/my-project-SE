package com.huawei.hms.maps;

import android.location.Location;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import vigqyno.C0201;

public interface mbf extends IInterface {

    public static abstract class maa extends Binder implements mbf {
        public maa() {
            attachInterface(this, C0201.m82(17646));
        }

        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            String r1 = C0201.m82(17647);
            if (i == 1) {
                parcel.enforceInterface(r1);
                onMyLocationClick(parcel.readInt() != 0 ? (Location) Location.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                return true;
            } else if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            } else {
                parcel2.writeString(r1);
                return true;
            }
        }
    }

    void onMyLocationClick(Location location);
}
